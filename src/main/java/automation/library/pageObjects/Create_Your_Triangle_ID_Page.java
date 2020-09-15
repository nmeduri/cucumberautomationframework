
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

public class Create_Your_Triangle_ID_Page extends PageObject {

	
	TestContext testContext;

	public Create_Your_Triangle_ID_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	
	public void navigateTo_Signup_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getSignUpUrl());

	}
	
	public void display_Create_Your_Triangle_Header() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Create_Your_Triangle_ID_Header()));
	}
	
	public void enter_Email(String data) throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Email_Field()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Email_Field()), data + FileReaderManager.getInstance().getDataReader().get_Email_Detail());  
	}
	
	public void  enter_Password(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Password_Field()), data);
	}
	
	public void enter_Retype_Password(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Retype_Password_Field()), data);
	}
	
	public void enter_Incorrect_Retype_Password() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Retype_Password_Field()), FileReaderManager.getInstance().getDataReader().get_Incorrect_Retype_Password_Detail());
	}
	
	public void display_Error_Message_Password_Do_Not_Match() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Inline_Error_Message_Password_Do_Not_Match()));
	}
	
	public void click_Create_Button() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Create_Button())), 40);
	}
	
	public void display_Error_Message_Invalid_Email() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Error_Message_Invalid_Email()));
	}
	
	public void display_This_Field_Is_Required() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_This_Field_Is_Required()));
	}
	
	public void click_Sign_In_Option() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Sign_In_Option()));
	}
	
	public void display_Password_Do_Not_Match() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Message_Password_Do_Not_Match()));
	}
	
	public void click_Privacy_Charter() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Privacy_Charter())), 20);
	}

}

