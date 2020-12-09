package automation.library.pageObjects;
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

/**
 * This file contains the functions of AEM New Rewards Card screen
 * 
 */

public class AEM_New_Rewards_Card_Screen_Page extends PageObject {
	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();
	
	public AEM_New_Rewards_Card_Screen_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	/** This function navigate to AEM New Rewards Card Page */
	public void navigateToNewRewardsCardScreen() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_New_Rewards_Card_Url());

	}
	
	/** This function clicks on AEM New Rewards Card Title */
	public void clickOnNewRewardsCardTitle() throws Exception {
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_new_Rewards_Card_Title())), 40);
	}
	
	/** This function clicks on AEM Error Screen Tab */
	public void clickOnErrorScreenTab() throws Exception {
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Error_Screen_Tab())), 5);
	}
	
	/** This function verifys Error Text field is present */
	public void displayErrorTextField() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Error_Text_Field())), 5);
	}
	
	/** enter Data to Error Text content */
	public void enterDataErrorText() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Error_Text_Field())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Error_Text_Field())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Age_Of_Majority_Error_Text()); 
	}
		
		/** enter Data to Try again label */
		public void enterDataTryAgainLabel() throws Exception {
				$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Try_Again_Label())), 5);
				$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Try_Again_Label())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Try_Again_CTA_label()); 
	}
		
		/** enter Data to Cancel label */
		public void enterDataCancelLabel() throws Exception {
				$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Cancel_Label())), 5);
				$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Cancel_Label())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Cancel_CTA_label()); 
	}
		
		/** enter Data to Error Image */
		public void enterDataErrorImage() throws Exception {
				$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Error_Image_Field())), 5);
				$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Error_Image_Field())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Error_Image()); 
	}
		
		/** This function verifys Error Text field is present */
		public void displayErrorImageField() throws Exception {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Error_Image_Label()), 2);
			$display(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Error_Image_Field())), 5);
		}
		
		/** This function verifys Try again CTA field is present */
		public void displayTryAgainCTA() throws Exception {
			$display(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Try_Again_Label())), 5);
		}
		
		/** This function verifys Cancel CTA field is present */
		public void displayCancelCTA() throws Exception {
			$display(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Cancel_Label())), 5);
		}
		
		/** This function verifys Error Text change is reflected on site */
		public void verifyErrorTextChangesReflectOnSite() throws Exception {
			Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Age_Of_Majority_Error_Text(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Age_Of_Maturity_Error_Text())));
		}
		
		/** This function verifys Error Text change is reflected on site */
		public void verifyErrorImageChangesReflectOnSite() throws Exception {
			$display(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Age_Of_Maturity_Error_Image())), 5);
		}

		public void enterYearOfBirth2002() throws Exception {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_City_Rewards()), 5);
			$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth())), 5);
			((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth())));
			((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Year_2002())));
		}
		
		public void enterYearOfBirth2002InMobile() throws Exception {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_City_Rewards()), 5);
			$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth_Mobile())), 5);
			//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth_Mobile())));
			//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Year_2002())));
			$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth_Mobile())), 5);
			$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Year_2002())), 5);
		}
		
		public void enterProvinceOntario() throws Exception {
			$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Province())), 3);
			((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Province())));
			((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Province_Ontario())));
		}
		
		/** This function selects ontario in province*/
		public void enterProvinceOntarioInMobile() throws Exception {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Address_Rewards()), 5);
			$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Province_Mobile())), 3);
			//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Province_Mobile())));
			//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Province_Ontario())));
			$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Province_Mobile())), 5);
			$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMNewRewardsCardScreenPageLocator().get_Province_Ontario())), 5);
		}
		
		/** This function navigate to complete your profile Page */
		public void navigateToCompleteYourProfileScreen() throws Exception {
			driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_New_Rewards_Card_Url_Fed());

		}
		
		
}
