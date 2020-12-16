package automation.library.stepDefination;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
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
 * This file contains the scenario of user stories OCCP-3631
 */
public class OCCP_3665_Account_Profile_and_Preference_UpdatePersonalInfo_Step extends BaseClass {

	public OCCP_3665_Account_Profile_and_Preference_UpdatePersonalInfo_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}
	@When ("Account-profile url is available")
	public void Current_quantity_of_the_product_in_cart_is_displayed() throws Exception {
		testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).navigate_to_Account_profileinfo();
	}
	@Then ("navigate to Account-profile url")
	public void navigatetoAccountprofileurl() throws Exception {
		testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).Account_profileinfo_navigation();
	}
	@Then ("click on Edit button on profile info page")
	public void clickonEditbuttononprofileinfopage() throws Exception {
		testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).click_Edit_ProfileInfo();
	}
	@Then ("Edit the details on profile info page")
	public void Editthedetailsonprofileinfopage() throws Exception {
		testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).Edit_FirstName_ProfileInfo();
		testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).Edit_lastName_ProfileInfo();
		testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).Edit_phnNo_ProfileInfo();

	}
	@Then ("save the changes on profile info page")

	public void saveprofileinfo() throws Exception {
		testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).click_save_ProfileInfo();
	}
	@Then ("click on Edit button on password section of profile info page")
	public void clickonEditbuttononPassword() throws Exception {
		testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).click_Edit_password_ProfileInfo();
	}
	@Then ("Enter the details on password edit page profile info page")
	public void enterDetailsonPasswordEdit() throws Exception {
		testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).enter_currentpwd_ProfileInfo();
	testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).enter_newpwd_ProfileInfo();
		testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).reenter_newpwd_ProfileInfo();

	}
	@Then ("cancel the changes on profile info page")
	public void cancelPasswordchanges() throws Exception {
		testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).cancel_password_ProfileInfo();
	}
	@Then ("save the password changes on profile info page")
	public void submitPasswordchanges() throws Exception {
		testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).submit_password_ProfileInfo();
	}
	@Then ("Revert the changed done in password")
	public void RevertPasswordchanges() throws Exception {
		testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).revert_password_changes_ProfileInfo();
	}
	@Then ("verify the Modal popup is displayed")
	public void verifytheModalpopupdisplayed() throws Exception {
		testContext.getPageObjectManager().getAccountProfilePageLocator().getModalheader();
	}
	@Then ("Enter the details on password and click edit profile info page")
	public void Enter_details_passwordandclickeditprofileinfopage() throws Exception {
	testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).enter_currentpwd_ProfileInfo();
	testContext.getPageObjectManager().getPageObject(driver).scrollUp();
	testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).click_Edit_ProfileInfo();
	}
	@Then ("validate the inline error message when mandatory field are not given")
	public void validate_the_inline_error_message() throws Exception {
		testContext.getPageObjectManager().getAccountProfilePageLocator().getcurrentPwdError();
		testContext.getPageObjectManager().getAccountProfilePageLocator().getnewPWDError();
		testContext.getPageObjectManager().getAccountProfilePageLocator().getcurrentPwdError();
	}
	@When ("AEM author with access to configure account profile page")
	public void AEM_author_with_access_to_configure_account_profile_page() throws Exception {
		testContext.getPageObjectManager().getAEMAccountProfilePage(PageObject.getDriver()).navigateTo_Account_profile_page_AEM();
	}
	@And ("click on account profile component")
	public void click_on_account_profile_component() throws Exception {
		testContext.getPageObjectManager().getAEMAccountProfilePage(PageObject.getDriver()).clickmyaccountprofileComponent();
	}
	@Then ("configure the account profile field label and CTA text")
	public void configure_account_profile_fieldlabel_and_CTA_text() throws Exception {
		testContext.getPageObjectManager().getAEMAccountProfilePage(PageObject.getDriver()).configureFieldLabelandCTA();
	}
   @Then ("configure the account profile toast banner text")
    public void configure_account_profile_toastbanner_text() throws Exception {
	testContext.getPageObjectManager().getAEMAccountProfilePage(PageObject.getDriver()).configureToastBannerText();
}
   @Then ("configure the account profile modal pop up")
   public void configure_account_profile_modal_popup() throws Exception {
	testContext.getPageObjectManager().getAEMAccountProfilePage(PageObject.getDriver()).configureModalPopUp();
}
@Then ("click close on the modal pop up")
public void click_close_on_the_modal_popup() throws Exception {
	testContext.getPageObjectManager().getAccountProfilePage(PageObject.getDriver()).click_modalclose_ProfileInfo();
}
}