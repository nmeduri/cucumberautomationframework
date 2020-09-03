package automation.library.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;

public class Login_Page extends PageObject {

	TestContext testContext;

	public Login_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	public void navigateTo_Login_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Login_Url());

	}
	
	public void display_Welcome_To_Your_Triangle_Header() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Welcome_To_Your_Triangle_Header()));
	}
	
	public void enterData_Email_Login_Page(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Email_Login_Page()), data + FileReaderManager.getInstance().getDataReader().get_Email_Detail());
	}
	
	public void enter_Invalid_Data_Email_Login_Page(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Email_Login_Page()), data);
	}
	
	public void click_Sign_In_Button() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Sign_In_Button()));
	}
	
	public void display_Welcome_Back_Page() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Welecom_Back_Header()));
	}
	
	public void verify_EmailId_Prepopulated() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Stored_Email()));
		String actualValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Stored_Email()), "value");
		Assert.assertEquals(actualValue, FileReaderManager.getInstance().getDataReader().get_Valid_Email_Data() + FileReaderManager.getInstance().getDataReader().get_Email_Detail());
	}
	
	public void click_Switch_Account() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Switch_Account_Button()));
	}
	
	public void verify_EmailID_Not_Prepopulated() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Email_Login_Page()));
		String actualValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Email_Login_Page()), "value");
		Assert.assertNotEquals(actualValue, FileReaderManager.getInstance().getDataReader().get_Valid_Email_Data() + FileReaderManager.getInstance().getDataReader().get_Email_Detail());
	}
	
	public void verify_Password_Not_Prepopulated() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Password_Field()));
		String actualValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Password_Field()), "value");
		Assert.assertNotEquals(actualValue, FileReaderManager.getInstance().getDataReader().get_Password_Detail());
	}
	
	public void click_Forgot_Password() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Forgot_Password()));
	}
	
	public void display_Inline_Error_Message_Invalid_Credentials() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Inline_Error_Message_Invalid_Credentials()));
	}
	
	public void display_Message_Forgot_Password_Required() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Message_Field_Required()));
	}
	
	

}
