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
	
	@Given("aem author is able to access configue contact us page")
	public void aem_author_is_able_to_access_configure_contact_us_page() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).navigateTo_Contact_Us_Authorable_Page();
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
	
	@And("user click on last name field")
	public void user_click_on_last_name_field() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickOnLastNameField();
	}
	
	@And("user click on first name field")
	public void user_click_on_first_name_field() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickOnFirstNameField();
	}
	
	@Then("user is able to view the label in gray shift up from original space")
	public void user_is_able_to_view_the_label_in_gray_shift_up_from_original_space() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyGrayLabelShiftToUpFromOriginalSpace();
	}
	
	@Then("user is able to view the label in gray shift back to its original space")
	public void user_is_able_to_view_the_label_in_gray_shift_back_to_its_original_space() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyGrayLabelShiftBackToOriginalSpace();
	}
	
	@And("enter first name detail")
	public void enterFirstNameDetail() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).enterFirstNameDetail();
	}
	
	@And("enter Last Name Detail")
	public void ente_last_name_detail() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).enterLastNameDetail();
	}
	
	@And("enter additional information")
	public void enter_additional_information() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).enterAdditionalInformation();
	}
	
	@Then("confirmation screen is displayed")
	public void confirmation_screen_is_displayed() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).displayConfirmationScreen();
	}
	
	@And("click on continue shopping button")
	public void click_on_continue_shopping_button() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickOnContinueShoppingButton();
	}
	
	@Then("user is redirect on canadian tire home page on same tab")
	public void user_redirect_on_canadian_tire_home_page_on_same_tab() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyNavigateOnCanadianTireSiteInSameTab();
	}
	
	@When("click on contact us panel")
	public void click_on_contact_us_panel() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickContactUsPanel();
	}
	
	@And("author configures the max character count for additional comment field")
	public void author_configures_the_max_character_count_for_additional_comment_field() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).updateAdditionalInfoMaxCount();
	}
	
	@And("revert the additonal max count changes")
	public void revert_the_additional_max_count_changes() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).revertAdditionalInfoMaxCount();
	}
	
	@Then("configured max character is visible to the user on the contact us form")
	public void configured_max_character_is_visible_to_the_user_on_the_contact_us_form() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).configuredMaxCharVisibleOnPublishPage();
	}
	
	@And("configure the new section title")
	public void configure_the_new_section_title() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).updateYourMessageSectionTitle();
	}
	
	@And("revert the new section title")
	public void revert_the_new_section_title() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).revertYourMessageSectionTitle();
	}
	
	@Then("configured section title is displayed on publish page")
	public void configured_section_title_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).configuredYourMessageSectionOnPublishPage();
	}
	
	@And("configure the note field")
	public void configure_the_note_field() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).updateAddNoteText();
	}
	
	@And("revert the note field")
	public void revert_the_note_field() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).updateAddNoteText();
	}
	
	@Then("configured add note text is displayed on publish page")
	public void configured_add_note_text_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).configuredAddNoteTextOnPublishPage();
	}
	
	@Then("author configure cta title")
	public void author_configure_cta_title() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).updateCTALabel();
	}
	
	@And("select please select drop down value")
	public void select_drop_down_Please_Select_value() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).selectPleaseSelectDropDownValue();
	}
	
	@And("revert cta label")
	public void revert_cta_label() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).revertCTALabel();
	}
	
	@Then("configured cta label is displayed on publish page")
	public void configured_cta_label_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).configuredCTALabelOnPublishPage();
	}
	
	@And("click on contact us success screen tab")
	public void click_on_success_screen_tab() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickOnSuccessScreenTab();
	}
	
	@And("configure success cta label")
	public void configure_success_cta_label() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).updateSuccessCTALabel();
	}
	
	@And("revert success cta label")
	public void revert_success_cta_label() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).revertSuccessCTALabel();
	}
	
	@Then("verify configure success cta label is mandatory")
	public void verify_configure_success_cta_label_is_mandatory() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).displaySuccessLabelMandatory();
	}
	
	@And("configure target url")
	public void configure_target_url() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).updateSuccessPathUrl();
	}
	
	@And("revet target url")
	public void revert_target_url() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).revertSuccessPathUrl();
	}
	
	@Then("verify configure target url is manadatory")
	public void verify_configure_target_url_is_mandatory() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).displaySuccessPathMandatory();
	}
	
	@Then("default config to open in same-different tab is applicable")
	public void default_config_to_open_in_same_different_tab_is_applicable() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyDefaultOpenToSameTab();
	}
	
	@Then("configued success cta label is displayed on publish page")
	public void configured_success_cta_label_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).configuredSuccessCTALabelOnPublishPage();
	}
	
	@Then("configured success path is displayed on publish page")
	public void configured_success_path_is_displayed_on_publish_page() throws Exception {
		
	}
	
	@And("click on configuration tab")
	public void clickOnConfigurationTab() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickOnConfigurationTab();
	}
	
	@And("click on add button")
	public void click_on_add_button() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickOnAddButton();
	}
	
	@And("configure add please select drop down")
	public void configure_add_please_select_drop() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).updateLabelDetail();
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).updateIdDetail();
	}
	
	@Then("verify please select drop down option is added")
	public void verify_please_select_drop_down_option_is_added() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyAddedPleaseSelectDropDownOption();
	}
	
	@And("click on remove drop down option button")
	public void click_on_remove_drop_down_option_button() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).clickRemoveDropDownOptionButton();
	}
	
	@Then("verify drop down  option is removed")
	public void verify_drop_down_option_is_removed() throws Exception {
		testContext.getPageObjectManager().getContactUspage(PageObject.getDriver()).verifyRemovedPleaseSelectDropDownOption();
	}
}
