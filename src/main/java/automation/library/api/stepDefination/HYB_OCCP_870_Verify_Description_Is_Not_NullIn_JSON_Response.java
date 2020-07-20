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

public class HYB_OCCP_870_Verify_Description_Is_Not_NullIn_JSON_Response extends BaseStep {

	Response responseEN;
	Response responseENCA;
	Response responseFRCA;
	RequestSpecification request;
	
	@When("user hits the API")
	public void user_hits_the_api() {     
 
		response = getHybApiEN().getAPI_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1326());
		responseEN = response;
		response = getHybApiENCA().getAPI_EN_CAURL(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1326());
		responseENCA = response;
		response = getHybApiFRCA().getAPI_FR_CA(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1326());
		responseFRCA = response;
	}

	
	@Then("user should be able to see product Description and its value in en in JSON Response")
	public void user_should_be_able_to_see_product_description_and_its_value_in_en() {
		
		Assert.assertEquals("Yardworks 40V Cordless Snowthrower, 16-in", responseEN.jsonPath().get("description"));
		Log.message("User is able to see product Description and its value in en.", true);
	}
	
	@And("user should be able to see product Description and its value in en_CA")
	public void user_should_be_able_to_see_product_description_and_its_value_in_en_CA() {
		
		Assert.assertEquals("Souffleuse à neige sans fil Yardworks, 40 V, 16 po", responseENCA.jsonPath().get("description"));
		Log.message("User is able to see product Description and its value in en_CA.", true);
	}
	
	@And("user should be able to see product Description and its value in en FR")
	public void user_should_be_able_to_see_product_description_and_its_value_in_en_FR() {
		
		Assert.assertEquals("Yardworks 40V Cordless Snowthrower, 16-in", responseFRCA.jsonPath().get("description"));
		Log.message("User is able to see product Description and its value in fr_CA.", true);
	}

}
