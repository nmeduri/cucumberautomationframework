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


public class OCCP_1027_Footer_Links_Step extends BaseClass {

	Footer_Page footerPage;
	public OCCP_1027_Footer_Links_Step(TestContext context) throws Exception {
		testContext = context;
		footerPage = testContext.getPageObjectManager().getFooterPage();
		configFileReader = new ConfigFileReader();
	
	}
	
	@And("customer support section is displayed")
	public void customer_support_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayCustomSupport();	
	}
	
	@And("services and solutions section is displayed")
	public void services_and_solutions_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displaySolutionsAndServices();
	}
	
	@And("about us section is displayed")
	public void about_us_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayAboutUs();
	}
	
	@And("legal section is displayed")
	public void legal_section_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayLegalSection();
	}
	
	@Then("scroll down to footer")
	public void scroll_down_to_mobile_footer() throws Exception {
		testContext.getPageObjectManager().getFooterPage().scrollDownToFooter();	
	}
	
	@And("clickable text link for order status is displayed")
	public void clickable_order_status_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableOrderStatus();
	}
	
	@And("clickable text link for pickup & delivery is displayed")
	public void clickable_pickup_and_delivery_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickablePickupAndDelivery();
	}
	
	@And("clickable text link for returns & exchanges is displayed")
	public void clickable_returns_and_exchanges_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableReturnsAndExchanges();
	}
	
	@And("clickable text link for help & faqs is displayed")
	public void clickable_help_and_faqs_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableHelpAndFaqs();
	}
	
	@And("clickable text link for contact us is displayed")
	public void clickable_contact_us_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableContactUs();
	}
	
	@And("clickable text link for store locator is displayed")
	public void clickable_store_locator_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableStoreLocator();
	}
	
	@And("clickable text link for product recalls is displayed")
	public void clickable_product_recalls_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableProductRecalls();
	}
	
	@And("clickable text link for safety data sheets is displayed")
	public void clickable_safety_data_sheets_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableSafetyDataSheets();
	}
	
	@And("clickable text link for canadian tires financial services is displayed")
	public void clickable_canadian_tires_financial_services_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableCanadianTiresFinancialServices();
	}
	
	@And("clickable text link for installation & assembling is displayed")
	public void clickable_installation_and_assembling_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableInstallationAndAssembling();
	}
	
	@And("clickable text link for auto service centre is displayed")
	public void clickable_auto_service_center_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableAutoServiceCenter();
	}
	
	@And("clickable text link for loan-a-tool is displayed")
	public void clickable_loan_a_tool_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableLoanATool();
	}
	
	@And("clickable text link for roadside assistance is displayed")
	public void clickable_roadside_assistance_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableRoadsideAssistance();
	}
	
	@And("clickable text link for gift cards is displayed")
	public void clickable_gift_cards_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableGiftCards();
	}
	
	@And("clickable text link for tested for life is displayed")
	public void clickable_tested_for_life_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableTestedForLife();
	}
	
	@And("clickable text link for gift registry is displayed")
	public void clickable_gift_registry_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableGiftRegistry();
	}
	
	@And("clickable text link for about canadian tire is displayed")
	public void clickable_about_canadian_tire_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableaboutCanadianTire();
	}
	
	@And("clickable text link for careers is displayed")
	public void clickable_careers_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableCareers();
	}
	
	@And("clickable text link for about triangle id is displayed")
	public void clickable_about_triangle_id__is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableAboutTriangleId();
	}
	
	@And("clickable text link for recycling information is displayed")
	public void clickable_recycling_information_registry_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableRecyclingInformation();
	}
	
	@And("clickable text link for our brands is displayed")
	public void clickable_our_brands_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableOurBrands();
	}
	
	@And("clickable text link for flyer sign up is displayed")
	public void clickable_flyer_sign_up_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableFlyerSignUp();
	}
	
	@And("clickable text link for sustainability is displayed")
	public void clickable_sustainability_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableSustainability();
	}
	

	@And("clickable text link for privacy policy is displayed")
	public void clickable_privacy_policy_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickablePrivacyPolicy();
	}
	
	@And("clickable text link for terms & conditions is displayed")
	public void clickable_termss_and_conditions_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableTermsAndConditions();
	}
	
	@And("clickable text link for site map is displayed")
	public void clickable_sitemap_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableSiteMap();
	}
	
	@And("clickable text link for accessibility is displayed")
	public void clickable_Accessibility_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickableAccessability();
	}
	
	@And("clickable text link for pricing policy is displayed")
	public void clickable_pricing_policy_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayclickablePricingPolicy();
	}
	
	@And("user clicks on Custom Support 'plus' section")
	public void click_on_custom_support_plus_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage().clickCustomSupportPlusButton();
	}
	
	@Then("sub section should expand to display below links")
	public void subsection_should_expand_to_display_links() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displaySubsectionLinks();	
	}
	
	@Then("the 'plus' sign is replaced by 'minus' sign")
	public void plus_should_be_replaced_by_minus() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayMinusButton();
	}
	
	@Then("collapsed headers are displayed with 'plus' sign")
	public void display_collapsed_headers_with_plus_sign() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayPlusSign();
	}
	
	@And("user clicks on services and solutions 'plus' section")
	public void click_on_services_and_solutions_plus_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage().clickServicesAndSolutionPlusButton();
	}
	
	@And("user clicks on about us 'plus' section")
	public void click_on_about_us_plus_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage().clickAboutUsPlusButton();
	}
	
	@And("user clicks on legal 'plus' section")
	public void click_on_legal_plus_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage().clickLegalPlusButton();
	}
	
	
	
	
}



