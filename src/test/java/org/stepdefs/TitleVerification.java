package org.stepdefs;


import cucumber.api.java.en.Then;

import static org.stepdefs.BaseTest.test;
import static org.testng.Assert.*;

import org.utils.ConsoleColors;


public class TitleVerification {
	
	
	
	@Then ("^Verify Title")
		public void Verify_Title() throws Throwable{
		if(test.titlecheck.verifyTitle().equalsIgnoreCase("Textbooks and Classroom Resources for Nursing and Health Professions - F.A. Davis Company")) {
			System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "[INFO]----------Title has matched" +
					ConsoleColors.RESET);
			//System.out.println("[INFO]----------Title is same");
		}
		else {
			System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "[INFO]----------Title is different" +
				ConsoleColors.RESET);
			//System.out.println("[INFO]----------Title is different");
		}
		assertEquals(test.titlecheck.verifyTitle(), "Textbooks and Classroom Resources for Nursing and Health Professions - F.A. Davis Company"); 
		
	}
	
}
