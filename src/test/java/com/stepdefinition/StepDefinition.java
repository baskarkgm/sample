package com.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	@Given("Launch the browser and load the Url")
	public void launch_the_browser_and_load_the_url() {
	   System.out.println("Browser");
	}
	@When("Provide valid username and password hit login {string} and {string}")
	public void provide_valid_username_and_password_hit_login_and(String user, String pass) {
		System.out.println(user);
		System.out.println(pass);
	}
	@Then("Validate if the user logged in successfully {string}")
	public void validate_if_the_user_logged_in_successfully(String homepage) {
		System.out.println(homepage);
	}
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String name) {
		System.out.println(name);

	    	}
	@When("I check for the {string} in step")
	public void i_check_for_the_in_step(String value) {
		System.out.println(value);

	   	}
	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String status) {
		System.out.println(status);

	    	}



	}
