package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-3633
 */

public class OCCP_3633_Cart_Product_Badges_Step extends BaseClass {
	
	public OCCP_3633_Cart_Product_Badges_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}

	@Then ("recommendation badge should be displayed")
	public void display_recommendation_batch() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayRecommendationBadge();
	}
	
	@And ("the recommendation badge background color should be blue")
	public void recommendation_batch_background_color() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).verifyRecommendationBadgeBackgroundColor();
	}
	
	@Then ("availability badge should be displayed")
	public void display_availability_batch() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayAvailabilityBadge();
	}
	
	@And ("the availability badge background color should be yellow")
	public void availability_badge_background_color() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).verifyAvailabilityBadgeBackgroundColor();
	}
	
	@Then ("unique category badge should be displayed")
	public void display_unique_batch() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayUniqueBadge();
	}
	
	@And ("the unique category badge background color should be red with a white border")
	public void unique_badge_background_color() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).verifyUniqueBadgeBackgroundColor();
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).verifyUniqueBadgeBorderColor();
	}
	
	@Then ("pricing and promo category badge should be displayed")
	public void display_pricing_and_promo_batch() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayPricingAndPromoBadge();
	}
	
	@And ("the pricing and promo badge background color should be red")
	public void pricing_and_promo_badge_background_color() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).verifyPricingAndPromoBadgeBackgroundColor();
	}
	
	@Then ("maximum of two badges should be displayed")
	public void display_max_badges() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).verifyMaximumBadgesDisplayed();
	}
	
	@And ("the badges should not be clickable")
	public void badges_should_not_be_clickable() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).badgesNotClickable();
	}
	
	@Then ("the top two badges should be displayed below price")
	public void badges_display_below_price() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayBadgesBelowPrice();
	}
	
	@And ("higher priority badge should be displayed first")
	public void higher_priority_badge_display_first() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayBadges();
	}
	
}
