package automation.library.pageObjects;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;

/**
 * This file contains the functions of AEM Registration Page
 * 
 */
public class AEM_Registration_Page extends PageObject {
TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Registration_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to Login Page */
	public void navigate_To_Author_registration_Page_Url() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Registration_Page_Url_En());
	}
	/** This function to select Registration screen from Gigya screen1 dropdown */
	public void select_Registration_Screen_From_Gigya_Screen1_Dropdown() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLoginPageLocator().getSelectGigyaScreen1AEM())), 40);
		Thread.sleep(2000);
		$click(ExpectedConditions.elementToBeClickable(By.xpath(testContext.getPageObjectManager().getAEMRegistrationPageLocator().getSelectRegistrationGigyaScreen1ValueAEM())), 40);
	}
	/** This function to select Registration screen from Gigya screen2 dropdown */
	public void select_Registration_Screen_From_Gigya_Screen2_Dropdown() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLoginPageLocator().getSelectGigyaScreen2AEM())), 40);
		Thread.sleep(2000);
		$click(ExpectedConditions.elementToBeClickable(By.xpath(testContext.getPageObjectManager().getAEMRegistrationPageLocator().getSelectRegistrationGigyaScreen2ValueAEM())), 40);
	}
	/** This function navigate to Registration page publish URL EN*/
	public void navigateTo_Registration_Page_Publish_Url_En() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Registration_Page_Publish_Url_En());

	}
	/** This function navigate to Registration page publish URL FR*/
	public void navigateTo_Registration_Page_Publish_Url_Fr() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Registration_Page_Publish_Url_Fr());
	}
	/** This function navigate to Registration Page for fr locale*/
	public void navigate_To_Author_Registration_Page_Url_Fr() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Registration_Page_Url_Fr());
	}
	
}
