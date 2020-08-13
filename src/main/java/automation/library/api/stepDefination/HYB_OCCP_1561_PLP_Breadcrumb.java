package automation.library.api.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

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
import automation.library.selenium.core.PageObject;
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

public class HYB_OCCP_1561_PLP_Breadcrumb extends BaseStep {

	RequestSpecification request;
	
	@When("user hits design outbound api")
	public void user_hits_design_outbound_api() {

		response = getHybApiEN().get_Design_Outbound_API_EN(url);

	}
	
	@When("user hits api design outbound for fr ca")
	public void user_hits_design_outbound_api_fr_ca() {

		response = getHybApiFRCA().get_Design_Outbound_API_FR_CA(url);

	}

	@Then("user should be to see category id")
	public void user_should_be_to_see_category_id() {
		
		PageObject.verifyExpectedResponseWithoutList("tools-hardware", response.jsonPath().get("id"));

		
	}
	
	@Then("user able to see category id for fr ca in response")
	public void user_should_be_to_see_category_id_for_fr_ca() {
		
		PageObject.verifyExpectedResponseWithoutList("tools-hardware", response.jsonPath().get("id"));

		
	}
	
	@And("user should be to see category name")
	public void user_should_be_to_see_category_name() {
		
		PageObject.verifyExpectedResponseWithoutList("tools-hardware", response.jsonPath().get("name"));
		
	}
	
	@And("user should be to see category url")
	public void user_should_be_to_see_category_url() {
		
		PageObject.verifyExpectedResponseWithoutList("/canadiantire/catalogs/ctcCanadianTireProductCatalog/Online/categories/tools-hardware", response.jsonPath().get("name"));
		
	}
	
	@And("user able to see category name in JSON response for fr ca")
	public void user_should_be_to_see_category_name_for_fr_ca() {
		
		PageObject.verifyExpectedResponseWithoutList("outils-matériel", response.jsonPath().get("name"));
		
	}
	
	@And("user able to see category url for fr ca in response")
	public void user_should_be_to_see_category_url_for_fr_ca() {
		
		PageObject.verifyExpectedResponseWithoutList("/canadiantire/catalogs/ctcCanadianTireProductCatalog/Online/categories/tools-hardware", response.jsonPath().get("name"));
		
	}
 
}
