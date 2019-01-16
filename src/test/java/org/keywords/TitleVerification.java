package org.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.stepdefs.BaseTest.test;
import org.getpageobjects.GetPage;

public class TitleVerification extends GetPage{
	
	public TitleVerification(WebDriver driver) {
		super(driver);
	}
	
	public String verifyTitle() {
		return test.titlecheck.getTitle();
	}
	
	
//	public void validateLogin() {
//		boolean result=isElementPresent("");
//		String actualResult="";
//		String expectedResult = "success";
//		
//		if(result)
//			actualResult="success";
//		else
//			actualResult="failure";
//
//		if(!expectedResult.equals(actualResult)) {
//			reportFailure("Scenario Failure"); // reporting failure
//		}
//	}
	
	

}
