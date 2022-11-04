package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationAndNavigation {
	WebDriver driver;
	  public LocationAndNavigation(WebDriver driver) {
		  PageFactory.initElements(driver, this);
	        this.driver = driver;
	    }

	    @FindBy(xpath = "//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input")
	    WebElement location;

	    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[4]/div/div/div/div/div[3]/div/a")
		WebElement medicine;

		public void locAction(String loc) {
			location.clear();
			location.sendKeys(loc, Keys.ENTER);
		}
		
		public void navAction() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", medicine);
		}
}
