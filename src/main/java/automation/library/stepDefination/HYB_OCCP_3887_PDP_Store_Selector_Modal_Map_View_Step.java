package automation.library.stepDefination;

import org.testng.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-3887
 */

public class HYB_OCCP_3887_PDP_Store_Selector_Modal_Map_View_Step extends BaseStep{

	RequestSpecification request;
	
	@Given("ctr store locator occ api is available")
	public void ctr_store_locator_occ_api_is_available() {

		url = getHybApiENCA()
				.HYB_API_EN_CA(FileReaderManager.getInstance().getAPIDataReader().get_CTR_Store_Locator_API());
	}
	
	@When("hits the GET api for store locator")
	public void hits_the_GET_api_for_store_locator() {
		response = getApiFieldDefault().get_Store_Locator_API(url);
	}
	@Then("isStoreOpen True should be displayed in the JSON response")
	public void isStoreOpen_True_should_be_displayed_in_the_JSON_response() {

		PageObject.verifyExpectedResponseWithoutList("true", response.jsonPath().get("isStoreOpen").toString());
		Log.message("isStoreOpen is displayed in JSON response as " +response.jsonPath().get("isStoreOpen") , true);
	
	}
	
	@And("openingHours should be displayed with all attributes in the JSON response")
	public void openingHours_should_be_displayed_with_all_attributes_in_the_JSON_response() {

		PageObject.notNullAttributeInResponse(response.jsonPath().get("openingHours").toString());
		PageObject.notNullAttributeInResponse(response.jsonPath().get("openingHours.code").toString());
		PageObject.verifyExpectedResponseWithoutList("[]",response.jsonPath().get("openingHours.specialDayOpeningList").toString());
		PageObject.notNullAttributeInResponse(response.jsonPath().get("openingHours.weekDayOpeningList").toString());
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("openingHours.weekDayOpeningList.closed"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("openingHours.weekDayOpeningList.weekDay"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("openingHours.weekDayOpeningList.closingTime"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("openingHours.weekDayOpeningList.closingTime.formattedHour"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("openingHours.weekDayOpeningList.closingTime.hour"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("openingHours.weekDayOpeningList.closingTime.minute"));
		
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("openingHours.weekDayOpeningList.openingTime"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("openingHours.weekDayOpeningList.openingTime.formattedHour"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("openingHours.weekDayOpeningList.openingTime.hour"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("openingHours.weekDayOpeningList.openingTime.minute"));
	}
	
	
	
}
