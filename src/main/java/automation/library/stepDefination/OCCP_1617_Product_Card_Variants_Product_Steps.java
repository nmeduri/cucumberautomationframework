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

/**
 * This file contains the scenario of user stories - 1617
 */

public class OCCP_1617_Product_Card_Variants_Product_Steps extends BaseClass {
      PDP_Page pdpPage;
	public OCCP_1617_Product_Card_Variants_Product_Steps(TestContext context) throws Exception {
		testContext = context;
		pdpPage = testContext.getPageObjectManager().getPDPPage();
		configFileReader = new ConfigFileReader();
	}
	
	@And("secondary image and more appears over primary image")
	public void secondary_image_and_more_appears_over_primary_image() throws Exception {
		testContext.getPageObjectManager().getPLPPage().hoverOnProductContainsMoreThanFourColor();
	}
	
	@And("hovers primary image area A")
	public void hovers_primary_image_area_a() throws Exception {
		testContext.getPageObjectManager().getPLPPage().mouseHoverOnPrimaryImage();
	}
	
	@Then("secondary image is displayed")
	public void secondary_image_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage().displaySecondaryImage();
	}
	
	@And("move coursor away from image area")
	public void move_cursor_away_from_image_area() throws Exception {
		testContext.getPageObjectManager().getPLPPage().moveCursor();
	}
	
	@Then("the image must switch back to the primary image")
	public void the_image_must_switch_back_to_the_primary_imate() throws Exception {
		testContext.getPageObjectManager().getPLPPage().verifySwitchOnPrimaryImage();
	}

	
	@Then("the mobile primary image must switch back to the primary image")
	public void the_mobile_primary_image_must_switch_back_to_the_primary_imate() throws Exception {
		testContext.getPageObjectManager().getPLPPage().verifySwitchOnPrimaryMobileImage();
	}
	
	@And("hovers on mobile in primary image area A")
	public void hovers_on_mobile_in_primary_image_area_a() throws Exception {
		testContext.getPageObjectManager().getPLPPage().mouseHoverOnMobilePrimaryImage();
	}
	
	@Then("mobile secondary image is displayed")
	public void mobile_secondary_image_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage().displayMobileSecondaryImage();
	}
	
	@Then("secondary image is not displayed")
	public void secondary_image_is_not_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage().displayNotMobileSecondaryImage();
	}
	
	@Then("primary image is displayed in grid view")
	public void primary_image_is_displayed_in_grid_view() throws Exception {
		testContext.getPageObjectManager().getPLPPage().displayPrimaryProductImage();
	}
	
	@Then("secondary image appears on hover and product card does not display any number of color")
	public void secondary_image_appears_on_hover_and_product_card_does_not_display_number_of_color() throws Exception {
		PageObject.getDriver().navigate().refresh();
		testContext.getPageObjectManager().getPLPPage().displayProductCardReview();
	}
	
	@And("Select sort option price high to low")
	public void slect_sort_option_price_high_to_low() throws Exception {
		testContext.getPageObjectManager().getPLPPage().selectPriceHighToLow();
	}
	
	@And("click on sort by option")
	public void click_on_sort_by_option() throws Exception {
		testContext.getPageObjectManager().getPLPPage().clickSortByOption();
	}
	
	@And("product brand is not clickable")
	public void product_brand_is_not_clickable() throws Exception {
		testContext.getPageObjectManager().getPLPPage().notClickableProductBrand();
	}
	
	@Then("the product card is displayed for the product")
	public void the_product_card_is_displayed_for_the_product() throws Exception {
		testContext.getPageObjectManager().getPLPPage().displayProductCard();
	}
	
	@Then("verify number colours is dislayed  where number of color variants availabe for the product")
	public void verify_number_colours_is_displayed_where_number_of_color_variants_available_for_the_product() throws Exception {
		testContext.getPageObjectManager().getPLPPage().displayNumberOfColoursVariant();
	}
	
	@Then("verify the display of number of colours option on the product card")
	public void verify_the_display_of_number_of_colours_option_on_the_product_card() throws Exception {
		testContext.getPageObjectManager().getPLPPage().displayNumberOfColours();
	}
	
	@And("scroll up to page")
	public void scroll_up_to_page() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollUpByCoordinates();
		
	}
	
	@And("the product card name  on the product card is displayed")
	public void the_product_card_name_on_the_product_card_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage().displayProductBrand();
	}
	
	@Then("primary product image is updated to selected variant image")
	public void primary_product_image_is_updated_to_selected_variant_image() throws Exception {
		testContext.getPageObjectManager().getPLPPage().displaySelectedProductImage();
	}
	
	@Then("user is visually indicated that the thumbnail is selected")
	public void user_is_visually_indicated_that_the_thumbnail_is_selected() throws Exception {
		testContext.getPageObjectManager().getPLPPage().displaySelectedProductVariant();
	}
}
