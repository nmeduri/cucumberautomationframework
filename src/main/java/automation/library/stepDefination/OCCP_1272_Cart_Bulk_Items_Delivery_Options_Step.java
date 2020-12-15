package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-1259
 */
public class OCCP_1272_Cart_Bulk_Items_Delivery_Options_Step extends BaseClass{

	public OCCP_1272_Cart_Bulk_Items_Delivery_Options_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	
	@Then ("a dialog box for selecting the delivery options is displayed")
	public void display_deliveryOptions_dialog() throws Exception {
			testContext.getPageObjectManager().getCartPageLocator().get_deliverydialogBox();
	}
	@Then ("available delivery options are displayed along with a tooltip icon")
	public void display_deliveryOptions_with_toolTip() throws Exception {
		testContext.getPageObjectManager().getCartPageLocator().get_standardDelivery();
		testContext.getPageObjectManager().getCartPageLocator().get_stadardDeliveryTooltip();
		testContext.getPageObjectManager().getCartPageLocator().get_homeDelivery_option();
		testContext.getPageObjectManager().getCartPageLocator().get_homeDeliveryTooltip();
		testContext.getPageObjectManager().getCartPageLocator().get_homeDeliveryUnpack_option();
		testContext.getPageObjectManager().getCartPageLocator().get_homeDeliveryUnpackTooltip();	
	}
	@Then ("validate radio buttons are displayed to change the delivery options")
	public void validate_radio_buttons_are_displayed_to_change_the_delivery_options() throws Exception {
	testContext.getPageObjectManager().getCartPageLocator().get_standardDelivery();
	testContext.getPageObjectManager().getCartPageLocator().get_homeDelivery_option();
	testContext.getPageObjectManager().getCartPageLocator().get_homeDeliveryUnpack_option();
 }
	@Then ("click on the standard delivery option tooltip")
	public void click_standardDelivery_tooltip() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).click_standard_delivery_tooltip();
	}
	@Then ("verify the standard delivery tooltip information is displayed")
	public void display_standardDelivery_tooltip_message() throws Exception {
		testContext.getPageObjectManager().getCartPageLocator().get_TooltipBody();
	}
	@Then ("click on tooltip close button")
	public void click_tooltip_close_button() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).click_tooltip_closebtn();
	}
	@Then ("click on the in-home delivery option tooltip")
	public void click_homeDelivery_tooltip() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).click_inHomeDelivery_tooltip();
	}
	@Then ("verify the in-home delivery tooltip information is displayed")
	public void display_homeDelivery_tooltip_message() throws Exception {
		testContext.getPageObjectManager().getCartPageLocator().get_TooltipBody();
	}
	@Then ("click on the in-home and unpack delivery option tooltip")
	public void click_homeDeliveryUnpack_tooltip() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).click_inHome_unpack_Delivery_tooltip();
	}
	@Then ("verify the in-home and unpack delivery tooltip information is displayed")
	public void verify_the_homeandunpackdelivery_tooltip_information_is_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPageLocator().get_TooltipBody();
	}
	@Then ("verify the tool tip information is not displayed")
	public void verify_tooltipInfo_is_not_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).validateToolTipMessageNotDisplayed();
	}
	@When ("AEM author with access to configure Cart page")
	public void author_navigates_to_add_to_wishlist_aem_page() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).navigateTo_Cart_Page_AEM();
	}
	@And("click on cart items component")
	public void click_on_cart_items_component() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).clickCartComponent();
	}
	@And ("click on bulk items tab")
	public void click_bulk_items_tab() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).clickBulkItemTab();
	}
	@And ("configure tooltip text")
	public void configure_tooltip_text() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).UpdateDEliveryOptionToolTipText();
	}
	@And ("configure bulk message text")
	public void configure_bulkMessage_text() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).UpdateBulkMessageText();
	}
	@Then ("verify the bulk message is updated")
	public void display_bulkMessage_text() throws Exception {
		testContext.getPageObjectManager().getCartPageLocator().get_BulkMessage();
	}
	
	@And ("access all the delivery options label properties and configure the label text")
	public void aathor_delivery_options_label_text() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).enterDataDeliveryOptionsLabelText();
	}
	
	@Then ("verify delivery options label changes are reflected on the ctc site")
	public void delivery_options_label_changes_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).verifyDeliveryLabelChangesReflected();
	}

}