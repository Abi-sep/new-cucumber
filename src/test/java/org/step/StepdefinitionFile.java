package org.step;

import org.help.Baseclass;
import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepdefinitionFile extends Baseclass {

	@Given("User have to Open the Facebook Application Through Chrome Browser")
	public void user_have_to_Open_the_Facebook_Application_Through_Chrome_Browser() {
     openChrome();
    launchUrl("https://www.facebook.com/");
    maxBrowser();
	}
    @When("User have to Pass the Valid username and invalid password")
    public void user_have_to_Pass_the_Valid_username_and_invalid_password() { 	
    	driver.findElement(By.id("email")).sendKeys("abinaya@gmail.com");
    	driver.findElement(By.name("pass")).sendKeys("abi@1233");
    }

    @When("User have to click login buttonThen User have to close the browser")
    public void user_have_to_click_login_buttonThen_User_have_to_close_the_browser() {
    	driver.findElement(By.name("login")).click();

    	closeBrowser() ;
}

    
    
}

