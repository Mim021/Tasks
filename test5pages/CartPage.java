package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	WebDriver driver;
	WebElement productLabel;
	WebElement checkOutButton;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getProductLabel() {
		return driver.findElement(By.className("product_label"));
	}
	
	public WebElement getCheckOutButton() {
		return driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]"));
	}
	
}

