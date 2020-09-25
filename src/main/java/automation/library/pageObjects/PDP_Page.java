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
 * This file contains the functions of Mailinator Page
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

	/** This function naviget to PDP Page */
	public void navigateTo_PDP_Page() throws Exception {

		DriverFactory.getInstance().getDriver().navigate().to(FileReaderManager.getInstance().getConfigReader().getPDPUrl());

	}

	/** This function click on Add to Cart Button */
	public void clickOnAddToCartButton() throws Exception {

		$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Add_To_Cart_Button()).click();

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
		Assert.assertTrue(specification.size() == 6);
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
   
   /** This function is verify that In store bade is displayed */
   public void verifyInStoreBageColorCode() throws Exception {
	   String colorValue = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Badge_In_Store_Clearnce()), "background-color"); 
	   testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyColorCode("#ffd92a", colorValue);
   }
   

   /** select product */
	public void selectProduct() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Pink_Color()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Sweet_Water()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Size_Seven()));
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
		   testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyColorCode("#000000", colorValue);
	   }
}
