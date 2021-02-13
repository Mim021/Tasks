package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebDriver driver;
	WebElement logInButton;
	WebElement userNameInputField;
	WebElement passwordInputField;

	
	public WebElement getLogInButton() {
		return driver.findElement(By.id("login-button"));
	}

	public WebElement getUserNameInputField() {
		return driver.findElement(By.id("user-name"));
	}

	public WebElement getPasswordInputField() {
		return driver.findElement(By.id("password"));
	}
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void insertUsername(String userName) {
		this.getUserNameInputField().clear();
		this.getUserNameInputField().sendKeys("standard_user");
	}
	
	public void insertPassword(String password) {
		this.getPasswordInputField().sendKeys("secret_sauce");
	}
	
	public void logInButtonClick() {
		this.getLogInButton().click();
	}
	
	public void logIn(String userName, String password) {
		this.getUserNameInputField().sendKeys("standard_user");
		this.getPasswordInputField().sendKeys("secret_sauce");
		this.logInButton.click();
	}

}

