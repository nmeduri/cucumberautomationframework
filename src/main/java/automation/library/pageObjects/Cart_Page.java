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
 * This file contains the functions of Cart Page
 * 
 */

public class Cart_Page extends PageObject{

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Cart_Page(WebDriver driver) {
		super(driver);
		testContext = new TestContext();
	}

	/** This function navigate to Cart Page */
	public void navigateTo_Cart_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getCartUrl());
	}
	
	/** This function is verify that PDP Page is displayed */
	public void display_Cart_Page() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle();
	}

	/** This function clicks on Wishlist Icon */
	public void ClickOnWishList() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Wishlist_Icon4())), 40);
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Item_Added_To_Wishlist_Message())), 40);
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Wishlist_Icon3())), 40);
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Item_Added_To_Wishlist_Message())), 40);
		$clickFindElement(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Wishlist_Icon4())), 40);	
	}
	/** This function clicks on change CTA link */
	public void ClickOnChangeCTA() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Change_CTA())), 40);
		}
	/** This function verify display of error message*/
	public void displayErrorMessageWishlistLimit() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Error_Message_Wishlist_Limit())), 40);
	}

	/** This function verify display of wishlist icon for respective product*/
	public void displayRespectiveWishListIcon() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Wishlist_Icon4())), 10);
	}

	/** This function verify not display of error message*/
	public void notDisplayErrorMessageWishlistLimit() throws Exception {
		try {
			$display($$$$(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Error_Message_Wishlist_Limit(), 5));
			fail();
		}catch(Exception e) {		
			Log.message("Error Message is Not displayed", true);
		}
	}

	/** This function verify display of view Wishlist and close links*/
	public void displayLinks() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_View_Wishlist())), 10);
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Close_Toast_Message())), 10);
	}

	/** This function clicks on close link */
	public void ClickOnCloseLink() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Close_Toast_Message())), 40);	
	}

	/** This function clicks on Wishlist Icon */
	public void ClickRespectiveWishListIcon() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Wishlist_Icon4())), 40);	
	}

	/** This function verify's item moved to wishlist */
	public void verifyItemMovedToWishList() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Wishlist_Icon1())), 10);
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Wishlist_Badge())), "1");
	}

	/** This function verify not display of product Item*/
	public void notDisplayProductItem() throws Exception {
		try {
			$display($$$$(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Product_Brand_Title(), 5));
			fail();
		}catch(Exception e) {		
			Log.message("Product Item is Not displayed", true);
		}
	}

	/** This function verify display of item added to wishlist message*/
	public void displayItemAddedMessage() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Item_Added_To_Wishlist_Message())), 40);
	}

	/** This function verify display of view Wishlist link*/
	public void displayViewWishlist() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_View_Wishlist())), 40);
	}

	/** This function navigate to  Cart page */
	public void navigate_To_Cart_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Cart_Page_Url());
	}
	/** This function is verify that PDP Page is displayed */
	public void display_Cart_Page_Shopping_Cart_Title() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Shopping_Cart_Page_Title())), 50);
	}

	/** This function verify display of quantity selector box*/
	public void displayQuantitySelectorBox() throws Exception {
		$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getCartPageLocator().get_Quantity_Selector_Box());
	}
	/** This function is verify that error message is displayed for maximum quantity */
	public void displayErrorMessageForExceededQuantity() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Error_Message_Exceeded_Quantity()));
	}
	/** enter quantity Greater than maximum*/
	public void enterQuantityGreaterThanMaxixmumInCartPage() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Quantity_Box_Cart_Page()), FileReaderManager.getInstance().getDataReader().get_Quantity());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Quantity_Box_Cart_Page()));
		Thread.sleep(3000);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Quantity_Box_Cart_Page()), FileReaderManager.getInstance().getDataReader().get_Quantity());
		//Thread.sleep(2000);
	}
	/** This function display quantity selector box is highlighted */
	public void displayQuantitySelectorBoxIsHighlighted() throws Exception {
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Highlighted_Quantity_Selector_Box()), "border-top-color");
		Assert.assertTrue(value.contains("rgba(253, 157, 45)"));
	}
	/** enter number is greater than 0 and is equal to or lessthan maximum quantity in quantity selector box*/
	public void enterNumberInQuantitySelectorBox() throws Exception {
		//$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Quantity_Box_Cart_Page()), FileReaderManager.getInstance().getDataReader().get_Quantity_4561());
		//Thread.sleep(3000);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Select_Increment_Quantity()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Select_Increment_Quantity()));
	}
	/** This function is verify updated quantity must be number */
	public void verifyUpdatedQuantityMustBeNumber() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Quantity_Box_Cart_Page()));
		String value = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Quantity_Box_Cart_Page()), "value");
		Assert.assertEquals("2", value);
	}
	/** This function is verify Price of the product updated accordingly */
	public void verifyPriceOfTheProductUpdatedAccordingly() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Price_Value()));
		String expectedPrice = $getText($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Price_Value_Of_Each_Product())).replace(" each", "").replace("$", "");
		double expectedPriceValue=Double.parseDouble(expectedPrice)*2;
		Log.message("expectedvaluePrice: "+ expectedPriceValue, true);
		  //Thread.sleep(1000);
		String actualPrice = $getText($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Price_Value())).replace("$", "");
		double actualPriceValue=Double.parseDouble(actualPrice);
		Log.message("actualPricevalue: "+ actualPriceValue, true);
		   Assert.assertEquals(expectedPriceValue, actualPriceValue, expectedPriceValue);
	}

	/** This function click product quantity increase button*/
	public void click_increment_productQuantity() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Cart_product_quantity())), 40);
	}
	/** This function click ToolTip button in Core Charges */
	public void click_ToolTip_coreCharges() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_ToolTip_CoreCharges())), 40);
	}
	/** This function validate Tool tip title */
	public void validateToolTip_CoreCharges_Title() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_ToolTip_CoreCharges())), 40);
	}
	/** This function validate Tool tip message text */
	public void validateToolTip_Message_CoreCharges() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_ToolTip_CoreCharges())), 40);
	}
	/** This function click ToolTip close button in Core Charges */
	public void click_ToolTip_close_coreCharges() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_ToolTipClose_Icon())), 40);
	}
	/** This function validate tooltip message is not displayed after clicking on close icon */
	public void validatenotDisplaytooltipMessage() throws Exception {
		try {
			$display($$$$(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_ToolTip_Message(),1));
			fail();
		}catch(Exception e) {
			Log.message("tool tip message are not displayed when close button is clicked", true);
		}
	}
	/** This function click view Wishlist link*/
	public void clickViewWishlist() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_View_Wishlist()), "href");
			configuration.setProperty("urlViewWishlist", url);
			((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getCartPageLocator().get_View_Wishlist())));
			}
	/** This function verify user is on Wishlist page*/
	public void displayWishListPage() throws Exception {
			String expectedUrl = (java.lang.String) configuration.getProperty("urlViewWishlist");
			Log.message("Expected Url:- " + expectedUrl, true);
			String actualUrl = PageObject.getDriver().getCurrentUrl();
			Log.message("Actual Url:- " + actualUrl, true);
			Assert.assertEquals(expectedUrl, actualUrl);
			}
	/** This function click store info ToolTip icon */
	public void click_storeinfo_ToolTip_icon() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_storeInfoTooltip())), 40);
	}
	/** This function click store info details link */
	public void click_storeinfo_link() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_storedetailsLink())), 40);
	}
	/** This function display store info details link */
	public void display_storeinfo_link() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_storedetailsLink())), 40);
	}
	/** This function display store info address details  */
	public void display_storeinfo_address_detail() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_storedetails_address())), 40);
	}
	/** This function display store info tooltip details */
	public void display_storeinfo_tooltip_details() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_StoreInfo_tooltipdetails())), 40);
	}
	/** This function display empty cart title  */
	public void display_emptyCart_title() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_EmptycartTitle())), 40);
	}
	/** This function display order summary title  */
	public void display_orderSummary_title() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_orderSummaryTitle())), 40);
	}
	/** This function display Ship To Home title  */
	public void display_STH_title() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_ShipToHomeTitle())), 40);
	}
	/** This function display "ShippingTo" message  */
	public void display_shipto_message() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_ShippingToMsg())), 40);
	}
	/** This function display STH Change CTA  */
	public void display_STH_Change_CTA() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_STHChangeCTA())), 40);
	}
	/** This function click STH Change CTA  */
	public void click_STH_Change_CTA() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_STHChangeCTA())), 40);
	}
	/** This function display STH fee  */
	public void display_STH_fee() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_STHfee())), 40);
	}
	/** This function display postal code modal  */
	public void display_postalCode_Modal() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_postalCodeModal())), 40);
	}
	
	/** This function display pickupatStore Title  */
	public void display_pickupatStore_Title() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_pickupatStoreTitle())), 40);
	}
	/** This function display BOIP Free Fees  */
	public void display_BOIP_FreeFees() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_BOIPFreeFees())), 40);
	}
	/** This function display PickUp at store Change CTA  */
	public void display_PickUpatStore_ChangeCTA() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_PickUpatHomeChangeCTA())), 40);
	}
	/** This function display PickUp at store informational toolTip  */
	public void display_PickUpatStore_tooltip() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_pickupatstoreToolTip())), 40);
	}
	/** This function click PickUp at store informational toolTip  */
	public void click_PickUpatStore_tooltip() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_pickupatstoreToolTip())), 40);
	}
	/** This function click standard delivery informational toolTip  */
	public void click_standard_delivery_tooltip() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_stadardDeliveryTooltip())), 40);
	}
	/** This function click in-home delivery informational toolTip  */
	public void click_inHomeDelivery_tooltip() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_homeDeliveryTooltip())), 40);
	}
	/** This function click in-home and unpack delivery informational toolTip  */
	public void click_inHome_unpack_Delivery_tooltip() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_homeDeliveryUnpackTooltip())), 40);
	}
	/** This function click toolTip close button */
	public void click_tooltip_closebtn() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_CloseToolTipIcon())), 40);
	}
	/** This function validate the tool tip message is not displayed */
	public void validateToolTipMessageNotDisplayed() throws Exception {
		try {
			$displayFindElement(
					By.xpath(testContext.getPageObjectManager().getCartPageLocator().get_TooltipBody()));
			fail();
		} catch (Exception e) {
			Log.message("Tool tip message is not displayed", true);
		}	}

	
	}
