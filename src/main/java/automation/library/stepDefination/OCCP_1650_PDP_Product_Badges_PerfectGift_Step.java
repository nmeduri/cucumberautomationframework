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
 * This file contains the scenario of user stories - 1650
 */

public class OCCP_1650_PDP_Product_Badges_PerfectGift_Step extends BaseClass {
      
	public OCCP_1650_PDP_Product_Badges_PerfectGift_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	 @When ("pdp url for perfect gift badge is available")
	 public void pdp_url_for_perfect_gift_badge_is_available() throws Exception {
			testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigateTo_PDP_Page_perfectGift_Badge();
		} 
	
    @Then ("the perfect gift badge label displays in product family level page")

	public void the_perfect_gift_badge_label_displays_in_product_family_level_page() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PDP_Page_perfectGift_Badge();
	}
    @Then ("the perfect gift badge is applicable to all variants and remains displayed")
    public void the_perfect_gift_badge_is_applicable_to_all_variants() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayPerfectGiftForAllVariant();
	}

}