package automation.library.api.stepDefination;
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

public class HYB_OCCP_874_Verify_Additional_Warranty_Message_Is_Not_Null_And_Locale_Is_EN_CA_Step extends BaseStep {

	RequestSpecification request;

	@Given("occ api for warranty is available")
	public void occ_api_for_warranty_is_availeble() {
		
	    url =	getHybApiENCA().HYB_API_EN_CA(FileReaderManager.getInstance().getAPIDataReader().getProductInformationAPI());
	
	}

	
	@When("user hits the GET api with locale as en_ca")
	public void user_hits_the_api_with_locale_as_en_ca() {     

		response = getHybApiENCA().getAPI_EN_CAURL(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1415());
		
	}

	
	@Then("returned JSON should have warranty section in en_CA locale")
	public void returned_json_should_have_warranty_section_en_ca_locale() {
		
		Assert.assertNotEquals(null, response.jsonPath().get("warranty"));
		
	}
	
	@And("returned JSON should have additional warranty message name and its value in en_ca locale")
	public void returned_json_should_have_additonal_warranty_message() {
		
		String sActualWarrantyAddionalMessage = response.jsonPath().get("warranty.additionalWarrantyMessage").toString();
		Assert.assertEquals("This product carries a 1 year exchange warranty redeemable at any Canadian Tire store", sActualWarrantyAddionalMessage);
	}

}
