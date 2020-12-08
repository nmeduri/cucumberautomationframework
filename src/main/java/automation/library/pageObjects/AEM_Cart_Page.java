package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

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
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;

/**
 * This file contains the functions of AEM Cart Page
 * 
 */

public class AEM_Cart_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Cart_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function verify display of item added to wishlist label field */
	public void displayItemAddedToWishlistAEM() throws Exception {
		$display(
				ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH,
						testContext.getPageObjectManager().getAEMCartPageLocator().get_Item_Added_To_Wishlist_Field())),
				20);
	}

	/** This function updates Item added to wishlist message label text */
	public void enterDataItemAddedToWishlistAEM() throws Exception {
		$clearData(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(
						testContext.getPageObjectManager().getAEMCartPageLocator().get_Item_Added_To_Wishlist_Field())),
				5);
		$enterData(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(
						testContext.getPageObjectManager().getAEMCartPageLocator().get_Item_Added_To_Wishlist_Field())),
				5, FileReaderManager.getInstance().getAEMDataReader().get_Wishlist_Item_Added_Label());
	}

	/** This function clicks on save and publish button */
	public void clickOnSaveAndPublishWishlistChanges() throws Exception {
		$display(
				ExpectedConditions.presenceOfElementLocated(
						$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_Save_Button())),
				20);
		$click(ExpectedConditions.elementToBeClickable(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_Save_Button())), 20);
		$display(
				ExpectedConditions.presenceOfElementLocated(
						$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_Wishlist_Card())),
				20);
		$mouseHover(
				$findElement(By.xpath(testContext.getPageObjectManager().getAEMCartPageLocator().get_Wishlist_Card())));
		$click(ExpectedConditions.elementToBeClickable(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_Select_Button())), 20);
		$click(ExpectedConditions.elementToBeClickable(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_More())), 20);
		$click(ExpectedConditions.elementToBeClickable(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_Quick_Publish())), 20);
		$click(ExpectedConditions.elementToBeClickable(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().get_Publish_Button())), 20);
		$display(
				ExpectedConditions.presenceOfElementLocated(
						$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_Select_All())),
				20);
		PageObject.getDriver().navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Services_Url());
		$display(ExpectedConditions.presenceOfElementLocated(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_Services())), 20);
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMCartPageLocator().get_Common_Content_Thumbnail())), 20);
		$click(ExpectedConditions.elementToBeClickable(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_Quick_Publish())), 20);
		$click(ExpectedConditions.elementToBeClickable(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_Publish_Alert())), 20);
	}

	/** This function verifys copyright label changes reflected */
	public void verifyItemAddedToWishlistTextChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Wishlist_Item_Added_Label(),
				$getText($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Toast_Message())));
	}

	/** This function verify display of view wishlist label field */
	public void displayViewWishlistAEM() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_View_Wishlist_Field())),
				20);
	}

	/** This function updates View wishlist label text */
	public void enterDataViewWishlistAEM() throws Exception {
		$clearData(
				ExpectedConditions.visibilityOfElementLocated(
						By.xpath(testContext.getPageObjectManager().getAEMCartPageLocator().get_View_Wishlist_Field())),
				5);
		$enterData(
				ExpectedConditions.visibilityOfElementLocated(
						By.xpath(testContext.getPageObjectManager().getAEMCartPageLocator().get_View_Wishlist_Field())),
				5, FileReaderManager.getInstance().getAEMDataReader().get_View_Wishlist_Label());
	}

	/** This function verifys View Wishlist label changes reflected */
	public void verifyViewWishlistTextChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_View_Wishlist_Label(),
				$getText($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_View_Wishlist())));
	}

	/** This function navigate to cart Page */
	public void navigateToAddToWishlistAemPage() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Add_To_Wishlist_Url());

	}
	/** This function navigate to Cart Page AEM */
	public void navigateTo_Cart_Page_AEM() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_CartURL_AEM());
	}
	/** This function verify display of close label field */
	public void displayCloseAEM() throws Exception {
		$display(
				ExpectedConditions.presenceOfElementLocated(
						$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_Close_Label())),
				20);
	}

	/** This function updates close label text */
	public void enterDataCloseAEM() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(testContext.getPageObjectManager().getAEMCartPageLocator().get_Close_Label())), 5);
		$enterData(
				ExpectedConditions.visibilityOfElementLocated(
						By.xpath(testContext.getPageObjectManager().getAEMCartPageLocator().get_Close_Label())),
				5, FileReaderManager.getInstance().getAEMDataReader().get_Close_Label());
	}

	/** This function verifys close label changes reflected */
	public void verifyCloseTextChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Close_Label(), $getText(
				$(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Close_Toast_Message())));
	}

	/** This function verify display of Wishlist Max limit label field */
	public void displayWishlistMaxLimitAEM() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMCartPageLocator().get_Wishlist_Max_Limit_Message_Field())),
				20);
	}

	/** This function updates Wishlist Max limit label text */
	public void enterDataWishlistMaxLimitAEM() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				testContext.getPageObjectManager().getAEMCartPageLocator().get_Wishlist_Max_Limit_Message_Field())), 5);
		$enterData(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager()
						.getAEMCartPageLocator().get_Wishlist_Max_Limit_Message_Field())),
				5, FileReaderManager.getInstance().getAEMDataReader().get_Wishlist_Max_Limit_Message());
	}
	/*
	*//** This function verifys Wishlist Max limit label changes reflected */

	/*
	 * public void verifyWishlistMaxLimitTextChangesReflected() throws Exception
	 * { $display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
	 * testContext.getPageObjectManager().getCartPageLocator().
	 * get_Close_Toast_Message())), 40);
	 * Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().
	 * get_Wishlist_Max_Limit_Message(), $getText($(Loc.XPATH,
	 * testContext.getPageObjectManager().getCartPageLocator().
	 * get_Wishlist_Max_Limit_Text()))); }
	 */
	/** This function updates incl core charges label text */
	public void enterDatainclcorechargesAEM() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(testContext.getPageObjectManager().getAEMCartPageLocator().get_inclCoreCharges())), 5);
		$enterData(
				ExpectedConditions.visibilityOfElementLocated(
						By.xpath(testContext.getPageObjectManager().getAEMCartPageLocator().get_inclCoreCharges())),
				5, FileReaderManager.getInstance().getAEMDataReader().get_incl_CoreCharges_label());

	}

	/** This function navigate to content fragment Page */
	public void navigateTocontentFragmentPageAem() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_ContenFragment_URL());

	}

	/** This function updates plus core charges label text */
	public void enterDatapluscorechargesAEM() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(testContext.getPageObjectManager().getAEMCartPageLocator().get_plusCoreCharges())), 5);
		$enterData(
				ExpectedConditions.visibilityOfElementLocated(
						By.xpath(testContext.getPageObjectManager().getAEMCartPageLocator().get_plusCoreCharges())),
				5, FileReaderManager.getInstance().getAEMDataReader().get_plus_CoreCharges_label());
	}

	/** This function updates core charges title text */
	public void enterDatacorechargesTitleAEM() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(testContext.getPageObjectManager().getAEMCartPageLocator().get_coreChargesText())), 5);
		$enterData(
				ExpectedConditions.visibilityOfElementLocated(
						By.xpath(testContext.getPageObjectManager().getAEMCartPageLocator().get_coreChargesText())),
				5, FileReaderManager.getInstance().getAEMDataReader().get_CoreChargesTooltipTitle_label());
	}

	/** This function updates core charges tooltip message text */
	public void enterDatacorechargesToolTipMessageAEM() throws Exception {
		$clearData(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(
						testContext.getPageObjectManager().getAEMCartPageLocator().get_coreCharges_ToolTipmessage())),
				5);
		$enterData(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(
						testContext.getPageObjectManager().getAEMCartPageLocator().get_coreCharges_ToolTipmessage())),
				5, FileReaderManager.getInstance().getAEMDataReader().get_CoreChargesTooltipmessage());
	}

	/** This function clicks save and publish */
	public void clickOnSaveAndPublishCntentFragmentChanges() throws Exception {
		$display(
				ExpectedConditions.presenceOfElementLocated(
						$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_Save_Button())),
				20);
		$click(ExpectedConditions.elementToBeClickable(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_Save_Button())), 20);
	}

	/** This function navigate to Accounts Personal Information Page_AEM */
	public void navigateTo_cart_Page_AEM() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_account_Cart_Page_AEM_URL());
	}

	/** This function verify display of drag component */
	public void verifyDragComponentHere() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_drag_component_Here())),
				20);
	}

	/** This function verify display of order summary component */
	public void verifyOrderSummaryComponent() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMCartPageLocator().get_OrderSummary_Component())), 20);
	}

	/** This function verify display of order summary component */
	public void verifyRecommendationComponent() throws Exception {
		$display(
				ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH,
						testContext.getPageObjectManager().getAEMCartPageLocator().get_Recommendation_Component())),
				20);
	}

	/** This function selects Broad Banner component */
	public void userSelectBannerComponent() throws Exception {
		List<Element> list = $findElements(
				ExpectedConditions.visibilityOfAllElementsLocatedBy($By(Loc.XPATH,
						testContext.getPageObjectManager().getAEMCartPageLocator().get_BroadBanner())),
				10);
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println("Size of components:" + size);
			if (list.get(i) != null) {
				if (list.get(i).getText().equalsIgnoreCase("Broad Banner"))
					;
				$click(list.get(i));
			}
		}
	}
	
	
	/** This function selects Two Featured component */
	public void userSelectsTwoFeaturedComponent() throws Exception {
		List<Element> list = $findElements(
				ExpectedConditions.visibilityOfAllElementsLocatedBy($By(Loc.XPATH,
						testContext.getPageObjectManager().getAEMCartPageLocator().get_TwoFeatured())),
				10);
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println("Size of components:" + size);
			if (list.get(i) != null) {
				if (list.get(i).getText().equalsIgnoreCase("Two Featured Tiles"))
					;
				$click(list.get(i));
			}
		}
	}
/** This function clicks cart item component */
public void clickCartComponent() throws Exception {
	$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_cartcomponent())), 20);
	}
/** This function bulk item tab */
public void clickBulkItemTab() throws Exception {
	$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_bulkItemsTab())), 20);
	}
/** This function update tooltip text */
public void UpdateDEliveryOptionToolTipText() throws Exception {
	$clearData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_ToolTipDesc())), 20);
	$enterData(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager()
					.getAEMCartPageLocator().get_ToolTipDesc())),
			5, FileReaderManager.getInstance().getAEMDataReader().get_deliveryOptionToolTip_desc_AEM());
	}
/** This function update bulk message text */
public void UpdateBulkMessageText() throws Exception {
	$clearData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCartPageLocator().get_bulkMessage_Text())), 20);
	$enterData(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager()
					.getAEMCartPageLocator().get_bulkMessage_Text())),
			5, FileReaderManager.getInstance().getAEMDataReader().get_deliveryOption_bulkMessage_AEM());
	}
}
