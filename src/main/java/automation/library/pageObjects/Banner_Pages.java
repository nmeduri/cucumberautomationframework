package automation.library.pageObjects;

import static org.testng.Assert.fail;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
/**
 * This file contains the functions of Banner Pages
 * 
 */
public class Banner_Pages extends PageObject {
	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Banner_Pages(WebDriver driver) {
		super(driver);
		testContext = new TestContext();
	}

	/** This function navigate to EdgeToEdge Banner Page URL with Image for En*/
	public void navigateTo_EdgeToEdge_Banner_URL_En() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().getEdgeToEdgeBannerUrlWithImageEn());
	}
	
	/** This function is verify that edge to edge banner Page is displayed */
	public void display_EdgeToEdge_Banner_Page() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle();
	}
	/** This function is verify the edge banner is displayed */
	public void displayEdgeBanner() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getBannerPageLocators().get_EdgeToEdge_Banner())), 30);
	}
	/** This function is verify the edge banner title is displayed */
	public void displayEdgeBannerTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getBannerPageLocators().get_EdgeToEdge_Banner_Title()));
	}
	/** This function is verify the edge banner Description is displayed */
	public void displayEdgeBannerDescription() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getBannerPageLocators().get_EdgeToEdge_Banner_Description()));
	}
	/** This function is verify the edge banner Image is displayed */
	public void displayEdgeBannerImage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getBannerPageLocators().get_EdgeToEdge_Banner_Image()));
	}
	/** This function navigate to EdgeToEdge Banner Page without Image for En */
	public void navigateTo_EdgeToEdge_Banner_URL_Without_Image_En() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().getEdgeToEdgeBannerUrlWithoutImageEn());
	}
	/** This function is verify the edge banner Image is displayed */
	public void notDisplayEdgeBannerImage() throws Exception {
		try {
			$display($$$$(Loc.XPATH, testContext.getPageObjectManager().getBannerPageLocators().get_EdgeToEdge_Banner_Image(), 1));
			fail();
		}catch(Exception e) {		
			Log.message("Edge banner image is Not displayed", true);
		}
	}
	/** This function navigate to EdgeToEdge Banner Page URL with Image for Fr*/
	public void navigateTo_EdgeToEdge_Banner_Fr_Locale_URL() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().getEdgeToEdgeBannerUrlWithImageFr());
	}
	/** This function navigate to EdgeToEdge Banner Page without Image for Fr */
	public void navigateTo_EdgeToEdge_Banner_Fr_Locale_URL_Without_Image() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().getEdgeToEdgeBannerUrlWithoutImageFr());
	}
}
