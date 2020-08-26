package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
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

public class OCCP_1691_Account_Triangle_ID_Login_Reset_Password_Step extends BaseClass {

	public OCCP_1691_Account_Triangle_ID_Login_Reset_Password_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
     @Given("sign up url is available")
     public void sign_up_url_is_available() throws Exception {
    	 driver = driverFactory.getDriver(configFileReader.getBrowser());
 		pageObjectManager = new PageObjectManager();
 		testContext.getPageObjectManager().getSignUpPage(driver).navigateTo_Sign_Up_Page();
     }
     
     @When("sign up page is displayed")
     public void sign_up_page_is_displayed() throws Exception {
    	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).display_Create_Your_Triangle_Header();
     }
     
     @Then("user enter password")
     public void user_enter_password() {
    	 
     }
 
}
