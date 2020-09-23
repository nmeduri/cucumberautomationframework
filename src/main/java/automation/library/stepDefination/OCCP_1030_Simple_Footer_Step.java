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
	
	@Then("editable clickable text legal is displayed")
	public void editable_clickable_text_legal_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextLegal();
	}
	
	@Then("editable clickable text Terms and conditions is displayed")
	public void editable_clickable_text_terms_and_conditions_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextTermsAndConditions();
	}
	
	@Then("editable clickable text privacy and policy is displayed")
	public void editable_clickable_text_pricacy_and_policy_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextPrivacyAndPolicy();
	}
	
	@Then("editable clickable text site map is displayed")
	public void editable_clickable_text_site_map_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextSiteMap();
	}
	
	@Then("editable clickable text accessbility is displayed")
	public void editable_clickable_text_accessbility_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableTextAccessibility();
	}
	
	@Then("editable clickable text view more is displayed")
	public void editable_clickable_text_view_more_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableViewMore();
	}
	
	@Then("editable clickable text view less is displayed")
	public void editable_clickable_text_view_less_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayEditableViewLess();
	}
	
	@Then("copy right text is displayed")
	public void copy_right_text_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayCopyRight();
	}
	
	
}
