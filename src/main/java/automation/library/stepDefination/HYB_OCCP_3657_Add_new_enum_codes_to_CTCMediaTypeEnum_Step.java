package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.specification.RequestSpecification;
/**
 * This file contains the scenario of user stories OCCP-3657
 */
public class HYB_OCCP_3657_Add_new_enum_codes_to_CTCMediaTypeEnum_Step extends BaseStep{
	RequestSpecification request;
	
	@Then("mediaType is available in JSON response-3035")
	public void mediaType_Is_Available_In_JSON_Response_3035() {	
		Log.message("Response :- "  + response.jsonPath().get("medias.mediaType"), true);
		PageObject.verifyExpectedResponse(response.jsonPath().get("medias.mediaType"), "LIFESTYLE_IMAGE");
		
	}
	
}