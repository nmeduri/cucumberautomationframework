
package automation.library.stepDefination;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-1760
 */

public class OCCP_1760_LogIn_Welcome_Back_Message_Steps extends BaseClass{

	public OCCP_1760_LogIn_Welcome_Back_Message_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("welcome back page is displayed")
	public void welcome_back_page_is_displayed() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).display_Welcome_Back_Page();
	}
	
	@And("verify email id is prepopulated")
	public void verify_email_id_is_prepopulated() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).verify_EmailId_Prepopulated();
	}
	
	@And("user click on switch account")
	public void user_click_on_switch_account() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).click_Switch_Account();
	}
	
	@Then("populated email id is not displayed")
	public void populated_email_id_is_not_displayed() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).verify_EmailID_Not_Prepopulated();
	}
	
	@Then("populated password is not displayed")
	public void populated_password_is_not_displayed() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).verify_Password_Not_Prepopulated();
	}

}
