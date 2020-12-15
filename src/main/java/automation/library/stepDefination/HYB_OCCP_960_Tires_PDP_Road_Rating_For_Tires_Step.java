package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-960
 */
public class HYB_OCCP_960_Tires_PDP_Road_Rating_For_Tires_Step extends BaseStep{
	RequestSpecification request;
	
	@When("^user hits the GET PDP api with locale en for tireRoadRatings product$")
	public void user_hits_the_GET_PDP_api_with_locale_as_en_tireRoadRatings_product() {
		response = getHybApiEN().getAPI_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_5663());
	}
	
	@Then("^response JSON should have tireRoadRatings section with ratingId and value$")
	public void response_JSON_should_have_tireRoadRatings_section_with_ratingId_and_value() {     

		Assert.assertNotEquals(null, response.jsonPath().get("tireRoadRatings"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("tireRoadRatings.ratingId"));
		Log.message("ratingId : "+ response.jsonPath().get("tireRoadRatings.ratingId"), true);
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("tireRoadRatings.value"));
		Log.message("rating value : "+ response.jsonPath().get("tireRoadRatings.value"), true);
	}
	
	@When("^user hits the GET PDP api with locale en when tireRoadRatings is null$")
	public void user_hits_the_GET_PDP_api_with_locale_as_en_when_tireRoadRatings_is_null() {
		response = getHybApiEN().getAPI_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_5664());
	}
	
	@Then("^response JSON should have tireRoadRatings section without ratingId and value$")
	public void response_JSON_should_have_tireRoadRatings_section_without_ratingId_and_value() {     
		PageObject.verifyExpectedResponseWithoutList("[]", response.jsonPath().get("tireRoadRatings").toString());
		Log.message("tireRoadRatings :- " + response.jsonPath().get("tireRoadRatings"), true);
		
		PageObject.verifyExpectedResponseWithoutList("[]", response.jsonPath().get("tireRoadRatings.ratingId").toString());
		Log.message("ratingId : "+ response.jsonPath().get("tireRoadRatings.ratingId"), true);
		PageObject.verifyExpectedResponseWithoutList("[]", response.jsonPath().get("tireRoadRatings.value").toString());
		Log.message("rating value : "+ response.jsonPath().get("tireRoadRatings.value"), true);
	}
	@Then("^response JSON should have tireRoadRatings section with ratingId is not null$")
	public void response_JSON_should_have_tireRoadRatings_section_with_ratingId_is_not_null() {     
		Assert.assertNotEquals(null, response.jsonPath().get("tireRoadRatings"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("tireRoadRatings.ratingId"));
	}
	@Then("^response JSON should have tireRoadRatings section without ratingId is null$")
	public void response_JSON_should_have_tireRoadRatings_section_without_ratingId_is_null() {     
		PageObject.verifyExpectedResponseWithoutList("[]", response.jsonPath().get("tireRoadRatings").toString());
		Log.message("tireRoadRatings :- " + response.jsonPath().get("tireRoadRatings"), true);
		PageObject.verifyExpectedResponseWithoutList("[]", response.jsonPath().get("tireRoadRatings.ratingId").toString());
	}
	@Then("^response JSON should have tireRoadRatings section with value is not null$")
	public void response_JSON_should_have_tireRoadRatings_section_with_value_is_not_null() {     
		Assert.assertNotEquals(null, response.jsonPath().get("tireRoadRatings"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("tireRoadRatings.value"));
		Log.message("rating value : "+ response.jsonPath().get("tireRoadRatings.value"), true);
	}
	
	@Then("^response JSON should have tireRoadRatings section with value is null$")
	public void response_JSON_should_have_tireRoadRatings_section_with_value_is_null() {     
		PageObject.verifyExpectedResponseWithoutList("[]", response.jsonPath().get("tireRoadRatings").toString());
		Log.message("tireRoadRatings :- " + response.jsonPath().get("tireRoadRatings"), true);
		PageObject.verifyExpectedResponseWithoutList("[]", response.jsonPath().get("tireRoadRatings.value").toString());
	}
	@When("^user hits the GET PDP api without basestoreid for tireRoadRatings product$")
	public void user_hits_the_GET_PDP_api_without_basestoreid_tireRoadRatings_product() {
		response = getHybApiEN().getAPI_EN_Without_BaseStoreId(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_5663());
	}
	
	
}
