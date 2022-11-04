package com.stepDefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddProduct;
import pages.LocationAndNavigation;
import pages.LoginPage;
import pages.MedicineSearch;
import pages.ViewCart;
import pages.LoginPage;
public class Test_Steps {

     WebDriver driver;
     JavascriptExecutor jse;
     
//         WebElement location;
//        WebElement medicine;
//        WebElement skinclick;
//        WebElement acneclick;
//        WebElement ViewCartPage;
//        WebElement AddProductPage;
    @Given("User is on Practo homepage")
    public void user_is_on_practo_homepage() {
    	  System.setProperty("webdriver.chrome.driver","C:\\sabhyata\\drivers\\chromedriver_1\\chromedriver.exe");
         driver=new ChromeDriver();
        driver.get("https://www.practo.com/");
        driver.manage().window().maximize();
        jse = (JavascriptExecutor) driver;
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[4]/span/a")).click();
    }

    @When("User enters mobile number")
    public void user_enters_mobile_number() {
//        WebElement uname=driver.findElement(By.id("username"));
//        uname.clear();
//        uname.sendKeys("7014346331");
    	LoginPage loginPg = new LoginPage(driver);
    	loginPg=new LoginPage(driver);
		loginPg.enterUsername("7014346331");
	
    }

    @When("User enters password")
    public void user_enters_password() {
//        driver.findElement(By.name("password")).clear();
//        driver.findElement(By.name("password")).sendKeys("pragati@12345");
    	LoginPage loginPg = new LoginPage(driver);
    	loginPg.enterPassword("pragati@12345");
    }

    @When("User clicks on Login")
    public void user_clicks_on_login() {
//        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
    	LoginPage loginPg = new LoginPage(driver);
    	loginPg.clickloginbtn();
    }

    @When("User enters a location")
    public void user_enters_a_location() {
    
//          driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input")).sendKeys("Chennai",
//          Keys.ENTER);
    	LocationAndNavigation ln = new LocationAndNavigation(driver);
    	ln.locAction("chennai");  
    }

    @When("User clicks on Medicine section")
    public void user_clicks_on_medicine_section() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[3]/a/div[1]")).click();  
    	LocationAndNavigation ln = new LocationAndNavigation(driver);
		ln.navAction();
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div[2]/div[1]/div/div[1]/div/div/a/div/img")));
    }
    @Then("User is on Medicine page")
	public void user_is_on_medicine_page() {
		String actual = driver.getTitle();
		String expected = "Buy Medicines,Health Products Online | India's Most Reliable Online Medical Store | Practo";
		assertEquals(actual, expected);
	}

    @When("User clicks on Skin care section")
    public void user_clicks_on_skin_care_section() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div[2]/div[1]/div/div[1]/div/div/a/div")).click();
    	MedicineSearch med = new MedicineSearch(driver);
    	med.skinClickAction();
    }

    @When("User clicks on Acne care category")
    public void user_clicks_on_acne_care_category() {
     driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click();",
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/a/div/div[2]")));
    	MedicineSearch med = new MedicineSearch(driver); 
    	med.acneClickAction();
    }
    @Then("User is on Acne care page")
	public void user_is_on_acne_care_page() {
		String actual = driver.getTitle();
		String expected = "Acne care Products: Buy Online at Best Prices/Offers in India | Practo";
		assertEquals(actual, expected);
	}

    @When("User clicks on Add button under a product")
    public void user_clicks_on_add_button_under_a_product() {
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click();",
//         driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/button")));
    	AddProduct addProd = new AddProduct(driver);  
    	addProd.addProductAction();
    }

    @When("User clicks on plus button to add one more of the same item")
    public void user_clicks_on_plus_button_to_add_one_more_of_the_same_item() {
//         driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[3]/div")).click();
    	AddProduct addProd = new AddProduct(driver);
    	addProd.addMoreAction();
    }
    @Then("User has successfully added products to the cart")
	public void user_has_successfully_added_products_to_the_cart() {
		String actual = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/div[2]/a/button/i/span")).getText();
		String expected = "1";
		assertEquals(actual, expected);
	}

    @When("User clicks on View Cart button")
    public void user_clicks_on_view_cart_button() { 
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click();",
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/div[2]/a/button/span")));
    	ViewCart viewCart = new ViewCart(driver);
    	viewCart.viewCartAction();
    }

//    @When("User enters a delivery location")
//    public void user_enters_a_delivery_location() {
//    //    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[8]/div/div[3]/div[1]/span")).click();
//    	ViewCart viewCart = new ViewCart(driver);
//		viewCart.deliveryLocAction("Chennai");
//    }
    
    @Then("User can successfully checkout the items in the cart")
	public void user_can_successfully_checkout_the_items_in_the_cart() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div/div[7]/a/button")));
		String actual = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[7]/a/button")).getText();
		String expected = "Checkout";
		assertEquals(actual, expected);
	}
    
    
}

