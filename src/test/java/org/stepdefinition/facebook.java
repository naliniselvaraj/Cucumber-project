package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.Pojoclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class facebook extends BaseClass {

	@Given("to launch the chrome browser")
	public void to_launch_the_chrome_browser() {
		launchurl("https://www.facebook.com/");

	}
	
	@When("to enter the valid username in email field")
	public void to_enter_the_valid_username_in_email_field(io.cucumber.datatable.DataTable e) {
		
		Map<String, String> mp = e.asMap(String.class, String.class);
		Pojoclass p = new Pojoclass();
	WebElement fbemail = p.getTxtemail();
	fillTextBox(fbemail, mp.get("email2"));

	}

	@When("to enter the invalid password in the password field")
	public void to_enter_the_invalid_password_in_the_password_field(io.cucumber.datatable.DataTable e) {
		
		
		List<Map<String, String>> mp = e.asMaps();
		Pojoclass p = new Pojoclass();
		WebElement fbpass = p.getTxtpass();
		fillTextBox(fbpass, mp.get(2).get("password2"));
	}

	@When("to click the login button")
	public void to_click_the_login_button() {
		Pojoclass p = new Pojoclass();
WebElement fblogin = p.getBtnlogin();
btnclick(fblogin);
	}

	@Then("to close the browser")
	public void to_close_the_browser() {
	
	}


}
