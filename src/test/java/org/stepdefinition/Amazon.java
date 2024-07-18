package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.Pojoclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon extends BaseClass {
	@Given("to launch the chrome browser and hit the amazon url")
	public void to_launch_the_chrome_browser_and_hit_the_amazon_url() {
	launchurl("https://www.amazon.in");
	}

	@When("to click the signin button")
	public void to_click_the_signin_button() {
Pojoclass p = new Pojoclass();
WebElement amazonclksignin = p.getAmazonclksignin();
btnclick(amazonclksignin);
	}

	@When("to enter the valid email or phoneno to the email field")
	public void to_enter_the_valid_email_or_phoneno_to_the_email_field() {
		Pojoclass p = new Pojoclass();
WebElement amazonemail = p.getAmazonemail();
fillTextBox(amazonemail, "naliniselvaraj1895@gmail.com");
	}

	@When("to click the continue button")
	public void to_click_the_continue_button() {
		Pojoclass p = new Pojoclass();
WebElement amazoncnt = p.getAmazoncnt();
btnclick(amazoncnt);
	}

	@When("to enter the valid password to the password field")
	public void to_enter_the_valid_password_to_the_password_field() {
		Pojoclass p = new Pojoclass();
WebElement amazonpass = p.getAmazonpass();
fillTextBox(amazonpass, "nalini@95");
	}
	
	@When("to click the button signin")
	public void to_click_the_button_signin() {
		Pojoclass p = new Pojoclass();
WebElement amazonsignin = p.getAmazonsignin();
btnclick(amazonsignin);
	}

	@Then("to Quit the browser")
	public void to_Quit_the_browser() {
//	closeBrowser();
	}



}
