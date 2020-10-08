package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
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
 * This file contains the scenario of user stories - 1647
 */

public class OCCP_1647_Product_Badges_Clearence_Steps extends BaseClass {
      
	public OCCP_1647_Product_Badges_Clearence_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("an additional editable disclaimer displays only select style size badge")
	public void an_additional_editable_disclaimer_displays_only_select_style_size_badge() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayBadgeSelectStyleSize();
	}
}
