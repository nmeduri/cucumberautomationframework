package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
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
 * This file contains the scenario of user stories OCCP-862
 */

public class OCCP_3878_View_Contact_Us_Page_Error_Scenarios_For_Form_Step extends BaseClass {
	
	public OCCP_3878_View_Contact_Us_Page_Error_Scenarios_For_Form_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	
	}
	
	@Given("^contact us url is available$")
	public void contact_us_url_is_availabe() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).navigateTo_Contact_Us_Page();
	}
	
	@And("enter invalid first name last name email address order number")
	public void enter_invalid_first_name_last_name_email_address_order_number() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).enterInvalidDetailsFirstNameLastNameEmailOrderNumber();
	}
	
	@And("click on send message button")
	public void click_on_send_message_button() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickSendMessageButton();
	}
	
	@Then("error message against the particular field is displayed")
	public void error_message_against_the_particular_field_is_displayed() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).displayErrorMessageForInvalidFirstNameLastNameEmailOrderNumber();
	}
	
	@Given("^contact us fr url is available$")
	public void contact_us_fr_url_is_availabe() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).navigateTo_Contact_Us_Fr_Page();
	}
	
	@Then("error message below the empty mandatory field is displayed")
	public void error_message_below_the_empty_mandatory_field_is_displayed() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).displayErrorMessageWhenMandatoryFieldsAreBlank();
	}
	
	@When("enter more than the number of characters for first name last name email order number")
	public void enter_more_than_the_number_of_characters_for_first_name_last_name_email_order_number() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).enterFirstNameLastNameEmailOrderNumberWithMaxNumberOfCharacters();
	}
	
	@Then("field is not taking characters exceeding limit")
	public void field_is_not_taking_characters_exceeding_limit() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyFieldNotTakingExceedingLimit();
	}
	
	@And("click on form validation tab")
	public void click_on_form_validation_tab() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickFormValidationMessageTab();
	}
	
}
