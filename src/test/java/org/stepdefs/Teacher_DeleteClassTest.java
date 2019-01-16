package org.stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.stepdefs.BaseTest.test; 
import static org.testng.Assert.*;

import org.utils.ConsoleColors;

public class Teacher_DeleteClassTest {
	
	@When("^click on settings icon$")
	public void click_on_settings_icon() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Clicking On Setting Icon to delete the class" +
				ConsoleColors.RESET);
	    test.deleteclass.clickSettingsIcon();
	}

	@When("^click on Delete button$")
	public void click_on_Delete_button() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Clicking On Delete Button" +
				ConsoleColors.RESET);
	    test.deleteclass.deleteoption();
	}

	@Then("^confirm deletion pop-up opens up$")
	public void confirm_deletion_pop_up_opens_up() throws Throwable {
		if(test.deleteclass.getConfirmDeletionPopUpMessage().equalsIgnoreCase("Confirm Deletion")) {
			System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------Application displays message for Deletion of Class" +
					ConsoleColors.RESET);
		}
		else {
			System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------Class is not deleted" +
					ConsoleColors.RESET);
		}
			assertEquals(test.deleteclass.getConfirmDeletionPopUpMessage(), "Confirm Deletion");
		
	}

	@When("^click on ok button$")
	public void click_on_ok_button() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User has clicked on OK button" +
				ConsoleColors.RESET);
	    test.deleteclass.clickOkButton();
	}

	@Then("^a confirmation pop-up appears$")
	public void a_confirmation_pop_up_appears() throws Throwable {
		if(test.deleteclass.deleteAlert()) {
			System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------Application has Deleted the Class" +
					ConsoleColors.RESET);
		}
		else {
			System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------Application has NOT Deleted the Class" +
					ConsoleColors.RESET);
		}
		assertTrue(test.deleteclass.deleteAlert());
	}

}
