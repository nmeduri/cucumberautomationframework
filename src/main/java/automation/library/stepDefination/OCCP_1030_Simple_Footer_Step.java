package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
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
 * This file contains the scenario of user stories OCCP-1030
 */
public class OCCP_1030_Simple_Footer_Step extends BaseClass {

	Footer_Page footerPage;
	public OCCP_1030_Simple_Footer_Step(TestContext context) throws Exception {
		testContext = context;
		footerPage = testContext.getPageObjectManager().getFooterPage();
		configFileReader = new ConfigFileReader();
	
	}
	
	@Then("ligal disclaimer is displayed")
	public void legal_disclaimer_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayLegalDisclaimer();		
	}
	
	@And("click on view more")
	public void click_on_view_more() throws Exception {
		testContext.getPageObjectManager().getFooterPage().clickViewMore();
	}
	
	@Then("legal disclaimer should be expanded and the rest of the text should be displayed")
	public void legal_desclaimer_should_be_expanded() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayRestOfLegalDisclaimer();
	}
	
	@Then("view less is displayed")
	public void view_less_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayViewLess();
	}
	
	@Then("view more should not be displayed")
	public void view_more_should_not_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().notDisplayViewMore();
	}
	
	@Then("first three lines of the authored legal disclaimer text should be displayed")
	public void first_three_lines_of_the_authored_legal_disclaimer_text_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayThreeLinesLegalDisclaimer();
	}
	
	@Then("first 3 lines of the authored legal disclaimer text should be displayed in mobile")
	public void first_three_lines_of_the_disclaimer_text_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayThreeLinesLegalDisclaimerMobile();
	}
	
	@Then("editable clickable text legal is displayed")
	public void editable_clickable_text_legal_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextLegal();
	}
	
	@Then("link legal should be underlined")
	public void link_should_be_undelined() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextLegal();
	}
	
	@Then("editable clickable text Terms and conditions is displayed")
	public void editable_clickable_text_terms_and_conditions_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextTermsAndConditions();
	}
	
	@Then("link terms and conditions should be underlined")
	public void link_terms_and_conditions_should_be_underlined() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextTermsAndConditions();
	}
	
	@Then("editable clickable text privacy and policy is displayed")
	public void editable_clickable_text_pricacy_and_policy_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextPrivacyAndPolicy();
	}
	
	@Then("link privacy and policy should be underlined")
	public void link_privacy_and_policy_should_be_underlined() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextPrivacyAndPolicy();
	}
	
	@Then("editable clickable text site map is displayed")
	public void editable_clickable_text_site_map_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextSiteMap();
	}
	
	@Then("link site map should be underlined")
	public void link_site_map_should_be_underlined() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextSiteMap();
	}
	
	@Then("editable clickable text accessibility is displayed")
	public void editable_clickable_text_accessbility_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextAccessibility();
	}
	
	@Then("link accessibility should be underlined")
	public void link_accessibility_should_be_underlined() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextAccessibility();
	}
	
	@And("in simple footer access and click on accessibility")
	public void in_simple_footer_access_and_click_on_accessibility() throws Exception {
		testContext.getPageObjectManager().getFooterPage().clickOnAccessibility();
	}
	
	@And("in simple footer access and click on legal")
	public void in_simple_footer_access_and_click_on_legal() throws Exception {
		testContext.getPageObjectManager().getFooterPage().clickOnlegal();
	}
	
	@Then("editable clickable text view more is displayed")
	public void editable_clickable_text_view_more_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableViewMore();
	}
	
	@Then("view more is displayed")
	public void view_more_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayViewMore();
	}
	
	@Then("editable clickable text view less is displayed")
	public void editable_clickable_text_view_less_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableViewLess();
	}
	
	@Then("copy right text is displayed")
	public void copy_right_text_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayCopyRight();
	}
	
	@Then("user should be navigated to the page where detailed accessibility information is displayed")
	public void user_should_be_navigated_to_the_page_where_detailed_accessibility_information_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().verifyLinkNavigateOnAccessibility();
	}
	
	@Then("in footer access and click on text and conditions")
	public void in_footer_access_and_click_on_text_and_conditions() throws Exception {
		testContext.getPageObjectManager().getFooterPage().clickOnTermsAndConditions();
	}
	
	@Then("user navigate to the page where detailed terms and conditions information is displayed")
	public void user_navigate_to_the_page_where_detailed_terms_and_conditions_information_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().verifyLinkNavigateOnTermsAndConditions();
	}
	
	@Then("user should be navigate on legal information")
	public void user_should_be_navigate_on_legal_information() throws Exception {
		testContext.getPageObjectManager().getFooterPage().verifyLinkNavigateOnLegalInformation();
	}
	
	@And("complete disclaimer text should not be displayed")
	public void complete_disclaimer_text_should_not_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().notDisplayRestOfLegalDisclaimer();
	}
	
	@And("click on privacy policy")
	public void click_on_privacy_policy() throws Exception {
		testContext.getPageObjectManager().getFooterPage().clickPrivacyPolicy();
	}
	
	@Then("user navigate on privacy policy page where detailed privacy policy information is displayed")
	public void user_navigate_on_privacy_policy_page_where_detailed_privacy_policy_information_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().verifyLinkNavigateOnPrivacyPolicy();
	}
	
	@And("in simple footer and click on site map")
	public void in_simple_footer_and_click_on_site_map() throws Exception {
		testContext.getPageObjectManager().getFooterPage().clickSiteMap();
	}
	
	@Then("user is navigate on site map page where detailed site map information is displayed")
	public void user_is_navigate_on_site_map_page_where_detailed_site_map_information_is_displayed() throws Exception {
		
	}
	
	
}
