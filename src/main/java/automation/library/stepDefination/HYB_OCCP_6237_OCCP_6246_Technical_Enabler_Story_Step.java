package automation.library.stepDefination;

import java.util.List;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-6237- OCCP-6246
 */
public class HYB_OCCP_6237_OCCP_6246_Technical_Enabler_Story_Step extends BaseStep{

	RequestSpecification request;
	
	@Then("in the JSON  Medias should be displayed with all the data")
	public void in_the_JSON_Medias_should_be_displayed_with_all_the_data() {

		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.media"));
		Log.message("Section 'medias' is displayed in JSON response." +response.jsonPath().get("productsList.media") , true);
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.media.altText"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.media.code"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.media.damPath"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.media.isListingThumbnailImage"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.media.isPrimary"));
		
		List<String> mediaType = response.jsonPath().get("productsList.media.mediaType");
		Assert.assertTrue(mediaType.contains("LIFESTYLE_IMAGE"));

		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.media.name"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.media.url"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.media.videoImageThumbnailDAMPath"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.media.videoImageThumbnailURL"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.name"));
	}
	
	@When("4809-hits the multiple variant products list api")
	public void hits_the_multiple_variant_products_list_api_4809() {
		response = getHybApiEN().post_HYB_2ProductList_EN(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2169(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1709());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	
	
	
	
	
}
