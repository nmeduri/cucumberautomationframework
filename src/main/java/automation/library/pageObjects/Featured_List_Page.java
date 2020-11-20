package automation.library.pageObjects;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.ui.ExpectedCondition;
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
import cucumber.api.java8.Pa;
import edu.emory.mathcs.backport.java.util.Collections;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;

/**
 * This file contains the functions of Footer Page
 * 
 */

public class Featured_List_Page extends PageObject {

	TestContext testContext;
	List<Float> productPrice = new ArrayList<Float>();
	ArrayList<Integer> rating = new ArrayList<Integer>();
	List<Float> price = new ArrayList<Float>();

	public Featured_List_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to Featured List Page */
	public void navigateTo_Featured_List_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getDataReader().get_Featured_List_Url());

	}
	
	/** This function navigate to Featured List Page */
	public void navigateTo_Featured_List_Page_More_Than_Four_Product() throws Exception {

		driver.get(FileReaderManager.getInstance().getDataReader().get_Featured_List_More_Than_Four_Product_Url());

	}
	
	/** click on learn more */
	public void clickLearnMoreLinkFirst() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getLearnMoreLinkFirst())), 5);
	}
	
    /** verify learn more link is navigate on same tab  and defined destination url */
	public void verifyLearnMoreLinkNavigateOnDefinedUrl() throws Exception {
		String expectedUrl = PageObject.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl, FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Link_One());
	}
	
	/** verify featured list component is displayed */
	public void dispalyFeaturedListComponent() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getFeaturedListComponent())), 10);
	}
	
	/** verify four products are displayed in carousel view */
	public void verifyFourProductsAreDisplayedInCarouselView() throws Exception {
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getFeaturedListProduct()));
		String getAttribute = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getFeaturedListProduct()), "data-analytics");
		
		Log.message("Attribute :- " + getAttribute, true);
		for(int i=0; i<li.size(); i++) {
			String positionValue = li.get(i).getAttribute("data-analytics");
			Assert.assertTrue(!positionValue.contains("1.5"));
		}
	}
	
	/** verify Chevron previous button is displayed */
	public void displayChevronPreviousButton() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getChevronPreviousButton())), 5);
	}
	
	/** verify Chevron next button is displayed */
	public void displayChevronNextButton() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getChevronNextButton())), 5);
	}
	
	/** click on previous chevron */
	public void clickOnPreviousChevron() throws Exception {
		Thread.sleep(2000);
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getChevronPreviousButton())), 5);
	}
	
	/** click on next chevron */
	public void clickOnNextChevron() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getActiveSetOfProducts())), 5);
		String getIndexFalue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getActiveSetOfProducts()), "data-slick-index");
		String getclassFalue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getActiveSetOfProducts()), "class");
		Log.message("Before Index :- " + getIndexFalue, true);
		Log.message("Before class :- " + getclassFalue, true);
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getChevronNextButton())), 5);
	}
	
	/** verify next set of cards are displayed */
	public void verifyNextSetOfCardsDisplayed() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getActiveSetOfProducts())), 5);
		String className = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductOneFromSet()), "class");
		Log.message("Class:- " + className, true);
		Assert.assertTrue(!className.contains("active"));
		
	}
	
	/** verify associated pagination dots */
	public void verifyAssociatedPaginationDots() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getPaginationDotOne())), 5);
		String className = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getPaginationDotOne()), "class");
		Log.message("Class:- " + className, true);
		Assert.assertTrue(className.contains("active"));
	}
	
	/** verify associated pagination dots */
	public void verifyAssociatedPaginationDotsTwo() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getPaginationDotTwo())), 5);
		String className = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getPaginationDotTwo()), "class");
		Log.message("Class:- " + className, true);
		Assert.assertTrue(className.contains("active"));
	}
	
	/** verify previous set of cards are displayed */
	public void verifyPreviousSetOfCardsDisplayed() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getActiveSetOfProducts())), 5);
		String className = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductOneFromSet()), "class");
		Log.message("Class:- " + className, true);
		Assert.assertTrue(className.contains("active"));
		
	}
	
	/** verify max number of pagination dots on components */
	public void verifyMaxNumberOfPaginatinDotsOnComponents() throws Exception {
		Assert.assertEquals(PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getPaginationDot())).size(), 2);
	}
	
	/** verify user able to see last page with products */
	public void verifyUserAbleToSeeLastPageWithProducts() throws Exception {
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getFeaturedListProduct()));
		for(int i=0; i<li.size(); i++) {
			$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getChevronNextButton())), 5);
			String className = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductOneFromSet()), "class");
			Log.message("Class:- " + className, true);
            if(className.contains("active")) {
            	break;
            }
		}
	}
	
	/** click on one of dot */
	public void clickOnOneOfDots() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getPaginationDotTwo())), 5);
	}
	
	/** verify the dot is highlighted upon click */
	public void verifyTheDotIsHighlightedUponClick() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getPaginationDotTwo())), 5);
		String className = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getPaginationDotTwo()), "class");
		Log.message("Class:- " + className, true);
		Assert.assertTrue(className.contains("active"));
	}
	
	/** verify pagination dots are not displayed when only four products are available */
	public void notDisplayPaginationDots() throws Exception {
		try {
			$displayFindElement(By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getPaginationDotOne()));
			fail();
		}catch(Exception e) {
			Log.message("Pagination dots are not displayed when only 4 products are displayed", true);
		}
	}
	
	/** verify chevron are not displayed when only four products are available */
	public void notDisplayChevron() throws Exception {
		try {
			$displayFindElement(By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getChevronPreviousButton()));
			$displayFindElement(By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getChevronNextButton()));
			fail();
		}catch(Exception e) {
			Log.message("Chevron are not displayed when only 4 products are displayed", true);
		}
	}
	
	/** verify featured list title is displayed */
	public void displayFeaturedListTitle() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getFeaturedListTitle())), 5);
	}
	
	/** verify product card is displayed */
	public void displayProductCard() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getFeaturedListProduct())), 5);
	}
	
	/** verify product image is displayed */
	public void displayImageCard() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductImage())), 5);
		String src = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductImage()), "src");
		Assert.assertTrue(src.contains("http"));
	}
	
	/** verify product card title is displayed */
	public void displayProductCardTitle() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductCardTitle())), 5);
	}
	
	/** verify product card description is displayed */
	public void displayProductCardDescription() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductCardDescription())), 5);
	}
	
	/** verify learn more is displayed on product card */
	public void displayLearnMoreProductCard() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getLearnMoreProductCard())), 5);
	}
	
	/** verify four products are displayed by default in carousel view */
	public void verifyFourProductsAreDisplayedByDefaultInCarouselView() throws Exception {
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getActiveSetOfProducts()));
		
		Assert.assertEquals(li.size(), 4);
	}
	/** verify display of Key Line for all Images */
	public void verifyDisplayOfKeyLineForAllTheImages() throws Exception {
		$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getFeatureListPageLocator().getKeyLineOfImages());
		
		
		//Assert.assertEquals(li.size(), 4);
	}
	
}
	
	
	
	
	
	
		



