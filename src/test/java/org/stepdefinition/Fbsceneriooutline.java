package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.Pojoclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fbsceneriooutline extends BaseClass {

	@Given("to hit the chrome browser")
	public void to_hit_the_chrome_browser() {
		launchurl("https://www.facebook.com/");
	}
	
	@When("to enter the invalid username in {string}email field")
	public void toEnterTheInvalidUsernameInEmailField(String email) {
	

		Pojoclass p = new Pojoclass();
		WebElement fbemail = p.getTxtemail();
		fillTextBox(fbemail, email);
	}

	@When("to enter the invalid password in {string}password field")
	public void toEnterTheInvalidPasswordInPasswordField(String pass ) {
		
		Pojoclass p = new Pojoclass();
		WebElement fbpass = p.getTxtpass();
		fillTextBox(fbpass, pass);
	}

	@When("to click the button login")
	public void toClickTheButtonLogin() {
		Pojoclass p = new Pojoclass();
WebElement btnlogin = p.getBtnlogin();
btnclick(btnlogin);
	}

	@Then("to close the chrome browser")
	public void toCloseTheChromeBrowser() {

	}


}
