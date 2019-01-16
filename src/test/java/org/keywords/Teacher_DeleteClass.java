package org.keywords;

import org.getpageobjects.GetPage;
import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class Teacher_DeleteClass extends GetPage{
	
	public Teacher_DeleteClass(WebDriver driver) {
		super(driver);
	}
	
	public void clickSettingsIcon() {
		getObject("Teacher_DeleteClass", "SettingIcon_css").click();
	}

	public void deleteoption() {
		getObject("Teacher_DeleteClass", "DeleteClassoption_css").click();
	}
	
	public String getConfirmDeletionPopUpMessage() {
		System.out.println(getMessage("Teacher_DeleteClass", "ConfirmDeletionPopUpMessage_css").trim());
		return getMessage("Teacher_DeleteClass", "ConfirmDeletionPopUpMessage_css").trim();
	}

	public void clickOkButton() {
		getObject("Teacher_DeleteClass", "ConfirmOK_css").click();
	}

	public boolean deleteAlert() {
		return isElementPresent("Teacher_DeleteClass", "ConfirmDeleteMessage_xpath");
	}
	
	
}
