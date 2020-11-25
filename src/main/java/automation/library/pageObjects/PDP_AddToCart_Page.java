package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
 * This file contains the functions of PDP Add to cart Page
 * 
 */

public class PDP_AddToCart_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public PDP_AddToCart_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function verify that PDP add to cart Page is displayed */
	public void display_PDP_AddtoCartPage() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_ATCPage())), 20);
	}
	/** This function navigate to  PDP product page */
	public void navigate_to_PDP_Product() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_PDP_product_URL());
	}
	/** This function navigate to  PDP product page FR locate */
	public void navigate_to_PDP_Product_fr() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_PDP_product_FR_URL());
	}
	/** This function selects required specifications */
	public void select_Product_Specification() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_ColorVariant())), 20);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_Size())), 20);
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_AssembledLength()), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_AssembledLength())), 20);
		$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Add_To_Cart_Button()).click();
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_CarryOn_btn())), 20);
		}
	/** This function displays add to cart screen */
	public void display_AddToCart_screen() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_ATCPage())), 40);
		
	}
	/** This function displays service add on box */
	public void display_Service_addon_Box() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_serviceAddOnAvailableBox())), 40);
		
	}
	/** This function displays service add on description */
	public void display_Service_description() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_serviceDescription())), 40);
		
	}
	/** This function displays service price */
	public void display_Service_price() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_ServicePrice())), 40);
		
	}
	/** This function displays add to service CTA btn */
	public void display_AddtoService_CTA() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_AddServiceToCart_CTA())), 40);
		
	}
	/** This function clicks add to service CTA btn */
	public void click_AddtoService_CTA() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_AddServiceToCart_CTA())), 40);
		
	}
	/** This function displays Error message while add to service btn clicked*/
	public void display_ErrorMsg_AddtoService_CTA() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_Error_AddToService())), 40);
		
	}
	/** This function displays service add-on message while add to service btn clicked*/
	public void display_seviceAddon_message() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_ServiceAddOnMessage())), 40);
		
	}
	/** This function displays service add-on expansion (plus)chevron while add to service btn clicked*/
	public void display_clickable_expansion_chevron() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_ServiceCollapseSign())), 40);
		
	}
	/** This function displays service add-on collapse(Minus) chevron while add to service btn clicked*/
	public void display_clickable_collapse_chevron() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_ServiceExpandSign())), 40);
		
	}
	/** This function clicks service add-on expansion chevron while add to service btn clicked*/
	public void click_clickable_expansion_chevron() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_ServiceCollapseSign())), 40);
		
	}
	/** This function display service add-on options when  service add-on expansion expanded*/
	public void display_serviceAddOn_Option() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_ServiceAddonOptions())), 40);
	}
	/** This function click on service add-on options when  service add-on expansion expanded*/
	public void click_serviceAddOn_Option() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_ServiceAddonOptions())), 40);
	}
	/** This function display continue to Cart CTA */
	public void display_continue_to_cart_CTA() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_ContinuetoCartCTA())), 40);
	}
	/** verify add to cart title updated on site */
	public void verifyAddToCartTitleUpdatedOnSite() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_AddToCartTitle())), 40);
	}
	/** verify service add on title updated on site */
	public void verifyServiceAddOnTitleUpdatedOnSite() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_serviceAddOnAvailableBox())), 40);
	}
	/** This function display success message after clicking add service to cart button */
	public void display_success_message() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_nextStepText())), 40);
	}
	/** This function display product quantity in cart */
	public void display_product_quantity_Cart() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_CartQuantity())), 40);
	}
	/** This function display + CTA button for quantity in cart */
	public void display_Plus_CTA_Cart_quantity() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_QuantityPlus())), 40);
	}
	/** This function display - CTA button for quantity in cart */
	public void display_minus_CTA_Cart_quantity() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPAddToCartPageLocator().get_QuantityMinus())), 40);
	}
}