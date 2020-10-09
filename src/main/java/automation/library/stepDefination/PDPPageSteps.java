package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
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
 * This file contains the scenario of PDP Page
 */

public class PDPPageSteps extends BaseClass {
      
	public PDPPageSteps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("^pdp url is up$")
	public void adobe_author_url_is_up() throws Exception {
		
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigateTo_PDP_Page();
		
	}
	
	@Given("^open browser$")
	public void open_browser() throws Exception {
		
		driver = driverFactory.getDriver();
		pageObjectManager = new PageObjectManager();
		testContext.getPageObjectManager().getPDPPage(driver);
		
	}
	
	@Given("pdp url is available") 
	public void pdp_url_is_available() throws Exception {
		
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigateTo_PDP_Page();
	}
	
	@Given("product detail page url is available on mobile") 
	public void pdp_url_is_available_on_mobile_view() throws Exception {
		
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigateTo_PDP_Page();
	}
	
	@When("pdp page is displayed for the product")
	public void pdp_page_is_displayed_for_the_product() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PDP_Page();
	}
	
	@Then("the product warranty information is displayed under Resources in Overview section of page")
	public void the_product_warranty_information_is_displayed_under_respurces() throws Exception {
		
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_warranty_Under_Resource();
	}
	
	@Then("the specifications section is displayed")
	public void the_specifications_section_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySpecificationsSection();
	}
	
	@When("^pdp url is launched$")
	public void user_launches_the_author_url() throws Throwable {
		
	}
	
	@And("the warranty information of the product is correct")
	public void the_warranty_information_of_the_product_is_correct() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyWarrantyInformationNotNull();
	}
	
	@And("the section title specifications is displayed")
	public void the_section_title_specifications_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySpecificationsTitle();
	}
	
	@And("the specifications are displayed in tabular format")
	public void the_specifications_are_displayed_in_tabular_format() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySpecificationsInTabularFormat();
	}
	
	@And("the specifications are displayed with title and values for each specification as individual rows")
	public void the_specifications_are_displayed_with_title_and_values_for_each_specification_as_individual_rows() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySpecificationsTitleAndValueForEachSpecification();
	}
	
	@And("the specifications are less than 8 on the Desktop")
	public void the_specifications_are_less_than_8_on_the_Desktop() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySpecificationsLessThan8OnTheDesktop();
	}
	
	@Then("the product title is displayed on the product")
	public void the_product_title_is_displayed_on_the_product() throws Exception {

		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).dispalyProductTitle();
	}
	
	@Then("a link to the return policy section is displayed on the pdp under the resources sub section")
	public void a_link_to_the_return_policty_section_is_displayed_on_the_pdp_under_the_resources_sub_section() throws Exception{
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_return_Policty_Under_Resource();
	}
	
	@Then("the return policy section title is displayed")
	public void the_return_policty_section_title_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_return_Policty_Under_Resource();
	}
	
	@And("verify the return policy description is displayed")
	public void verify_the_return_policy_description_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyReturnPolicyDescription();
	}
	
	@And("the return policy link is displayed")
	public void the_return_policy_link_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayReturnPolicyLink();
	}
	
	@And("click on the return policy link")
	public void click_on_the_return_policy_link() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickOnReturnPolicyLink();	
	}
	
	@Then("the return policy opens in new tab")
	public void the_return_policy_opens_in_new_tab() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyReturnPolicyInNewTab();
	}
	
	@Then("the product code is displayed in buy box")
	public void the_product_code_is_displayed_in_buy_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayProductCode();
	}
	
	@And("click the increment sign of the quantity box")
	public void click_the_increment_sign_of_the_quantity_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickIncremenQuantitytButton();
	}
	
	
	
	@And("click the wishlist item")
	public void click_the_wishlist_item() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickWishlistButton();
	}
	
	@And("the default state of wishlist icon is displayed")
	public void display_Wishlist_Icon() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayDefaultStateWishlistIcon();
	}
	
	@And("select product variant")
	public void user_select_product_variant() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).select_Product_Variant();
	}
	
	@Then("Get it installed indicator is displayed on the pdp")
	public void get_it_installed_indicator_is_displayed_on_the_pdp() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Get_It_Installed();
	}
	
	@And("message available at checkout is displayed on the pdp")
	public void message_available_at_checkout_is_displayed_on_the_pdp() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Message_Available_At_Check();
	}
	
	@And("installation icon is displayed on pdp")
	public void installaion_icon_is_displayed_on_pdp() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Installation_Icon();
	}
	
	@And("tool tip icon is displayed on installation indicator")
	public void tool_tip_icon_is_displayed_on_installation_indicator() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Tool_Tip_Icon_Installation();
	}
	
	@And("click on tool tip icon")
	public void click_on_tool_tip_icon() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).click_Tool_Tip_Icon();
	}
	
	@Then("tool tip box opens and tool tip message along with close button is displayed")
	public void tool_tip_box_opens_and_tool_tip_message_along_with_close_buitton_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Tool_Tip_Message_Installation_Indicator();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Close_Button_Tool_Tip_Icon_Installation_Indicator();
	}
	
	@Then("tool tip is closed")
	public void tool_tip_is_closed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).not_Display_Tool_Tip_Message_Installation_Indicator();
	}
	
	@And("click on close button on installation indicator")
	public void click_on_close_button_on_installation_indicator() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).click_Close_Button_Tool_Tip_Icon_Installation_Indicator();
	}
	
	@When("user clicks on any where")
	public void user_clicks_on_anywhere() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).click_Tool_Tip_Icon();
	}
	
	@Then("the romance copy section is displayed")
	public void the_romance_copy_section_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Romance_Copy_Section();
	}
	
	@And("romance copy section title is displayed")
	public void romance_copy_section_title_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Romance_Copy_Section_Title();
	}
	
	@And("romance copy content is displayed")
	public void romance_copy_content_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Romance_Copy_Content();
	}
	
	@Then("product manual title is displayed")
	public void product_manual_title_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Product_Manual_Title();
	}
	
	@And("product manual description is displayed")
	public void product_manual_description_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Product_Manual_Description();
	}
	
	@And("product manual link is displayed")
	public void product_manual_link_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Product_Manual_Link();
	}
	
	@And("user save the product manual link url")
	public void user_save_the_product_manual_link_url() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).get_URL_Product_Manual_Link();
	}
	
	@And("user is click on product manual link")
	public void user_is_click_on_product_manual_link() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).click_Product_Manual_Link();
	}
	
	@Then("product manual pdf opens in new tab")
	public void product_manual_pdf_opens_in_new_tab() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		//testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verify_PDF_In_New_Tab();
	}
	
	@Then("verify the first 8 specifications are displayed on the PDP")
	public void verify_the_first_8_specifications_are_displayed_on_the_pdp() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySpecificationsEightSpecifications();
	}
	
	@Then("verify the view more specifications hyperlink is displayed")
	public void verify_the_view_more_specifications_hyperlink_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayViewMoreSpecifications();
	}
	
	@And("click on viewmore specifications hyperlink")
	public void click_on_view_more_specifications_hyper_link() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickViewMoreSpecifications();
	}
	
	@Then("verify the remaining list of the specifications displays on the pdp")
	public void verify_the_remaining_list_of_the_specifications_displays_on_the_pdp() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayRemainingListOfSpecifications();
	}
	
	@Then("view more specifications is not displayed any more")
	public void view_more_specifications_is_not_displayed_any_more() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).notDisplayViewMoreSpecifications();
	}
	
	@Then("view less specifications is displayed")
	public void view_less_specifications_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayViewLessSpecifications();
	}
	
	@And("click on viewless specifications hyperlink")
	public void click_on_view_less_specifications_hyper_link() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickViewLessSpecifications();
	}
	
	@Then("view less specifications is not displayed")
	public void view_less_specifications_is_not_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).notDisplayViewLessSpecifications();
	}
	
	@Then("the colour selector is displayed first")
	public void the_colour_selector_is_displayed_first() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayColourSelectorFirst();
	}
	
	@Then("the size selector is displayed second")
	public void the_size_selector_is_displayed_second() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySizeSelectorSecond();
	}
	
	@And("a default color is displayed")
	public void a_default_color_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayDefaultColor();
	}
	
	@And("user select product")
	public void user_select_product() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).selectProduct();
	}
	
	@Then("item is successfully added into wish list")
	public void item_is_successfully_added_into_wish_list() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayItemAddedWishlistMessage();
	}
	
	@Then("wishlist icon becomes active in red color")
	public void wishlist_icon_becomes_active_in_red_color() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyWishListIconColor();
	}
	@When("pdp page should displayed")
	public void pdp_page_should_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PDP_Page_Title();
	}
}
