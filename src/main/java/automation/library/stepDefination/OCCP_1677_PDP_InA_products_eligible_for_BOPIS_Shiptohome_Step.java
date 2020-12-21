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
	
	@When("configure text label available by")
	public void configure_text_label_available_by() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).updateAvailableByLabel();
	}
	
	@When("revert text label available by")
	public void revert_text_label_available_by() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revertAvailableByLabel();
	}
	
	@Then("configured available by label is displayed on publish page")
	public void configued_available_by_label_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).configuredAvailableByDisplayedOnPublishPage();
	}
	
	@And("configure text label curbside pickup available")
	public void configure_text_label_curbside_pickup_available() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).updateCurbSidePickupAvailableByLabel();
	}
	
	@And("revert text label curbside pickup available")
	public void revert_text_label_curbside_pickup_available() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revertCurbSidePickupAvailableByLabel();
	}
	
	@Then("configured curbside pickup available label is displayed on publish page")
	public void configured_curbside_pickup_available_label_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).configuredCurbSidePickUpAvailableByDisplayedOnPublishPage();
	}
	
	@And("configure ship to home label")
	public void configure_ship_to_home_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).updateShipToHomeLabel();
	}
	
	@And("revert ship to home label")
	public void revert_ship_to_home_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revertShipToHomeLabel();
	}
	
	@Then("configured ship to home label is updated on publish page")
	public void configured_ship_to_home_label_is_updated_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).configuredShipToHomeDisplayedOnPublishPage();
	}
	
	@And("configue check nearby stores label")
	public void configure_check_nearby_stores_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).updateCheckNearByStoreLabel();
	}
	
	@And("revert check nearby stores label")
	public void revert_check_nearby_stores_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revertCheckNearByStoreLabel();
	}
	
	@Then("configured check nearby stores label is updated on publish page")
	public void configured_check_nearby_stores_label_is_updated_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).configuredCheckNearByStoreDisplayedOnPublishPage();
	}
	
	@And("configure change label")
	public void configure_change_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).updateChangeLabel();
	}
	
	@And("revert change label")
	public void revert_change_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revertChangeLabel();
	}
	
	@Then("configured change label is updated on publish page")
	public void configured_chagne_label_is_updated_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).configuredChangeButtonDisplayedOnPublishPage();
	}
}