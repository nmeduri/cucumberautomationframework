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
 * This file contains the scenario of user stories OCCP-3213
 */

public class OCCP_3213_Rewards_Linked_To_MasterCard_Error_Cases_Step extends BaseClass {
	
	public OCCP_3213_Rewards_Linked_To_MasterCard_Error_Cases_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}

	@And("click on link existing card error tab")
	public void click_on_link_existing_card_error_tab() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).clickOnLinkExistingErrorTab();
	}
	
	@And("access the try again cta property and configure the text")
	public void access_tryagain_and_configure_text() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataTryAgainText();
	}
	
	@Then("the tryagain text changes should be reflected on ctc site")
	public void tryagain_text_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyTryAgainChangesReflected();
	}
	
	@Then("the cancel text changes should be reflected on ctc site")
	public void cancel_text_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyCancelChangesReflected();
	}
	
	@And("access the cancel cta property and configure the text")
	public void access_cancel_and_configure_text() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataCancelText();
	}
	
	@And("enter a loyalty card number which redirects to error screen")
	public void user_enter_loyalty_card_number() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataIncorrectCardNumber();
	}
	
	@And("enter already linked triangle master card details")
	public void enter_already_linked_mastercard_details() throws Exception {
		testContext.getPageObjectManager().getLinkMasterCardPage(PageObject.getDriver()).enterDataForAlreadyLinkedMasterCardDetails();
	}
	
	@Then("user should be redirected to error screen informing that card is already enrolled")
	public void card_is_already_enrolled() throws Exception {
		testContext.getPageObjectManager().getLinkMasterCardPage(PageObject.getDriver()).displayAlreadyEnrolledErrorMessage();
	}
	
	@And("scroll to continue button")
	public void scroll_to_continue_button() throws Exception {
		testContext.getPageObjectManager().getLinkMasterCardPage(PageObject.getDriver()).scrollToContinueButton();
	}
	
	@And("click on mastercard continue button")
	public void click_mastercard_continue_button() throws Exception {
		testContext.getPageObjectManager().getLinkMasterCardPage(PageObject.getDriver()).clickOnMastercardContinueButton();
	}
}
