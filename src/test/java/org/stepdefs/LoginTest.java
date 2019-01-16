package org.stepdefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.stepdefs.BaseTest.test;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import javax.mail.MessagingException;

import org.testng.Assert;
import org.utils.ConsoleColors;

public class LoginTest {

	@When("^Click on Login/Join button$")
	public void click_on_Login_Join_button() throws Throwable {
		System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + 
				"[INFO]----------User is Clicking On Log in Link" +
				ConsoleColors.RESET);
		test.logincheck.clickOnLoginButton();
	}
	
	@When("^Enter CorrectEmail \"(.*)\"$")
	public void enter_CorrectEmail_vandanasharma_qainfotech_com(String emailid) throws Throwable {
		System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + 
				"[INFO]----------User is Entering Correct Email ID" +
				ConsoleColors.RESET);
		test.logincheck.enterCorrectEmailID(emailid);
	}

	@When("^Enter CorrectPassword \"(.*)\"$")
	public void enter_CorrectPassword_password(String password) throws Throwable {
		System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + 
				"[INFO]----------User is Entering Correct Password" +
				ConsoleColors.RESET);
		test.logincheck.enterCorrectPassword(password);
	}

	@When("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + 
				"[INFO]----------User is Clicking On Login Button" +
				ConsoleColors.RESET);
		test.logincheck.clickLogin();
	}

	@Then("^Login is Successfull\\.$")
	public void login_is_Successfull() throws Throwable {
		System.out.println(ConsoleColors.GREEN_BACKGROUND_BRIGHT + 
				"[INFO]----------User has successfully Logged In the FADAVIS.COM" +
				ConsoleColors.RESET);
		assertTrue(test.logincheck.loginverificationName());
	}

	@When("^Enter Incorrect Email ID$")
	public void enter_Incorrect_Email_ID() throws Throwable {
		System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + 
				"[INFO]----------User is Entering Incorrect Email ID" +
				ConsoleColors.RESET);
		test.logincheck.enterInCorrectEmailID();
	}

	@Then("^Application displays error message\\.$")
	public void application_displays_error_message() throws Throwable {
		System.out.println(ConsoleColors.GREEN_BACKGROUND_BRIGHT + 
				"[INFO]----------Application is displaying error message due to incorrect email id" +
				ConsoleColors.RESET);
		Assert.assertEquals(test.logincheck.incorrectEmailMessage(), "Email not recognized. Please check the spelling and try again. If your email address is correct, you do not have an existing account yet. Please create a new account below.");
	}

	@When("^Enter Incorrect Password$")
	public void enter_Incorrect_Password() throws Throwable {
		System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + 
				"[INFO]----------User is Entering Incorrect Password" +
				ConsoleColors.RESET);
		test.logincheck.enterInCorrectPassword();
	}

	@Then("^Alert message should be present about incorrect password$")
	public void alert_should_be_present_about_incorrect_password() throws Throwable {
		System.out.println(ConsoleColors.GREEN_BACKGROUND_BRIGHT + 
				"[INFO]----------Alert Message is shown due to incorrect password" +
				ConsoleColors.RESET);
		Assert.assertTrue(test.logincheck.isAlertMessagePresent());
	   
	}

}
