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
 * This file contains the scenario of user stories OCCP-2297
 */

public class OCCP_2297_Account_Triangle_Registration_CASL_Subscription_Steps extends BaseClass{

	public OCCP_2297_Account_Triangle_Registration_CASL_Subscription_Steps(TestContext context) throws Exception {
		testContext = context;
		
		configFileReader = new ConfigFileReader();
	}
	
	@Then("verify the CASL-subscription is toggled off by default")
	public void verify_the_CASL_subscription_is_toggled_off_by_default() throws Exception {
		testContext.getPageObjectManager().getPersonalizedOffersPage(PageObject.getDriver()).display_CASL_Subscription_Toogle_Off_Bydefault();
	}
	
	@And("user click on toggle CASL subscription button")
	public void user_click_on_toggle_CASL_subscription_button() throws Exception {
		testContext.getPageObjectManager().getPersonalizedOffersPage(PageObject.getDriver()).click_CASL_Subscription_Toogle_Off_Button();
	}
	
	@Then("user is able to click toggle CASL subscription button")
	public void user_is_able_to_click_toggle_CASL_subscription_button() throws Exception {
		testContext.getPageObjectManager().getPersonalizedOffersPage(PageObject.getDriver()).verify_Able_Click_On_CASL_Subscription_Toogle_Off_Button();
	}
	
	@Then("verify the CASL subscription is toggled off")
	public void verify_the_CASL_subscription_is_toggled_off() throws Exception {
		testContext.getPageObjectManager().getPersonalizedOffersPage(PageObject.getDriver()).verify_Off_Subscription_Toogle_Button();
	}

}
