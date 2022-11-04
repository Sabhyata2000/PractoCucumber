package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCart {
	public ViewCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/div[2]/a/button/span")
	WebElement viewCart;
	@FindBy(xpath = "//*[@id=\"delivery-location-autocomplete\"]")
	WebElement deliveryLoc;

	public void viewCartAction() {
		viewCart.click();
	}

	public void deliveryLocAction(String loc) {
		deliveryLoc.sendKeys(loc);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		deliveryLoc.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}
}
