package automation.library.stepDefination;
import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
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

public class HYB_OCCP_871_PDP_Installations_Step extends BaseStep {

	RequestSpecification request;
	
	
	@When("user hits the GET method without locale for service installation")
	public void user_hits_the_get_meethod_without_locale_for_service_installation_api() {

		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1365());

	}

	
	@Then("returnred JSON should have service installation")
	public void returned_response_should_have_service_installation() {     

		Assert.assertNotEquals(null, response.jsonPath().get("serviceInstallationMessage"));
		
	}
	
	@Then("returned JSON response should not have service installation name and value")
	public void returned_response_should_not_have_service_installation_name_and_value() {
		
		Assert.assertEquals(null, response.jsonPath().get("serviceInstallationMessage"));
		
	}
	
	@And("returned JSON should have value in en ca")
	public void returned_response_should_have_value_in_en_ca() {
		
		Assert.assertEquals("Our Extended Warranty plans secure your products from defects & failures, year after year.", response.jsonPath().get("serviceInstallationMessage"));
		
	}
	
	@And("returned JSON should have value in default locale en") 
	
	public void returned_response_should_have_value_in_default_locale_en(){
		
		Assert.assertEquals("Our Extended Warranty plans secure your products from defects & failures, year after year.", response.jsonPath().get("serviceInstallationMessage"));
		
	}
	
	@And("returned JSON should have value in fr ca")
	public void returned_response_should_have_value_in_fr_ca() {
		
		Assert.assertEquals("Nos plans de garantie prolongée protègent vos produits contre les défauts et les pannes, année après année.", response.jsonPath().get("serviceInstallationMessage"));
		
	}
	

}
