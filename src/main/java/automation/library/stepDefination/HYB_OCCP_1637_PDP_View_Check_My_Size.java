package automation.library.stepDefination;
import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

public class HYB_OCCP_1637_PDP_View_Check_My_Size extends BaseStep{
	RequestSpecification request;
	
	@When("user hits the POST api for Add Product")
	public void user_hits_the_api_for_Add_Product() {
		Log.message("Token No 1: "+accessToken, true);
		response = getAuthorizationUrl().get_Addtocart_Post_API(url, accessToken);	
	}
	
	@Given("User hits product api for size guide is not null")
	public void user_hits_product_api() {
		response = getAuthorizationUrl().get_HYB_Add_Product_API(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2381(),accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	
	@Then("response JSON should have sizeGuide")
	public void response_should_have_sizeGuide() {	
		Assert.assertNotEquals(null, response.jsonPath().get("sizeGuide"));
		Log.message("sizeGuide is displayed in JSON response", true);
		
	}
	
	@Then("response JSON should have SIZECHART under sizeGuide container")
	public void response_should_have_sizechart() {
		Log.message("Response Size Chart:- "  + response.jsonPath().get("sizeGuide.mediaType"), true);
		PageObject.verifyExpectedResponse(response.jsonPath().get("sizeGuide.mediaType"), "SIZE_CHART");
	}
	
	@Given("User hits product api for size guide is null")
	public void user_hits_product_api_SizeGuide_null() {
		response = getAuthorizationUrl().get_HYB_Add_Product_API(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2382(),accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	
	@Then("response JSON is diplayed sizeGuide with null")
	public void response_should_have_sizeGuide_null() {	
		//sizeguide=response.jsonPath().get("sizeGuide").toString().replace("[]", "");
		PageObject.verifyExpectedResponseWithoutList("", response.jsonPath().get("sizeGuide").toString().replace("[]", ""));
		Log.message("sizeGuide is displayed with null value in JSON response", true);
		
	}
}
