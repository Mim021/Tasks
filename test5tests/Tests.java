package test5tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTests {

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/index.html");
		Thread.sleep(2000);
	}
	
	@Test (priority = 0)
	public void logIn() throws InterruptedException {
		
		mainPage.getUserNameInputField().clear();
		mainPage.insertUsername("standard_user");
		Thread.sleep(2000);
		mainPage.getPasswordInputField().clear();
		mainPage.insertPassword("secret_sauce");
		Thread.sleep(2000);
		mainPage.logInButtonClick();
		Thread.sleep(2000);
		
		String textForAssert = cartPage.getProductLabel().getText();
		Assert.assertEquals(textForAssert, "Products");
		}
	
	
	@Test (priority = 5)
	public void CreateOrder() throws InterruptedException {
		logIn();
		inventoryPage.getBikerLightAddToCardButton().click();
		Thread.sleep(2000);
		inventoryPage.getCardButton().click();
		Thread.sleep(2000);
		cartPage.getCheckOutButton().click();
		Thread.sleep(2000);
		checkOutPage.getfirstNameInputField().clear();
		checkOutPage.insertFirstName("M");
		Thread.sleep(2000);
		checkOutPage.getlastNameInputField().clear();
		checkOutPage.insertLastName("S");
		Thread.sleep(2000);
		checkOutPage.getzipCodeInputField().clear();
		checkOutPage.insertZipCode("21000");
		Thread.sleep(2000);
		checkOutPage.ContinueButton().click();
		Thread.sleep(2000);
		checkOutPage.finishButton().click();
		
		String textForAssert = checkOutPage.orderLabel().getText();
		Assert.assertEquals(textForAssert, "THANK YOU FOR YOUR ORDER");
	}
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

}



//U paketu test5tests dodati klase BaseTests I Tests. 
//U klasi tests uraditi dva testa koristeci testNG notaciju 
//za web aplikaciju https://www.saucedemo.com/index.html
//•	logInTest
//•	orderingTests
