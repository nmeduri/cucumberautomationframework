package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.Header_Page;
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
 * This file contains the scenario of the Header
 */

public class HeaderPageSteps extends BaseClass {
      Header_Page headerPage;
	public HeaderPageSteps(TestContext context) throws Exception {
		testContext = context;
		headerPage = testContext.getPageObjectManager().getHeaderPage();
		configFileReader = new ConfigFileReader();
	}
	
	@When("click on account from the header")
	public void click_on_account_from_the_header() throws Exception {
		testContext.getPageObjectManager().getHeaderPage().clickOnAccount();
	}
	
	@And("click on the login from the header")
	public void click_on_the_login_from_the_header() throws Exception {
		testContext.getPageObjectManager().getHeaderPage().clickSignIn();
	}
	
	@And("click on registration from the header")
	public void click_on_the_registration_from_the_header() throws Exception {
		testContext.getPageObjectManager().getHeaderPage().clickSignIn();
	}
}
