package automation.library.api.stepDefination;
import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_EN_End_Point;
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

public class HYB_OCCP_870_Verify_Display_Of_Product_Brand_Title extends BaseStep {

	RequestSpecification request;
	
	@When("user hits the GET api with Default")
	public void user_hits_the_api_with_default() {

		Log.message("URL:- " + url, true);
		response = getApiFieldDefault().getAPI_Field_Default(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1335());
	}
	
	
	@Then("user should able to see the product brand title in the JSON response")
	public void user_should_able_to_see_the_product_brand_int_the_JSON_response() {

		String sDescription = response.jsonPath().get("productBrand");
		Assert.assertNotEquals(null, sDescription);
	}
	
	@And("user should able to see the product brand title's value in the JSON response")
	public void user_should_able_to_see_the_product_brand_title_value() {
		
		Log.message("Brand:- "+ response.jsonPath().get("productBrand"), true);
		Assert.assertEquals("Yardworks", response.jsonPath().get("productBrand"));
		Log.message("Product Brand Title's value is displayed in JSON Response", true);
	}

}
