package org.stepdefs;

import static org.stepdefs.BaseTest.test;
import static org.testng.Assert.*;

import org.utils.ConsoleColors;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Teacher_CreateClassTest {
	
	@When("^click on Davis Edge$")
	public void click_on_Davis_Edge() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Clicking On Davis Edge Product from Browser Sites" +
				ConsoleColors.RESET);
		test.homepage.clickOnDavisEdge();
	}
	
	@And("^It should open Davis Edge in new window$")
	public void it_should_open_Davis_Edge_in_new_window() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------Application opens the Davis Edge in new window" +
				ConsoleColors.RESET);
		test.createclass.switchNextTab();
		assertEquals(test.createclass.getTitle(), "DavisEdge - My Products");
	}
	
	
	@When("^Click on Rudd Title$")
	public void click_on_Rudd_Title() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Clicking On Rudd Title" +
				ConsoleColors.RESET);
	    test.createclass.clickOnRuddTitle();
	}

	@When("^Click on Add Button$")
	public void click_on_Add_Button() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Clicking On Add button to add the class" +
				ConsoleColors.RESET);
		test.createclass.clickOnAddClassButton();
	}
	
	@When("^Enter Class Title$")
	public void enter_Class_Title() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Entering Class Title" +
				ConsoleColors.RESET);
	    test.createclass.enterClassTitle();
	}

	@When("^Enter Class Description$")
	public void enter_Class_Description() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Entering Class Description" +
				ConsoleColors.RESET);
	    test.createclass.enterDescription();
	}

	@When("^Click for Auto Enroll checkbox$")
	public void click_for_Auto_Enroll_checkbox() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User has clicked on Auto-Enroll checkbox" +
				ConsoleColors.RESET);
	    test.createclass.checkAutoEnroll();
	}

	@When("^Click on Create Class button$")
	public void click_on_Create_Class_button() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------User is Clicking On Create Class Button" +
				ConsoleColors.RESET);
		test.createclass.ClassAccessCode();
	    test.createclass.createClassButton();
	}

	@Then("^It should display Class Created Alert$")
	public void it_should_display_Class_Created_Alert() throws Throwable {
		if(test.createclass.createClassMessageDisplayed().equalsIgnoreCase("Your class has been successfully created.")) {
			System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------Application displays Class Creation Message" +
					ConsoleColors.RESET);
			
		}
		else {
			System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------Class is not created" +
					ConsoleColors.RESET);
		}
		assertEquals(test.createclass.createClassMessageDisplayed(), "Your class has been successfully created.");
		
		
	}

}
