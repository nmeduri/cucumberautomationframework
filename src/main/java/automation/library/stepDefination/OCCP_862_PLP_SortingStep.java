package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
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
 * This file contains the scenario of user stories OCCP-862
 */

public class OCCP_862_PLP_SortingStep extends BaseClass {
	
	public OCCP_862_PLP_SortingStep(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	
	}
	
	@When("user clicks on the Sort by ")
	public void user_clicks_on_sortBy() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickSortByOption();
		}
	
	@And("user selects Price Low to High as sorting option")
	public void user_selects_price_low_to_high() throws Exception {
		
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickOnPriceLowToHigh();
	}
	
	@Then("all the product results should be rearranged from lowest to highest price")
	public void product_results_from_lowest_to_highest_price() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyPriceLowToHigh();
	}
	
}
