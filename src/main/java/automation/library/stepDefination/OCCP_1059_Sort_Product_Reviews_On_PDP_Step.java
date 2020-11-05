package automation.library.stepDefination;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import test.assertion.AssertionTest;

/**
 * This file contains the scenario of user stories OCCP-1059
 */

public class OCCP_1059_Sort_Product_Reviews_On_PDP_Step extends BaseClass{
	
	public OCCP_1059_Sort_Product_Reviews_On_PDP_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("pdp sort product reviews url is available")
	public void pdp_sort_product_reviews_url_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_to_PDP_Sort_Product_Reviews_Page();
	}
	
	@Then("in reviews section option to sort reviews should be available")
	public void option_to_sort_reviews_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySortBySection();
	}
	
	@Then("the default sorting option with label sort by-most recent should be displayed")
	public void sortby_most_recent_label_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySortByMostRecentLabel();
	}
	
	@Then("most recent should be the default sorting option")
	public void most_recent_default_option() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayMostRecentDefault();
	}
	
	@Then("the chevron should be displayed next to the sort option")
	public void chevron_displayed_next_to_sortby() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayChevronInReviews();
	}
	
	@Then("click on sorting option in reviews section")
	public void click_on_sorting_option() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickOnSortingOption();
	}
	
	@Then("a dropdown list containing all sorting options should be displayed")
	public void sorting_options_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySortingOptions();
	}
	
	@Then("click on most helpful option from the dropdown")
	public void click_on_most_helpful_option() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickOnMostHelpfulOption();
	}
	
	@Then("selected option most helpful should be displayed next to sortby label")
	public void most_helpful_label_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayMostHelpfulLabel();
	}
}
