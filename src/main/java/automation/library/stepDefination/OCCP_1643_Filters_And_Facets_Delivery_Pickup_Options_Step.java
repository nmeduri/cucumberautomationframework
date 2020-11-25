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

public class OCCP_1643_Filters_And_Facets_Delivery_Pickup_Options_Step extends BaseClass {

	
	public OCCP_1643_Filters_And_Facets_Delivery_Pickup_Options_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("delivery and pick up facet option is displayed in facet panel model")
	public void delivery_and_pickup_facet_option_is_displayed_in_facet_panel_model() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayDeliveryAndPickUpOption();
	}
	
	@And("click on delivery and pickup facet option")
	public void click_on_delivery_and_pickup_facet_option() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickDeliveryAndPickUpOption();
	}
	
	@Then("facet value pay and pickup is displayed")
	public void facet_value_pay_and_pickup_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayPayAndPickupOption();
	}
	
	@Then("facet value home delivey is displayed")
	public void facet_value_home_delivery_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayHomeDeliveryOption();
	}
	
	@Then("delivery and pickup facet is prioritized as one of top five")
	public void delivery_and_pickup_facet_is_prioritized_as_one_of_top_five() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).devliveryPickupFacetOptionInTopFive();
	}
}

