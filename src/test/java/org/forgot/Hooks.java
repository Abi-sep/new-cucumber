package org.forgot;

import org.help.Baseclass;
import org.help.FbPojonew;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass{
	@Before
	public void bef() {
		openChrome();
		 launchUrl("https://www.facebook.com/");
		 FbPojonew f=new FbPojonew();
		 f.getForgotPasswordLink().click();
	}
	@After
	public void aft() throws InterruptedException {
		FbPojonew f=new FbPojonew();
		waitTime();
		f.getCode().click();
	   waitTime();
	   f.getClick().click();
	   closeBrowser();
	
	}
		

}
