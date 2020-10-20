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
public class OCCP_939_PLP_SRP_Load_More extends BaseClass {

	public OCCP_939_PLP_SRP_Load_More(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("AEM author with access to configure intial product result load on the page")
	public void aem_author_with_access_to_configure_intial_product_result_load_on_the_page() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).navigateTo_PLP_Page();
	}
	
	@And("click on PLP Pannel")
	public void click_on_plp_pannel() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickPLPPannel();
	}
	
	@And("update the number of product cards to be initially displayed for list gird view on plp")
	public void update_the_number_of_product_cards_to_be_initally_displayed_for_list_gird_view_on_plp() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).updateDataIntialNumberOfProducts();
	}
	
	@Then("the changes are reflected on a plp for both list grid view")
	public void the_changes_are_reflected_on_a_plp_for_both_list_gird_view() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).verifyNumberOfProductsChangesReflectOnSite();
	}
	
	@And("reverse the product number changes")
	public void reverse_the_product_number_changes() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).reverseProductNumberChanges();
	}
	
	@And("click on show more tab")
	public void click_on_show_more_tab() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickShowMore();
	}
	
	@And("update the number of the results to be displayed when show more is clicked")
	public void update_the_number_of_the_results_to_be_displayed_when_show_more_is_clicked() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).enterShowMoreCount();
	}
	
	@And("click on aem show more button")
	public void click_on_aem_show_more_button() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickShowMoreButton();
	}
	
	@Then("show more count changes are reflected on a PLP for both gird list views")
	public void show_more_count_changes_are_reflected_on_a_plp_for_both_grid_list_views() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).verifyShowMoreCountUpdateOnSite();
	}
	
	@And("reverse show more changes")
	public void reverse_show_more_changes() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).reverseShowMoreChanges();
	}
	
	@And("update the search response count")
	public void update_the_search_response_count() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).enterSearchResponseCount();
	}
	
	@Then("search response count changes are reflected on a PLP for both grid list views")
	public void search_response_count_changes_are_reflected_on_a_plp_for_both_grid_list_views() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).verifySearchResponseCountUpdateOnSite();
	}
	
	@And("reverse search response count changes")
	public void reverse_search_response_changes() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).reverseShowMoreChanges();
	}
	
	@And("edit copy for first part of the pagination result")
	public void edit_copy_for_first_part_of_the_pagination_result() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).enterPaginationResultMessage();
	}
	
	@Then("pagination result message changes are reflected on a PLP both grid list views")
	public void pagination_result_message_changes_are_reflected_on_a_plp_both_grid_list_views() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).verifyPaginationResultMessageUpdateOnSite();
	}
	
	@And("reverse pagination result message changes")
	public void reverse_pagination_result_message_changes() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).reversePaginationResultMessageChanges();
	}
	
	
 
}
