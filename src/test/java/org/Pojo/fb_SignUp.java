package org.Pojo;


import org.Base.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_SignUp extends Base_Class {
	
	public fb_SignUp() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
	private WebElement crtBtn;
	
	@FindBy(name = "firstname")
	private WebElement firstName;
	
	@FindBy(name = "lastname")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@aria-label='Mobile number or email address']")
	private WebElement email;
	
	@FindBy(id = "password_step_input")
	private WebElement newPwd;
	
	@FindBy(xpath = "//input[@placeholder='Email address or phone number']")
	private WebElement userName;
	
	@FindBy(id = "pass")
	private WebElement pwd;
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogBtn() {
		return logBtn;
	}

	@FindBy(name = "login")
	private WebElement logBtn;

	public WebElement getCrtBtn() {
		return crtBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNewPwd() {
		return newPwd;
	}
	
	

}
