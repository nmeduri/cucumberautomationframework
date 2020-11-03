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
 * This file contains the scenario of user stories OCCP-2803
 */

public class OCCP_2803_Active_Ownership_Validation_Screen_Step extends BaseClass {
	
	public OCCP_2803_Active_Ownership_Validation_Screen_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("user should be redirected to active ownership validation screen")
	public void redirect_to_active_ownership_validation_screen() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayActiveValidationHeaderText();
	}
	
	@And("in the screen header text should be present")
	public void header_text_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayActiveValidationHeaderText();
	}
	
	@And("sub header text should be present")
	public void sub_header_text_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayActiveValidationSubHeaderText();
	}
	
	@And("postal code property should be present")
	public void postal_code_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayActiveValidationSubHeaderText();
	}
	
	@And("year of birth property should be present")
	public void year_of_birth_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayActiveValidationSubHeaderText();
	}
	
	@And("user should be able to enter pending activation loyalty card number")
	public void enter_pending_loyalty_card_no() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enterDataPendingCardNo();
	}

}
