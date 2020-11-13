package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;

import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import test.assertion.AssertionTest;
/**
 * This file contains the scenario of user stories OCCP-1680
 */
public class OCCP_1825_Informational_Category_Promotional_Featured_List_Page extends BaseClass {

	public OCCP_1825_Informational_Category_Promotional_Featured_List_Page(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("navigate to featured list page")
	public void navigate_to_featured_list_page() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).navigateTo_Featured_List_Page();
	}
	
	@When("fl page  is available for more than four products")
	public void navigate_to_feature_list_page_for_more_than_four_products() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).navigateTo_Featured_List_Page_More_Than_Four_Product();
	}
	@Then("user should be able to see featured list component on the page")
	public void user_should_be_able_to_see_featured_list_component_on_the_page() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).dispalyFeaturedListComponent();
	}
	
	@And("user should be able to see four products in the carousel view by default")
	public void user_should_be_able_to_see_four_products_in_the_carousel_view_by_default() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyFourProductsAreDisplayedByDefaultInCarouselView();
	}
	
	@Then("verify the display of chevron when there are more than 4 product on left and right side")
	public void verify_the_display_of_chevron_when_there_are_more_than_four_products() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).displayChevronPreviousButton();
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).displayChevronNextButton();
	}
	
	@And("click on right chevron")
	public void click_on_right_chevron() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).clickOnNextChevron();
	}
	
	@And("click on left chevron")
	public void click_on_left_chevron() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).clickOnPreviousChevron();
	}
	
	@Then("user should be displayed the next set of cards")
	public void user_should_be_displayed_the_next_set_of_cards() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyNextSetOfCardsDisplayed();
	}
	
	@Then("user should be able to see associated pagination dots")
	public void user_should_be_able_to_see_associated_pagination_dots() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyAssociatedPaginationDots();
	}
	
	@Then("user is be able to see associated pagination second dots")
	public void user_is_be_able_to_see_associated_pagination_dots() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyAssociatedPaginationDotsTwo();
	}
	
	@Then("user should be displayed previous set of cards")
	public void user_should_be_displayed_previpus_set_of_cards() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyPreviousSetOfCardsDisplayed();
	}
	
	@Then("verify the max number of dots on the component")
	public void verify_the_max_number_of_dots_on_the_component() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyMaxNumberOfPaginatinDotsOnComponents();
	}
	
	@Then("user should still be able to see the last page with four cards")
	public void user_should_still_be_able_to_see_the_last_page_with_four_cards() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyUserAbleToSeeLastPageWithProducts();
	}
	
	@And("click on one of the dot on the carousel")
	public void click_on_one_of_the_dot_on_the_carousel() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).clickOnOneOfDots();
	}
	
	@Then("verify the dot is highlighted upon click")
	public void verify_the_dot_is_highlighted_upon_click() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyTheDotIsHighlightedUponClick();
	}
	
	@Then("user should not be able to see pagination dots when there are only four tiles available")
	public void user_should_not_be_able_to_see_pagination_dots_when_there_are_only_four_tiles_available() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).notDisplayPaginationDots();
	}
	
	@Then("user should not be able to see chevron when there are only four tiles available")
	public void user_should_not_be_able_to_see_chevron_when_there_are_only_four_tiles_available() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).notDisplayChevron();
	}
	
	@Then("verify the display of featured list title")
	public void verify_the_display_of_featured_list_title() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).displayFeaturedListTitle();
	}
	
	@Then("verify the display of card and related image")
	public void verify_the_display_of_card_and_related_image() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).displayProductCard();
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).displayImageCard();
	}
	
	@Then("verify the display of title on the card")
	public void verify_the_display_of_title_on_the_card() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).displayProductCardTitle();
	}
	
	@Then("verify the display of description on the card")
	public void verify_the_display_of_description_on_the_card() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).displayProductCardDescription();
	}
	
	@Then("verify the display of learn more on product card")
	public void verify_the_display_of_learn_more_on_product_card() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).displayLearnMoreProductCard();
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyFourProductsAreDisplayedInCarouselView();
	}
	
 
}
