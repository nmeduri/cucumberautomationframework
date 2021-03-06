package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
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

/**
 * This file contains the scenario of user stories OCCP-1618
 */

public class HYB_OCCP_1618_PDP_Media_Gallery_Videos_Step extends BaseStep {

	RequestSpecification request;
	
//	@And("media type value should be DEMO_VIDEOS in response")
//	public void media_type_value_should_be_demo_videos_in_response() {
//		
//		List<String> mediaType = response.jsonPath().get("medias.mediaType");
//		Assert.assertTrue(mediaType.contains("DEMO_VIDEOS"));
//
//	}
	@When("user hits GET API without locale-1493")
	public void user_hits_API_without_locale_1493() {

		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1493());
		

	}
}
