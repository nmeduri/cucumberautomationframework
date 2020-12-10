package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of the user stories OCCP-3881 
 */
public class OCCP_3908_Cart_Inventory_Availability_Step extends BaseClass{
	

		public OCCP_3908_Cart_Inventory_Availability_Step(TestContext context) throws Exception {
			testContext = context;
			driverFactory = new DriverFactory();
			configFileReader = new ConfigFileReader();
		}
		
		@Then ("within the product card, approximate ship by date is displayed")
		public void display_shipDate() throws Exception {
			
			testContext.getPageObjectManager().getCartPageLocator().get_ShipDate();
		}
		@Then ("within the product card, pickup time and day that product will be available is displayed")
        public void display_PickUpTimeDay() throws Exception {
			
			testContext.getPageObjectManager().getCartPageLocator().get_AvailableTime();
		}
@Then ("display the messaging 'Curbside Pickup Available At Checkout' or the 'Learn More' CTA")
public void display_CurbSiteMessage() throws Exception {
	testContext.getPageObjectManager().getCartPageLocator().get_curbSiteText();
	testContext.getPageObjectManager().getCartPageLocator().get_curbSiteLearnmoreCTA();

}
@Then ("increase the quantity after reaching the maximum limit")
public void increase_the_quantity_after_reaching_the_maximum_limit() throws Exception {
	testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).IncreaseQuantityAfterMaxValue();

}
@Then ("verify that the product limit message is displayed")

public void display_ProductLimitEMessage() throws Exception {
testContext.getPageObjectManager().getCartPageLocator().get_productLimitmsg();
}

@Then ("informational message You have reached the limit of global banner max value is displayed")
public void display_LimitErrorMessage() throws Exception {
testContext.getPageObjectManager().getCartPageLocator().get_LimitExceedError();
}
@Then ("click on checkout CTA button")
public void click_on_checkout_CTA_button() throws Exception {
	testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).clickCheckOutBtn();

}
@Then ("Please resolve the issues in your cart before checking out along with a Close CTA toast message should be display")  
public void display_toastmsg() throws Exception {
	testContext.getPageObjectManager().getCartPageLocator().get_ToastMsgafterCheckout();
	testContext.getPageObjectManager().getCartPageLocator().get_ToastmsgCloseBtn();
}
@Then ("click on close button on the toast message")
public void click_toastmsg_closebtn() throws Exception {
	testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).clickToastmsgCloseBtn();
}
@And ("click on Inventory and Availability tab")
public void click_InventorynAvailibilityTab() throws Exception {
	testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).clickIandATab();
}
@Then ("configure the toast message")
public void configure_Toast_message() throws Exception {
	testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).UpdateResolveIssuesBeforeCheckoutMessage();
	testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).updateChangesinyourCartMessage();
	
}
@Then ("configure the BOPIS Availability message")
public void configure_BOPIS_Availability_Message() throws Exception {
	testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).updateShippingStoreChangedMessage();
	testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).updateShoppingStoreChangedMessage();
	testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).updateTemporarilyOutofStockPickUpMessage();
}
@Then ("configure the STH Availability message")
public void configure_STH_Availability_Message() throws Exception {
	testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).UpdateOutofStockShiptoHomeMessage();
	testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).updateTemporarilyOutofStockShipToHomeMessage();

}
@Then ("configure the line item error message")
public void configure_line_item_error_Message() throws Exception {
	testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).updateOnlySomeinStockMessage();
}
@Then ("configure the Quantity Selector error messages")
public void configure_quantitySelector_error_Message() throws Exception {
	testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).updateExceededMessageToastNotification();
	testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).updateExceededMessageTotalAvailable();

}
@And ("click on Quantity Selector tab")
public void clickQuantitySelectortab() throws Exception {
	testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).clickQuantitySelectorTab();
}

}