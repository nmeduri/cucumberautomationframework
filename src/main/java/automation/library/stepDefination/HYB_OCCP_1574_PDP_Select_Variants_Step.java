package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import test.assertion.AssertionTest;

/**
 * This file contains the scenario of user stories OCCP-1574
 */

public class HYB_OCCP_1574_PDP_Select_Variants_Step extends BaseStep {

	RequestSpecification request;
	
	@When("user hits GET api")
	public void user_hits_the_api_without_locale_1336() {

		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1336());

	}
	
	@When("user hits the GET method for no variant section")
	public void user_hits_the_api_without_locale_for_no_variant_section() {

		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1339());
		

	}
	
	@When("user hits the GET api for base Product and have variants but price is same for all variants")
	public void user_hits_the_api_for_base_product_and_have_variants_but_price_is_same_for_all_variants() {

		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1362());
		

	}
	
	@When("user hits the GET api for base Product and have variants but price is different for all variants")
	public void user_hits_the_api_for_base_product_and_have_variants_but_price_is_different_for_all_variants() {

		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1363());
		

	}
	
	@When("user hits the GET api for given product code when product code is variant product code")
	public void user_hits_the_api_for_given_product_code_when_product_code_is_variant_product_code() {

		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1363());
		

	}


	@Then("user should be able to see multiple color variant in the JSON response")
	public void user_should_be_to_see_multiple_color_variant_int_the_JSON_response() {
		
		PageObject.verifyMultipleValue(response.jsonPath().get("variantMatrix.variantValueCategory.name"));

		
	}
	
	@Then("user should be able to see multiple size variant in the JSON response")
	public void user_should_be_to_see_multiple_size_variant_in_the_response() {
		
		Log.message("Size:- " + response.jsonPath().get("variantMatrix.elements.variantValueCategory.name"), true);
		PageObject.verifyMultipleValue(response.jsonPath().get("variantMatrix.elements.variantValueCategory.name"));
		
	}
	
	@Then("user able to see multiple size and colours in the response")
	public void user_able_to_see_multipe_size_and_colours_in_the_response() {
		Log.message("verify multiplse color", true);
		PageObject.verifyMultipleValue(response.jsonPath().get("variantMatrix.variantValueCategory.name"));
		Log.message("verify multiple size", true);
		PageObject.verifyMultipleValue(response.jsonPath().get("variantMatrix.elements.variantValueCategory.name"));
	}
	
	@Then("JSON response should have variants of product data only")
	public void response_should_have_variants_of_product_data_only() {
		
		PageObject.verifyMultipleValue(response.jsonPath().get("variantMatrix.elements.variantOption"));
		
	}
	
	@Then("variant sector should unavailable")
	public void variant_sector_should_unavailable() {
		Assert.assertNull(response.jsonPath().get("variantMatrix.elements.variantOption"));
	}
	
	@And("sku id for the product is displayed")
	public void sku_id_for_the_product_is_displayed() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("code"));
	}
	@Then("variant sector should be available")
	public void variant_sector_should_be_available() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("variantMatrix.elements.variantOption"));
		Log.message("Variants List : " +response.jsonPath().get("variantMatrix.elements.variantOption") ,true);
	}
	
}
