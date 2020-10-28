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
 * This file contains the scenario of user stories OCCP-968
 */
public class OCCP_968_Broad_Promo_Tiles_Component_Steps extends BaseClass{

	public OCCP_968_Broad_Promo_Tiles_Component_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("broad promo tiles EN url is available")
    public void broad_promo_tiles_EN_url_is_available() throws Exception {   
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).navigateTo_BroadPromoTiles_Page_En();
    }
	
	@When("broad promo tiles FR url is available")
    public void broad_promo_tiles_FR_url_is_available() throws Exception {   
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).navigateTo_BroadPromoTiles_Page_Fr();
    }
	
	@When("broad promo tiles page is displayed")
	public void broad_promo_tiles_page_is_dsplayed() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).display_BroadPromoTiles_Page();
	}
	
	@Then("user scrolls to the broad promo tiles")
	public void user_scrolls_down_to_the_broad_promo_tiles() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).scrollDownToBroadPromoTiles();	
	}
	
	@And("user should be able to see broad promo tiles")
	public void user_should_be_able_to_see_broad_promo_tiles() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).displayBroadPromoTiles();	
	}
	@And("2broad promo tiles should display the tiles in a single row,one next to the other")
	public void twobroad_promo_tiles_should_display_the_tiles_in_asingle_row_one_next_to_the_other() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).display2TilesForBroadPromoComponent();
	}
	@And("promotion image should display for each tile")
	public void promotion_image_should_display_for_tile1() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).displayPromotionImagesForTiles();
	}
	@And("promotion title should display for each tile")
	public void promotion_title_should_display_for_tile1() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).displayPromotionTitlesForTiles();
	}
	@And("promotion sub-title should display for each tile")
	public void promotion_subtitle_should_display_for_tile1() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).displayPromotionSubTitleForTile1();
	}
	@And("promotion CTA button should display for each tile")
	public void promotion_CTA_Button_should_display_for_tile1() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).displayPromotionCTAButtonForTile1();
	}
	@And("promotion key-line should display for each tile")
	public void promotion_key_line_should_display_for_tile1() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).displayPromotionKeyLineForTile1();
	}
	@And("promotion offer should display for each tile")
	public void promotion_offer_should_display_for_tile1() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).displayPromotionOfferForTile1();
	}
	@And("mobile promotion image should display for each tile")
	public void mobile_promotion_image_should_display_for_tile1() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).displayPromotionImagesForTilesMobile();
	}
	@When("promotion image is clickable")
	public void promotion_image_is_clickable() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).clickOnPromotionImage();
	}
	@When("promotion CTA button is clickable")
	public void promotion_CTA_button_is_clickable() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).clickOnPromotionCTAButton();
	}
	@Then("user should be on automotive page")
	public void user_should_be_on_automotive_page() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).display_Automotive_Page_Title();
	}
	@When("mobile promotion image is clickable")
	public void mobile_promotion_image_is_clickable() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).clickOnPromotionImageOnMobile();
	}
	@When("mobile promotion CTA button is clickable")
	public void mobile_promotion_CTA_button_is_clickable() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).clickOnPromotionCTAButtonOnMobile();
	} 
	@And("Broad promo tiles should be stacked one below the other")
	public void broad_promo_tiles_should_be_stacked_one_below_the_other() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).display2TilesForBroadPromoComponent();
	}

	@When("AEM author with access to configure broad promo tiles component")
	public void aem_author_with_access_to_configure_broad_promo_tiles_component() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).navigateTo_Broad_Promo_Tiles_Page();
	}
	@And("click on broad promo tiles component")
	public void click_on_broad_promo_tiles_component() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).clickBroadPromoTilesComponent();
	}
	@And("update title of broad promo tile")
	public void update_title_of_broad_promo_tile() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateTitleOfBroadPromoTile();
	}
	@When("click on tile1 tab")
	public void click_on_tile1_tab() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).click_on_tile1_tab();
	}
	@Then("update image alt text of tile1")
	public void update_image_alt_text_of_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateImageAltTextOfTile1();
	}
	@And("select left image alignment for tile1")
	public void select_left_image_alignment_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).select_left_image_alignment_for_tile1();
	}
	@And("update title for tile1")
	public void update_title_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateTitleOfTile1();
	}
	@And("update sub title for tile1")
	public void update_sub_title_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateSubTitleOfTile1();
	}
	@And("update button title for tile1")
	public void update_button_title_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateButtonTitleOfTile1();
	}
	@And("update button URL for tile1")
	public void update_button_URL_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateButtonURLOfTile1();
	}
	@And("select target on click of button for tile1")
	public void select_target_on_click_of_button_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).selectTargetOnClickOfButtonForTile1();
	}
	@And("select display keyline for tile1")
	public void select_display_keyline_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).selectDisplayKeylineForTile1();
	}
	@And("select keyline color for tile1")
	public void select_keyline_color_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).selectKeylineColorForTile1();
	}
	@And("select Save Story Type for tile1")
	public void select_save_story_type_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).selectSaveStoryTypeForTile1();
	}
	@And("update save story text for tile1")
	public void update_save_story_text_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateSaveStoryTextOfTile1();
	}
	@And("update save story value for tile1")
	public void update_save_story_value_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateSaveStoryValueOfTile1();
	}
	@And("select save story background color for tile1")
	public void select_save_story_background_color_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).selectSaveStoryBackgroundColorForTile1();
	} 
	@And("configure desktop title image for tile1")
	public void configure_desktop_title_image_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).pickDesktopTitleImageForTile1();
	}
	@And("configure mobile tile image for tile1")
	public void configure_mobile_title_image_for_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).pickMobileTitleImageForTile1();
	}
	@When("click on tile2 tab")
	public void click_on_tile2_tab() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).click_on_tile2_tab();
	}
	@Then("update tile2 of image alt text")
	public void update_tile2_of_alt_text() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateTile2OfImageAltText();
	}
	@And("select tile2 of left image alignment")
	public void select_tile2_of_left_image_alignment() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).select_left_image_alignment_for_tile2();
	}
	@And("update tile2 of title")
	public void update_tile2_of_title() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateTitleOfTile2();
	}
	@And("update tile2 of sub title")
	public void update_tile2_of_sub_title() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateSubTitleOfTile2();
	}
	@And("update tile2 button title")
	public void update_tile2_of_button_title() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateButtonTitleOfTile2();
	}
	@And("update tile2 of button URL")
	public void update_tile2_of_button_URL() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateButtonURLOfTile2();
	}
	@And("select tile 2 of target on click of button")
	public void select_tile2_of_target_on_click_of_button() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).selectTargetOnClickOfButtonForTile2();
	}
	@And("select display keyline for tile2")
	public void select_display_keyline_for_tile2() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).selectDisplayKeylineForTile2();
	}
	@And("select color of keyline for tile2")
	public void select_color_of_keyline_for_tile2() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).selectKeylineColorForTile2();
	}
	@And("select save story type for tile2")
	public void select_tile2_save_story_type() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).selectSaveStoryTypeForTile2();
	}
	@And("update tile2 of save story text")
	public void update_tile2_save_story_text() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateSaveStoryTextOfTile2();
	}
	@And("update save story value of tile2")
	public void update_save_story_value_of_tile2() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).updateSaveStoryValueOfTile2();
	}
	@And("select tile2 save story background color")
	public void select_tile2_save_story_background_color() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).selectSaveStoryBackgroundColorForTile2();
	} 
	@And("configure tile2 of desktop title image")
	public void configure_tile2_of_desktop_title_image() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).pickDesktopTitleImageForTile2();
	}
	@And("configure tile2 mobile tile image for tile1")
	public void configure_tile2_mobile_title_image() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).pickMobileTitleImageForTile2();
	}
	@And("add promotional title and subtitle  with tool tip indicating character limit Tile1")
	public void add_promotional_title_and_subtitle_with_tool_tip_indicating_character_limit_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).toolTipOfTitleSubTitleCharLimitTile1();
	}
	@And("add button title with tooltip character limit tile1")
	public void add_button_title_with_tooltip_character_limit_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).toolTipOfButtonTitleCharLimitTile1();
	}
	@And("tile2 of add promotional title and subtitle  with tool tip indicating character limit")
	public void tile2_add_promotional_title_and_subtitle_with_tool_tip_indicating_character_limit_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).toolTipOfTitleSubTitleCharLimitTile2();
	}
	@And("tile2 of add button title with tooltip character limit")
	public void tile2_add_button_title_with_tooltip_character_limit_tile1() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).toolTipOfButtonTitleCharLimitTile2();
	}
	@And("broad promot tiles component is displayed on the site")
	public void broad_promot_tiles_component_is_displayed_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).displayBroadPromotTilesComponent();
	}
	@And("promotion image,title,sub-title,CTA button,keyline and offer should display for each tile")
	public void promotion_image_title_subtitle_CTA_button_keyline_and_offer_should_display_for_each_tile() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).displayPromotionImagesTitleSubtitleCTAButtonKeylineAndOffer();
	}
	@Then("user should see authoring error message as the mandatory fields are not entered")
	public void user_should_see_authoring_error_message_as_the_mandatory_fields_are_not_entered() throws Exception {
		testContext.getPageObjectManager().getAEMBroadPromoTilesPage(PageObject.getDriver()).notFillingMandatoryFiledsAndSaveTheChanges();
	}
}
