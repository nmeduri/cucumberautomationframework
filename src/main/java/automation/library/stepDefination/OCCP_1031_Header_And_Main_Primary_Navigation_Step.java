package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.Footer_Page;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.PLP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * This file contains the scenario of user stories OCCP-1030
 */
public class OCCP_1031_Header_And_Main_Primary_Navigation_Step extends BaseClass {

	Footer_Page footerPage;
	public OCCP_1031_Header_And_Main_Primary_Navigation_Step(TestContext context) throws Exception {
		testContext = context;
		footerPage = testContext.getPageObjectManager().getFooterPage();
		configFileReader = new ConfigFileReader();
	
	}
	
	@Then("access the header and verify if primary navigation is present")
	public void access_the_header_and_verify_if_primary_naviagation_is_present() throws Exception {
		testContext.getPageObjectManager().getPrimaryNavigationPage().displayPrimaryNavigation();
	}
	
	@Then("the primary navigation should be displayed after the pencil banner")
	public void the_primary_navigation_should_be_displayed_after_the_pencil_banner() throws Exception {
		testContext.getPageObjectManager().getPrimaryNavigationPage().displayPrimaryNavigationAfterPencilBanner();
	}
	
}
