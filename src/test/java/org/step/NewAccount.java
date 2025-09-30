package org.step;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.help.Baseclass;
import org.help.FbPojonew;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewAccount extends Baseclass{
	@Given("user have to open the facebook signup page in chrome browser")
	public void userHaveToOpenTheFacebookSignupPageInChromeBrowser() {
	    openChrome();
	    launchUrl("https://www.facebook.com/signup");
	    maxBrowser();
	}

	@When("user have to enter firstname,lastname,email,password")
	public void userHaveToEnterFirstnameLastnameEmailPassword(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String,String>> m = dataTable.asMaps(String.class, String.class);
		FbPojonew f=new FbPojonew();
		f.getFirstName().sendKeys(m.get(0).get("firstname")); 
		f.getLastname().sendKeys(m.get(0).get("lastname"));
		f.getEmail().sendKeys(m.get(0).get("email"));
		f.getPaswrd().sendKeys(m.get(0).get("password"));
		
	}
	@When("user have to select gender")
	public void userHaveToSelectGender(io.cucumber.datatable.DataTable dataTable) {
		
		FbPojonew f=new FbPojonew();
		f.getGenderFemale().click();
	
	}

	@When("user have to select date of birth")
	public void userHaveToSelectDateOfBirth(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		   List<List<String>> dob = dataTable.asLists(String.class);
		FbPojonew f=new FbPojonew();
		String Day = dob.get(0).get(0);   
		String month = dob.get(0).get(1);  
		 String year = dob.get(0).get(2);
		selectText(f.getDay(),Day);
		selectText(f.getMonth(),month);
		selectText(f.getYear(), year);
	}
	@Then("Take screenshot")
	public void takeScreenshot() throws IOException {
	  screenShot("signup page");
	}

	@Then("user have to close the browser")
	public void userHaveToCloseTheBrowser() {
    closeBrowser();
	}


}
