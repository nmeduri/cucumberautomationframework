
package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;
/**
 * This file contains the functions of Create Your Triangle ID Page
 * 
 */
public class Create_Your_Triangle_ID_Page extends PageObject {

	
	TestContext testContext;

	public Create_Your_Triangle_ID_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function navigate to sign up page */
	public void navigateTo_Signup_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getSignUpUrl());

	}
	
	/** This function is verify that Header create your triangle is displayed */
	public void display_Create_Your_Triangle_Header() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated(By.xpath(testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Create_Your_Triangle_ID_Header())), 50);
	}
	
	/** This function enter email detail in the email field */
	public void enter_Email(String data) throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Email_Field()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Email_Field()), data + FileReaderManager.getInstance().getDataReader().get_Email_Detail());  
	}
	
	/** This function enter password detail in the password email field */
	public void  enter_Password(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Password_Field()), data);
	}
	
	/** This function enter retype password detail in the retype password field */
	public void enter_Retype_Password(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Retype_Password_Field()), data);
	}
	
	/** This function enter incorrect retype password in the retype password field */
	public void enter_Incorrect_Retype_Password() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Retype_Password_Field()), FileReaderManager.getInstance().getDataReader().get_Incorrect_Retype_Password_Detail());
	}
	
	/** This function verify that error message 'Password do not match' is displayed */
	public void display_Error_Message_Password_Do_Not_Match() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Inline_Error_Message_Password_Do_Not_Match()));
	}
	
	/** This function click on crate button */
	public void click_Create_Button() throws Exception {
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Create_Button())));
	}
	
	/** This function is verify that error message is displayed for invalid Email */
	public void display_Error_Message_Invalid_Email() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Error_Message_Invalid_Email()));
	}
	
	/** This function is verify the message 'This field is required' is displayed  */
	public void display_This_Field_Is_Required() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_This_Field_Is_Required()));
	}
	
	/** This function click on sign in option */
	public void click_Sign_In_Option() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Sign_In_Option()));
	}
	
	/** This function is verify that message password do not match is displayed */
	public void display_Password_Do_Not_Match() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Message_Password_Do_Not_Match()));
	}
	
	/** This function click on privacy charter */
	public void click_Privacy_Charter() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Privacy_Charter())), 20);
	}
	
	/** This function click on re-send email verification */
	public void clickResendEmailVerification() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Resend_Email_Verification()));
	}
	
	/** This function click on join now button */
	public void clickJoinNowButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Join_Now()));
	}
	
	/** This function is verify to invalid login password */
	public void verifyLoginWithNewPassword() throws Exception {
		try {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Invalid_Login_Password()));
			fail();
		}catch(Exception e) {
		
		}
	}
	
	/** This function enter email detail in the email field in mobile */
	public void enter_Email_Mobile(String data) throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Email_Field()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Email_Field()), data + FileReaderManager.getInstance().getDataReader().get_Email_Detail_Mobile());  
	}

}

