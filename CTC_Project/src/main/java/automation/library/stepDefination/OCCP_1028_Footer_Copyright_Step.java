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
public class OCCP_1028_Footer_Copyright_Step extends BaseClass {

	public OCCP_1028_Footer_Copyright_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("click on view less")
	public void click_on_view_less() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickViewLess();
	}
	
	@Then("view less should not be displayed")
	public void view_less_should_not_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).notDisplayViewLess();
	}
	
	@And("canadian tire logo should be displayed")
	public void canadian_tire_logo_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayCanadianTireLogo();
	}
	
	@Then("copy right label should be displayed")
	public void copy_right_label_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayCopyRightText();
	}
	
	@Then("footer is displayed")
	public void footer_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayFooterLink();
	}
	
	@Then("copy right information should be displayed on the footer")
	public void copy_right_information_should_be_displayed_on_the_footer() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayCopyRightInformation();
	}
	
	@And("in footer hover on any link on footer")
	public void in_footer_hover_on_any_link_on_footer() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyUnderlinkeOnAnyLink();
	}
	
	@And("in footerhover on any link on footer")
	public void in_footerhover_on_any_link_on_footer() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyUnderlinkeOnAnyLinkOnMobile();
	}
	
	@And("click on aem new copyright footer title")
	public void click_on_aem_copyright_footer_title() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).clickOnFooterTitle();
	}
	
	@And("user should be able to author canadatire image alternative text")
	public void user_should_be_able_to_author_image_alternative_text() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayLogoAltText();
	}
	
	@And("access the text property and author the text")
	public void author_image_alternative_text() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).enterDataLogoAltText();
	}
	
	@And("user should be able to author copyright label property")
	public void user_should_be_able_to_author_copyright_label() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayCopyrightLabel();
	}
	
	@And("access the copyright label and author the text")
	public void author_copyright_label_text() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).enterDataCopyrightLabel();
	}
	
	@And("user should be able to author Legal Disclaimer")
	public void user_should_be_able_to_author_legal_disclaimer_text() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayLegalDisclaimerAem();
	}
	
	@And("access the Legal Disclaimer property and author the text")
	public void author_legal_disclaimer_text() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).enterDataLegalDisclaimerAem();
	}
	
	@And("user should be able to author view more text")
	public void user_should_be_able_to_author_view_more_text() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayViewMoreAem();
	}
	
	@And("access the view more property and author the text")
	public void author_view_more_text() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).enterDataViewMoreAem();
	}
	
	@And("user should be able to author view less text")
	public void user_should_be_able_to_author_view_less_text() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayViewLessAem();
	}
	
	@And("access the view less property and author the text")
	public void author_view_less_text() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).enterDataViewLessAem();
	}
	
	@Then("scroll down to copyright footer component")
	public void scroll_down_to_copyright_footer_component() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).scrollDownToCopyrightFooter();
	}
	
	@Then("copyright label changes are reflected on ctc site")
	public void copyright_label_changes_reflected_on_footer_component() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyCopyrightLabelChangesReflected();
	}
	
	@Then("legal disclaimer changes are reflected on ctc site")
	public void legal_disclaimer_changes_reflected_on_footer_component() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyLegalDisclaimerChangesReflected();
	}
	
	@Then("image alternative text changes are reflected on ctc site")
	public void image_alternative_text_changes_reflected_on_footer_component() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyAltTextChangesReflected();
	}
	
	@Then("view more and view less label text changes are reflected on ctc site")
	public void view_more_view_less_label_text_changes_reflected_on_footer_component() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyViewMoreViewLessChangesReflected();
	}
	
	@And("user should be able to author links open in new tab or same tab")
	public void user_should_be_able_to_author_links_open_in_new_or_same_tab() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayLegalOpenUrlIn();
	}
	
	@And("access the property and author new tab or same tab")
	public void author_new_or_same_tab() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).selectTabFromDropDown();
	}
	
	@Then("verify if page opens in new tab or same tab as authored")
	public void verify_page_opens_in_new_or_same_tab() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyOpensInAuthoredTab();
	}
	
	@Then("scroll down to simple footer component")
	public void scroll_down_to_simple_footer_component() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).scrollDownToSimpleFooter();
	}
	
	@And("click on aem new simple footer title")
	public void click_on_aem_simple_footer_title() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).clickOnSimpleFooterTitle();
	}
	
	@And("user should be able to author logo for canadatire")
	public void user_should_be_able_to_author_logo_for_canadatire() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayLogoField();
	}
	
	@And("logo should be uploaded successfully")
	public void logo_should_be_uploaded_successfully() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).uploadLogo();
	}
	
	@And("authoring name should be ct logo")
	public void authoring_should_be_ctlogo() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).enterDataLogoAltText();
	}
	
	@Then("the uploaded logo should be reflected on ctc site")
	public void uploaded_logo_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyUploadedLogoIsDisplayed();
	}
	
	@When("aem author with access navigates to footer page")
	public void navigate_to_footer() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).navigateToFooterPage();
	}
}
