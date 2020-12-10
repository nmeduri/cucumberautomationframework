package automation.library.pageObjects;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

/**
 * This file contains the functions of PLP Page
 * 
 */

public class PLP_Page extends PageObject {

	TestContext testContext;
	List<Float> productPrice = new ArrayList<Float>();
	ArrayList<Integer> rating = new ArrayList<Integer>();
	List<Float> price = new ArrayList<Float>();
    static int j=0;
	public PLP_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function navigate to PLP Page */
	public void navigateTo_PLP_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getConfigReader().getPLPUrl());

	}
	
	/** This function navigate to PLP FR Page */
	public void navigateTo_PLP_FR_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getDataReader().get_PLP_Fr_URL());

	}
	
	/** This function navigate to price detail PLP Page */
	public void navigateTo_price_detail_PLP_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getDataReader().get_Price_Detail_PLP_Url());

	}
	
	/** This function navigate to Feature List Author Page Page */
	public void navigateTo_Price_Detail_PLP_Author_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Price_Detail_PLP_Url());

	}
	
	/** This function navigate to PLP Page */
	public void navigateTo_PLP_Show_More_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getConfigReader().getPLPUrlShowMore());

	}

	/** This function is verify that PLP Page is displayed */
	public void display_PLP_Page() throws Exception {

		Assert.assertTrue("Automation_PLP".contains(testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle())
				);

	}

	/** This function is verify that List View is displayed */
	public void displayListView() throws Exception {
		Assert.assertTrue(
				$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View())));
	}

	/** This function is verify that Grid View is displayed */
	public void displayGridView() throws Exception {
		Assert.assertTrue(
				$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View())));
	}

	/** This function is verify that product card image is displayed */
	public void displayProductCardImage() throws Exception {
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card_Image())));
	}

	/** This function click on list view button */
	public void clickOnListViewButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button()));
	}

	/** This function is verify that Title 'Product Card Title' is displayed */
	public void displayProductCardTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card_Title()));
	}
	
	/** click on product  ard */
	public void clickProductCardTitle() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card_Title()));
	}
		
	/** This function click on price low to high */
	public void clickOnPriceLowToHigh() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Price_Low_To_High()));
	}
		
	/** This function is verify that Sort By Option is displayed */
	public void displaySortByOption() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Sort_By_Option()));
	}

	/** This function click on sort by option */
	public void clickSortByOption() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Sort_By_Option()));
	}

	/** select price hight to low */
	public void selectPriceHighToLow() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Price_High_To_Low()));
	}

	/** return product price */
	public List<Float> productPrice() throws Exception {
		PageObject.getDriver().navigate().refresh();
		List<Element> price = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Price());
		Log.message("Size:- " + price.size(), true);
		for (int i = 0; i < price.size()-1; i++) {
			Log.message("Price:- " + i + "--" + price.get(i).getText(), true);
			productPrice.add(Float.parseFloat(price.get(i).getText().replace("$", "").replace(",", "")));
		}
		return productPrice;
	}
	
	/** This function is verify that price hight to low is displayed */
	public void verifyPriceHighToLow() throws Exception {
		ArrayList<Float> priceFloat = new ArrayList<Float>();
		priceFloat.addAll(productPrice());
		Log.message("Size:- " + priceFloat, true);
		for (int i = 0; i < priceFloat.size()-1; i++) {
			//Log.message("Number:- " + priceFloat.get(i) + "--" + "--" + priceFloat.get(i + 1), true);
			Assert.assertTrue(priceFloat.get(i) >= priceFloat.get(i + 1));
		}
		String url = PageObject.getDriver().getCurrentUrl();
		conf.setProperty("currentFilterUrl", url);

	}
	
	/** select new arrivals */
	public void select_New_Arrivals() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_New_Arrivals()));
	}
	
	/** This function click on close button */
	public void clickCloseButton() throws Exception {
		$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getPLPLocatorPage().get_Close_Button()));
	}
	
	/** select customer rating high to low  */
	public void select_Customer_Rating_High_To_Low() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Customer_Rating_High_To_Low()));
	}
	
	/** return customer rating */
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
	
	/** This function is verify that rating high to low is displayed */
	public void verifyRatingHighToLow() throws Exception {
		ArrayList<Integer> customerRating = new ArrayList<Integer>();
		customerRating.addAll(rating());
		for (int i = 0; i < customerRating.size() - 1; i++) {
			Log.message("Number:- " + customerRating.get(i) + "--" + "--" + customerRating.get(i + 1), true);
			Assert.assertTrue(customerRating.get(i) >= customerRating.get(i + 1));
		}
	}

//--Dinesh
	/** This function is verify that price low to high is displayed */
	public void verifyPriceLowToHigh() throws Exception {
		ArrayList<Float> priceFloat = new ArrayList<Float>();
		priceFloat.addAll(productPrice());
		for (int i = 0; i < priceFloat.size() - 1; i++) {
			Log.message("Number:- " + priceFloat.get(i) + "--" + "--" + priceFloat.get(i + 1), true);
			Assert.assertTrue(priceFloat.get(i) <= priceFloat.get(i + 1));
	  }	
    }
	
	/** mouse hover on primary image */
	public void mouseHoverOnPrimaryImage() throws Exception {
		String primaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		configuration.setProperty("primaryImage", primaryImage);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()));
		$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image())));
	}

	/** This function is verify that rating section is not displayed */
	public void notDisplayRatingSection() throws Exception {
		List<Element> productContainer = $$(Loc.XPATH,testContext.getPageObjectManager().getPLPLocatorPage().get_Each_Product_Container()); 
		for( int i=0; i<productContainer.size(); i++) {
			try {
			List<Element> customerRating = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Container()+String.valueOf(i)+ "']" +testContext.getPageObjectManager().getPLPLocatorPage().get_customerRating());
			rating.add(customerRating.size()); 
			if(rating.size()>=1) {
				$display($$$$(Loc.XPATH,testContext.getPageObjectManager().getPLPLocatorPage().get_Container()+String.valueOf(i) + testContext.getPageObjectManager().getPLPLocatorPage().get_Reviews_Button(), 1));
				}
			}
			catch(Exception e) {
				//Log.message("For Container" + i + ":- Rating section is not displayed", true);
				}
			rating.clear();
			}
		}
	/** mouse hover on primary image */
	public void mouseHoverOnMobilePrimaryImage() throws Exception {
		String primaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image_Mobile()), "src");
		configuration.setProperty("primaryImage", primaryImage);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image_Mobile()));
		$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image_Mobile())));
	}
	
	/** This function is verify that secondary image is displayed */
	public void displaySecondaryImage() throws Exception {
		String primaryImage = (java.lang.String) configuration.getProperty("primaryImage");
		String expectedImage = primaryImage.replace("_a", "_b");
		String secondaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		Assert.assertEquals(expectedImage, secondaryImage);
	}
	
	/** This function is verify that secondary is displayed */
	public void displayMobileSecondaryImage() throws Exception {
		String primaryImage = (java.lang.String) configuration.getProperty("primaryImage");
		String expectedImage = primaryImage.replace("_a", "_b");
		String secondaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image_Mobile()), "src");
		Assert.assertEquals(expectedImage, secondaryImage);
	}
	
	/** This function is verify that secondary image is not displayed */
	public void displayNotMobileSecondaryImage() throws Exception {
		String primaryImage = (java.lang.String) configuration.getProperty("primaryImage");
		String expectedImage = primaryImage.replace("_a", "_b");
		String secondaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image_Mobile()), "src");
		Assert.assertNotEquals(expectedImage, secondaryImage);
	}
	
	/** move to cursor */
	public void moveCursor() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Sort_By_Option()));
	}
	
	/** This function is verify that verify switch on  primary image */
	public void verifySwitchOnPrimaryImage() throws Exception {
		String primaryImage = (java.lang.String) configuration.getProperty("primaryImage");
		String previousImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		Assert.assertEquals(primaryImage, previousImage);
	}
	
	/** This function is verify that switch on primary image */
	public void verifySwitchOnPrimaryMobileImage() throws Exception {
		String primaryImage = (java.lang.String) configuration.getProperty("primaryImage");
		String previousImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image_Mobile()), "src");
		Assert.assertEquals(primaryImage, previousImage);
	}
	
	/** This function is verify that breadcrumbs is displayed */
	 public void displayBreadcrumb() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Breadcrumb()));
			Log.message("breadcrumb is displayed", true);	
		}
	 
	 /** return  breadcrumbs list */
	 public ArrayList<String> getBreadcrumbsHeirarchy() throws Exception {
		 ArrayList<String> breadcrumbsList = new ArrayList<String>();
		 Element breadcrumbEle = $$$$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Breadcrumb(),1);
		 breadcrumbsList.add($getText(breadcrumbEle));
		return breadcrumbsList;	
		}
	 
	 /** This function is verify breadcrumbs heirarchy */
	 public void verifyBreadcrumbsHeirarchy() throws Exception {
		 List<String> expected =  Arrays.asList("Home\n" + "Tools & Hardware\n" + "Power Tools\n" + "Drills & Drivers\n" + "Hammer Drills" );
		 List<String> actual = getBreadcrumbsHeirarchy();
		 Assert.assertEquals(expected,actual );	
		}
	 
	 /** This function is verify that 'Home' is displayed in breadcrumbs */
	 public void verifyHomepageDisplayInBreadcrumb() throws Exception {
		 Element breadcrumbEle = $$$$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Homepage_In_Breadcrumb_Path(),1);
		 String expected =  "Home";
		 String actual = $getText(breadcrumbEle);
		 Assert.assertEquals(expected,actual );	
		}
	 
	 /** return breadcrumbs list */
	 public ArrayList<String> getBreadcrumbsHeirarchyInMobile() throws Exception {
		 ArrayList<String> breadcrumbsList = new ArrayList<String>();
		 Element breadcrumbEle = $$$$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Mobile_Breadcrumb(),1);
		 breadcrumbsList.add($getText(breadcrumbEle));
		return breadcrumbsList;	
		}
	 
	 /** This function is verify that breadcrumbs is displayed */
	 public void displayMobileBreadcrumb() throws Exception {
			$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Mobile_Breadcrumb())), 20);
			Log.message("breadcrumb is displayed in mobile", true);	
		}
	 
	 /** This function is verify that breadcrumbs heirarchy */
	 public void verifyBreadcrumbsHeirarchyInMobile() throws Exception {
		 List<String> expected =  Arrays.asList("Home\n" + "Drills & Drivers");
		 List<String> actual = getBreadcrumbsHeirarchyInMobile();
		 Assert.assertEquals(expected,actual );	
		}
	 
	 /** This function is verify that last breadcrumbs is clickable */
	 public void verifyLastBreadcrumbClickable() throws Exception {
		 By lastbreadcrumbEle = $By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Last_Breadcrumb());
		 boolean clickable = testContext.getPageObjectManager().getPageObject(driver).isClickable(lastbreadcrumbEle);
		 if(clickable == true) {
			 Log.message("element is clickable", true);
			 }
		 else {
			 Log.message("element is not clickable", true);
		 }
	 }
	 
	 /** This function click on list view */
	public void clickListViewMobile() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button_Mobile())), 5);
		
	}
	
	/** This function is verify that primary product image is displayed */
	public void displayPrimaryProductImage() throws Exception {
		String primaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		Assert.assertTrue(primaryImage.contains("_a"));
	}
	
	/** click on grid view */
	public void clickGridViewButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View_Button()));
	}
	
	/** click on grid view button */
	public void clickGridViewButtonMobile() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View_Button_Mobile())), 3);
	}
	
	/** This function is verify that Product contains more than four color */
	public void hoverOnProductContainsMoreThanFourColor() throws Exception {
		String getPrimaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		String expectedImage = getPrimaryImage.replace("_a", "_b");
		List<Element> secondaryImageList = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image());
		List<WebElement> primaryImage = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()));
		List<Element> colorNumber = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Color_Number());
		for(int i=0; i<colorNumber.size(); i++) {
			
			String[] color = $getText(colorNumber.get(i)).split(" ");	
			Log.message("Color:- " + color[0], true);
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
	
	/** This function is verify that product card review is displayed */
	public void displayProductCardReview() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image())), 5);
		String getPrimaryImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		Log.message("Primary Image:- " + getPrimaryImage,  true);
		String expectedImage = getPrimaryImage.replace("_a", "_b");
		Log.message("Primary Expected Image:- " + expectedImage,  true);
		List<Element> secondaryImageList = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image());
		List<WebElement> primaryImage = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()));	
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Brand()));
		List<Element> productCardReview = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Brand());
		for(int i=0; i<productCardReview.size(); i++) {
			$mouseHover(primaryImage.get(0));
			String secondaryImage = $getAttributeValue(secondaryImageList.get(i), "src");
			Log.message("Secondary Image:- " + secondaryImage, true);
			Log.message("Expected Image:- " + expectedImage, true);
			Assert.assertTrue(expectedImage.contains("_b"));
			}
		}
	
	
	/** click on product card variant */
	public void clickProductCardVariant() throws Exception {
		String productImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		configuration.setProperty("previousSelectedProductImage", productImage);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Variant()));
	}
	
	/** This function is verify that 'selected product variant' is displayed */
	public void displaySelectedProductVariant() throws Exception {
		Log.message("Class:- " + $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Selected_Product_Variant()), "class"), true);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Selected_Product_Variant()));
	}
	
	/** This function is verify that 'selected product image' is displayed */
	public void displaySelectedProductImage() throws Exception {
		String previousSelectedProductImage = (java.lang.String) configuration.getProperty("previousSelectedProductImage");
		Log.message("previousSelectedProductImage:- " + previousSelectedProductImage, true);
		String selectedProductImage = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Primary_Image()), "src");
		Log.message("Image Value:- " + selectedProductImage, true);
		Assert.assertNotEquals(previousSelectedProductImage, selectedProductImage);
	}
	
	/** This function is verify that Number of colors are displayed */
	public void displayNumberOfColours() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Number_Of_Colour()));
	}
	
	/** This function is verify that number of variants are displayed */
	public void displayNumberOfColoursVariant() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Number_Of_Colour()));
	}
	
	/** This function is verify that product card is displayed */
	public void displayProductCard() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card()));
	}
	
	/** This function is verify that product brand is displayed */
	public void displayProductBrand() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Brand()));
	}
	
	/** click on product brand */
	public void clickProductBrand() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Brand()));
	}
	
	/** This function is verify that product brand is not clickable */
	public void notClickableProductBrand() throws Exception {
       try {
   		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Brand()));
   		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).display_PLP_Page();
       }catch(Exception e) {
    	   fail();
       }
	}
	
	/** This function is verify that Review stars are displayed */
	public void displayReviewStars() throws Exception {
		$display($(Loc.CLASSNAME, testContext.getPageObjectManager().getPLPLocatorPage().get_Review_Star()));
	}
	
	/** Sort option is not dispalyed */
	public void notDisplaySortOption() throws Exception {
		try {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
			$displayFindElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().getSortOption()));
			fail();
		}catch(Exception e) {
			
		}
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** Sort option is not displayed */
	public void displaySortOption() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getSortOption())), 5);
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** load more button is not displayed */
	public void notDisplayLoadMoreButton() {
		try {
			$displayFindElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Show_More_Button()));
			fail();
		}catch(Exception e) {
			
		}
	}
	
	/** click on load more button */
	public void clickLoadMoreButton() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Show_More_Button())), 4);
	}
	
	/** verify - load more button is displayed */
	public void displayLoadMoreButton() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Show_More_Button())), 4);
	}
	
	/** end pagination message is displayyed */
	public void displayEndPaginationMessage() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_End_Pagination_Message())), 4);
	}
	
	/** back to top button is displayed */
	public void displayBackToTopButton() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Back_To_Top_Button())), 4);
	}
	
	/** click on back to top button */
	public void clickBackToTopButton() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Back_To_Top_Button())), 4);
	}
	
	/**Sort option New Arrival is selected */
	public void displaySortOptionNewArrivalSelected() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_New_Arrival_Selected_Sort())), 4);
	}
	
	/** click on sort facet */
	public void clickSortFacet() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Sort_Facet())), 4);
	}
	
	/** click on color facet */
	public void clickColorFacet() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Color_Facet())), 4);
	}
	
	/** display on color facet */
	public void displayColorFacet() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Color_Facet())), 4);
	}
	
	/** verify color swatches options are displayed */
	public void displayColorSwatchedOptions() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getColorSwatchesOption())), 4);
	}
	
	/** display on color facet in Horizontal Bar*/
	public void displayColorOptionInFacetHorizontalBar() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getColorOptionInFacetHorizontalBar())), 4);
	}
	
	/** click on close button */
	public void clickCloseButtonFacetPopup() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().closeButtonFacetPopUp())), 4);
	}
	
	/** click on more filters */
	public void clickMoreFilters() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getMoreFilters())), 4);
	}
	
	/** select color option */
	public void selectColorSwatchedOptions() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getColorSwatchesOption())), 4);
		String[] getVarintValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getColorSwatchesOption()), "aria-label").split(" ");
		conf.setProperty("colorSwatchFacetOption", getVarintValue[1].trim());
	}
	
	/** click on sort and filters */
	public void clickOnSortAndFilters() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getSortAndFilters())), 4);
	}
	
	/** display sort and filters */
	public void displaySortAndFilters() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getSortAndFilters())), 4);
	}
	
	/** selected color name is displayed on facet */
	public void displaySelectedColorOnFacet() throws Exception {
		String color = (java.lang.String) conf.getProperty("colorSwatchFacetOption");
		Thread.sleep(3000);
		$displayFindElement(By.xpath("//div[text()='"+color+"']"));
	}
	
	/** selected color name is displayed on facet */
	public void displaySelectColorAppendInComma() throws Exception {
		Thread.sleep(3000);
		String colorFirst = (java.lang.String) conf.getProperty("colorSwatchFacetOption");
		String colorSecond = (java.lang.String) conf.getProperty("colorSwatchFacetAnotherOption");
		String text = $findElement(By.xpath("//span[@class='nl-filter-section__colour-label']")).getText();
		Log.message("Text:- " + text, true);
		Assert.assertEquals($getText(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getSelectedCommaText())), 5).trim(), "Selected:");
		$displayFindElement(By.xpath("//div[text() ='"+colorFirst + ", " +colorSecond+"']"));
	}
	
	/** verify selected colors result are showing on plp */
	public void displaySelectedColorsResultOnPLP() throws Exception {
		String color = (java.lang.String) conf.getProperty("colorSwatchFacetOption");
		String selectedColor = $getText($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		Assert.assertEquals(selectedColor, color);
	}
	
	/** select another color option */
	public void selectAnotherColorSwatchedOptions() throws Exception {
		Thread.sleep(2000);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getAnotherColorFacet())), 10);
		String[] getVarintValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getAnotherColorFacet()), "aria-label").split(" ");
		Log.message("Another Color:- " + getVarintValue[1].trim(), true);
		conf.setProperty("colorSwatchFacetAnotherOption", getVarintValue[1].trim());
	}
	
	/** verify the selected colour removed from the selected section */
	public void notDisplaySelectedColorOnFacet() throws Exception {
		String color = (java.lang.String) conf.getProperty("colorSwatchFacetOption");
		Thread.sleep(3000);
		try {
			$displayFindElement(By.xpath("//div[text()='"+color+"']"));
			fail();
		}catch(Exception e) {
			Log.message("Selected colour is removed from the selected section.", true);
		}
	}
	
	/** click on price details tab */
	public void clickPriceDetailsTab() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getPriceDetailTab()));
	}
	
	/** click on see 3 more */
	public void clickSeeThreeMore() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_See_More())), 10);
	}
	
	/** verify that delivery and pickup option is displayed */
	public void displayDeliveryAndPickUpOption() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Delivery_And_Pickup_Option()));
	}
	
	/** click on delivery and pickup option */
	public void clickDeliveryAndPickUpOption() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Delivery_And_Pickup_Option()));
	}
	
	/** verify that pay and pickup option is displayed */
	public void displayPayAndPickupOption() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Pay_Pickup_Option()));
	}
	
	/** verify that home delivery is displayed */
	public void displayHomeDeliveryOption() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Home_Delivery()));
	}
	
	/** verify that facet option delivery and pickup is in top five */
	public void devliveryPickupFacetOptionInTopFive() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Facet_Name()));
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Facet_Name()));
		for(int i=0; i<5; i++) {
			if(li.get(i).getText().contains("Delivery")) {
				Log.message("i:- " + i, true);
				j=i;
			}
			Log.message("J:- " + j, true);
			Assert.assertTrue(j<5);
		}
	}
	
	/** verify that Brand option is displayed */
	public void displayBrandFacetOption() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Facet()));
	}
	
	/** click on brand option */
	public void clickOnBrandOption() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Facet()));
	}
	
	/** verify that brand facet values are displayed with number of result */
	public void displayBrandFacetValuesWithNumberOfResult() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Name()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Result_Value()));
	}
	
	/** click on brand show more */
	public void clickBrandShowMore() throws Exception {
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Facet_Item()));
		int size = li.size();
		conf.setProperty("brandItemSize", Integer.toString(size));
		String showMoreText[] = $getText($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Show_More_Text())).split(" ");
		conf.setProperty("seeMoreBrandItem", showMoreText[1].trim());
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Show_More()));
	}
	
	/** verify that remaining items are displayed on show more */
	public void displayRemainingItemsAreDisplayedOnShowMore() throws Exception {
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Facet_Item()));
		int expectedSize = li.size();
		String brandItemSize = (java.lang.String) conf.getProperty("brandItemSize");
		String seeMoreBrandItem = (java.lang.String) conf.getProperty("seeMoreBrandItem");
		int brandItemSizeActual = Integer.parseInt(brandItemSize);
		int seeMoreBrandItemActual = Integer.parseInt(seeMoreBrandItem);
		Assert.assertEquals(expectedSize, brandItemSizeActual + seeMoreBrandItemActual);
	}
	
	/** click on single check box */
	public void clickOnSingleCheckbox() throws Exception {
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Name()));
		List<WebElement> li_checkbox = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Checkbox()));
		conf.setProperty("brandItemName", li.get(1).getText());
		li_checkbox.get(1).click();
	}
	
	/** verify selected Single Brand result are showing on plp */
	public void displaySelectedSingleBrandResultOnPLP() throws Exception {
		String brand = (java.lang.String) conf.getProperty("brandItemName");
		String selectedBrand = $getText($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		Log.message("selectedBrand:- " + selectedBrand, true);
		Log.message("brand:- " + brand, true);
		Assert.assertTrue(brand.toLowerCase().contains(selectedBrand.toLowerCase()));
	}
	
	/** verify that indication of success is displayed for Single Brand Item */
	public void displayIndicationSuccessForSingleBrand() throws Exception {
		List<WebElement> li_checkbox = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Checkbox()));
		String colorValue = li_checkbox.get(1).getCssValue("border-color"); 
		Log.message("color:- " +  li_checkbox.get(1).getCssValue("border-color"), true);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyBorderColorCode("#0a6e3b", colorValue);
	}
	
	/** select multiple brands from the facet value */
	public void selecteMultipleBrands() throws Exception {
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Name()));
		List<WebElement> li_checkbox = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Checkbox()));
		conf.setProperty("brandItemNameOne", li.get(1).getText());
		conf.setProperty("brandItemNameTwo", li.get(2).getText());
		li_checkbox.get(1).click();
		li_checkbox.get(2).click();
	}
	
	/** verify that indication of success is displayed for Multiple Brand Item */
	public void displayIndicationSuccessForMultipleBrand() throws Exception {
		List<WebElement> li_checkbox = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Checkbox()));
		String colorValueOne = li_checkbox.get(1).getCssValue("border-color");
		String colorValueTwo = li_checkbox.get(2).getCssValue("border-color");
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyBorderColorCode("#0a6e3b", colorValueOne);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyBorderColorCode("#0a6e3b", colorValueTwo);
	}
	
	/** verify selected multiple Brand result are showing on plp */
	public void displaySelectedMultipleBrandResultOnPLP() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		String brandOne = (java.lang.String) conf.getProperty("brandItemNameOne");
		String brandTwo = (java.lang.String) conf.getProperty("brandItemNameTwo");
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		Log.message("Size:- " + li.size(), true);
		String selectedBrandOne = li.get(0).getText().trim();
		String selectedBrandTwo = li.get(1).getText().trim();
		Log.message("selectedBrandOne:- " + selectedBrandOne, true);
		Log.message("brandOne:- " + brandOne, true);
		Log.message("selectedBrandTwo:- " + selectedBrandTwo, true);
		Log.message("brandTwo:- " + brandTwo, true);
		Assert.assertTrue(brandOne.toLowerCase().contains(selectedBrandOne.toLowerCase()));
		Assert.assertTrue(brandTwo.toLowerCase().contains(selectedBrandTwo.toLowerCase()));
	}
	
	/** Deselect brand from selection */
	public void deselectBrandFromSelection() throws Exception {
		Thread.sleep(5000);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Checkbox())), 10);
		List<WebElement> li_checkbox = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Checkbox()));
		Log.message("li_checkbox:- " + li_checkbox.size(), true);
		li_checkbox.get(1).click();
		//li_checkbox.get(2).click();
	}
	
	/** verify that products are refreshed */
	public void verifyProductRefresh() throws Exception {
		List<WebElement> li_checkbox = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Checkbox()));
		String colorValueOne = li_checkbox.get(1).getCssValue("border-color");
		String colorValueTwo = li_checkbox.get(2).getCssValue("border-color");
		Log.message("ColorValueOne:- " + colorValueOne, true);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyBorderColorCode("#737373", colorValueOne);
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyColorCode("#FFF", colorValueTwo);
	}
	
	/** click on clear all button facet */
	public void clickClearAllButtonFacet() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Clear_All_Button_Facet()));
	}
	
	/** Item remove */
	public void verifyItemRemoved() throws Exception {
		try {
			Thread.sleep(3000);
			$displayFindElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Brand_Selected_Item_Facet()));
			fail();
		}catch(Exception e) {
		Log.message("Item is successfully removed", true);
		}
	}
	
	/** verify that ratings option is displayed */
	public void displayRatingsFacetOption() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Rating_Option_Facet()));
	}
	
	/** click on ratings option */
	public void clickRatingsFacetOption() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Rating_Option_Facet()));
	}
	
	/** click on ratings value */
	public void selectRatingsValue() throws Exception {
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Rating_Value_Facet()));
		List<WebElement> ratingValueLabel = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Rating_Value_Label()));
		conf.setProperty("ratingValueLabel", ratingValueLabel.get(1).getText());
		li.get(1).click();
	}
	
	/** verify selected ratings result are showing on plp */
	public void displaySelectedRatingResultOnPLP() throws Exception {
		$display(($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults())));
		String ratingResults = (java.lang.String) conf.getProperty("ratingValueLabel");
		String actualRatingResutls = $getText($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		Assert.assertEquals(actualRatingResutls, ratingResults);
	}
	
	/** verify that ratings result is displayed */
	public void displayRatingValue() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Rating_Value_Facet()));
	}
	
	/** ratings pill are removed */
	public void verifyRatingPillsRemoved() throws Exception {
		try {
			Thread.sleep(1000);
			$displayFindElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
			fail();
		}catch(Exception e) {
			Log.message("Removed Successfully", true);
		}
	}
	
	/** click on rating plus icon */
	public void clickRatingPlusIcon() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Rating_Plus_Minus_Icon()));
	}
	
	/** click on rating minus icon */
	public void clickRatingMinusIcon() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Rating_Plus_Minus_Icon()));
	}
	
	/** rating filter is displayed */
	public void displayRatingFilter() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Rating_Value_Label()));
	}
	
	/** rating filter is not displayed */
	public void notDisplayRatingFilter() throws Exception {
		try {
			Thread.sleep(1000);
		$displayFindElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Rating_Value_Label()));
		fail();
		}catch(Exception e) {
			Log.message("Rating Filer is not Displayed", true);
		}
	}
	
	/** rating section is collapsed */
	public void collapsedRatingSection() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Rating_Section_Hide()));
	}

	/** Facet Price is displayed */
	public void displayPriceFacet() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Price_Facet()));
	}
	
	/** click on price plus Icon */
	public void clickPricePlusIcon() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Price_Plus_Minus_Icon()));
	}
	
	/** verify that user is able to enter minimum price */
	public void enterMinimumPriceFacetValue() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Minimum_Price()), FileReaderManager.getInstance().getDataReader().get_Minimum_Price_Data());
	}

	/** verify that user is able to enter maximum price */
	public void enterMaximumPriceFacetValue() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Maximum_Price()), FileReaderManager.getInstance().getDataReader().get_Maximum_Price_Data());
		$findElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Maximum_Price())).sendKeys(Keys.TAB);
		
	}
	
	/** verify selected Single Brand result are showing on plp */
	public void displaySelectedSinglePriceResultOnPLP() throws Exception {
		Thread.sleep(3000);
		$display($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		String priceResult = $getText($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		Log.message("priceResult:- " + priceResult, true);
		Assert.assertTrue(priceResult.contains(FileReaderManager.getInstance().getDataReader().get_Minimum_Price_Data()));
		Assert.assertTrue(priceResult.contains(FileReaderManager.getInstance().getDataReader().get_Maximum_Price_Data()));
	}
	
	/** verify that indication of success is displayed for Single Brand Item */
	public void verifyPriceFilterOptionSelected() throws Exception {
		List<WebElement> li_checkbox = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Price_Checkbox_Option_Facet()));
		String colorValue = li_checkbox.get(0).getCssValue("border-color"); 
		Log.message("color:- " +  li_checkbox.get(0).getCssValue("border-color"), true);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyBorderColorCode("#0a6e3b", colorValue);
	}
	
	/** click on view button */
	public void clickViewButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_View_Button()));
	}
	
	/** click on price filter checkbox */
	public void clickPriceFilterCheckbox() throws Exception {
		String getPriceOptionText = $getText($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Price_Item_Text()));
		conf.setProperty("getPriceOptionText", getPriceOptionText);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Price_Checkbox_Option_Facet()));
		Thread.sleep(2000);
	}
	
	/** verify selected price range are showing on plp */
	public void displaySelectedPriceRangeResultOnPLP() throws Exception {
		$display(($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults())));
		String ratingResults = (java.lang.String) conf.getProperty("getPriceOptionText");
		String actualRatingResutls = $getText($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		Log.message("ratingResults:- " + ratingResults, true);
		Log.message("actualRatingResutls:- " + actualRatingResutls, true);
		Assert.assertTrue(ratingResults.toLowerCase().contains(actualRatingResutls.toLowerCase()));
	}
	
	/** enter minimum price more than maximum */
	public void enterMinimumPriceMoreThanMaximum() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Minimum_Price()), FileReaderManager.getInstance().getDataReader().get_Minimum_Price_More_Than_Maximum());
	}
	
	/** error message is displayed when Minimum price is more than maximum, */
	public void displayErrorMessageMinimumPriceMoreThanMaximum() throws Exception {
		$display(($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().get_Error_Message_Min_Price_More_Than_Max())));
	}
	
	/** enter minimum price in the range */
	public void enterMinimumPriceInTheRange() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Minimum_Price()), FileReaderManager.getInstance().getDataReader().get_Minimum_Price_In_Range());
		$findElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Maximum_Price())).sendKeys(Keys.TAB);
	}
	
	/** verify pill is added above the range and more */
	public void verifyAddedAboveRangeAndMore() throws Exception {
		String actualResutls = $getText($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		String expectedResults = "$" + FileReaderManager.getInstance().getDataReader().get_Minimum_Price_In_Range() + "+";
		Log.message("Actual Results :- " + actualResutls, true);
		Log.message("Expected Results :- " + expectedResults, true);
		Assert.assertEquals(expectedResults, actualResutls);
	}
	
	/** enter minimum price in the below range */
	public void enterMinimumPriceInTheBelowRange() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Minimum_Price()), FileReaderManager.getInstance().getDataReader().get_Minimum_Price_Below_Range());
		$findElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Maximum_Price())).sendKeys(Keys.TAB);
	}
	
	/** enter maximum price in below range */
	public void enterMaximumPriceInBelowRange() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Maximum_Price()), FileReaderManager.getInstance().getDataReader().get_Maximum_Price_Below_Range());
		$findElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Maximum_Price())).sendKeys(Keys.TAB);
	}
	
	/** verify the result as '0-123''*/
	public void verifyTheResultAs0Between123() throws Exception {
		String actualResutls = $getText($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		String expectedResults = "$" + FileReaderManager.getInstance().getDataReader().get_Minimum_Price_Below_Range() + "-" + "$" + FileReaderManager.getInstance().getDataReader().get_Maximum_Price_Below_Range();
		Log.message("Actual Results :- " + actualResutls, true);
		Log.message("Expected Results :- " + expectedResults, true);
		Assert.assertEquals(expectedResults, actualResutls);
	}
	
	/** verify facet value is displayed through rating stars */
	public void verifyFacetValueDisplayedThroughRatingStars() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Rating_Stars_Value()));
		String[] ratingValue = $getText($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Rating_Stars_Value())).split(" ");
		List<WebElement> ratingIcon = PageObject.getDriver().findElements((By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Rating_Stars_Icon())));
		int ratingIconSize = ratingIcon.size();
		Log.message("ratingValue[0] " + ratingValue[0], true);
		Log.message("ratingIconSize " + ratingIconSize, true);
		Assert.assertEquals(Integer.parseInt(ratingValue[0]), ratingIconSize);
	}
	
	/** click on clear all (pill)*/
	public void clickClearAllPill() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Clear_All()));
	}
	
	/** verify that selected filters are persistant */
	public void verifySelectedFiltersArePersistant() throws Exception {
		String url = (java.lang.String) conf.getProperty("currentFilterUrl");
		Assert.assertEquals(url, PageObject.getDriver().getCurrentUrl());
	}
	
	/** verify Availability Facet CTA is displayed */
	public void displayAvailabilityFacetCTA() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Facet()));
	}
	
	/** click on Availability Facet CTA  */
	public void clickOnAvailabilityFacetCTA() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Facet()));
	}
	
	/** verify Availability Accordion is displayed */
	public void displayAvailabilityAccordion() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Accordion()));
	}
	
	/** verify Availability Facet Accordion is displayed */
	public void displayAvailabilityFacetAccordion() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Filters_Title()), 10);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Accordion()));
	}
	
	/** click on Availability Facet Accordion */
	public void clickOnAvailabilityFacetAccordion() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Accordion()));
	}
	
	/** verify Facet values are displayed */
	public void displayFacetValues() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Filters_Title()), 10);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Facet_Values()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Results_Count()));
	}
	
	/** verify Online only Facet value is displayed */
	public void displayOnlineOnlyFacetValue() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Online_Only_Facet_Value()));
	}
	
	/** verify Instore only Facet value is displayed */
	public void displayInstoreOnlyFacetValue() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_InStore_Only_Facet_Value()));
	}
	
	/** verify Facet bar is displayed */
	public void displayFacetBar() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Facet_Bar()));
	}
	
	/** check Online only Facet value */
	public void clickOnlineCheckbox() throws Exception {
			List<WebElement> values = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Facet_Name()));
			List<WebElement> resultCount = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Results_Count()));		
			List<WebElement> valuesCheckbox = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Facet_Value_Checkbox()));
			conf.setProperty("availabilityFacetName", values.get(0).getText());
			conf.setProperty("availabilityFacetResultCount", resultCount.get(0).getText().replace("(", "").replace(")", ""));
			valuesCheckbox.get(0).click();
		}
	
	/** click on view button*/
	public void clickOnViewButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_View_Button()));
	}
	
	/** verify products are updated with no of results for facet value filter*/
	public void verifyProductListUpdated() throws Exception {
		List<WebElement> noOfProductResults = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card_Results()));
		int actualResult = noOfProductResults.size();
		String availabilityFacetResultCount = (java.lang.String) conf.getProperty("availabilityFacetResultCount");
		int expectedResult = Integer.parseInt(availabilityFacetResultCount);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	/** verify Online only Pill is displayed */
	public void verifyAvailabilityOnlineOnlyFacetValueReflectedInPill() throws Exception {
		$display(($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults())));
		String availabilityFacetName = (java.lang.String) conf.getProperty("availabilityFacetName");
		String selectedValueInPill = $getText($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		Assert.assertTrue(availabilityFacetName.toLowerCase().contains(selectedValueInPill.toLowerCase()));
	}
	
	/** check Online only and Instore only Facet values */
	public void clickOnlineAndInstoreCheckbox() throws Exception {
			List<WebElement> values = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Facet_Name()));
			List<WebElement> resultCount = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Results_Count()));		
			List<WebElement> valuesCheckbox = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Facet_Value_Checkbox()));
			conf.setProperty("onlineOnlyName", values.get(0).getText());
			conf.setProperty("onlineOnlyResultCount", resultCount.get(0).getText().replace("(", "").replace(")", ""));
			valuesCheckbox.get(0).click();
			Thread.sleep(2000);
			conf.setProperty("instoreOnlyName", values.get(1).getText());
			conf.setProperty("instoreOnlyResultCount", resultCount.get(1).getText().replace("(", "").replace(")", ""));
			valuesCheckbox.get(1).click();
		}
	
	/** verify products are updated with no of results for facet value filter*/
	public void verifyProductListUpdatedForMultipleCheck() throws Exception {
		PageObject.getDriver().navigate().refresh();
		List<WebElement> noOfProductResults = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card_Results()));
		int actualResult = noOfProductResults.size();
		String onlineOnlyResultCount = (java.lang.String) conf.getProperty("onlineOnlyResultCount");
		String instoreOnlyResultCount = (java.lang.String) conf.getProperty("instoreOnlyResultCount");
		int expectedResult1 = Integer.parseInt(onlineOnlyResultCount);
		int expectedResult2 = Integer.parseInt(instoreOnlyResultCount);
		Assert.assertEquals(expectedResult1 + expectedResult2, actualResult);
	}
	
	/** verify Online only and Instore  Pills are displayed */
	public void verifyBothAvailabilityFacetValuesReflectedInPill() throws Exception {
		$display(($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults())));
		String onlineOnlyName = (java.lang.String) conf.getProperty("onlineOnlyName");
		String instoreOnlyName = (java.lang.String) conf.getProperty("instoreOnlyName");
		List<WebElement>  pillValues = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		String Pill1 = pillValues.get(0).getText();
		String Pill2 = pillValues.get(1).getText();
		Assert.assertTrue(onlineOnlyName.toLowerCase().contains(Pill1.toLowerCase()));
		Assert.assertTrue(instoreOnlyName.toLowerCase().contains(Pill2.toLowerCase()));
	}
	
	/** uncheck Instore only Facet value */
	public void unCheckInstoreCheckbox() throws Exception {
			List<WebElement> values = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Facet_Name()));		
			List<WebElement> resultCount = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Results_Count()));		
			List<WebElement> valuesCheckbox = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Availability_Facet_Value_Checkbox()));
			conf.setProperty("availabilityFacetResultCount", resultCount.get(0).getText().replace("(", "").replace(")", ""));
			conf.setProperty("instoreOnlyFacetName", values.get(1).getText());
			valuesCheckbox.get(1).click();
		}
	
	/** verify instore only facet name is not displayed in pill bar */
	public void notDisplayInstoreOnlyInPillBar() throws Exception {
		try {		
		List<WebElement>  pillValues = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		String Pill2 = pillValues.get(1).getText();
		$displayFindElement(By.name(Pill2));
		fail();
		}catch(Exception e) {
			Log.message("Instore Only is not Displayed in Pill bar", true);
		}
}

	/** select delivery and pick up options */
	public void selectDeliveryAndPickUpOptions() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Checkbox_Deleviery_And_PickUp_Options()));
		String optionValue = $getText($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Checkbox_Deleviery_And_PickUp_Options()));
		conf.setProperty("optionDelviveyCheckbox", optionValue);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Checkbox_Deleviery_And_PickUp_Options()));
	}
	
	/** select delivery and pick up options */
	public void selectMoreThanDeliveryAndPickUpOptions() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Checkbox_Deleviery_And_PickUp_Options()));
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Checkbox_Deleviery_And_PickUp_Options()));
		String optionValue = $getText($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Checkbox_Deleviery_And_PickUp_Options()));
		conf.setProperty("optionDelviveyCheckbox", optionValue);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Checkbox_Deleviery_And_PickUp_Options()));
		li.get(1).click();
	}
	
	/** verify checkmark is displayed against checkbox */
	public void verifyDisplayCheckmarkedAgainstCheckBox() throws Exception {
		List<WebElement> li_checkbox = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Delivery_PickUp_Options()));
		String colorValue = li_checkbox.get(0).getCssValue("border-color"); 
		Log.message("color:- " +  li_checkbox.get(0).getCssValue("border-color"), true);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).verifyBorderColorCode("#0a6e3b", colorValue);
	}
	
	/** verify selected Delivery result are showing on plp */
	public void displaySelectedDeliveryResultOnPLP() throws Exception {
		$display(($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults())));
		String selectDeliveryCheckbox = (java.lang.String) conf.getProperty("optionDelviveyCheckbox");
		String actualRatingResutls = $getText($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
		Log.message("selectDeliveryCheckbox:-  " + selectDeliveryCheckbox, true);
		Log.message("actualRatingResutls:-  " + actualRatingResutls, true);
		Assert.assertTrue(selectDeliveryCheckbox.contains(actualRatingResutls));
	}
	
	/** verify selected Delivery result are showing on plp */
	public void notDisplaySelectedDeliveryResultOnPillBar() throws Exception {
		try {
			PageObject.getDriver().findElement(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().getFacetResults()));
			fail();
		}catch(Exception e) {
			Log.message("pill bar is removed", true);
		}
	}
	
	/** verify horizontal bar is displayed */
	public void displayHorizontalFacetPanelBar() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Horizontal_Panel_Bar()));
	}
	
	/** verify all categories drop down is displayed */
	public void displayAllCategoriesDropDown() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_All_Categories_Drop_Down()));
	}
	
	/** verify five specific buttons are displayed include  sort facet by default as first button */
	public void displayFiveSpecificButtonsWithSortFacet() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Facet_Specific_Buttons()));
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Facet_Specific_Buttons()));
		Assert.assertTrue(li.size() >= 5);
		Log.message("More Text1:- " + li.get(0).getText(), true);
		Assert.assertTrue(li.get(0).getText().contains("Sort"));
	}
	
	/** display more filters */
	public void displayMoreFiltersAtVeryEnd() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().getMoreFilters())), 4);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Facet_Specific_Buttons()));
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Facet_Specific_Buttons()));
		Assert.assertTrue(li.size() >= 5);
		Log.message("More Text:- " + li.get(li.size()-2).getText(), true);
		Log.message("Size:- " + (li.size()-2), true);
		Assert.assertTrue(li.get((li.size()-2)).getText().contains("More"));
	}
	
	/** click on facet on horizontal facet panel */
	public void clickOnFacetOnHorizontalFacetpanel() throws Exception {
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getPLPLocatorPage().get_Facet_Specific_Buttons()));
		configuration.setProperty("facetButtonNameOnPanel", li.get(0).getText());
		li.get(0).click();
	}
	
	/** facet panel is displayed */
	public void displayFacetPanel() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Facet_Title()));
	}
	
	/** verify corresponding facet panel is expand */
	public void verifyExpandCorrespondingFacetPanel() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Sort_Option_Facet_Panel()));
	}
}	

