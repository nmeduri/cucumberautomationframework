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
 * This file contains the scenario of user stories OCCP-1306
 */
public class OCCP_1306_Cart_Order_Summary_Step extends BaseClass {

	public OCCP_1306_Cart_Order_Summary_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}
	@Then ("validate Taxes as the summation of all of the taxes associated to the line items in the cart should be displayed")
	 public void validate_Taxes_displayed() throws Exception
	 {
		testContext.getPageObjectManager().getCartPageLocator().get_HSTText();
		testContext.getPageObjectManager().getCartPageLocator().get_HSTFees();
	}
	 @Then ("validate Total as the summation of the Subtotal is displayed")
	 public void validate_TotalFees_displayed() throws Exception{
	 testContext.getPageObjectManager().getCartPageLocator().get_TotalText();
	 testContext.getPageObjectManager().getCartPageLocator().get_TotalFee();
	 }
	 @Then ("validate the saving message should be displayed")
	 public void validate_the_save_message_displayed() throws Exception{
		 testContext.getPageObjectManager().getCartPageLocator().get_saveMessage();
	 }	
}