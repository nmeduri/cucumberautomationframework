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
public class PDPPageSteps extends BaseClass {
      PDP_Page pdpPage;
	public PDPPageSteps(TestContext context) throws Exception {
		testContext = context;
		pdpPage = testContext.getPageObjectManager().getPDPPage();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("^pdp url is up$")
	public void adobe_author_url_is_up() throws Exception {
		
		testContext.getPageObjectManager().getPDPPage().navigateTo_PDP_Page();
		
	}
	
	@Given("pdp url is available") 
	public void pdp_url_is_available() throws Exception {
		
		testContext.getPageObjectManager().getPDPPage().navigateTo_PDP_Page();
	}
	
	@Given("product detail page url is available on mobile") 
	public void pdp_url_is_available_on_mobile_view() throws Exception {
		
		testContext.getPageObjectManager().getPDPPage().navigateTo_PDP_Page();
	}
	
	@When("pdp page is displayed for the product")
	public void pdp_page_is_displayed_for_the_product() throws Exception {
		testContext.getPageObjectManager().getPDPPage().display_PDP_Page();
	}
	
	@Then("the product warranty information is displayed under Resources in Overview section of page")
	public void the_product_warranty_information_is_displayed_under_respurces() throws Exception {
		
		testContext.getPageObjectManager().getPDPPage().display_warranty_Under_Resource();
	}
	
	@Then("the specifications section is displayed")
	public void the_specifications_section_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displaySpecificationsSection();
	}
	
	@When("^pdp url is launched$")
	public void user_launches_the_author_url() throws Throwable {
		
	}
	
	@When("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() throws Exception {
		testContext.getPageObjectManager().getPDPPage().clickOnAddToCartButton();
	}
	
	@And("the warranty information of the product is correct")
	public void the_warranty_information_of_the_product_is_correct() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyWarrantyInformationNotNull();
	}
	
	@And("the section title specifications is displayed")
	public void the_section_title_specifications_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displaySpecificationsTitle();
	}
	
	@And("the specifications are displayed in tabular format")
	public void the_specifications_are_displayed_in_tabular_format() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displaySpecificationsInTabularFormat();
	}
	
	@And("the specifications are displayed with title and values for each specification as individual rows")
	public void the_specifications_are_displayed_with_title_and_values_for_each_specification_as_individual_rows() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displaySpecificationsTitleAndValueForEachSpecification();
	}
	
	@And("the specifications are less than 8 on the Desktop")
	public void the_specifications_are_less_than_8_on_the_Desktop() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displaySpecificationsLessThan8OnTheDesktop();
	}
	
	@Then("the product title is displayed on the product")
	public void the_product_title_is_displayed_on_the_product() throws Exception {

		testContext.getPageObjectManager().getPDPPage().dispalyProductTitle();
	}
	
	@Then("a link to the return policy section is displayed on the pdp under the resources sub section")
	public void a_link_to_the_return_policty_section_is_displayed_on_the_pdp_under_the_resources_sub_section() throws Exception{
		testContext.getPageObjectManager().getPDPPage().display_return_Policty_Under_Resource();
	}
	
	@Then("the return policy section title is displayed")
	public void the_return_policty_section_title_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().display_return_Policty_Under_Resource();
	}
	
	@And("verify the return policy description is displayed")
	public void verify_the_return_policy_description_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyReturnPolicyDescription();
	}
	
	@And("the return policy link is displayed")
	public void the_return_policy_link_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayReturnPolicyLink();
	}
	
	@And("click on the return policy link")
	public void click_on_the_return_policy_link() throws Exception {
		testContext.getPageObjectManager().getPDPPage().clickOnReturnPolicyLink();	
	}
	
	@Then("the return policy opens in new tab")
	public void the_return_policy_opens_in_new_tab() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyReturnPolicyInNewTab();
	}
	
	@Then("the product code is displayed in buy box")
	public void the_product_code_is_displayed_in_buy_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayProductCode();
	}
	
	@And("click the increment sign of the quantity box")
	public void click_the_increment_sign_of_the_quantity_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage().clickIncremenQuantitytButton();
	}
	
	@And("user print the quantity of the quantity box")
	public void user_print_the_quantity_of_the_quantity_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage().getValueQuantityBox();
	}
	
	@Then("the updated quantity must be incremented by One")
	public void the_updated_quantity_must_be_incremented_by_one() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyUpdatedQuantityByOne();
	}
	
	@And("click the decrement sign of the quantity box")
	public void click_the_decrement_sign_of_the_quantity_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage().clickDecrementQuantityButton();
	}
	
	@Then("updated quantity must be decremented by One")
	public void updated_quantity_must_be_decremented_by_one() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyUpdatedDecrementQuantityByOne();
	}
	
	@Then("verify sign decrement is disabled when the quantity is One")
	public void verify_Sign_Decrement_Is_Disabled_When_The_Quantity_Is_One() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayDecrementSignDisabled();
	}
	
	@And("enter an integer number in the quantity box that is greate than Zero and is equal to or less than maximum quantity for product")
    public void enter_an_integer_number_in_the_quantity_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage().enterUpdatedQuantityInTheBoxThatIsGreaterThanZeroAndLessThanMaximumQuantity();
	}
	
	@Then("updated quantity is displayed in the quantity box")
	public void udpated_quantity_is_displayed_in_the_quantity_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayUpdatedQuantity();
	}
	
	@And("user enter number in the quantity box that is greater than maximum quantity")
	public void user_enter_number_in_the_quantity_box_that_is_greater_than_maximum_quantity() throws Exception {
		testContext.getPageObjectManager().getPDPPage().enterQuantityGreaterThanMaxixmum();
	}
	
	@Then("greater than maximum quantity is not updated in the quantity box")
	public void greater_Than_Maximum_Quantity_Is_Not_Updated_In_The_Quantity_Box() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyQuantityGreaterThanMaximumNotUpdate();
	}
	
	@And("enter number in quantity box that is not integer")
	public void enter_number_in_quantity_box_that_is_not_integer() throws Exception {
		testContext.getPageObjectManager().getPDPPage().enterNotIntegerNumberInQuantityBox();
	}
	
	@And("enter decimal number in quantity box")
	public void enter_decimal_number_in_quantity_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage().enterDecimalNumberInQuantityBox();
	}
	
	@Then("^user do not allowed  to enter the number that is not integer value$")
	public void user_do_not_allowed_to_enter_the_number_that_is_not_ingeger_value() throws Exception{
		testContext.getPageObjectManager().getPDPPage().verifyNotAllowedNotIntegerValue();
	}
	
	@Then("user is not able to enter decimal value in quantity box")
	public void user_is_not_able_to_enter_decimal_value_in_quantity_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyNotAllowedNotDecimalValue();
	}
	
	@And("enter number Zero in the quantity box")
	public void enter_number_zero_in_the_quantity_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage().enterQuantityZeroInQuantityBox();
	}
	
	@Then("user is not allowed to enter zero number")
	public void user_is_not_allowed_to_enter_zero_number() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyNotAllowedZeroValue();
	}
	
	@And("click the wishlist item")
	public void click_the_wishlist_item() throws Exception {
		testContext.getPageObjectManager().getPDPPage().clickWishlistButton();
	}
	
	@And("the default state of wishlist icon is displayed")
	public void display_Wishlist_Icon() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayDefaultStateWishlistIcon();
	}
	
	@Then("an error message is displayed prompting user to select all variant first")
	public void an_error_messsage_is_displayed_prompting_user_to_select_all_variant_first() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayErrorWishlist();
	}
	
	@Then("the editable badge label displays in store clearnce")
	public void the_editable_badge_label_displays_in_store_clearnce() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayBadgeInStoreClearnce();
	}
	
	@And("an additional editable disclaimer displays only select style size badge")
	public void an_additional_editable_disclaimer_displays_only_select_style_size_badge() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayBadgeSelectStyleSize();
	}
	
	@And("user select product variant")
	public void user_select_product_variant() throws Exception {
		testContext.getPageObjectManager().getPDPPage().select_Product_Variant();
	}
	
	@And("select some variants but keep some unselected size")
	public void select_some_variants_but_keep_some_unselected_size() throws Exception {
		testContext.getPageObjectManager().getPDPPage().select_Product_Variant();
	}
	
	@Then("Get it installed indicator is displayed on the pdp")
	public void get_it_installed_indicator_is_displayed_on_the_pdp() throws Exception {
		testContext.getPageObjectManager().getPDPPage().display_Get_It_Installed();
	}
	
	@And("message available at checkout is displayed on the pdp")
	public void message_available_at_checkout_is_displayed_on_the_pdp() throws Exception {
		testContext.getPageObjectManager().getPDPPage().display_Message_Available_At_Check();
	}
	
	@And("installation icon is displayed on pdp")
	public void installaion_icon_is_displayed_on_pdp() throws Exception {
		testContext.getPageObjectManager().getPDPPage().display_Installation_Icon();
	}
	
	@And("tool tip icon is displayed on installation indicator")
	public void tool_tip_icon_is_displayed_on_installation_indicator() throws Exception {
		testContext.getPageObjectManager().getPDPPage().display_Tool_Tip_Icon_Installation();
	}
	
	@And("click on tool tip icon")
	public void click_on_tool_tip_icon() throws Exception {
		testContext.getPageObjectManager().getPDPPage().click_Tool_Tip_Icon();
	}
	
	@Then("tool tip box opens and tool tip message along with close button is displayed")
	public void tool_tip_box_opens_and_tool_tip_message_along_with_close_buitton_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().display_Tool_Tip_Message_Installation_Indicator();
		testContext.getPageObjectManager().getPDPPage().display_Close_Button_Tool_Tip_Icon_Installation_Indicator();
	}
	
	@Then("tool tip is closed")
	public void tool_tip_is_closed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().not_Display_Tool_Tip_Message_Installation_Indicator();
	}
	
	@And("click on close button on installation indicator")
	public void click_on_close_button_on_installation_indicator() throws Exception {
		testContext.getPageObjectManager().getPDPPage().click_Close_Button_Tool_Tip_Icon_Installation_Indicator();
	}
	
	@When("user clicks on any where")
	public void user_clicks_on_anywhere() throws Exception {
		testContext.getPageObjectManager().getPDPPage().click_Tool_Tip_Icon();
	}
	
	@Then("the romance copy section is displayed")
	public void the_romance_copy_section_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().display_Romance_Copy_Section();
	}
	
	@And("romance copy section title is displayed")
	public void romance_copy_section_title_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().display_Romance_Copy_Section_Title();
	}
	
	@And("romance copy content is displayed")
	public void romance_copy_content_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().display_Romance_Copy_Content();
	}
	
	@Then("product manual title is displayed")
	public void product_manual_title_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().display_Product_Manual_Title();
	}
	
	@And("product manual description is displayed")
	public void product_manual_description_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().display_Product_Manual_Description();
	}
	
	@And("product manual link is displayed")
	public void product_manual_link_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().display_Product_Manual_Link();
	}
	
	@And("user save the product manual link url")
	public void user_save_the_product_manual_link_url() throws Exception {
		testContext.getPageObjectManager().getPDPPage().get_URL_Product_Manual_Link();
	}
	
	@And("user is click on product manual link")
	public void user_is_click_on_product_manual_link() throws Exception {
		testContext.getPageObjectManager().getPDPPage().click_Product_Manual_Link();
	}
	
	@Then("product manual pdf opens in new tab")
	public void product_manual_pdf_opens_in_new_tab() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		//testContext.getPageObjectManager().getPDPPage().verify_PDF_In_New_Tab();
	}
	
	@Then("verify the first 8 specifications are displayed on the PDP")
	public void verify_the_first_8_specifications_are_displayed_on_the_pdp() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displaySpecificationsEightSpecifications();
	}
	
	@Then("verify the view more specifications hyperlink is displayed")
	public void verify_the_view_more_specifications_hyperlink_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayViewMoreSpecifications();
	}
	
	@And("click on view more specifications hyperlink")
	public void click_on_view_more_specifications_hyper_link() throws Exception {
		testContext.getPageObjectManager().getPDPPage().clickViewMoreSpecifications();
	}
	
	@Then("verify the remaining list of the specifications displays on the pdp")
	public void verify_the_remaining_list_of_the_specifications_displays_on_the_pdp() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayRemainingListOfSpecifications();
	}
	
	@Then("view more specifications is not displayed any more")
	public void view_more_specifications_is_not_displayed_any_more() throws Exception {
		testContext.getPageObjectManager().getPDPPage().notDisplayViewMoreSpecifications();
	}
	
	@Then("view less specifications is displayed")
	public void view_less_specifications_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayViewLessSpecifications();
	}
	
	@And("click on view less specifications hyperlink")
	public void click_on_view_less_specifications_hyper_link() throws Exception {
		testContext.getPageObjectManager().getPDPPage().clickViewLessSpecifications();
	}
	
	@Then("view less specifications is not displayed")
	public void view_less_specifications_is_not_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().notDisplayViewLessSpecifications();
	}

	
	@Then("the swatch with sizes is displayed")
	public void the_swatch_with_sizes_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displaySwatchWithSize();
	}
	
	@Then("the size label is displayed")
	public void the_size_label_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displaySizeLabel();
	}
	
	@Then("unavailabe size is displayed")
	public void unavailabe_size_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayUnavailableSize();
	}
	
	@And("select one of the available size")
	public void select_one_of_the_available_size() throws Exception {
		testContext.getPageObjectManager().getPDPPage().clickAvailableSize();
	}
	
	@Then("available size is successfully selected")
    public void available_size_is_successfully_selected() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displaySelectedSize();
	}
	
	@Then("the lable of selected size is displayed")
	public void the_label_of_selected_size_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifySelectedSizeLabel();
	}
	
	@Then("the colour selector is displayed first")
	public void the_colour_selector_is_displayed_first() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayColourSelectorFirst();
	}
	
	@Then("the size selector is displayed second")
	public void the_size_selector_is_displayed_second() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displaySizeSelectorSecond();
	}
	
	@And("a default color is displayed")
	public void a_default_color_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayDefaultColor();
	}
	
	@Then("special buy is displayed")
	public void special_buy_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displaySpecialBuy();
	}
	
	@Then("the badge is displayed in pink color")
	public void the_badge_is_displayed_in_pink_color() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyColorCode();
	}
	
	@Then("the badge persists and displays for all variants of the product")
	public void the_badge_persissts_and_displays_for_all_variants_of_the_product() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displaySpecialBuyForAllVariant();
	}
	
	@Then("the in store only badge is applicable to all variants and remains displayed")
	public void the_in_store_only_badge_is_applicable_to_all_varaiants_and_remains_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayInStoreBuyForAllVariant();
	}
	
	@Then("the badge is displayed in Yellow color")
	public void the_badge_is_displayed_in_yellow_color() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyInStoreBageColorCode();
	}
	
	@And("user select product")
	public void user_select_product() throws Exception {
		testContext.getPageObjectManager().getPDPPage().selectProduct();
	}
	
	@Then("item is successfully added into wish list")
	public void item_is_successfully_added_into_wish_list() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayItemAddedWishlistMessage();
	}
	
	@Then("wishlist icon becomes active in red color")
	public void wishlist_icon_becomes_active_in_red_color() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyWishListIconColor();
	}
}
