package org.help;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojonew extends Baseclass{
	
		public FbPojonew() {
		PageFactory.initElements(driver, this);
		}

	    @FindBy(css = "a[data-testid='open-registration-form-button']")
	    private WebElement createaccnt;
			
	public WebElement getnewAccount() {
		return createaccnt;
	}
	@FindBy(name="firstname")
	private WebElement firstName;

	@FindBy(name="lastname")
	private WebElement lastname;

	@FindBy(name="reg_email__")
	private WebElement email;

	@FindBy(id="password_step_input")
	private WebElement paswrd;

	@FindBy(id="day")
	private WebElement day;

	@FindBy(id="month")
	private WebElement month;

	@FindBy(id="year")
	private WebElement year;

	@FindBy(xpath = "//input[@value='1']") 
	private WebElement genderFemale;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotPasswordLink;
	
	@FindBy(id="identify_email")
	private WebElement identifyemail;
	
	@FindBy(name="did_submit")
	private WebElement search;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}

	public void setClick(WebElement click) {
		this.click = click;
	}

	@FindBy(id="send_email")
	private WebElement code;
	
	public WebElement getCode() {
		return code;
	}

	public void setCode(WebElement code) {
		this.code = code;
	}

	public WebElement getSearch() {
		return search;
		
		
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public WebElement getIdentifyemail() {
		return identifyemail;
	}

	public void setIdentifyemail(WebElement identifyemail) {
		this.identifyemail = identifyemail;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public void setForgotPasswordLink(WebElement forgotPasswordLink) {
		this.forgotPasswordLink = forgotPasswordLink;
	}

	public WebElement getGenderFemale() {
		return genderFemale;
	}

	public void setGenderFemale(WebElement genderFemale) {
		this.genderFemale = genderFemale;
	}

	public WebElement getCreateaccnt() {
		return createaccnt;
	}

	public void setCreateaccnt(WebElement createaccnt) {
		this.createaccnt = createaccnt;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}


	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPaswrd() {
		return paswrd;
	}

	public void setPaswrd(WebElement paswrd) {
		this.paswrd = paswrd;
	}

	public WebElement getDay() {
		return day;
	}

	public void setDay(WebElement day) {
		this.day = day;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}


	}


