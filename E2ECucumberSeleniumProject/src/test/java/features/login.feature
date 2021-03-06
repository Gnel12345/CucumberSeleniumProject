Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://www.rahulshettyacademy.com" Site
And Click on Login link in home page to land on Secure sign in Page
When User enters <username> and <password> and logs in
Then Verify that user is succesfully logged in 
Then close browsers

Examples:
|username			    |password	    |
|test123@gmail.com    	|123  		|


Scenario Outline: Positive Navigation to Project
Given Initialize the browser with chrome
And Navigate to "https://www.rahulshettyacademy.com" Site
And Click on Login link in home page to land on Secure sign in Page
When User enters <username> and <password> and logs in
And User clicks on Projects link


Examples:
|username			    |password	    |
|test@gmail.com   	|1234		|

Scenario: Positive test validating grocery CheckOut
Given Initialize the browser with chrome
And Navigate to "https://rahulshettyacademy.com/seleniumPractise/#/" Site
Given Adding Apples and Pumpkins
Given Adding to Cart
When User Clicks on Cart
When Clicks Proceed to Checkout
When Places Order
When User Selects Country 
When Agrees to Terms And Conditions
When Clicks Proceed
Then close browsers






