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
 * This file contains the scenario of user stories OCCP-1680
 */
public class OCCP_2723_Reward_Card_Already_Linked extends BaseClass {

	public OCCP_2723_Reward_Card_Already_Linked(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	
	@And("configure image on the card already enrolled error screen")
	public void configure_image_on_the_card_already_enrolled_error_screen() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).updateErrorAlreadyLinkCardImage();
	}
	
	@And("configue try again button on the card already enrolled error screen")
	public void configue_try_again_button_on_the_card_already_enrolled_error_screen() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).updateTryAgainButtonAlreadyCardLink();
	}
	
	@And("navigate on existing card page")
	public void navigateOnExistingCardPage() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).navigateToLinkExistingCardScreenPage();
	}
	
	@Then("configured image is displayed on screen")
	public void configured_image_is_displayed_on_screen() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyErrorImageUpdateOnScreenForAlreadyCardLinked();
	}
	
	@Then("configured try again buttton text on screen")
	public void configued_try_again_button_text_on_screen() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyButtonTextUpdateOnScreenForAlreadyCardLinked();
	}
	
	@And("revert error image changes")
	public void revert_error_image_changes() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).revertErrorAlreadyLinkCardImage();
	}
	
	@And("revert button text changes")
	public void revert_button_text_changes() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).revertTryAgainButtonAlreadyCardLink();
	}
}
