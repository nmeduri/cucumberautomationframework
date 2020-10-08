package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
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
 * This file contains the scenario of user stories OCCP-1561
 */

public class OCCP_1561_PLP_Breadcrumb_Step extends BaseClass {

	
	public OCCP_1561_PLP_Breadcrumb_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("breadcrumb is displayed")
	public void display_of_breadcrumb() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayBreadcrumb();
	}

	@And("breadcrumb is based on category hierarchy in Hybris")
		public void breadcrumb_category_heirarchy() throws Exception {
			testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyBreadcrumbsHeirarchy();
			
	}
	
	@And("main root homepage is also displayed in the path")
	public void homepage_is_displayed_in_breadcrumb_path() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyHomepageDisplayInBreadcrumb();
		}
	
	@Then("mobile breadcrumb is displayed")
	public void display_of_mobile_breadcrumb() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayMobileBreadcrumb();
	}
	
	@And("mobile breadcrumb is based on category hierarchy in Hybris")
	public void mobile_breadcrumb_category_heirarchy() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyBreadcrumbsHeirarchyInMobile();
	}
	
	@And("last breadcrumb is not clickable")
	public void last_breadcrumb_is_not_clickable() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyLastBreadcrumbClickable();
		}
}

