package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.Pojoclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adhoc extends BaseClass {
	@Given("to launch the chrome browser and hit the adhoc hotel url")
	public void to_launch_the_chrome_browser_and_hit_the_adhoc_hotel_url() {
	ChromeBrowser();
	launchurl("http://www.adactinhotelapp.com/");
	maxwindow();
	}

	@When("to enter valid username in the username field")
	public void to_enter_valid_username_in_the_username_field() {
		Pojoclass p = new Pojoclass();
		WebElement adhocid = p.getAdhocid();
		fillTextBox(adhocid, "RagumanR");
	}

	@When("to enter valid password in the password field")
	public void to_enter_valid_password_in_the_password_field() {
		Pojoclass p = new Pojoclass();
		WebElement adhocpass = p.getAdhocpass();
		fillTextBox(adhocpass, "99T4C6");
	}

	@When("to login button to be clicked")
	public void to_login_button_to_be_clicked() {
		Pojoclass p = new Pojoclass();
		WebElement adhoclogin = p.getAdhoclogin();
		btnclick(adhoclogin);
	}

	@Then("to quit the browser")
	public void to_quit_the_browser() {
//	closeBrowser();
	}
}
