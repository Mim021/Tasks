package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
	WebDriver driver;
	WebElement ContinueButton;
	WebElement firstNameInputField;
	WebElement lastNameInputField;
	WebElement zipCodeInputField;
	WebElement finishButton;
	WebElement orderLabel;

	public WebElement ContinueButton() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input"));
	}
	public WebElement finishButton() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]"));
	}

	public WebElement orderLabel() {
		return driver.findElement(By.className("complete-header"));
	}

	public WebElement getfirstNameInputField() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getlastNameInputField() {
		return driver.findElement(By.id("last-name"));
	}
	public WebElement getzipCodeInputField() {
		return driver.findElement(By.id("postal-code"));
	}
	
	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void insertFirstName(String firstName) {
		this.getfirstNameInputField().clear();
		this.getfirstNameInputField().sendKeys("M");
	}
	
	public void insertLastName(String lastName) {
		this.getlastNameInputField().clear();
		this.getlastNameInputField().sendKeys("S");
	}
	public void insertZipCode(String zipCode) {
		this.getzipCodeInputField().clear();
		this.getzipCodeInputField().sendKeys("21000");
	}
	
	public void ContinueButtonClick() {
		this.ContinueButton().click();
	}
	
	public void CheckOut(String firstName, String lastName, String zipCode) {
		this.getfirstNameInputField().sendKeys("M");
		this.getlastNameInputField().sendKeys("S");
		this.getzipCodeInputField().sendKeys("21000");
		this.ContinueButton.click();
	}

}

