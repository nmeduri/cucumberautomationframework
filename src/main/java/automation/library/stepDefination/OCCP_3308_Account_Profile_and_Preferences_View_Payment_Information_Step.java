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

public class OCCP_3308_Account_Profile_and_Preferences_View_Payment_Information_Step extends BaseClass{
	 
	public OCCP_3308_Account_Profile_and_Preferences_View_Payment_Information_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	@When("aem author with access navigates to my account payment screen")
	public void AEM_author_with_access_to_contact_us_Page() throws Exception {
		testContext.getPageObjectManager().getAEMAccountPaymentInfromationPage(PageObject.getDriver()).navigateTo_Account_payment_page_AEM();
	}
	@And ("configure text label for CTA to Continue Shopping")
	public void configure_text_label_for_CTA_to_Continue_Shopping() throws Exception {
		testContext.getPageObjectManager().getAEMAccountPaymentInfromationPage(PageObject.getDriver()).updatecontinueShoppingCTA();
	}
	@And ("configure navigation link  for CTA to Continue Shopping")
	public void configure_navigation_link_for_CTA_to_Continue_Shopping() throws Exception {
		testContext.getPageObjectManager().getAEMAccountPaymentInfromationPage(PageObject.getDriver()).updatecontinueShoppingCTALink();
	}
	@And ("click on my account payment component")
	public void click_on_my_account_payment_component() throws Exception {
		testContext.getPageObjectManager().getAEMAccountPaymentInfromationPage(PageObject.getDriver()).clickmyaccountpaymentComponent();
	}
	@And ("configure No payment info Title")
	public void configure_Nopaymentinfo_Title() throws Exception {
		testContext.getPageObjectManager().getAEMAccountPaymentInfromationPage(PageObject.getDriver()).updateNopaymentInfoTitle();
	}
	@And ("configure No payment info message")
	public void configure_Nopaymentinfo_msg() throws Exception {
		testContext.getPageObjectManager().getAEMAccountPaymentInfromationPage(PageObject.getDriver()).updateNopaymentInfomsg();
	}
	@And ("configure Toast Banner Success Message")
	public void configure_Toast_Banner_Success_msg() throws Exception {
		testContext.getPageObjectManager().getAEMAccountPaymentInfromationPage(PageObject.getDriver()).updateToastBannerSuccessMessage();
	}
	@And ("configure Toast Banner Error Message")
	public void configure_Toast_Banner_Error_msg() throws Exception {
		testContext.getPageObjectManager().getAEMAccountPaymentInfromationPage(PageObject.getDriver()).updateToastBannerErrorMessage();
	}
	@When ("Account payment info url is available")
	public void Account_payment_info_url_is_available() throws Exception {
		testContext.getPageObjectManager().getAccountPaymentInformationPage(PageObject.getDriver()).navigate_to_Account_paymentinfo();
	}
    @Then ("Account payment info page is displayed")
    public void Account_payment_info_page_displayed() throws Exception {
		testContext.getPageObjectManager().getAccountPaymentInformationPageLocator().getPaymentInfoTitle();
	}
	@Then ("Payment Information page with Credit Cards user have ever used for purchases is displayed")
	public void PaymentInformationpagewithCreditCards() throws Exception {
		testContext.getPageObjectManager().getAccountPaymentInformationPageLocator().getcardModal();
	}
	@Then ("click on X icon on payment method")
	public void clickonXicononpaymentmethod() throws Exception {
		testContext.getPageObjectManager().getAccountPaymentInformationPage(PageObject.getDriver()).clickCardCloseBtn();
	}
	@Then ("Verify Toast banner should be display on the top with a message of deletion")
	public void VerifyToastbannerSuccessMessage() throws Exception {
		testContext.getPageObjectManager().getAccountPaymentInformationPageLocator().getsuccessMessage();
	}
	@Then ("Card Number ending in Last 4 digits of the card is displayed")
	public void CardNumberendinginLast4digitsofthecardisdisplayed() throws Exception {
		testContext.getPageObjectManager().getAccountPaymentInformationPageLocator().getcardDetail();
	}
   @Then ("Expiry date is displayed for the card")
   public void Expirydateisdisplayedforthecard() throws Exception {
		testContext.getPageObjectManager().getAccountPaymentInformationPageLocator().getcardExpiry();
	}







}