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
 * This file contains the functions of AEM Simple Header Checkout component page
 * 
 */
public class AEM_Simple_Header_Checkout_Flow_Page extends PageObject{
TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Simple_Header_Checkout_Flow_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to simple header checkout Page */
	public void navigateTo_Simple_Header_Checkout_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Experience_Fragment_Header_Simple_Page_Url());
	}
	/** This function clicks on simple header checkout component */
	public void clickSimpleHeaderCheckoutComponent() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSimpleHeaderCheckoutFlowPageLocator().getSimpleHeaderCheckoutComponentAEM())),40);
		//$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTilesComponent())), 10);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMSimpleHeaderCheckoutFlowPageLocator().getSimpleHeaderCheckoutComponentAEM())));
	}
	/** enter customer service label details */
	public void enterCustomerServerLabelDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMSimpleHeaderCheckoutFlowPageLocator().getCustomerServiceLabelAEM()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSimpleHeaderCheckoutFlowPageLocator().getCustomerServiceLabelAEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Customer_Service_Label());
		
	}
	/** enter customer service contact number details */
	public void enterCustomerServerContactNumberDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMSimpleHeaderCheckoutFlowPageLocator().getCustomerServiceContactNumberAEM()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSimpleHeaderCheckoutFlowPageLocator().getCustomerServiceContactNumberAEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Customer_Service_Contact_Number());
		
	}
	
	
}
