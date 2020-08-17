package automation.library.api.stepDefination;

import org.json.JSONObject;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Common_Step extends BaseStep {

	RequestSpecification request;
	RequestSpecification requestAuth = RestAssured.given();
	

	@Given("occ api is available")
	public void occ_api_is_availeble() {

		url = getHybApiENCA()
				.HYB_API_EN_CA(FileReaderManager.getInstance().getAPIDataReader().getProductInformationAPI());

	}
	
	@Given("access token is available")
	public void access_token_is_available() {
		url = getAuthorizationUrl().HYB_Auth_Url(FileReaderManager.getInstance().getAPIDataReader().getAuthorizationUrl());
		
	}
	
	@When("user generate token")
	public void user_generate_token() {
		
		response = getAuthorizationUrl().getAuthorizationToken(url);
		
		
	}
	
	@Then("user get the token")
	public void user_get_the_token() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("access_token"));
	}

	@When("user hits the GET api with locale as en_ca")
	public void user_hits_the_api_with_locale_as_en_ca() {

		response = getHybApiENCA().getAPI_EN_CAURL(url,
				FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1415());

	}

	@When("user hits the GET api with locale as fr_ca")
	public void user_hits_the_api_with_locale_as_fr_ca() {

		response = getHybApiFRCA().getAPI_FR_CA(url,
				FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1416());

	}

	@When("user hits the GET api without locale")
	public void user_hits_the_api_without_locale() {

		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1411());
		

	}

	@When("user hits the GET api with locale en")
	public void user_hits_the_api_with_locale_as_en() {

		response = getHybApiEN().getAPI_EN(url,
				FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1414());

	}

	@When("user hits the GET api with Default")
	public void user_hits_the_api_with_default() {

		
		response = getApiFieldDefault().getAPI_Field_Default(url,
				FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1335());
	}

	@When("user hits the api")
	public void user_hits_the_api() {

		Log.message("URL:- " + url, true);
		response = getApiFieldDefault().getAPI_Field_Default(url,
				FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1328());
	}

}
