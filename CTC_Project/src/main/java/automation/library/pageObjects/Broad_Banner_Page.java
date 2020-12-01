package automation.library.pageObjects;

import static org.testng.Assert.fail;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
/**
 * This file contains the functions of Broad Banner Pages
 * 
 */
public class Broad_Banner_Page extends PageObject {
	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Broad_Banner_Page(WebDriver driver) {
		super(driver);
		testContext = new TestContext();
	}

	/** This function navigate to Broad Banner Page */
	public void navigateTo_Broad_Banner_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Broad_Banner_Url());
	}
	/** This function displays broad banner image on page */
	public void displayBroadBannerImage() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getBroadBannerPageLocator().get_BroadBanner_Image())),40);
	}
	/** This function displays broad banner Title on page */
	public void displayBroadBannerTitle() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getBroadBannerPageLocator().get_BroadBanner_Title())),40);
	}
	/** This function displays broad banner description on page */
	public void displayBroadBannerdescription() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getBroadBannerPageLocator().get_BroadBanner_Description())),40);
	}
	/** This function displays broad banner cta link on page */
	public void displayBroadBanner_CTALink() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getBroadBannerPageLocator().get_BroadBanner_CTALink())),40);
	}
}
	