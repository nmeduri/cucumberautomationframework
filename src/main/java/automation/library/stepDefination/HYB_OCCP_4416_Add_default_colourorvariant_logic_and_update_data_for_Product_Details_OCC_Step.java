package automation.library.stepDefination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
/**
 * This file contains the scenario of user stories OCCP-4416
 */
public class HYB_OCCP_4416_Add_default_colourorvariant_logic_and_update_data_for_Product_Details_OCC_Step extends BaseStep{
RequestSpecification request;
	
	@When("user hits product details get method api")
	public void user_hits_product_details_get_method_api() {
		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3110());
	}
	
	@Then("user should to see variantValueCategory under variantMatrix container")
	public void user_should_to_see_variantValueCategory_under_variantMatrix_container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("variantMatrix.variantValueCategory"));
		Log.message("variantValueCategory-Color :- "  + response.jsonPath().get("variantMatrix.variantValueCategory"), true);

	}
	
	@SuppressWarnings("deprecation")
	@And("colors are displayed under variantValueCategory container")
	public void colors_are_displayed_under_variantValueCategory_container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("variantMatrix.variantValueCategory.displayName"));
		Log.message("Colors:- "  + response.jsonPath().get("variantMatrix.variantValueCategory.displayName"), true);
		List<String> actuallist= new ArrayList<>(response.jsonPath().get("variantMatrix.variantValueCategory.displayName"));
		List<String> sortedlist= actuallist;
		Collections.sort(sortedlist);
		Log.message("After sorting :"+sortedlist, true);
		Assert.assertEquals(sortedlist, actuallist);	
	}
	
	@Then("user should to see sizes variantValueCategory under variantMatrix container")
	public void user_should_to_see_size_variantValueCategory_under_variantMatrix_container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("variantMatrix.elements.variantValueCategory"));
		Log.message("variantValueCategory-Size :- "  + response.jsonPath().get("variantMatrix.elements.variantValueCategory"), true);

	}
	
	@And("Sizes are displayed under variantValueCategory container")
	public void see_sizes_are_displayed_under_variantValueCategory_container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("variantMatrix.elements.variantValueCategory.displayName"));
		Log.message("Sizes:- "  + response.jsonPath().get("variantMatrix.elements.variantValueCategory.displayName"), true);	
	}
	
	@When("user hits get method api for product details same colour and different size")
	public void user_hits_get_method_api_for_product_details_for_same_colour_different_size() {
		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3112());
	}
}
