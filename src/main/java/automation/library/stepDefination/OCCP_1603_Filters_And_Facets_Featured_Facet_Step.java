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

public class OCCP_1603_Filters_And_Facets_Featured_Facet_Step extends BaseClass {

	
	public OCCP_1603_Filters_And_Facets_Featured_Facet_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("click on plus sign on  the dynamic ratings facet")
	public void click_on_plus_sign_on_the_dynamic_ratings_facet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickRatingPlusIcon();
	}
	
	@Then("user is able to see rating filter")
	public void user_is_able_to_see_rating_filter() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayRatingFilter();
	}
	
	@And("click on mius sign on rating facet")
	public void click_on_minus_sign_rating_facet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickRatingMinusIcon();
	}
	
	@Then("the rating filter collapses in the dynamic facet")
	public void the_rating_filter_collapses_in_the_dynamic_facet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).collapsedRatingSection();
	}
	
	@And("click on clear all pill")
	public void clickOnClearAllPill() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickClearAllPill();
	}
	
	@And("click on prodcuct card title")
	public void click_on_product_card_title() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickProductCardTitle();
	}
	
	@Then("the selected filters are persistant")
	public void the_selected_filters_are_persistant() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifySelectedFiltersArePersistant();
	}
}

