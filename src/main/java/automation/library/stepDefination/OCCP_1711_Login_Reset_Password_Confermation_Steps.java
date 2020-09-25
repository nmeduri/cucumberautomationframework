package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories - 1655
 */

public class OCCP_1711_Login_Reset_Password_Confermation_Steps extends BaseClass {
      PDP_Page pdpPage;
	public OCCP_1711_Login_Reset_Password_Confermation_Steps(TestContext context) throws Exception {
		testContext = context;
		pdpPage = testContext.getPageObjectManager().getPDPPage();
		configFileReader = new ConfigFileReader();
	}
	
	@And("user click on join now")
	public void user_click_on_join_now() throws Exception {
		testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).clickJoinNowButton();
	}
	
	@Then("sucessfully logged in with new password")
	public void successfully_logged_in_with_new_password() throws Exception {
		testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).verifyLoginWithNewPassword();
	}
}
