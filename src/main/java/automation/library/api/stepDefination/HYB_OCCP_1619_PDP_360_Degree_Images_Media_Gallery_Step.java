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
	
		List<String> mediaName = response.jsonPath().get("medias.name");
		Assert.assertTrue(mediaName.contains("CANVAS Breton Patio Arm Chair"));
		Assert.assertNotEquals(null, response.jsonPath().get("medias"));
		
	}

	@Then("response JSON should have section medias with name and its value in english")
	public void response_should_have_section_medias_with_name_and_value_in_en() {

		PageObject.verifyNotNullResponse(response.jsonPath().get("medias.name"), "CANVAS Breton Patio Arm Chair");
		PageObject.verifyNullResponse(response.jsonPath().get("medias.name"), "Fauteuil de jardin CANVAS Breton");
	}
	
	@Then("JSON should have medias section with name and its value in en CA")
	public void response_should_have_medias_section_with_name_and_its_value_in_en_ca() {
		PageObject.verifyNotNullResponse(response.jsonPath().get("medias.name"), "CANVAS Breton Patio Arm Chair");
		PageObject.verifyNullResponse(response.jsonPath().get("medias.name"), "Fauteuil de jardin CANVAS Breton");
	}
	
	@Then("response JSON should have medias with name and value in fr_ca")
	public void response_should_have_medias_section_with_name_and_value_in_fr_ca() {
		PageObject.verifyNotNullResponse(response.jsonPath().get("medias.name"), "Fauteuil de jardin CANVAS Breton");
		PageObject.verifyNullResponse(response.jsonPath().get("medias.name"), "CANVAS Breton Patio Arm Chair");
		
	}
	
	@Then("response should have medias section without name and its value")
	public void response_should_have_medias_section_without_name_and_its_value() {
		List<String> mediaName = response.jsonPath().get("medias.name");
		Log.message("Media Name:- " + mediaName, true);
		Assert.assertTrue(mediaName.contains(null));
		Assert.assertNotEquals(null, response.jsonPath().get("medias"));
	}

	@Then("medias section should have in response without mediaType name and its value")
	public void response_should_have_medias_section_without_mediaType_name_and_its_value() {

		List<String> resp = response.jsonPath().get("medias.mediaType");
		Assert.assertTrue(resp.contains(null));
		Log.message("Section 'medias' is displayed without mediaType name and its value.", true);

	}
	
	@Then("response JSON should have section medias with externalURL and its value")
	public void response_should_have_section_medias_with_externalurl_and_its_value() {
		List<String> mediaName = response.jsonPath().get("medias.url");
		Assert.assertTrue(mediaName.contains("https://canadiantire.scene7.com/is/image/CanadianTire/0882184_1?defaultImage=image_na_EN&fmt=jpg&fit=constrain,1&wid=573&hei=499"));
		Assert.assertNotEquals(null, response.jsonPath().get("medias"));
	}
	
	@Then("response should have medias with damPath and its value")
	public void response_should_have_medias_with_damPath_and_its_value() {

		PageObject.verifyNotNullResponse(response.jsonPath().get("medias.damPath"), "/content/dam/canadiantire/Cooking%20pan.PNG");
		
	}
	
	@Then("response should have medias without externalUrl and its value")
	public void response_should_have_medias_without_external_url_and_its_value() {
		
		PageObject.verifySectionValueResponseNull(response.jsonPath().get("medias.url"));
	}
	
	@Then("response should have medias without damPath and its value")
	public void response_should_have_medias_without_dampath_and_its_value() {
		PageObject.verifySectionValueResponseNull(response.jsonPath().get("medias.damPath"));
	}

	@Then("response should have medias with order and its value")
	public void response_should_have_medias_with_order_and_its_value() {
		PageObject.verifyNotNullResponse(response.jsonPath().get("medias.order"), "1");
	}
	
	@Then("response should have medias section with isPrimary and its value")
	public void response_should_have_medias_with_isPrimary_and_its_value() {
		Log.message("isPrimary:- " + response.jsonPath().get("medias.isPrimary"), true);
		List<String> resp = response.jsonPath().get("medias.isPrimary");
		Assert.assertTrue(resp.contains(true));
	}
	
	@Then("JSON response should have medias section with isListingThumbnailImage and value")
	public void response_should_have_medias_with_isListingThumbnailImageL_and_its_value() {
		Log.message("Listing Image:- " + response.jsonPath().get("medias.isListingThumbnailImage"), true);
		List<String> resp = response.jsonPath().get("medias.isListingThumbnailImage");
		Assert.assertTrue(resp.contains(false));
	}

//	@Then("JSON response should have medias section with isListingThumbnailImage and value")
//	public void response_should_have_medias_with_isListingThumbnailImage_and_its_value() {
//		PageObject.verifyNotNullResponse(response.jsonPath().get("medias.isListingThumbnailImage"), "https://canadiantire.scene7.com/is/image/CanadianTire/0882184_1?&layer=comp&fit=constrain,1&wid=45&hei=45&fmt=jpg");
//	}
	
	@Then("response should have medias section with videoImageThumbnailURL and its value")
	public void response_should_have_medias_with_videoImageThumbnailURL_and_its_value() {
		PageObject.verifyNotNullResponse(response.jsonPath().get("medias.videoImageThumbnailURL"), "https://canadiantire.scene7.com/is/image/CanadianTire/0882184_1?&layer=comp&fit=constrain,1&wid=45&hei=45&fmt=jpg");
	}
	
	@Then("response should have medias section with videoImageThumbnailDAMPath and its value")
	public void response_should_have_medias_with_videoImageThumbnailDAMPath_and_its_value() {
		PageObject.verifyNotNullResponse(response.jsonPath().get("medias.videoImageThumbnailDAMPath"), "https://canadiantire.scene7.com/is/image/CanadianTire/0882184_1?&layer=comp&fit=constrain,1&wid=45&hei=45&fmt=jpg");
	}
	
	@Then("response should have medisas section with alttext and value in english")
	public void response_should_have_medias_with_alttext_and_value_in_english() {
		PageObject.verifyNotNullResponse(response.jsonPath().get("medias.altText"), "CANVAS Breton Patio Arm Chair");
		PageObject.verifyNullResponse(response.jsonPath().get("medias.altText"), "Fauteuil de jardin CANVAS Breton");
	}
	
	@Then("JSON response should have medias section with alttext and value in fr_CA")
	public void response_should_have_medias_section_with_alttext_and_value_in_fr_CA() {
		PageObject.verifyNotNullResponse(response.jsonPath().get("medias.altText"), "Fauteuil de jardin CANVAS Breton");
		PageObject.verifyNullResponse(response.jsonPath().get("medias.name"), "CANVAS Breton Patio Arm Chair");
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
		mediaCode.add("Code5");
		mediaCode.add("Code6");
		mediaCode.add("Code7");
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
