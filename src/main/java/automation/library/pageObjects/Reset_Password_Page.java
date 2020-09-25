package automation.library.pageObjects;

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
 * This file contains the functions of Reset Password Page
 * 
 */

public class Reset_Password_Page extends PageObject {

	
	TestContext testContext;

	public Reset_Password_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** enter new password */
	public void enterNewPassword(String data) throws Exception {
		Log.message("New Password:- " + data, true);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getResetPasswordLocatorPage().get_New_Password())), 40);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getResetPasswordLocatorPage().get_New_Password()), data);
	}
	

	/** enter retype new password */
	public void enterRetypeNewPassword(String data) throws Exception {
		Log.message("New Password:- " + data, true);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getResetPasswordLocatorPage().get_Retype_New_Password()), data);
	}
	
	public void closeChildWindow() throws Exception {
		String String = (java.lang.String) configuration.getProperty("childWindow");
    	PageObject.getDriver().switchTo().window(String).close();
	}
	
	
	/** This function click on reset password button */
	public void clickResetPasswordButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getResetPasswordLocatorPage().get_Reset_Password_Button()));	
	}
	
	/** This function click on sign in button */
	public void clickSignInButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getResetPasswordLocatorPage().get_Sign_In_Button()));
	}
	
	/** This function is verify that reset password screen is displayed */
	public void displayResetPasswordScreen() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getResetPasswordLocatorPage().get_Reset_Password_Confirmation_Title()));
		
	}
	

}
