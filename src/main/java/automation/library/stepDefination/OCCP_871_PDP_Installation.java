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
public class OCCP_871_PDP_Installation extends BaseClass {

	public OCCP_871_PDP_Installation(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("click on buy box section")
	public void click_on_buy_box_section() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).clickBuyBoxSection();
	}
	
	@And("update the configure installations information")
	public void update_the_configure_installations_information() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).configureInstallationsInformation();
	}
	
	@Then("the updated configure installations information are displayed on site")
	public void the_updated_configure_installations_information_are_displayed_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).updatedInformationDisplayedOnSite();
	}
	
	@And("reverse installation information changes")
	public void reverse_place_holder_changes() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revertInstallationChangesChanges();
	}
	
 
}
