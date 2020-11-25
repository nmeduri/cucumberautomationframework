package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.specification.RequestSpecification;
/**
 * This file contains the scenario of user stories OCCP-3773- OCCP-3657
 */
public class HYB_OCCP_3773_OCCP_3657_Tech_Enabler_For_Implement_Updates_Changes_In_Solutions_Requirements_Step extends BaseStep{
	RequestSpecification request;
	
	@Given("hits GET method for product api-3035")
	public void hits_the_product_api_3035() {
		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3035());
	}
	

	@Then("mediaType is available in JSON response-3035")
	public void mediaType_Is_Available_In_JSON_Response_3035() {	
		Log.message("Response :- "  + response.jsonPath().get("medias.mediaType"), true);
		PageObject.verifyExpectedResponse(response.jsonPath().get("medias.mediaType"), "LIFESTYLE_IMAGE");
	}


//	@Then("mediaType is available in JSON response-3035")
//	public void mediaType_Is_Available_In_JSON_Response_3035() {	
//		Log.message("Response :- "  + response.jsonPath().get("medias.mediaType"), true);
//		PageObject.verifyExpectedResponse(response.jsonPath().get("medias.mediaType"), "LIFESTYLE_IMAGE");
//	}

	
}