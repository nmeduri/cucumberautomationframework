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
public class OCCP_1031_Header_And_Main_Primary_Navigation_Step extends BaseClass {

	public OCCP_1031_Header_And_Main_Primary_Navigation_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	
	}
	
	@Then("access the header and verify if primary navigation is present")
	public void access_the_header_and_verify_if_primary_naviagation_is_present() throws Exception {
		testContext.getPageObjectManager().getPrimaryNavigationPage(PageObject.getDriver()).displayPrimaryNavigation();
	}
	
	@Then("the primary navigation should be displayed after the pencil banner")
	public void the_primary_navigation_should_be_displayed_after_the_pencil_banner() throws Exception {
		testContext.getPageObjectManager().getPrimaryNavigationPage(PageObject.getDriver()).displayPrimaryNavigationAfterPencilBanner();
	}
	
	@Then("in primary navigation verify the options present")
	public void in_primary_navigation_verify_the_options_present() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayBannerLogo();
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayStoreBar();
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displaySearchBar();
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayWishlistIcon();
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayCartIcon();
	}
	
	@And("store name is displayed")
	public void store_name_is_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayStoreName();
	}
	
	@And("store status is displayed")
	public void store_status_is_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayStoreStatus();
	}
	
	@And("closing hours is displayd")
	public void closing_hours_is_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayClosingHours();
	}
	
	@And("chervon is displayed")
	public void chervon_is_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayChervon();
	}
	
	@And("click on wish list icon")
	public void click_on_wish_list_icon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickWishlistIcon();
	}
	
	@Then("on clicking user should be redirected to configured page")
	public void on_clicking_user_should_be_redirected_to_configured_page() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).verifyWishListRedirectedToConfigurePage();
	}
	
	@And("click on cart icon")
	public void click_on_cart_icon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickCartIcon();
	}
	
	@Then("on clicking user redirect to cart page")
	public void on_clicking_user_redirect_to_cart_page() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).verifyCartRedirectedToConfigurePage();
	}
	
	//AEM
	
	@When("aem author with access navigates to header page")
	public void navigate_to_aem_header_page() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).navigateToHeaderAEM();
	}
	
	@And("click on aem primary navigation card title")
	public void click_aem_primary_navigation_title() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).clickOnAemPrimaryNavigationTitle();
	}
	
	@And("user should be able to author ctc logo")
	public void user_should_be_able_to_author_ctc_logo() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).displayCtcLogo();
	}
	
	@And("access and author the ctc logo property")
	public void author_ctc_logo() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).enterDataCtcLogo();
	}
	
	@Then("the ctc logo changes should be reflected on ctc site")
	public void ctc_logo_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).verifyLogoChangesReflected();
	}
	
}
