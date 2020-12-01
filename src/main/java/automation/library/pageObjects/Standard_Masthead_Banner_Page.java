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

public class Standard_Masthead_Banner_Page extends PageObject {

	TestContext testContext;
	List<Float> productPrice = new ArrayList<Float>();
	ArrayList<Integer> rating = new ArrayList<Integer>();
	List<Float> price = new ArrayList<Float>();
    static int j=0;
	public Standard_Masthead_Banner_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function navigate to Masthead Banner Page */
	public void navigateTo_Masthead_Banner_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getDataReader().get_Masthead_Banner_Url());

	}
	
	/** This function navigate to Masthead Banner Page for FR */
	public void navigateTo_Masthead_Banner_Fr_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getDataReader().get_Masthead_Banner__Fr_Url());

	}
	
	/** verify that masthead banner is displayed */
	public void displayMastheadBanner() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Masthead_Banner()));
	}
	
	/** verify background color is displayed for banner */
	public void displayBackgroundColorForBanner() throws Exception {
		String getAttributeValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Masthead_Banner()), "style");
		Assert.assertTrue(getAttributeValue.contains("background-color"));
	}
	
	/** verify that banner title is displayed */
	public void displayBannerTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Banner_Title()));
	}
	
	/** verify that banner description is displayed */
	public void displayBannerDescription() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Masthead_Banner_Description()));
	}
}	
