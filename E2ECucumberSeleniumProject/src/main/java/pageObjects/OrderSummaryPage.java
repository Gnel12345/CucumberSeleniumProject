package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderSummaryPage {
	
	WebDriver driver;
	
	By order = By.cssSelector("#root > div > div > div > div > button");
	
	
	
	
	
	
public OrderSummaryPage(WebDriver driver) {
		
		this.driver = driver;
	}


public WebElement onOrderSummary() {
	
	return driver.findElement(order);
}
}
