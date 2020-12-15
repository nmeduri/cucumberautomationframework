package automation.library.stepDefination;


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
 * This file contains the scenario of PDP Page
 */

public class OCCP_1654_PDP_New_Arrival_Badge_Step extends BaseClass {
    
	public OCCP_1654_PDP_New_Arrival_Badge_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("pdp new arrival badge product url is available")
	public void pdp_new_arrival_badge_product_url_is_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_Page(FileReaderManager.getInstance().getDataReader().get_Product_New_Arrival_Badges());
	}
	
	@Then("new arrival badge is displayed under availability category")
	public void new_arrival_badge_is_displayed_under_availability_category() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayNewArrivalBadges();
	}
	
	@Then("new arrival badge is displayed in yellow color")
	public void new_arrival_badge_is_displayed_in_yellow_color() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyNABadgeInYellowColor();
	}

	
}
