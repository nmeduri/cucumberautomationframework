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

public class HYB_OCCP_1649_PDP_Product_Badges_Limited_Stock_step extends BaseStep{

	RequestSpecification request;

	@Given("Limited Stock badge product occ api is available")
	public void limited_stock_occ_api_is_availeble() {
		url = getAuthorizationUrl().HYB_Auth_Url(FileReaderManager.getInstance().getAPIDataReader().get_pdp_product_API());			
	}

	@When("user hits the GET api for limited stock")
	public void user_hits_the_api_limited_stock() {

		response = getHybApiEN().getAPI_EN(url,
				FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1944());
	}

	@Then("user should be able to see lowStockThreshold under Categories container")
	public void user_should_be_able_to_see_lowStockThreshold_under_Categories_container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("ctcCategories.lowStockThreshold"));
		Log.message("Response Categories:- "  +response.jsonPath().get("ctcCategories.lowStockThreshold"), true);

	}
	@And("lowStockThreshold is displayed under Sub Categories container")
	public void lowStockThreshold_value_is_displayed() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("ctcCategories.subcategory.lowStockThreshold"));
		Log.message("Response SubCategories1:- "  +response.jsonPath().get("ctcCategories.subcategory.lowStockThreshold"), true);
			PageObject.notNullAttributeInResponseInList(response.jsonPath().get("ctcCategories.subcategory.subcategory.lowStockThreshold"));
			Log.message("Response Sub Categories2:- "  +response.jsonPath().get("ctcCategories.subcategory.subcategory.lowStockThreshold"), true);
		
	}
}
