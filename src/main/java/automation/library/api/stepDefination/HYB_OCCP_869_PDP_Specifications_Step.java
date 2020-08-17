package automation.library.api.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
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

public class HYB_OCCP_869_PDP_Specifications_Step extends BaseStep {

	RequestSpecification request;
	
	@Then("returned JSON should have specifications section")
	public void returned_should_have_specifications_section() {

		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("specifications"));

	}
	
	@Then("retunred JSON should have feature unit names and value")
	public void returned_response_should_have_feature_unit_names_and_value() {
		
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("specifications.features.featureUnit.name"));
		Log.message("Feature Unit:- " + response.jsonPath().get("specifications.features.featureUnit.name"), true);
		
		PageObject.verifyLanguageInList(response.jsonPath().get("specifications.features.featureUnit.name").toString(), "centimeter");
		
	}
	
	@Then("retunred response should have feature unit names and value in fr ca")
	public void returned_response_should_have_feature_unit_names_and_value_in_fr_ca() {
		
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("specifications.features.featureUnit.name"));
		Log.message("Feature Unit:- " + response.jsonPath().get("specifications.features.featureUnit.name"), true);
		
		PageObject.verifyLanguageInList(response.jsonPath().get("specifications.features.featureUnit.name").toString(), "centimètre");
		
	}
 
}
