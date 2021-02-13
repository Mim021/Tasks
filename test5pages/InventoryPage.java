package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
	
	WebDriver driver;
	WebElement BikerLightAddToCardButton;
	WebElement cartButton;
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getBikerLightAddToCardButton() {
		return driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")); 
	}
	public WebElement getCardButton() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/span")); 
	}
	
}


