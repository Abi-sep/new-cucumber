package org.log;

import java.util.List;

import org.help.Baseclass;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Baseclass{
//	@Given("User have to Open the Facebook Application Through Chrome Browser")
//	public void userHaveToOpenTheFacebookApplicationThroughChromeBrowser() {
	//	 openChrome();
		//  launchUrl("https://www.facebook.com/");
		  //maxBrowser();   
	//}

	@When("User have to Pass the Valid username and invalid password")
	public void userHaveToPassTheValidUsernameAndInvalidPassword() {
		//List<String>l=table.asList();
		
		driver.findElement(By.id("email")).sendKeys("abinaya@gmail.com");
    	driver.findElement(By.name("pass")).sendKeys("abi@1233");
	}
	@When("user have to get the page title")
	public void userHaveToGetThePageTitle() {
	   getThePageTitle();
	}

	@When("User have to Pass the inValid username and invalid password")
	public void userHaveToPassTheInValidUsernameAndInvalidPassword() {
		driver.findElement(By.id("email")).sendKeys("cap123@gmail.com");
    	driver.findElement(By.name("pass")).sendKeys("cap123");
	}

	@When("User have to Pass the inValid username and valid password")
	public void userHaveToPassTheInValidUsernameAndValidPassword() {
		driver.findElement(By.id("email")).sendKeys("infosys@gmail.com");
    	driver.findElement(By.name("pass")).sendKeys("info123");
	}

	@When("User have to click login button")
	public void userHaveToClickLoginButton() {
    	driver.findElement(By.name("login")).click();

}

	//@Then("User have to close the browser")
	//public void userHaveToCloseTheBrowser() {
//closeBrowser();
	//}



}
