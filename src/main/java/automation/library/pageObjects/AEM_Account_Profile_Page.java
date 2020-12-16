package automation.library.pageObjects;

import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;

public class AEM_Account_Profile_Page extends PageObject {
	TestContext testContext;

	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Account_Profile_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function navigate to Accounts profile Page_AEM */
	public void navigateTo_Account_profile_page_AEM() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_accountprofileURL());
	}
	/** click my account profile component */
	public void clickmyaccountprofileComponent() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_MyAccountProfilecomponent())), 10);
	}
	/** update field text and CTA label */
	public void configureFieldLabelandCTA() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_firstnamelabel())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_firstnamelabel()), FileReaderManager.getInstance().getAEMDataReader().get_Firstnamelabel());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_lastNameLabel())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_lastNameLabel()), FileReaderManager.getInstance().getAEMDataReader().get_LastnameLabel());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_emailLabel())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_emailLabel()), FileReaderManager.getInstance().getAEMDataReader().get_EmailLabel());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_yearOfBirthLabel())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_yearOfBirthLabel()), FileReaderManager.getInstance().getAEMDataReader().get_yearOfBirthLabel());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_dateLabel())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_dateLabel()), FileReaderManager.getInstance().getAEMDataReader().get_dateLabel());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_monthLabel())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_monthLabel()), FileReaderManager.getInstance().getAEMDataReader().get_monthLabel());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_securityHintText())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_securityHintText()), FileReaderManager.getInstance().getAEMDataReader().get_securityHintText());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_passwordLabel())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_passwordLabel()), FileReaderManager.getInstance().getAEMDataReader().get_passwordLabel());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_phoneLabel())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_phoneLabel()), FileReaderManager.getInstance().getAEMDataReader().get_phoneLabel());

	}
/** update toast banner label */
public void configureToastBannerText() throws Exception {
	$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_toastBannerSuccessMessage())), 10);
	$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_toastBannerSuccessMessage()), FileReaderManager.getInstance().getAEMDataReader().get_toastBannerSuccessMessage());

	}
/** update modal pop up */
public void configureModalPopUp() throws Exception {
	$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_modalsaveChangesTitle())), 10);
	$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_modalsaveChangesTitle()), FileReaderManager.getInstance().getAEMDataReader().get_Savechangesmodaltitle());
	$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_modalsaveChangesDesc())), 10);
	$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_modalsaveChangesDesc()), FileReaderManager.getInstance().getAEMDataReader().get_Savechnagesmodaldescription());
	$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_yesCTA())), 10);
	$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_yesCTA()), FileReaderManager.getInstance().getAEMDataReader().get_Modal_YesCTA());
	$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_noCTA())), 10);
	$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountProfilePageLocator().get_noCTA()), FileReaderManager.getInstance().getAEMDataReader().get_Modal_noCTA());

	}
}