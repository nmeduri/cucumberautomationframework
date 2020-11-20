package automation.library.stepDefination;


import static org.testng.Assert.fail;

import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
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
import net.bytebuddy.agent.builder.AgentBuilder.Ignored;
/**
 * This file contains the scenario of PLP Page
 */

public class PLPPageSteps extends BaseClass {

	
	public PLPPageSteps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("^plp url is available$")
	public void plp_url_is_availabe() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).navigateTo_PLP_Page();
	}
	
	@Given("^price detail plp url is available$")
	public void price_detail_plp_url_is_availabe() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).navigateTo_price_detail_PLP_Page();
	}
	
	@Given("^plp url 'show more' is available$")
	public void plp_url_show_more_is_availabe() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).navigateTo_PLP_Show_More_Page();
	}
	
	
	
	@When("^plp is displayed$")
	public void plp_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).display_PLP_Page();
	}
	
	@Then("^plp page is visible in grid view$")
	public void plp_page_is_visible_in_grid_view() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayGridView();
	}
	
	@Then("^user clicks on list view button$")
	public void user_clicks_on_list_view_button() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickOnListViewButton();
		}
	
	@Then("^user click on list view button on mobile$")
	public void user_clicks_on_list_view_button_on_mobile() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickListViewMobile();
		}
	
	@And("^product card displays the product primary image$")
	public void product_card_displays_the_product_primary_image() throws Exception {
		
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayProductCardImage();
	}
	
	@And("^product card displays the product card title$")
	public void product_card_displays_the_product_card_title() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayProductCardTitle();
	}
	
	@Then("^plp page is visible in list view$")
	public void plp_page_is_visible_in_list_view() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayListView();
	}
	
	@And("scroll down the window below the view point")
	public void scroll_down_the_window_below_the_view_point() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDownByCoordinates();
	}
	
	@Then("the sorting option remains displayed at the top of the page in the sticky nav")
	public void the_sorting_option_remains_displayed_at_the_top_of_the_page_in_the_sticky_nav() throws Exception {
	   testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displaySortByOption();	
	}
	
	
	
	@And("user click on close button")
	public void user_click_on_close_button() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickCloseButton();
	}
	
	@Then("all products results are rearranged from highest to lowest price")
	public void all_products_results_are_rearranged_from_highest_to_lowest_price() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyPriceHighToLow();
	}
	
	@And("select sorting option Newest Arrivals")
	public void select_sorting_option_newest_arrivals() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).select_New_Arrivals();
	}
	
	@And("select the sorting option customer ratings high to low")
	public void select_the_sorting_option_customer_ratings_high_to_low() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).select_Customer_Rating_High_To_Low();
	}
	
	@Then("All the product results are rearranged from highest customer ratings high to lowest customer ratings")
	public void all_the_product_results_are_rearranged_from_highest_customer_ratings_high_to_lowest_customer_ratings() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyRatingHighToLow();
	}
	
	@And("user click on grid view button")
	public void user_click_on_grid_view_button() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickGridViewButton();
	}
	
	@And("user clicks on grid view button Mobile")
	public void user_clicks_on_grid_view_button_mobile() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickGridViewButtonMobile();
	}
	
	@And("click on the variant thumbnails on the product card")
	public void click_on_the_variant_thumbnails_on_the_product_card() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickProductCardVariant();
	}
	
	@And("review stars are displayed")
	public void review_stars_are_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayReviewStars();
	}
	
	@And("close Browser") 
	public void close_browser() throws Exception {
		PageObject.getDriver().close();
	}
	
	@And("quit browser") 
	public void quit_browser() throws Exception {
		PageObject.getDriver().quit();
	}
}
