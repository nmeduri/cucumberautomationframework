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

public class HYB_OCCP_870_Verify_Display_Product_Code_In_JSON_Response extends BaseStep {

	RequestSpecification request;
	
	

	
	@When("user should able to see the product code in the JSON response")
	public void user_should_be_able_to_see_product_code_in_the_response() {
		
		Log.message("Product Code:- " + response.jsonPath().get("code"), true);
		Assert.assertNotEquals(null, response.jsonPath().get("code"));
		Assert.assertEquals(FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1335(), response.jsonPath().get("code"));
		Log.message("User is able to see product Code in JSON Response.", true);
	}
}
