package automation.library.stepDefination;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.Login_Page;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * This file contains the scenario of user stories OCCP-3301
 */

public class OCCP_3301_Account_Profile_and_Preferences_Step extends BaseClass{
	 
	public OCCP_3301_Account_Profile_and_Preferences_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	@When("enter your email id -TC-3577")
	public void enter_email_detail() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(FileReaderManager.getInstance().getDataReader().get_Email_Data_3301());
	}
	
	@And("enter your password data -TC-3577")
    public void user_enter_password() throws Exception {
   	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Password(FileReaderManager.getInstance().getDataReader().get_Password_Data_3301());
    }
	
 @When ("Account-address url is available") 
 public void upload_default_error_image() throws Exception {
   	 testContext.getPageObjectManager().getHomePage(PageObject.getDriver()).navigateTo_account_address();
	 
}
@Then ("click address dropdown option")
public void click_address_dropdown_option() throws Exception {
  	 testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnAddresses();
	 
}
@When ("aem author with access navigates to my account address screen")
public void aem_author_with_access_navigates_to_my_accountaddress_screen() throws Exception {
	testContext.getPageObjectManager().getAEMAccountAddressPage(PageObject.getDriver()).navigateTo_Account_Address_AEM();
}
@And ("click on my account address component")
public void click_myaccountaddress_component() throws Exception {
	testContext.getPageObjectManager().getAEMAccountAddressPage(PageObject.getDriver()).clickaccountAddressComponent();
}
@And ("configure address label")
public void configure_address_label() throws Exception {
	testContext.getPageObjectManager().getAEMAccountAddressPage(PageObject.getDriver()).configureAddressLabelComponent();
}
@And ("configure shipping address label")
public void configure_shipping_address_label() throws Exception {
	testContext.getPageObjectManager().getAEMAccountAddressPage(PageObject.getDriver()).configureShippingAddressLabelComponent();
}
@Then ("validate the addresses title is displayed")
public void validate_addresses_title() throws Exception {
	testContext.getPageObjectManager().getAccountAddressPage(PageObject.getDriver()).display_addressesTitle();
}
@Then ("validate the shipping information title is displayed")
public void validate_shippingInfo_title() throws Exception {
	testContext.getPageObjectManager().getAccountAddressPage(PageObject.getDriver()).display_ShippingInfoTitle();
}

@Then ("validate the shipping information details are displayed")
public void validate_shippingInfo_details_displayed() throws Exception {
	testContext.getPageObjectManager().getAccountAddressPage(PageObject.getDriver()).display_ShippinginfoDetail();
}

@Then ("validate the billing information title is displayed")
public void validate_billing_information_title() throws Exception {
	testContext.getPageObjectManager().getAccountAddressPage(PageObject.getDriver()).display_billingaddressTitle();
}
@Then ("validate the billing information details are displayed")
public void validate_billingInfo_details_displayed() throws Exception {
	testContext.getPageObjectManager().getAccountAddressPage(PageObject.getDriver()).display_billingaddressdetail();
}

}