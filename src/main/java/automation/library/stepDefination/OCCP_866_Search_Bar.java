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
public class OCCP_866_Search_Bar extends BaseClass {

	public OCCP_866_Search_Bar(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("AEM author with access to configure the place holder label")
	public void aem_author_with_access_to_configure_the_place_holder_label() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).navigateTo_Place_Holder_Page();
	}
	
	@And("click on search bar")
	public void click_on_search_bar() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).clickSearchBar();
	}
	
	@And("configure the placeholder label from AEM")
	public void configure_the_placeholder_label_from_AEM() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).updateDesktopPlaceHolderLabel();
	}
	
	@Then("the updated placeholder label is displayed on the site")
	public void the_updated_placeholder_label_is_displayed_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).displayUpdatedPlaceHolderLabelOnSite();
	}
	
 
}
