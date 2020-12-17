package automation.library.stepDefination;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-1672
 */

public class OCCP_1677_PDP_InA_products_eligible_for_BOPIS_Shiptohome_Step extends BaseClass{

	public OCCP_1677_PDP_InA_products_eligible_for_BOPIS_Shiptohome_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("configure get it in store label")
	public void configure_getitinstore_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).configureGetItInStoreLabel();
	}
	@Then("the updated get it in store label is displayed on site")
	public void theupdatedconfiguregetitinstorelabelisdisplayedonsite() throws Exception {
		testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_getitInStore_updated();
	}

	@And("configure in stock label")
	public void configure_instock_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).configureInStockLabel();
	}
	@Then("the updated in stock label is displayed on site")
	public void updated_Instock_label_displayed_on_site() throws Exception {
		testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_inStock_updated();
	}
	@And("configure free PickUp In Store label")
	public void configure_freePickUpInStoreLabel() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).configurefreePickUpInStoreLabel();
	}
	@Then("the updated free PickUp In Store label is displayed on site")
	public void updated_freePickUpInStore_label_displayed_on_site() throws Exception {
		testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_freePickUpInStore_updated();
	}
	@And ("click on fulfillment tab")
	public void clickonfulfillmenttab() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).clickonfulfillmentTab();
	}
}