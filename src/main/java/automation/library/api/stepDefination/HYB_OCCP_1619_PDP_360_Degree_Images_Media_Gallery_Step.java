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

public class HYB_OCCP_1619_PDP_360_Degree_Images_Media_Gallery_Step extends BaseStep {

	RequestSpecification request;

	@Then("response JSON should have medias section")
	public void response_should_have_medias_section() {

		Assert.assertNotEquals(null, response.jsonPath().get("medias"));
		Log.message("Section 'medias' is displayed in JSON response.", true);

	}
	
	@Then("response should have medias section with name and its value")
	public void response_should_have_medias_section_with_name_and_its_value() {
		
		PageObject.verifySectionValueResponseNotNull(response.jsonPath().get("medias.name"));
		Assert.assertNotEquals(null, response.jsonPath().get("medias"));
		
	}
	
	@Then("medias section should have in response without mediaType name and its value")
	public void response_should_have_medias_section_without_mediaType_name_and_its_value() {

		PageObject.verifySectionResponseNull(response.jsonPath().get("medias.mediaType"));
		Log.message("Section 'Media Types' is not displayed in JSON response.", true);
		Assert.assertNotEquals(null, response.jsonPath().get("medias"));
		Log.message("Section 'medias' is displayed without mediaType name and its value.", true);

	}

	@And("user able to see media section with code")
	public void user_able_to_see_media_section_with_codes() {

		Assert.assertNotEquals(null, response.jsonPath().get("medias.code"));
		Log.message("Section 'Code' is displayed in JSON response.", true);

	}

	@And("user should be able to see media section with code and its value")
	public void user_should_be_able_to_see_media_section_with_code_and_its_value() {

		List<String> mediaCode = new ArrayList<String>();
		mediaCode.add("Code1");
		mediaCode.add("Code2");
		mediaCode.add("Code3");
		mediaCode.add("Code4");
		mediaCode.add("Code8");

		PageObject.verifyResponseValue(mediaCode, response.jsonPath().get("medias.code"));

	}

	@And("user able to see media section with media type")
	public void user_able_to_see_media_section_with_media_type() {

		Assert.assertNotEquals(null, response.jsonPath().get("medias.mediaType"));
		Log.message("Section 'Media Types' is displayed in JSON response.", true);

	}

	@And("media type value should be Images_360 in response")
	public void media_type_value_should_be_images_360_in_response() {
		
		List<String> mediaType = response.jsonPath().get("medias.mediaType");
		Assert.assertTrue(mediaType.contains("IMAGES_360"));

	}
	
	@And("response JSON should have medias name")
	public void response_should_have_medias_section_with_name() {
		
		PageObject.verifySectionResponseNotNull(response.jsonPath().get("medias.name"));

	}
	

}
