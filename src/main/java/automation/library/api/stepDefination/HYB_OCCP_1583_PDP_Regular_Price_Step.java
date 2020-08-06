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

public class HYB_OCCP_1583_PDP_Regular_Price_Step extends BaseStep {

	RequestSpecification request;
	
	@When("user hits api for variant option")
	public void user_hits_locale_api_for_variant_option() {
		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1364());
	}
	
	@Then("returned JSON should display only price for different price type")
	public void returned_should_display_only_price_for_different_price_type() {

		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productPrices.value"));

	}
	
	@Then("returned JSON should display same price for different variant")
	public void returned_response_should_display_same_price_for_different_variant() {
		
		Log.message("Price:- " + response.jsonPath().get("variantOptions.variantProductPrices.value"), true);
		List<String> price = response.jsonPath().get("variantOptions.variantProductPrices.value");
		for(int i=0; i<price.size(); i++) {
			Assert.assertEquals(price.get(0), price.get(i));
		}
	}
	
	@Then("returned JSON should display price range")
	public void returned_should_display_price_range() {

		Assert.assertNotNull(response.jsonPath().get("priceRange"));
		
	}
	
	@Then("returned JSON Should display  only price")
	public void returned_should_display_only_price() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productPrices.value"));
	}
 
}
