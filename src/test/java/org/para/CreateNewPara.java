package org.para;

import org.help.Baseclass;
import org.help.FbPojonew;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewPara extends Baseclass{
	//@Given("user have to open the facebook signup page in chrome browser")
	//public void userHaveToOpenTheFacebookSignupPageInChromeBrowser() {
	  //  openChrome();
	    //launchUrl("https://www.facebook.com/signup");
	    //maxBrowser();
	//}
	@When("user have to pass the {string} {string} {string} {string} {string} {string} and {string}")
	public void userHaveToPassTheAnd(String firstname, String lastname, String date, String month, String year, String email, String paswrd) {
		FbPojonew f=new FbPojonew();
		f.getFirstName().sendKeys(firstname);
		f.getLastname().sendKeys(lastname);
	//	selectText(f.getDay(), date);
	//	selectText(f.getMonth(), month);
	//	selectText(f.getYear(), year);
		f.getEmail().sendKeys(email);
		f.getPaswrd().sendKeys(paswrd);
		
	}
	@When("user have to get the page title")
	public void userHaveToGetThePageTitle() {
	getThePageTitle();    
	}

	//@Then("user have to close the browser")
	//public void userHaveToCloseTheBrowser() {
	  //  closeBrowser();
	//}

}
