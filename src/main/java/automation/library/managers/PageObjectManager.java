
package automation.library.managers;

import org.openqa.selenium.WebDriver;

import automation.library.common.Property;
import automation.library.datatable.Data_Map;
import automation.library.locator.Create_Your_Triangle_ID_Page_Locator;
import automation.library.locator.Email_Sent_Confirmation_Page_Locator;
import automation.library.locator.ForgotPasswordPageLocator;
import automation.library.locator.Get_Personalized_Offers_Page_Locator;
import automation.library.locator.HomePageLocator;
import automation.library.locator.Login_Page_Locator;
import automation.library.locator.Mailinator_Page_Locator;
import automation.library.locator.PDP_PageLocator;
import automation.library.locator.PLP_PageLocator;
import automation.library.locator.Privacy_Charter_Page_Locator;
import automation.library.locator.Registration_Email_Verification_Locator;
import automation.library.locator.Reset_Your_Password_Page_Locator;
import automation.library.locator.Your_Email_Has_Been_Verified_PageLocator;
import automation.library.pageObjects.Create_Your_Triangle_ID_Page;
import automation.library.pageObjects.Email_Sent_Confirmation_Page;
import automation.library.pageObjects.Forgot_Password_Page;
import automation.library.pageObjects.Get_Personalized_Offers_Page;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.Login_Page;
import automation.library.pageObjects.Mailinator_Page;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.PLP_Page;
import automation.library.pageObjects.Privacy_Charter_Page;
import automation.library.pageObjects.Registration_Email_Verification_Page;
import automation.library.pageObjects.Reset_Password_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.pageObjects.Your_Email_Has_Been_Verified_Page;
import automation.library.selenium.core.PageObject;
import automation.library.stepDefination.LogInPageSteps;

public class PageObjectManager {

	private WebDriver driver;
	private HomePage homePage;
	private PDP_Page pdpPage;
	private Sign_Up_Page signUpPage;
	private Data_Map dataMap;
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
	
	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}
	
	public PageObject getPageObject(WebDriver driver) throws Exception {

		return (pageObject == null) ? pageObject = new PageObject(driver) : pageObject;

	}

	public HomePage getHomePage() throws Exception {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}
	
	public PDP_Page getPDPPage() throws Exception {
		
		return (pdpPage == null) ? pdpPage = new PDP_Page(driver) : pdpPage;
		
	}

	public Data_Map getDataMapPage() {

		return (dataMap == null) ? dataMap = new Data_Map() : dataMap;

	}
	
	public HomePageLocator getHomePageLocator() {
		
		return (homePageLocator == null) ? homePageLocator = new HomePageLocator() : homePageLocator;
		
	}
	
	public PDP_PageLocator getPDPPageLocator() {
		
		return (pdpPageLocator == null) ? pdpPageLocator = new PDP_PageLocator() : pdpPageLocator;
		
	}
	
	public Sign_Up_Page getSignUpPage() {
		
		return (signUpPage == null) ? signUpPage = new Sign_Up_Page(driver) : signUpPage;
		
	}
	
	public PLP_Page getPLPPage() throws Exception {
		
		return (plpPage == null) ? plpPage = new PLP_Page(driver) : plpPage;
		
	}
	
	public PLP_PageLocator getPLPLocatorPage() {
		
		return (plpPageLocator == null) ? plpPageLocator = new PLP_PageLocator() : plpPageLocator;
		
	}
	
	public Create_Your_Triangle_ID_Page_Locator getCreateTriangleIDPageLocatorPage() {
		
		return (createYourTriangleIDPageLocator == null) ? createYourTriangleIDPageLocator = new Create_Your_Triangle_ID_Page_Locator() : createYourTriangleIDPageLocator;
		
	}
	
	public Create_Your_Triangle_ID_Page getCreateTirangleIDPage(WebDriver driver) {
		
		return (createYourTrianglePage == null) ? createYourTrianglePage = new Create_Your_Triangle_ID_Page(driver) : createYourTrianglePage;
		
	}
	
	public Registration_Email_Verification_Page getRegistrationEmailVerificationPage(WebDriver driver) {
		
		return (registrationEmailVerificationPage == null) ? registrationEmailVerificationPage = new Registration_Email_Verification_Page(driver) : registrationEmailVerificationPage;
		
	}
	
	public Registration_Email_Verification_Locator getRegistrationEmailVerificationLocator() {
		
		return (registrationEmailVerificationLocator == null) ? registrationEmailVerificationLocator = new Registration_Email_Verification_Locator() : registrationEmailVerificationLocator;
		
	}
	
   public Get_Personalized_Offers_Page getPersonalizedOffersPage(WebDriver driver) {
		
		return (getPersonalizedOffersPage == null) ? getPersonalizedOffersPage = new Get_Personalized_Offers_Page(driver) : getPersonalizedOffersPage;
		
	}
	
	public Get_Personalized_Offers_Page_Locator getPersonalizedOffersLocator() {
		
		return (getPersonalizedOffersLocator == null) ? getPersonalizedOffersLocator = new Get_Personalized_Offers_Page_Locator() : getPersonalizedOffersLocator;
		
	}
	
	public Email_Sent_Confirmation_Page getEmailSentConfirmationPage(WebDriver driver) {
		
		return (getEmailSentConfirmationPage == null) ? getEmailSentConfirmationPage = new Email_Sent_Confirmation_Page(driver) : getEmailSentConfirmationPage;
		
	}
	
	public Email_Sent_Confirmation_Page_Locator getEmailSentConfirmationLocator() {
		
		return (getEmailSentConfirmationLocator == null) ? getEmailSentConfirmationLocator = new Email_Sent_Confirmation_Page_Locator() : getEmailSentConfirmationLocator;
		
	}
	
	public Mailinator_Page getMailinatorPage() {
		
		return (getMailinatorPage == null) ? getMailinatorPage = new Mailinator_Page(driver) : getMailinatorPage;
		
	}
	
	public Mailinator_Page_Locator getMailinatorPageLocator() {
		
		return (getMailinatorPageLocator == null) ? getMailinatorPageLocator = new Mailinator_Page_Locator() : getMailinatorPageLocator;
		
	}
	
	public Login_Page getLoginPage() {
		
		
		return (loginPage == null) ? loginPage = new Login_Page(driver) : loginPage;
	}
	
	public Login_Page_Locator getLoginPageLocator() {
		
		return (loginPageLocator == null) ? loginPageLocator = new Login_Page_Locator() : loginPageLocator;
		
	}
	
	public Forgot_Password_Page getForgotPasswordPage(WebDriver driver) {
		
		return (getForgotPasswordPage == null) ? getForgotPasswordPage = new Forgot_Password_Page(driver) : getForgotPasswordPage;
		
	}
	
	public ForgotPasswordPageLocator getForgotPasswordLocator() {
		
		return (getForgotPasswordLocator == null) ? getForgotPasswordLocator = new ForgotPasswordPageLocator() : getForgotPasswordLocator;
		
	}
	
	public Your_Email_Has_Been_Verified_Page getYourEmailHasBeenVerifiedPage(WebDriver driver) {
		return (getYourEmailHasBeenVerifiedPage == null) ? getYourEmailHasBeenVerifiedPage = new Your_Email_Has_Been_Verified_Page(driver) : getYourEmailHasBeenVerifiedPage;
	}
	
	public Your_Email_Has_Been_Verified_PageLocator getYourEmailHasBeenVerifiedLocator() {
		return (getYourEmailHasBeenVerifiedLocator == null) ? getYourEmailHasBeenVerifiedLocator = new Your_Email_Has_Been_Verified_PageLocator() : getYourEmailHasBeenVerifiedLocator;
	}
	
	public Privacy_Charter_Page getPrivacyPage() {
		return (getPrivacyCharterPage == null) ? getPrivacyCharterPage = new Privacy_Charter_Page(driver) : getPrivacyCharterPage;
	}
	
	public Privacy_Charter_Page_Locator getPrivacyPageLocator() {
		return (getPrivacyCharterLocator == null) ? getPrivacyCharterLocator = new Privacy_Charter_Page_Locator() : getPrivacyCharterLocator;
	}
	
	public Reset_Password_Page getResetPasswordPage() {
		return (getResetPasswordPage == null) ? getResetPasswordPage = new Reset_Password_Page(driver) : getResetPasswordPage;
	}
	
	public Reset_Your_Password_Page_Locator getResetPasswordLocatorPage() {
		return (getPrivacyCharterLocator == null) ? getResetPassword_Page_Locator = new Reset_Your_Password_Page_Locator() : getResetPassword_Page_Locator;
	}
 	
	


}