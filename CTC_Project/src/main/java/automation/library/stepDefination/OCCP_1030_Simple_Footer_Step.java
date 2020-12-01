package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

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
 * This file contains the scenario of user stories OCCP-1030
 */
public class OCCP_1030_Simple_Footer_Step extends BaseClass {

	public OCCP_1030_Simple_Footer_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	
	}
	
	@Then("ligal disclaimer is displayed")
	public void legal_disclaimer_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayLegalDisclaimer();		
	}
	
	@And("click on view more")
	public void click_on_view_more() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickViewMore();
	}
	
	@Then("legal disclaimer should be expanded and the rest of the text should be displayed")
	public void legal_desclaimer_should_be_expanded() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayRestOfLegalDisclaimer();
	}
	
	@Then("view less is displayed")
	public void view_less_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayViewLess();
	}
	
	@Then("view more should not be displayed")
	public void view_more_should_not_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).notDisplayViewMore();
	}
	
	@Then("first three lines of the authored legal disclaimer text should be displayed")
	public void first_three_lines_of_the_authored_legal_disclaimer_text_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayThreeLinesLegalDisclaimer();
	}
	
	@Then("first 3 lines of the authored legal disclaimer text should be displayed in mobile")
	public void first_three_lines_of_the_disclaimer_text_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayThreeLinesLegalDisclaimerMobile();
	}
	
	@Then("editable clickable text legal is displayed")
	public void editable_clickable_text_legal_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextLegal();
	}
	
	@Then("link legal should be underlined")
	public void link_should_be_undelined() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextLegal();
	}
	
	@Then("editable clickable text Terms and conditions is displayed")
	public void editable_clickable_text_terms_and_conditions_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextTermsAndConditions();
	}
	
	@Then("link terms and conditions should be underlined")
	public void link_terms_and_conditions_should_be_underlined() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextTermsAndConditions();
	}
	
	@Then("editable clickable text privacy and policy is displayed")
	public void editable_clickable_text_pricacy_and_policy_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextPrivacyAndPolicy();
	}
	
	@Then("link privacy and policy should be underlined")
	public void link_privacy_and_policy_should_be_underlined() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextPrivacyAndPolicy();
	}
	
	@Then("editable clickable text site map is displayed")
	public void editable_clickable_text_site_map_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextSiteMap();
	}
	
	@Then("link site map should be underlined")
	public void link_site_map_should_be_underlined() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextSiteMap();
	}
	
	@Then("editable clickable text accessibility is displayed")
	public void editable_clickable_text_accessbility_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextAccessibility();
	}
	
	@Then("link accessibility should be underlined")
	public void link_accessibility_should_be_underlined() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextAccessibility();
	}
	
	@And("in simple footer access and click on accessibility")
	public void in_simple_footer_access_and_click_on_accessibility() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnAccessibility();
	}
	
	@And("in simple footer access and click on legal text")
	public void in_simple_footer_access_and_click_on_legal() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnlegal();
	}
	
	@Then("editable clickable text view more is displayed")
	public void editable_clickable_text_view_more_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableViewMore();
	}
	
	@Then("view more is displayed")
	public void view_more_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayViewMore();
	}
	
	@Then("editable clickable text view less is displayed")
	public void editable_clickable_text_view_less_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableViewLess();
	}
	
	@Then("copy right text is displayed")
	public void copy_right_text_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayCopyRight();
	}
	
	@Then("user should be navigated to the page where detailed accessibility information is displayed")
	public void user_should_be_navigated_to_the_page_where_detailed_accessibility_information_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyLinkNavigateOnAccessibility();
	}
	
	@Then("in footer access and click on text and conditions")
	public void in_footer_access_and_click_on_text_and_conditions() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnTermsAndConditions();
	}
	
	@Then("user navigate to the page where detailed terms and conditions information is displayed")
	public void user_navigate_to_the_page_where_detailed_terms_and_conditions_information_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyLinkNavigateOnTermsAndConditions();
	}
	
	@Then("user should be navigate on legal information")
	public void user_should_be_navigate_on_legal_information() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyLinkNavigateOnLegalInformation();
	}
	
	@And("complete disclaimer text should not be displayed")
	public void complete_disclaimer_text_should_not_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).notDisplayRestOfLegalDisclaimer();
	}
	
	@And("click on privacy policy")
	public void click_on_privacy_policy() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickPrivacyPolicy();
	}
	
	@Then("user navigate on privacy policy page where detailed privacy policy information is displayed")
	public void user_navigate_on_privacy_policy_page_where_detailed_privacy_policy_information_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyLinkNavigateOnPrivacyPolicy();
	}
	
	@And("in simple footer and click on site map")
	public void in_simple_footer_and_click_on_site_map() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickSiteMap();
	}
	
	@Then("user is navigate on site map page where detailed site map information is displayed")
	public void user_is_navigate_on_site_map_page_where_detailed_site_map_information_is_displayed() throws Exception {
		
	}
	
	@Then("clickable text Terms and conditions is displayed")
	public void clickable_text_terms_and_conditions_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextTermsAndConditionsMobile();
	}
	
	@Then("clickable text privacy and policy is displayed")
	public void clickable_text_pricacy_and_policy_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextPrivacyAndPolicyMobile();
	}
	
	@Then("clickable text site map is displayed")
	public void clickable_text_site_map_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextSiteMapMobile();
	}
	
	@Then("clickable text accessibility is displayed")
	public void clickable_text_accessbility_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextAccessibilityMobile();
	}
	
	@Then("clickable text view more is displayed")
	public void clickable_text_view_more_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableTextAccessibilityMobile();
	}
	
	@Then("clickable text view less is displayed")
	public void clickable_text_view_less_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayEditableViewLessMobile();
	}
	@Then("scroll down to AEM footer")
	public void scroll_down_to_AEM_footer() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).scrollDownToAEMFooter();	
	}
	@Then("scroll down to CopyRight")
	public void scroll_down_to_CopyRight() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).scrollDownToCopyRight();	
	}
	@When("AEM author with access to configure the footer component section")
	public void aem_author_with_access_to_configure_the_footer_component_section() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).navigateTo_FooterComponent_Page();
	}
	@Then ("click on footer component")
	public void click_footer_component() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).clickFooterComponent();	
	}
	@And ("verify the legal text is authorable")
	public void verify_the_legal_text_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyLegalTextisAuthorable();
	}
	@Then ("access the text property and author the text mentioned in test data")
	public void access_the_text_property_and_author_the_text_mentioned_in_test_data() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateLegalTextOfFooterComponent();
	}
	@Then ("the changes are reflected on a footer component")
	public void Verify_the_vhanges_reflected_in_footer() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedLegalTextOnSite();
	}
	@And ("reverse the legal text changes")
	public void reverse_legalText_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateLegalTextOfFooterComponent();
	}
	@And ("verify if URL for Legal Text is authorable")
	public void verify_the_legal_text_URL_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyLegalTextURLisAuthorable();
	}
	@Then ("access the text property and author the URL mentioned in the test data")
	public void access_the_text_property_and_author_the_URL_mentioned_in_test_data() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateLegalTextURLOfFooterComponent();
	}
	@Then ("the legal text URL changes are reflected on a footer component")
	public void Verify_the_URL_changes_reflected_in_footer() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedLegalTextURLOnSite();
	}
	@And ("reverse the legal text URL changes")
	public void reverse_legalTextURL_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateLegalTextURLOfFooterComponent();
	}
	@And ("verify the term and conditions text is authorable")
	public void verify_the_termnconditions_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyTermsNConditionTextisAuthorable();
	}
	@Then ("access the text property and author the terms and condition text mentioned in test data")
	public void access_the_text_property_and_author_the_TnC_mentioned_in_test_data() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateTermsnConditionTextOfFooterComponent();
	}
	@Then ("the terms n condition text changes are reflected on a footer component")
	public void Verify_the_TnC_changes_reflected_in_footer() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedtncTextOnSite();
	}
	@And ("reverse the TnC text changes")
	public void reverse_TnCText_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertTermsNConditionTextLabelChanges();
	}

	@And ("verify the term and conditions text URL is authorable")
	public void verify_the_termnconditions_URL_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyTermsNConditionURLisAuthorable();
	}
	@Then ("access the text property and author the terms and condition URL mentioned in test data")
	public void access_the_text_property_and_author_the_TnC_URL_mentioned_in_test_data() throws Exception {
		
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateTermsnConditionURLofFooterComponent();
	}
	@Then ("the terms n condition URL changes are reflected on a footer component")
	public void Verify_the_TnC_URL_changes_reflected_in_footer() throws Exception {
		Thread.sleep(4000);
		testContext.getPageObjectManager().getPageObject(driver).scrollUp();
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedtncURLOnSite();
	}
	@And ("reverse the TnC URL changes")
	public void reverse_TnCURL_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertTermsNConditionURLLabelChanges();
	}
	@And ("verify the Privacy Policy text is authorable")
	public void verify_the_PrivacyPolicy_Text_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyPrivacyPolicyTextisAuthorable();
	}
	@Then ("access the text property and author the Privacy Policy text mentioned in test data")
    public void access_the_text_property_and_author_the_privacyPolicy_mentioned_in_test_data() throws Exception {
		
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updatePrivacypolicyTextOfFooterComponent();
	}
	@Then ("the Privacy Policy text changes are reflected on a footer component")
	public void Verify_the_PrivacyPolicy_changes_reflected_in_footer() throws Exception {
		Thread.sleep(4000);
		testContext.getPageObjectManager().getPageObject(driver).scrollUp();
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedPrivacyPolicyTextOnSite();
	}
	@And ("reverse the Privacy Policy text text changes")
	public void reverse_PrivacyPolicy_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertPrivacyPolicyTextLabelChanges();
	}
	@And ("verify the Privacy Policy text URL is authorable")
	public void verify_the_PrivacyPolicy_URL_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyPrivacyPolicyURLisAuthorable();
	}
	@Then ("access the text property and author the Privacy Policy URL mentioned in test data")
    public void access_the_text_property_and_author_the_privacyPolicy_URL_mentioned_in_test_data() throws Exception {
		
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updatePrivacyPolicyURLofFooterComponent();
	}
	@Then ("the Privacy Policy URL changes are reflected on a footer component")
	public void Verify_the_PrivacyPolicy_URL_changes_reflected_in_footer() throws Exception {
		Thread.sleep(4000);
		testContext.getPageObjectManager().getPageObject(driver).scrollUp();
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedPrivacyPolicyURLOnSite();
	}
	@And ("reverse the Privacy Policy URL changes")
	public void reverse_PrivacyPolicy_URL_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertPrivacyPolicyURLLabelChanges();
	}
	@And ("verify the Site map text is authorable")
	public void verify_the_SiteMap_Text_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifysitemapTextisAuthorable();
	}
	@Then ("access the text property and author the Site map text mentioned in test data")
    public void access_the_text_property_and_author_the_SiteMap_mentioned_in_test_data() throws Exception {
		
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateSitemapTextOfFooterComponent();
	}
	@Then ("the Site map text changes are reflected on a footer component")
	public void Verify_the_sitemap_changes_reflected_in_footer() throws Exception {
		Thread.sleep(4000);
		testContext.getPageObjectManager().getPageObject(driver).scrollUp();
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedsitemapOnSite();
	}
	@And ("reverse the Site map text changes")
	public void reverse_SiteMap_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertSiteMapTextLabelChanges();
		}
	@And ("verify the Site Map text URL is authorable")
	public void verify_the_SiteMapURL_Text_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifySiteMapURLisAuthorable();
	}
	@Then ("access the text property and author the Site Map URL mentioned in test data")
    public void access_the_text_property_and_author_the_SiteMap_URL_mentioned_in_test_data() throws Exception {
		
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateSiteMapURLofFooterComponent();
	}
	@Then ("the Site Map URL changes are reflected on a footer component")
	public void Verify_the_sitemap_URL_changes_reflected_in_footer() throws Exception {
		Thread.sleep(4000);
		testContext.getPageObjectManager().getPageObject(driver).scrollUp();
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedSiteMapURLOnSite();
	}
	@And ("reverse the Site Map URL changes")
	public void reverse_SiteMapURL_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertSiteMapURLLabelChanges();
		}
	@And ("verify the Accessibility text is authorable")
	public void verify_the_Accessibility_Text_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyAccessibilityTextisAuthorable();
	}
	@Then ("access the text property and author the Accessibility text mentioned in test data")
    public void access_the_text_property_and_author_the_Accessibility_mentioned_in_test_data() throws Exception {
		
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateAccessibilityTextOfFooterComponent();
	}
	@Then ("the Accessibility text changes are reflected on a footer component")
	public void Verify_the_Accesibilty_changes_reflected_in_footer() throws Exception {
		Thread.sleep(4000);
		testContext.getPageObjectManager().getPageObject(driver).scrollUp();
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedAccessibilityOnSite();
	}
	@And ("reverse the Accessibility text changes")
	public void reverse_Accessibility_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertAccessibilityTextLabelChanges();
		}
	@And ("verify the Accessibility URL is authorable")
	public void verify_the_Accessibility_URL_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyAccessibilityURLisAuthorable();
	}
	@Then ("access the text property and author the Accessibility URL mentioned in test data")
    public void access_the_text_property_and_author_the_AccessibilityURL_mentioned_in_test_data() throws Exception {
		
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateAccessibilityURLOfFooterComponent();
	}
	@Then ("the Accessibility URL changes are reflected on a footer component")
	public void Verify_the_AccesibiltyURL_changes_reflected_in_footer() throws Exception {
		Thread.sleep(4000);
		testContext.getPageObjectManager().getPageObject(driver).scrollUp();
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedAccessibilityURLOnSite();
	}
	@And ("reverse the Accessibility URL changes")
	public void reverse_AccessibilityURL_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertAccessibilityURLLabelChanges();
		}
	@And ("verify the Copyright text is authorable")
	public void verify_the_Copyright_URL_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyCopyRightTextisAuthorable();
	}
	@Then ("access the text property and author the Copyright text mentioned in test data")
    public void access_the_text_property_and_author_the_Copyright_mentioned_in_test_data() throws Exception {
		
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateCopyRightTextOfFooterComponent();
	}
	@Then ("the Copyright text changes are reflected on a footer component")
	public void Verify_the_Copyright_changes_reflected_in_footer() throws Exception {
		Thread.sleep(4000);
		testContext.getPageObjectManager().getPageObject(driver).scrollUp();
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedCopyRightOnSite();
	}
	@And ("reverse the Copyright text changes")
	public void reverse_Copyright_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertCopyRightTextLabelChanges();
		}
	
	@And ("verify the Legal Disclaimer text is authorable")
	public void verify_the_LegalDisclaimer_URL_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyLegalDisclaimerTextisAuthorable();
	}
	@Then ("access the text property and author the Legal Disclaimer text mentioned in test data")
    public void access_the_text_property_and_author_the_LegalDisclaimer_mentioned_in_test_data() throws Exception {
		
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateLegalDisclaimerOfFooterComponent();
	}
	@Then ("the Legal Disclaimer text changes are reflected on a footer component")
	public void Verify_the_LegalDisclaimer_changes_reflected_in_footer() throws Exception {
		Thread.sleep(4000);
		testContext.getPageObjectManager().getPageObject(driver).scrollUp();
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedLegalDisclaimerOnSite();
	}
	@And ("reverse the Legal Disclaimer text changes")
	public void reverse_LegalDisclaimer_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertLegalDisclaimerTextLabelChanges();
		}
	@And ("Verify if View More Text is authorable")
	public void verify_ViewMore_Text_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyViewMoreTextisAuthorable();
	}
	@And ("Verify if View Less Text is authorable")
	public void verify_ViewLess_Text_is_authorable() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyViewLessTextisAuthorable();
	}
	@Then ("access the text property and author the View more text mentioned in test data")
	public void access_the_text_property_and_author_the_ViewMore_mentioned_in_test_data() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateviewMoreinFooterComponent();
	}
	@Then ("access the text property and author the View less text mentioned in test data")
	public void access_the_text_property_and_author_the_ViewLess_mentioned_in_test_data() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateviewlessinFooterComponent();
	}
	@Then ("the view more text changes are reflected on a footer component")
	public void Verify_the_ViewMore_changes_reflected_in_footer() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedViewMoreOnSite();
	}
	@Then ("the view Less text changes are reflected on a footer component")
	public void Verify_the_ViewLess_changes_reflected_in_footer() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayUpdatedViewlessOnSite();
	}
	@And ("reverse the View More text changes")
	public void reverse_ViewMore_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertViewMoreTextLabelChanges();
		}
	
	@And ("reverse the View less text changes")
	public void reverse_ViewLess_Changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertViewLessTextLabelChanges();
		}

	@Given("footer url is available") 
	public void footer_url_is_available() throws Exception {
		
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).navigateTo_Footer_Page();
	}
	
	@When("footer page is displayed")
	public void pdp_page_is_displayed_for_the_product() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).display_Footer_Page();
	}

	
	@Given("the footer page url is available") 
	public void footer_page_url_is_available() throws Exception {
		
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).navigate_To_Footer_Page();
	}
	
	//AEM
	
	@And("user should be able to author url for text legal")
	public void user_should_be_able_to_author_legal() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayLegalUrlAEM();
	}
	
	@And("access the property and author url for text legal")
	public void access_and_author_legal() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).enterDataLegalUrlAEM();
	}
	
	@Then("legal text label changes are reflected on ctc site")
	public void legal_changes_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyLegalUrlChangesReflected();
	}
	
	@And("user should be able to author text for terms and conditions")
	public void user_should_be_able_to_author_terms_and_conditions() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayTermsTextAEM();
	}
	
	@And("access the property and author text for terms and conditions")
	public void access_and_author_terms_and_conditions() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).enterDataTermsTextAEM();
	}
	
	@Then("terms and conditions text label changes are reflected on ctc site")
	public void terms_and_conditions_changes_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyTermsTextChangesReflected();
	}
	
	@And("user should be able to author url for terms and conditions")
	public void user_should_be_able_to_author_url_for_terms_and_conditions() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayTermsUrlAEM();
	}
	
	@And("access the property and author url for terms and conditions")
	public void access_and_author_url_for_terms_and_conditions() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).enterDataTermsUrlAEM();
	}
	
	@Then("terms and conditions url changes are reflected on ctc site")
	public void terms_and_conditions_url_changes_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyTermsUrlChangesReflected();
	}

	@And("user should be able to author text for privacy policy")
	public void user_should_be_able_to_author_text_for_privacy_policy() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayPrivacyPolicyTextAEM();
	}
	
	@And("access the property and author text for privacy policy")
	public void access_and_author_text_for_privacy_policy() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).enterDataPrivacyPolicyTextAEM();
	}
	
	@Then("privacy policy text label changes are reflected on ctc site")
	public void privacy_policy_text_changes_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyPrivacyPolicyTextChangesReflected();
	}

	@And("user should be able to author url for privacy policy")
	public void user_should_be_able_to_author_url_for_privacy_policy() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayPrivacyPolicyUrlAEM();
	}
	
	@And("access the property and author url for privacy policy")
	public void access_and_author_url_for_privacy_policy() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).enterDataPrivacyPolicyUrlAEM();
	}
	
	@Then("privacy policy url changes are reflected on ctc site")
	public void privacy_policy_url_changes_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyPrivacyPolicyUrlChangesReflected();
	}	
}