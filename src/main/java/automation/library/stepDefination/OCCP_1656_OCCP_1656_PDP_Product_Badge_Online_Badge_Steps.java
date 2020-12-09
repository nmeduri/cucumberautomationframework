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

public class OCCP_1656_OCCP_1656_PDP_Product_Badge_Online_Badge_Steps extends BaseClass {
      
	public OCCP_1656_OCCP_1656_PDP_Product_Badge_Online_Badge_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("pdp only online badge product url is available")
	public void pdp_only_online_product_url_is_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_Page(FileReaderManager.getInstance().getDataReader().get_Product_Online_Badges());
	}
	
	@Then("the online badge is displayed at product family level")
	public void the_online_badge_is_displayed_at_product_family_level() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayOnlyOnlineBadges();
	}
	
	@Then("verify the online only badge is displayed for all variants")
	public void verify_the_online_only_badge_is_displayed_for_all_variants() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayOnlineBuyForAllVariant();
	}
	
	@Then("online badge is displayed in yellow color")
	public void online_badge_is_displayed_in_yellow_color() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyOnlineBadgeInYellowColor();
	}
	
	@Given("pdp perfect gift badge product url is available")
	public void pdp_perfect_gift_product_url_is_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_Page(FileReaderManager.getInstance().getDataReader().get_Perfect_Gift_Badge());
	}
	
	@Then("perfect gift badge product is displayed")
	public void perfect_gift_badge_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayPerfictGiftBadges();
	}
	
	@Then("perfect gift badge is displayed in blue color")
	public void perfect_gift_badge_is_displayed_in_blue_color() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyPerfectGiftBadgeInBLueColor();
	}
	
}
