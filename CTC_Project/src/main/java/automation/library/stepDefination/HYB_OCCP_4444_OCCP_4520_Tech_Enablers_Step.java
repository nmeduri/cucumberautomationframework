package automation.library.stepDefination;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-4444- OCCP-4520
 */
public class HYB_OCCP_4444_OCCP_4520_Tech_Enablers_Step extends BaseStep{
	RequestSpecification request;
	
	@When("user hits GET method for Loyalty badge")
	public void user_hits_get_method_for_Loyalty_badges() {

		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3074());

	}
	
	@Then("Response should display Loyalty badge with value")
	public void response_should_display_Loyalty_badge_with_value() {

		Log.message("Response badge:- "  + response.jsonPath().get("badges"), true);
		PageObject.verifyExpectedResponse(response.jsonPath().get("badges"), "LOYALTY|100P");

	}
}
