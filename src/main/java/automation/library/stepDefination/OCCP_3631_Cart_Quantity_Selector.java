package automation.library.stepDefination;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.Footer_Page;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.PLP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-3631
 */
public class OCCP_3631_Cart_Quantity_Selector extends BaseClass {

	public OCCP_3631_Cart_Quantity_Selector(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}
	@Then ("Current quantity of the product in cart is displayed")
	public void Current_quantity_of_the_product_in_cart_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).getValueQuantityBox();
	}
	@And ("Plus CTA to increase the quantity is displayed")
	public void plus_CTA_to_increase_the_quantity() throws Exception {
		testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_Plus_CTA_Cart_quantity();
	}
 	@And ("Minus CTA to decrease the quantity is displayed")
 	public void minus_CTA_to_increase_the_quantity() throws Exception {
		testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_minus_CTA_Cart_quantity();
	}
	@And ("Minus CTA is disabled when quantity is 1")
	public void minus_CTA_is_disabled_when_quantity_is_One() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).signDecrementDisabledWhenQuantityOne();
	}
	@And ("Quantity should not be reduced to zero")
 	public void validate_Quantity_should_not_reduced_to_zero() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyNotAllowedZeroValue();
	}
 	
	@And ("Quantity should not exceed the maximum defined quantity")
	public void Quantity_should_not_exceed_the_maximum_defined_quantity() throws Exception {
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyQuantityGreaterThanMaximumNotUpdate();
	}	
	@And ("click plus CTA sign")
	public void click_plus_CTA_sign() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickIncremenQuantitytButton();
	}	
	@Then ("validate product quantity increase by 1")
	public void validate_product_quantity_increase_by_One() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyUpdatedQuantityByOne();
	}	

}