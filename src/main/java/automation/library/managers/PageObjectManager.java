
package automation.library.managers;

import org.openqa.selenium.WebDriver;

import automation.library.common.Property;
import automation.library.locator.Account_Options_Page_Locator;
import automation.library.locator.Create_Your_Triangle_ID_Page_Locator;
import automation.library.locator.Email_Sent_Confirmation_Page_Locator;
import automation.library.locator.Footer_PageLocator;
import automation.library.locator.ForgotPasswordPageLocator;
import automation.library.locator.Get_A_New_Triangle_Rewards_Card_Locator;
import automation.library.locator.Get_Personalized_Offers_Page_Locator;
import automation.library.locator.Gigya_Api_Tool_Page_Locator;
import automation.library.locator.Header_Page_Locator;
import automation.library.locator.HomePageLocator;
import automation.library.locator.Link_Rewards_Options_Page_Locator;
import automation.library.locator.Link_reward_ProfileScreen_page_Locator;
import automation.library.locator.Link_Your_Existing_Triangle_Rewards_Card_PageLocator;
import automation.library.locator.Link_Your_Triangle_Rewards_Account_Locator;
import automation.library.locator.Login_Page_Locator;
import automation.library.locator.Mailinator_Page_Locator;
import automation.library.locator.PDP_PageLocator;
import automation.library.locator.PLP_PageLocator;
import automation.library.locator.Primary_Navigation_Page_Locator;
import automation.library.locator.Privacy_Charter_Page_Locator;
import automation.library.locator.Registration_Email_Verification_Locator;
import automation.library.locator.Reset_Your_Password_Page_Locator;
import automation.library.locator.Rewards_Terms_Conditions_Page_Locator;
import automation.library.locator.Your_Email_Has_Been_Verified_PageLocator;
import automation.library.pageObjects.Account_Options_Page;
import automation.library.pageObjects.Create_Your_Triangle_ID_Page;
import automation.library.pageObjects.Email_Sent_Confirmation_Page;
import automation.library.pageObjects.Footer_Page;
import automation.library.pageObjects.Forgot_Password_Page;
import automation.library.pageObjects.Get_A_New_Triangle_Rewards_Card_Page;
import automation.library.pageObjects.Get_Personalized_Offers_Page;
import automation.library.pageObjects.Gigya_Api_Tool_Page;
import automation.library.pageObjects.Header_Page;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.Link_Rewards_Options_Page;
import automation.library.pageObjects.Link_reward_ProfileScreen_page;
import automation.library.pageObjects.Link_Your_Existing_Triangle_Rewards_Card_Page;
import automation.library.pageObjects.Link_Your_Triangle_Rewards_account_Page;
import automation.library.pageObjects.Login_Page;
import automation.library.pageObjects.Mailinator_Page;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.PLP_Page;
import automation.library.pageObjects.Primary_Navigation_Page;
import automation.library.pageObjects.Privacy_Charter_Page;
import automation.library.pageObjects.Registration_Email_Verification_Page;
import automation.library.pageObjects.Reset_Password_Page;
import automation.library.pageObjects.Rewards_Terms_Conditions_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.pageObjects.Your_Email_Has_Been_Verified_Page;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.manager.Local_Chrome_Driver_Manager;
import automation.library.stepDefination.LogInPageSteps;

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
	private Account_Options_Page getAccount_Options_Page;
	private Account_Options_Page_Locator getAccount_Options_Page_Locator;
	private Link_Rewards_Options_Page getLinkRewardsOptsPage;
	private Link_Rewards_Options_Page_Locator getLinkRewardsOptsPageLocator;
	
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
	
	/** Returns Instance of Account Options Page File */
	public Account_Options_Page getAccount_Options_Page() {
		return (getAccount_Options_Page == null) ? getAccount_Options_Page = new Account_Options_Page(driver) : getAccount_Options_Page; 
	}
	
	/** Returns Instance of Account Options Page Locator File */
	public Account_Options_Page_Locator getAccount_Options_Page_Locator() {
		return (getAccount_Options_Page_Locator == null) ? getAccount_Options_Page_Locator = new Account_Options_Page_Locator() : getAccount_Options_Page_Locator; 
	}


	/** Returns Instance of Link Rewards Options Account Locator File */
	public Link_Rewards_Options_Page getLinkRewardsOptionsPage() {
		return (getLinkRewardsOptsPage == null) ? getLinkRewardsOptsPage = new Link_Rewards_Options_Page(driver) : getLinkRewardsOptsPage;
	}
	
	/** Returns Instance of Link Rewards Options Account Locator File*/
	public Link_Rewards_Options_Page_Locator getLinkRewardsOptionsPageLocator() {
		return (getLinkRewardsOptsPageLocator == null) ? getLinkRewardsOptsPageLocator =new Link_Rewards_Options_Page_Locator() : getLinkRewardsOptsPageLocator;
	}
	/** Returns Instance of Gigya Api Tool file */
	public Gigya_Api_Tool_Page getGigyaApiToolPage() {
		return (gigyaApiToolPage == null) ? gigyaApiToolPage = new Gigya_Api_Tool_Page(driver) : gigyaApiToolPage;
	}
	/** Returns Instance of Gigya Api Tool file Locator File*/
	public Gigya_Api_Tool_Page_Locator getGigyaApiToolPageLocator() {
		return (gigyaApiToolPage_Locator == null) ? gigyaApiToolPage_Locator =new Gigya_Api_Tool_Page_Locator() : gigyaApiToolPage_Locator;
	}
}