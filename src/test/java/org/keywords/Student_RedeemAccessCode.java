package org.keywords;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.getpageobjects.GetPage;
import org.openqa.selenium.WebDriver;
import org.utils.RandomNumberGeneration;
import org.utils.Xls_Reader;

public class Student_RedeemAccessCode extends GetPage {
	
	static String tempEmail;
	static int randomnum;
	Xls_Reader xlsreader;

	public Student_RedeemAccessCode(WebDriver driver) {
		super(driver);
	}

	public void CreateAccount() throws Exception {
		pressTabKey("Login","Email_id");
		pressTabKey("Login","Password_id");
		pressTabKey("Login","Login_id");
		pressTabKey("Login","ForgetPassword_id");
		getObject("Student_RedeemAccessCode", "CreateAccount_id").click();
	}
	
	public static void EmailGeneration() {
		tempEmail = "SarthakChadha"+RandomNumberGeneration.generateRandomNumber()+"@qainfotech.com";
	}

	public void EnterEmail() {
		EmailGeneration();
		getObject("Student_RedeemAccessCode", "Email_id").sendKeys(tempEmail);
	}

	public void ConfirmEmail() {
		getObject("Student_RedeemAccessCode", "ConfirmEmail_id").sendKeys(tempEmail);
	}

	public void EnterPassword() {
		getObject("Student_RedeemAccessCode", "Password_id").sendKeys("abc");
	}
	
	public void EnterConfirmPassword() {
		getObject("Student_RedeemAccessCode", "ConfirmPassword_id").sendKeys("abc");
	}

	public void EnterFirstName() {
		getObject("Student_RedeemAccessCode", "FirstName_id").sendKeys("Sarthak");
	}

	public void EnterLastName() {
		getObject("Student_RedeemAccessCode", "LastName_id").sendKeys("Chadha");
	}

	public void EnterCountry() {
		select("Student_RedeemAccessCode", "SelectCountry_id", "India");
	}

	public void EnterZipCode() {
		type("Student_RedeemAccessCode", "ZipCode_id", "201301");
	}

//	public void SelectInstitute() {
//		select("Student_RedeemAccessCode", "InstituteName_id").sendKeys("Testing Institute");
//	}

	public void SelectProgram() {
		select("Student_RedeemAccessCode", "SelectProgram_id", "ADN Nursing");
	}
	
	public void SelectYear() {
		select("Student_RedeemAccessCode", "SelectGraduationYear_id", "2019");
	}

	public void UncheckEmailOption() {
		getObject("Student_RedeemAccessCode", "NoEmailCheckbox_id").click();
	}

	public void ClickCreateUserAccount() {
		getObject("Student_RedeemAccessCode", "CreateUserAccount_id").click();
	}

	public void ClickOnPurchaseAccessLink() {
		getObject("Student_RedeemAccessCode", "PurchaseLink_xpath").click();
	}

	public void EnterAccessCode() throws Exception{
//		xlsreader = new Xls_Reader("AccessCodes");
//		System.out.println(xlsreader.getCellData("Sheet1", "AccessCode", 1));
		type("Student_RedeemAccessCode","AccessCode_id",getAccessCode("AccessCodes", "Durham10"));
	}

	public void ClickOnPopUp() {
		getObject("Student_RedeemAccessCode","Popup_id").click();
	}

	public void ClickOnRedeemButton() {
		getObject("Student_RedeemAccessCode", "RedeemButton_id").click();
	}

	public boolean TextOfPopUp() {
		//System.out.println(getMessage("Student_RedeemAccessCode", "SuccessfullRedeemMessage_xpath"));
		return isElementPresent("Student_RedeemAccessCode", "SuccessfullRedeemMessage_xpath");
	}

	public void SelectInstitute() {
		type("Student_RedeemAccessCode", "InstituteName_id", "Testing Professional");
		
	}

	
	
	
	
	

}
