package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage  {
	WebDriver driver;
	
	//@FindBy(xpath="/html/body/div/div/div/div/div/div/select")
	//WebElement country;
	
	//Select drpdown=new Select(  driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/select")));
	
	By agree = By.xpath("//*[@id=\"root\"]/div/div/div/div/input");
	
	By proceed = By.xpath("//*[@id=\"root\"]/div/div/div/div/button");
	
	
	
	
	
	
	
public CheckOutPage(WebDriver driver) {
		
		this.driver = driver;
	}


/*public Select onSelectCountry() throws NullPointerException, InterruptedException {
	
		return drpdown;
	
	
	
		
	
	
	
}*/

public WebElement onAgree() {
	
	return driver.findElement(agree);
}

public WebElement onProceed() {
	return driver.findElement(proceed);
}




}
