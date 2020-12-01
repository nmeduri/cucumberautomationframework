package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Keyboard;
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
 * This file contains the functions of AEM Get A New Triangle Rewards Card Page
 * 
 */

public class AEM_Get_A_New_Triangle_Rewards_Card_Page extends PageObject {
	

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Get_A_New_Triangle_Rewards_Card_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function upload success image */
	public void uploadSuccessImage() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMANewTriangleRewardsCardLocator().get_Success_Image_Field_AEM())),20);
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pick_Image())), 10);
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMANewTriangleRewardsCardLocator().get_Link_Rewards_Dam())), 10);
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMANewTriangleRewardsCardLocator().get_Success_Image_Thumbnail())), 10);
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Select_Aem_Button())), 10);
	}
	
	/** This function verify success image display */
	public void verifySuccessImageChangesReflected() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMANewTriangleRewardsCardLocator().get_Success_Image_Preview())),20);
	}
	
	/** This function verify continue cta changes reflected */
	public void verifySuccessScreenContinueChangesReflected() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Continue_Button())), FileReaderManager.getInstance().getAEMDataReader().get_Success_Screen_Continue_Data());
	}
	
	/** This function enter data to continue cta */
	public void enterDataSuccessScreenContinueCTA() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMANewTriangleRewardsCardLocator().get_Success_Screen_Continue()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMANewTriangleRewardsCardLocator().get_Success_Screen_Continue()), FileReaderManager.getInstance().getAEMDataReader().get_Success_Screen_Continue_Data());  
	}
}

