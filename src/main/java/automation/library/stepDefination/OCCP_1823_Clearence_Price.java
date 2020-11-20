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
public class OCCP_1823_Clearence_Price extends BaseClass {

	public OCCP_1823_Clearence_Price(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("AEM author with access to configure price deatil PLP authorable page")
	public void aem_author_with_access_to_configure_price_detail_plp_authorable_page() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).navigateTo_Price_Detail_PLP_Author_Page();
	}
	
	@And("click on price detail tab")
	public void clickOnPriceDetailTab() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickPriceDetailsTab();
	}
	
	@And("configure the text label now")
	public void configure_the_text_label_now() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).enterNowPriceDetails();
	}
	
	@And("revert the text label now")
	public void revert_the_text_label_now() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).revertNowPriceDetails();
	}
	
	@And("applied changes are reflect on page")
	public void applied_changes_are_reflect_on_page() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).appliedLabelNowChangesOnPage();
	}
 
}
