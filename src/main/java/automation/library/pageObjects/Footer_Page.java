package automation.library.pageObjects;

import static org.junit.Assert.assertFalse;
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
import cucumber.api.java8.Pa;
import edu.emory.mathcs.backport.java.util.Collections;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;

/**
 * This file contains the functions of Footer Page
 * 
 */

public class Footer_Page extends PageObject {

	TestContext testContext;
	List<Float> productPrice = new ArrayList<Float>();
	ArrayList<Integer> rating = new ArrayList<Integer>();
	List<Float> price = new ArrayList<Float>();

	public Footer_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function is verify that Legal Disclaimer is displayed */
	public void displayLegalDisclaimer() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Disclaimer()));
	}
	
	/** This function click on view more */
	public void clickViewMore() throws Exception {
		$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_View_More()));
	}
	
	/** This function is verify that Reset of Legal Disclaimer is displayed */
	public void displayRestOfLegalDisclaimer() throws Exception {
		String sText = $getText($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Disclaimer()));
		Log.message("Text:- " + sText, true);
		assertFalse(sText.contains("..."));
	}
	
	/** This function is verify that View Less is displayed */
	public void displayViewLess() throws Exception {
		$display($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_View_Less()));
	}
	
	/** This function is verify that View More is not displayed */
	public void notDisplayViewMore() throws Exception {
		try {
			$display($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_View_More()));
			fail();
		}catch(Exception e) {
			
		}
	}
	
	public void displayThreeLinesLegalDisclaimer() throws Exception {
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Disclaimer_Row()), "height");
		Assert.assertTrue(value.contains("45"));
	}
	
	public void displayEditableTextLegal() throws Exception {
		$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tire_Logo()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Legal())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal()), "text-decoration");
		String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal()), "href");
		Log.message("value"+ href, true);
	    Assert.assertTrue(value.contains("underline"));
	    Assert.assertFalse(href.equals(""));
	}
	
	public void displayEditableTextTermsAndConditions() throws Exception {
		$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tire_Logo()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions()), "text-decoration");
		Log.message("Value:- " + value, true);
	    Assert.assertTrue(value.contains("underline"));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions()), "href");
	    Assert.assertFalse(href.equals(""));
	}
	
	public void displayEditableTextPrivacyAndPolicy() throws Exception {
		$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tire_Logo()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy()), "text-decoration");
		Log.message("Value:- " + value, true);
	    Assert.assertTrue(value.contains("underline"));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy()), "href");
	    Assert.assertFalse(href.equals(""));
	}

	
	public void displayEditableTextSiteMap() throws Exception {
		$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tire_Logo()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Site_Map())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Site_Map()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Site_Map()), "text-decoration");
		Log.message("Value:- " + value, true);
	    Assert.assertTrue(value.contains("underline"));
	}
	
	public void displayEditableTextAccessibility() throws Exception {
		$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tire_Logo()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility()), "text-decoration");
		Log.message("Value:- " + value, true);
	    Assert.assertTrue(value.contains("underline"));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility()), "href");
	    Assert.assertFalse(href.equals(""));
	}
	
	public void displayEditableViewMore() throws Exception {
		$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tire_Logo()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.className(testContext.getPageObjectManager().getFooterPageLocator().get_View_More())));
		$display($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_View_More()));
		String value = $getCSSValue($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_View_More()), "text-decoration");
		Log.message("Value:- " + value, true);
	    Assert.assertTrue(value.contains("underline"));
	}
	
	public void displayEditableViewLess() throws Exception {
		$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tire_Logo()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.className(testContext.getPageObjectManager().getFooterPageLocator().get_View_Less())));
		$display($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_View_Less()));
		String value = $getCSSValue($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_View_Less()), "text-decoration");
		Log.message("Value:- " + value, true);
	    Assert.assertTrue(value.contains("underline"));
	}
	
	public void displayCopyRight() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Copy_Right_Text()));
	}

}
