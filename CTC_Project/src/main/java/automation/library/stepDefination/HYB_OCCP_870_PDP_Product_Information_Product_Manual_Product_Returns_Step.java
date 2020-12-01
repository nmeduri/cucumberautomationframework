package automation.library.stepDefination;
import java.util.List;

import org.junit.Assert;

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
 * This file contains the scenario of user stories OCCP-870
 */

public class HYB_OCCP_870_PDP_Product_Information_Product_Manual_Product_Returns_Step extends BaseStep {

	Response responseEN;
	Response responseENCA;
	Response responseFRCA;
	RequestSpecification request;

	@When("user hits the GET api of user manual link without locale")
	public void user_hits_the_api_of_user_manual_link_without_locale() {

		Log.message("URL:- " + url, true);
		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1335());

	}
	
	@When("user hits the product info API")
	public void user_hits_the_api() {     
 
		response = getHybApiEN().getAPI_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1326());
		responseEN = response;
		response = getHybApiENCA().getAPI_EN_CAURL(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1326());
		responseENCA = response;
		response = getHybApiFRCA().getAPI_FR_CA(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1326());
		responseFRCA = response;
	}

	@Then("user should able to see the product code in the JSON response")
	public void user_should_be_able_to_see_product_code_in_the_response() {
		
		Log.message("Product Code:- " + response.jsonPath().get("code"), true);
		Assert.assertNotEquals(null, response.jsonPath().get("code"));
		Assert.assertEquals(FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1335(), response.jsonPath().get("code"));
		Log.message("User is able to see product Code in JSON Response.", true);
	}
	
	@When("user hits the GET method with Default locale for product manaul link")
	public void user_hits_the_api_with_default_for_product_manual_link() {

		response = getApiFieldDefault().getAPI_Field_Default(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1331());
	}

	
	@Then("user should be able to see product Description and its value in en in JSON Response")
	public void user_should_be_able_to_see_product_description_and_its_value_in_en() {
		
		PageObject.notNullAttributeInResponse(response.jsonPath().get("description"));
		Log.message("User is able to see product Description and its value in en.", true);
	}
	
	@Then("user should able to see the product brand title in the JSON response")
	public void user_should_able_to_see_the_product_brand_int_the_JSON_response() {

		String sDescription = response.jsonPath().get("productBrand");
		Assert.assertNotEquals(null, sDescription);
	}
	
	@Then("User Manual link is not displayed")
	public void user_manaul_link_is_not_displayed_in_response() {
		
		Assert.assertNull(response.jsonPath().get("productManualLink"));
		Log.message("User Manual Link is not Displayed" , true);
	}
	
	@And("user should able to see the product brand title's value in the JSON response")
	public void user_should_able_to_see_the_product_brand_title_value() {
		
		Log.message("Brand:- "+ response.jsonPath().get("productBrand"), true);
		Assert.assertEquals("Yardworks", response.jsonPath().get("productBrand"));
		Log.message("Product Brand Title's value is displayed in JSON Response", true);
	}
	
	@And("user should be able to see product Description and its value in en_CA")
	public void user_should_be_able_to_see_product_description_and_its_value_in_en_CA() {
		
		PageObject.notNullAttributeInResponse(responseENCA.jsonPath().get("description"));
		Log.message("User is able to see product Description and its value in en_CA.", true);
	}
	
	@And("user should be able to see product Description and its value in en FR")
	public void user_should_be_able_to_see_product_description_and_its_value_in_en_FR() {
		
		Assert.assertEquals("Yardworks 40V Cordless Snowthrower, 16-in", responseFRCA.jsonPath().get("description"));
		Log.message("User is able to see product Description and its value in fr_CA.", true);
	}
	
	@Then("user should be able to see the product manual link in the JSON response")
	public void user_should_be_to_see_the_product_manual_link_in_the_response() {
		Assert.assertNotEquals(null, response.jsonPath().get("productManualLink"));
		Log.message("User is able to see the product manual link in the JSON response.", true);
	}
	
	@Then("user should be able to see product description is not null")
	public void user_should_be_able_to_see_product_description_is_not_null() {
		
		Assert.assertNotEquals(null, response.jsonPath().get("description"));
		
	}
	
	@Then("user should be able to see product description and language as en in JSON response")
	public void user_should_be_able_to_see_product_description_and_langauge_as_en_in_response() {
		Assert.assertTrue("Yardworks 40V Cordless Snowthrower, 16-in".contains(response.jsonPath().get("description")));
	}
	
	@When("user hits GET with locale as fr ca for description")
	public void user_hits_the_GET_api_with_locale_as_fr_ca_for_description() {     
 
		
		response = getHybApiFRCA().getAPI_FR_CA(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1326());
	}
	
	@When("user hits GET method with locale as en ca for description")
	public void user_hits_the_GET_method_with_locale_as_en_ca_for_description() {     	
		response = getHybApiENCA().getAPI_EN_CAURL(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1326());	
	}
	
	@When("user hit the GET api for Brand Information")
	public void user_hit_the_GET_api_for_Brand_Information() {
		response = getApiFieldDefault().getAPI_Field_Default(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1334());
	}
	@Then("brand title should not displayed")
	public void brand_title_should_not_displayed() {
		String brand=response.jsonPath().get("productBrand");
		Log.message("Brand title is not displayed and value is :" +brand, true);
	}
	@When("user hits the GET product API-1491")
	public void user_hits_GET_the_api_1491() {     
		response = getHybApiEN().getAPI_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1326());
		
	}
	@When("user hits the GET method product API for en ca locale")
	public void user_hits_GET_product_API_for_en_ca_locale() {     
		response = getHybApiENCA().getAPI_EN_CAURL(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1326());
		
	}
}
