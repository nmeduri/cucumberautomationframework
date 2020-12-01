package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
 * This file contains the scenario of user stories OCCP-1680
 */
public class OCCP_939_Load_More_Step extends BaseClass {

	public OCCP_939_Load_More_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("load more button is not displayed on the plp")
	public void load_more_button_is_not_displayed_on_plp() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).notDisplayLoadMoreButton();
	}
	
	@Then("load more button is displayed")
	public void load_more_button_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayLoadMoreButton();
	}
	
	@And("click on load more")
	public void click_on_load_more() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickLoadMoreButton();
	}
	
	@Then("end pagination message is displayed")
	public void end_pagination_message_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayEndPaginationMessage();
	}
	
	@Then("back to top button is displayed")
	public void back_to_top_button_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayBackToTopButton();
	}
	
	@Then("click on back to top button")
	public void click_on_back_to_top_button() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickBackToTopButton();
	}
	
 
}
