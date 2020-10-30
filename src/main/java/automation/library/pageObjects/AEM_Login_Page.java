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
 * This file contains the functions of AEM Login Page
 * 
 */
public class AEM_Login_Page extends PageObject{

TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Login_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to Login Page */
	public void navigate_To_Author_Login_Page_Url() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Login_Page_Url_En());
	}
	/** This function clicks on Gigya Integration component */
	public void clickOnGigyaIntegrationComponent() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLoginPageLocator().getGigyaIntegrationComponentAEM())),40);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMLoginPageLocator().getGigyaIntegrationComponentAEM())));
	}
	/** This function to select Gigya screen1 dropdown */
	public void select_Gigya_Screen1_Dropdown() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLoginPageLocator().getSelectGigyaScreen1AEM()), 40);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLoginPageLocator().getSelectGigyaScreen1AEM())), 40);
		Thread.sleep(2000);
		$click(ExpectedConditions.elementToBeClickable(By.xpath(testContext.getPageObjectManager().getAEMLoginPageLocator().getSelectGigyaScreen1ValueAEM())), 40);
		//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMLoginPageLocator().getSelectGigyaScreen1ValueAEM())));
	}
	/** This function to select Gigya screen2 dropdown */
	public void select_Gigya_Screen2_Dropdown() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLoginPageLocator().getSelectGigyaScreen2AEM()), 40);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLoginPageLocator().getSelectGigyaScreen2AEM())), 40);
		Thread.sleep(2000);
		$click(ExpectedConditions.elementToBeClickable(By.xpath(testContext.getPageObjectManager().getAEMLoginPageLocator().getSelectGigyaScreen2ValueAEM())), 40);
		//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMLoginPageLocator().getSelectGigyaScreen2ValueAEM())));
	}
	
	/** This function navigate to Publish Login Page */
	public void navigate_To_Publish_Login_Page_Url() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Login_Page_Url_En());
	}
	/** This function navigate to Login Page for fr locale*/
	public void navigate_To_Author_Login_Page_Url_Fr() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Login_Page_Url_Fr());
	}
	/** This function navigate to Login page publish URL EN*/
	public void navigateTo_Login_Page_Publish_Url_En() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Login_Page_Publish_Url_En());

	}
	/** This function navigate to Login page publish URL FR*/
	public void navigateTo_Login_Page_Publish_Url_Fr() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Login_Page_Publish_Url_En());
	}
}
