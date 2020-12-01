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
 * This file contains the scenario of user stories - 1576
 */

public class OCCP_1576_PDP_Product_Badgess_Steps extends BaseClass {
     
	public OCCP_1576_PDP_Product_Badgess_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("special buy is displayed")
	public void special_buy_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySpecialBuy();
	}
	
	@Then("the badge is displayed in pink color")
	public void the_badge_is_displayed_in_pink_color() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyColorCode();
	}
	
	@Then("the badge persists and displays for all variants of the product")
	public void the_badge_persissts_and_displays_for_all_variants_of_the_product() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySpecialBuyForAllVariant();
	}
	
	@Then("the badge is displayed in Yellow color")
	public void the_badge_is_displayed_in_yellow_color() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyInStoreBageColorCode();
	}
	
	@Then("the editable badge label displays in store clearnce")
	public void the_editable_badge_label_displays_in_store_clearnce() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayBadgeInStoreClearnce();
	}
	
	@Then("maximum of x badges are displayed")
	public void maximum_of_x_badges_are_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyBadgesMoreThanTwo();
	}
}
