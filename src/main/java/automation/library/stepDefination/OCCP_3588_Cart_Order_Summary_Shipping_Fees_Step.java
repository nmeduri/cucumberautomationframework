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
 * This file contains the scenario of user stories OCCP-3588
 */
public class OCCP_3588_Cart_Order_Summary_Shipping_Fees_Step extends BaseClass {

	public OCCP_3588_Cart_Order_Summary_Shipping_Fees_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}
	@Then ("click on the change CTA button")

	public void click_on_the_changeCTA_button() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).ClickOnChangeCTA();
	}
	@And ("product availability flyout is displayed")
	public void product_availability_flyout_is_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_Cart_Page_Shopping_Cart_Title();
	}
	@Then ("click on the store name information tooltip icon")
	public void click_on_the_store_name_information_tooltip_icon() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).click_storeinfo_ToolTip_icon();
	}
	@And ("tool tip content should be displayed")
	public void tool_tip_content_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_storeinfo_tooltip_details();
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_storeinfo_link();
	}
	@And ("click on view store details CTA")
	public void click_on_view_store_details_CTA() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).click_storeinfo_link();
	} 
	@Then ("user navigated to store information page")
	public void user_navigated_to_storeinformation_page() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_storeinfo_address_detail();
	} 
	@Then ("verify the empty cart page")
	public void verify_the_empty_cart_page() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_emptyCart_title();
	} 
	@Then ("user is displayed with order summary section on cart page")
	public void user_is_displayed_with_order_summary_section_on_cart_page() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_orderSummary_title();
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_STH_title();
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_shipto_message();
	} 
	@And ("validate the Change CTA on order summary page")
	public void validate_the_Change_CTA_on_order_summary_page() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_STH_Change_CTA();
	} 
	@And ("validate fees associated with STH and selected postal code is displayed")
	public void validate_fees_associated_with_STH_and_selected_postalcode_is_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_STH_fee();
	} 
	@And ("click on ship to home Change CTA")
	public void click_on_ship_to_home_Change_CTA() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).click_STH_Change_CTA();
	} 
	 @Then ("validate postal code Modal is displayed")
	 public void validate_postal_code_Modal_is_displayed() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_postalCode_Modal();
		} 
	 @And ("validate the pick up at store title on order summary page")
	 public void validate_the_pickup_at_store_title() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_pickupatStore_Title();
		} 
	@And ("validate on pick up at store Change CTA is displayed")
	public void validate_the_pickup_at_store_ChangeCTA() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_PickUpatStore_ChangeCTA();
	} 
	@And ("Order Summary section should display the fees as free associated with the BOPIS fulfillment option selected")
	public void Order_Summary_section_should_display_the_fees_as_free() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_BOIP_FreeFees();
	} 
	@And ("validate the pick up at store informational tool tip is displayed on order summary page")
	public void validate_the_pick_up_at_store_informational_tooltip() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_PickUpatStore_tooltip();
	} 
	@And ("click on the pick up at store informational tooltip icon")
	public void click_on_the_pick_up_at_store_informational_tooltip_icon() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).click_PickUpatStore_tooltip();
	} 
}