package automation.library.stepDefination;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.Footer_Page;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.PLP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-1027
 */
public class OCCP_3167_Report_Question_Answer_Step extends BaseClass {

	public OCCP_3167_Report_Question_Answer_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}

	@Then("report option is displayed")
	public void report_option_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayReportButton();	
	}
	
	@And("click on report option")
	public void click_on_report_option() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickReportButton();
	}
	
	@Then("button title should be changed to reported from report")
	public void button_title_should_be_changed_to_reported_from_report() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyButtonTitleChangedReported();
	}
	
	@Then("user should not be able to click on reported label")
	public void user_should_not_be_able_to_click_on_reported_label() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyReporedLabelNotClickable();
	}
}
