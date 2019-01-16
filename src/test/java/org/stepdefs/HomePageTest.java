package org.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.stepdefs.BaseTest.test;
import static org.testng.Assert.*;

import org.utils.ConsoleColors;

public class HomePageTest {
	
	@When("^click on BrowserSite dropdown$")
	public void click_on_BrowserSite_dropdown() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + 
				"[INFO]----------User is Clicking On Brwoser Site" +
				ConsoleColors.RESET);
		test.homepage.clickBrowserSite();
	}

	
	@When("^click on KIA$")
	public void click_on_KIA() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + 
				"[INFO]----------User is Clicking On KIA Product" +
				ConsoleColors.RESET);
		test.homepage.clickOnKIA();
	}
	
	@Then("^it should open the new tab with title KIA$")
	public void it_should_open_the_new_tab_with_title_KIA() throws Throwable {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + 
				"[INFO]----------KIA Product is opening in new tab" +
				ConsoleColors.RESET);
		test.homepage.switchNextTab();
		assertEquals(test.homepage.getTitle(), "Kinesiology In Action");
	}

}
