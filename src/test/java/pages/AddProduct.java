package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProduct {
	public AddProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/button")
	WebElement addBtn;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[3]/div")
	WebElement addBtn2;

	public void addProductAction() {
		addBtn.click();
	}

	public void addMoreAction() {
		addBtn2.click();
	}
}
