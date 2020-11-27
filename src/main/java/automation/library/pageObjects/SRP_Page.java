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

public class SRP_Page extends PageObject {

	TestContext testContext;
	List<Float> productPrice = new ArrayList<Float>();
	ArrayList<Integer> rating = new ArrayList<Integer>();
	List<Float> price = new ArrayList<Float>();
    static int j=0;
	public SRP_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function navigate to SRP Page */
	public void navigateTo_SRP_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getDataReader().get_SRP_Url());

	}
	
}	
