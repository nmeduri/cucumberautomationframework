package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-1662
 */
public class HYB_OCCP_1662_PDP_Product_Badges_Rebate_Available_Step extends BaseStep{
	
	RequestSpecification request;
	
	@When("user hits the GET method product-1965")
	public void user_hits_GET_product_API_for_en_locale_1965() {     
		response = getHybApiEN().getAPI_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1965());

	}
	
	@Then("user should be able to see INSTANTREBATE badge under badges container")
	public void user_should_be_able_to_see_INSTANTREBATE_badge_under_badges_container() {

		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("badges"));
		String badges=response.jsonPath().get("badges").toString();		
		Assert.assertTrue(badges.contains("INSTANTREBATE"));	

	}
}
