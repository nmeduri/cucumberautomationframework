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
		String selectedColor = $getText($(Loc.XPATH,  testContext.getPageObjectManager().getPLPLocatorPage().getColorResults()));
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
}	
