package org.keywords;

import static org.stepdefs.BaseTest.test;

import java.io.IOException;

import javax.mail.MessagingException;

import org.getpageobjects.GetPage;
import org.openqa.selenium.WebDriver;

public class HomePage extends GetPage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	public void clickBrowserSite() {
		click("HomePage", "BrowserSite_id");
		
	}
	
	public void clickOnDavisEdge() {
		click("Teacher_CreateCLass","DavisEdge_css");
	}
	
	public void clickOnKIA() {
		click("HomePage","KIA_css");
	}
	
	public void enterCorrectEmailID(String email) {
		//driver.findElement(By.id("UserName")).sendKeys("vandanasharma@qainfotech.com");
		type("Login","Email_id",email);
		System.out.println(email);
	}
	
	public void enterCorrectPassword(String password) {
		//driver.findElement(By.id("Password")).sendKeys("password");
		type("Login","Password_id",password);
	}
	
	
	
	
	

}
