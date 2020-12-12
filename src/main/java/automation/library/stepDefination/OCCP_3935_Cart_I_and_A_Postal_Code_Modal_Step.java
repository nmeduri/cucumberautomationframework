package automation.library.stepDefination;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.Footer_Page;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.PLP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-3935
 * 
 */

public class OCCP_3935_Cart_I_and_A_Postal_Code_Modal_Step extends BaseClass {
	
	public OCCP_3935_Cart_I_and_A_Postal_Code_Modal_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}

	@And ("^user clicks on change cta within the order summary shipping fee section of the order summary$")
	public void click_on_order_summary_ship_to_home_change() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).clickOnOrderSummarySTHChange();
	}
	
	@Then ("Postal Code modal should be displayed")
	public void postal_code_modal_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayPostalCodeModal();
	}
	
	@And ("close the postal code modal")
	public void close_the_postal_code_modal() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).clickOnPostalCodeCloseBtn();
	}
	
	@And ("^user clicks on change cta within the ship to home fulfillment type section header$")
	public void click_on_change_cta_within_the_ship_to_home_fulfillment() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).clickOnSTHFulfillmentChange();
	}
	
	@And ("in the modal the title 'change postal code' should be displayed")
	public void title_change_postal_code() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayModalTitle();
	}
	
	@And ("free text box to input new postal code should be displayed along with field title 'postal code'")
	public void input_text_box() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayInputTextBoxField();
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayFieldTitlePostalCode();
	}
	
	@And ("by default the free text box should display previously defined postal code")
	public void display_previous_postal_code() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).verifyDisplayPreviouslyDefinedPostalCode();
	}
	
	@And ("change cta should be displayed")
	public void change_cta_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayChangeCTA();
	}
	
	@And ("cancel cta should be displayed")
	public void cancel_cta_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayCancelCTA();
	}
	
	@And ("cross button should be displayed to close the modal")
	public void cross_button_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayCrossButton();
	}
	
	@And ("user clicks on cancel cta")
	public void user_clicks_on_cancel_cta() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).clickOnCancelCTA();
	}
	
	@And ("user clicks on 'x' cta")
	public void user_clicks_on_x_cta() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).clickOnCrossCTA();
	}

	@Then ("postal code modal should be closed")
	public void  postal_code_modal_should_be_closed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).notDisplayPostalCodeModal();
	}
	
	@And ("user inputs a valid postal code within delivery range")
	public void user_inputs_valid_postal_code() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).enterDataValidPostalCode();
	}
	
	@And ("success toast message 'postal code has been updated' should be displayed")
	public void sccess_toast_message_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displaySuccessToastMessage();
	}

	@And ("^user clicks on change cta$")
	public void user_clicks_on_change_cta() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).clickOnChangeCTA();
	}
	
	@And ("^user inputs out of range deliver postal code$")
	public void user_inputs_out_of_range_delivary_postal_code() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).enterDataOutOfRangePostalCode();
	}
	
	@And ("^user inputs an invalid postal code$")
	public void user_inputs_invalid_postal_code() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).enterDataInvalidPostalCode();
	}
	
	@Then ("^error toast message should be displayed$")
	public void  error_toast_message_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayErrorToastMessage();
	}
	
	@Then ("^out of range for delivery inline error should be displayed$")
	public void  inline_error_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayInlineError();
	}
	
	@And ("^click on the postal tab$")
	public void  click_postal_tab() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).ClickOnPostalTab();
	}
	
	@And ("^configure the success toast message$")
	public void  configure_success_toast_message() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).enterDataSuccessToastMessage();
	}
	
	@And ("^configure the error toast message$")
	public void  configure_error_toast_message() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).enterDataErrorToastMessage();
	}
	
	@Then ("^success toast message changes should be reflected in the ctc$")
	public void  success_toast_message_changes_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).verifySuccessToastMessageChangesReflected();
	}
	
	@Then ("^error toast message changes should be reflected in the ctc$")
	public void  error_toast_message_changes_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).verifyErrorToastMessageChangesReflected();
	}
	
}
