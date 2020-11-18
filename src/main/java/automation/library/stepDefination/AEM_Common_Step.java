package automation.library.stepDefination;

import org.json.JSONObject;

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
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * This class contains the common scenario
 */ 
public class AEM_Common_Step extends BaseClass {

	public AEM_Common_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("click on preview button")
	public void click_on_preview_button() throws Exception {
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickPreviewButton();
	}
	
	@And("click on edit button")
	public void click_on_edit_button() throws Exception {
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickEditButton();
	}
	
	@When("click on the preview button")
	public void click_on_the_preview_button() throws Exception {
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickOnThePreviewButton();
	}
	
	@When("refresh the page and click on preview")
	public void click_on_the_preview_button_after_refresh() throws Exception {
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickOnThePreviewButtonAfterRefresh();
	}
	
	@And("click on the publish button")
	public void click_on_publish_button() throws Exception {
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickOnPageInformation();
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickOnPublishPage();
	}
	
	@And("click on the publish")
	public void click_on_publish() throws Exception {
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickOnPageInformation();
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickOnPublishButton();
	}

}
