package automation.library.api.stepDefination;

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

public class HYB_OCCP_983_PDP_Features_Step extends BaseStep {

	RequestSpecification request;

	@Then("returned JSON should display feature Bullets section")
	public void returned_response_should_display_feature_bullets_section() {

		Assert.assertNotEquals(null, response.jsonPath().get("featureBullets"));
		Log.message("Section 'Feature Bullets' is displayed in JSON response.", true);

	}

	@And("returned JSON should display feature description")
	public void returned_response_should_display_feature_description() {

		Assert.assertNotEquals(null, response.jsonPath().get("featureBullets.description"));
		Log.message("Section 'Feature Bullets' is displayed in JSON response.", true);

	}

	@And("returned JSON should display description value in locale en")
	public void retunred_response_should_displaye_description_value_in_locale_en() {
		List<String> featureDescription = new ArrayList<String>();
		featureDescription.add(
				"CANVAS Breton Patio Arm Chair features sturdy, durable steel frames that promote long-lasting use");
		featureDescription.add(
				"Frame surfaces are treated with an electrodepostition coating for added rust-resistance, along with a weather-resistant high-performance powder-coating");
		featureDescription.add(
				"Hand-woven, all-weather wicker provides a comfortable, elegant appearance and durable craftsmanship");

		PageObject.verifyResponseValue(featureDescription, response.jsonPath().get("featureBullets.description"));

	}
	
	@And("returned JSON should display description value in fr ca")
	public void retunred_response_should_displaye_description_value_in_fr_ca() {
		List<String> featureDescription=new ArrayList<String>();
		featureDescription.add("Fauteuil de jardin CANVAS Breton robuste, durable, avec cadre en acier soudé pour une utilisation à long terme");
		featureDescription.add("Surface de cadres avec revêtement électroappliqué pour une résistance accrue à la rouille, et revêtement peint par poudrage de haute performance pour une résistance accrue aux intempéries");
		featureDescription.add("En osier tressé à la main, à l’épreuve des intempéries, offrant une apparence élégante, confortable et durable");

		
		PageObject.verifyResponseValue(featureDescription, response.jsonPath().get("featureBullets.description"));
		
		
		
	}

}
