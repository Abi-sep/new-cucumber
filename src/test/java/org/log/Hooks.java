package org.log;

import org.help.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass{
@Before
public void bef() {
  openChrome();
  launchUrl("https://www.facebook.com/");
  maxBrowser();
}
	@After
	public void aft() {
	closeBrowser();

	}

}
