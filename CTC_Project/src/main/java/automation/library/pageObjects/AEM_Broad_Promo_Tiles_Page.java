package automation.library.pageObjects;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import automation.library.logdetail.Log;

/**
 * This file contains the functions of Broad Promo Tiles Page
 * 
 */
public class AEM_Broad_Promo_Tiles_Page extends PageObject{
	TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Broad_Promo_Tiles_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to Broad Promo Tiles Page */
	public void navigateTo_Broad_Promo_Tiles_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Broad_Promo_Tiles_Page_Url());
	}
	
	/** This function clicks on Broad Promo Tiles component */
	public void clickBroadPromoTilesComponent() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTilesComponent())),30);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTilesComponent()), 20);
		//$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTilesComponent())), 10);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTilesComponent())));
	}
	
	/** This function update Title of Broad Promo Tile  */
	public void updateTitleOfBroadPromoTile() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTilesTitleAEM())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTilesTitleAEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Broad_Promo_Tiles_Title());
	}
	/** This function to click on Tile1 tab */
	public void click_on_tile1_tab() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickOnTile1Tab())), 5);
	}
	/** This function update Image Alt Text of Tile1  */
	public void updateImageAltTextOfTile1() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getImageAltTextOfTile1())),40);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getImageAltTextOfTile1()), 10);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getImageAltTextOfTile1())), 10);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getImageAltTextOfTile1())), 10, FileReaderManager.getInstance().getAEMDataReader().get_Image_Alt_Text_Of_Tile1());
	}
	/** This function to select left image alignment for tile1 */
	public void select_left_image_alignment_for_tile1() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSelectImageAlignmentOfTile1()), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSelectImageAlignmentOfTile1())), 20);
		//Thread.sleep(2000);
		//performDropDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSelectImageAlignmentOfTile1()),"selectByValue","left");
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSelectLeftImageAlignmentOfTile1())), 30);
		//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSelectLeftImageAlignmentOfTile1())));
	}
	/** This function update Title for Tile1  */
	public void updateTitleOfTile1() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getTitleOfTile1())), 10);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getTitleOfTile1())), 10, FileReaderManager.getInstance().getAEMDataReader().get_Title_Of_Tile1());
	}
	/** This function update Sub Title for Tile1  */
	public void updateSubTitleOfTile1() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSubTitleOfTile1())),20);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSubTitleOfTile1()), 10);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSubTitleOfTile1())), 10);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSubTitleOfTile1())), 10, FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_Of_Tile1());
	}
	/** This function update Button Title for Tile1  */
	public void updateButtonTitleOfTile1() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getButtonTitleOfTile1())), 10);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getButtonTitleOfTile1())), 10, FileReaderManager.getInstance().getAEMDataReader().get_Button_Title_Of_Tile1());
	}
	/** This function to Update Button URL for tile1 */
	public void updateButtonURLOfTile1() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getButtonURLOfTile1())), 20);
	}
	/** This function to Select Target On Click Of Button for tile1 */
	public void selectTargetOnClickOfButtonForTile1() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getTargetClickOnButtonOfTile1()), 10);
		//performDropDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDisplayKeylineOfTile1()),"selectByText","New Tab");
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getTargetClickOnButtonOfTile1())), 10);
		Thread.sleep(2000);
		//$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getTargetClickOnNewTabOfTile1())), 10);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getTargetClickOnNewTabOfTile1())));
		
	}
	/** This function to select display keyline for tile1 */
	public void selectDisplayKeylineForTile1() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDisplayKeylineOfTile1()), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDisplayKeylineOfTile1())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDisplayKeylineNoOfTile1())), 5);
	}
	/** This function to select keyline color for tile1 */
	public void selectKeylineColorForTile1() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getKeyLineColorOfTile1())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getKeyLineColorRedOfTile1())), 5);
	}
	/** This function to select Save Story Type for tile1 */
	public void selectSaveStoryTypeForTile1() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryTypeTile1()), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryTypeTile1())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryTypeDollarTile1())), 5);
	}
	/** This function update save story text for Tile1  */
	public void updateSaveStoryTextOfTile1() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryTextTile1())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryTextTile1())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Save_Story_Text_Of_Tile1());
	}
	/** This function update save story value for Tile1  */
	public void updateSaveStoryValueOfTile1() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryvalueTile1())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryvalueTile1())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Save_Story_Value_Of_Tile1());
	}
	/** This function to select save story background color for tile1 */
	public void selectSaveStoryBackgroundColorForTile1() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryBgColorTile1())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryBgColorYellowTile1())), 5);
	}
	/** This function to configure desktop title image for tile1 */
	public void pickDesktopTitleImageForTile1() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getPickDesktopImageOfTile1())), 40);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getCtcWeb())), 40);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDeskopImagePath())), 40);
		//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDeskopImagePath())));
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSelectButtonPickerDialog())), 10);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDisplayDesktopImageTile1())),40);	
	}
	/** This function to configure mobile title image for tile1 */
	public void pickMobileTitleImageForTile1() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getPickMobileImageTile1())),40);
		//$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getPickMobileImageTile1())), 40);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getPickMobileImageTile1())));
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getCtcWebLinkRewards())), 30);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getMobileImagePath())), 40);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSelectButtonPickerDialog())), 40);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDisplayMobileImageTile1())),40);	
	}
	/** This function to click on Tile2 tab */
	public void click_on_tile2_tab() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickOnTile2Tab())), 40);
	}
	/** This function update Image Alt Text of Tile2  */
	public void updateTile2OfImageAltText() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getImageAltTextOfTile2()), 10);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getImageAltTextOfTile2())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getImageAltTextOfTile2())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Image_Alt_Text_Of_Tile2());
	}
	/** This function to select left image alignment for tile2 */
	public void select_left_image_alignment_for_tile2() throws Exception {
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSelectLeftImageAlignmentOfTile2()), 40);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSelectImageAlignmentOfTile2())));
		//$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSelectLeftImageAlignmentOfTile2())), 30);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSelectLeftImageAlignmentOfTile2())));
	}
	/** This function update Title for Tile2  */
	public void updateTitleOfTile2() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getTitleOfTile2())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getTitleOfTile2())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Title_Of_Tile2());
	}
	/** This function update Sub Title for Tile2  */
	public void updateSubTitleOfTile2() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSubTitleOfTile2())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSubTitleOfTile2())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_Of_Tile2());
	}
	/** This function update Button Title for Tile2  */
	public void updateButtonTitleOfTile2() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getButtonTitleOfTile2())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getButtonTitleOfTile2())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Button_Title_Of_Tile2());
	}
	/** This function to Update Button URL for tile2 */
	public void updateButtonURLOfTile2() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getButtonURLOfTile2())), 5);
	}
	/** This function to Select Target On Click Of Button for tile2 */
	public void selectTargetOnClickOfButtonForTile2() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getTargetClickOnButtonOfTile2()), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getTargetClickOnButtonOfTile2())), 5);
		Thread.sleep(2000);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getTargetClickOnSameTabOfTile2())));
	}
	/** This function to select display keyline for tile2 */
	public void selectDisplayKeylineForTile2() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDisplayKeylineOfTile2()), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDisplayKeylineOfTile2())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDisplayKeylineYesOfTile2())), 5);
	}
	/** This function to select keyline color for tile2 */
	public void selectKeylineColorForTile2() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getKeyLineColorOfTile2())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getKeyLineColorYellowOfTile2())), 5);
	}
	/** This function to select Save Story Type for tile2 */
	public void selectSaveStoryTypeForTile2() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryTypeTile2()), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryTypeTile2())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryTypePercentageTile2())), 5);
	}
	/** This function update save story text for Tile2  */
	public void updateSaveStoryTextOfTile2() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryTextTile2())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryTextTile2())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Save_Story_Text_Of_Tile2());
	}
	/** This function update save story value for Tile2  */
	public void updateSaveStoryValueOfTile2() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryvalueTile2())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryvalueTile2())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Save_Story_Value_Of_Tile2());
	}
	/** This function to select save story background color for tile2 */
	public void selectSaveStoryBackgroundColorForTile2() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryBgColorTile2())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSaveStoryBgColorRedTile2())), 5);
	}
	/** This function to configure desktop title image for tile2 */
	public void pickDesktopTitleImageForTile2() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getPickDesktopImageOfTile2())), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getCtcWeb())), 40);
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDeskopImagePathTile2()), 20);
		//$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDeskopImagePathTile2())),40);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDeskopImagePathTile2())), 40);
		//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDeskopImagePathTile2())));
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSelectButtonPickerDialog())), 40);
		//$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDisplayDesktopImageTile2())),80);	
	}
	/** This function to configure mobile title image for tile2 */
	public void pickMobileTitleImageForTile2() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getPickMobileImageTile2())),40);
		//$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getPickMobileImageTile2())), 40);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getPickMobileImageTile2())));
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getCtcWeb())), 40);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getMobileImagePathTile2())),20);
		//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getMobileImagePathTile2())));
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getMobileImagePathTile2())), 40);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getSelectButtonPickerDialog())), 40);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getDisplayMobileImageTile2())),40);	
	}
	/** This function update Tool Tip of Title and Sub-Title for Tile1 */
	public void toolTipOfTitleSubTitleCharLimitTile1() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickOnToolTipOfTitleTile1())), 10);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getToolTipOfTitleCharLimitTile1())), 20);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickOnToolTipOfSubTitleTile1())), 10);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getToolTipOfSubTitleCharLimitTile1())), 20);
	}
	/** This function update Tool Tip of Button Title for Tile1 */
	public void toolTipOfButtonTitleCharLimitTile1() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickOnToolTipOfButtonTitleTile1())), 10);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getToolTipOfButtonTitleCharLimitTile1())), 10);
	}
	/** This function update Tool Tip of Title and Sub-Title for Tile2*/
	public void toolTipOfTitleSubTitleCharLimitTile2() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickOnToolTipOfTitleTile2())), 10);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getToolTipOfTitleCharLimitTile2())), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickOnToolTipOfSubTitleTile2())), 10);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getToolTipOfTitleCharLimitTile2())), 10);
	}
	/** This function update Tool Tip of Button Title for Tile 2 */
	public void toolTipOfButtonTitleCharLimitTile2() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickOnToolTipOfButtonTitleTile2())), 10);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getToolTipOfTitleCharLimitTile2())), 10);
	}
	/** broad_promot_tiles_componen is  dispalyed */
	public void displayBroadPromotTilesComponent() throws Exception {
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getbroadPromoTiles())), 15);
		//$displayFindElement(By.xpath(getbroadPromoTiles()));
	}
	/** This function do not Filling Mandatory Fileds And Save The Changes */
	public void notFillingMandatoryFiledsAndSaveTheChanges() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickOnTile1Tab())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClearDesktopImageTile1())), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickToolTipOfImageTile1())), 20);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getErroFieldMessageOfImageTile1())), 40);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getImageAltTextOfTile1()), 10);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getImageAltTextOfTile1())), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickToolTipOfImageAltText())), 30);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getErrorFieldMessageImageAltText())), 50);
		
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickOnTile2Tab())), 20);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClearDesktopImageTile2())), 20);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickToolTipOfImageTile2())), 10);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getErroFieldMessageOfImageTile2())), 30);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getImageAltTextOfTile2()), 10);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getImageAltTextOfTile2())), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getClickToolTipOfImageAltText())), 10);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getErrorFieldMessageImageAltText())), 40);
	}
	/** This function is verify that promotion image is displayed for first tile*/
	public void displayPromotionImagesTitleSubtitleCTAButtonKeylineAndOffer() throws Exception {
		$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTileImageAEM());
		$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTileTitleAEM());
		$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTileSubTitleAEM());
		$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTileCTAButtonAEM());
		$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBoadPromoTileOfferAEM());
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTileKeyLineTile1AEM()), 20);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTileKeyLineTile1AEM())), 40);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTileKeyLineTile2AEM())), 40);
	}
}
