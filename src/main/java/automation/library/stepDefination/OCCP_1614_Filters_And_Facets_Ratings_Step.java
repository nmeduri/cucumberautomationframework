package automation.library.stepDefination;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * This file contains the scenario of user stories OCCP-1561
 */

public class OCCP_1614_Filters_And_Facets_Ratings_Step extends BaseClass {

	
	public OCCP_1614_Filters_And_Facets_Ratings_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("verify the rating facet is displayed")
	public void verify_the_rating_facet_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayRatingsFacetOption();
	}
	
	@And("click on ratings facet")
	public void click_on_ratings_facet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickRatingsFacetOption();
	}
	
	@And("select a ratings facet value")
	public void select_a_ratings_facet_value() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).selectRatingsValue();
	}
	
	@Then("the filter results is displayed at the grid list")
	public void the_filter_results_is_displayed_at_the_gird() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displaySelectedRatingResultOnPLP();
	}
	
	@Then("ratings pill are removed from the top")
	public void ratings_pill_are_removed_from_the_top() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyRatingPillsRemoved();
	}
	
	@Then("facet value must be displayed through star icons")
	public void facet_value_must_be_displayed_through_star_icons() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyFacetValueDisplayedThroughRatingStars();
	}
	
	@Then("rating value can be clicked to collpased using plus icon")
	public void rating_value_can_be_clicked_to_collpased_using_plus_icon() throws Exception {
		
	}
}

