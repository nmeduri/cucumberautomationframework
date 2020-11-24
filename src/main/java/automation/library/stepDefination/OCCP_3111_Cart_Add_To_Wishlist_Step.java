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

public class OCCP_3111_Cart_Add_To_Wishlist_Step extends BaseClass {
	
	public OCCP_3111_Cart_Add_To_Wishlist_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("cart url is available") 
	public void cart_url_is_available() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).navigateTo_Cart_Page();
	}
	
	@When("cart page is displayed for the product")
	public void cart_page_is_displayed_for_the_product() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).display_Cart_Page();
	}
	
	@And("click on add to wishlist when user reached maximum no of items permitted in wishlist")
	public void click_on_add_wishlist() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).ClickOnWishList();
	}

	@And("error message should be displayed you have reached the limit of 2 items added to wishlist")
	public void error_message_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayErrorMessageWishlistLimit();
	}
	
	@And("view wishlist and close links should be displayed")
	public void wishlist_and_close_links() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayLinks();
	}
	
	@And("click on the close link")
	public void click_on_the_close_link() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).ClickOnCloseLink();
	}
	
	@And("the message should be closed")
	public void message_should_be_closed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).notDisplayErrorMessageWishlistLimit();
	}
	
	@And("in the cart page wishlist icon should be displayed next to the product")
	public void wishlist_icon_should_be_displayed_next_to_product() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayRespectiveWishListIcon();
	}
	
	@Then("access the product item and click on respective wishlist icon")
	public void wishlist_icon_should_be_clicked() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).ClickRespectiveWishListIcon();
	}
	
	@And("on clicking product item should be added and moved successfully to wishlist")
	public void item_should_be_moved_to_wishlist() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).verifyItemMovedToWishList();
	}
	
	@And("the item should be deleted or not displayed in the cart page")
	public void item_should_not_be_displayd_in_cart() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).notDisplayProductItem();
	}
	
	@Then("item has been added to wishlist message should be displayed")
	public void item_has_been_added_message() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayItemAddedMessage();
	}
	
	@And("a link should be displayed to view wishlist")
	public void view_wishlist_link_displayed() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayViewWishlist();
	}
	
	@And("on clicking product item should be not be added to wishlist as it is already present")
	public void item_should_not_be_moved_to_wishlist() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).verifyItemMovedToWishList();
	}
	
	//AEM
	@When("aem author with access navigates to add to wishlist cart page")
	public void author_navigates_to_add_to_wishlist_aem_page() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).navigateToAddToWishlistAemPage();
	}
	
	@And("user should be able to author text label item has been added to wishlist")
	public void author_label_text_item_has_been_added_to_wishlist() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).displayItemAddedToWishlistAEM();
	}
	
	@And("access the label text property and author the text")
	public void access_label_text_and_author() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).enterDataItemAddedToWishlistAEM();
	}
	
	@And("click on save and publish wishlist changes")
	public void click_on_save_button() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).clickOnSaveAndPublishWishlistChanges();
	}
	
	@And("verify wishlist item added label text changes are reflected on ctc site")
	public void verify_wishlist_item_added_text_changes() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).verifyItemAddedToWishlistTextChangesReflected();
	}
	
	@And("user should be able to author text label view wishlist")
	public void author_label_text_view_wishlist() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).displayViewWishlistAEM();
	}
	
	@And("access the view wishlist label text property and author the text")
	public void access_view_wishlist_label_text_and_author() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).enterDataViewWishlistAEM();
	}
	
	@And("verify view wishlist text changes are reflected on ctc site")
	public void verify_view_wishlist_text_changes() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).verifyViewWishlistTextChangesReflected();
	}
	
	@And("user should be able to author text label close")
	public void author_close_label_text() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).displayCloseAEM();
	}
	
	@And("access the close label text property and author the text")
	public void access_close_label_text_and_author() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).enterDataCloseAEM();
	}
	
	@And("verify close text changes are reflected on ctc site")
	public void verify_close_text_changes() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).verifyCloseTextChangesReflected();
	}
	
	@And("user should be able to author wishlist max limit message")
	public void user_should_be_able_to_author_wishlist_max_limit_text() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).displayWishlistMaxLimitAEM();
	}
	
	@And("access the wishlist max limit label text property and author the text")
	public void author_wishlist_max_limit_text() throws Exception {
		testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).enterDataWishlistMaxLimitAEM();
	}
	
	/*
	 * @And("verify wishlist max limit text changes are reflected on ctc site")
	 * public void verify_wishlist_max_limit_text_changes() throws Exception {
	 * testContext.getPageObjectManager().getAEMCartPage(PageObject.getDriver()).
	 * verifyWishlistMaxLimitTextChangesReflected(); }
	 */
			

	@Then ("click on the view Wishlist link")
	public void click_on_the_view_Wishlist_link() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).clickViewWishlist();
	}
	@And ("user is directed to the Wishlist page")
	public void user_is_directed_to_the_Wishlist_page() throws Exception {
		testContext.getPageObjectManager().getCartPage(PageObject.getDriver()).displayWishListPage();
	}
}
