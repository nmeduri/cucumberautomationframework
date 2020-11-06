package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Then;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-1651
 */
public class HYB_OCCP_1651_PDP_Product_Badges_Tested_For_Life_Step extends BaseStep{

	RequestSpecification request;
	
	@Then("user should be able to see Tested For Life badge under badges container")
	public void user_should_be_able_to_see_Tested_For_Life_badge_under_badges_container() {

		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("badges"));
		String badges=response.jsonPath().get("badges").toString();		
		Assert.assertTrue(badges.contains("TESTEDFORLIFE"));	

	}
	
}
