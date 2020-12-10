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
 * This file contains the functions of account address Page
 * 
 */
public class Account_Payment_information_Page extends PageObject{
	TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Account_Payment_information_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	/** This function navigate to account payment info page */
	public void navigate_to_Account_paymentinfo() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_AccountPaymentInfoURL());
	}
	/** This function click close button on card modal */
	public void clickCardCloseBtn() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountPaymentInformationPageLocator().getcardclosebtn())),30);
	}
}