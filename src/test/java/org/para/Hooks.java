package org.para;

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
	 f.getCreateaccnt().click();
}
@After
public void aft() {
	
closeBrowser();
}

}
