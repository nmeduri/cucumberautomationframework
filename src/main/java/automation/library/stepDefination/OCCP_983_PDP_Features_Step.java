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
 * This file contains the scenario of user stories OCCP-983
 */

public class OCCP_983_PDP_Features_Step extends BaseClass {
      
	public OCCP_983_PDP_Features_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("user must see all features of the product displayed in a bulleted list")
	public void product_features_displayed_in_bulleted_list() throws Exception {
		
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayFeaturesSection();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayFeaturesInBulletList();
	}
	
	@Then("feature section is not available in overview section")
	public void feature_section_is_not_available_in_overview_section() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).notDisplayFeatureSection();
	}
	
	@Then("resource section is displayed")
	public void resource_section_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayResouceSection();
	}
}
	