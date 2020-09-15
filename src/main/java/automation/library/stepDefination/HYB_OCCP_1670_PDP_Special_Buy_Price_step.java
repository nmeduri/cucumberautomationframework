package automation.library.stepDefination;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

public class HYB_OCCP_1670_PDP_Special_Buy_Price_step extends BaseStep {

	RequestSpecification request;
	
	@When("user hits the GET method for base product")
	public void user_hits_the_api_without_locale_() {
		
		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1953());

	}
	
	@Then("user should to see Special Buy badge under badges container")
	public void user_should_to_see_Special_Buy_badge_under_badges_container() {

		Log.message("Response badge:- "  + response.jsonPath().get("badges"), true);
		PageObject.verifyExpectedResponse(response.jsonPath().get("badges"), "SPECIALBUY");

	}
	
	@When("user hits the GET method for baseproduct has no variants")
	public void user_hits_the_api_without_locale_for_no_variants() {
		
		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1954());

	}
	
}
