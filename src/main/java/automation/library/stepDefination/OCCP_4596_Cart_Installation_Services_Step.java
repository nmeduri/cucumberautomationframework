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
public class OCCP_4596_Cart_Installation_Services_Step extends BaseClass {

	public OCCP_4596_Cart_Installation_Services_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	
	@And("click on service tab")
	public void click_on_service_tab() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).clickOnSerivceTab();
	}
	
	@And("configue the label for service add on")
	public void configure_the_label_for_service_add_on() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).updateConfigureLabelForServiceAddOn();
	}
	
	@And("revert the changes for service add on")
	public void revert_the_changes_for_service_add_on() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).revertConfigureLabelForServiceAddOn();
	}
	
	@Then("configured service add label changes are displayed on publish page")
	public void configured_service_add_label_changes_are_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).displayUpdateServiceLabelOnPublishPage();
	}
	
	@And("configure the text label for x installation services available")
	public void configure_the_text_label_for_installation_services_available() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).updateConfigureLabelForInstallationServiceAvailable();
	}
	
	@And("revert the text label for x installation services available")
	public void revert_the_text_label_for_installation_services_available() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).updateConfigureLabelForInstallationServiceAvailable();
	}
	
	@Then("configured installation service label is displayed on publish page")
	public void configured_installation_service_label_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).displayUpdatedInstallationServiceAvailableLabelOnPublishPage();
	}
}
