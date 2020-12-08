package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-3331
 */
public class HYB_OCCP_3331_PDP_I_A_Limited_PDP_Step extends BaseStep{

	RequestSpecification request;
	
	@When("5670-user hits GET api for pdp")
	public void user_hits_the_GET_api_1336() {

		response = getHybApiEN().getAPI_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_5670());

	}

	@And("Response JSON should have isLimitedPDP and its value")
	public void response_JSON_should_have_isLimitedPDP_and_its_value() {

		PageObject.notNullAttributeInResponse(response.jsonPath().get("isLimitedPDP").toString());
		Log.message("isLimitedPDP is displayed as " + response.jsonPath().get("isLimitedPDP").toString() , true);
	}
	
	@And("isLimitedPDP is true should displayed in JSON response")
	public void isLimitedPDP_is_true_should_displayed_in_JSON_response() {

		PageObject.verifyExpectedResponseWithoutList("true", response.jsonPath().get("isLimitedPDP").toString());
		Log.message("isLimitedPDP is displayed in JSON response as " +response.jsonPath().get("isLimitedPDP") , true);
	}
	@And("image section should not displayed in JSON response")
	public void image_section_should_not_displayed_in_JSON_response() {

		PageObject.verifyExpectedResponseWithoutList(null, response.jsonPath().get("medias"));
		Log.message("medias section is not displayed in JSON response :" +response.jsonPath().get("medias") , true);
		
	}
	@When("5672-user hits GET api for pdp")
	public void user_hits_the_api_5672() {

		response = getHybApiEN().getAPI_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2169());

	}
	
	@And("isLimitedPDP is false should displayed in JSON response")
	public void isLimitedPDP_is_false_should_displayed_in_JSON_response() {

		PageObject.verifyExpectedResponseWithoutList("false", response.jsonPath().get("isLimitedPDP").toString());
		Log.message("isLimitedPDP is displayed in JSON response as " +response.jsonPath().get("isLimitedPDP") , true);
	}
	
	@And("empty image section and with or without values and sub sections in JSON response")
	public void empty_image_section_and_with_or_without_values_and_subsections_in_JSON_response() {

		PageObject.notNullAttributeInResponse(response.jsonPath().get("medias").toString());
		Log.message("medias section is displayed in JSON response :" +response.jsonPath().get("medias") , true);
		
	}
}
