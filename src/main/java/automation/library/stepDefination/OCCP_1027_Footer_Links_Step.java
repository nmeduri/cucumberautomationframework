package automation.library.stepDefination;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
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
 * This file contains the scenario of user stories OCCP-1027
 */
public class OCCP_1027_Footer_Links_Step extends BaseClass {

	public OCCP_1027_Footer_Links_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	
	}
	
	@And("customer support section is displayed")
	public void customer_support_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayCustomSupport();	
	}
	
	@And("services and solutions section is displayed")
	public void services_and_solutions_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displaySolutionsAndServices();
	}
	
	@And("about us section is displayed")
	public void about_us_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayAboutUs();
	}
	
	@And("legal section is displayed")
	public void legal_section_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayLegalSection();
	}
	
	@Then("scroll down to footer")
	public void scroll_down_to_footer() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).scrollDownToFooter();	
	}
	
	@Then("scroll down to mobile footer")
	public void scroll_down_to_mobile_footer() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).scrollDownToMobileFooter();	
	}
	
	@And("clickable text link for order status is displayed")
	public void clickable_order_status_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableOrderStatus();
	}
	
	@And("clickable text link for pickup & delivery is displayed")
	public void clickable_pickup_and_delivery_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickablePickupAndDelivery();
	}
	
	@And("clickable text link for returns & exchanges is displayed")
	public void clickable_returns_and_exchanges_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableReturnsAndExchanges();
	}
	
	@And("clickable text link for help & faqs is displayed")
	public void clickable_help_and_faqs_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableHelpAndFaqs();
	}
	
	@And("clickable text link for contact us is displayed")
	public void clickable_contact_us_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableContactUs();
	}
	
	@And("clickable text link for store locator is displayed")
	public void clickable_store_locator_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableStoreLocator();
	}
	
	@And("clickable text link for product recalls is displayed")
	public void clickable_product_recalls_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableProductRecalls();
	}
	
	@And("clickable text link for safety data sheets is displayed")
	public void clickable_safety_data_sheets_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableSafetyDataSheets();
	}
	
	@And("clickable text link for canadian tires financial services is displayed")
	public void clickable_canadian_tires_financial_services_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableCanadianTiresFinancialServices();
	}
	
	@And("clickable text link for installation & assembling is displayed")
	public void clickable_installation_and_assembling_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableInstallationAndAssembling();
	}
	
	@And("clickable text link for auto service centre is displayed")
	public void clickable_auto_service_center_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableAutoServiceCenter();
	}
	
	@And("clickable text link for loan-a-tool is displayed")
	public void clickable_loan_a_tool_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableLoanATool();
	}
	
	@And("clickable text link for roadside assistance is displayed")
	public void clickable_roadside_assistance_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableRoadsideAssistance();
	}
	
	@And("clickable text link for gift cards is displayed")
	public void clickable_gift_cards_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableGiftCards();
	}
	
	@And("clickable text link for tested for life is displayed")
	public void clickable_tested_for_life_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableTestedForLife();
	}
	
	@And("clickable text link for gift registry is displayed")
	public void clickable_gift_registry_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableGiftRegistry();
	}
	
	@And("clickable text link for about canadian tire is displayed")
	public void clickable_about_canadian_tire_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableaboutCanadianTire();
	}
	
	@And("clickable text link for careers is displayed")
	public void clickable_careers_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableCareers();
	}
	
	@And("clickable text link for about triangle id is displayed")
	public void clickable_about_triangle_id__is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableAboutTriangleId();
	}
	
	@And("clickable text link for recycling information is displayed")
	public void clickable_recycling_information_registry_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableRecyclingInformation();
	}
	
	@And("clickable text link for our brands is displayed")
	public void clickable_our_brands_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableOurBrands();
	}
	
	@And("clickable text link for flyer sign up is displayed")
	public void clickable_flyer_sign_up_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableFlyerSignUp();
	}
	
	@And("clickable text link for sustainability is displayed")
	public void clickable_sustainability_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableSustainability();
	}
	

	@And("clickable text link for privacy policy is displayed")
	public void clickable_privacy_policy_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickablePrivacyPolicy();
	}
	
	@And("clickable text link for terms & conditions is displayed")
	public void clickable_termss_and_conditions_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableTermsAndConditions();
	}
	
	@And("clickable text link for site map is displayed")
	public void clickable_sitemap_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableSiteMap();
	}
	
	@And("clickable text link for accessibility is displayed")
	public void clickable_Accessibility_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickableAccessability();
	}
	
	@And("clickable text link for pricing policy is displayed")
	public void clickable_pricing_policy_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayclickablePricingPolicy();
	}
	
	@And("user clicks on Custom Support 'plus' section")
	public void click_on_custom_support_plus_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickCustomSupportPlusButton();
	}
	
	@Then("sub section should expand to display below links")
	public void subsection_should_expand_to_display_links() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displaySubsectionLinks();	
	}
	
	@Then("the 'plus' sign is replaced by 'minus' sign")
	public void plus_should_be_replaced_by_minus() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayMinusButton();
	}
	
	@Then("collapsed headers are displayed with 'plus' sign")
	public void display_collapsed_headers_with_plus_sign() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayPlusSign();
	}
	
	@And("user clicks on services and solutions 'plus' section")
	public void click_on_services_and_solutions_plus_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickServicesAndSolutionPlusButton();
	}
	
	@And("user clicks on about us 'plus' section")
	public void click_on_about_us_plus_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickAboutUsPlusButton();
	}
	
	@And("user clicks on legal 'plus' section")
	public void click_on_legal_plus_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickLegalPlusButton();
	}
	
	@And("user clicks on custom support 'minus' section")
	public void click_on_custom_support_minus_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickMinusButton();
	}
	
	@Then("the sub section should be collapsed to the original view and expanded sub-section links should not be displayed")
	public void custom_support_section_should_collapse_and_links_should_not_display() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).NotdisplaySubsectionLinks();
	}
	
	@And("the 'plus' sign should be displayed instead of 'minus' sign")
	public void plus_should_be_displayed_instead_of_minus() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayCustomSupportPlusButton();
	}
	
	@And("user clicks on the section headers name Customer Support")
	public void click_on_custom_support_header_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickableCustomSupportHeader();
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayCustomSupportPlusButton();
	}

	@And("user clicks on the section headers name Services & Solutions")
	public void click_on_services_and_solutions_header_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickableServicesAndSolutionsHeader();
	}
	
	@And("user clicks on the section header name About Us")
	public void click_on_about_us_header_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickableAboutUsHeader();
	}
	
	@And("user clicks on the section header name Legal")
	public void click_on_legal_header_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickableLegalHeader();
	}

	@And("in footer links under custom support section access and click on order status")
	public void click_on_order_status_() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnOrderStatus();
	}	
	
	@Then("user should be navigate to defined associated page")
	public void user_navigate_to_associate_page() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyLinkNavigateToAssociatedPage();
	}
	
	@And("user navigates back to to previous page")
	public void navigate_back_to_previous_page() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyNavigateBack();
	}
	
	@And("in footer links under custom support section access and click on pickup & delivery")
	public void click_on_pickup_and_delivery() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnPickUpAndDelivery();
	}	
	
	@And("in footer links under custom support section access and click on returns & exchanges")
	public void click_on_returns_and_exchanges() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnReturnsAndExchanges();
	}	
	
	@And("in footer links under custom support section access and click on help & faqs")
	public void click_on_help_and_faqs() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnHelpAndFaqs();
	}	
	
	@And("in footer links under custom support section access and click on contact us")
	public void click_on_contact_us() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnContactUs();
	}	
	
	@And("in footer links under custom support section access and click on store locator")
	public void click_on_store_locator() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnStoreLocator();
	}
	
	@And("in footer links under custom support section access and click on product recalls")
	public void click_on_product_recalls() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnProductRecalls();
	}
	
	@And("in footer links under custom support section access and click on safety data sheets")
	public void click_on_safety_data_sheets() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnSafetyDataSheets();
	}
	
	@And("in footer links under services and solutions section access and click on canadian tires financial services")
	public void click_on_canadian_tires_financial_services() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnCanadianTiresFinancialServices();
	}
	
	@And("in footer links under services and solutions section access and click on installation & assembling")
	public void click_on_installation_and_assembling() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnInstallationAndAssembling();
	}
	
	@And("in footer links under services and solutions section access and click on auto service center")
	public void click_on_auto_service_center() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnAutoServiceCenter();
	}
	
	@And("in footer links under services and solutions section access and click on loan-a-tool")
	public void click_on_loan_a_tool() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnLoanATool();
	}
	
	@And("in footer links under services and solutions section access and click on roadside assistance")
	public void click_on_roadside_assistance() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnRoadsideAssistance();
	}
	
	@And("in footer links under services and solutions section access and click on gift cards")
	public void click_on_gift_cards() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnTestedForLife();
	}
	
	@And("in footer links under services and solutions section access and click on tested for life")
	public void click_on_tested_for_life() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnTestedForLife();
	}
	
	@And("in footer links under services and solutions section access and click on gift registry")
	public void click_on_gift_registry() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnGiftRegistry();
	}
	
	@And("in footer links under about us section access and click on about canadian tire")
	public void click_on_about_canadian_tire() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnAboutCanadianTire();
	}
	
	@And("in footer links under about us section access and click on careers")
	public void click_on_careers() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnCareers();
	}
	
	@And("in footer links under about us section access and click on about triangle id")
	public void click_on_about_triangle_id() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnAboutTriangleID();
	}
	
	@And("in footer links under about us section access and click on recycling information")
	public void click_on_recycling_information() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnRecyclingInformation();
	}
	
	@And("in footer links under about us section access and click on our brands")
	public void click_on_our_brands() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnOurBrands();
	}
	
	@And("in footer links under about us section access and click on flyer sign up")
	public void click_on_flyer_sign_up() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnFlyerSignUp();
	}
	
	@And("in footer links under about us section access and click on sustainability")
	public void click_on_sustainability() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnSustainability();
	}
	
	@And("in footer links under legal section access and click on privacy policy")
	public void click_on_privacy_policy() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnPrivacyPolicyLink();
	}
	
	@And("in footer links under legal section access and click on terms & conditions")
	public void click_on_terms_and_conditions() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnTermsAndConditionsLink();
	}
	
	@And("in footer links under legal section access and click on site map")
	public void click_on_site_map() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnSiteMapLink();
	}
	
	@And("in footer links under legal section access and click on accessibility")
	public void click_on_accessibility() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnAccessibilityLink();
	}
	
	@And("in footer links under legal section access and click on pricing policy")
	public void click_on_pricing_policy() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnPricingPolicy();
	}
	
	
	
	
}



