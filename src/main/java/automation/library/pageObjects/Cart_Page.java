package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.Element;
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
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Cart_Url_Fr());
	}
	
	/** This function navigate to Cart Page */
	public void navigateTo_Cart_Fr_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getCartUrl());
	}
	
	/** This function navigate to shopping cart page */
	public void navigate_To_Shopping_Cart_Page() throws Exception {
		
	}
	
	/** This function navigate to Cart Page */
	public void navigateTo_Authenticate_User_Cart_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Shopping_Cart_Url());
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
	/** enter number 99 and click on increase button*/
	public void IncreaseQuantityAfterMaxValue() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Quantity_Box_Cart_Page()), FileReaderManager.getInstance().getDataReader().get_Quantity_3692());
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_IncreaseQuantity())),40);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_IncreaseQuantity()));

	}
	/** click on checkout button*/
	public void clickCheckOutBtn() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_checkOutbtn())),40);

	}
	/** click on close button on the checkout toast msg*/
	public void clickToastmsgCloseBtn() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_ToastmsgCloseBtn())),40);

	}
	
	/** click on order summary ship to home change*/
	public void clickOnOrderSummarySTHChange() throws Exception {
		PageObject.getDriver().navigate().refresh();
		String code = $getText($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Previous_Postal_Code()));
		configuration.setProperty("getPostalCode", code);
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Ship_To_Home_Change())),40);
	}
	
	/** click on ship to home fulfillment change*/
	public void clickOnSTHFulfillmentChange() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Ship_To_Home_Fulfillment_Change())),40);
	}
	
	/** click on Postal Code modal close button*/
	public void clickOnPostalCodeCloseBtn() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Postal_Code_Modal_Close_Btn())),40);
	}
	
	/** This function display Postal Code modal  */
	public void displayPostalCodeModal() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_postalCodeModal())), 40);
	}
	
	/** This function display modal title  */
	public void displayModalTitle() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Postal_Code_Modal_Title())), 40);
	}
	
	/** This function display input text field  */
	public void displayInputTextBoxField() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Postal_Code_Text_Input_Field())), 40);
	}
	
	/** This function display field title  */
	public void displayFieldTitlePostalCode() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Postal_Code_Field_Title())), 40);
	}
	
	/** This function verify display of previous postal code  */
	public void verifyDisplayPreviouslyDefinedPostalCode() throws Exception {
		String expected = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Postal_Code_Text_Input_Field()), "value");
		String actual = (java.lang.String) configuration.getProperty("getPostalCode");
		Assert.assertEquals(expected,actual);
	}
	
	/** This function display Change CTA  */
	public void displayChangeCTA() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Postal_Code_Modal_Change_CTA())), 40);
	}
	
	/** This function display Cancel CTA  */
	public void displayCancelCTA() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Postal_Code_Modal_Cancel_CTA())), 40);
	}
	
	/** This function display cross button  */
	public void displayCrossButton() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Postal_Code_Modal_Close_Btn())), 40);
	}
	
	/** click on Postal Code modal Cancel CTA*/
	public void clickOnCancelCTA() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Postal_Code_Modal_Cancel_CTA())),40);
	}
	

	/** click on Postal Code modal X CTA*/
	public void clickOnCrossCTA() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Postal_Code_Modal_Close_Btn())),40);
	}
	
	/** click on Postal Code modal Change cta*/
	public void clickOnChangeCTA() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Postal_Code_Modal_Change_CTA())),40);
	}
	
	/** verify Postal Code Modal is closed and not displayed */
	public void notDisplayPostalCodeModal() throws Exception {
		try {
			PageObject.getDriver().findElement(By.xpath(testContext.getPageObjectManager().getCartPageLocator().get_postalCodeModal()));
			fail();
		}catch(Exception e) {
			Log.message("Postal Code Modal is closed", true);
		}
	}
	
	/** enter data to valid postal code in postal code modal */
	public void enterDataValidPostalCode() throws Exception {
		WebElement field = PageObject.getDriver().findElement(By.xpath(testContext.getPageObjectManager().getCartPageLocator().get_Enter_Postal_Code_Data()));
		field.sendKeys(Keys.CONTROL,"a");
		field.sendKeys(Keys.DELETE);
		field.sendKeys(FileReaderManager.getInstance().getDataReader().get_Valid_Postal_Code());
		//$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Enter_Postal_Code_Data()));
		//$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Enter_Postal_Code_Data()), FileReaderManager.getInstance().getDataReader().get_Valid_Postal_Code());
	}
	
	/** This function verifys display of success toast message  */
	public void displaySuccessToastMessage() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Success_Toast_Message())), 15);
	}
	
	/** enter data to out of range postal code in postal code modal */
	public void enterDataOutOfRangePostalCode() throws Exception {
		WebElement field = PageObject.getDriver().findElement(By.xpath(testContext.getPageObjectManager().getCartPageLocator().get_Enter_Postal_Code_Data()));
		field.sendKeys(Keys.CONTROL,"a");
		field.sendKeys(Keys.DELETE);
		field.sendKeys(FileReaderManager.getInstance().getDataReader().get_OutOfRange_Postal_Code());
	}
	
	/** enter data to out of range postal code in postal code modal */
	public void enterDataInvalidPostalCode() throws Exception {
		WebElement field = PageObject.getDriver().findElement(By.xpath(testContext.getPageObjectManager().getCartPageLocator().get_Enter_Postal_Code_Data()));
		field.sendKeys(Keys.CONTROL,"a");
		field.sendKeys(Keys.DELETE);
		field.sendKeys(FileReaderManager.getInstance().getDataReader().get_Invalid_Postal_Code());
	}
	
	/** This function verifys display of success toast message  */
	public void displayErrorToastMessage() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Postal_Code_Invalid_Error_Toast_Message())), 15);
	}
	
	/** This function verifys display of success toast message  */
	public void displayInlineError() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_OutOfRange_Inline_Error_Message())), 15);
	}
	
	/** This function verifys display of recommendation badge  */
	public void displayRecommendationBadge() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Recommendation_Category_Badge())), 15);
	}
	
	/** This function display Blue Background */
	public void verifyRecommendationBadgeBackgroundColor() throws Exception {
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Recommendation_Category_Badge()), "background-color");
		Assert.assertTrue(value.contains(FileReaderManager.getInstance().getDataReader().get_Recommendation_Badge_Color()));
	}
	
	/** This function verifys display of Availability badge  */
	public void displayAvailabilityBadge() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Recommendation_Category_Badge())), 15);
	}
	
	/** This function display Yellow Background */
	public void verifyAvailabilityBadgeBackgroundColor() throws Exception {
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Availability_Category_Badge()), "background-color");
		Assert.assertTrue(value.contains(FileReaderManager.getInstance().getDataReader().get_Availability_Badge_Color()));
	}
	
	/** This function verifys display of Availability badge  */
	public void displayUniqueBadge() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Unique_Category_Badge())), 15);
	}
	
	/** This function display Yellow Background */
	public void verifyUniqueBadgeBackgroundColor() throws Exception {
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Unique_Category_Badge()), "background-color");
		Assert.assertTrue(value.contains(FileReaderManager.getInstance().getDataReader().get_Unique_Badge_Color()));
	}
	
	/** This function display White border */
	public void verifyUniqueBadgeBorderColor() throws Exception {
		String bottomBorder = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Unique_Category_Badge()), "border-bottom-color");
		String leftBorder = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Unique_Category_Badge()), "border-left-color");
		String rightBorder = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Unique_Category_Badge()), "border-right-color");
		String topBorder = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Unique_Category_Badge()), "border-top-color");
		Assert.assertTrue(bottomBorder.contains(FileReaderManager.getInstance().getDataReader().get_Unique_Badge_Border_Color()));
		Assert.assertTrue(leftBorder.contains(FileReaderManager.getInstance().getDataReader().get_Unique_Badge_Border_Color()));
		Assert.assertTrue(rightBorder.contains(FileReaderManager.getInstance().getDataReader().get_Unique_Badge_Border_Color()));
		Assert.assertTrue(topBorder.contains(FileReaderManager.getInstance().getDataReader().get_Unique_Badge_Border_Color()));
	}
	
	/** This function verifys display of Availability badge  */
	public void displayPricingAndPromoBadge() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Pricing_And_Promo_Category_Badge())), 15);
	}
	
	/** This function display Red Background */
	public void verifyPricingAndPromoBadgeBackgroundColor() throws Exception {
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Pricing_And_Promo_Category_Badge()), "background-color");
		Assert.assertTrue(value.contains(FileReaderManager.getInstance().getDataReader().get_Pricing_And_Promo_Badge_Color()));
	}
	
	/** This function verifys maximum badges displayed  */
	public void verifyMaximumBadgesDisplayed() throws Exception {
		List<Element> maxBadges = $$(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Maximun_Badges_Displayed());
		Log.message("Size:- " + maxBadges.size(), true);
		Assert.assertTrue(maxBadges.size() <= 2);
	}
	
	/** This function is verify that badge is not clickable */
	public void badgesNotClickable() throws Exception {
       try {
    	   $click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Pricing_And_Promo_Category_Badge())),10);
       }catch(Exception e) {
    	   fail();
       }
	}
	
	/** This function verifys display of badges below price  */
	public void displayBadgesBelowPrice() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Badges_Below_Price())), 15);
	}
	
	/** This function verifys display of badges below price  */
	public void displayBadges() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Availability_Category_Badge())), 15);
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Unique_Category_Badge())), 15);
	}
	
	/** This function verify that shopping cart is zero */
	public void displayShoppingCartZero() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Shopping_Cart_Zero())), 15);
	}
	
	/** This function verify that empty shopping cart message is displayed */
	public void displayEmptyShoppingCartMessage() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Empty_Shopping_Cart_Message())), 15);
	}
	
	/** This function verify that sign in is displayed */
	public void displaySignInButton() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Sign_In_Button())), 15);
	}
	
	/** This function verify that sign in is displayed */
	public void clickSignInButton() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Sign_In_Button())), 15);
	}
	
	/** This function verify that continue shopping button is displayed */
	public void dispalyContinueShoppingButton() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Continue_Shopping_Button())), 15);
		String continueShoppingUrl = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Continue_Shopping_Button()), "href");
		conf.setProperty("continueShoppingUrl", continueShoppingUrl);
	}
	
	/** This function verify that continue shopping button is displayed */
	public void clickContinueShoppingButton() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Continue_Shopping_Button())), 15);
		
	}
	
	/** This function verify that link is landing on main page */
	public void verifyLinkLandingOnMainPage() throws Exception {
		String url = (java.lang.String) conf.getProperty("continueShoppingUrl");
		Assert.assertTrue(PageObject.getDriver().getCurrentUrl().contains(url));
	}
	
	/** This function verify that view wish list button is displayed */
	public void displayViewListButton() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_View_Wish_List_Button())), 15);
	}
		
	
	/** enter 1 Quantity for product */
	public void enterOneQuantityForProduct() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Quantity_Field()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Quantity_Field()), FileReaderManager.getInstance().getDataReader().get_One_Quantity());;
	}
	
	/** verify eco fess is displayed */
	public void displayEcoFees() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Eco_Fees()));
	}
	
	/** verify eco message is displayed */
	public void displayEcoMessage() throws Exception {
		String getMessage = $getText($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Eco_Fees())).trim();
		String[] message = getMessage.split(" ");
		String ecoMessage = message[0] + " " + "$x" + " " + message[2] + " " + message[3];
		Assert.assertEquals(ecoMessage, "Incl. $x Env. fees");
	}
	
	/** verify info icon is displayed */
	public void displayInfoIconEcoFees() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Info_Icon_Eco_Fees()));
	}
	
	/** click on info icon */
	public void clickInfoIconEcoFees() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Info_Icon_Eco_Fees()));
	}
	
	/** verify tool tip message is displayed */
	public void displayToolTipEcoMessage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Tool_Tip_Message_Eco()));
	}

	/** click on close button */
	public void clickOnCloseEcoToolTipButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getCartPageLocator().get_Close_Button_Eco_Tool_Tip()));
	}
	
	/** verify echo tool tip is closed */
	public void verifyEchoToolTipClosed() throws Exception {
		try {
			$findElement(By.xpath(testContext.getPageObjectManager().getCartPageLocator().get_Tool_Tip_Message_Eco()));
			fail();
		}catch(Exception e) {
			Log.message("Echo tool tip is successfully closed", true);
		}
	}
	
}