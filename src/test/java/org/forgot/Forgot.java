package org.forgot;

import java.util.List;

import org.help.Baseclass;
import org.help.FbPojo;
import org.help.FbPojonew;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Forgot extends Baseclass {
	//@Given("user have to  open facebook application through chrome browser")
	//public void userHaveToOpenFacebookApplicationThroughChromeBrowser() {
		//openChrome();
		//launchUrl("https://www.facebook.com/");
		//maxBrowser();
	//}

	@When("user enters registered email address")
	public void userEntersRegisteredEmailAddress(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		 FbPojonew f=new FbPojonew();
        List<String> list = dataTable.asList();
        waitTime();
       f.getIdentifyemail().sendKeys(list.get(0));
	}

	@When("user clicks search button")
	public void userClicksSearchButton() {
		 FbPojonew f=new FbPojonew();
		 f.getSearch().click();
	    }

	//@Then("code sent to registered email address and close browser")
	//public void codeSentToRegisteredEmailAddressAndCloseBrowser() throws InterruptedException {
		//FbPojonew f=new FbPojonew();
		//waitTime();
		//f.getCode().click();
	   //waitTime();
	   //f.getClick().click();
	   //closeBrowser();
	//}


}
