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
 * This file contains the scenario of user stories - 1650
 */

public class OCCP_1651_PDP_Tested_for_life_Badge_Step extends BaseClass {
      
	public OCCP_1651_PDP_Tested_for_life_Badge_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	 
	@When("pdp tested for life badge product url is available")
	public void pdp_tested_for_life_badge_product_url_is_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_Page(FileReaderManager.getInstance().getDataReader().get_Product_Tested_for_Life_Badges());
	}
	
	
	@Then("tested for life badge is displayed for life category")
	public void tested_for_life_badge_is_displayed_for_life_category() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyTFLBadgeInRedColor();
	}
		
	
	
}