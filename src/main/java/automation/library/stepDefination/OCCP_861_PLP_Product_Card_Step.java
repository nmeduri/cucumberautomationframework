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
 * This file contains the scenario of user stories OCCP-861
 */
public class OCCP_861_PLP_Product_Card_Step extends BaseClass {
	
	public OCCP_861_PLP_Product_Card_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	
	}

	@Then("rating and review section should not be displayed if customer rating is zero")
	public void display_of_review_section() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).notDisplayRatingSection();
	}
	
	@And("configure the list view to off")
	public void configure_the_list_view_to_off() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).selectProductListOff();
	}
	
	@Then("list view option is not displayed on plp")
	public void list_view_option_is_not_displayed_on_plp() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).notDisplayListView();
	}
	
	@And("click on list view on")
	public void configure_the_list_view_to_on() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).selectProductListOn();
	}
	
	@Then("all the products are displayed in grid view")
	public void all_the_products_are_displayed_in_grid_view() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).displayProductCardGridView();
	}
	
	@Then("list view option is displayed on site")
	public void list_view_option_is_displayed_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).displayListViewOption();
	}
	
	@And("change the header label of the feature section")
	public void change_the_header_label_of_the_feature_section() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).updateFeatureLabelHeader();
	}
	
	@Then("update feature header label on site")
	public void update_feature_header_label_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).updateFeatureHeaderLabelOnSite();
	}
	
	@And("reverse feature header label changes")
	public void reverse_feature_header_label_changes() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).reverseHeaderLabelChanges();
	}
	
	@And("select list view button")
	public void select_list_view_button() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickOnListViewButton();
	}
}
