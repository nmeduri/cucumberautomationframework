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

	Footer_Page footerPage;
	public OCCP_1031_Header_And_Main_Primary_Navigation_Step(TestContext context) throws Exception {
		testContext = context;
		footerPage = testContext.getPageObjectManager().getFooterPage();
		configFileReader = new ConfigFileReader();
	
	}
	
	@Then("access the header and verify if primary navigation is present")
	public void access_the_header_and_verify_if_primary_naviagation_is_present() throws Exception {
		testContext.getPageObjectManager().getPrimaryNavigationPage().displayPrimaryNavigation();
	}
	
	@Then("the primary navigation should be displayed after the pencil banner")
	public void the_primary_navigation_should_be_displayed_after_the_pencil_banner() throws Exception {
		testContext.getPageObjectManager().getPrimaryNavigationPage().displayPrimaryNavigationAfterPencilBanner();
	}
	
	@Then("in primary navigation verify the options present")
	public void in_primary_navigation_verify_the_options_present() throws Exception {
		testContext.getPageObjectManager().getHeaderPage().displayBannerLogo();
		testContext.getPageObjectManager().getHeaderPage().displayStoreBar();
		testContext.getPageObjectManager().getHeaderPage().displaySearchBar();
		testContext.getPageObjectManager().getHeaderPage().displayWishlistIcon();
		testContext.getPageObjectManager().getHeaderPage().displayCartIcon();
	}
	
	@And("store name is displayed")
	public void store_name_is_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage().displayStoreName();
	}
	
	@And("store status is displayed")
	public void store_status_is_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage().displayStoreStatus();
	}
	
	@And("closing hours is displayd")
	public void closing_hours_is_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage().displayClosingHours();
	}
	
	@And("chervon is displayed")
	public void chervon_is_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage().displayChervon();
	}
	
	@And("click on wish list icon")
	public void click_on_wish_list_icon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage().clickWishlistIcon();
	}
	
	@Then("on clicking user should be redirected to configured page")
	public void on_clicking_user_should_be_redirected_to_configured_page() throws Exception {
		testContext.getPageObjectManager().getHeaderPage().verifyWishListRedirectedToConfigurePage();
	}
	
	@And("click on cart icon")
	public void click_on_cart_icon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage().clickCartIcon();
	}
	
	@Then("on clicking user redirect to cart page")
	public void on_clicking_user_redirect_to_cart_page() throws Exception {
		testContext.getPageObjectManager().getHeaderPage().verifyCartRedirectedToConfigurePage();
	}
	
}
