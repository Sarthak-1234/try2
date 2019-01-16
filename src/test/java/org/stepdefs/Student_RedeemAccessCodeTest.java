package org.stepdefs;

import static org.stepdefs.BaseTest.test;
import static org.testng.Assert.assertTrue;

import org.utils.ConsoleColors;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Student_RedeemAccessCodeTest {

	@When("^Click on CREATE ACCOUNT button$")
	public void click_on_CREATE_ACCOUNT_button() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Clicking On Create Account Button" +
				ConsoleColors.RESET);
	    test.studentredeemcode.CreateAccount();
	}

	@When("^Enter Email Address$")
	public void enter_Email_Address() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Entering Email ID to register" +
				ConsoleColors.RESET);
	    test.studentredeemcode.EnterEmail();
	}

	@When("^Enter  Email Address To Confirm$")
	public void enter_Email_Address_To_Confirm() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Entering Email Id to confirm" +
				ConsoleColors.RESET);
	    test.studentredeemcode.ConfirmEmail();
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Setting Password for the Email ID" +
				ConsoleColors.RESET);
	    test.studentredeemcode.EnterPassword();
	}
	
	@When("^Enter Confirmation Password To Confirm$")
	public void enter_Confirmation_Password_To_Confirm() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Entering Password to confirm" +
				ConsoleColors.RESET);
	    test.studentredeemcode.EnterConfirmPassword();
	}

	@When("^Enter First Name$")
	public void enter_First_Name() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Entering First Name" +
				ConsoleColors.RESET);
	    test.studentredeemcode.EnterFirstName();
	}

	@When("^Enter Last Name$")
	public void enter_Last_Name() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Entering the Last Name" +
				ConsoleColors.RESET);
		test.studentredeemcode.EnterLastName();
	}

	@When("^Select Country$")
	public void select_Country() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Selecting the Country" +
				ConsoleColors.RESET);
		test.studentredeemcode.EnterCountry();
	}
	
	@When("^Select Institute Name$")
	public void select_Institute_Name() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "INFO]----------User is Entering the Institute Name" +
				ConsoleColors.RESET);
		test.studentredeemcode.SelectInstitute();
	}


	@When("^Select Your Program$")
	public void select_Your_Program() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Selecting the Program" +
				ConsoleColors.RESET);
		test.studentredeemcode.SelectProgram();
	}

	@When("^Select Your Graduation Year$")
	public void select_Your_Graduation_Year() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Selecting the Graduation Year" +
				ConsoleColors.RESET);
		test.studentredeemcode.SelectYear();
	}
	
	@When("^Click checkbox to deactivate the emails$")
	public void click_checkbox_to_deactivate_the_emails() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Clicking Checkbox to deactivate the email" +
				ConsoleColors.RESET);
		test.studentredeemcode.UncheckEmailOption();
	}

	@When("^Click on Create Account$")
	public void click_on_Create_Account() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Clicking On Create Account Button" +
				ConsoleColors.RESET);
		test.studentredeemcode.ClickCreateUserAccount();
	}

	@When("^Click Ok on Pop-Up$")
	public void click_Ok_on_Pop_Up() throws Throwable {
		Thread.sleep(2000);
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Clicking On Pop-Up to navigate to FADAVIS WebSite" +
				ConsoleColors.RESET);
		test.studentredeemcode.ClickOnPopUp();
	}

	@When("^Click on Purchase and Redeem Access Code link$")
	public void click_on_Purchase_and_Redeem_Access_Code_link() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Clicking On Purchase and Redeem Access Code Link" +
				ConsoleColors.RESET);
		test.studentredeemcode.ClickOnPurchaseAccessLink();
	}
	
	@When("^Enter Access Code$")
	public void enter_Access_Code() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Entering the Access Code" +
				ConsoleColors.RESET);
		test.studentredeemcode.EnterAccessCode();
	}

	@When("^Click on Reedeem Code button$")
	public void click_on_Reedeem_Code_button() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Clicking On Redeem Access Code Button" +
				ConsoleColors.RESET);
		test.studentredeemcode.ClickOnRedeemButton();
	}

	@Then("^It should display Success Pop-Up$")
	public void it_should_display_Success_Pop_Up() throws Throwable {
		if (test.studentredeemcode.TextOfPopUp()) {
			System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------Displaying Confirmation Pop-Up" +
					ConsoleColors.RESET);
		}
		else {
			System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "[INFO]----------Access Code is not redeemed" +
					ConsoleColors.RESET);
		}
		assertTrue(test.studentredeemcode.TextOfPopUp());
	   ;
	}

	
	
	
	
}
