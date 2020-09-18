package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import edu.emory.mathcs.backport.java.util.Collections;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;


public class PLP_Page extends PageObject {

	TestContext testContext;
	List<Float> productPrice = new ArrayList<Float>();
	ArrayList<Integer> rating = new ArrayList<Integer>();
	List<Float> price = new ArrayList<Float>();

	public PLP_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	public void navigateTo_PLP_Page() throws Exception {

		DriverFactory.getInstance().getDriver().navigate()
				.to(FileReaderManager.getInstance().getConfigReader().getPLPUrl());

	}

	public void display_PLP_Page() throws Exception {

		Assert.assertTrue("Automation_PLP".contains(testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle())
				);

	}

	public void displayListView() throws Exception {
		Assert.assertTrue(
				$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View())));
	}

	public void displayGridView() throws Exception {
		Assert.assertTrue(
				$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View())));
	}

	public void displayProductCardImage() throws Exception {
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card_Image())));
	}

	public void clickOnListViewButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button()));
	}

	public void displayProductCardTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card_Title()));
	}
		
	public void clickOnPriceLowToHigh() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Price_Low_To_High()));
	}
		
	public void displaySortByOption() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Sort_By_Option()));
	}

	public void clickSortByOption() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Sort_By_Option()));
	}

	public void selectPriceHighToLow() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Price_High_To_Low()));
	}

	public List<Float> productPrice() throws Exception {
		PageObject.getDriver().navigate().refresh();
		List<Element> price = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Price());
		for (int i = 0; i < price.size(); i++) {
			productPrice.add(Float.parseFloat(price.get(i).getText().replace("$", "").replace(",", "")));
		}
		return productPrice;
	}
	
	
	public void verifyPriceHighToLow() throws Exception {
		ArrayList<Float> priceFloat = new ArrayList<Float>();
		priceFloat.addAll(productPrice());
		Log.message("Size:- " + priceFloat, true);
		for (int i = 0; i < priceFloat.size() - 1; i++) {
			Log.message("Number:- " + priceFloat.get(i) + "--" + "--" + priceFloat.get(i + 1), true);
			Assert.assertTrue(priceFloat.get(i) >= priceFloat.get(i + 1));
		}

	}
	
	public void select_New_Arrivals() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_New_Arrivals()));
	}
	
	public void clickCloseButton() throws Exception {
		$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getPLPLocatorPage().get_Close_Button()));
	}
	
	public void select_Customer_Rating_High_To_Low() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Customer_Rating_High_To_Low()));
	}
	
	public List<Integer> rating() throws Exception {
		List<Element> productContainer = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_productContainer());
		for(int i=0; i<productContainer.size(); i++) {
			
			List<Element> ratingCustomer = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_productContainerThree() + String.valueOf(i) +
					testContext.getPageObjectManager().getPLPLocatorPage().get_ratingOne() +
					testContext.getPageObjectManager().getPLPLocatorPage().get_ratingThree());
			Log.message("Xpath:- "  + testContext.getPageObjectManager().getPLPLocatorPage().get_productContainerThree() + String.valueOf(i) +testContext.getPageObjectManager().getPLPLocatorPage().get_ratingOne() + testContext.getPageObjectManager().getPLPLocatorPage().get_ratingThree(), true);
			rating.add(ratingCustomer.size());		
		}
		return rating;
	}
	
	public void verifyRatingHighToLow() throws Exception {
		ArrayList<Integer> customerRating = new ArrayList<Integer>();
		customerRating.addAll(rating());
		for (int i = 0; i < customerRating.size() - 1; i++) {
			Log.message("Number:- " + customerRating.get(i) + "--" + "--" + customerRating.get(i + 1), true);
			Assert.assertTrue(customerRating.get(i) >= customerRating.get(i + 1));
		}
	}

//--Dinesh
	public void verifyPriceLowToHigh() throws Exception {
		ArrayList<Float> priceFloat = new ArrayList<Float>();
		priceFloat.addAll(productPrice());
		for (int i = 0; i < priceFloat.size() - 1; i++) {
			Log.message("Number:- " + priceFloat.get(i) + "--" + "--" + priceFloat.get(i + 1), true);
			Assert.assertTrue(priceFloat.get(i) <= priceFloat.get(i + 1));
	  }	
    }
	
	public void mouseHoverOnPrimaryImage() throws Exception {
		String primaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		configuration.setProperty("primaryImage", primaryImage);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()));
		$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image())));
	}
	
	public void mouseHoverOnMobilePrimaryImage() throws Exception {
		String primaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image_Mobile()), "src");
		configuration.setProperty("primaryImage", primaryImage);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image_Mobile()));
		$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image_Mobile())));
	}
	
	public void displaySecondaryImage() throws Exception {
		String primaryImage = (java.lang.String) configuration.getProperty("primaryImage");
		String expectedImage = primaryImage.replace("_a", "_b");
		String secondaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		Assert.assertEquals(expectedImage, secondaryImage);
	}
	
	public void displayMobileSecondaryImage() throws Exception {
		String primaryImage = (java.lang.String) configuration.getProperty("primaryImage");
		String expectedImage = primaryImage.replace("_a", "_b");
		String secondaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image_Mobile()), "src");
		Assert.assertEquals(expectedImage, secondaryImage);
	}
	
	public void moveCursor() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Sort_By_Option()));
	}
	
	public void verifySwitchOnPrimaryImage() throws Exception {
		String primaryImage = (java.lang.String) configuration.getProperty("primaryImage");
		String previousImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		Assert.assertEquals(primaryImage, previousImage);
	}
	
	public void verifySwitchOnPrimaryMobileImage() throws Exception {
		String primaryImage = (java.lang.String) configuration.getProperty("primaryImage");
		String previousImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image_Mobile()), "src");
		Assert.assertEquals(primaryImage, previousImage);
	}
	
	public void clickListViewMobile() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button_Mobile())), 5);
		
	}
	
	public void displayPrimaryProductImage() throws Exception {
		String primaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image_Mobile()), "src");
		Assert.assertTrue(primaryImage.contains("_a"));
	}
	
	public void clickGridViewButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View_Button()));
	}
	
	public void clickGridViewButtonMobile() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View_Button_Mobile())), 3);
	}
	
	public void hoverOnProductContainsMoreThanFourColor() throws Exception {
		String getPrimaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		String expectedImage = getPrimaryImage.replace("_a", "_b");
		List<Element> secondaryImageList = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image());
		List<WebElement> primaryImage = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()));
		List<Element> colorNumber = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Color_Number());
		for(int i=0; i<colorNumber.size(); i++) {
			String[] color = $getText(colorNumber.get(i)).split(" ");	
			if(Integer.parseInt(color[0]) > 6) {
				$mouseHover(primaryImage.get(i));
				String secondaryImage = $getAttributeValue(secondaryImageList.get(0), "src");
				Log.message("Secondary Image:- " + secondaryImage, true);
				Assert.assertEquals(expectedImage, secondaryImage);
				Assert.assertTrue($display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_More_Color())));
				break;
			}
		}
	}
	
	public void displayProductCardReview() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image())), 5);
		String getPrimaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		Log.message("Primary Image:- " + getPrimaryImage,  true);
		String expectedImage = getPrimaryImage.replace("_a", "_b");
		Log.message("Primary Expected Image:- " + expectedImage,  true);
		List<Element> secondaryImageList = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image());
		List<WebElement> primaryImage = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()));	
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card_Review()));
		List<Element> productCardReview = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card_Review());
		for(int i=0; i<productCardReview.size(); i++) {
			if($getText(productCardReview.get(i)).equalsIgnoreCase("")) {
				Log.message("Number :- " +i, true);
				$mouseHover(primaryImage.get(i));
				String secondaryImage = $getAttributeValue(secondaryImageList.get(i), "src");
				Log.message("Secondary Image:- " + secondaryImage, true);
				Log.message("Expected Image:- " + expectedImage, true);
				Assert.assertTrue(expectedImage.contains("_b"));
				break;
			}else {
				Log.message("Products have variants", true);
				fail();
			}
		}
	}
	
	public void clickProductCardVariant() throws Exception {
		String productImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		configuration.setProperty("previousSelectedProductImage", productImage);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Variant()));
	}
	
	public void displaySelectedProductVariant() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Selected_Product_Variant()));
	}
	
	public void displaySelectedProductImage() throws Exception {
		String previousSelectedProductImage = (java.lang.String) configuration.getProperty("previousSelectedProductImage");
		Log.message("previousSelectedProductImage:- " + previousSelectedProductImage, true);
		String selectedProductImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		Log.message("Image Value:- " + selectedProductImage, true);
		Assert.assertNotEquals(previousSelectedProductImage, selectedProductImage);
	}
	
	public void displayNumberOfColours() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Number_Of_Colour()));
	}
	
	public void displayNumberOfColoursVariant() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Number_Of_Colour()));
	}
	
}
