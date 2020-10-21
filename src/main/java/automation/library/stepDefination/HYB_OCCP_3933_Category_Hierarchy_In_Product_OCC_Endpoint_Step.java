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
 * This file contains the scenario of user stories OCCP-3933
 */
public class HYB_OCCP_3933_Category_Hierarchy_In_Product_OCC_Endpoint_Step extends BaseStep{
	RequestSpecification request;
	
	@When("user hits GET method for Category hierarchy")
	public void user_Hits_Get_Method_For_Category_Hierarchy() {
		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3093());
	}
	
	@Then("the JSON should return Category hierarchy")
	public void the_JSON_Should_Return_Category_Hierarchy() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("ctcCategories").toString());
		Log.message("ctcCategories :- "  + response.jsonPath().get("ctcCategories"), true);
	}
	
	@And("id should be displayed under ctcCategories container")
	public void id_Should_Be_Displayed_Under_CtcCategories_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("ctcCategories.id"));
	}
	
	@And("lowStockThreshold should be displayed Under ctcCategories container")
	public void lowStockThreshold_Should_Be_Displayed_Under_CtcCategories_Container() {
		PageObject.notNullAttributeInResponseInListInteger(response.jsonPath().get("ctcCategories.lowStockThreshold"));
	}
	
	@And("name should be displayed under ctcCategories container")
	public void name_Should_Be_Displayed_Under_CtcCategories_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("ctcCategories.name"));
	}
	@Then("subcategory should be displayed under ctcCategories container")
	public void subcategory_Should_Be_Displayed_Under_CtcCategories_Container() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("ctcCategories.subcategory").toString());
		Log.message("subcategory :- "  + response.jsonPath().get("ctcCategories.subcategory"), true);
	}
	@And("id should be displayed under subcategory container")
	public void id_Should_Be_Displayed_Under_Subcategory_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("ctcCategories.subcategory.id"));
	}
	@And("lowStockThreshold should be displayed Under subcategory container")
	public void lowStockThreshold_Should_Be_Displayed_Under_Subcategory_Container() {
		PageObject.notNullAttributeInResponseInListInteger(response.jsonPath().get("ctcCategories.subcategory.lowStockThreshold"));
	}
	@And("name should be displayed under subcategory container")
	public void name_Should_Be_Displayed_Under_Subcategory_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("ctcCategories.subcategory.name"));
	}
	@Then("subcategory should be displayed under subcategory container")
	public void subcategory_Should_Be_Displayed_Under_subcategory_Container() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("ctcCategories.subcategory.subcategory").toString());
		Log.message("subcategory under subcategory container :- "  + response.jsonPath().get("ctcCategories.subcategory.subcategory"), true);
	}
	@And("id should be displayed under super subcategory container")
	public void id_Should_Be_Displayed_Under_Super_Subcategory_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("ctcCategories.subcategory.subcategory.id"));
	}
	@And("lowStockThreshold should be displayed Under super subcategory container")
	public void lowStockThreshold_Should_Be_Displayed_Under_Super_Subcategory_Container() {
		PageObject.notNullAttributeInResponseInListInteger(response.jsonPath().get("ctcCategories.subcategory.subcategory.lowStockThreshold"));
	}
	@And("name should be displayed under super subcategory container")
	public void name_Should_Be_Displayed_Under_Super_Subcategory_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("ctcCategories.subcategory.subcategory.name"));
	}
}
