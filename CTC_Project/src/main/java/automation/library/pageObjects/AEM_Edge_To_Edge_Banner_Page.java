package automation.library.pageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
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
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;

/**
 * This file contains the functions of AEM edge to edge banner
 * 
 */

public class AEM_Edge_To_Edge_Banner_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Edge_To_Edge_Banner_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function navigate to edge to edge banner Page */
	public void navigate_To_EdgeToEdge_Banner_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_EdgetoEdge_Banner_URL());

	}
	/** This function click edge to edge banner component */
	public void click_EdgeToEdge_Banner_Component() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_edgeToEdgeBannerComponent())), 5);

	}
	/** This function update edge to edge banner title  */
	public void updateEdgetoEdgeBannerTitle() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_BannerTitle())), 10);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_BannerTitle())), 15);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_BannerTitle())), 5, FileReaderManager.getInstance().getAEMDataReader().get_EdgetoEdge_Banner_Title());
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_BoldIcon())), 5);

	}
	/** This function clear edge to edge banner title  */
	public void DontFillEdgetoEdgeBannermandatoryfieldAndSave() throws Exception {
	//	$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_BannerTitle())), 10);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_BackGroundColor())), 10);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getCheckButton()));
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_ErrorImage())), 50);

	}

	/** This function update edge to edge banner desc  */
	public void updateEdgetoEdgeBannerDesc() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_BannerDescription())), 5);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_BannerDescription())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_BannerDescription())), 5, FileReaderManager.getInstance().getAEMDataReader().get_EdgetoEdge_Banner_Description());
	}
	/** This function update edge to edge alt text  */
	public void updateEdgetoEdgeBannerAltText() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_BannerImageAltText())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_BannerImageAltText())), 5, FileReaderManager.getInstance().getAEMDataReader().get_EdgetoEdge_Banner_Alttext());
	}
	/** This function update edge to edge BG color  */
	public void updateEdgetoEdgeBannerBGColor() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_BackGroundColor())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_BackGroundColor())), 5, FileReaderManager.getInstance().getAEMDataReader().get_EdgetoEdge_Banner_background_color());
	}
	/** This function update edge to edge font color  */
	public void updateEdgetoEdgeBannerFontColor() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_FontColorField())), 5);
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMEdgeToEdgeBannerLocator().get_FontColorValue())), 5);
	}
}