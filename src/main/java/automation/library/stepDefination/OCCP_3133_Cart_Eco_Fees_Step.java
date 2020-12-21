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
public class OCCP_3133_Cart_Eco_Fees_Step extends BaseClass {

	public OCCP_3133_Cart_Eco_Fees_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("the quantity selected is one")
	public void the_quantity_selected_is_one() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).enterOneQuantityForProduct();
	}
	
	@Then("eco fees should be added to the price")
	public void eco_fees_should_be_added_to_the_price() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayEcoFees();
	}
	
	@Then("message should be shown to the user indicating that eco fees is included in the total")
	public void message_should_be_shown_to_the_user_indicating_that_eco_fees_is_included_in_the_total() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayEcoMessage();
	}
	
	@Then("an info icon should be present next to the message")
	public void an_info_icon_should_be_present_next_to_the_message() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayInfoIconEcoFees();
	}
	
	@And("click on the info icon")
	public void click_on_the_info_icon() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).clickInfoIconEcoFees();
	}
	
	@Then("tool tip explaining eco fees should be displayed")
	public void tool_tip_explaining_eco_fees_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayToolTipEcoMessage();
	}
	
	@And("click on eco tool tip close button")
	public void click_on_eco_tool_tip_close_button() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).clickOnCloseEcoToolTipButton();
	}
	
	@Then("echo tool tip should be closed")
	public void echo_tool_tip_should_be_closed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).verifyEchoToolTipClosed();
	}
	
}