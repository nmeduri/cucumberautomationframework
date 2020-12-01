package automation.library.pageObjects;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;

/**
 * This file contains the functions of Two Feature tile component Page
 * 
 */

public class Two_Feature_Tile_Component_Page extends PageObject {
	
	TestContext testContext;
	

	public Two_Feature_Tile_Component_Page(WebDriver driver) {
		
		super(driver);
		testContext = new TestContext();

	}
	/** This function navigate to Two featured tile component page */
	public void navigateTo_TwoTileComponent_Page() throws Exception{
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Twofeatured_Tile_Url());
		
	}
	/** This function is verify that Promotional image is displayed in two featured tile component page  */
	public void display_Promotional_image() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getTwoFeaturedTileComponentPageLocator().get_ShopByCategoryImg2()));
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getTwoFeaturedTileComponentPageLocator().get_ShopByCategoryImg2())), 10);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getTwoFeaturedTileComponentPageLocator().get_ShopByCollectionImg())), 10);

	}
	
	/** This function is verify that title is displayed in two featured tile component page  */
	public void display_two_featured_tile_Title() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getTwoFeaturedTileComponentPageLocator().get_PromotionTitle1()));
		
	}
	/** This function is verify that Promotional title is displayed in two featured tile component page  */
	public void display_Promotional_Title() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getTwoFeaturedTileComponentPageLocator().get_PromotionTitle1()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getTwoFeaturedTileComponentPageLocator().get_PromotionTitle2()));

		}
	/** This function is verify that Promotional sub-title is displayed in two featured tile component page  */
	public void display_Promotional_SubTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getTwoFeaturedTileComponentPageLocator().get_PromotionSubTitle()));
		}
	/** This function is verify that Promotional CTA button is displayed in two featured tile component page  */
	public void display_Promotional_CTABtn() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getTwoFeaturedTileComponentPageLocator().get_CTABtn()));
		}
	/** This function click CTA button on two tile pge */
	public void clickOnCTAbtnTwoTile() throws Exception {
		String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getTwoFeaturedTileComponentPageLocator().get_CTABtn()), "href");
		configuration.setProperty("urlCTAlink", url);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getTwoFeaturedTileComponentPageLocator().get_CTABtn())));
	}
	
	/** This function is verify that Link is successfully navigate on CTA link */
	public void verifyLinkNavigateOnCTALink() throws Exception {
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		String expectedUrl = FileReaderManager.getInstance().getDataReader().get_Twofeatured_CTALink_Url();
		Log.message("Expected Url:- " + expectedUrl, true);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
	}
	
}