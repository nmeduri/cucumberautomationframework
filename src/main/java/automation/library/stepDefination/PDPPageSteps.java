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
	
	@Then("^user do not allowed  to enter the number that is not integer value$")
	public void user_do_not_allowed_to_enter_the_number_that_is_not_ingeger_value() throws Exception{
		testContext.getPageObjectManager().getPDPPage().verifyNotAllowedNotIntegerValue();
	}
	
	@And("enter number Zero in the quantity box")
	public void enter_number_zero_in_the_quantity_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage().enterQuantityZeroInQuantityBox();
	}
	
	@Then("user is not allowed to enter zero number")
	public void user_is_not_allowed_to_enter_zero_number() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyNotAllowedZeroValue();
	}

}
