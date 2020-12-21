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
 * This file contains the functions of AEM micro season page
 * 
 */
public class AEM_Microseason_Landing_Page extends PageObject{

TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Microseason_Landing_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to Microseason Landing Page */
	public void navigate_To_Microseason_Landing_Page_Url() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_microseason_landing_Page_URL());
	}
	/** This function navigate to category Landing Page */
	public void navigate_To_category_Landing_Page_Url() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_category_landing_Page_URL());
	}
	/** This function click on banner selector component */
	public void click_bannerSelector_component() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getBannerSelector())), 3);
	}
	/** This function select edge to edge banner type */
	public void select_edgetoedge_bannertype() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getbannerTypeDropDown())), 3);
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getEdgeToEdgeBannerType())), 3);

	}
	
}