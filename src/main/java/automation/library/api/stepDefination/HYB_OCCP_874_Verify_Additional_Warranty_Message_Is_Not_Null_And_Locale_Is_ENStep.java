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

public class HYB_OCCP_874_Verify_Additional_Warranty_Message_Is_Not_Null_And_Locale_Is_ENStep extends BaseStep {

	RequestSpecification request;
	
	@When("user hits the GET api with locale en")
	public void user_hits_the_api_with_locale_as_en() {     

		response = getHybApiEN().getAPI_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1414());
		
	}

	
	@Then("returned JSON should have warranty section in en locale")
	public void returned_response_should_have_warranty_section_in_en_locale() {
		
		Assert.assertNotEquals(null, response.jsonPath().get("warranty"));
		
	}
	
	@And("returned JSON should have additional warranty message and value in en locale")
	public void returned_response_should_have_additional_warranty_message_value_in_en_locale() {
		String sActualWarrantyAddionalMessage = response.jsonPath().get("warranty.additionalWarrantyMessage").toString();
		Assert.assertEquals("This product  carries a 1 year exchange warranty redeemable at any Canadian Tire store", sActualWarrantyAddionalMessage);
	}

}
