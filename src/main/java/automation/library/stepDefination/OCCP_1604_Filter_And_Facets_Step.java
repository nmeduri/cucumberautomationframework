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
public class OCCP_1604_Filter_And_Facets_Step extends BaseClass {

	public OCCP_1604_Filter_And_Facets_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("click on premium filter tab")
	public void click_on_premium_filter_tab() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickPremiumFilterTab();
	}
	
	@And("hide the toogle altogether on plp component")
	public void hide_the_toogle_altogether_on_plp_component() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickOffShowInStock();
		//testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickOffShowSaleItem();
	}
	
	@And("show the toogle altogether on plp component")
	public void show_the_toogle_altogether_on_plp_component() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickONShowInStock();
		//testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickONShowSaleItem();
	}
	
	@Then("the toogle is not displayed for that particular page")
	public void the_toogle_is_not_displayed_for_that_particular_page() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).hideToogleButton();
	}
	
 
}
