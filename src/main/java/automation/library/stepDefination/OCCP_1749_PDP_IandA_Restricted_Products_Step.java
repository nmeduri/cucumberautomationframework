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
public class OCCP_1749_PDP_IandA_Restricted_Products_Step extends BaseClass {

	public OCCP_1749_PDP_IandA_Restricted_Products_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("configure In-store purchase only label")
	public void configure_Instore_purchaseonly_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).configureinStorePurchaseLabel();
	}
	@And("configure vist preffered store to  purchase only label")
	public void prefferedStoreToPurchase() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).configurepreferredstoreTextLabel();
	}
}
