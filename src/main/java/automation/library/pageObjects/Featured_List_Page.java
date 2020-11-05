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
	
	/** click on learn more */
	public void clickLearnMoreLinkFirst() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getLearnMoreLinkFirst())), 5);
	}
	
    /** verify learn more link is navigate on same tab  and defined destination url */
	public void verifyLearnMoreLinkNavigateOnDefinedUrl() throws Exception {
		String expectedUrl = PageObject.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl, FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Link_One());
	}
	
	
	
}
	
	
	
	
	
	
		



