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
import automation.library.logdetail.Log;

/**
 * This file contains the functions of Broad banner Page
 * 
 */
public class AEM_Account_Address_Page extends PageObject{
	TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Account_Address_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to account address Page_AEM */
	public void navigateTo_Account_Address_AEM() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_account_address_URL());
	}
	
	
	/** This function clicks on my account address component */
	public void clickaccountAddressComponent() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountAddressPageLocator().get_MyAccountAddresses_Component())),30);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMAccountAddressPageLocator().get_MyAccountAddresses_Component())));
	}
	/** This function configure address label component */
	public void configureAddressLabelComponent() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountAddressPageLocator().get_addressLabel_Component())),30);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountAddressPageLocator().get_addressLabel_Component())), 50, FileReaderManager.getInstance().getAEMDataReader().get_account_address_label());
	}
	/** This function configure shipping address label component */
	public void configureShippingAddressLabelComponent() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountAddressPageLocator().get_shippingAddress_Label())),30);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountAddressPageLocator().get_shippingAddress_Label())), 50, FileReaderManager.getInstance().getAEMDataReader().get_Shipping_Info_label());
	}
}