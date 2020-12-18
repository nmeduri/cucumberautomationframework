package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-4612
 */

public class HYB_OCCP_4612_PDP_Add_To_Cart_Validations_Error_Messages_Step extends BaseStep{

	RequestSpecification request;
	
	@When("^user hits the GET api for max qty for a product$")
	public void user_hits_the_api_for_max_qty_for_a_product() {

		response = getHybApiEN().getAPI_EN(url,
				FileReaderManager.getInstance().getAPIDataReader().get_product_tc_6556());

	}
	
	@Then("^maxOrderQuantity should be displayed in the JSON response$")
	public void maxOrderQuantity_should_be_displayed_in_the_JSON_response() {
		
		Assert.assertNotEquals(null, response.jsonPath().get("maxOrderQuantity"));
		Log.message("maxOrderQuantity : "+ response.jsonPath().get("maxOrderQuantity"), true);
		
	}
	
	@When("^user hits the GET api for max qty for variant product$")
	public void user_hits_the_api_for_max_qty_for_variant_product() {

		response = getHybApiEN().getAPI_EN(url,
				FileReaderManager.getInstance().getAPIDataReader().get_product_tc_5664());

	}
}
