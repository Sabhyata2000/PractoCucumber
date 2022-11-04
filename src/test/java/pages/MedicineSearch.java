package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicineSearch {
	 WebDriver driver;
	    public MedicineSearch(WebDriver driver) {
	    	PageFactory.initElements(driver, this);
	        this.driver=driver;
	        
	    }
	    @FindBy(xpath="//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div[2]/div[1]/div/div[1]/div/div/a/div")
	    WebElement skinclick;
	    
	    public void skinClickAction() {
	    
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", skinclick);
	        
	    }
	    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/a/div/div[1]/div")
		WebElement acneclick;
	    
	    public void acneClickAction() {
	    
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", acneclick);
	        
	    }
}
