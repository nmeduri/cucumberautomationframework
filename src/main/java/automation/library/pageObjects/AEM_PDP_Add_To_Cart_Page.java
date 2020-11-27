package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
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
 * This file contains the functions of PDP Page
 * 
 */

public class AEM_PDP_Add_To_Cart_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_PDP_Add_To_Cart_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to PDP Page */
	public void navigateTo_PDP_AddToCart_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_PDP_AddToCart_AEM());

	}
	/** This function click on cart flyout */
	public void click_cart_flyout_Component() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_CartFlyOut())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_CartFlyOut())), 5);

	}
	/** This function update title of cart flyout plural */
	public void update_cart_flyout_Title_Plural() throws Exception {
		$clearData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_AddtoCartTitle_Plural())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_AddtoCartTitle_Plural())), 5, FileReaderManager.getInstance().getAEMDataReader().get_cartFlyOut_Title_plural());

	}
	/** This function update title of cart flyout single*/
	public void update_cart_flyout_Title_Single() throws Exception {
		$clearData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_AddtoCartTitle_Singular())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_AddtoCartTitle_Singular())), 5, FileReaderManager.getInstance().getAEMDataReader().get_cartFlyOut_Title_single());

	}
	/** This function update title of Service add on available*/
	public void update_Serviceaddonavailable_Title() throws Exception {
		$clearData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_serviceAddOnAvailableLabel())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_serviceAddOnAvailableLabel())), 5, FileReaderManager.getInstance().getAEMDataReader().get_ServiceAddOnAvailableLabel());

	}
	/** This function click service installation tab*/
	public void click_serviceInstallation_Tab() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_SeviceInstallationTab())), 5);

	}
	/** This function update Add service to cart CTA link*/
	public void update_AddservicetoCartCTA() throws Exception {
		$clearData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_addServiceToCart_Label())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_addServiceToCart_Label())), 5, FileReaderManager.getInstance().getAEMDataReader().get_AddServicetoCartLabel());

	}
	/** This function update Error Message Copy field*/
	public void update_ErrorMessageCopy() throws Exception {
		$clearData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_serviceAddOnErrorMessage())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_serviceAddOnErrorMessage())), 5, FileReaderManager.getInstance().getAEMDataReader().get_ServiceAddOnErrorMessage());

	}
	/** This function update next step Copy field*/
	public void update_nextstep() throws Exception {
		$clearData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_serviceAddOnNextSteps())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_serviceAddOnNextSteps())), 5, FileReaderManager.getInstance().getAEMDataReader().get_ServiceAddOnNextSteps());
	}
	/** This function update service icon field*/
	public void update_serviceIcon() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_serviceAddOnIcon())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_serviceAddOnIconTool())), 5);
	}
	/** This function update Service add on title field*/
	public void update_ServiceAddonTitle() throws Exception {
		$clearData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_serviceAddOnLabel())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPDPAddToCartPageLocator().get_serviceAddOnLabel())), 5, FileReaderManager.getInstance().getAEMDataReader().get_ServiceAddOnLabel());
	}
	/** This function navigate to PDP Page for fr locale */
	public void navigateTo_PDP_AddToCart_Page_Fr() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_PDP_AddToCart_AEM_Fr());

	}
}