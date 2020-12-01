package automation.library.stepDefination;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-2503
 */
public class HYB_OCCP_2503_PLP_SRP_Product_Badges_Step extends BaseStep{
	RequestSpecification request;
	
	@And("user should able to see error message")
	public void user_should_able_to_See_error_message() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("errors.message"));
		String error=response.jsonPath().get("errors.message").toString();
		Log.message("Error messgae :- " + response.jsonPath().get("errors.message").toString(), true);
		Assert.assertTrue(error.contains("Required String parameter 'baseStoreId' is not present"));
		
	}
	
	@When("hit the product list api without giving base store id")
	public void hit_the_productlist_api_En_without_giving_base_store_id() {
		response = getHybApiEN().post_HYB_ProductList_EN_Without_BaseStoreID(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1415(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1965());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("user hits product list api")
	public void user_hits_productlist_api_En() {
		response = getHybApiEN().post_HYB_ProductList_EN(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1415(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1965(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2188());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@And("should get error message as there is no resource for path in response")
	public void should_get_error_message_in_response() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("errors.message"));
		String error=response.jsonPath().get("errors.message").toString();
		Log.message("Error messgae :- " + response.jsonPath().get("errors.message").toString(), true);
		Assert.assertTrue(error.contains("There is no resource for path"));
		
	}
	@When("hits the product list api")
	public void hits_the_productlist_api_En() {
		response = getHybApiEN().post_HYB_2ProductList_EN(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2171(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2171());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	
	@And("should not have price data")
	public void should_not_have_price_data() {
		Log.message("Prices :- " + response.jsonPath().get("productsList.priceRanges"), true);
		List<String> list=response.jsonPath().get("productsList.priceRanges");
		list.contains(null);
	}
	@When("hits single base product list api")
	public void hits_single_base_product_list_api_En() {
		response = getHybApiEN().post_HYB_ProductList_EN_SingleProduct(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1965());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@Then("the badges that are configured for the product should return in the json response")
	public void badges_that_are_configured_for_the_product_should_return_in_the_json_response() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("productsList.badges").toString());
		Log.message("Response badge:- "  + response.jsonPath().get("productsList.badges"), true);
	}
	@When("hits single variant product list api")
	public void hits_single_variant_product_list_api_En() {
		response = getHybApiEN().post_HYB_ProductList_EN_SingleProduct(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2169());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("hits the multiple base products list api")
	public void hits_the_multiple_base_product_list_api_En() {
		response = getHybApiEN().post_HYB_2ProductList_EN(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1415(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1965());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@Then("badges that are configured for the multiple products should return in the json response")
	public void badges_that_are_configured_for_the_multiple_products_should_return_in_the_json_response() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.badges"));
		Log.message("Response badge:- "  + response.jsonPath().get("productsList.badges"), true);
	}
	@When("hits the multiple variant products list api")
	public void hits_the_multiple_variant_product_list_api_En() {
		response = getHybApiEN().post_HYB_2ProductList_EN(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2169(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2188());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	
	@When("hit product list api for product has variants and badges are applicable only to certain variants")
	public void user_hits_productlist_api_for_product_has_variants_and_badges_are_applicable_only_to_certain_variants() {
		response = getHybApiEN().post_HYB_ProductList_EN(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3092_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2188(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3092_P2());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
}
