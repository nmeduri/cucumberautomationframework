package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Random;
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
 * This file contains the functions of PDP Page
 * 
 */

public class PDP_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public PDP_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function is verify that PDP Page is displayed */
	public void display_PDP_Page() throws Exception {

		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle();

	}
	
	/** This function is verify that PDP Page is displayed for Zero Review Product. */
	public void navigate_PDP_Page_Zero_Reviews() throws Exception {
		PageObject.getDriver().navigate().to(FileReaderManager.getInstance().getDataReader().get_Zero_Url_Url());
	}

	/** This function is verify that warranty is displayed under resource section */
	public void display_warranty_Under_Resource() throws Exception {

		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Warranty_Under_Resource())));
	}

	/** This function is verify that return policy is displayed under resource section */
	public void display_return_Policty_Under_Resource() throws Exception {
		Assert.assertTrue($display($(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policty_Under_Resource())));
	}

	/** This function navigate to PDP Page */
	public void navigateTo_PDP_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getPDPUrl());

	}
	/** This function navigate to PDP Page with perfect Gift badge */
	public void navigateTo_PDP_Page_perfectGift_Badge() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_pdpProductBadgeURL());

	}
	/** This function display perfect Gift badge */
	public void display_PDP_Page_perfectGift_Badge() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_perfectGiftBadge()));

	}
	/** This function display exclusive badge */
	public void display_PDP_Page_exclusive_Badge() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_exclusiveBadge()));

	}
	/** This function navigate to PDP Page with exclusive badge */
	public void navigateTo_PDP_Page_Exclusive_Badge() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_pdpExclusiveBadgeURL());

	}
	
	/** This function navigate to PDP Product Page */
	public void navigate_To_PDP_Product_Page(String sProductCode) throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().getPDPProductUrl() + sProductCode);
	}
	
	/** This function navigate to PDP Product Page */
	public void navigate_To_PDP_Page(String sProductCode) throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().getPDPUrlProduct() + sProductCode);
	}
	
	/** This function navigate to PDP Product FR Page */
	public void navigate_To_PDP_Product_FR_Page(String sProductCode) throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().getPDPProductFRUrl() + sProductCode);
	}

	/** This function click on Add to Cart Button */
	public void clickOnAddToCartButton() throws Exception {

		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Add_To_Cart_Button()));

	}

	/** This function verify Warranty Information is not null */
	public void verifyWarrantyInformationNotNull() throws Exception {

		Assert.assertFalse(
				$getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Warranty_Value()))
						.isEmpty());

	}

	/**  This function is verify that specifications section is displayed */
	public void displaySpecificationsSection() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_Title()), 5);
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_Section())));
	}
	/** This function is verify that Title 'Specifications' is displayed */
	public void displaySpecificationsTitle() throws Exception {
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_Title())));
	}

	public void displaySpecificationsInTabularFormat() throws Exception {
		Assert.assertTrue($display($(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format())));
	}

	/** This function is verify that Title 'Specification' and value for each specifications is displayed*/
	public void displaySpecificationsTitleAndValueForEachSpecification() throws Exception {

		List<Element> specification = $$(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format());
		for (int i = 0; i < specification.size(); i++) {
			Assert.assertFalse($getText(specification.get(i)).isEmpty());
		}

	}

	/** This function is verify that specification is less than 8*/
	public void displaySpecificationsLessThan8OnTheDesktop() {
		List<Element> specification = $$(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format());
		Assert.assertTrue(specification.size() <= 8);

	}

	/** This function is verify that Product Title is displayed */
	public void dispalyProductTitle() throws Exception {
		Assert.assertTrue($display(
				ExpectedConditions.visibilityOfElementLocated(
						$By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Title())),
				5));
	}

	/** This function is verify that Return Policy Description is displayed*/
	public void verifyReturnPolicyDescription() throws Exception {
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policy_Description())));
		Assert.assertFalse($getText(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policy_Description()))
						.isEmpty());
	}

	/** This function is verify that return policy link is displayed */
	public void displayReturnPolicyLink() throws Exception {
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policy_Link())));
	}

	/** This function click on return policy link*/
	public void clickOnReturnPolicyLink() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policy_Link()));
	}

	/** This function is verify return policy open in new tab */
	public void verifyReturnPolicyInNewTab() throws Exception {
		
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		Log.message("Title:- " + testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle(),
				true);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();

	}
	
	/** This function is verify that product code is displayed */
	public void displayProductCode() throws Exception {
		Assert.assertTrue($display(
				ExpectedConditions.visibilityOfElementLocated(
						$By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Code())),
				5));
	}
	
	/** This function click on Increment Quantity Button */
	public void clickIncremenQuantitytButton() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Select_Increment_Quantity()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Select_Increment_Quantity()));
	}
	
	/** This fucntion click on decrement quantity button */
	public void clickDecrementQuantityButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Decrement_Quantity()));
	}
	
	/** Get Quantity Box value*/
	public void getValueQuantityBox() throws Exception {
		String value = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value");
		configuration.setProperty("quantityBox", value);
	}
	
	/** This function is verify that Quantity value is update by one*/
	public void verifyUpdatedQuantityByOne() throws Exception {
		String quantity = (java.lang.String) configuration.getProperty("quantityBox");
		int quantityValue = Integer.parseInt(quantity);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()));
		String expectedQuantity = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value");
		int expectedQuantityValue = Integer.parseInt(expectedQuantity);
		Assert.assertEquals(expectedQuantityValue, quantityValue + 1);
	}
	
	/** This function is verify that quantity is decrement by one */
   public void verifyUpdatedDecrementQuantityByOne() throws Exception {
	   String expectedQuantity = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value");
	   int expectedQuantityValue = Integer.parseInt(expectedQuantity);
	   String quantity = (java.lang.String) configuration.getProperty("quantityBox");
	   int quantityValue = Integer.parseInt(quantity);
	   Assert.assertEquals(expectedQuantityValue, quantityValue);
   }	
   
   /** This function is verify that sign decrement is disbaled when quantity is one */
   public void signDecrementDisabledWhenQuantityOne() throws Exception {
	   String quantiy = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value");
	   int quantiyValue = Integer.parseInt(quantiy);
	   Assert.assertEquals(quantiyValue, 1);
   }
   
   /** This function is verify that decrement sign is disabled */
   public void displayDecrementSignDisabled() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Decrement_Disabled()));
   }
   
   /** update quantity in the box is greater tha Zero and Less than Maximum quantity */
   public void enterUpdatedQuantityInTheBoxThatIsGreaterThanZeroAndLessThanMaximumQuantity() throws Exception {
	   
	   int quantity = Integer.parseInt(FileReaderManager.getInstance().getDataReader().get_Quantity());
	   if(quantity > 0 && quantity <= 99) {
		 $clearData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box())); 
		 $enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), FileReaderManager.getInstance().getDataReader().get_Quantity());
	   }else {
		   Log.message("Invlaid Quantity", true);
	   }   
   }
   
   /** This function is verify that quantity is update */
   public void displayUpdatedQuantity() throws Exception {
	   String quantity = FileReaderManager.getInstance().getDataReader().get_Quantity();
	   String updatedQuantity = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value");
	   Assert.assertEquals(quantity, updatedQuantity);
   }
   
   /** enter quantity Greater than maximum*/
   public void enterQuantityGreaterThanMaxixmum() throws Exception {
	   $clearData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box())); 
	   $enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), FileReaderManager.getInstance().getDataReader().get_Quantity_Greater_Than_Maximum_Quantity());
   }
   
   /** This function is verify that quantity (Greater than maximum) is not updated */
   public void verifyQuantityGreaterThanMaximumNotUpdate() throws Exception {
	   $clearData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()));
	   Assert.assertNotEquals(FileReaderManager.getInstance().getDataReader().get_Quantity_Greater_Than_Maximum_Quantity(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value"));
   }
   
   /** enter not integer number in quantity box*/
   public void enterNotIntegerNumberInQuantityBox() throws Exception {
	   $clearData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()));
	   $enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), FileReaderManager.getInstance().getDataReader().get_Quantity_Not_Integer());
   }
   
   /** enter decimal number in quantity box */
   public void enterDecimalNumberInQuantityBox() throws Exception {
	   $clearData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()));
	   $enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), FileReaderManager.getInstance().getDataReader().get_Quantity_In_Decimal());
   }
   
   /** This function is verify that Non Integer value is not allowed */
   public void verifyNotAllowedNotIntegerValue() throws Exception {
	   Assert.assertNotEquals(FileReaderManager.getInstance().getDataReader().get_Quantity_Not_Integer(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value"));
   }
   
   /** This function is verify that decimal value is not allowed */
   public void verifyNotAllowedNotDecimalValue() throws Exception {
	   Assert.assertNotEquals(FileReaderManager.getInstance().getDataReader().get_Quantity_In_Decimal(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value"));
   }
   
   /** enter quantity Zero*/
   public void enterQuantityZeroInQuantityBox() throws Exception {
	   $clearData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()));
	   $enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), FileReaderManager.getInstance().getDataReader().get_Quantity_Zero());
   }
   
   /** This function is verify that Zero value is not allowed */
   public void verifyNotAllowedZeroValue() throws Exception {
	   Assert.assertNotEquals(FileReaderManager.getInstance().getDataReader().get_Quantity_Zero(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value"));
   }
   
   /** This function click on wishlist button */
   public void clickWishlistButton() throws Exception {
	   $click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Wishlist_Button())), 10);
	   $click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Wishlist_Button())), 10);
   }

   /** This function is verify that wish list icon is displayed */
   public void dispalyWishlistIcon() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_WishList_Icon()));
   }
   
   /** This function is verify that wishl list icon is in default state */
   public void displayDefaultStateWishlistIcon() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Default_State_WishList_Icon()));
   }
   
   /** This function is verify that error message is displayed for wish list */
   public void displayErrorWishlist() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Error_Message_Wishlist()));
   }
   
   /** scroll down to page */
   public void scrollDown() throws Exception {
	   testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDownByCoordinates();
   }
   
   /** This function is verify that Badge In Store Clearance is displayed */
   public void displayBadgeInStoreClearnce() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Badge_In_Store_Clearnce()));
   }
   
   /** This function is verify that Badge Slect Style/Size is displayed */
   public void displayBadgeSelectStyleSize() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Badge_Select_Style_Size()));
   }
   
   /** select product variant*/
   public void select_Product_Variant() throws Exception {
	   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Variant()));
   }
   
   /** verify to select size is disabled */
   public void select_Disable_Size() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Disable_Size()));
	}
   
   /** This function is verify that Get It Installed is displayed */
   public void display_Get_It_Installed() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_It_Installed()));
   }
   
   /** This function is verify that Available at Check is displayed */
   public void display_Message_Available_At_Check() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Message_Available_At_Check()));
   }
   
   /** This function is verify that Installation Icon is displayed */
   public void display_Installation_Icon() throws Exception {
	   $display($(Loc.CLASSNAME, testContext.getPageObjectManager().getPDPPageLocator().get_Installation_Icon()));
   }
   
   /** This function is verify that Tool Tip Icon Installation is displayed */
   public void display_Tool_Tip_Icon_Installation() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Tool_Tip_Icon_Installation()));
   }
   
   /** This function click on Tool Tip Icon */
   public void click_Tool_Tip_Icon() throws Exception {

	   $click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Tool_Tip_Icon_Installation())), 30);
   }
   
   /** This function is verify that Tool Tip Message Installation is displayed */
   public void display_Tool_Tip_Message_Installation_Indicator() throws Exception {
	   $display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Tool_Tip_Message_Installation_Indicator())), 10);

   }
   
   /** This function is verify that Tool Tip Message is not displayed */
   public void not_Display_Tool_Tip_Message_Installation_Indicator() throws Exception {
	   Assert.assertFalse($display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Tool_Tip_Message_Installation_Indicator())));
   }
   
   /** This function is verify that close button is displayed */
   public void display_Close_Button_Tool_Tip_Icon_Installation_Indicator() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Close_Button_Tool_Tip_Installation_Indicator()));
   }
   
   /** This function is verify that Tool tip Icon installation indicator is displayed */
   public void click_Close_Button_Tool_Tip_Icon_Installation_Indicator() throws Exception {
	   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Close_Button_Tool_Tip_Installation_Indicator()));
   }
   
   /** This function click on product title */
   public void click_Product_Title() throws Exception {
	   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Title()));
   }
   
   /** This function is verify that romance copy is displayed */
   public void display_Romance_Copy_Section() throws Exception {
	   $display($(Loc.ID, testContext.getPageObjectManager().getPDPPageLocator().get_Romance_Copy_Section()));
   }
   
   /** This function is verify that Title romance copy is displayed */
   public void display_Romance_Copy_Section_Title() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Romance_Copy_Section_Title()));
   }
   
   /** This function is verify that content romance copy displayed */
   public void display_Romance_Copy_Content() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Romance_Copy_Content()));
   }
   
   /** This function is verify that title product manual is displayed */
   public void display_Product_Manual_Title() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Manual_Title()));
   }
   
   /** This function is verify that Description Product Manual is displayed */
   public void display_Product_Manual_Description() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Manual_Description()));
   }
   
   /** This function is verify that Link product maual link is displayed */
   public void display_Product_Manual_Link() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Manual_Link()));
   }

   /** This function click on product manual link */
   public void click_Product_Manual_Link() throws Exception {
	   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Manual_Link()));
   }
   
   /** get product manual pdf url */
   public void get_URL_Product_Manual_Link() throws Exception {
	   String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Manual_Link()), "href");
	   Log.message("URL:- " + url, true);
	   conf.setProperty("pdfUrl", url);
   }
   
   /** verify to pdf is open in new tab */
   public void verify_PDF_In_New_Tab() throws Exception {
	   String expectedUrl = (java.lang.String) conf.getProperty("pdfUrl");
	   Assert.assertEquals(expectedUrl, PageObject.getDriver().getCurrentUrl());
   }

   /** This function is verify Add to cart is displayed on sticky */
   public void displayStickyAddToCart() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Sticky_Add_To_Cart()));
	}
   
   /** scroll down to page */
   public void scrollDownToStickyAddToCart() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_Title()), 5);
	}
   
   /** This function is verify that feature section is displayed */
   public void displayFeaturesSection() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Features_Section()));
	}
   
   /** This function is verify that features is displayed in bullet */
   public void displayFeaturesInBulletList() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Features_In_Bullet_List()));
	}
   
   /** This function is verify  8 specifications are displayed  */
   public void displaySpecificationsEightSpecifications() {
	   
		List<Element> specification = $$(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format());
		Log.message("Size:- " + specification.size(), true);
		Assert.assertTrue(specification.size() == 7);
	}
   
   /** This function is verify that view more displayed */
   public void displayViewMoreSpecifications() throws Exception {
	   $display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_More_Specifications())), 10);
   }
   
   /** This function click on view more */
   public void clickViewMoreSpecifications() throws Exception {
	   $click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_More_Specifications())), 10);
   }
   
   /** This function click on view less */
   public void clickViewLessSpecifications() throws Exception {
	   $click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_Less_Specifications())), 10);
   }
   
   /** This function is verify that remaining list of specifications is displayed */
   public void displayRemainingListOfSpecifications() throws Exception {
	   $display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format())), 10);
	   List<Element> specification = $$(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format());
	   Log.message("specification.size():- " + specification.size(), true);
		Assert.assertTrue(specification.size() > 6);
   }
   
   /** This function is verify that view more is not displayed */
   public void notDisplayViewMoreSpecifications() throws Exception {
	   try {
		   $display($$$$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_More_Specifications(), 1));
		   Log.message("View more specification is displayed.", true); 
		   fail();
	   }catch(Exception e) {
		   Log.message("View more specification is not displayed.", true);  
	   }	      
   }
   
   /** This function is verify that view less is displayed */
   public void displayViewLessSpecifications() throws Exception {
	   $display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_Less_Specifications())), 10);
   }
   
   /** This function is verify that view less is not displayed */
   public void notDisplayViewLessSpecifications() throws Exception {
	   try {
		   $display($$$$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_Less_Specifications(), 1));
		   Log.message("View more specification is displayed.", true); 
		   fail();
	   }catch(Exception e) {
		   Log.message("View more specification is not displayed.", true);  
	   } 
   }

   /** This function is verify that product price is displayed */
   public void displayProductPrice() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Unit_Price()));
	}
   
   /** This function is verify that size is displayed */
   public void displaySwatchWithSize() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Swatch_With_Size()));
   }
   
   /** This function is verify that Label 'Size' is displayed */
   public void displaySizeLabel() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Size_Label()));
   }
   
   /** This function is verify that Unavailabe sizd is displayed */
   public void displayUnavailableSize() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Unavailable_Size()));
   }
   
   /** This function click on available size */
   public void clickAvailableSize() throws Exception {
	   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Available_Size()));
   }
   
   /** This function is verify that 'selected size' is displayed */
   public void displaySelectedSize() throws Exception {
	   String size = $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Selected_Size()));
	   configuration.setProperty("selectedSize", size);
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Selected_Size()));
   }
   
   /** This function is verify that label 'selected size' is displayed */
   public void verifySelectedSizeLabel() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Selected_Size_Title()));
	   String selectedSizeTitle = $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Selected_Size_Title()));
	   String expectedSize = (java.lang.String) configuration.getProperty("selectedSize");
	   Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Size_Label())) + selectedSizeTitle,$getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Size_Label())) + expectedSize);
   }
   
   /** This function is verify that colour selector first is displayed */
   public void displayColourSelectorFirst() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Colour_Selector_First()));
   }
   
   /** This function is verify that size selector is displayed */
   public void displaySizeSelectorSecond() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Size_Selector_Second()));
   }
   
   /** This function is verify that default color is displayed */
   public void displayDefaultColor() throws Exception {
	   String[] selectedColor = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Selected_Color()), "aria-label").split(" ");
	   String selectedColorTitle = $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Selected_Color_Title()));
	   Assert.assertTrue(selectedColorTitle.contains(selectedColor[1]));
   }
   
   /** This function is verify that special buy is displayed */
   public void displaySpecialBuy() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Special_Buy()));
	   }
   
   /** This function is verify that color code is displayed */
   public void verifyColorCode() throws Exception {
	   String colorValue = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Special_Buy()), "background-color"); 
	   testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyColorCode("#ffe0df", colorValue);
   }
   
   /** This function is verify that special buy is displayed for all variant */
   public void displaySpecialBuyForAllVariant() throws Exception {
	   List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Color_Variant());
	   for(int i=0; i<li.size(); i++) {
		   li.get(i).click();
		   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Special_Buy()));
	   }
   }
   
   /** This function is verify that In store is displayed for all variant */
   public void displayInStoreBuyForAllVariant() throws Exception {
	   List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Color_Variant());
	   for(int i=0; i<li.size(); i++) {
		   li.get(i).click();
		   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Badge_In_Store_Clearnce()));
	   }
   }
   /** This function is verify that perfect gift badge is displayed for all variant */
   public void displayPerfectGiftForAllVariant() throws Exception {
	  // $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_ColorVariant_PerfectGift()));
	   List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Color_Variant());
	   for(int i=0; i<li.size(); i++) {
		   li.get(i).click();
	
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_perfectGiftBadge()));
   }
   }
   /** This function is verify that Exclusive badge is displayed for all variant */
   public void displayExclusiveBadgeForAllVariant() throws Exception {
	  // $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_ColorVariant_PerfectGift()));
	   List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Color_Variant());
	   for(int i=0; i<li.size(); i++) {
		   li.get(i).click();
	
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_exclusiveBadge()));
   }
   }
   /** This function is verify that exclusive badge color */
   public void verifyExclusiveBadgeColorCode() throws Exception {
	   String colorValue = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_exclusiveBadge()), "background-color"); 
	   testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyColorCode("#fff6c9", colorValue);
   }
   /** This function is verify that In store bade is displayed */
   public void verifyInStoreBageColorCode() throws Exception {
	   String colorValue = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Badge_In_Store_Clearnce()), "background-color"); 
	   testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyColorCode("#ffd92a", colorValue);
   }
   

   /** select product */
	public void selectProduct() throws Exception {
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getPDPPageLocator().get_Oxford_Color())));
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getPDPPageLocator().get_Assembled_Length())));
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getPDPPageLocator().get_Size_Seven())));
	}
	
	/** This function is verify that message 'Item added to wish list' is displayed */
	public void displayItemAddedWishlistMessage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Added_WishList_Message()));
	}
	
	/** This function is verify that wish list icon is in default state */
	public void wishlistIconInDefaultState() throws Exception {
		try {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Wishlist_Badge()));
			fail();
		}catch(Exception e) {
			
		}
	}
	
	/** This function is verify that wish list icon color */
	public void verifyWishListIconColor() throws Exception {
		   String colorValue = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_WishList_Icon()), "background-color"); 
		   Log.message("Color:- " + colorValue, true);
		   testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyColorCode("#000000", colorValue);
	   }
	
	/** This function is verify that quantity box is visible */
	public void verifyQuantityBoxVisible() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box())), 2);
	}
	
	/** This function is verify that quantiy value is defaulted to one*/
	public void verifyQuantityValueDefaultedToOne() throws Exception {
		String value = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value");
		Assert.assertEquals("1", value);
	}
	
	
	/** This function is verify that Pencil Banner is displayed */
	public void display_PencilBanner() throws Exception {
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_PencilBanner())));
	}
	/** This function is verify that Account link is displayed*/
	public void display_AccountLink() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Account_link()));
	}
	
	/** This function is verify that Preferences Options is displayed*/
	public void display_PreferencesOption() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_PreferencesOption()));
	}
	
	/** This function is verify that Wish list option is displayed*/
	public void display_WishListOption() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_WishlistOption()));
	}
	
	/** This function is verify that Personal Info is displayed*/
	public void display_PersonalInfoOption() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_PersonalInfoOption()));
	}
	
	/** This function is verify that Order History is displayed */
	public void display_OrderHistory() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_OrderHistory()));
	}
	
	/** This function is verify that Payment Info is displayed */
	public void display_PaymentInfo() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_PaymentInfo()));
	}
	
	/** This function is verify that Address is displayed */
	public void display_Address() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Address()));
	}
	
	/** This function is verify that Reward is displayed */
	public void display_Reward() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Reward()));
	}
	
	/** This function is verify that Preference is displayed */
	public void display_Preference() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Preference()));
	}
	
	/** This function is verify that Made for Life is displayed */
	public void display_MadeForLife() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_MadeForLifeText()));
	}
	
	/** This function is verify that customer service is displayed */
	public void display_CustomerServicePage() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_CustomerService_Page()));
	}
	
	/** This function is verify that credit offered is displayed */
	public void display_CreditOffered() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_CreditOfferedText()));
	}
	
	/** This function is verify that customer service is displayed */
	public void display_CustomerService() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_CustomerService()));
	}
	
	/** This function clicks on customer service */
	public void click_CustomerService() throws Exception {

		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_CustomerService()));
	}
	
	/** This function is verify that Language is displayed */
	public void display_Language() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Language()));
	}
	
	/** This function click on Language */
	public void Click_Language() throws Exception {

		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Language()));
	}
	
	/** This function click on Account Link */
	public void Click_AccountLink() throws Exception {
		//DriverFactory.getInstance().getDriver().navigate().to(FileReaderManager.getInstance().getConfigReader().getPDPUrl());
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Account_link()));
	}
	
	/** This function click on Preference Option */
	public void Click_PreferencesOption() throws Exception {
     Thread.sleep(2000);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_PreferencesOption()));
	}
	
	/** This function click on wishlist Option */
	public void Click_WishListOption() throws Exception {

		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_WishlistOption()));
	}
	
	/** This function click on Personal Info */
	public void Click_PersonalInfoOption() throws Exception {

		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_PersonalInfoOption()));
	}
	
	/** This function click on order history */
	public void Click_OrderHistory() throws Exception {

		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_OrderHistory()));
	}
	
	/** This function click on payment info */
	public void Click_PaymentInfo() throws Exception {

		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_PaymentInfo()));
	}
	
	/** This function click on address */
	public void Click_Address() throws Exception {

		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Address()));
	}
	
	/** This function click on reward */
	public void Click_Reward() throws Exception {

		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Reward()));
	}
	
	/** This function click on Preference */
	public void Click_Preference() throws Exception {

		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Preference()));
	}
	
	/** This function is verify that 'Sign In' is displayed */
	public void display_SignIn() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_SignInOption()));
	}
	
	/** This function is verify that registration is displayed */
	public void display_Registration() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_RegistrationOption()));
	}
	
	/** This function click on hi link */
	public void Click_HiLink() throws Exception {

		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_HiLink()));
	}
	
	/** This function is verify that sign out is displayed */
	public void display_SignOut() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_SignOutOption()));
	}
	
	/** This function click on sign out */
	public void click_SignOut() throws Exception {

		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_SignOutOption()));
	}
	/** This function is verify that PDP Page is displayed */
	public void display_PDP_Page_Title() throws Exception {
		
		if(testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle().contains("PDPnew")) {
		Log.message("PDP title: "+testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle(), true);
		Thread.sleep(2000);
		}else {
			Log.message("PDP page is not displayed", true);
			fail();
		}
	}
	/** This function click on different colour variant */
	   public void click_different_colour_variant() throws Exception {
		   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_SelectDifferentColourVariant()));
	   }
	   /** This function is verify that different color is displayed */
	   public void verifySelectedColorLabel() throws Exception {
		   String selectedColorValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_DifferentColor()), "aria-label").replace("Variant ", "");
		   String selectedColorTitle = $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Selected_Color_Title())).replace("Color: ", "");
		   Log.message("selectedColorTitle : "+selectedColorTitle, true);
		   Log.message("selectedColor : "+selectedColorValue, true);
		   Assert.assertTrue(selectedColorTitle.equalsIgnoreCase(selectedColorValue));
	   }
	   
	   /** This function is verify that badges should be more than two */
	   public void verifyBadgesMoreThanTwo() throws Exception {
		   $display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Badges())), 3);
		   List<Element> badges = $$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Badges());
		   Assert.assertTrue(badges.size() >= 2);
	   }
	   
	   /** This function is verify that Feature section is not displayed */
	   public void notDisplayFeatureSection() throws Exception {
		   try {
			   $displayFindElement($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Features_Section()));
			   fail();
		   }catch(Exception e) {
			   
		   }
	   }
	   
	   /** Resource section is displayed */
	   public void displayResouceSection() throws Exception {
		   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Resource_Section()));
	   }
	   
	   /** This function is verify that Installation Icon is not displayed */
	   public void not_display_Installation_Icon() throws Exception {
		   try {
			   $displayFindElement($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Installation_Icon()));
			   fail();
		   }catch(Exception e) {
			   
		   }
	   }
	   
	   /** message available at check is not displayed */
	   public void not_Displayed_Available_at_Checkout() throws Exception {
		   try {
			   $displayFindElement($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Message_Available_At_Check()));
			   fail();
		   }catch(Exception e) {
			   
		   }
	   }
	   
	   /** tool tip is not displayed */
	   public void not_Displayed_Tool_Tip_Icon() throws Exception {
		   try {
			   $displayFindElement($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Tool_Tip_Icon_Installation()));
			   fail();
		   }catch(Exception e) {
			   
		   }
	   }
	   /** This function is verify that display Add to Cart fly out */
	   public void display_Add_To_Cart_FlyOut() throws Exception {
		   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Continue_Button_On_Safety_Model()));
		   $display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Add_To_Cart_Fly_Out())), 40);
	   }
	   /** This function is verify that select any variant */
	   public void selectAnyVariant() throws Exception {	   
		   if($display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Select_Default_color()))) {
			   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Select_Default_color()));
			   if($display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Swatch_With_Size()))) {
				   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Swatch_With_Size()));
				   if($display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Length_Variant()))) {
					   ((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getPDPPageLocator().get_Length_Variant())));
				   }else
					   Log.message("Default Length is not displayed ", true);
			   }
			   else
				   Log.message("Default Size is not displayed ", true);
		   }else
			   Log.message("Default Color is not displayed ", true);
	   }
	   /** This function is verify that display Add to Cart fly out Image */
	   public void display_Add_To_Cart_FlyOut_Image() throws Exception {
		   $display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Add_To_Cart_Fly_Out_Image())), 40);
	   }
	   /** This function is verify that display Add to Cart fly out of Product Brand */
	   public void display_Add_To_Cart_FlyOut_Product_Brand() throws Exception {
		   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Add_To_Cart_FlyOut_Product_Brand()));
	   }
	   /** This function is verify that display Add to Cart fly out of Product Title */
	   public void display_Add_To_Cart_FlyOut_Product_Title() throws Exception {
		   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Add_To_Cart_FlyOut_Product_Title()));
	   }
	   /** This function is verify that display Add to Cart fly out of Product Variants */
	   public void display_Add_To_Cart_FlyOut_Product_Variants() throws Exception {
		   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Add_To_Cart_FlyOut_Product_Variants()));
	   }
	  
	   /** This function navigate to PDP Product Page for FR locale */
		public void navigate_To_PDP_Product_Page_fr_Locale(String sProductCode) throws Exception {
			driver.navigate().to(FileReaderManager.getInstance().getDataReader().getPDPProductUrl_Fr() + sProductCode);
		}
	
	   /** This function navigate to PDP Page */
		public void navigate_to_PDP_Sort_Product_Reviews_Page() throws Exception {

			driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_PDP_Sort_Product_Reviews_URL());

		}
		
		 /** This function verify if sort by section is displayed*/
		public void displaySortBySection() throws Exception {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Reviews_Section_Title()), 20);
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_SortBy_Section()));
		}
		
		 /** This function verify if sort by most recent label is displayed*/
		public void displaySortByMostRecentLabel() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_SortBy_Reviews_Label()));
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Most_Recent_Label()));
		}

		 /** This function verify if most recent is displayed*/
		public void displayMostRecentDefault() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Most_Recent_Label()));
		}
		
		 /** This function verify if most recent is displayed*/
		public void displayChevronInReviews() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Chevron_Reviews()));
		}
		
		/** This function click on Sorting option */
		public void clickOnSortingOption() throws Exception {
			//$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Most_Recent_Label()));
			((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getPDPPageLocator().get_Most_Recent_Label())));
		}
		
		 /** This function verify if all sorting options are displayed*/
		public void displaySortingOptions() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Most_Relevant()));
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Most_Helpful()));
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_HToL_Rating()));
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_LToH_Rating()));
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Most_Recent()));
		}
		
		/** This function click on Sorting option */
		public void clickOnMostHelpfulOption() throws Exception {
			$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Most_Helpful())),15);
			//$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Most_Helpful()));
			((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getPDPPageLocator().get_Most_Helpful())));
		}
		
		/** This function verify if most recent is displayed*/
		public void displayMostHelpfulLabel() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Most_Helpful_Reviews_Label()));
		}
		/** This function will scroll down to Questions and Answers section */
		public void scrollDownToQuestionsAndAnswersSection() throws Exception {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Questions_And_Answers_Section()), 3);
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollUpByCoordinates();
		}
		/** This function verify Be the first to ask a question is displayed*/
		public void displayBeTheFirstToAskAQuestion() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Be_The_First_To_Ask_A_Question()));
		}
		/** This function to click on Be the first to ask a question link*/
		public void clickOnBeTheFirstToAskAQuestion() throws Exception {
			//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Be_The_First_To_Ask_A_Question()), 1);
			//$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Be_The_First_To_Ask_A_Question()));
			((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getPDPPageLocator().get_Be_The_First_To_Ask_A_Question())));
		}
		/** This function verify ask a question form is displayed*/
		public void displayAskAQuestionForm() throws Exception {
			$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Ask_A_Question_Form())),30);
			$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Ask_A_Question_Text_Box())),30);
			
		}
		/** This function verify Ask a Question CTA is displayed*/
		public void displayAskAQuestionCTA() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Ask_A_Question_CTA()));
		}
		
		/** This function verify Questions list is displayed*/
		public void displayQuestionsList() throws Exception {
			$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getPDPPageLocator().get_Questions_List());
		}
		/** This function verify Username of questioner list is displayed*/
		public void displayUsernameOfQuestionerList() throws Exception {
			$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getPDPPageLocator().get_Username_Questioner_List());
		}
		/** This function verify TimeStamp of question is displayed*/
		public void displayTimeStampOfQuestion() throws Exception {
			$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getPDPPageLocator().get_Timestamp_Of_Question());
		}
		/** This function verify Number Of Answers are displayed*/
		public void displayNumberOfAnswers() throws Exception {
			$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getPDPPageLocator().get_Number_Of_Answers());
		}
		/** This function verify AnsThisQuestion Button is displayed*/
		public void displayAnsThisQuestionButton() throws Exception {
			$display($(Loc.XPATH,testContext.getPageObjectManager().getPDPPageLocator().get_AnsThisQuestion_Button()));
		}
		/** This function to click on AnsThisQuestion Button*/
		public void clickOnAnsThisQuestionCTA() throws Exception {
			$click($(Loc.XPATH,testContext.getPageObjectManager().getPDPPageLocator().get_AnsThisQuestion_Button()));
		}
		/** This function verify Post Answer Model is displayed*/
		public void displayPostAnswerModel() throws Exception {
			$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Post_Answer_Model())),40);
		}
		
		/** This function verify Report button is displayed */
		public void displayReportButton() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Report_Button()));
		}
		
		/** click on report button */
		public void clickReportButton() throws Exception {
			$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Report_Button()));
		}
		
		/** verify button is changed to reported from report */
		public void verifyButtonTitleChangedReported() throws Exception {
			Assert.assertEquals("Reported", $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Disabled_Reported_Label())));
		}
		
		/** verify label reported is not clickable */
		public void verifyReporedLabelNotClickable() throws Exception {
			testContext.getPageObjectManager().getPDPPageLocator().get_Disabled_Reported_Label();
		}
		
		/** verify that five unfilled stars are getting displayed */
		public void displayFiveUnfilledStars() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Unfilled_Star()));
		}
		
		/** verify that write a reviews is not displayed */
		public void notDisplayWriteAReviews() throws Exception {
			try {
				$findElement(By.xpath(testContext.getPageObjectManager().getPDPPageLocator().get_Write_A_Review()));
	            fail();
			}catch(Exception e) {
				Log.message("Button 'Write A Reviews' is not Displayed", true);
			}
		}
		
		/** click on unfilled stars */
		public void clickOnUnfilledStars() throws Exception {
			$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Unfilled_Star()));
		}
		
		/** review section is displayed */
		public void displayReviewSection() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Review_Section()));
		}
		
		/** verify that title of section as reviews */
		public void verifyTitlSectionAsReviews() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Title_Reviews_Section_Scrollable()));
			Assert.assertEquals("Reviews", $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Title_Reviews_Section_Scrollable())));
		}
		
		/** verify that title of section as reviews for FR */
		public void verifyTitlSectionAsReviewsForFR() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Title_Reviews_Section_Scrollable()));
			Assert.assertEquals("Évaluations", $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Title_Reviews_Section_Scrollable())));
		}
		
		/** verify that unfilled stars are displayed for scrollable section */
		public void displayUnfilledStarsForScrollableSection() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Unfilled_Stars_For_Scrollable_Section()));
		}
		
		/** be the first to ask a question is clickable */
		public void veifyBeTheFirstAskQuestionIsClickable() throws Exception {
			$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Be_The_First_To_Write_Ask_Review())), 10);
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Review_Title()));
		}
		
		/** be the first to ask a question is clickable */
		public void veifyBeTheFirstAskQuestionIsClickableMobile() throws Exception {
			$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Be_The_First_To_Write_Ask_Review_Mobile())), 10);
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Review_Title()));
		}
		
		/** verify review model appears */
		public void displayReviewModelAppears() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Review_Title()));
		}
		
		/** enter Question Answer details on pop up */
		public void enterQuestionAnswerDetailsOnPopUp() throws Exception {
			$enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Question_Answer_Field_Review_PopUp()), FileReaderManager.getInstance().getDataReader().get_Question_Answer_Review());
			$enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Name_Field_Review_PopUp()), FileReaderManager.getInstance().getDataReader().get_Name_Review());
			$enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Email_Field_Review_Pop_Up()), FileReaderManager.getInstance().getDataReader().get_Email_Data());
		}
		
		/** enter review details on pop up */
		public void enterReviewDetailsOnPopUp() throws Exception {
			Thread.sleep(3000);
			Random rand = new Random();
	    	int number = rand.nextInt();
	    	String value = Integer.toString(number);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Review_Star_Pop_Up()));
			$enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Review_Title_Pop_Up()), FileReaderManager.getInstance().getDataReader().get_Review_Title_Pop_Up());
			$enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Review_Description_Pop_Up()), FileReaderManager.getInstance().getDataReader().get_Review_Description_Pop_Up());
			
			$enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Name_Field_Review_PopUp()), FileReaderManager.getInstance().getDataReader().get_Name_Review() + value);
			$enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Email_Field_Review_Pop_Up()), FileReaderManager.getInstance().getDataReader().get_Email_Review());
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).performDropDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Canadian_Tire_Employee()), "selectByIndex", "1");
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).performDropDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Canadian_Tire_Supplier()), "selectByIndex", "1");
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).performDropDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Member_Of_The_Test_For_Life_In_Canada_Program()), "selectByIndex", "1");
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).performDropDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Receive_This_Product_For_Free()), "selectByIndex", "1");
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).performDropDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Review_Written_As_Part_Of_Canadian_Tire()), "selectByIndex", "1");
			$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Terms_And_Conditions_Pop_Up()));
			//$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Submit_Review_Button()));
		}
		
		/** click on reviews section on buybox */
		public void clickReviewsSectionBuyBox() throws Exception {
			$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Filled_Stars()));
		}
		
		/** verify Zero rating count is displayed in parentheses */
		public void verifhyZeroRatingCountInParentheses() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Rating_Count()));
			Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Rating_Count())).contains("("));
			Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Rating_Count())).contains(")"));
			Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Rating_Count())).contains("0"));
		}
		
		/** badges 'Only online' is displayed */
		public void displayOnlyOnlineBadges() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Only_Online_Badges()));
		}
		
		/** badges 'Perfect Gift' is displayed */
		public void displayPerfictGiftBadges() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Perfect_Gift_Badge()));
		}
		
		/** This function is verify that online buy is displayed for all variant */
		   public void displayOnlineBuyForAllVariant() throws Exception {
			   List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Variant_Product());
			   for(int i=0; i<li.size(); i++) {
				   li.get(i).click();
				   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Only_Online_Badges()));
			   }
		   }
		   
		/** verify online badge is displayed in yellow color */
		   public void verifyOnlineBadgeInYellowColor() throws Exception {
			   String colorValue = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Only_Online_Badges()), "background-color"); 
			   testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyColorCode("#fff6c9", colorValue);
		   }
		   
		   /** verify perfect gift badge is displayed in blue color */
		   public void verifyPerfectGiftBadgeInBLueColor() throws Exception {
			   String colorValue = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Perfect_Gift_Badge()), "background-color"); 
			   testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyColorCode("#daeaf3", colorValue);
		   }
		   
		   /** verify average product rating is displayed */
		   public void displayAverageProductRating() throws Exception {
			   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Number_Of_Rating_Stars()));
		   }
		   
		   /** verify Total number of reviews are displayed in parentheses */
			public void verifyNumberofRevewsInParentheses() throws Exception {
				$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Rating_Count()));
				Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Rating_Count())).contains("("));
				Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Rating_Count())).contains(")"));
				//Assert.assertFalse($getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Rating_Count())).contains("0"));
			}
}
