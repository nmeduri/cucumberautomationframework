package automation.library.api.stepDefination;
import java.util.List;

import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.pojo.response.CTBVT_Response;
import automation.library.api.pojo.response.Catalog_BVT_Response;
import automation.library.api.pojo.response.Catalogs_List_BVT_Response;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
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
	
	@When("user hits the API")
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

		response = getApiFieldDefault().getAPI_Field_Default(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1335());
	}

	
	@Then("user should be able to see product Description and its value in en in JSON Response")
	public void user_should_be_able_to_see_product_description_and_its_value_in_en() {
		
		Assert.assertEquals("Yardworks 40V Cordless Snowthrower, 16-in", responseEN.jsonPath().get("description"));
		Log.message("User is able to see product Description and its value in en.", true);
	}
	
	@Then("user should able to see the product brand title in the JSON response")
	public void user_should_able_to_see_the_product_brand_int_the_JSON_response() {

		String sDescription = response.jsonPath().get("productBrand");
		Assert.assertNotEquals(null, sDescription);
	}
	
	@Then("User Manual link is not displayed")
	public void user_manaul_link_is_not_displayed_in_response() {
		
		Assert.assertEquals(null, response.jsonPath().get("productManualLink"));
		Log.message("User Manual Link is not Displayed" , true);
	}
	
	@And("user should able to see the product brand title's value in the JSON response")
	public void user_should_able_to_see_the_product_brand_title_value() {
		
		Log.message("Brand:- "+ response.jsonPath().get("productBrand"), true);
		Assert.assertEquals("Patio Arm Chair", response.jsonPath().get("productBrand"));
		Log.message("Product Brand Title's value is displayed in JSON Response", true);
	}
	
	@And("user should be able to see product Description and its value in en_CA")
	public void user_should_be_able_to_see_product_description_and_its_value_in_en_CA() {
		
		Assert.assertEquals("Souffleuse à neige sans fil Yardworks, 40 V, 16 po", responseENCA.jsonPath().get("description"));
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
		Assert.assertEquals("CANVAS Bretons", response.jsonPath().get("description"));
	}
	
	
}
