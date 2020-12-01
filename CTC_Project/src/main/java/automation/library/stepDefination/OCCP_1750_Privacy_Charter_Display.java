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
public class OCCP_1750_Privacy_Charter_Display extends BaseClass {

	public OCCP_1750_Privacy_Charter_Display(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("login to the backen system of privacy charter page with the credentials mentioned in the test data")
	public void login_to_the_backend_system_of_privacy_charter_with_the_credentials() throws Exception {
		testContext.getPageObjectManager().getAEMPrivacyCharterPage(PageObject.getDriver()).navigateTo_Privacy_Charter_Author();
	}
	
	@And("click on privacy charter panel")
	public void click_on_privacy_charter_panel() throws Exception {
		testContext.getPageObjectManager().getAEMPrivacyCharterPage(PageObject.getDriver()).clickPrivacyCharterPanel();
	}
	
	@And("configue the header of privacy charter")
	public void configure_the_header_of_privacy_charter() throws Exception {
		testContext.getPageObjectManager().getAEMPrivacyCharterPage(PageObject.getDriver()).updatePricacyCharterHeader();
	}
	
	@And("revert privacy charter details")
	public void revert_privacy_charter_details() throws Exception {
		testContext.getPageObjectManager().getAEMPrivacyCharterPage(PageObject.getDriver()).revertPricacyCharterHeader();
	}
	
	@And("navigate on privacy charter page")
	public void navigate_on_privacy_charter_page() throws Exception {
		testContext.getPageObjectManager().getPrivacyPage(PageObject.getDriver()).navigateToPrivacyCharterPage();
	}
	
	@Then("verify privacy charter header changes update on site")
	public void verify_privacy_charter_header_changes_update_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMPrivacyCharterPage(PageObject.getDriver()).verifyUpdatePrivacyCharterHeaderOnSite();
	}
	
	@And("configue the content of privacy charter")
	public void configure_the_content_of_privacy_charter_content() throws Exception {
		testContext.getPageObjectManager().getAEMPrivacyCharterPage(PageObject.getDriver()).updatePricacyCharterContent();
	}
	
	@Then("verify privacy charter content changes update on site")
	public void verify_privacy_charter_content_changes_update_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMPrivacyCharterPage(PageObject.getDriver()).verifyUpdatePrivacyCharterContentOnSite();
	}
	
	@And("revert privacy charter header")
	public void revert_privacy_charter_header() throws Exception {
		testContext.getPageObjectManager().getAEMPrivacyCharterPage(PageObject.getDriver()).revertPricacyCharterContent();
	}
	
	@And("update label of privacy charter desktop")
	public void update_label_of_privacy_charter_desktop() throws Exception {
		testContext.getPageObjectManager().getAEMPrivacyCharterPage(PageObject.getDriver()).updatePrivacyCharterLabel();
	}
	
	@And("revert label of privacy charter desktop")
	public void revert_label_of_privacy_charter_desktop() throws Exception {
		testContext.getPageObjectManager().getAEMPrivacyCharterPage(PageObject.getDriver()).updatePrivacyCharterLabel();
	}
	
	@Then("verify privacy charter label changes update on site")
	public void verify_privacy_charter_label_changes_update_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMPrivacyCharterPage(PageObject.getDriver()).verifyUpdatePrivacyCharterLabelOnSite();
	}
}
