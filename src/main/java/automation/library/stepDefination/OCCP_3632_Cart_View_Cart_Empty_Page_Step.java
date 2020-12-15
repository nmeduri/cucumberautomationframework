package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
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
 * This file contains the scenario of user stories OCCP-862
 */

public class OCCP_3632_Cart_View_Cart_Empty_Page_Step extends BaseClass {
	
	public OCCP_3632_Cart_View_Cart_Empty_Page_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	
	}
	
	@When("authenticated cart page is available")
	public void authenticated_cart_page_is_available() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).navigateTo_Authenticate_User_Cart_Page();
	}
	
	@Then("shopping cart - 0 items should be displayed at the top")
	public void shopping_cart_0_items_should_be_displayed_at_the_top() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayShoppingCartZero();
	}
	
	@Then("message indicating the cart is empty should displayed")
	public void message_indicating_the_cart_is_empty_should_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayEmptyShoppingCartMessage();
	}
	
	@Then("user should prompted to Sign In to their account")
	public void user_should_prompted_to_sign_in_to_their_account() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displaySignInButton();
	}
	
	@Then("a link to Continue Shopping should displayed")
	public void a_link_to_continue_shopping_should_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).dispalyContinueShoppingButton();
	}
	
	@Then("user click on continue shopping cart page")
	public void user_click_on_continue_shopping_cart_page() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).clickContinueShoppingButton();
	}
	
	@Then("user should redirect to main landing page")
	public void user_should_redirect_to_main_landing_page() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).verifyLinkLandingOnMainPage();
	}
	
	@And("click on cart sign in button")
	public void click_on_cart_sign_in_button() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).clickSignInButton();
	}
	
	@And("navigate on back page")
	public void navigate_on_back_page() throws Exception {
		PageObject.getDriver().navigate().back();
	}
	
	@Then("button view wish list is displayed")
	public void button_view_wish_list_is_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayViewListButton();
	}
}
