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
 * This file contains the scenario of user stories OCCP-4420
 */
public class BannersSteps extends BaseClass{
	public BannersSteps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("edge to edge banner url is available for EN") 
	public void edge_banner_url_is_available() throws Exception {	
		testContext.getPageObjectManager().getBannerPages(PageObject.getDriver()).navigateTo_EdgeToEdge_Banner_URL_En();
	}
	@When("edge banner page is displayed for the product")
	public void edge_banner_page_is_displayed_for_the_product() throws Exception {
		testContext.getPageObjectManager().getBannerPages(PageObject.getDriver()).display_EdgeToEdge_Banner_Page();
	}
	@And("title is displayed to the left side of the page")
	public void title_is_displayed_to_the_left_of_the_page() throws Exception {
		testContext.getPageObjectManager().getBannerPages(PageObject.getDriver()).displayEdgeBannerTitle();		
	}
	@Then("user should be able to view the edge banner")
	public void user_should_be_able_to_view_the_edge_banner() throws Exception {
		testContext.getPageObjectManager().getBannerPages(PageObject.getDriver()).displayEdgeBanner();		
	}
	@And("description is displayed to the left side of the page")
	public void description_is_displayed_to_the_left_of_the_page() throws Exception {
		testContext.getPageObjectManager().getBannerPages(PageObject.getDriver()).displayEdgeBannerDescription();		
	}
	@And("edge banner image is displayed")
	public void edge_banner_image_is_displayed() throws Exception {
		testContext.getPageObjectManager().getBannerPages(PageObject.getDriver()).displayEdgeBannerImage();		
	}
	@Given("without image edge to edge banner url is available for EN") 
	public void without_image_edge_banner_url_is_available() throws Exception {	
		testContext.getPageObjectManager().getBannerPages(PageObject.getDriver()).navigateTo_EdgeToEdge_Banner_URL_Without_Image_En();
	}
	
	@And("image should not displayed to the right side of the page")
	public void image_should_not_displayed_to_the_right_of_the_page() throws Exception {
		testContext.getPageObjectManager().getBannerPages(PageObject.getDriver()).notDisplayEdgeBannerImage();		
	}
	@Given("edge to edge banner for FR locale url is available") 
	public void edge_banner_fr_locale_url_is_available() throws Exception {	
		testContext.getPageObjectManager().getBannerPages(PageObject.getDriver()).navigateTo_EdgeToEdge_Banner_Fr_Locale_URL();
	}
	@Given("without image edge to edge banner FR locale url is available") 
	public void without_image_edge_banner_fr_locale_url_is_available() throws Exception {	
		testContext.getPageObjectManager().getBannerPages(PageObject.getDriver()).navigateTo_EdgeToEdge_Banner_Fr_Locale_URL_Without_Image();
	}
}
