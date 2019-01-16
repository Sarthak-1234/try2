package org.keywords;

import org.getpageobjects.GetPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utils.ReadingPropertyFile;

public class Login extends GetPage{
	
	public Login(WebDriver driver) {
		super(driver);
		//System.out.println(this.getClass().getSimpleName()+".properties............done");
		
	}
	
	public void clickOnLoginButton() {
		//driver.findElement(By.xpath("(//a[text()='login/join'])[1]")).click();
		click("Login","Loginjoinbutton_xpath");
	}
	

	public void enterCorrectEmailID(String email) {
		//driver.findElement(By.id("UserName")).sendKeys("vandanasharma@qainfotech.com");
		type("Login","Email_id",email);
		//System.out.println(email);
	}
	
	public void enterCorrectPassword(String password) {
		//driver.findElement(By.id("Password")).sendKeys("password");
		type("Login","Password_id",password);
	}
	
	public void enterInCorrectPassword() {
		//driver.findElement(By.id("Password")).sendKeys("password2");
		type("Login","Password_id","password2");
	}
	
	public void clickLogin() {
		//driver.findElement(By.id("btnLogin")).click();
		click("Login","Login_id");
	}
	
	public void enterInCorrectEmailID() {
		//driver.findElement(By.id("UserName")).sendKeys("vandanasharmaa@qainfotech.com");
		type("Login","Email_id","vandanasharma2@qainfotech.com");
		type("Login","Password_id","");
		//pressTabKey("Email_id");
		//pressTabUsingAction("Email_id");
		//isElementPresent("Emailmessage_css");
		
	}
	
	public String incorrectEmailMessage() {
		//return driver.findElement(By.cssSelector("div#emailCheck>div")).getText();
		return getMessage("Login","Emailmessage_css");
	}
	

	public boolean loginverificationName() {
		//return driver.findElement(By.cssSelector("a.pull-right.postLogin>b")).getText();
		return isElementPresent("Login","LoginCheck_css");
		//return getMessage ("Login","LoginCheck_css");
	}
	
	public boolean isAlertMessagePresent() {
		return isElementPresent("Login","AlertMessage_xpath");
	}

}
