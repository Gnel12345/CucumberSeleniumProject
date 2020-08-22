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
|test88@gmail.com    	|12345   		|


Scenario Outline: Positive Navigation to Project
Given Initialize the browser with chrome
And Navigate to "https://www.rahulshettyacademy.com" Site
And Click on Login link in home page to land on Secure sign in Page
When User enters <username> and <password> and logs in
And User clicks on Projects link


Examples:
|username			    |password	    |
|test99@gmail.com   	|123456 		|



