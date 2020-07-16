package automation.library.api.stepDefination;

import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.api.endpoint.HYB_API_FR_CA_End_Point;
import automation.library.api.pojo.response.CTBVT_Response;
import automation.library.api.pojo.response.Catalog_BVT_Response;
import automation.library.api.pojo.response.Catalogs_List_BVT_Response;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import test.assertion.AssertionTest;

public class HYB_OCCP_874_Verify_Additional_Warranty_Message_Is_Not_Null_And_Locale_Is_FR_Step extends BaseStep {

	RequestSpecification request;

	@When("user hits the GET api with locale as fr_ca")
	public void user_hits_the_api_with_locale_as_fr_ca() {

		response = getHybApiFRCA().getAPI_FR_CA(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1416());

	}

	@Then("returned JSON should have warranty section in fr_ca locale")
	public void returned_json_should_have_warranty_section_fr_ca_locale() {

		Assert.assertNotEquals(null, response.jsonPath().get("warranty"));

	}

	@And("returned JSON should have additional warranty message name and its value in fr_ca locale")
	public void returned_json_should_have_additonal_warranty_message() {

		String sActualWarrantyAddionalMessage = response.jsonPath().get("warranty.additionalWarrantyMessage")
				.toString();
		Assert.assertEquals(
				"Si cet article est défectueux, il est couvert par la garantie du fabricant. Dans le cas où aucune garantie n'est indiquée, cet article est couvert par une garantie de un an honorée dans tout magasin Canadian Tire.",
				sActualWarrantyAddionalMessage);
	}

}
