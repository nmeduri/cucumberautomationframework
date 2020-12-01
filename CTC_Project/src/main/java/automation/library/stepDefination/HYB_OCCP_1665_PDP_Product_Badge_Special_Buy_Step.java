package automation.library.stepDefination;

import java.util.List;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-1665
 */
public class HYB_OCCP_1665_PDP_Product_Badge_Special_Buy_Step extends BaseStep{

	RequestSpecification request;
	
	@Then("user should be able to see Special Buy badge under badges container")
	public void user_should_be_able_to_see_Special_Buy_badge_under_badges_container() {

		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("badges"));
		String badges=response.jsonPath().get("badges").toString();		
		Assert.assertTrue(badges.contains("SPECIALBUY"));	

	}
	@When("user hits the GET method product API-1888")
	public void user_hits_GET_product_API_for_en_locale_1888() {     
		response = getHybApiEN().getAPI_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1493());

	}
}
