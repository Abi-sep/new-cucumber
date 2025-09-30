package org.help;

import java.util.List;

import org.help.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.un.FbPojoAccount;

public class FbPojo extends Baseclass{

	public FbPojo() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement textele;

     @FindBy(id="pass")
     private WebElement passEle;

   @FindBy(name="login")
    private WebElement logbutton;
     

public WebElement getTextele() {
	return textele;
	}

public WebElement getPassEle() {
	return passEle;
}

public WebElement getLogbutton() {
	return logbutton;
}



}


