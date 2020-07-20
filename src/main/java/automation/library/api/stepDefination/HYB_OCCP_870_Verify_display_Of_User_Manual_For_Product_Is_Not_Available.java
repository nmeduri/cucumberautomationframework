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

public class HYB_OCCP_870_Verify_display_Of_User_Manual_For_Product_Is_Not_Available extends BaseStep {

	RequestSpecification request;
	
	@When("user hits the GET api of user manual link without locale")
	public void user_hits_the_api_of_user_manual_link_without_locale() {

		Log.message("URL:- " + url, true);
		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1335());

	}
	
	
	@Then("User Manual link is not displayed")
	public void user_manaul_link_is_not_displayed_in_response() {
		
		Assert.assertEquals(null, response.jsonPath().get("productManualLink"));
		Log.message("User Manual Link is not Displayed" , true);
	}

}
