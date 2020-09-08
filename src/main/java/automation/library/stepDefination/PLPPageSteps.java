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
public class PLPPageSteps extends BaseClass {

	PLP_Page plpPage;
	public PLPPageSteps(TestContext context) throws Exception {
		testContext = context;
		plpPage = testContext.getPageObjectManager().getPLPPage();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("^plp url is available$")
	public void plp_url_is_availabe() throws Exception {
		
		plpPage.navigateTo_PLP_Page();
		
	}
	
	@When("^plp is displayed$")
	public void plp_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage().display_PLP_Page();
	}
	
	@Then("^plp page is visible in grid view$")
	public void plp_page_is_visible_in_grid_view() throws Exception {
		testContext.getPageObjectManager().getPLPPage().displayGridView();
	}
	
	@Then("^user clicks on list view button$")
	public void user_clicks_on_list_view_button() throws Exception {
		testContext.getPageObjectManager().getPLPPage().clickOnListViewButton();
		}
	
	@And("^product card displays the product primary image$")
	public void product_card_displays_the_product_primary_image() throws Exception {
		
		testContext.getPageObjectManager().getPLPPage().displayProductCardImage();
	}
	
	@And("^product card displays the product card title$")
	public void product_card_displays_the_product_card_title() throws Exception {
		testContext.getPageObjectManager().getPLPPage().displayProductCardTitle();
	}
	
	@Then("^plp page is visible in list view$")
	public void plp_page_is_visible_in_list_view() throws Exception {
		testContext.getPageObjectManager().getPLPPage().displayListView();
	}
	
	@And("scroll down the window below the view point")
	public void scroll_down_the_window_below_the_view_point() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDownByCoordinates();
	}
	
	@Then("the sorting option remains displayed at the top of the page in the sticky nav")
	public void the_sorting_option_remains_displayed_at_the_top_of_the_page_in_the_sticky_nav() throws Exception {
	   testContext.getPageObjectManager().getPLPPage().displaySortByOption();	
	}

}
