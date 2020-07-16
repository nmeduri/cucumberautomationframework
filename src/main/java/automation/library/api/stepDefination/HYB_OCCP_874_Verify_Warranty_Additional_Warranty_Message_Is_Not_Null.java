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

public class HYB_OCCP_874_Verify_Warranty_Additional_Warranty_Message_Is_Not_Null extends BaseStep {

	RequestSpecification request;

	@Then("returned JSON should have additional warranty message name and value")
	public void returned_response_should_have_additional_warranty_message_name_and_vale() {

		Assert.assertNotEquals(null, response.jsonPath().get("warranty.additionalWarrantyMessage"));
		Log.message("'Warranty Addional Message' is not null.", true);

	}

	@And("returned JSON should have additional warranty message name value should display in default locale as en")
	public void returned_response_should_have_addional_warranty_message_in_default_local_as_en() {

		Assert.assertEquals("This product  carries a 1 year exchange warranty redeemable at any Canadian Tire store",
				response.jsonPath().get("warranty.additionalWarrantyMessage"));

	}

}
