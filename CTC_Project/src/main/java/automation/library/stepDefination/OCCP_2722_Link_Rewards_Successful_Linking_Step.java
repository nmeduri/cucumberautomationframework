package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;

import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
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
 * This file contains the scenario of user stories OCCP-2722
 */

public class OCCP_2722_Link_Rewards_Successful_Linking_Step extends BaseClass {
	
	public OCCP_2722_Link_Rewards_Successful_Linking_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("upload the success image")
	public void upload_the_success_image() throws Exception {
		testContext.getPageObjectManager().getAEMANewTriangleRewardsCardPage(PageObject.getDriver()).uploadSuccessImage();
	}
	
	@Then("success image changes should be reflected in ctc")
	public void success_image_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMANewTriangleRewardsCardPage(PageObject.getDriver()).verifySuccessImageChangesReflected();
	}
	
	@And("author the success screen continue cta")
	public void author_success_screen_continue() throws Exception {
		testContext.getPageObjectManager().getAEMANewTriangleRewardsCardPage(PageObject.getDriver()).enterDataSuccessScreenContinueCTA();
	}
	
	@Then("success screen continue changes should be reflected in ctc")
	public void success_screen_continue_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMANewTriangleRewardsCardPage(PageObject.getDriver()).verifySuccessScreenContinueChangesReflected();
	}

}
