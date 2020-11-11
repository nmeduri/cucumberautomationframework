package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-1654
 */
public class HYB_OCCP_1654_PDP_Product_Badges_New_Arrival_Step extends BaseStep{

	RequestSpecification request;
	
	@Then("user should be able to see NEWARRIVAL badge under badges container")
	public void user_should_be_able_to_see_NEWARRIVAL_badge_under_badges_container() {

		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("badges"));
		String badges=response.jsonPath().get("badges").toString();		
		Assert.assertTrue(badges.contains("NEWARRIVAL"));	

	}
	@When("user hits the GET method base product with variants-2188")
	public void user_hits_GET_base_product_with_variants_2188() {     
		response = getHybApiEN().getAPI_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1965());

	}
}
