package automation.library.stepDefination;

import java.util.List;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;
/**
 * This file contains the scenario of user stories OCCP-3054
 */
public class HYB_OCCP_3054_Analytics_Product_Recommendation_Click_Step extends BaseStep{
	RequestSpecification request;

	@When("user hits product list api for EN")
	public void user_hits_productlist_api_En() {
		response = getHybApiEN().post_HYB_ProductList_EN(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3098_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3098_P2(), FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3098_P3());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@Then("Ratings are displayed")
	public void Ratings_are_displayed() {
		//List<String> list= response.jsonPath().get("productsList.rating.averageRating");
		//Log.message("list:"+list, true);
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.rating.averageRating"));
		Log.message("Rating are displayed in JSON response :"+response.jsonPath().get("productsList.rating.averageRating"), true);
	}
	
	@And("Reviews are displayed")
	public void Reviews_are_displayed() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.rating.numberOfReviews"));
		Log.message("Reviews are displayed in JSON response :"+response.jsonPath().get("productsList.rating.numberOfReviews"), true);
	}
	
	@When("user hits product list api for fr_CA")
	public void user_hits_productlist_api_fr_CA() {
		response = getHybApiFRCA().post_HYB_ProductList_fr_CA(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3098_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3098_P2());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	
	@When("user hits variant product list api for EN")
	public void user_hits_variant_productlist_api_En() {
		response = getHybApiEN().post_HYB_VariantProductList_EN(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3099_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3099_P2());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	
	@When("user hits variant product list api for fr_CA")
	public void user_hits_variant_product_api_fr_CA() {
		response = getHybApiFRCA().post_HYB_ProductList_fr_CA(url,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3099_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3099_P2());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
}
