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
public class OCCP_2286_Link_Rewards_Master_Card extends BaseClass {

	public OCCP_2286_Link_Rewards_Master_Card(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("login to the backend system of link reward master card with the credentials mentioned in the test data")
	public void login_to_the_backend_system_of_link_reward_master_card_with_the_credentials() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).navigateTo_Link_Card_Page();
	}
	
	@And("configue title on the link master card screen")
	public void configure_title_on_the_link_master_card_screen() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).updateLinkMasterCardTitle();
	}
	
	@When("navigate to link master card publish url")
	public void navigate_to_link_master_card_publish_url() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).navigateTo_Link_Card_Publish_Page();
	}
	
	@Then("the configured title is displayed on the screen")
	public void the_configured_title_is_displayed_on_the_screen() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).verifyTitleUpdateOnScreen();
	}
	
	@And("revert link master card changes")
	public void rever_link_master_card_changes() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).revertLinkMasterCardChanges();
	}
	
	@And("configure the label for the input fields")
	public void configure_the_label_for_the_input_fields() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).updateLastNameLabelMasterCard();
	}
	
	@Then("the configured label last name is displayed on the screen")
	public void the_configured_label_last_name_is_displayed_on_the_screen() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).verifyLastNameLabelUpdateOnScreen();
	}
	
	@And("revert last name label master card changes")
	public void rever_last_name_label_master_card_changes() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).revertLastNameLabelMasterCard();
	}
	
	@And("click on success screen tab")
	public void click_on_success_screen_tab() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).clickSuccessScreenTab();
	}
 
	@And("configure the label for continue button on master card")
	public void configure_the_label_for_continue_button_on_master_card() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).updateContinueButtonLabelMasterCard();
	}
	
	@And("revert continue button label master card changes")
	public void rever_Continue_Button_label_master_card_changes() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).revertContinueButtonLabelMasterCard();;
	}
	
	@Then("the configured label continue is displayed on the screen")
	public void the_configured_label_continue_is_displayed_on_the_screen() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).verifyContinueButtonLabelUpdateOnScreen();
	}
	
	@And("configure the lable for cancel button on master card")
	public void configure_the_label_for_cancel_button_on_master_card() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).updateCancelButtonLabelMasterCard();
	}
	
	@Then("the configured label cancel is displayed on the screen")
	public void the_configured_label_cancel_is_displayed_on_the_screen() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).verifyCancelButtonLabelUpdateOnScreen();
	}
	
	@And("revert cancel button label master card changes")
	public void rever_cancel_Button_label_master_card_changes() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).revertCancelButtonLabelMasterCard();
	}
}
