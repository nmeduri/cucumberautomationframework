package automation.library.api.stepDefination;

import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.pojo.response.CTBVT_Response;
import automation.library.api.pojo.response.Catalog_BVT_Response;
import automation.library.api.pojo.response.Catalogs_List_BVT_Response;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
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

public class HYB_OCCP_874_Verify_Warranty_Message_Is_Not_Null_And_Locale_Is_EN_CA_Step extends BaseStep {

	RequestSpecification request;

	@And("returned JSON should have warranty message name and its value in en_ca locale")
	public void returned_response_should_have_warranty_messge_name_and_value_in_en_ca_locale() {
		Log.message("Warrany Message:- " + response.jsonPath().get("warranty.warrantyMessage"), true);
		String sWarrantyMessage = response.jsonPath().get("warranty.warrantyMessage");
		Assert.assertEquals("warfr", sWarrantyMessage);
		Assert.assertNotEquals(null, response.jsonPath().get("warranty.warrantyMessage"));
	}

}
