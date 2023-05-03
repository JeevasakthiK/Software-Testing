package org.stepdefinition;

import java.util.List;
import java.util.Map;
import org.Base.Base_Class;
import org.Pojo.fb_SignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fb_Signup extends Base_Class {
	 public static WebDriver driver;
	public static fb_SignUp f;

	
	@Given("To launch the browser and maximize window")
	public void to_launch_the_browser_and_maximize_window() {
launchBrowser();
		maxi();
	}

	@When("To launch the url of fb")
	public void to_launch_the_url_of_fb() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() throws InterruptedException {
		Thread.sleep(3000);
		f =new fb_SignUp();
		clickBtn(f.getCrtBtn());
		
	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l = d.asList();
		f =new fb_SignUp();
		value(f.getFirstName(), l.get(0));
	}

	@When("To pass surname in surname box")
	public void to_pass_surname_in_surname_box(DataTable d) {
		List<List<String>> l = d.asLists();
		f =new fb_SignUp();
		value(f.getLastName(), l.get(0).get(0));
	
	}

	@When("To pass mob or email in email box")
	public void to_pass_mob_or_email_in_email_box(DataTable d) {
		Map<String, String> m = d.asMap(String.class, String.class);
		f =new fb_SignUp();
		value(f.getEmail(), m.get("Email2"));
	
	}

	@When("To create new password in new password box")
	public void to_create_new_password_in_new_password_box(DataTable d) {
		List<Map<String, String>> m = d.asMaps(String.class, String.class);
		f =new fb_SignUp();
		value(f.getNewPwd(), m.get(1).get("Password3"));
	
	}

	@Then("To close the browser")
	public void to_close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
		Close_tab();
	
	
	}

	@Given("To launch the browser and maximaize window")
	public void to_launch_the_browser_and_maximaize_window() {
	launchBrowser();
	maxi();
	
	}

	@When("To pass the email id in username field")
	public void to_pass_the_email_id_in_username_field() throws InterruptedException {
		Thread.sleep(3000);
		f = new fb_SignUp();
		value(f.getUserName(),"jeevasakthi2404@gmail.com");
	
	}

	@When("To pass the password in the password field")
	public void to_pass_the_password_in_the_password_field() {
		f = new fb_SignUp();
		value(f.getPwd(), "123456");

	
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new fb_SignUp();
	clickBtn(f.getLogBtn());
	
	}






}
