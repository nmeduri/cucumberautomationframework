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
 * This file contains the scenario of user stories OCCP-3516
 */
public class OCCP_3516_PDP_Add_to_Cart_Flyout_Service_Installations_Step extends BaseClass {

	public OCCP_3516_PDP_Add_to_Cart_Flyout_Service_Installations_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}
	@When ("PDP product page is available")

	public void PDP_page_is_displayed_for_the_product() throws Exception {
		testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).navigate_to_PDP_Product();
	}
	@Then ("select specefications and click on add to cart")
	public void select_specefications_and_click_add_to_cart() throws Exception {
		testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).select_Product_Specification();
		// testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickOnAddToCartButton();

	}
	 @Then ("add to cart screen displayed")
	 public void add_to_cart_screen_displayed() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_AddToCart_screen();
		} 
	 @Then ("Service Add-On Available box is displayed")
	 public void Service_addOn_available_Box_displayed() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_Service_addon_Box();
		}
	   
	 @And ("Available Service description is displayed")
	 public void Service_addOn_description_displayed() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_Service_description();
		}
	  @And ("Available Service price is displayed")
	  public void Service_Price_displayed() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_Service_price();
		}
  
	  @And ("Add Service to Cart” CTA is displayed")
	  public void Add_ServiceToCart_CTA_displayed() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_AddtoService_CTA();
		}
	  @Then ("click on add service to cart button")
	  public void click_add_service_to_cart_button() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).click_AddtoService_CTA();
		}
	  @And ("validate the error message displayed")
	  public void Validate_error_message() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_ErrorMsg_AddtoService_CTA();
		}
	  @When ("AEM author with access to configure PDP Add To Cart on the page")
	  public void AEM_author_with_access_to_configure_PDP_Add_To_Cart_on_the_page() throws Exception {
			testContext.getPageObjectManager().getAEMPDPAddToCartPage(PageObject.getDriver()).navigateTo_PDP_AddToCart_Page();
		}
	  @And ("click on Cart fly out component")
	  public void click_cart_flyout_Component() throws Exception {
			testContext.getPageObjectManager().getAEMPDPAddToCartPage(PageObject.getDriver()).click_cart_flyout_Component();
		}
		@And ("update the title of add to cart field")
		public void update_the_title_of_add_to_cart_field() throws Exception {
			testContext.getPageObjectManager().getAEMPDPAddToCartPage(PageObject.getDriver()).update_cart_flyout_Title_Plural();
			testContext.getPageObjectManager().getAEMPDPAddToCartPage(PageObject.getDriver()).update_cart_flyout_Title_Single();

		}
	 	@And ("messaging for number of services available is be displayed")
	 	public void messaging_for_number_of_services_available_is_be_displayed() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_seviceAddon_message();

		}
	 	@And ("clickable expansion chevron is displayed")
	 	public void clickable_expansion_chevron_is_displayed() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_clickable_expansion_chevron();
		}
	 	@Then ("click on the expandable chevron")
	 	public void click_expandable_chevron() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).click_clickable_expansion_chevron();
		}
	 	@And ("Service Add-Ons options are displayed")
	 	public void Service_AddOns_options_are_displayed() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_serviceAddOn_Option();
		}
	 	@And ("the Service Add-Ons Available box is expanded")
	 	public void the_Service_AddOns_Available_box_is_expanded() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_clickable_collapse_chevron();
		}
		@And ("continue to Cart CTA is displayed")
		public void continue_to_Cart_CTA_is_displayed() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_continue_to_cart_CTA();
		}
		@Then ("Add to cart Title is updated on the site")
		public void Add_to_cart_Title_is_updated_on_the_site() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).verifyAddToCartTitleUpdatedOnSite();
		}
		@And ("click on service installation tab")
		public void click_on_service_installation_tab() throws Exception {
			testContext.getPageObjectManager().getAEMPDPAddToCartPage(PageObject.getDriver()).click_serviceInstallation_Tab();
		}
		@And ("update the Service Add-on available title of add to cart field")
		public void update_the_Service_Addon_available_title_of_add_to_cart_field() throws Exception {
			testContext.getPageObjectManager().getAEMPDPAddToCartPage(PageObject.getDriver()).update_Serviceaddonavailable_Title();
		}
		@Then ("Service Add-on available title is updated on the site")
		public void Service_Addon_available_title_is_updated_on_the_site() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).verifyServiceAddOnTitleUpdatedOnSite();
		}
		@And ("update the Add service to cart CTA field")
		public void update_the_addservicetocart_CTA_field() throws Exception {
			testContext.getPageObjectManager().getAEMPDPAddToCartPage(PageObject.getDriver()).update_AddservicetoCartCTA();
		}
		@And ("update the Error Message Copy field")
		public void update_the_Error_Message_Copy_field() throws Exception {
			testContext.getPageObjectManager().getAEMPDPAddToCartPage(PageObject.getDriver()).update_ErrorMessageCopy();
		}
		@And ("update the next step description copy")
		public void update_the_next_step_description_copy() throws Exception {
			testContext.getPageObjectManager().getAEMPDPAddToCartPage(PageObject.getDriver()).update_nextstep();
		}

		@And ("user configure the service icon")
		public void user_configure_the_service_icon() throws Exception {
			testContext.getPageObjectManager().getAEMPDPAddToCartPage(PageObject.getDriver()).update_serviceIcon();
		}
		@And ("user configure Service Add-On title")
		public void user_configure_Service_AddOn_title() throws Exception {
			testContext.getPageObjectManager().getAEMPDPAddToCartPage(PageObject.getDriver()).update_ServiceAddonTitle();
		}
	 	@Then ("select the service addon option")
	 	public void select_service_addon_option() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).click_serviceAddOn_Option();
		}
	 	@And ("validate the success message displayed")
	 	public void validate_the_success_message_displayed() throws Exception {
			testContext.getPageObjectManager().getPDPAddToCartPage(PageObject.getDriver()).display_success_message();
		}
	 	

}