package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GreenCartHomePage {
	
	WebDriver driver;
	By apples = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[15]/div[2]/a[2]");
	By pumpkins = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[12]/div[2]/a[2]");
	By addapplestocart = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[15]/div[3]/button");
	By addpumpkinstocart = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[12]/div[3]/button");
	By cart = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img");
	By proceedToCheckout = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button");
	
	public GreenCartHomePage(WebDriver driver) {
		
		this.driver = driver;
	}

	
	public WebElement onAddApples() {
		
		return driver.findElement(apples);
		
	}
	public WebElement onAddApplestoCart() {
		
		return driver.findElement(addapplestocart);
	}
	
	
	
	public WebElement onAddPumpkins() {
		
		return driver.findElement(pumpkins);
	}
	
	public WebElement onAddPumpkinstocart() {
		
		return driver.findElement(addpumpkinstocart);
	}
	
	public WebElement onCart() {
		return driver.findElement(cart);
	}
	public WebElement onProceedToCheckout() {
		return driver.findElement(proceedToCheckout);
	}
	
	
}
