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
import cucumber.runtime.junit.Assertions;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import test.assertion.AssertionTest;

public class HYB_OCCP_874_Verify_Warranty_Is_Null_Step extends BaseStep {

	RequestSpecification request;
	
	@SuppressWarnings("deprecation")
	@Then("returned JSON should not have warranty section without names and values")
	public void returned_response_should_not_have_warranty_section_without_warranty_message_name_and_value() {
		
		
		Assert.assertEquals(null, response.jsonPath().get("warranty.warrantyMessage"));
		Log.message("'Warranty Message and Value' are not displayed.", true);
		Assert.assertEquals(null, response.jsonPath().get("warranty"));
		Log.message("Warranty section is not displayed without names and values.", true);
		
	}
	

}
