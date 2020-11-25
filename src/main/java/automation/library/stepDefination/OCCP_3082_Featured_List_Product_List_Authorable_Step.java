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
 * This file contains the scenario of user stories OCCP-3082
 */
public class OCCP_3082_Featured_List_Product_List_Authorable_Step extends BaseClass{

	public OCCP_3082_Featured_List_Product_List_Authorable_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("product featured list page url is available") 
	public void featured_list_page_url_is_available() throws Exception {
		
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).navigateTo_Featured_List_Product_List_Page();
	}
	@When("product featured list page is displayed")
	public void product_featured_list_page_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).display_Product_Featured_List_Page();
	}
	@And("user should be able to see product featured list component on the page")
	public void user_should_be_able_to_see_product_featured_list_component_on_the_page() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).dispalyProductFeaturedListComponent();
	}
	@When("click on Product Card")
	public void click_on_product_card() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).clickOnProductCard();
	}
	@When("The destination URL is auto populated based on the product code entered by user")
	public void destination_URL_is_auto_populated_based_on_the_pcode_entered_by_user() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyDestinationURLIsAutoPopulatedBasedOnTheProductCode();
	}
	@When("click on the Product Card mobile")
	public void click_on_the_product_card_mobile() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).clickOnProductCardMobile();
	}
	@And ("user is displayed with product Title")
	public void user_is_displayed_with_product_Title() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).displayProductlistTitle();
	}
	@And ("user is displayed with product card")
	public void user_is_displayed_with_product_card() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).displayProductCard();
	}
	@And ("user is displayed with product image")
	public void user_is_displayed_with_product_image() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).displayProductListImage();
	}
	@Then("validate the number of cards should be displayed")
	public void validate_the_number_of_cards_displayed() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).display_set_of_cards();
	}
   @Then ("valiadte pagination second dots displayed in product list page")
   public void validate_the_pagination_dot_displayed() throws Exception {
	testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).displayAssociatedPaginationDotsTwo();
	}
	
@Then ("display last pagination dot on the carousel is highlighted")
public void display_last_pagination() throws Exception {
	testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyLastAssociatedPaginationDotsHighlighted_FPL();
   }
@Then ("display first pagination dot on the carousel is highlighted")
public void display_First_pagination() throws Exception {
	testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyfirstAssociatedPaginationDotsHighlighted_FPL();
   }
@When ("AEM author with access to configure featured product list authorable page")
public void AEM_author_with_access_to_configure_featured_product_list_authorable_page() throws Exception {
	testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).navigateTo_Featured_product_List_Author_Page();
   }
@And ("click on featured product list panel")
public void click_featured_product_list_panel() throws Exception {
	testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).clickFeaturedProductList();
   }
@And ("configure the product code component on the authored page")
public void configure_product_code_component() throws Exception {
	testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).enterProductCodeDetail();
   }
@And ("configure the product image component on the authored page")
public void configure_product_image_component() throws Exception {
	testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).EnterProductImageDetail();
   }
@And ("fill minimum thershold value in product feature list with less than min")
public void fill_minimum_thershold_value_Product_Feature_lit_with_less_than_min() throws Exception {
testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).click_delete_icon_author();
}
@And ("do not fill the mandatory field in feature product list page")
public void do_not_fill_mandatory_field_in_feature_product_list_page() throws Exception {
testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).clear_mandatory_field();
}
@Then ("user should see error message as  mandatory field not entered")
public void display_error_message() throws Exception {
testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).displayErrorImage();
}

}
