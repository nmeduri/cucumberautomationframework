package automation.library.stepDefination;

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

public class HYB_OCCP_983_PDP_Features_Step extends BaseStep {

	RequestSpecification request;

	@Then("returned JSON should display feature Bullets section")
	public void returned_response_should_display_feature_bullets_section() {

		Assert.assertNotEquals(null, response.jsonPath().get("featureBullets"));
		Log.message("Section 'Feature Bullets' is displayed in JSON response.", true);

	}

	@And("returned JSON should display feature description")
	public void returned_response_should_display_feature_description() {
		List<String> featureBulletsDescription = response.jsonPath().get("featureBullets");
		Assert.assertFalse(featureBulletsDescription.contains(null));

	}

	@And("returned JSON should display description value in locale en")
	public void retunred_response_should_displaye_description_value_in_locale_en() {
		List<String> featureDescription = new ArrayList<String>();
		featureDescription.add(
				"Yardworks 40V Snowthrower is ideal for smaller properties and clears snow easily without the hassle of gas or a cordPowered by an 40V 4Ah lithium-ion battery that is compatible across the entire 40V Yardworks/Greenworks programFoam grip ergonomic handle adds to the comfort and ease of use");

		PageObject.verifyResponseValue(featureDescription, response.jsonPath().get("featureBullets"));

	}
	
	@And("returned JSON should display description value in fr ca")
	public void retunred_response_should_displaye_description_value_in_fr_ca() {
		List<String> featureDescription=new ArrayList<String>();
		featureDescription.add("Tondeuse à plateau en poly 2-en-1 Yardworks 48 V 3 Ah alimentée par une pile de 48 V 3 Ah conçue pour un excellent rendementAvec plateau en poly de 43,2 cm (17 po) service intense, impact élevé qui rend la tondeuse légère et facile à manoeuvrerBatterie 48 V avec la nouvelle technologie AeroCore permettant à l'air circuler dans la pile, ce qui réduit le risque de surchauffe");
		
		PageObject.verifyResponseValue(featureDescription, response.jsonPath().get("featureBullets"));
		
		
	}

}
