package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.CheckOutPage;
import pageObjects.GreenCartHomePage;
import pageObjects.HomePage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.OrderSummaryPage;
import pageObjects.portalHomePage;
import resources.base;

public class stepDefination extends base {

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver =initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {
		
		LandingPage l=new LandingPage(driver);
		if(l.getPopUpSize()>0)
		{
			l.getPopUp().click();
		}
		l.getLogin().click(); //driver.findElement(By.css()
	   
	}

	

	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
portalHomePage p=new portalHomePage(driver);
      Assert.assertTrue(p.getSearchBox().isDisplayed());
	}
	 @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		 LoginPage lp=new LoginPage(driver);
			lp.getEmail().sendKeys(username);
			lp.getPassword().sendKeys(password);
	        lp.getLogin().click();
	    }
	 @And("^User clicks on Projects link$")
	    public void user_clicks_on_projects_link() throws Throwable {
	        HomePage hp = new HomePage(driver);
	        hp.NavBar().click();
	        
	    }

	 
	 
	 @Given("^Adding Apples and Pumpkins$")
	 public void adding_Apples_and_Pumpkins() throws Throwable {
		 GreenCartHomePage gchp = new GreenCartHomePage(driver);
		 gchp.onAddApples().click();
		 gchp.onAddPumpkins().click();
	 }


	 @Given("^Adding to Cart$")
	 public void adding_to_Cart() throws Throwable {
		 GreenCartHomePage gchp = new GreenCartHomePage(driver);
		 gchp.onAddApplestoCart().click();
		 gchp.onAddPumpkinstocart().click();
	 }

	 @When("^User Clicks on Cart$")
	 public void user_Clicks_on_Cart() throws Throwable {
		 GreenCartHomePage gchp = new GreenCartHomePage(driver);
		 gchp.onCart().click();
	 }

	 @When("^Clicks Proceed to Checkout$")
	 public void clicks_Proceed_to_Checkout() throws Throwable {
		 GreenCartHomePage gchp = new GreenCartHomePage(driver);
		 gchp.onProceedToCheckout().click();
	 }

	 @When("^Places Order$")
	 public void places_Order() throws Throwable {
	     OrderSummaryPage osp = new OrderSummaryPage(driver);
	     osp.onOrderSummary().click();
	 }

	 @When("^User Selects Country$")
	 public void user_Selects_Country() throws Throwable {
		 //CheckOutPage co =  new CheckOutPage(driver);
		// co.onSelectCountry().selectByIndex(2);
	  Select drpdown=new Select(  driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/select")));
	  drpdown.selectByIndex(3);
	    
	    
	    
	 }

	 @When("^Agrees to Terms And Conditions$")
	 public void agrees_to_Terms_And_Conditions() throws Throwable {
		 CheckOutPage co = new CheckOutPage(driver);
		 co.onAgree().click();
	 }

	 @When("^Clicks Proceed$")
	 public void clicks_Proceed() throws Throwable {
		 CheckOutPage co = new CheckOutPage(driver);
		 co.onProceed();
	 }

	
	
	 @Then("^close browsers$")
	    public void close_browsers() throws Throwable {
	        driver.quit();
	    }

}
