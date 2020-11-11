package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
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
 * This file contains the scenario of user stories OCCP-1579
 */

public class OCCP_1579_PDP_Sticky_Buy_Box_Step extends BaseClass   {
		
		
      public OCCP_1579_PDP_Sticky_Buy_Box_Step(TestContext context) throws Exception {
    	  testContext = context;
  		driverFactory = new DriverFactory();
  		configFileReader = new ConfigFileReader();
		}
	
	@When("user scrolls down past the buy box")
	public void user_scrolls_down_past_buy_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).scrollDownToStickyAddToCart();
		
	}

	@Then("Sticky Add to Cart with product information must be displayed")
	public void display_of_sticky_add_to_cart() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayStickyAddToCart();
	}
	
	@And("update the label atc cta desktop button")
	public void update_the_label_atc_ctc_desktop_button() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).updateAddToCartStickDesktopButtonSticky();
	}
	
	@And("update the label atc cta mobile button")
	public void update_the_label_atc_ctc_mobile_button() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).updateAddToCartStickMobileButtonSticky();
	}
	
	@And("revert the label atc cta desktop button")
	public void revert_the_label_atc_ctc_desktop_button() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revertAddToCartStickDesktopButtonSticky();
	}
	
	@Then("verify button cta desktop update on site")
	public void verify_button_cta_desktop_update_on_site() throws Exception {
		Thread.sleep(5000);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDownByCoordinates();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDownByCoordinates();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).verifyAddToCartDesktopButtonStickyUpdatedOnSite();
	}
	
	@And("click on sticky panel")
	public void clickOnStickyPanel() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).clickStickyBoxPanel();
	}
	
	@And("revert the label atc cta mobile button")
	public void revert_the_label_atc_ctc_mobile_button() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revertAddToCartStickMobileButtonSticky();
	}
	
	
}

