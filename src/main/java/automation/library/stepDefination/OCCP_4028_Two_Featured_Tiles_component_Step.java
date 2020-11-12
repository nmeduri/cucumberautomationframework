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
 * This file contains the scenario of the user stories OCCP-3881 
 */
public class OCCP_4028_Two_Featured_Tiles_component_Step extends BaseClass{
	

		public OCCP_4028_Two_Featured_Tiles_component_Step(TestContext context) throws Exception {
			testContext = context;
			driverFactory = new DriverFactory();
			configFileReader = new ConfigFileReader();
		}
		@When ("Two Featured Tiles component url is available")
		public void Two_Featured_Tiles_component_url_is_available() throws Exception {
			testContext.getPageObjectManager().getTwoFeatureTileComponentPage(PageObject.getDriver()).navigateTo_TwoTileComponent_Page();
		}
		@Then ("Two Featured Tiles page is displayed")
		public void display_of_TwoFeatureTile_Page() throws Exception {
			testContext.getPageObjectManager().getTwoFeatureTileComponentPage(PageObject.getDriver()).display_Promotional_image();;
		}
		@And ("title of Two Featured Tiles should be displayed")
		public void display_of_TwoFeatureTile_title() throws Exception {
			testContext.getPageObjectManager().getTwoFeatureTileComponentPage(PageObject.getDriver()).display_two_featured_tile_Title();;
		}
		@And ("promotion image is displayed")
		public void display_TwoFeatureTile_Promotional_image() throws Exception {
			testContext.getPageObjectManager().getTwoFeatureTileComponentPage(PageObject.getDriver()).display_Promotional_image();;
		}
		@And ("promotion title is displayed")
		public void display_promotion_title() throws Exception {
			testContext.getPageObjectManager().getTwoFeatureTileComponentPage(PageObject.getDriver()).display_Promotional_Title();
		}
		@And ("promotion sub-title is displayed")
		public void display_promotion_Subtitle() throws Exception {
			testContext.getPageObjectManager().getTwoFeatureTileComponentPage(PageObject.getDriver()).display_Promotional_SubTitle();
		}
		 @And ("promotion CTA button or link is displayed")
		 public void display_promotion_CTABtn() throws Exception {
			testContext.getPageObjectManager().getTwoFeatureTileComponentPage(PageObject.getDriver()).display_Promotional_CTABtn();
		} 
		 @And("click on the CTA link present in two featured tile page")
		 public void Click_CTABtn() throws Exception {
				testContext.getPageObjectManager().getTwoFeatureTileComponentPage(PageObject.getDriver()).clickOnCTAbtnTwoTile();
		} 
		 @And ("user navigated to corresponding CTA link page")
		 public void display_CTAlink_page() throws Exception {
				testContext.getPageObjectManager().getTwoFeatureTileComponentPage(PageObject.getDriver()).verifyLinkNavigateOnCTALink();
		} 
        @And("featured tiles stacked, one below the other should be displayed")
        public void display_feature_tile() throws Exception {
			testContext.getPageObjectManager().getTwoFeatureTileComponentPage(PageObject.getDriver()).display_Promotional_image();
			testContext.getPageObjectManager().getTwoFeatureTileComponentPage(PageObject.getDriver()).display_Promotional_Title();

        }
        @When ("AEM author with access to configure two featured tile page component")
       public void aem_author_with_access_to_configure_two_featured_tile_page_component() throws Exception {
	       testContext.getPageObjectManager().getAEMTwoFeatureTileComponentPage(PageObject.getDriver()).navigate_To_TwoTileComponent_URL_AEM();
}
        @And ("click on Two featured Tile component")
        public void Click_TwoFeaturedTile_component() throws Exception {
			testContext.getPageObjectManager().getAEMTwoFeatureTileComponentPage(PageObject.getDriver()).clickTwofeaturetileComponent();
	} 
    	@Then("Verify the Component Title field is present in Two Featured Tiles component")
    	public void display_TwoFeaturedTile_componentTitle() throws Exception {
			testContext.getPageObjectManager().getAEMTwoFeatureTileComponentPage(PageObject.getDriver()).display_ComponentTitle_Field();
	} 
    	@Then ("Verify the Layout field is present in Two Featured Tiles component")
    	public void Click_TwoFeaturedTile_LayOut() throws Exception {
			testContext.getPageObjectManager().getAEMTwoFeatureTileComponentPage(PageObject.getDriver()).display_LayOut_Field();
	} 
    	@Then ("Verify Tile Image field is present in Two Featured Tiles component")
    	public void Click_TwoFeaturedTile_TileImage() throws Exception {
			testContext.getPageObjectManager().getAEMTwoFeatureTileComponentPage(PageObject.getDriver()).display_Tile_image();
	} 

}