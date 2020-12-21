package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories - 1650
 */

public class OCCP_3753_Checkout_Contact_Info_Step extends BaseClass {
      
	public OCCP_3753_Checkout_Contact_Info_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("login to the backend system of checkout contact info")
	public void login_to_the_backend_system_of_checkout_contact_info() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).navigateTo_Checkout_Contact_Info_AuthorPage();
	}
	
	@When("user navigate to checkout contact info page")
	public void navigate_to_checkout_contact_info_page() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).navigateTo_Checkout_Contact_Info_Page();
	}
	
	@And("click on checkout contact info panel")
	public void click_on_checkout_contact_info_panel() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).clickCheckoutContactInfoPanel();
	}
	
	@And("click on contact information tab")
	public void click_on_contact_information_tab() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).clickOnContactInformationTab();
	}
	
	@And("configure the contact information title")
	public void configure_the_contact_information_title() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).updateContactInformationTitle();
	}
	
	@And("revert the contact information title")
	public void revert_the_contact_information_title() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).revertContactInformationTitle();
	}
	
	@Then("configured contact info title is displayed on publish page")
	public void configured_contact_info_title_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayConfiguredContactInformationTitleOnPublishPage();
	}
	
	@And("configure the field title label")
	public void configure_the_field_title_label() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).updateEmailFieldTitle();
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).updatePhoneNumberlFieldTitle();
	}
	
	@And("revert the field title label")
	public void revert_the_field_title_label() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).revertEmailFieldTitle();
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).revertPhoneNumberFieldTitle();
	}
	
	@Then("configured field title are displayed on publish page")
	public void configured_field_title_are_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayConfiguredFieldTitleOnPublishPage();
	}
	
	@And("configure the next cta button label")
	public void configure_the_next_cta_button_label() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).updateNextButtonLabel();
	}
	
	@And("revert the next cta button label")
	public void revert_the_next_cta_button_label() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).updateNextButtonLabel();
	}
	
	@Then("configured next cta button label is displayed on publish page")
	public void configured_next_cta_button_label_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayConfiguredNextButtonOnPublishPage();
	}
	
	@And("configure tool tip message")
	public void configure_tool_tip_message() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).updateToolTipMessage();
	}
	
	@And("revert tool tip message")
	public void revert_tool_tip_message() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).revertToolTipMessage();
	}
	
	@Then("configured tool tip message is displayed on publish page")
	public void configured_tool_tip_message_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayConfiguredToolTipMessageOnPublishPage();
	}
	
	@Then("in contact information are title - contact information should be displayed")
	public void contact_information_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayContactInformationTitle();
	}
	
	@And("email address field should be displayed")
	public void disply_email_address() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayEmailAddress();
	}
	
	@And("phone number field should be displayed")
	public void disply_phone_number() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayPhoneNumber();
	}
	
	@And("tooltip icon next to the phone number should be displayed")
	public void disply_tooltip_icon() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayTooltipIcon();
	}
	
	@And("cta button 'next' should be displayed")
	public void display_next_cta_button() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayNextCTAButton();
	}
	
	@When("^the checkout contact info page is displayed$")
	public void display_checkout_page() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayCheckoutPageTitle();
	}
	
	@Then("user should fill the contact information details - email address and phone number")
	public void fill_contact_information_details() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).fillContactInfoDetails();
	}
	
	@And("user clicks on the CTA button 'Next' after filling the details")
	public void click_on_next_cta() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).clickOnNextCTAButton();
	}
	
	@Then("the contact information should move to drawer")
	public void contact_information_should_moveto_drawer() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).waitInMobile();
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayContactInfoDrawer();
	}
	
	@And("the user should move to the next section of the checkout page")
	public void user_should_move_to_next_section() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayShippingInformationTitle();
	}
	
	@And("^user clicks on the tooltip icon$")
	public void click_tooltip_icon() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).clickOnTooltipIcon();
	}
	
	@Then("^the tooltip message should be displayed$")
	public void display_tooltip_message() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayTooltipMessage();
	}
	
	@And("user accepts window alert")
	public void accept_alert() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).acceptWindowAlert();
	}
	
	@And("^user clicks on close icon x$")
	public void click_close_icon() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).clickOnCloseIcon();
	}
	
	@Then("^the tooltip message should be closed$")
	public void tooltip_should_be_closed() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).notdisplayTooltip();
	}
	
	@And("^user clicks outside the tooltip container$")
	public void click_outside_tooltip_container() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).clickOnContactInfoTitle();
	}
	
	@And("^for checkout page enter email detail$")
	public void enter_email_detail() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(FileReaderManager.getInstance().getDataReader().get_Checkout_EmailId());
	}

	@And("^email address should be auto populated$")
	public void email_address_populated() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).verifyEmailAddressPopulated();
	}
	
	@And("^phone number should be auto populated$")
	public void phno_populated() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).verifyPhNoPopulated();
	}
	
	@And("^edit button should be displayed to make changes to the saved details$")
	public void display_edit_button() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayEditLink();
	}
	
	 @And("^for checkout page user enter password$")
	 public void user_enter_password() throws Exception {
		 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Password(FileReaderManager.getInstance().getDataReader().get_Checkout_Password());
	}
	 
	 @And("^user should click on edit button$")
	 public void click_on_edit() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).clickOnEditButton();
	}
	 
	 @Then("^card would open to reveal the initial expanded state with all fields prefilled$")
	 public void card_expanded_state() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayCardExpandedState();
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).verifyEmailAddressPrefilled();
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).verifyPhNoPrefilled();
	}
	 
	 @And("^user should be able to make changes to existing details$")
	 public void make_changes_existing_details() throws Exception {
		 testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).fillContactInfoDetails();
	}
	 
	 @And("^user would be able to save changes by clicking on the cta button next$")
	 public void save_changes_by_clicking_next() throws Exception {
		 testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).clickOnNextCTAButton();
		 testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayContactInfoDrawer();
	}
	 
	 @And("^for checkout page enter email detail for which phone number is not saved$")
	 public void enter_another_email_data() throws Exception {
		 testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(FileReaderManager.getInstance().getDataReader().get_Checkout_Email_Address_Without_PhNo());
	}
	 
	 @And("^user should not be able to proceed to the next step without entering the phone number$")
	 public void display_error_message() throws Exception {
		 testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayToastErrorMessage();
	}
	 
	 @And("^email address should be prefilled$")
	 public void email_address_should_be_prefilled() throws Exception {
		 testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayHiOption();
		 testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).verifyThatOnlyEmailAddressPrefilled();
	}
	 
	 @And("^in mobile email address should be prefilled$")
	 public void in_mobile_email_address_should_be_prefilled() throws Exception {
		 testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).waitInMobile();
		 testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).verifyThatOnlyEmailAddressPrefilled();
	}
	 
	 @And("^for checkout page enter email detail for which user enters phone number$")
	 public void email_for_which_phone_number_is_entered() throws Exception {
		 testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(FileReaderManager.getInstance().getDataReader().get_Email_Id());
	}
	 
	 @And("^user enters the phone number$")
	 public void enter_PhNo() throws Exception {
		 testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayHiOption();
		 testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).enterDataPhNoForEmailId();
	}
	 
	 @And("^in mobile user enters the phone number$")
	 public void in_mobile_enter_PhNo() throws Exception {
		 testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).waitInMobile();
		 testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).enterDataPhNoForEmailId();
	}
	 
	 @And("^phone number should be saved only for current transaction$")
	 public void PhNo_should_be_saved() throws Exception {
		 testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).verifyPhNoPopulated();
	}
	  
}