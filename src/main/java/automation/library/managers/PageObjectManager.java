
package automation.library.managers;

import org.openqa.selenium.WebDriver;

import automation.library.locator.AEM_Account_Address_Page_Locator;
import automation.library.locator.AEM_Account_Payment_Infromation_Page_Locator;
import automation.library.locator.AEM_Account_Profile_Page_Locator;
import automation.library.locator.AEM_Account_Rewards_Template_Page_Locator;
import automation.library.locator.AEM_Broad_Banner_Page_Locator;
import automation.library.locator.AEM_Broad_Promo_Tiles_Page_Locator;
import automation.library.locator.AEM_Cart_Page_Locator;
import automation.library.locator.AEM_Common_Page_Locator;
import automation.library.locator.AEM_Contact_Us_Page_Locator;
import automation.library.locator.AEM_Customer_Service_Informational_Copy_Page_Locator;
import automation.library.locator.AEM_Edge_To_Edge_Banner_Locator;
import automation.library.locator.AEM_Feature_List_Page_Locator;
import automation.library.locator.AEM_Footer_Page_Locator;
import automation.library.locator.AEM_Get_A_New_Triangle_Rewards_Card_Locator;
import automation.library.locator.AEM_Header_Page_Locator;
import automation.library.locator.AEM_Link_Card_Page_Locator;
import automation.library.locator.AEM_Link_Existing_Card_Page_Locator;
import automation.library.locator.AEM_Login_Page_Locator;
import automation.library.locator.AEM_New_Rewards_Card_Screen_Page_Locator;
import automation.library.locator.AEM_PDP_Add_To_Cart_Page_Locator;
import automation.library.locator.AEM_PDP_Page_Locator;
import automation.library.locator.AEM_PLP_Page_Locator;
import automation.library.locator.AEM_Privacy_Charter_Page_Locator;
import automation.library.locator.AEM_Registration_Page_Locator;
import automation.library.locator.AEM_Search_And_SRP_Page_Locator;
import automation.library.locator.AEM_Simple_Header_Checkout_Flow_Page_Locator;
import automation.library.locator.AEM_Slim_Banner_page_Locator;
import automation.library.locator.AEM_Two_Featured_Tiles_Component_Page_Locator;
import automation.library.locator.Account_Address_Page_Locator;
import automation.library.locator.Account_Payment_Information_Page_Locator;
import automation.library.locator.Account_Profile_Page_Locator;
import automation.library.locator.Banners_Locator;
import automation.library.locator.Broad_Banner_Page_Locator;
import automation.library.locator.Broad_Promo_Tiles_Page_Locator;
import automation.library.locator.Cart_Page_Locator;
import automation.library.locator.Checkout_Page_Locator;
import automation.library.locator.Contactus_Locator;
import automation.library.locator.Create_Your_Triangle_ID_Page_Locator;
import automation.library.locator.Customer_Service_Page_Locator;
import automation.library.locator.Email_Sent_Confirmation_Page_Locator;
import automation.library.locator.Feature_List_Page_Locator;
import automation.library.locator.Footer_PageLocator;
import automation.library.locator.ForgotPasswordPageLocator;
import automation.library.locator.Get_A_New_Triangle_Rewards_Card_Locator;
import automation.library.locator.Get_Personalized_Offers_Page_Locator;
import automation.library.locator.Gigya_Api_Tool_Page_Locator;
import automation.library.locator.Header_Page_Locator;
import automation.library.locator.HomePageLocator;
import automation.library.locator.Link_MasterCard_Page_Locator;
import automation.library.locator.Link_Rewards_Options_Page_Locator;
import automation.library.locator.Link_Your_Existing_Triangle_Rewards_Card_PageLocator;
import automation.library.locator.Link_Your_Triangle_Rewards_Account_Locator;
import automation.library.locator.Link_reward_ProfileScreen_page_Locator;
import automation.library.locator.Login_Page_Locator;
import automation.library.locator.Mailinator_Page_Locator;
import automation.library.locator.PDP_AddToCart_Page_Locator;
import automation.library.locator.PDP_PageLocator;
import automation.library.locator.PLP_PageLocator;
import automation.library.locator.Primary_Navigation_Page_Locator;
import automation.library.locator.Privacy_Charter_Page_Locator;
import automation.library.locator.Registration_Email_Verification_Locator;
import automation.library.locator.Reset_Your_Password_Page_Locator;
import automation.library.locator.Rewards_Terms_Conditions_Page_Locator;
import automation.library.locator.Standard_Masthead_Banner_Page_Locator;
import automation.library.locator.Two_Featured_Tile_Component_Page_Locator;
import automation.library.locator.Your_Email_Has_Been_Verified_PageLocator;
import automation.library.pageObjects.AEM_Account_Address_Page;
import automation.library.pageObjects.AEM_Account_Payment_Infromation_Page;
import automation.library.pageObjects.AEM_Account_Profile_Page;
import automation.library.pageObjects.AEM_Account_Rewards_Template_Page;
import automation.library.pageObjects.AEM_Broad_Banner_Page;
import automation.library.pageObjects.AEM_Broad_Promo_Tiles_Page;
import automation.library.pageObjects.AEM_Cart_Page;
import automation.library.pageObjects.AEM_Common_Page;
import automation.library.pageObjects.AEM_Contact_Us_Page;
import automation.library.pageObjects.AEM_Customer_Service_Informational_Copy_Page;
import automation.library.pageObjects.AEM_Edge_To_Edge_Banner_Page;
import automation.library.pageObjects.AEM_Featured_List_Page;
import automation.library.pageObjects.AEM_Footer_Page;
import automation.library.pageObjects.AEM_Get_A_New_Triangle_Rewards_Card_Page;
import automation.library.pageObjects.AEM_Header_Page;
import automation.library.pageObjects.AEM_Link_Card_Page;
import automation.library.pageObjects.AEM_Link_Existing_Card_Page;
import automation.library.pageObjects.AEM_Login_Page;
import automation.library.pageObjects.AEM_New_Rewards_Card_Screen_Page;
import automation.library.pageObjects.AEM_PDP_Add_To_Cart_Page;
import automation.library.pageObjects.AEM_PDP_Page;
import automation.library.pageObjects.AEM_PLP_Page;
import automation.library.pageObjects.AEM_Privacy_Charter_Page;
import automation.library.pageObjects.AEM_Registration_Page;
import automation.library.pageObjects.AEM_Search_And_SRP_Page;
import automation.library.pageObjects.AEM_Simple_Header_Checkout_Flow_Page;
import automation.library.pageObjects.AEM_Slim_Banner_Page;
import automation.library.pageObjects.AEM_Two_Featured_tiles_Component_Page;
import automation.library.pageObjects.Account_Address_Page;
import automation.library.pageObjects.Account_Payment_information_Page;
import automation.library.pageObjects.Account_Profile_Page;
import automation.library.pageObjects.Banner_Pages;
import automation.library.pageObjects.Broad_Banner_Page;
import automation.library.pageObjects.Broad_Promo_Tiles_Page;
import automation.library.pageObjects.Cart_Page;
import automation.library.pageObjects.Checkout_Page;
import automation.library.pageObjects.Contact_Us_Page;
import automation.library.pageObjects.Create_Your_Triangle_ID_Page;
import automation.library.pageObjects.Customer_Service_Page;
import automation.library.pageObjects.Email_Sent_Confirmation_Page;
import automation.library.pageObjects.Featured_List_Page;
import automation.library.pageObjects.Footer_Page;
import automation.library.pageObjects.Forgot_Password_Page;
import automation.library.pageObjects.Get_A_New_Triangle_Rewards_Card_Page;
import automation.library.pageObjects.Get_Personalized_Offers_Page;
import automation.library.pageObjects.Gigya_Api_Tool_Page;
import automation.library.pageObjects.Header_Page;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.Link_MasterCard_Page;
import automation.library.pageObjects.Link_Rewards_Options_Page;
import automation.library.pageObjects.Link_Your_Existing_Triangle_Rewards_Card_Page;
import automation.library.pageObjects.Link_Your_Triangle_Rewards_account_Page;
import automation.library.pageObjects.Link_reward_ProfileScreen_page;
import automation.library.pageObjects.Login_Page;
import automation.library.pageObjects.Mailinator_Page;
import automation.library.pageObjects.PDP_AddToCart_Page;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.PLP_Page;
import automation.library.pageObjects.Primary_Navigation_Page;
import automation.library.pageObjects.Privacy_Charter_Page;
import automation.library.pageObjects.Registration_Email_Verification_Page;
import automation.library.pageObjects.Reset_Password_Page;
import automation.library.pageObjects.Rewards_Terms_Conditions_Page;
import automation.library.pageObjects.SRP_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.pageObjects.Standard_Masthead_Banner_Page;
import automation.library.pageObjects.Two_Feature_Tile_Component_Page;
import automation.library.pageObjects.Your_Email_Has_Been_Verified_Page;
import automation.library.selenium.core.PageObject;

/**
 * Class to get Instance of Page & Locator Class
 */
public class PageObjectManager {

	private WebDriver driver;
	private HomePage homePage;
	private PDP_Page pdpPage;
	private Sign_Up_Page signUpPage;
	private HomePageLocator homePageLocator;
	private PDP_PageLocator pdpPageLocator;
	private PageObject pageObject;
	private PLP_Page plpPage;
	private PLP_PageLocator plpPageLocator;
	private Create_Your_Triangle_ID_Page_Locator createYourTriangleIDPageLocator;
	private Create_Your_Triangle_ID_Page createYourTrianglePage;
	private Registration_Email_Verification_Page registrationEmailVerificationPage;
	private Registration_Email_Verification_Locator registrationEmailVerificationLocator;
	private Get_Personalized_Offers_Page getPersonalizedOffersPage;
	private Get_Personalized_Offers_Page_Locator getPersonalizedOffersLocator;
	private Email_Sent_Confirmation_Page getEmailSentConfirmationPage;
	private Email_Sent_Confirmation_Page_Locator getEmailSentConfirmationLocator;
	private Mailinator_Page getMailinatorPage;
	private Mailinator_Page_Locator getMailinatorPageLocator;
	private Login_Page loginPage;
	private Login_Page_Locator loginPageLocator;
	private Forgot_Password_Page getForgotPasswordPage;
	private ForgotPasswordPageLocator getForgotPasswordLocator;
	private Your_Email_Has_Been_Verified_Page getYourEmailHasBeenVerifiedPage;
	private Your_Email_Has_Been_Verified_PageLocator getYourEmailHasBeenVerifiedLocator;
	private Privacy_Charter_Page getPrivacyCharterPage;
	private Privacy_Charter_Page_Locator getPrivacyCharterLocator;
	private Reset_Password_Page getResetPasswordPage;
	private Reset_Your_Password_Page_Locator getResetPassword_Page_Locator;

	private Gigya_Api_Tool_Page gigyaApiToolPage;
	private Gigya_Api_Tool_Page_Locator gigyaApiToolPage_Locator;

	private Link_reward_ProfileScreen_page getLink_reward_ProfileScreen_page;
	private Link_reward_ProfileScreen_page_Locator getLink_reward_ProfileScreen_page_Locator;
	private Header_Page getHeaderPage;
	private Header_Page_Locator getHeaderPageLocator;
	private Footer_Page getFooterPage;
	private Footer_PageLocator getFooterPageLocator;
	private Link_Your_Triangle_Rewards_account_Page getLinkYourTriangleRewardsAccountPage;
	private Link_Your_Triangle_Rewards_Account_Locator getLinkYourTriangleAccountLocator;
	private Get_A_New_Triangle_Rewards_Card_Page getAnewTriangleRewardsPage;
	private Get_A_New_Triangle_Rewards_Card_Locator getAnewTriangleRewardsCardLocator;
	private Primary_Navigation_Page getPrimaryNavigationPage;
	private Primary_Navigation_Page_Locator getPrimaryNavigationPageLocator;
	private Rewards_Terms_Conditions_Page getRewardsTermsAndConditionsPage;
	private Rewards_Terms_Conditions_Page_Locator getRewardsTermsAndCondtionsLocator;
	private Link_Your_Existing_Triangle_Rewards_Card_Page getLinkYourExistingRewardsPage;
	private Link_Your_Existing_Triangle_Rewards_Card_PageLocator getLinkYourExistingRewardsLocator;
	private AEM_Search_And_SRP_Page getSearchAndSRPPage;
	private AEM_Common_Page getAEMCommonPage;
	private AEM_Common_Page_Locator getAEMCommonPageLocator;
	private AEM_Search_And_SRP_Page_Locator getAEMSearchAndSRPPageLocator;
	private Link_Rewards_Options_Page getLinkRewardsOptsPage;
	private Link_Rewards_Options_Page_Locator getLinkRewardsOptsPageLocator;

	private AEM_New_Rewards_Card_Screen_Page getAEMNewRewardsCardScreenPage;
	private AEM_New_Rewards_Card_Screen_Page_Locator getAEMNewRewardsCardScreenPageLocator;
	private AEM_PDP_Page getAEMPDPPage;
	private AEM_PDP_Page_Locator gettAEMPDPPPageLocator;
	private AEM_PLP_Page getAEMPLPPage;
	private AEM_PLP_Page_Locator getAEMPLPPageLocator;
	private AEM_Link_Existing_Card_Page getAEMLinkExistingCardPage;
	private AEM_Link_Existing_Card_Page_Locator getAEMLinkExistingCardLocatorPage;
	private AEM_Footer_Page_Locator getAEMFooterPageLocator;
	private Banner_Pages getBannerPages;
	private Banners_Locator getBannerPageLocators;
	private Broad_Promo_Tiles_Page getBroadPromoTilesPage;
	private Broad_Promo_Tiles_Page_Locator getBroadPromoTilesPageLocator;
	private AEM_Broad_Promo_Tiles_Page getAEMBroadPromoTilesPage;
	private AEM_Broad_Promo_Tiles_Page_Locator getAEMBroadPromoTilesPageLocator;
	 
	private AEM_Link_Card_Page getAEMLinkCardPage;
	private AEM_Link_Card_Page_Locator getAEMLInkCardPageLocator;
	private AEM_Footer_Page_Locator getAEMFooterLocatorPage;
	private AEM_Footer_Page getAEMFooterPage; 
	private AEM_Header_Page_Locator getAEMHeaderLocatorPage;
	private AEM_Header_Page getAEMHeaderPage; 
	private Checkout_Page getCheckoutPage; 
	private Checkout_Page_Locator getCheckoutPageLocator;
	private AEM_Simple_Header_Checkout_Flow_Page getAEMSimpleHeaderCheckoutFlowPage;
	private AEM_Simple_Header_Checkout_Flow_Page_Locator getAEMSimpleHeaderCheckoutFlowPageLocator; 
	private Link_MasterCard_Page getLinkMasterCardPage;
	private Link_MasterCard_Page_Locator getLinkMasterCardLocatorPage;
	private AEM_Login_Page getAEMLoginPage;
	private AEM_Login_Page_Locator getAEMLoginPageLocator;
	private AEM_Registration_Page getAEMRegistrationPage;
	private AEM_Registration_Page_Locator getAEMRegistrationPageLocator;
	private AEM_Header_Page_Locator getAEMHeaderPageLocator;
	private AEM_Feature_List_Page_Locator getAEMFeatureListPageLocator;
	private AEM_Featured_List_Page getAEMFeatureListPage;
	private Feature_List_Page_Locator getFeatureListPageLocator;
	private Featured_List_Page getFeatureListPage;

	private Customer_Service_Page getCustomerServicePage;
	private Customer_Service_Page_Locator getCustomerServicePageLocator;  
	private AEM_Customer_Service_Informational_Copy_Page getAEMCustomerServiceInformationalCopyPage;
	private AEM_Customer_Service_Informational_Copy_Page_Locator getAEMCustomerServiceInformationalCopyPageLocator;
	private Cart_Page getCartPage;
	private Cart_Page_Locator getCartPageLocator; 
	private AEM_Cart_Page getAEMCartPage;
	private AEM_Cart_Page_Locator getAEMCartPageLocator; 
	private AEM_Privacy_Charter_Page getAEMPrivacyCharterPage;
	private AEM_Privacy_Charter_Page_Locator getAEMPrivacyCharterPageLocator;

	private Two_Feature_Tile_Component_Page getTwoFeatureTileComponentPage;
	private Two_Featured_Tile_Component_Page_Locator getTwoFeaturedTileComponentPageLocator;
	private AEM_Two_Featured_tiles_Component_Page getAEMTwoFeatureTileComponentPage;
	private AEM_Two_Featured_Tiles_Component_Page_Locator getAEMTwoFeaturedTileComponentPageLocator;

	private PDP_AddToCart_Page getPDPAddToCartPage;
	private PDP_AddToCart_Page_Locator getPDPAddToCartPageLocator;
	private AEM_PDP_Add_To_Cart_Page getAEMPDPAddToCartPage;
	private AEM_PDP_Add_To_Cart_Page_Locator getAEMPDPAddToCartPageLocator;
	private AEM_Broad_Banner_Page getAEMBroadBannerPage;
	private AEM_Broad_Banner_Page_Locator getAEMBroadBannerPageLocator;
	private Broad_Banner_Page getBroadBannerPage;
	private Broad_Banner_Page_Locator getBroadBannerPageLocator;
	private AEM_Edge_To_Edge_Banner_Locator getAEMEdgeToEdgeBannerLocator;
	private AEM_Edge_To_Edge_Banner_Page getAEMEdgeToEdgeBannerPage;
	private AEM_Get_A_New_Triangle_Rewards_Card_Page getAEMANewTriangleRewardsCardPage;
	private AEM_Get_A_New_Triangle_Rewards_Card_Locator getAEMANewTriangleRewardsCardLocator;
	private AEM_Account_Address_Page getAEMAccountAddressPage;
	private AEM_Account_Address_Page_Locator getAEMAccountAddressPageLocator;
	private Account_Address_Page_Locator getAccountAddressPageLocator;
	private Account_Address_Page getAccountAddressPage;
	private AEM_Slim_Banner_page_Locator getAEMSlimBannerpageLocator;
	private AEM_Slim_Banner_Page getAEMSlimBannerPage;
	private AEM_Contact_Us_Page getAEMContactUsPage;
	private AEM_Contact_Us_Page_Locator getAEMContactUsPageLocator;
	
	private SRP_Page getSRPPage;
	private Standard_Masthead_Banner_Page getStandardMastheadBannerPage;
	private Standard_Masthead_Banner_Page_Locator getStandardMastheadBannerPageLocator;
	private AEM_Account_Rewards_Template_Page  getAccountRewardsTemplatePage;
	private AEM_Account_Rewards_Template_Page_Locator getAccountRewardsTemplatePageLocator;
	private AEM_Account_Payment_Infromation_Page_Locator getAEMAccountPaymentInfromationPageLocator;
	private AEM_Account_Payment_Infromation_Page getAEMAccountPaymentInfromationPage;
	private Account_Payment_Information_Page_Locator getAccountPaymentInformationPageLocator;
	private Account_Payment_information_Page getAccountPaymentInformationPage;
	private Account_Profile_Page getAccountProfilePage;
	private Account_Profile_Page_Locator getAccountProfilePageLocator;
	private AEM_Account_Profile_Page_Locator getAEMAccountProfilePageLocator;
	private AEM_Account_Profile_Page getAEMAccountProfilePage;
	private Contact_Us_Page getContactUspage;
	private Contactus_Locator getContactUsLocator;
	
	public PageObjectManager() {
		
	}
	
	/** Returns Instance of Page Object File */
	public PageObject getPageObject(WebDriver driver) throws Exception {

		return (pageObject == null) ? pageObject = new PageObject(driver) : pageObject;

	}

	/** Returns Instance of Home File */
	public HomePage getHomePage(WebDriver driver) throws Exception {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}
	
	/** Returns Instance of PDP File */
	public PDP_Page getPDPPage(WebDriver driver) throws Exception {
		
		return (pdpPage == null) ? pdpPage = new PDP_Page(driver) : pdpPage;
		
	}
	
	/** Returns Instance of Home Locator File */
	public HomePageLocator getHomePageLocator() {
		
		return (homePageLocator == null) ? homePageLocator = new HomePageLocator() : homePageLocator;
		
	}
	
	/** Returns Instance of PDP Page File */
	public PDP_PageLocator getPDPPageLocator() {
		
		return (pdpPageLocator == null) ? pdpPageLocator = new PDP_PageLocator() : pdpPageLocator;
		
	}
	
	/** Returns Instance of Sign up Page File */
	public Sign_Up_Page getSignUpPage(WebDriver driver) {
		
		return (signUpPage == null) ? signUpPage = new Sign_Up_Page(driver) : signUpPage;
		
	}
	
	/** Returns Instance of PLP Page File */
	public PLP_Page getPLPPage(WebDriver driver) throws Exception {
		
		return (plpPage == null) ? plpPage = new PLP_Page(driver) : plpPage;
		
	}
	
	/** Returns Instance of PLP Locator File */
	public PLP_PageLocator getPLPLocatorPage() {
		
		return (plpPageLocator == null) ? plpPageLocator = new PLP_PageLocator() : plpPageLocator;
		
	}
	
	/** Returns Instance of Create Your Triangle ID Locator File */
	public Create_Your_Triangle_ID_Page_Locator getCreateTriangleIDPageLocatorPage() {
		
		return (createYourTriangleIDPageLocator == null) ? createYourTriangleIDPageLocator = new Create_Your_Triangle_ID_Page_Locator() : createYourTriangleIDPageLocator;
		
	}
	
	/** Returns Instance of Create Your Triangle ID File */
	public Create_Your_Triangle_ID_Page getCreateTirangleIDPage(WebDriver driver) {
		
		return (createYourTrianglePage == null) ? createYourTrianglePage = new Create_Your_Triangle_ID_Page(driver) : createYourTrianglePage;
		
	}
	
	/** Returns Instance of Registration Email Verification File */
	public Registration_Email_Verification_Page getRegistrationEmailVerificationPage(WebDriver driver) {
		
		return (registrationEmailVerificationPage == null) ? registrationEmailVerificationPage = new Registration_Email_Verification_Page(driver) : registrationEmailVerificationPage;
		
	}
	
	/** Returns Instance of Registration Email Verification Locator File */
	public Registration_Email_Verification_Locator getRegistrationEmailVerificationLocator() {
		
		return (registrationEmailVerificationLocator == null) ? registrationEmailVerificationLocator = new Registration_Email_Verification_Locator() : registrationEmailVerificationLocator;
		
	}
	
	/** Returns Instance of Get Personalized Offers File */
   public Get_Personalized_Offers_Page getPersonalizedOffersPage(WebDriver driver) {
		
		return (getPersonalizedOffersPage == null) ? getPersonalizedOffersPage = new Get_Personalized_Offers_Page(driver) : getPersonalizedOffersPage;
		
	}
	
   /** Returns Instance of Get Personalized Offers Locator File */
	public Get_Personalized_Offers_Page_Locator getPersonalizedOffersLocator() {
		
		return (getPersonalizedOffersLocator == null) ? getPersonalizedOffersLocator = new Get_Personalized_Offers_Page_Locator() : getPersonalizedOffersLocator;
		
	}
	
	/** Returns Instance of Email Sent Confirmation File */
	public Email_Sent_Confirmation_Page getEmailSentConfirmationPage(WebDriver driver) {
		
		return (getEmailSentConfirmationPage == null) ? getEmailSentConfirmationPage = new Email_Sent_Confirmation_Page(driver) : getEmailSentConfirmationPage;
		
	}
	
	/** Returns Instance of Email Sent Confirmation Locator File */
	public Email_Sent_Confirmation_Page_Locator getEmailSentConfirmationLocator() {
		
		return (getEmailSentConfirmationLocator == null) ? getEmailSentConfirmationLocator = new Email_Sent_Confirmation_Page_Locator() : getEmailSentConfirmationLocator;
		
	}
	
	/** Returns Instance of Mailinator File */
	public Mailinator_Page getMailinatorPage(WebDriver driver) {
		
		return (getMailinatorPage == null) ? getMailinatorPage = new Mailinator_Page(driver) : getMailinatorPage;
		
	}
	
	/** Returns Instance of Mailinator Locator File */
	public Mailinator_Page_Locator getMailinatorPageLocator() {
		
		return (getMailinatorPageLocator == null) ? getMailinatorPageLocator = new Mailinator_Page_Locator() : getMailinatorPageLocator;
		
	}
	
	/** Returns Instance of Login File */
	public Login_Page getLoginPage(WebDriver driver) {
		
		
		return (loginPage == null) ? loginPage = new Login_Page(driver) : loginPage;
	}
	
	/** Returns Instance of Login Locator File */
	public Login_Page_Locator getLoginPageLocator() {
		
		return (loginPageLocator == null) ? loginPageLocator = new Login_Page_Locator() : loginPageLocator;
		
	}
	
	/** Returns Instance of Forgot Password File */
	public Forgot_Password_Page getForgotPasswordPage(WebDriver driver) {
		
		return (getForgotPasswordPage == null) ? getForgotPasswordPage = new Forgot_Password_Page(driver) : getForgotPasswordPage;
		
	}
	
	/** Returns Instance of Forgog Password Locator File */
	public ForgotPasswordPageLocator getForgotPasswordLocator() {
		
		return (getForgotPasswordLocator == null) ? getForgotPasswordLocator = new ForgotPasswordPageLocator() : getForgotPasswordLocator;
		
	}
	
	/** Returns Instance of Email Has Been Verified File */
	public Your_Email_Has_Been_Verified_Page getYourEmailHasBeenVerifiedPage(WebDriver driver) {
		return (getYourEmailHasBeenVerifiedPage == null) ? getYourEmailHasBeenVerifiedPage = new Your_Email_Has_Been_Verified_Page(driver) : getYourEmailHasBeenVerifiedPage;
	}
	
	/** Returns Instance of Email Has Been Verified Locator File */
	public Your_Email_Has_Been_Verified_PageLocator getYourEmailHasBeenVerifiedLocator() {
		return (getYourEmailHasBeenVerifiedLocator == null) ? getYourEmailHasBeenVerifiedLocator = new Your_Email_Has_Been_Verified_PageLocator() : getYourEmailHasBeenVerifiedLocator;
	}
	
	/** Returns Instance of Privacy Charter File */
	public Privacy_Charter_Page getPrivacyPage(WebDriver driver) {
		return (getPrivacyCharterPage == null) ? getPrivacyCharterPage = new Privacy_Charter_Page(driver) : getPrivacyCharterPage;
	}
	
	/** Returns Instance of Privacy Charter Locator File */
	public Privacy_Charter_Page_Locator getPrivacyPageLocator() {
		return (getPrivacyCharterLocator == null) ? getPrivacyCharterLocator = new Privacy_Charter_Page_Locator() : getPrivacyCharterLocator;
	}
	
	/** Returns Instance of Reset Passsword File */
	public Reset_Password_Page getResetPasswordPage(WebDriver driver) {
		return (getResetPasswordPage == null) ? getResetPasswordPage = new Reset_Password_Page(driver) : getResetPasswordPage;
	}
	
	/** Returns Instance of Reset Password Locator File */
	public Reset_Your_Password_Page_Locator getResetPasswordLocatorPage() {
		return (getPrivacyCharterLocator == null) ? getResetPassword_Page_Locator = new Reset_Your_Password_Page_Locator() : getResetPassword_Page_Locator;
	}
 	
	public Link_reward_ProfileScreen_page getLink_reward_ProfileScreen_page(WebDriver driver) {
		return (getLink_reward_ProfileScreen_page == null) ? getLink_reward_ProfileScreen_page = new Link_reward_ProfileScreen_page(driver) : getLink_reward_ProfileScreen_page;
	}
	public Link_reward_ProfileScreen_page_Locator getLink_reward_ProfileScreen_page_Locator() {
		return (getLink_reward_ProfileScreen_page_Locator == null) ? getLink_reward_ProfileScreen_page_Locator = new Link_reward_ProfileScreen_page_Locator() : getLink_reward_ProfileScreen_page_Locator;
	}
	/** Returns Instance of Header File */
	public Header_Page getHeaderPage(WebDriver driver) {
		return (getHeaderPage == null) ? getHeaderPage = new Header_Page(driver) : getHeaderPage;
	}
	
	/** Returns Instance of Header Locator File */
	public Header_Page_Locator get_Header_Locator_Page() {
		return (getHeaderPageLocator == null) ? getHeaderPageLocator = new Header_Page_Locator() : getHeaderPageLocator;
				
	}
	
	/** Returns Instance of Footer File */
	public Footer_Page getFooterPage(WebDriver driver) {
		return (getFooterPage == null) ? getFooterPage = new Footer_Page(driver) : getFooterPage;
	}
	
	/** Returns Instance of Footer Locator File */
	public Footer_PageLocator getFooterPageLocator() {
		return (getFooterPageLocator == null) ? getFooterPageLocator = new Footer_PageLocator() : getFooterPageLocator;
	}
 	
	/** Returns Instance of Link Your Triangle Rewards Account Locator File */
	public Link_Your_Triangle_Rewards_account_Page getLinkYourTriangleRewardsAccountPage(WebDriver driver) {
		return (getLinkYourTriangleRewardsAccountPage == null) ? getLinkYourTriangleRewardsAccountPage = new Link_Your_Triangle_Rewards_account_Page(driver) : getLinkYourTriangleRewardsAccountPage;
	}
	
	/** Returns Instance of Link Your Triangle Rewards Account Locator File */
	public Link_Your_Triangle_Rewards_Account_Locator getLinkYourTriangleRewardsAccountLocator() {
		return (getLinkYourTriangleAccountLocator == null) ? new Link_Your_Triangle_Rewards_Account_Locator() : getLinkYourTriangleAccountLocator;
	}
	
	/** Returns Instance of Get A New Triangle Rewards Card File */
	public Get_A_New_Triangle_Rewards_Card_Page getANewTriangleRewardsCardPage(WebDriver driver) {
		return (getAnewTriangleRewardsPage == null) ? getAnewTriangleRewardsPage = new Get_A_New_Triangle_Rewards_Card_Page(driver) : getAnewTriangleRewardsPage;
	}
	
	/** Returns Instance of Get A New Triangle Rewards Card Locator File */
	public Get_A_New_Triangle_Rewards_Card_Locator getANewTriangleRewardsCardLocator() {
		return (getAnewTriangleRewardsCardLocator == null) ? getAnewTriangleRewardsCardLocator = new Get_A_New_Triangle_Rewards_Card_Locator() : getAnewTriangleRewardsCardLocator;
	}
	
	/** Returns Instance of Primary Navigation Page File */
	public Primary_Navigation_Page getPrimaryNavigationPage(WebDriver driver) {
		return (getPrimaryNavigationPage == null) ? getPrimaryNavigationPage = new Primary_Navigation_Page(driver) : getPrimaryNavigationPage;
	}
	
	/** Returns Instance of Primary Navigation Locator File */
	public Primary_Navigation_Page_Locator getPrimaryNavigationLocator() {
		return (getPrimaryNavigationPageLocator == null) ? getPrimaryNavigationPageLocator = new Primary_Navigation_Page_Locator() : getPrimaryNavigationPageLocator;
	}
	
	/** Returns Instance of Rewards Terms And Conditions Locator File */
	public Rewards_Terms_Conditions_Page_Locator getRewardsTermsAndConditionsLocator() {
		return (getRewardsTermsAndCondtionsLocator == null) ? getRewardsTermsAndCondtionsLocator = new Rewards_Terms_Conditions_Page_Locator() : getRewardsTermsAndCondtionsLocator;
	}
	
	/** Returns Instance of Rewards Terms And Conditions Page File */
	public Rewards_Terms_Conditions_Page getRewardsTermsAndCondtionsPage(WebDriver driver) {
		return (getRewardsTermsAndConditionsPage == null) ? getRewardsTermsAndConditionsPage = new Rewards_Terms_Conditions_Page(driver) : getRewardsTermsAndConditionsPage;
	}
	
	/** Returns Instance of Link Your Existing Triangle Rewards Card Page File */
	public Link_Your_Existing_Triangle_Rewards_Card_Page getLinkYourExistingTriangleRewardsCardPage(WebDriver driver) {
		return (getLinkYourExistingRewardsPage == null) ? getLinkYourExistingRewardsPage = new Link_Your_Existing_Triangle_Rewards_Card_Page(driver) : getLinkYourExistingRewardsPage;
	}
	
	/** Returns Instance of Link Your Existing Triangle Rewards Card Page Locator File */
	public Link_Your_Existing_Triangle_Rewards_Card_PageLocator getLinkYourExistingTriangleRewardsAccountLocaoter() {
		return (getLinkYourExistingRewardsLocator == null) ? getLinkYourExistingRewardsLocator = new Link_Your_Existing_Triangle_Rewards_Card_PageLocator() : getLinkYourExistingRewardsLocator; 
	}

	/** Return Instance of Search And SRP Page */
	public AEM_Search_And_SRP_Page getAEMSearchAndSRPPage(WebDriver driver) {
		return (getSearchAndSRPPage == null) ?  getSearchAndSRPPage = new AEM_Search_And_SRP_Page(driver) : getSearchAndSRPPage;
	}
	
	/** Return Instance of AEM Common Page */
	public AEM_Common_Page getAEMCommonPage(WebDriver driver) {
		return (getAEMCommonPage == null) ? getAEMCommonPage = new AEM_Common_Page(driver) : getAEMCommonPage;
	}
	
	/** Returns Instance of Link Rewards Options Account Locator File */
	public Link_Rewards_Options_Page getLinkRewardsOptionsPage(WebDriver driver) {
		return (getLinkRewardsOptsPage == null) ? getLinkRewardsOptsPage = new Link_Rewards_Options_Page(driver) : getLinkRewardsOptsPage;
	}
	
	/** Returns Instance of Link Rewards Options Account Locator File*/
	public Link_Rewards_Options_Page_Locator getLinkRewardsOptionsPageLocator() {
		return (getLinkRewardsOptsPageLocator == null) ? getLinkRewardsOptsPageLocator = new Link_Rewards_Options_Page_Locator() : getLinkRewardsOptsPageLocator;
	}
	/** Returns Instance of Gigya Api Tool file */
	public Gigya_Api_Tool_Page getGigyaApiToolPage(WebDriver driver) {
		return (gigyaApiToolPage == null) ? gigyaApiToolPage = new Gigya_Api_Tool_Page(driver) : gigyaApiToolPage;
	}
	
	/** Return Instance of AEM Common Page Locator */
	public AEM_Common_Page_Locator getAEMCommonPageLocator() {
		return (getAEMCommonPageLocator == null) ? getAEMCommonPageLocator = new AEM_Common_Page_Locator() : getAEMCommonPageLocator;
	}
	
	/** Return Instance of AEM Search and SRP Page Locator */
	public AEM_Search_And_SRP_Page_Locator getAEMSearchAndSRPPageLocator() {
		return (getAEMSearchAndSRPPageLocator == null) ? getAEMSearchAndSRPPageLocator = new AEM_Search_And_SRP_Page_Locator() : getAEMSearchAndSRPPageLocator;
 	}
	

	/** Returns Instance of Gigya Api Tool file Locator File*/
	public Gigya_Api_Tool_Page_Locator getGigyaApiToolPageLocator() {
		return (gigyaApiToolPage_Locator == null) ? gigyaApiToolPage_Locator =new Gigya_Api_Tool_Page_Locator() : gigyaApiToolPage_Locator;
	}
	
	/** Return Instance of AEM New Rewards Card Screen Page */
	public AEM_New_Rewards_Card_Screen_Page getAEMNewRewardsCardScreenPage(WebDriver driver) {
		return (getAEMNewRewardsCardScreenPage == null) ? getAEMNewRewardsCardScreenPage = new AEM_New_Rewards_Card_Screen_Page(driver) : getAEMNewRewardsCardScreenPage;
	}
	
	/** Return Instance of AEM New Rewards Card Screen Page Locator */
	public AEM_New_Rewards_Card_Screen_Page_Locator getAEMNewRewardsCardScreenPageLocator() {
		return (getAEMNewRewardsCardScreenPageLocator == null) ? getAEMNewRewardsCardScreenPageLocator = new AEM_New_Rewards_Card_Screen_Page_Locator() : getAEMNewRewardsCardScreenPageLocator;
	}
	
	/** Returns Instance of AEM PDP Page */
	public AEM_PDP_Page getAEMPDPPage(WebDriver driver) {
		return (getAEMPDPPage == null) ? getAEMPDPPage = new AEM_PDP_Page(driver) : getAEMPDPPage;
	}
	
	/** Returns Instance of AEM PDP Page Locator */
	public AEM_PDP_Page_Locator gettAEMPDPPPageLocator() {
		return (gettAEMPDPPPageLocator == null) ? gettAEMPDPPPageLocator = new AEM_PDP_Page_Locator() : gettAEMPDPPPageLocator;
	}
	
	/** Returns Instance of AEM PLP Page */
	public AEM_PLP_Page getAEMPLPPage(WebDriver driver) {
		return (getAEMPLPPage == null) ? getAEMPLPPage = new AEM_PLP_Page(driver) : getAEMPLPPage;
 	}
	
	/** Returns Instance of AEM PLP Page Locator */
	public AEM_PLP_Page_Locator getAEMPLPLocatorPage() {
		return (getAEMPLPPageLocator == null) ? getAEMPLPPageLocator = new AEM_PLP_Page_Locator() : getAEMPLPPageLocator;
	}
	
	/** Returns Instance of AEM Link Existing Card Page */
	public AEM_Link_Existing_Card_Page getAEMLinkExistingCardPage(WebDriver driver) {
		return (getAEMLinkExistingCardPage == null) ? getAEMLinkExistingCardPage = new AEM_Link_Existing_Card_Page(driver) : getAEMLinkExistingCardPage;
 	}
	
	/** Returns Instance of AEM Link Existing Card Page Locator */
	public AEM_Link_Existing_Card_Page_Locator getAEMLinkExistingCardLocatorPage() {
		return (getAEMLinkExistingCardLocatorPage == null) ? getAEMLinkExistingCardLocatorPage = new AEM_Link_Existing_Card_Page_Locator() : getAEMLinkExistingCardLocatorPage;
	}
	
	/** Returns Instance of AEM Footer Page Locator */
	public AEM_Footer_Page_Locator getAEMFooterPageLocator() {
		return (getAEMFooterPageLocator == null) ? getAEMFooterPageLocator = new AEM_Footer_Page_Locator() : getAEMFooterPageLocator;
	}

	/** Returns Instance of Edge To Edge Banner Page File */
	public Banner_Pages getBannerPages(WebDriver driver) throws Exception {	
		return (getBannerPages == null) ? getBannerPages = new Banner_Pages(driver) : getBannerPages;	
	}
	/** Returns Instance of Edge To Edge Banner Page Locator */
	public Banners_Locator getBannerPageLocators() {
		return (getBannerPageLocators == null) ? getBannerPageLocators = new Banners_Locator() : getBannerPageLocators;
	}
	/** Returns Instance of Broad Promo Tiles Page */
	public Broad_Promo_Tiles_Page getBroadPromoTilesPage(WebDriver driver) {	
		return (getBroadPromoTilesPage == null) ? getBroadPromoTilesPage = new Broad_Promo_Tiles_Page(driver) : getBroadPromoTilesPage;
	}
	/** Returns Instance of Broad Promo Tiles Page Locators */
	public Broad_Promo_Tiles_Page_Locator getBroadPromoTilesPageLocator() {	
		return (getBroadPromoTilesPageLocator == null) ? getBroadPromoTilesPageLocator = new Broad_Promo_Tiles_Page_Locator() : getBroadPromoTilesPageLocator;	
	}
	/** Returns Instance of AEM  Broad Promo Tiles Page */
	public AEM_Broad_Promo_Tiles_Page getAEMBroadPromoTilesPage(WebDriver driver) {
		return (getAEMBroadPromoTilesPage == null) ? getAEMBroadPromoTilesPage = new AEM_Broad_Promo_Tiles_Page(driver) : getAEMBroadPromoTilesPage;
	}
	
	/** Returns Instance of AEM  Broad Promo Tiles Page Locator */
	public AEM_Broad_Promo_Tiles_Page_Locator getAEMBroadPromoTilesPageLocator() {
		return (getAEMBroadPromoTilesPageLocator == null) ? getAEMBroadPromoTilesPageLocator = new AEM_Broad_Promo_Tiles_Page_Locator() : getAEMBroadPromoTilesPageLocator;
	}
	/** Returns Instance of AEM Link Card Page */
	public AEM_Link_Card_Page getAEMLinkCardPage(WebDriver driver) {
		return (getAEMLinkCardPage == null) ? getAEMLinkCardPage = new AEM_Link_Card_Page(driver) : getAEMLinkCardPage;
	}
	
	/** Returns Instance of AEM Link Card Page Locator */
	public AEM_Link_Card_Page_Locator getAEMLinkCardPageLocator() {
		return (getAEMCommonPageLocator == null) ? getAEMLInkCardPageLocator = new AEM_Link_Card_Page_Locator() : getAEMLInkCardPageLocator;
	}
	
	/** Return Instance of AEM Footer Page */
	public AEM_Footer_Page getAEMFooterPage(WebDriver driver) {
		return (getAEMFooterPage == null) ? getAEMFooterPage = new AEM_Footer_Page(driver) : getAEMFooterPage;
	}
	
	/** Return Instance of AEM Footer Locator Page */
	public AEM_Footer_Page_Locator getAEMFooterLocatorPage() {
		return (getAEMFooterLocatorPage == null) ? getAEMFooterLocatorPage = new AEM_Footer_Page_Locator() : getAEMFooterLocatorPage;
	}

	/** Return Instance of AEM Header Page */
	public AEM_Header_Page getAEMHeaderPage(WebDriver driver) {
		return (getAEMHeaderPage == null) ? getAEMHeaderPage = new AEM_Header_Page(driver) : getAEMHeaderPage;
	}
	
	/** Return Instance of AEM Header Locator Page */
	public AEM_Header_Page_Locator getAEMHeaderLocatorPage() {
		return (getAEMHeaderLocatorPage == null) ? getAEMHeaderLocatorPage = new AEM_Header_Page_Locator() : getAEMHeaderLocatorPage;
	}

	/** Return Instance of Checkout Page */
	public Checkout_Page getCheckoutPage(WebDriver driver) {
		return (getCheckoutPage == null) ? getCheckoutPage = new Checkout_Page(driver) : getCheckoutPage;
	}
	
	/** Return Instance of Checkout Locator Page */
	public Checkout_Page_Locator getCheckoutPageLocator() {
		return (getCheckoutPageLocator == null) ? getCheckoutPageLocator = new Checkout_Page_Locator() : getCheckoutPageLocator;

	}
	/** Return Instance of AEM Simple Header Checkout Flow Page */
	public AEM_Simple_Header_Checkout_Flow_Page getAEMSimpleHeaderCheckoutFlowPage(WebDriver driver) {
		return (getAEMSimpleHeaderCheckoutFlowPage == null) ? getAEMSimpleHeaderCheckoutFlowPage = new AEM_Simple_Header_Checkout_Flow_Page(driver) : getAEMSimpleHeaderCheckoutFlowPage;
	}
	
	/** Return Instance of AEM Simple Header Checkout Flow Locator Page */
	public AEM_Simple_Header_Checkout_Flow_Page_Locator getAEMSimpleHeaderCheckoutFlowPageLocator() {
		return (getAEMSimpleHeaderCheckoutFlowPageLocator == null) ? getAEMSimpleHeaderCheckoutFlowPageLocator = new AEM_Simple_Header_Checkout_Flow_Page_Locator() : getAEMSimpleHeaderCheckoutFlowPageLocator;
	}
	/** Return Instance of AEM Footer Page */
	public Link_MasterCard_Page getLinkMasterCardPage(WebDriver driver) {
		return (getLinkMasterCardPage == null) ? getLinkMasterCardPage = new Link_MasterCard_Page(driver) : getLinkMasterCardPage;
	}
	
	/** Return Instance of AEM Footer Locator Page */
	public Link_MasterCard_Page_Locator getLinkMasterCardLocatorPage() {
		return (getLinkMasterCardLocatorPage == null) ? getLinkMasterCardLocatorPage = new Link_MasterCard_Page_Locator() : getLinkMasterCardLocatorPage;

	}
	/** Return Instance of AEM  Login Page */
	public AEM_Login_Page getAEMLoginPage(WebDriver driver) {
		return (getAEMLoginPage == null) ? getAEMLoginPage = new AEM_Login_Page(driver) : getAEMLoginPage;
	}
	
	/** Return Instance of AEM Footer Locator Page */
	public AEM_Login_Page_Locator getAEMLoginPageLocator() {
		return (getAEMLoginPageLocator == null) ? getAEMLoginPageLocator = new AEM_Login_Page_Locator() : getAEMLoginPageLocator;
	}
	/** Return Instance of AEM  Login Page */
	public AEM_Registration_Page getAEMRegistrationPage(WebDriver driver) {
		return (getAEMRegistrationPage == null) ? getAEMRegistrationPage = new AEM_Registration_Page(driver) : getAEMRegistrationPage;
	}
	
	/** Return Instance of AEM Footer Locator Page */
	public AEM_Registration_Page_Locator getAEMRegistrationPageLocator() {
		return (getAEMRegistrationPageLocator == null) ? getAEMRegistrationPageLocator = new AEM_Registration_Page_Locator() : getAEMRegistrationPageLocator;
	}
	
	/** Return Instance of AEM Header Locator Page */
	public AEM_Header_Page_Locator getAEMHeaderPageLocator() {
		return (getAEMHeaderPageLocator == null) ? getAEMHeaderPageLocator = new AEM_Header_Page_Locator() : getAEMHeaderPageLocator;

	}

	/** Return Instance of AEM Feature List Page */
	public AEM_Featured_List_Page getAEMFeatureListPage(WebDriver driver) {
		return (getAEMFeatureListPage == null) ? getAEMFeatureListPage = new AEM_Featured_List_Page(driver) : getAEMFeatureListPage;
	}
	
	/** Return Instance of AEM Feature List Page Locator */
	public AEM_Feature_List_Page_Locator getAEMFeatureListPageLocator() {
		return (getAEMFeatureListPageLocator == null) ? getAEMFeatureListPageLocator = new AEM_Feature_List_Page_Locator() : getAEMFeatureListPageLocator;
	}
	
	/** Return Instance of  Feature List Page */
	public Featured_List_Page getFeatureListPage(WebDriver driver) {
		return (getFeatureListPage == null) ? getFeatureListPage = new Featured_List_Page(driver) : getFeatureListPage;
	}
	
	/** Return Instance of  Feature List Page Locator */
	public Feature_List_Page_Locator getFeatureListPageLocator() {
		return (getFeatureListPageLocator == null) ? getFeatureListPageLocator = new Feature_List_Page_Locator() : getFeatureListPageLocator;
	}

	/** Return Instance of Customer Service Page */
	public Customer_Service_Page getCustomerServicePage(WebDriver driver) {
		return (getCustomerServicePage == null) ? getCustomerServicePage = new Customer_Service_Page(driver) : getCustomerServicePage;
	}
	
	/** Return Instance of Customer Service Locator Page */
	public Customer_Service_Page_Locator getCustomerServicePageLocator() {
		return (getCustomerServicePageLocator == null) ? getCustomerServicePageLocator = new Customer_Service_Page_Locator() : getCustomerServicePageLocator;

	}
	/** Return Instance of AEM  Login Page */
	public AEM_Customer_Service_Informational_Copy_Page getAEMCustomerServiceInformationalCopyPage(WebDriver driver) {
		return (getAEMCustomerServiceInformationalCopyPage == null) ? getAEMCustomerServiceInformationalCopyPage = new AEM_Customer_Service_Informational_Copy_Page(driver) : getAEMCustomerServiceInformationalCopyPage;
	}
	
	/** Return Instance of AEM Footer Locator Page */
	public AEM_Customer_Service_Informational_Copy_Page_Locator getAEMCustomerServiceInformationalCopyPageLocator() {
		return (getAEMCustomerServiceInformationalCopyPageLocator == null) ? getAEMCustomerServiceInformationalCopyPageLocator = new AEM_Customer_Service_Informational_Copy_Page_Locator() : getAEMCustomerServiceInformationalCopyPageLocator;
	}
	
	/** Return Instance of Cart Page */
	public Cart_Page getCartPage(WebDriver driver) {
		return (getCartPage == null) ? getCartPage = new Cart_Page(driver) : getCartPage;
	}
	
	/** Return Instance of AEM Privacy Charter Page */
	public AEM_Privacy_Charter_Page getAEMPrivacyCharterPage(WebDriver driver) {
		return (getAEMPrivacyCharterPage == null) ? getAEMPrivacyCharterPage = new AEM_Privacy_Charter_Page(driver) : getAEMPrivacyCharterPage;
	}
	
	/** Return Instance of Cart Locator Page */
	public Cart_Page_Locator getCartPageLocator() {
		return (getCartPageLocator == null) ? getCartPageLocator = new Cart_Page_Locator() : getCartPageLocator;
	}
	
	/** Return Instance of AEM Cart Page */
	public AEM_Cart_Page getAEMCartPage(WebDriver driver) {
		return (getAEMCartPage == null) ? getAEMCartPage = new AEM_Cart_Page(driver) : getAEMCartPage;
	}
	
	/** Return Instance of AEM Cart Locator Page */
	public AEM_Cart_Page_Locator getAEMCartPageLocator() {
		return (getAEMCartPageLocator == null) ? getAEMCartPageLocator = new AEM_Cart_Page_Locator() : getAEMCartPageLocator;
	}
	
	/** Return Instance of AEM Privacy Charter Page Locator */
	public AEM_Privacy_Charter_Page_Locator getAEMPrivacyCharterPageLocator() {
		return (getAEMPrivacyCharterPageLocator == null) ? getAEMPrivacyCharterPageLocator = new AEM_Privacy_Charter_Page_Locator() : getAEMPrivacyCharterPageLocator;
	}
	/** Return Instance of Two feature tile component Page  */
	public Two_Feature_Tile_Component_Page getTwoFeatureTileComponentPage(WebDriver driver) {
		return (getTwoFeatureTileComponentPage == null) ? getTwoFeatureTileComponentPage = new Two_Feature_Tile_Component_Page(driver) : getTwoFeatureTileComponentPage;
	}
	/** Return Instance of Two feature tile component Page Locator */
	public Two_Featured_Tile_Component_Page_Locator getTwoFeaturedTileComponentPageLocator() {
		return (getTwoFeaturedTileComponentPageLocator == null) ? getTwoFeaturedTileComponentPageLocator = new Two_Featured_Tile_Component_Page_Locator() : getTwoFeaturedTileComponentPageLocator;
	}
	/** Return Instance of AEM Two feature tile component Page  */
	public AEM_Two_Featured_tiles_Component_Page getAEMTwoFeatureTileComponentPage(WebDriver driver) {
		return (getAEMTwoFeatureTileComponentPage == null) ? getAEMTwoFeatureTileComponentPage = new AEM_Two_Featured_tiles_Component_Page(driver) : getAEMTwoFeatureTileComponentPage;
	}
	/** Return Instance of AEM Two feature tile component Page Locator */
	public AEM_Two_Featured_Tiles_Component_Page_Locator getAEMTwoFeaturedTileComponentPageLocator() {
		return (getAEMTwoFeaturedTileComponentPageLocator == null) ? getAEMTwoFeaturedTileComponentPageLocator = new AEM_Two_Featured_Tiles_Component_Page_Locator() : getAEMTwoFeaturedTileComponentPageLocator;
	}
	/** Return Instance of Add to Cart Page  */
	public PDP_AddToCart_Page getPDPAddToCartPage(WebDriver driver) {
		return (getPDPAddToCartPage == null) ? getPDPAddToCartPage = new PDP_AddToCart_Page(driver) : getPDPAddToCartPage;
	}
	/** Return Instance of AddToCart Page Locator */
	public PDP_AddToCart_Page_Locator getPDPAddToCartPageLocator() {
		return (getPDPAddToCartPageLocator == null) ? getPDPAddToCartPageLocator = new PDP_AddToCart_Page_Locator() : getPDPAddToCartPageLocator;
	}
	/** Return Instance of AEM Add to Cart Page  */
	public AEM_PDP_Add_To_Cart_Page getAEMPDPAddToCartPage(WebDriver driver) {
		return (getAEMPDPAddToCartPage == null) ? getAEMPDPAddToCartPage = new AEM_PDP_Add_To_Cart_Page(driver) : getAEMPDPAddToCartPage;
	}
	/** Return Instance of AEM AddToCart Page Locator */
	public AEM_PDP_Add_To_Cart_Page_Locator getAEMPDPAddToCartPageLocator() {
		return (getAEMPDPAddToCartPageLocator == null) ? getAEMPDPAddToCartPageLocator = new AEM_PDP_Add_To_Cart_Page_Locator() : getAEMPDPAddToCartPageLocator;
	}
	/** Return Instance of AEM Broad Banner Page  */
	public AEM_Broad_Banner_Page getAEMBroadBannerPage(WebDriver driver) {
		return (getAEMBroadBannerPage == null) ? getAEMBroadBannerPage = new AEM_Broad_Banner_Page(driver) : getAEMBroadBannerPage;
	}
	/** Return Instance of AEM Broad Banner Page Locator */
	public AEM_Broad_Banner_Page_Locator getAEMBroadBannerPageLocator() {
		return (getAEMBroadBannerPageLocator == null) ? getAEMBroadBannerPageLocator = new AEM_Broad_Banner_Page_Locator() : getAEMBroadBannerPageLocator;
	}
	/** Return Instance of Broad Banner Page  */
	public Broad_Banner_Page getBroadBannerPage(WebDriver driver) {
		return (getBroadBannerPage == null) ? getBroadBannerPage = new Broad_Banner_Page(driver) : getBroadBannerPage;
	}
	/** Return Instance of Broad Banner Page Locator */
	public Broad_Banner_Page_Locator getBroadBannerPageLocator() {
		return (getBroadBannerPageLocator == null) ? getBroadBannerPageLocator = new Broad_Banner_Page_Locator() : getBroadBannerPageLocator;
	}
	/** Return Instance of AEM Edge to edge Banner Page  */
	public AEM_Edge_To_Edge_Banner_Page getAEMEdgeToEdgeBannerPage(WebDriver driver) {
		return (getAEMEdgeToEdgeBannerPage == null) ? getAEMEdgeToEdgeBannerPage = new AEM_Edge_To_Edge_Banner_Page(driver) : getAEMEdgeToEdgeBannerPage;
	}
	/** Return Instance of AEM Edge to edge Banner Page Locator */
	public AEM_Edge_To_Edge_Banner_Locator getAEMEdgeToEdgeBannerLocator() {
		return (getAEMEdgeToEdgeBannerLocator == null) ? getAEMEdgeToEdgeBannerLocator = new AEM_Edge_To_Edge_Banner_Locator() : getAEMEdgeToEdgeBannerLocator;
	}
	/** Returns Instance of AEM Get A New Triangle Rewards Card File */
	public AEM_Get_A_New_Triangle_Rewards_Card_Page getAEMANewTriangleRewardsCardPage(WebDriver driver) {
		return (getAEMANewTriangleRewardsCardPage == null) ? getAEMANewTriangleRewardsCardPage = new AEM_Get_A_New_Triangle_Rewards_Card_Page(driver) : getAEMANewTriangleRewardsCardPage;
	}
	
	/** Returns Instance of AEM Get A New Triangle Rewards Card Locator File */
	public AEM_Get_A_New_Triangle_Rewards_Card_Locator getAEMANewTriangleRewardsCardLocator() {
		return (getAEMANewTriangleRewardsCardLocator == null) ? getAEMANewTriangleRewardsCardLocator = new AEM_Get_A_New_Triangle_Rewards_Card_Locator() : getAEMANewTriangleRewardsCardLocator;
	}

	/** Returns Instance of AEM Account Address Page */
	public AEM_Account_Address_Page getAEMAccountAddressPage(WebDriver driver) {
		return (getAEMAccountAddressPage == null) ? getAEMAccountAddressPage = new AEM_Account_Address_Page(driver) : getAEMAccountAddressPage;
	}
	
	/** Returns Instance of AEM Account Address Page Locator  */
	public AEM_Account_Address_Page_Locator getAEMAccountAddressPageLocator() {
		return (getAEMAccountAddressPageLocator == null) ? getAEMAccountAddressPageLocator = new AEM_Account_Address_Page_Locator() : getAEMAccountAddressPageLocator;
	}
	/** Returns Instance of Account Address Page */
	public Account_Address_Page getAccountAddressPage(WebDriver driver) {
		return (getAccountAddressPage == null) ? getAccountAddressPage = new Account_Address_Page(driver) : getAccountAddressPage;
	}
	
	/** Returns Instance of Account Address Page Locator  */
	public Account_Address_Page_Locator getAccountAddressPageLocator() {
		return (getAccountAddressPageLocator == null) ? getAccountAddressPageLocator = new Account_Address_Page_Locator() : getAccountAddressPageLocator;
	}
	/** Returns Instance of AEM slim banner page locator */
	public AEM_Slim_Banner_page_Locator getAEMSlimBannerpageLocator() {
		return (getAEMSlimBannerpageLocator == null) ? getAEMSlimBannerpageLocator = new AEM_Slim_Banner_page_Locator() : getAEMSlimBannerpageLocator;
	}
	
	/** Returns Instance of AEM slim banner page */
	public AEM_Slim_Banner_Page getAEMSlimBannerPage(WebDriver driver) {
		return (getAEMSlimBannerPage == null) ? getAEMSlimBannerPage = new AEM_Slim_Banner_Page(driver) : getAEMSlimBannerPage;
	}
	
	/** Returns Instance of SRP Page */
	public SRP_Page getSRPPage(WebDriver driver) {
		return(getSRPPage == null) ? getSRPPage = new SRP_Page(driver) : getSRPPage;
	}
	/** Return Instance of AEM Contact Us Page */
	public AEM_Contact_Us_Page getAEMContactUsPage(WebDriver driver) {
		return (getAEMContactUsPage == null) ? getAEMContactUsPage = new AEM_Contact_Us_Page(driver) : getAEMContactUsPage;
	}
	
	/** Return Instance of AEM Contact Us Page Locator */
	public AEM_Contact_Us_Page_Locator getAEMContactUsPageLocator() {
		return (getAEMContactUsPageLocator == null) ? getAEMContactUsPageLocator = new AEM_Contact_Us_Page_Locator() : getAEMContactUsPageLocator;
	}

	/** Returns Instance of Standard Masthead Banner Page */
	public Standard_Masthead_Banner_Page getStandardMastheadBannerPage(WebDriver driver) {
		return (getStandardMastheadBannerPage == null) ? getStandardMastheadBannerPage = new Standard_Masthead_Banner_Page(driver) : getStandardMastheadBannerPage;
	}
	
	/** Returns Instance of Standard Masthead Banner Locator Page */
	public Standard_Masthead_Banner_Page_Locator getStandardMastheadBannerPageLocator() {
		return (getStandardMastheadBannerPageLocator == null) ? getStandardMastheadBannerPageLocator = new Standard_Masthead_Banner_Page_Locator() : getStandardMastheadBannerPageLocator;
	}
	
	/** Returns Instance of Account Rewards Template Page */
	public AEM_Account_Rewards_Template_Page getAccountRewardsTemplatePage(WebDriver driver) {
		return (getAccountRewardsTemplatePage == null) ? getAccountRewardsTemplatePage = new AEM_Account_Rewards_Template_Page(driver) : getAccountRewardsTemplatePage;
	}

	/** Returns Instance of Account Rewards Template Page Locator */
	public AEM_Account_Rewards_Template_Page_Locator getAccountRewardsTemplatePageLocator() {
		return (getAccountRewardsTemplatePageLocator == null) ? getAccountRewardsTemplatePageLocator = new AEM_Account_Rewards_Template_Page_Locator() : getAccountRewardsTemplatePageLocator;
	}
	
	/** Returns Instance of Contact Us Page */
	public Contact_Us_Page getContactUspage(WebDriver driver) {
		return (getContactUspage == null) ? getContactUspage = new Contact_Us_Page(driver) : getContactUspage;
	}
	
	/** Returns Instance of Contact Us Page Locator */
	public Contactus_Locator getContactUsPageLocator() {
		return (getContactUsLocator == null) ? getContactUsLocator = new Contactus_Locator() : getContactUsLocator;
	}

	/** Returns Instance of AEM Account Payment Infromation Page */
	public AEM_Account_Payment_Infromation_Page getAEMAccountPaymentInfromationPage(WebDriver driver) {
		return (getAEMAccountPaymentInfromationPage == null) ? getAEMAccountPaymentInfromationPage = new AEM_Account_Payment_Infromation_Page(driver) : getAEMAccountPaymentInfromationPage;
	}

	/** Returns Instance of AEM Account Payment Infromation Page locator */
	public AEM_Account_Payment_Infromation_Page_Locator getAEMAccountPaymentInfromationPageLocator() {
		return (getAEMAccountPaymentInfromationPageLocator == null) ? getAEMAccountPaymentInfromationPageLocator = new AEM_Account_Payment_Infromation_Page_Locator() : getAEMAccountPaymentInfromationPageLocator;
	}
	/** Returns Instance of Account Payment Information Page */
	public Account_Payment_information_Page getAccountPaymentInformationPage(WebDriver driver) {
		return (getAccountPaymentInformationPage == null) ? getAccountPaymentInformationPage = new Account_Payment_information_Page(driver) : getAccountPaymentInformationPage;
	}

	/** Returns Instance of Account Payment Infromation Page locator */
	public Account_Payment_Information_Page_Locator getAccountPaymentInformationPageLocator() {
		return (getAccountPaymentInformationPageLocator == null) ? getAccountPaymentInformationPageLocator = new Account_Payment_Information_Page_Locator() : getAccountPaymentInformationPageLocator;
	}
	/** Returns Instance of Account profile Information Page */
	public Account_Profile_Page getAccountProfilePage(WebDriver driver) {
		return (getAccountProfilePage == null) ? getAccountProfilePage = new Account_Profile_Page(driver) : getAccountProfilePage;
	}

	/** Returns Instance of Account profile Infromation Page locator */
	public Account_Profile_Page_Locator getAccountProfilePageLocator() {
		return (getAccountProfilePageLocator == null) ? getAccountProfilePageLocator = new Account_Profile_Page_Locator() : getAccountProfilePageLocator;
	}
	/** Returns Instance of AEM Account profile Information Page */
	public AEM_Account_Profile_Page getAEMAccountProfilePage(WebDriver driver) {
		return (getAEMAccountProfilePage == null) ? getAEMAccountProfilePage = new AEM_Account_Profile_Page(driver) : getAEMAccountProfilePage;
	}

	/** Returns Instance of AEM Account profile Infromation Page locator */
	public AEM_Account_Profile_Page_Locator getAEMAccountProfilePageLocator() {
		return (getAEMAccountProfilePageLocator == null) ? getAEMAccountProfilePageLocator = new AEM_Account_Profile_Page_Locator() : getAEMAccountProfilePageLocator;
	}
}
