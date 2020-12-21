package automation.library.pageObjects;

import static org.testng.Assert.fail;

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
import automation.library.selenium.core.PageObject;

/**
 * This file contains the functions of Checkout Page
 * 
 */
public class My_Account_Shopping_Preferences_Page extends PageObject{
	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public My_Account_Shopping_Preferences_Page(WebDriver driver) {
		super(driver);
		testContext = new TestContext();
	}
	
	/** navigate to author shopping preferences page */
	public void navigate_to_shopping_preferences_author_page() throws Exception {
		PageObject.getDriver().navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Account_And_Shopping_Preferences_Url());
	}
	
	/** navigate to shopping preferences page */
	public void navigate_to_shopping_preferences_page() throws Exception {
		PageObject.getDriver().navigate().to(FileReaderManager.getInstance().getDataReader().get_Account_Shopping_Preferences_Url());
	}
	
	/** click on shopping preferences panel */
	public void clickOnShoppingPreferencesPanel() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_Shopping_Preferences_Panel())), 40);
	}
	
	/** configure shopping preferences title */
	public void configureShoppingPreferencesTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_Shopping_Preferences_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_Shopping_Preferences_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Shopping_Preferences());
	}
	
	/** revert shopping preferences title */
	public void revertShoppingPreferencesTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_Shopping_Preferences_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_Shopping_Preferences_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Shopping_Preferences_Revert());;
	}
	
	/** configured my account shopping title is displayed on publish page */
	public void verifyConfiguredMyAccountShoppingTitlePageOnPublish() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_Shopping_Preferences_Title())), 50);
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_Shopping_Preferences_Title())), FileReaderManager.getInstance().getAEMDataReader().get_Shopping_Preferences());
	}
	
	/** configure no shopping preferences message title */
	public void configureNoShoppingPreferencesMessage() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_No_Shopping_Preferences_Message_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_No_Shopping_Preferences_Message_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_No_Shopping_Preferences());
	}
	
	/** revert no shopping preferences message title */
	public void revertNoShoppingPreferencesMessage() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_No_Shopping_Preferences_Message_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_No_Shopping_Preferences_Message_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_No_Shopping_Preferences_Revert());
	}
	
	/** configured no shopping preferences message is displayed on publish page */
	public void verifyConfiguredNoShoppingPreferencesMessagePageOnPublish() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_No_Shopping_Preferences_Message())), 50);
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_No_Shopping_Preferences_Message())), FileReaderManager.getInstance().getAEMDataReader().get_No_Shopping_Preferences());
	}
	
	/** configure edit button label */
	public void configureEditButtonLabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_Edit_Button_Label_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_Edit_Button_Label_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Edit_Button_Label());
	}
	
	/** revert edit button label */
	public void revertEditButtonLabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_Edit_Button_Label_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_Edit_Button_Label_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Edit_Button_Label_Revert());
	}
	
	/** configured edit button label is displayed on publish page */
	public void verifyConfiguredEditButtonLabelOnPublish() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_Edit_Button_Label())), 50);
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getMyAccountShoppingPreferencesLocator().get_Edit_Button_Label())), FileReaderManager.getInstance().getAEMDataReader().get_Edit_Button_Label());
	}
}
