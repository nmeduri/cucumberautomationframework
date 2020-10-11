package automation.library.stepDefination;


import static org.testng.Assert.fail;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-1591
 */

public class OCCP_1591_Search_SRP_NonProductSearch extends BaseClass {
      PDP_Page pdpPage;
	public OCCP_1591_Search_SRP_NonProductSearch(TestContext context) throws Exception {
		testContext = context;
		pdpPage = testContext.getPageObjectManager().getPDPPage(driver);
		configFileReader = new ConfigFileReader();
	}
	@Then("select a key word related to faq on search bar")
	public void enterValue_on_SearchBar() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(driver).enterData_SearchBar();
	}
	@And("click on search icon")
	public void click_SearchIcon() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(driver).clickSearchIcon();
	}
	@Then("validate the search result")
	public void Validate_SearchResult() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(driver).displaySearchResult();
	}
}