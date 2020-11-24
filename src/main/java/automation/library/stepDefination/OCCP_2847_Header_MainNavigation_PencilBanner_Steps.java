
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
import automation.library.dataProviders.ConfigFileReader;
import automation.library.pageObjects.PDP_Page;

public class OCCP_2847_Header_MainNavigation_PencilBanner_Steps extends BaseClass{


	public OCCP_2847_Header_MainNavigation_PencilBanner_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	@Then ("navigate to home services page")
	public void click_HomeServices() throws Exception {

		//testContext.getPageObjectManager().getAccount_Options_Page().click_HomeService_option();
	}
	@Then ("navigate to returns page")
	public void click_Reurns() throws Exception {

		//testContext.getPageObjectManager().getAccount_Options_Page().click_Returns_option();
	}

	@Then ("validate Pencil Banner")
	public void display_PencilBanner() throws Exception {
		Thread.sleep(2000);
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PencilBanner();

	}
	@Then ("Click on account link")
	public void Click_AccountLink() throws Exception {

		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
	}
	@And ("navigate to preferences page")
	public void Click_WishListOption() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_WishListOption();
	}
	@And("navigate to Wishlist Page")
	public void Click_Preferences() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_PreferencesOption();
	}

	@And ("navigate to Personal info Page")
	public void Click_PersonalInfoOption() throws Exception {	
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_PersonalInfoOption();
	}
	@And ("navigate to Order history Page")
	public void Click_Orderhistory() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_OrderHistory();
	}
	@And ("navigate to Payment info Page")
	public void Click_PaymentInfo() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_PaymentInfo();
	}
	@And ("navigate to Address Page")
	public void Click_Address() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_Address();
	}
	@And ("navigate to Reward Page")
	public void Click_RewardOption() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_Reward();
	}
	@And ("navigate to Preference Page")
	public void Click_Preference() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_Preference();
	}
	@Then ("Scroll Up the PDP page")
	public void ScrollUp() throws Exception {

		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).scrollUpByCoordinates();
	}
	@Then ("Scroll down the PDP page")
	public void ScrollDown() throws Exception {

		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).scrollDown();
	}


	@Then ("courtesy link with a CTA and indicated caveat")
	public void Validate_CreditOffered_Text() throws Exception {

		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_CreditOffered();
	}
	@Then ("Validate account Link")
	public void Validate_AccountLink() throws Exception {

		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_AccountLink();
	}
	@Then ("Validate the Account Options")
	public void Validate_AccountOption() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_SignIn();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Registration();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_OrderHistory();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Address();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PaymentInfo();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Preference();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PreferencesOption();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Reward();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_SignIn();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Registration();
	}
	@Then ("Validate Customer Service link")
	public void Validate_CustomerService_link() throws Exception {

		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_CustomerService();
	}
	@Then ("customer service")
	public void Click_CustomerService_link() throws Exception {

		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).click_CustomerService();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_CustomerServicePage();

	}


	@Then ("Site Language Selector")
	public void Language_link() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Language();
		//testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_Language();
	}
	@Then ("user click on Hi link on PDP page")
	public void click_HiLink() throws Exception {

		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_HiLink();
	}
	@Then ("Validate the Account option Available")
	public void Validate_AccountOptions() throws Exception {
		Thread.sleep(7000);
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PreferencesOption();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PaymentInfo();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_WishListOption();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Address();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_OrderHistory();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Reward();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PersonalInfoOption();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_SignOut();
	}
	@Then ("brand value props")
	public void Validate_BrandValueProps() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PencilBanner();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_MadeForLife();
	}
	@Then ("Account options dropdown content")
	public void Validate_Account_Option_Dropdown() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_SignIn();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Registration();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_OrderHistory();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Address();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PaymentInfo();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Preference();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PreferencesOption();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Reward();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_SignIn();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Registration();

	}
	@When ("AEM author with access to configure header on the page")
	public void aem_author_with_access_to_configure_intial_header_on_the_page() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).navigateTo_HeaderComponent_Page();
	}
	@And ("click on pencil banner component")
	public void click_on_pencil_banner_component() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).clickHeaderComponent();
	}
	@Then ("configure Brand Value Props")
	public void configure_Brand_Value_Props() throws Exception {
		//testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).updateBrandImageOnHeaderComponent();
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).updateBrandImageAltText();
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).updateBrandImageAreaLabel();
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).updateBrandCaptionText();

	}
	@And ("Value of Brand Value Props is updated on the site")
	public void Brand_Value_Props_is_updated_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).displayBrandValueProp();
		}
	@Then ("Verify the brandvalue prop field is mandatory")
	public void Brand_Value_Props_is_mandatory() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).doNot_Enter_BrandValueProp_And_Click_Continue();
		}
	@Then ("configure Courtesy Text and Link")
	public void configure_Courtesy_Text_and_Link() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).Update_CourtesyLink();
		}
	@And ("Value of Courtesy Text and Link is updated on the site")
	public void courtesy_Text_and_Link_updated_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).display_configure_courtesy();
		}
	@Then ("configure Cutomer Service text and link")
	public void configure_Account_Customer_Service_and_FR() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).Update_CustomerService_Link();
	}
	@And ("Value of Cutomer Service and Languange text and link is updated on the site")
	public void CustomerService_Language_Text_and_Link_updated_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).display_customerService_language_Link();
	}
	@Then ("configure language text and link")
	public void configure_language_text_link() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).Update_Language_Link();
	}
	@And ("click on Account menu component")
	public void click_accounts_component() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).clickAccountComponent();
	}
	@Then ("configure Account options")
	public void configure_account_option() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).updateAccountOption();
	}
	@And ("account option is updated on the site")
	public void account_option_is_updated_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).displayUpdatedAccountOption();
	}
	@Then ("click on account option after author")
	public void Click_account_option() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).clickUpdatedAccountlink();
	}
	@And ("validate the account options are updated on the site")
	public void validate_the_account_options_are_updated_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).UpdatedAccountOption();
	}
	@And ("validate the account options are available for Unauthenticated User")
	public void validate_the_account_options_are_available_for_unauthenticated_User() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).UpdatedAccountOption();
	}
	 @Then ("validate the account options URL link are updated on the site")
	 public void validate_the_account_options_URL_are_updated_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).displayUpdatedAccountOptionURLOnSite();
	 }
	 
	 @And("accounts option is displayed in pencil banner")
	 public void accounts_option_is_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayAccountsOption();
	 }
	 
	 @And("verify hovering on accounts option")
	 public void hover_on_accounts_option() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).hoverOnAccountsOption();
	 }
	 
	 @Then("on hover accounts should have an underline")
	 public void accounts_should_have_underline() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).verifyHoverOnAccountsOption();
	 }
	 
	 @And("verify clicking on accounts option")
	 public void clicking_on_accounts_option() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnAccountsOption();
	 }
	 
	 @Then("on clicking the dropdown will open up and below option")
	 public void dropdown_should_open() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayAccountDropdown();
	 }
	 
	 @And("verify and click on signin link")
	 public void click_on_sign_in() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnSignIn();
	 }
	 
	 @And("verify and click on register link in triangle rewards value prop")
	 public void click_on_register() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnRegister();
	 }
	 
	 @And("verify and click on register now in triangle rewards value prop")
	 public void click_on_registerinfo() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnRegisterInfo();
	 }
	 
	 @And("verify and click on option order history in account management links")
	 public void click_on_order_history() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnOrderHistory();
	 }
	
	 @And("verify and click on option payment information in account management links")
	 public void click_on_payment_information() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnPaymentInformation();
	 }
	 
	 @And("verify and click on option addresses in account management links")
	 public void click_on_addresses() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnAddresses();
	 }
	 
	 @And("as user is unauthenticated hi should be displayed instead of account in pencil banner")
	 public void hi_option_is_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayHiOption();
	 }
	 
	 @And("verify hovering on hi option")
	 public void hover_on_hi_option() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).hoverOnHiOption();
	 }
	 
	 @Then("on hover hi should have an underline")
	 public void hi_should_have_underline() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).verifyHoverOnHiOption();
	 }
	 
	 @And("verify clicking on hi option")
	 public void clicking_on_hi_option() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnHiOption();
	 }
	 
	 @And("verify and click on sign out button")
	 public void click_on_sign_out() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnSignOut();
	 }
	 
	 @Then("user should be sign out and account should be displayed instead of hi")
	 public void user_should_be_sign_out() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).verifyUserSignOut();
	 }
	 
	 @Then("user should be able to access and configure signout option")
	 public void access_and_configure_sign_out() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).enterDataSignOut();
	 }
	 
	 @Then("verify signout changes reflected in ctc site")
	 public void sign_out_changes_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).verifySignOutChangesReflected();
	 }
}

