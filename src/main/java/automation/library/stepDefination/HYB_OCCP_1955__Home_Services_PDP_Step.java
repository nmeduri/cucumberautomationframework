package automation.library.stepDefination;

import org.testng.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-1955
 */
public class HYB_OCCP_1955__Home_Services_PDP_Step extends BaseStep {
	RequestSpecification request;
	
	@When("user hits GET method for home services")
	public void user_Hits_Get_Method_For_Home_Services() {
		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4303());
	}
	
	@Then("homeService true should be displayed in the response")
	public void homeService_True_Should_Be_Displayed_In_The_Response() {
		boolean homeservice =response.jsonPath().get("homeService");
		Assert.assertEquals(true, homeservice);
		Log.message("homeService :- "  + homeservice, true);
	}
	
	@And("warranty message should be displayed-4303")
	public void warranty_Message_Should_Be_Ddisplayed_4303() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("warranty.warrantyMessage"));
	}
	
	@And("Badges should not be displayed-4303")
	public void badges_Should_Not_Be_Displayed_4303() {
		Assert.assertNull(response.jsonPath().get("badges"));
		Log.message("Response badge:- "  + response.jsonPath().get("badges"), true);
	}
	
	@And("Specifications are NOT displayed-4303")
	public void specifications_Are_Not_Displayed_4303() {
		Assert.assertNull(response.jsonPath().get("specifications"));
		Log.message("specifications :- "  + response.jsonPath().get("specifications"), true);
	}
	@And("Ratings should be displayed-4303")
	public void ratings_Should_Be_Displayed_4303() {
		PageObject.notNullAttributeInResponse(Float.toString(response.jsonPath().get("rating.averageRating")));
		PageObject.notNullAttributeInResponse(Integer.toString(response.jsonPath().get("rating.numberOfReviews")));
	}
	@And("Image Gallary should be dsiplayed")
	public void image_Gallary_Should_Be_Dsiplayed() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("medias").toString());
		PageObject.notNullAttributeInResponse(response.jsonPath().get("medias.mediaType").toString());
	}
	@When("user hits GET method for variant product home services")
	public void user_Hits_Get_Method_For_Variant_Product_Home_Services() {
		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4304());
	}
	@When("user hits GET method for base product without variants-home services")
	public void user_Hits_Get_Method_For_Without_Variants_4305() {
		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4305());
	}
}
