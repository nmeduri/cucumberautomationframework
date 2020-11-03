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
 * This file contains the functions of AEM Customer Service Page
 * 
 */
public class AEM_Customer_Service_Informational_Copy_Page extends PageObject{

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();
	
	public AEM_Customer_Service_Informational_Copy_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	/** This function navigate to Author Customer Service Page EN locale */
	public void navigate_To_Author_Customer_Service_Page_Url() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Customer_Service_Page_Url_En());
	}
	
	/** This function clicks on Title and Content component */
	public void clickOnTitleAndContentComponent() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitleAndContentComponentAEM())),40);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitleAndContentComponentAEM())));
	}
	
	/** This function update Title of Customer Service  */
	public void updateTitleOfCustomerService() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitleOfCustomerServiceAEM())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitleOfCustomerServiceAEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Customer_Service_Title());
	}
	/** This function to verify Sub Title should be displayed */
	public void displaySubTitleOfCustomerService() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getSubTitleOfCustomerService())),40);
	}
	/** This function navigate to Author Customer Service Page FR locale */
	public void navigate_To_Author_Customer_Service_Page_Url_Fr() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Customer_Service_Page_Url_Fr());
	}
	/** This function update SubTitle of Customer Service  */
	public void updateSubTitleOfCustomerService() throws Exception {
		Thread.sleep(2000);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getSubTitleOfCustomerServiceAEM())), 50);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getSubTitleOfCustomerServiceAEM())), 50, FileReaderManager.getInstance().getAEMDataReader().get_Customer_Service_Sub_Title());
		Thread.sleep(1000);
	}
	/** This function clicks on Link List component */
	public void clickOnLinkListComponent() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getLinkListComponentAEM())),40);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getLinkListComponentAEM())));
	}
	/** This function update Title of Link List  */
	public void updateTitleOfLinkList() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitle1LinkListAEM())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitle1LinkListAEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Title1_Link_List());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitle2LinkListAEM())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitle2LinkListAEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Title2_Link_List());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitle3LinkListAEM())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitle3LinkListAEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Title3_Link_List());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitle4LinkListAEM())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitle4LinkListAEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Title4_Link_List());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitle5LinkListAEM())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getTitle5LinkListAEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Title5_Link_List());
	}
	/** This function update Description of Link List  */
	public void updateDescriptionOfLinkList() throws Exception {
		Thread.sleep(2000);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getDescription1LinkListAEM())), 20);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getDescription1LinkListAEM())), 20, FileReaderManager.getInstance().getAEMDataReader().get_Description1_Link_List());
		Thread.sleep(2000);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getDescription2LinkListAEM())), 20);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getDescription2LinkListAEM())), 20, FileReaderManager.getInstance().getAEMDataReader().get_Description2_Link_List());
		Thread.sleep(2000);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getDescription3LinkListAEM())), 20);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getDescription3LinkListAEM())), 20, FileReaderManager.getInstance().getAEMDataReader().get_Description3_Link_List());
		Thread.sleep(2000);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getDescription4LinkListAEM())), 20);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getDescription4LinkListAEM())), 20, FileReaderManager.getInstance().getAEMDataReader().get_Description4_Link_List());
		Thread.sleep(2000);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getDescription5LinkListAEM())), 20);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPageLocator().getDescription5LinkListAEM())), 20, FileReaderManager.getInstance().getAEMDataReader().get_Description5_Link_List());
	}
	
	
	
}
