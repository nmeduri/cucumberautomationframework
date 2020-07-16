package automation.library.api.stepDefination;

import java.util.List;

import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_FR_CA_End_Point;
import automation.library.api.endpoint.HYB_Api_Product_End_Point;
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

public class HYB_OCCP_874_Verify_Warranty_Type_Is_Not_Null extends BaseStep {

	RequestSpecification request;

	@When("user hits the GET api without locale")
	public void user_hits_the_api_without_locale() {

		Log.message("URL:- " + url, true);
		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1411());

	}

	@Then("returned JSON should have warranty section without locale")
	public void returned_response_should_have_warranty_section_without_locale() {
		Assert.assertNotEquals(null, response.jsonPath().get("warranty"));
		Log.message("Section 'Warranty' is Displayed.", true);
	}

	@And("returned JSON should have warranty type name and value")
	public void returned_response_have_warranty_type() {

		Log.message("Warranty Type :- " + response.jsonPath().get("warranty.warrantyType"), true);
		Assert.assertNotEquals(null, response.jsonPath().get("warranty.warrantyType"));
		Log.message("Section 'Warranty Type' is Displayed.", true);
	}

	@And("value should display in default locale as en")
	public void value_should_display_in_default_locale_as_en() {

		Assert.assertEquals("Expressed", response.jsonPath().get("warranty.warrantyType"));

	}

}
