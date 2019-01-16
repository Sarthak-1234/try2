package org.keywords;

import org.getpageobjects.GetPage;
import org.openqa.selenium.WebDriver;
import org.utils.ConfigPropertyReader;
import org.keywords.Teacher_CreateClass;

public class Teacher_CreateAssignment extends GetPage{

	public Teacher_CreateAssignment(WebDriver driver) {
		super(driver);
		//System.out.println(this.getClass().getSimpleName()+".properties............done");	
	}
	
	public void clickManageClassesLink() {
		click("Teacher_CreateAssignment","ManageClasses_id");
	}
	
	public void clickCreateAssignment() {
		
		String assignmentbutton1 = ConfigPropertyReader.getProperty("Teacher_CreateAssignment", "AssignmentButtonPart1_xpath");
		String assignmentbutton2 = ConfigPropertyReader.getProperty("Teacher_CreateAssignment", "AssignmentButtonPart2_xpath");
		String createeassignmentbutton1 = ConfigPropertyReader.getProperty("Teacher_CreateAssignment", "CreateAssignmentPart1_xpath");
		String createeassignmentbutton2 = ConfigPropertyReader.getProperty("Teacher_CreateAssignment", "CreateAssignmentPart2_xpath");
		
		String xpath_assignmentButton = assignmentbutton1+Teacher_CreateClass.className+assignmentbutton2;
		String xpath_createassignmentButton = createeassignmentbutton1+Teacher_CreateClass.className+createeassignmentbutton2;
		
		clickusinglocator(xpath_assignmentButton,"xpath");
		clickusinglocator(xpath_createassignmentButton,"xpath");	
	}
	
	
	public void clickContinueToSuccessCenterButton() throws Exception {
		Thread.sleep(3000);
		System.out.println("I am in Click Continue To Success Center Button");
		click("Teacher_CreateAssignment","ContinueToSuccussCenter_css");
	}
	
	public void enterAssignmentName (String assignmentName) throws Exception {
		removeText("Teacher_CreateAssignment","QuizName_xpath");
		type("Teacher_CreateAssignment","QuizName_xpath",assignmentName);
	}
	
	public void clickQuickAssignmentButton() {
		click("Teacher_CreateAssignment","CreateQuizAssignment_id");
	}
	
	public void selectCourseTopicFromDropdown() {
		click("Teacher_CreateAssignment","SelectChoiceDropdown_css");
		click("Teacher_CreateAssignment","Selectchoice_css");
	}
	
	public void clickOnContinueButton() {
		click("Teacher_CreateAssignment","ContinueStep2Button_id");
	}
	
	public void clickOnSaveAndExitButton() {
		click("Teacher_CreateAssignment","SaveandExitAssignmentButton_id");
	}
	
	public String assignMentName() {
		return getMessage("Teacher_CreateAssignment", "VerifyAssignmentName_css");
	}
	
}
