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

public class OCCP_5192_PLP_Horizontal_Facet_Bar_Step extends BaseClass {
	
	public OCCP_5192_PLP_Horizontal_Facet_Bar_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	
	}
	
	@Then("horizontal panel bar is displayed")
	public void horizontal_panel_bar_is_displayed() throws Exception {
     testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayHorizontalFacetPanelBar();
	}
	
	@Then("category drop down is displayed")
	public void category_drop_down_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayAllCategoriesDropDown();
	}
	
	@Then("top five facet specific buttons are displayed include sort facet by default as first button")
	public void top_five_facet_specific_buttons_are_displayed_include_sort_facet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayFiveSpecificButtonsWithSortFacet();
	}
	
	@Then("more filters button is displayed at very end")
	public void more_filters_button_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayMoreFiltersAtVeryEnd();
	}
	
	@And("user click on a facet button with in the horizontal facet panel")
	public void user_click_on_a_facet_button_with_in_the_horizontal_facet_panel() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickOnFacetOnHorizontalFacetpanel();
	}
	
	@Then("open the facet model panel")
	public void open_the_facet_model_panel() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayFacetPanel();
	}
	
	@Then("expend the facet correspoding to the button the user clicked on with in the horizontal facet bar")
	public void expend_the_facet_corressponding_to_the_button_the_user_clicked_on_the_facet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyExpandCorrespondingFacetPanel();
	}
	
	@Then("display the sort and filters button above the product results grid")
	public void display_the_sort_and_filters_button_above_the_product_results_grid() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displaySortAndFilters();
	}
	
	@And("click on facet bar tab")
	public void click_on_facet_bar_tab() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickFacetBarTab();
	}
	
	@And("configure more filters label")
	public void configure_more_filters_label() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).updateMoreFiltersLabel();
	}
	
	@And("configure sort and filters label")
	public void configure_sort_and_filters_label() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).updateSortAndFiltersLabel();
	}
	
	@And("revert more filters label")
	public void revert_more_filters_label() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).revertMoreFiltersLabel();
	}
	
	@And("revert sort and filters label")
	public void revert_sort_and_filters_label() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).revertSortAndFiltersLabel();
	}
	
	@Then("configured more filters label is displayed on publish page")
	public void configured_more_filters_label_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyConfiguredMoreFiltersLabel();
	}
	
}
