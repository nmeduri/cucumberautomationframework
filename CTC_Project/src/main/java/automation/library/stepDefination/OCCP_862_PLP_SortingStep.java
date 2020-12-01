package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
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
 * This file contains the scenario of user stories OCCP-862
 */

public class OCCP_862_PLP_SortingStep extends BaseClass {
	
	public OCCP_862_PLP_SortingStep(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	
	}
	
	@When("user clicks on the Sort by ")
	public void user_clicks_on_sortBy() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickSortByOption();
		}
	
	@And("user selects Price Low to High as sorting option")
	public void user_selects_price_low_to_high() throws Exception {
		
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickOnPriceLowToHigh();
	}
	
	@Then("all the product results should be rearranged from lowest to highest price")
	public void product_results_from_lowest_to_highest_price() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyPriceLowToHigh();
	}
	
	@And("user select hide option")
	public void user_select_hide_option() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickHideOption();
	}
	
	@And("sort option is not displayed on the site")
	public void sort_option_is_not_displayed_on_the_site() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).notDisplaySortOption();
	}
	
	@And("sort option is displayed on the site")
	public void sort_option_is_displayed_on_the_site() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displaySortOption();
	}
	
	@And("reverse the sort changes")
	public void reverse_the_product_number_changes() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).reverseProductNumberChanges();
	}
	
	@And("user click on unhide option")
	public void user_click_on_unhide_option() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickUnhideOption();
	}
	
	@And("select sorting tab")
	public void select_sorting_tab() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickSortingTab();
	}
	
	@And("enter product in search bar")
	public void enter_product_in_search_bar() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).enterProductInSearchField();
	}
	
	@And("user click on search icon")
	public void user_click_on_search_icon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).clickSearchIcon();
	}
	
	@Then("the previously selected sorting option is persisted")
	public void the_previously_selected_sorting_option_is_persisted() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displaySortOptionNewArrivalSelected();
	}
	
}
