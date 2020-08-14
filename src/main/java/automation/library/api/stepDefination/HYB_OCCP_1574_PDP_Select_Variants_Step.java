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

public class HYB_OCCP_1574_PDP_Select_Variants_Step extends BaseStep {

	RequestSpecification request;
	
	@When("user hits GET api")
	public void user_hits_the_api_without_locale_1336() {

		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1336());

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
 
}
