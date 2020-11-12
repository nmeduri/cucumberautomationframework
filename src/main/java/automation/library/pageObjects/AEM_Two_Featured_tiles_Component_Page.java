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
/**
 * This file contains the functions of AEM Two Featured tiles Component Page
 * 
 */
public class AEM_Two_Featured_tiles_Component_Page extends PageObject{
TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Two_Featured_tiles_Component_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to two tile component Page AEM */
	public void navigate_To_TwoTileComponent_URL_AEM() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Two_Tile_Component_Url_AEM());
	}
	/** This function clicks on two feature tile component  */
	public void clickTwofeaturetileComponent() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMTwoFeaturedTileComponentPageLocator().get_TwoFeaturedTile_Component_AEM())),40);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMTwoFeaturedTileComponentPageLocator().get_TwoFeaturedTile_Component_AEM())));
	}
	/** This function displays Component title field on two feature tile component  */
	public void display_ComponentTitle_Field() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMTwoFeaturedTileComponentPageLocator().get_TwoFeaturedTile_ComponentTitle_AEM())),40);
	}
	/** This function displays LayOut field on two feature tile component  */
	public void display_LayOut_Field() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMTwoFeaturedTileComponentPageLocator().get_TwoFeaturedTile_LayOut_AEM())),40);
	}
	/** This function displays Component title field on two feature tile component  */
	public void display_Tile_image() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMTwoFeaturedTileComponentPageLocator().get_Tile1_Tab_Component_AEM())),40);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMTwoFeaturedTileComponentPageLocator().get_TwoFeaturedTile_promotionImage_AEM())),40);
	}
}
	