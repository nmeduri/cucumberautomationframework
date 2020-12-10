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

public class AEM_Account_Payment_Infromation_Page extends PageObject {
	TestContext testContext;

	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Account_Payment_Infromation_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function navigate to Accounts payment Page_AEM */
	public void navigateTo_Account_payment_page_AEM() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_AccountpaymentInfoPagecomponent());
	}
	/** click my account payment component */
	public void clickmyaccountpaymentComponent() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountPaymentInfromationPageLocator().get_myAccountpaymentInfoComponent())), 10);
	}
	/** update continue shopping text label */
	public void updatecontinueShoppingCTA() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountPaymentInfromationPageLocator().get_continueShoppingCTA())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountPaymentInfromationPageLocator().get_continueShoppingCTA()), FileReaderManager.getInstance().getAEMDataReader().get_continueShoppingCTA());
	}
	/** update continue shopping link  */
	public void updatecontinueShoppingCTALink() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountPaymentInfromationPageLocator().get_continueShoppingCTALink())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountPaymentInfromationPageLocator().get_continueShoppingCTALink()), FileReaderManager.getInstance().getAEMDataReader().get_continueShoppingLink());
	}
	/** update no payment information Title */
	public void updateNopaymentInfoTitle() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountPaymentInfromationPageLocator().get_noPaymentInfoTitle())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountPaymentInfromationPageLocator().get_noPaymentInfoTitle()), FileReaderManager.getInstance().getAEMDataReader().get_No_Result_Title());
	}
	/** update no payment information message  */
	public void updateNopaymentInfomsg() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountPaymentInfromationPageLocator().get_noPaymentInfoMessage())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountPaymentInfromationPageLocator().get_noPaymentInfoMessage()), FileReaderManager.getInstance().getAEMDataReader().get_nopaymentInfoMsg());
	}
	/** update Toast Banner Success Message */
	public void updateToastBannerSuccessMessage() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountPaymentInfromationPageLocator().get_toastBannerSuccessMessage())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountPaymentInfromationPageLocator().get_toastBannerSuccessMessage()), FileReaderManager.getInstance().getAEMDataReader().get_ToastBannerSuccessMessage());
	}
	/** update Toast Banner Error Message  */
	public void updateToastBannerErrorMessage() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountPaymentInfromationPageLocator().get_toastBannerErrorMessage())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountPaymentInfromationPageLocator().get_toastBannerErrorMessage()), FileReaderManager.getInstance().getAEMDataReader().get_ToastBannerErrorMessage());
	}

}