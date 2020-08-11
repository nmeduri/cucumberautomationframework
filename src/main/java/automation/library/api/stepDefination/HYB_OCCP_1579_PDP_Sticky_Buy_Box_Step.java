package automation.library.api.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.api.pojo.response.CTBVT_Response;
import automation.library.api.pojo.response.Catalog_BVT_Response;
import automation.library.api.pojo.response.Catalogs_List_BVT_Response;
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

public class HYB_OCCP_1579_PDP_Sticky_Buy_Box_Step extends BaseStep {

	RequestSpecification request;

	@Then("product brand should be displayed in JSON response")
	public void product_brand_should_be_displayed_in_response() {
		
		Log.message("Brand:- " + response.jsonPath().get("productBrand"), true);
		PageObject.notNullAttributeInResponse(response.jsonPath().get("productBrand"));
		
	}
	
	@Then("product title should be displayed in JSON response")
	public void product_title_should_be_displayed_in_response() {
		
		PageObject.notNullAttributeInResponse(response.jsonPath().get("name"));
		
	}
	
	@Then("product price should be displayed in JSON response")
	public void product_price_should_be_displayed_in_response() {
		Log.message("Product price:- " + response.jsonPath().get("productPrices"), true);
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productPrices"));
	}
	
	@Then("response JSON should have product title name and its value in fr ca")
	public void response_should_have_product_title_name_and_its_value_in_fr_ca() {
		Log.message("Name:-"  + response.jsonPath().get("name"), true);
		PageObject.verifyExpectedResponseWithoutList("Souffleuse à neige sans fil Yardworks, 40 V, 16 po", response.jsonPath().get("name"));
	}
	
	@Then("response should have product title name and its value in en ca")
	public void response_should_have_product_title_name_and_its_value_in_en_ca() {
		PageObject.verifyExpectedResponseWithoutList("Yardworks 40V Cordless Snowthrower, 16-in", response.jsonPath().get("name"));
	}
	
	@Then("en ca should produce English text for PDP")
	public void en_ca_should_product_english_text_for_pdp() {
		
		Log.message("Product Price:- " + response.jsonPath().getString("productPrices.formattedValue"), true);
		char sPriceFirst = response.jsonPath().getString("productPrices.formattedValue").charAt(1);
		Log.message("Character:- " + sPriceFirst, true);
		String sPrice = Character.toString(sPriceFirst);
		PageObject.verifyExpectedResponseWithoutList("$", sPrice);
	}
	
	@Then("fr ca should product French text for PDP")
	public void fr_ca_should_porduct_french_text_for_pdp() {
		
		Log.message("Product Price:- " + response.jsonPath().getString("productPrices.formattedValue"), true);
		String value = response.jsonPath().getString("productPrices.formattedValue");
		char sPriceLast = value.charAt(value.length() -2);
		Log.message("Last Character:- " + sPriceLast, true);
		String sPrice = Character.toString(sPriceLast);
		PageObject.verifyExpectedResponseWithoutList("$", sPrice);
		
	}
	
	@Then("product image should be displayed in JSON response")
	public void product_image_should_be_displayed_in_response() {
		PageObject.verifyExpectedResponseWithoutList("*****", response.jsonPath().get("image"));
	}
	

}
