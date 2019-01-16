package org.getpageobjects;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUi {
	
	public WebDriver driver;
	
	
	public BaseUi(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ExplicitWaitForAlert() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public boolean isAlertPresent() 
	{ 
	    try 
	    { 	
	    	ExplicitWaitForAlert();
	        driver.switchTo().alert();
	        return true; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
	}   
	
	
}
	
	
