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

public class OCCP_1026_View_Contact_Us_Page_Step extends BaseClass {
	
	public OCCP_1026_View_Contact_Us_Page_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	
	}
	
	@Then("user is able to enter valid details for first name and last name")
	public void user_is_able_to_enter_valid_details_for_first_name_and_last_name() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyUserAbleToEnterFirstNameAndLastName();
	}
	
	@Then("user must be able to view the contact us form on the contact us page")
	public void user_must_be_able_to_view_the_contact_us_form_on_the_contact_us_page() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyUserAbleToSeeContactFormOnContactUsPage();
	}
	
	@And("user clicks on please select drop down field")
	public void user_clicks_on_please_select_drop_down_field() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickOnPleaseSelectDropDownField();
	}
	
	@Then("user is able to view a drop down and select the appropriate subject")
	public void user_able_to_view_drop_down_and_select_the_appropriate_subject() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyUserAbleToSeeDropDownPleaseSelectSubject();
	}
	
	@And("user clicks on email field")
	public void user_clicks_on_email_field() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickOnEmailField();
	}
	
	@Then("user is able to enter valid email address")
	public void user_able_to_enter_valid_email_address() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyUserAbleToEnterValidEmailAddress();
	}
	
	@And("user clicks on additonal information field")
	public void user_clicks_on_additional_information_field() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickOnAdditionalInformationField();
	}
	
	@Then("user is able to enter the requested information of characters")
	public void user_is_able_to_enter_the_requested_information_of_characters() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyUserAbleToEnterTheRequestedAdditionalInformationOfCharacters();
	}
	
	@Then("user is able to view number of character entered by the user as well as total number")
	public void user_is_able_to_view_number_of_character_entered_by_the_user_well_as_total_number() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyUserAbleToViewNumberOfCharacterEnteredByTheUserAsWellAsTotalNumber();
	}
	
	@Then("user will not able to type more than maximum number of characters shown on the form")
	public void user_will_not_able_to_type_more_than_maximum_number_of_character() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyUserWillNotAbleToMaximumNumberOfCharacterAsShownOnTheForm();
	}
	
	@And("user clicks on order number field")
	public void user_clicks_on_order_number_field() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickOnOrderNumberField();
	}
	
	@Then("user able to enter order number information")
	public void user_able_to_enter_order_number_information() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyUserAbleToEnterOrderNumberDetails();
	}
	
}