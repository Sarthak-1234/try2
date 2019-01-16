package org.stepdefs;

import static org.stepdefs.BaseTest.test;

import java.io.IOException;

import javax.mail.MessagingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CommonFunctions {
	
	
	@When("^Login in the application with \"(.*?)\" and \"(.*?)\"$")
	public void login_in_the_application_with_and(String emailid, String password) throws Throwable {
		
		test.logincheck.clickOnLoginButton();
		test.logincheck.enterCorrectEmailID(emailid);
		test.logincheck.enterCorrectPassword(password);
		test.logincheck.clickLogin();
		
	}
	
	@Given("^Launch URL for Login$")
	public void launch_URL_for_Login() throws Throwable {
		test.logincheck.launchURL();
		test.infoLogPass("URL is launched - http://www.fadavis.com");
		test.logincheck.implicitWait();
	}
	
	
}
