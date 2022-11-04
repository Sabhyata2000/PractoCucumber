package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(id = "username")
	WebElement uName;

	@FindAll({ @FindBy(id = "password"), @FindBy(name = "password") })
	WebElement pwd;

	@FindAll({ @FindBy(id = "login"), @FindBy(className = "button"), @FindBy(name = "login_button") })
	WebElement loginBtn;

	public void enterUsername(String user) {
		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		uName.sendKeys(user);
	}

	public void enterPassword(String pass) {
		pwd.sendKeys(pass);
	}

	public void clickloginbtn() {
		loginBtn.click();
	}

}
