package test5tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import test5pages.CartPage;
import test5pages.CheckOutPage;
import test5pages.InventoryPage;
import test5pages.MainPage;


public class BaseTests {

	WebDriver driver;
	MainPage mainPage;
	InventoryPage inventoryPage;
	CartPage cartPage;
	CheckOutPage checkOutPage;
	
	@BeforeClass
	public void preKlase() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.mainPage = new MainPage(driver);
		this.inventoryPage = new InventoryPage(driver);
		this.cartPage = new CartPage(driver);
		this.checkOutPage = new CheckOutPage(driver);
		
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void pposleKlase() throws IOException {
		driver.close();
		System.out.println("Izvrsava se posle klase");
	
	}
}

