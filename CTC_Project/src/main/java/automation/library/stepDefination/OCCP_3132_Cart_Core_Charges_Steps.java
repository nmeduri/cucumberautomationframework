package automation.library.stepDefination;

import org.openqa.selenium.JavascriptExecutor;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.dataProviders.DataReader;
import automation.library.managers.FileReaderManager;
import automation.library.pageObjects.Login_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.internal.support.FileReader;
/**
 * This file contains the scenario of user stories OCCP-3149
 */

public class OCCP_3132_Cart_Core_Charges_Steps extends BaseClass {
	
	public OCCP_3132_Cart_Core_Charges_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Then ("a message should be shown to the user indicating that core fees is included in the total")

	public void core_charges_message_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPageLocator().get_CoreChargemessage();
	}
	 @And ("cart page product quantity is selected grater than one")
	 public void cart_product_quantity_is_selected_graterthan_one() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).click_increment_productQuantity();
		}
	 @Then ("click on the tool tip displayed beside the core charges fee")
	 public void clickToolTip_coreCharges() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).click_ToolTip_coreCharges();
		}
	 @And ("validate the tool tip message displayed")
	 public void validate_the_tooltip_message() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).validateToolTip_Message_CoreCharges();
		}
	 @And ("click on close button on tool tip message")
	 public void clickToolTip_closeButton() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).click_ToolTip_close_coreCharges();
		}
	 @And ("validate the tooltip message is not displayed")
	 public void validate_the_tooltip_message_not_displayed() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).validatenotDisplaytooltipMessage();
		}
	@When ("aem author with access navigates to content fragment page")
	public void navigate_to_content_fragment_page() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).navigateTocontentFragmentPageAem();
	}
	@Then ("configure the incl text label")
	public void configure_the_incl_text_label() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).enterDatainclcorechargesAEM();
	}
	@And ("click on save and publish content fragment changes")
	public void click_save_and_publish_content_fragment_changes() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).clickOnSaveAndPublishCntentFragmentChanges();
	}	
	@Then ("configure the CoreCharge text label")
	public void configure_the_CorCharges_text_label() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).enterDatacorechargesTitleAEM();
	}
	 @And ("validate the core charge title displayed")
	 public void validate_corecharge_title_displayed() throws Exception {
			testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).validateToolTip_CoreCharges_Title();
		}


}