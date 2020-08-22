package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	
	By NavBar = By.xpath("/html/body/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[5]/a");
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		
	}

	
	public WebElement NavBar() {
		return driver.findElement(NavBar);
		
	}
}
