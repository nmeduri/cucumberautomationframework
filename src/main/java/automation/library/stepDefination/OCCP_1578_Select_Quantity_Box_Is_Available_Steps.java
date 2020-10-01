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
 * This file contains the scenario of user stories - 1578
 */

public class OCCP_1578_Select_Quantity_Box_Is_Available_Steps extends BaseClass {
      PDP_Page pdpPage;
	public OCCP_1578_Select_Quantity_Box_Is_Available_Steps(TestContext context) throws Exception {
		testContext = context;
		pdpPage = testContext.getPageObjectManager().getPDPPage();
		configFileReader = new ConfigFileReader();
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
	
	@And("select some variants but keep some unselected size")
	public void select_some_variants_but_keep_some_unselected_size() throws Exception {
		testContext.getPageObjectManager().getPDPPage().select_Product_Variant();
	}
	
	@When("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() throws Exception {
		testContext.getPageObjectManager().getPDPPage().clickOnAddToCartButton();
	}
	
	@Then("an error message is displayed prompting user to select all variant first")
	public void an_error_messsage_is_displayed_prompting_user_to_select_all_variant_first() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayErrorWishlist();
	}
	
	@Then("the quantity box is visible")
	public void the_qunatity_box_is_visible() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyQuantityBoxVisible();
	}
	
	@And("the quantity value is defaulted to one")
	public void the_quantity_value_is_defaulted_to_one() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyQuantityValueDefaultedToOne();
	}
	
	@Then("quantity selector box is visible and user is able to click plus and minus")
	public void quantity_selector_box_is_visible_and_user_is_able_to_click_plus_and_minus() throws Exception {
		testContext.getPageObjectManager().getPDPPage().verifyQuantityBoxVisible();
		testContext.getPageObjectManager().getPDPPage().clickIncremenQuantitytButton();
		testContext.getPageObjectManager().getPDPPage().clickDecrementQuantityButton();
	}
}
