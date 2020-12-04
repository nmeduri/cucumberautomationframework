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
public class OCCP_1849_Standard_Masthead_Banner_Step extends BaseClass {

	public OCCP_1849_Standard_Masthead_Banner_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}
	
	@Given("masthead banner url is available") 
	public void masthead_banner_url_is_available() throws Exception {
		
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).navigateTo_Masthead_Banner_Page();
	}
	
	@Given("masthead banner authorable url is available")
	public void masthead_banner_authorable_url_is_available() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).navigate_to_masthead_banner_page_two();
	}
	
	@Given("navigate on publish masthead url")
	public void navigate_on_publish_masthead_url() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).navigateToMastheadBannerTwo();
	}
	
	@When("navigate to masthead banner authorable url")
	public void navigate_to_masthead_banner_authorable_url() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).navigate_to_masthead_banner_page();
	}
	
	@Given("masthead banner fr url is available") 
	public void masthead_banner_fr_url_is_available() throws Exception {
		
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).navigateTo_Masthead_Banner_Fr_Page();
	}
	
	@When("user should be able to view banner")
	public void user_should_be_able_to_view_banner() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayMastheadBanner();
	}
	
	@Then("user should be able to view background color")
	public void user_should_be_able_to_view_background_color() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayBackgroundColorForBanner();
	}
	
	@Then("user should be able to view title")
	public void user_should_be_able_to_view_title() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayBannerTitle();
	}
	
	@Then("user able to view description")
	public void user_able_to_view_description() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayBannerDescription();
	}
	
	@Then("title is on left aligned")
	public void title_is_on_left_aligned() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayBannerTitle();
	}
	
	@Then("title could be up to 60 characters in length")
	public void title_could_be_up_to_60_characters_in_length() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).veifyTitleUpTo60Characters();
	}
	
	@Then("description could be up to 140 characters in length")
	public void description_could_be_up_to_140_characters_in_length() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).veifyDescriptionUpTo60Characters();
	}
	
	@And("click on masthead banner panel")
	public void click_on_masthead_banner_panel() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).clickMastheadBannerPanel();
	}
	
	@Then("Title field is mandatory field")
	public void title_field_is_mandatory_field() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayBannerTitleField();
	}
	
	@Then("Title tool tip is displayed")
	public void title_tool_tip_is_displayed() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayTitleToolTip();
	}
	
	@And("click on title tool tip")
	public void click_on_title_tool_tip() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).clickTitleToolTip();
	}
	
	@Then("title tool tip info message is displayed")
	public void title_tool_tip_info_message_is_displayed() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayToolTipInfoMessage();
	}
	
	@Then("description field is displayed")
	public void description_field_is_displayed() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayDescriptionField();
	}
	
	@Then("descerption tool tip is displayed")
	public void description_tool_tip_is_displayed() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayDescriptionToolTipIcon();
	}
	
	@And("click on description tool tip")
	public void click_on_description_tool_tip() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).clickDescriptionToolTipIcon();
	}
	
	@Then("description tool tip info message is displayed")
	public void description_tool_tip_info_message_is_displayed() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayToolTipInfoMessage();
	}
	
	@Then("background color field is displayed")
	public void background_color_field_is_displayed() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayBackgroundColorField();
	}
	
	@Then("background color field is mandatory field")
	public void background_color_field_is_mandatory_field() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayBackgroundColorMandatoryField();
	}
	
	@And("configure the title description background color details")
	public void configure_the_title_description_background_color_details() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).enterTitleDetails();
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).enterDesciptionDetails();
		//testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).enterBackgroundColorDetails();
	}
	
	@And("revert the title description background color details")
	public void revert_the_title_description_background_color_details() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).revertTitleDetails();
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).revertDesciptionDetails();
		//testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).revertBackgroundColorDetails();
	}
	
	@Then("the configured details are displayed on the publish page")
	public void the_configured_details_are_displayed_on_the_publish_page() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).verifyDetailsUpdateOnScreen();
	}
	
	@Then("breadcumb would be appear inside the banner")
	public void breadcumb_would_be_appear_inside_the_banner() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).verifyBreadcumbInsideBanner();
	}
	
	
}

