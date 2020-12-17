package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
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

}