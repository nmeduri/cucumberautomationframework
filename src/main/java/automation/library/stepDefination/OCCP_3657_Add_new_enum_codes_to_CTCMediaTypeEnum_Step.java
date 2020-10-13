package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.specification.RequestSpecification;

public class OCCP_3657_Add_new_enum_codes_to_CTCMediaTypeEnum_Step extends BaseStep{
	RequestSpecification request;
	
	@Given("User user hits the GET method for product api")
	public void user_hits_product_api() {
		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3035());
	}
	
	@Then("response JSON should have mediaType")
	public void response_should_have_mediaType() {	
		Log.message("Response :- "  + response.jsonPath().get("medias.mediaType"), true);
		PageObject.verifyExpectedResponse(response.jsonPath().get("medias.mediaType"), "LIFESTYLE_IMAGE");
		
	}
	
}
