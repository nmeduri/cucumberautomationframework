package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Then;
import io.restassured.specification.RequestSpecification;
/**
 * This file contains the scenario of user stories OCCP-1653
 */
public class HYB_OCCP_1653_PDP_Product_Badge_best_seller_Step extends BaseStep{

	RequestSpecification request;
	
	@Then("user should be able to see  Best Seller badge under badges container")
	public void user_should_be_able_to_see_Best_Seller_badge_under_badges_container() {

		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("badges"));
		String badges=response.jsonPath().get("badges").toString();		
		Assert.assertTrue(badges.contains("BESTSELLER"));	

	}
	
}
