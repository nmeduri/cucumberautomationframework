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

public class PDP_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public PDP_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	public void display_PDP_Page() throws Exception {

		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle();

	}

	public void display_warranty_Under_Resource() throws Exception {

		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Warranty_Under_Resource())));
	}

	public void display_return_Policty_Under_Resource() throws Exception {
		Assert.assertTrue($display($(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policty_Under_Resource())));
	}

	public void navigateTo_PDP_Page() throws Exception {

		DriverFactory.getInstance().getDriver().navigate().to(FileReaderManager.getInstance().getConfigReader().getPDPUrl());

	}

	public void clickOnAddToCartButton() throws Exception {

		$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Add_To_Cart_Button()).click();

	}

	public void verifyWarrantyInformationNotNull() throws Exception {

		Assert.assertFalse(
				$getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Warranty_Value()))
						.isEmpty());

	}

	public void displaySpecificationsSection() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_Title()), 5);
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_Section())));
	}

	public void displaySpecificationsTitle() throws Exception {
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_Title())));
	}

	public void displaySpecificationsInTabularFormat() throws Exception {
		Assert.assertTrue($display($(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format())));
	}

	public void displaySpecificationsTitleAndValueForEachSpecification() throws Exception {

		List<Element> specification = $$(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format());
		for (int i = 0; i < specification.size(); i++) {
			Assert.assertFalse($getText(specification.get(i)).isEmpty());
		}

	}

	public void displaySpecificationsLessThan8OnTheDesktop() {
		List<Element> specification = $$(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format());
		Assert.assertTrue(specification.size() <= 8);

	}

	public void dispalyProductTitle() throws Exception {
		Assert.assertTrue($display(
				ExpectedConditions.visibilityOfElementLocated(
						$By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Title())),
				5));
	}

	public void verifyReturnPolicyDescription() throws Exception {
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policy_Description())));
		Assert.assertFalse($getText(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policy_Description()))
						.isEmpty());
	}

	public void displayReturnPolicyLink() throws Exception {
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policy_Link())));
	}

	public void clickOnReturnPolicyLink() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policy_Link()));
	}

	public void verifyReturnPolicyInNewTab() throws Exception {
		
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		Log.message("Title:- " + testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle(),
				true);

	}
	
	public void displayProductCode() throws Exception {
		Assert.assertTrue($display(
				ExpectedConditions.visibilityOfElementLocated(
						$By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Code())),
				5));
	}
	
	public void clickIncremenQuantitytButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Select_Increment_Quantity()));
	}
	
	public void clickDecrementQuantityButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Decrement_Quantity()));
	}
	
	public void getValueQuantityBox() throws Exception {
		String value = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value");
		configuration.setProperty("quantityBox", value);
	}
	
	public void verifyUpdatedQuantityByOne() throws Exception {
		String quantity = (java.lang.String) configuration.getProperty("quantityBox");
		int quantityValue = Integer.parseInt(quantity);
		String expectedQuantity = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value");
		int expectedQuantityValue = Integer.parseInt(expectedQuantity);
		Assert.assertEquals(expectedQuantityValue, quantityValue + 1);
	}
	
   public void verifyUpdatedDecrementQuantityByOne() throws Exception {
	   String expectedQuantity = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value");
	   int expectedQuantityValue = Integer.parseInt(expectedQuantity);
	   String quantity = (java.lang.String) configuration.getProperty("quantityBox");
	   int quantityValue = Integer.parseInt(quantity);
	   Assert.assertEquals(expectedQuantityValue, quantityValue);
   }	
   
   public void signDecrementDisabledWhenQuantityOne() throws Exception {
	   String quantiy = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value");
	   int quantiyValue = Integer.parseInt(quantiy);
	   Assert.assertEquals(quantiyValue, 1);
   }
   
   public void displayDecrementSignDisabled() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Decrement_Disabled()));
   }
   
   public void enterUpdatedQuantityInTheBoxThatIsGreaterThanZeroAndLessThanMaximumQuantity() throws Exception {
	   
	   int quantity = Integer.parseInt(FileReaderManager.getInstance().getDataReader().get_Quantity());
	   if(quantity > 0 && quantity <= 99) {
		 $clearData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box())); 
		 $enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), FileReaderManager.getInstance().getDataReader().get_Quantity());
	   }else {
		   Log.message("Invlaid Quantity", true);
	   }   
   }
   
   public void displayUpdatedQuantity() throws Exception {
	   String quantity = FileReaderManager.getInstance().getDataReader().get_Quantity();
	   String updatedQuantity = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value");
	   Assert.assertEquals(quantity, updatedQuantity);
   }
   
   public void enterQuantityGreaterThanMaxixmum() throws Exception {
	   $clearData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box())); 
	   $enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), FileReaderManager.getInstance().getDataReader().get_Quantity_Greater_Than_Maximum_Quantity());
   }
   
   public void verifyQuantityGreaterThanMaximumNotUpdate() throws Exception {
	   $clearData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()));
	   Assert.assertNotEquals(FileReaderManager.getInstance().getDataReader().get_Quantity_Greater_Than_Maximum_Quantity(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value"));
   }
   
   public void enterNotIntegerNumberInQuantityBox() throws Exception {
	   $clearData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()));
	   $enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), FileReaderManager.getInstance().getDataReader().get_Quantity_Not_Integer());
   }
   
   public void enterDecimalNumberInQuantityBox() throws Exception {
	   $clearData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()));
	   $enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), FileReaderManager.getInstance().getDataReader().get_Quantity_In_Decimal());
   }
   
   public void verifyNotAllowedNotIntegerValue() throws Exception {
	   Assert.assertNotEquals(FileReaderManager.getInstance().getDataReader().get_Quantity_Not_Integer(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value"));
   }
   
   public void verifyNotAllowedNotDecimalValue() throws Exception {
	   Assert.assertNotEquals(FileReaderManager.getInstance().getDataReader().get_Quantity_In_Decimal(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value"));
   }
   
   public void enterQuantityZeroInQuantityBox() throws Exception {
	   $clearData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()));
	   $enterData($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), FileReaderManager.getInstance().getDataReader().get_Quantity_Zero());
   }
   
   public void verifyNotAllowedZeroValue() throws Exception {
	   Assert.assertNotEquals(FileReaderManager.getInstance().getDataReader().get_Quantity_Zero(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Quantity_Box()), "value"));
   }
   
   public void clickWishlistButton() throws Exception {
	   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Wishlist_Button()));
   }
   
   public void displayErrorWishlist() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Error_Message_Wishlist()));
   }
   
   public void scrollDown() throws Exception {
	   testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDownByCoordinates();
   }
   
   public void displayBadgeInStoreClearnce() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Badge_In_Store_Clearnce()));
   }
   
   public void displayBadgeSelectStyleSize() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Badge_Select_Style_Size()));
   }
   
   public void select_Product_Variant() throws Exception {
	   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Variant()));
   }
   
   public void select_Disable_Size() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Disable_Size()));
	}
   
   public void display_Get_It_Installed() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_It_Installed()));
   }
   
   public void display_Message_Available_At_Check() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Message_Available_At_Check()));
   }
   
   public void display_Installation_Icon() throws Exception {
	   $display($(Loc.CLASSNAME, testContext.getPageObjectManager().getPDPPageLocator().get_Installation_Icon()));
   }
   
   public void display_Tool_Tip_Icon_Installation() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Tool_Tip_Icon_Installation()));
   }
   
   public void click_Tool_Tip_Icon() throws Exception {

	   $click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Tool_Tip_Icon_Installation())), 30);
   }
   
   public void display_Tool_Tip_Message_Installation_Indicator() throws Exception {
	   $display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Tool_Tip_Message_Installation_Indicator())), 10);

   }
   
   public void not_Display_Tool_Tip_Message_Installation_Indicator() throws Exception {
	   Assert.assertFalse($display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Tool_Tip_Message_Installation_Indicator())));
   }
   
   public void display_Close_Button_Tool_Tip_Icon_Installation_Indicator() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Close_Button_Tool_Tip_Installation_Indicator()));
   }
   
   public void click_Close_Button_Tool_Tip_Icon_Installation_Indicator() throws Exception {
	   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Close_Button_Tool_Tip_Installation_Indicator()));
   }
   
   public void click_Product_Title() throws Exception {
	   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Title()));
   }
   
   public void display_Romance_Copy_Section() throws Exception {
	   $display($(Loc.ID, testContext.getPageObjectManager().getPDPPageLocator().get_Romance_Copy_Section()));
   }
   
   public void display_Romance_Copy_Section_Title() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Romance_Copy_Section_Title()));
   }
   
   public void display_Romance_Copy_Content() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Romance_Copy_Content()));
   }
   
   public void display_Product_Manual_Title() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Manual_Title()));
   }
   
   public void display_Product_Manual_Description() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Manual_Description()));
   }
   
   public void display_Product_Manual_Link() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Manual_Link()));
   }

   public void click_Product_Manual_Link() throws Exception {
	   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Manual_Link()));
   }
   
   public void get_URL_Product_Manual_Link() throws Exception {
	   String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Manual_Link()), "href");
	   Log.message("URL:- " + url, true);
	   conf.setProperty("pdfUrl", url);
   }
   
   public void verify_PDF_In_New_Tab() throws Exception {
	   String expectedUrl = (java.lang.String) conf.getProperty("pdfUrl");
	   Assert.assertEquals(expectedUrl, PageObject.getDriver().getCurrentUrl());
   }

   public void displayStickyAddToCart() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Sticky_Add_To_Cart()));
	}
   
   public void scrollDownToStickyAddToCart() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_Title()), 5);
	}
   
   public void displayFeaturesSection() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Features_Section()));
	}
   
   public void displayFeaturesInBulletList() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Features_In_Bullet_List()));
	}
   
   public void displaySpecificationsEightSpecifications() {
		List<Element> specification = $$(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format());
		Assert.assertTrue(specification.size() == 6);
	}
   
   public void displayViewMoreSpecifications() throws Exception {
	   $display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_More_Specifications())), 10);
   }
   
   public void clickViewMoreSpecifications() throws Exception {
	   $click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_More_Specifications())), 10);
   }
   
   public void clickViewLessSpecifications() throws Exception {
	   $click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_Less_Specifications())), 10);
   }
   
   public void displayRemainingListOfSpecifications() throws Exception {
	   $display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format())), 10);
	   List<Element> specification = $$(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format());
	   Log.message("specification.size():- " + specification.size(), true);
		Assert.assertTrue(specification.size() > 6);
   }
   
   public void notDisplayViewMoreSpecifications() throws Exception {
	   try {
		   $display($$$$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_More_Specifications(), 1));
		   Log.message("View more specification is displayed.", true); 
		   fail();
	   }catch(Exception e) {
		   Log.message("View more specification is not displayed.", true);  
	   }	      
   }
   
   public void displayViewLessSpecifications() throws Exception {
	   $display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_Less_Specifications())), 10);
   }
   
   public void notDisplayViewLessSpecifications() throws Exception {
	   try {
		   $display($$$$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_Less_Specifications(), 1));
		   Log.message("View more specification is displayed.", true); 
		   fail();
	   }catch(Exception e) {
		   Log.message("View more specification is not displayed.", true);  
	   } 
   }

   public void displayProductPrice() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Unit_Price()));
	}
   
   public void displaySwatchWithSize() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Swatch_With_Size()));
   }
   
   public void displaySizeLabel() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Size_Label()));
   }
   
   public void displayUnavailableSize() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Unavailable_Size()));
   }
   
   public void clickAvailableSize() throws Exception {
	   $click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Available_Size()));
   }
   
   public void displaySelectedSize() throws Exception {
	   String size = $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Selected_Size()));
	   configuration.setProperty("selectedSize", size);
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Selected_Size()));
   }
   
   public void verifySelectedSizeLabel() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Selected_Size_Title()));
	   String selectedSizeTitle = $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Selected_Size_Title()));
	   String expectedSize = (java.lang.String) configuration.getProperty("selectedSize");
	   Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Size_Label())) + selectedSizeTitle,$getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Size_Label())) + expectedSize);
   }
   
   public void displayColourSelectorFirst() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Colour_Selector_First()));
   }
   
   public void displaySizeSelectorSecond() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Size_Selector_Second()));
   }
   
   public void displayDefaultColor() throws Exception {
	   String[] selectedColor = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Selected_Color()), "aria-label").split(" ");
	   String selectedColorTitle = $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Selected_Color_Title()));
	   Assert.assertTrue(selectedColorTitle.contains(selectedColor[1]));
   }
   
   public void displaySpecialBuy() throws Exception {
	   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Special_Buy()));
	   }
   
   public void verifyColorCode() throws Exception {
	   String colorValue = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Special_Buy()), "background-color"); 
	   testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyColorCode("#ffe0df", colorValue);
   }
   
   public void displaySpecialBuyForAllVariant() throws Exception {
	   List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Color_Variant());
	   for(int i=0; i<li.size(); i++) {
		   li.get(i).click();
		   $display($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Special_Buy()));
	   }
   }
   
}
