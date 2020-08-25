package automation.library.stepDefinitions;


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

	public PDPPageSteps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("^pdp url is up$")
	public void adobe_author_url_is_up() throws Exception {
		driver = driverFactory.getDriver(configFileReader.getBrowser());
		pageObjectManager = new PageObjectManager();
		testContext.getPageObjectManager().getPDPPage(driver).navigateTo_PDP_Page();
		
	}
	
	@Given("pdp url is available") 
	public void pdp_url_is_available() throws Exception {
		driver = driverFactory.getDriver(configFileReader.getBrowser());
		pageObjectManager = new PageObjectManager();
		testContext.getPageObjectManager().getPDPPage(driver).navigateTo_PDP_Page();
	}
	
	@Given("product detail page url is available on mobile") 
	public void pdp_url_is_available_on_mobile_view() throws Exception {
		driver = driverFactory.getDriver(configFileReader.getMobileView());
		pageObjectManager = new PageObjectManager();
		testContext.getPageObjectManager().getPDPPage(driver).navigateTo_PDP_Page();
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
	
	@When("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickOnAddToCartButton();
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

}
