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

public class HYB_OCCP_874_Verify_Warranty_Additional_Warranty_Message_Is_Null_EN_Step extends BaseStep {

	RequestSpecification request;
	
	@When("user hits the GET additional warranty api with locale en")
	public void user_hits_the_additional_warranty_api_with_locale_en() {     

		response = getHybApiEN().getAPI_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1413());
		
	}

	
	@SuppressWarnings("deprecation")
	@Then("returned JSON should have warranty section without additional Warranty Message name and value")
	public void returned_response_should_have_warranty_section_without_additional_warranty_message_name_and_value() {
		
		
		Assert.assertEquals(null, response.jsonPath().get("warranty.additionalWarrantyMessage"));
		Log.message("'Additional Warranty Message' is not Displayed.",true);
		Assert.assertNotEquals(null, response.jsonPath().get("warranty"));
		Log.message("Section 'Warranty' is Displayed without additional Warranty Message and value.",true);
		
		
	}
	

}
