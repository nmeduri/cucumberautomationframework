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
public class OCCP_3321_Accounts_Profile_And_Preferences_Shopping_Preferences_Step extends BaseClass {

	public OCCP_3321_Accounts_Profile_And_Preferences_Shopping_Preferences_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("login to backend system of shopping preferences")
	public void login_to_backend_system_of_merge_rewards() throws Exception {
		testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator(PageObject.getDriver()).navigate_to_shopping_preferences_author_page();
	}
	
	@And("click on shopping preferences panel")
	public void click_on_shopping_preferences_panel() throws Exception {
		testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator(PageObject.getDriver()).clickOnShoppingPreferencesPanel();
	}
	
	@And("configure shopping preferences title")
	public void configure_shopping_preferences_title() throws Exception {
		testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator(PageObject.getDriver()).configureShoppingPreferencesTitle();
	}
	
	@And("navigate to shopping preferences page")
	public void navigate_to_shopping_preferences_page() throws Exception {
		testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator(PageObject.getDriver()).navigate_to_shopping_preferences_page();
	}
	
	@Then("configured shopping preferences title is displayed on publish page")
	public void configured_shopping_preferences_title_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator(PageObject.getDriver()).verifyConfiguredMyAccountShoppingTitlePageOnPublish();
	}
	
	@And("revert shopping preferences title")
	public void revert_shopping_preferences_title() throws Exception {
		testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator(PageObject.getDriver()).revertShoppingPreferencesTitle();
	}
	
	@And("configure no preferences message")
	public void configure_no_preferences_message() throws Exception {
		testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator(PageObject.getDriver()).configureNoShoppingPreferencesMessage();
	}
	
	@And("revert no preferences message")
	public void revert_no_preferences_message() throws Exception {
		testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator(PageObject.getDriver()).revertNoShoppingPreferencesMessage();
	}
	
	@Then("configured no shopping preferences message is displayed on publish page")
	public void configured_no_shopping_preferences_message_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator(PageObject.getDriver()).verifyConfiguredNoShoppingPreferencesMessagePageOnPublish();
	}
	
	@And("configure edit button label")
	public void configure_edit_button_label() throws Exception {
		testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator(PageObject.getDriver()).configureEditButtonLabel();
	}
	
	@And("revert edit button label")
	public void revert_edit_button_label() throws Exception {
		testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator(PageObject.getDriver()).revertEditButtonLabel();
	}
	
	@Then("configured edit button label is displayed on publish page")
	public void configured_edit_button_label_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator(PageObject.getDriver()).verifyConfiguredEditButtonLabelOnPublish();
	}
}
