package automation.library.stepDefination;

import java.util.List;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

/**
 * This file contains the scenario of user stories OCCP-1657
 */
public class HYB_OCCP_1657_PDP_Product_Badge_Loyalty_Offers_Step extends BaseStep{
	RequestSpecification request;


	@Then("user should be able to see LOYALTYOFFERS badge under badges container")
	public void user_should_be_able_to_see_LOYALTYOFFERS_badge_under_badges_container() {

		Log.message("Response badge:- "  + response.jsonPath().get("badges"), true);
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("badges"));
		String badges=response.jsonPath().get("badges").toString();		
		Assert.assertTrue(badges.contains("LOYALTY"));
		List<String> list = response.jsonPath().get("variantOptions.variantProductPrices.ctcPriceType");
		Log.message("List 1: "+ list.toString(), true);
		Assert.assertTrue(list.toString().contains("LOYALTY_OFFER"));
		List<String> list2 = response.jsonPath().get("productPrices.ctcPriceType");
		Log.message("List 2: "+ list2.toString(), true);
		Assert.assertTrue(list2.toString().contains("LOYALTY_OFFER"));

	}
	@When("user hits the GET method product API-1966")
	public void user_hits_GET_product_API_for_en_ca_locale_1966() {     
		response = getHybApiENCA().getAPI_EN_CAURL(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1493());

	}
}
