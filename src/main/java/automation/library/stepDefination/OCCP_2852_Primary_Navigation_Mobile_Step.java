package automation.library.stepDefination;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.pageObjects.PDP_Page;

public class OCCP_2852_Primary_Navigation_Mobile_Step extends BaseClass{
	PDP_Page pdpPage;

	public OCCP_2852_Primary_Navigation_Mobile_Step(TestContext context) throws Exception {
		testContext = context;
		pdpPage = testContext.getPageObjectManager().getPDPPage(PageObject.getDriver());
		configFileReader = new ConfigFileReader();
	}

	@Then("primary navigation should be visible in the header")
	public void primary_navigation_should_be_visible() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayPrimaryNavigation();
		}
	
	@And("primary navigation should consist of hamburger menu")
	public void primary_navigation_should_consist_hamburger_menu() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayHamburgerMenu();
		}
	
	@And("primary navigation should consist of store locator icon")
	public void primary_navigation_should_consist_store_locator_icon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayStoreLocator();
		}
	
	@And("primary navigation should consist of banner logo")
	public void primary_navigation_should_consist_banner_logo() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayBannerLogo();
		}
	
	@And("primary navigation should consist of cart icon")
	public void primary_navigation_should_consist_cart_icon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayCartIcon();
		}
	
	@And("primary navigation should consist of search bar")
	public void primary_navigation_should_consist_search_bar() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displaySearchBar();
		}
	
	@And("user has tapped on hamburger menu")
	public void user_tap_on_hamburger_menu() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnHamburgerMenu();
		}
	
	@Then("x icon should be displayed")
	public void x_icon_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayXIcon();
		} 
	
	@And("user clicks on banner logo")
	public void user_clicks_on_banner_logo() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickBannerLogo();
		}
	
	@Then("user should navigate back to home page")
	public void user_navigate_back_to_home() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).verifyLinkNavigateToAssociatedPage();
		} 
	
	@And("user clicks on store locator icon")
	public void user_clicks_on_store_locator_icon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickStoreLocatorIcon();
		}
	
	@Then("store locator fly out should expand")
	public void store_locator_fly_out_should_expand() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayStoreLocatorFlyOut();
		} 
	
	@And("user clicks on cart icon")
	public void user_clicks_on_cart_icon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickCartIcon();
		}
	
	@Then("user should navigate to cart page")
	public void user_navigate_back_to_cart_page() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).verifyCartRedirectedToConfigurePage();
		} 
	

	@And("user scrolls down the page")
	public void user_scrolls_down_the_page() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).scrollDown();
		}
	
	@Then("search bar dissappears and search icon should be shown on the header")
	public void search_bar_dissapears_and_search_icon_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).notDisplaySearchBar();
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displaySearchIcon();
		} 
	
	@And("user clicks into the search bar or on the search icon")
	public void user_clicks_search_bar_or_search_icon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnSearchIcon();
		}
	
	@Then("full search take over the page")
	public void full_search_take_over_the_page() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displaySearchPage();
		}
	
	@And("user clicks on store locator fly out cross icon")
	public void click_on_fly_out_cross_icon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnFlyOutCross();
		}
	
	@And("click on x icon in hamburger menu")
	public void user_clicks_on_x_icon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnSideMenuCross();
		}
	
	@Then("expended menu should be closed and hamburger menu icon should be displayed")
	public void expended_menu_closed_and_hamburger_menu_icon_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayHamburgerMenu();
		}
	
	@And("user taps into the search bar")
	public void user_tap_on_search_bar() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnSearchBar();
		}
	
	@And("user taps on the search icon")
	public void user_taps_on_search_icon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnSearchIcon();
		}
	
	@And("pencil banner should not display for the mobile view")
	public void pencil_banner_should_not_display() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).notDisplayPencilBanner();
		}
	
	@And("user taps on x icon on search take over page")
	public void user_tap_on_x_icon_on_search_page() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickOnCrossSearchPage();
		}
}
