package automation.library.selenium.core;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.library.common.ExtensionFilter;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static automation.library.enums.Locator.getLocator;
import static org.junit.Assert.fail;
import static org.testng.Assert.fail;

/**
 * This class call the function from Element class
 */

public class PageObject {

	protected static WebDriver driver;
	private WebDriverWait wait;
	private Property property = new Property();
	public static List<String> value;
	public static PropertiesConfiguration configuration = new PropertiesConfiguration();

	public PageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, getWaitDuration());
	}

	public static WebDriver getDriver() {
		Log.debug("obtaining the driver object for current thread");
		return driver;
	}
	
	public void closeDriver() {
		driver.close();
	}

	/** return locate element */
	public Element $(By by) throws Exception {
		return findElement(by);
	}

	/** return locate element using driver*/
	public Element findElement(By by) throws Exception {
		Element el = new Element(driver, by);
		return el;
	}
	
	/** return Element list */
	public List<WebElement> findElements(String locator) {
        
            List<WebElement> els = driver.findElements(By.xpath(locator));
            return els;
        
    }

	/** return wait  */
	public WebDriverWait getWait() throws Exception {

		Log.debug("obtaining the wait object for current thread");
		WebDriverWait wait = new WebDriverWait(getDriver(), getWaitDuration());
		return wait;

	}

	/** return locate element using Locator */
	public Element $(Loc type, String locator) throws Exception {

		Element el = new Element(driver, getLocator(type, locator));
		return el;

	}
	
	/** return locate element with specific time unit*/
	public Element $$$$(Loc type, String locator, int timeunit) throws Exception {

		Element el = new Element(driver, getLocator(type, locator), timeunit);
		return el;

	}

	/** return locate element using find element */
	public WebElement $findElement(By by) throws Exception {

		WebElement element = driver.findElement(by);
		return element;
	}

	
	/** enter data function */
	public void $enterDataFindElement(By by, String data) throws Exception {

		WebElement element = driver.findElement(by);
		Log.message("Data" + data, true);
		element.sendKeys(data);
	}
	
	/** click on element */
	public void $clickFindElement(By by) throws Exception {

		WebElement element = driver.findElement(by);
		element.click();
	}
	
	/** display element */
	public void $displayFindElement(By by) throws Exception {

		WebElement element = driver.findElement(by);
		element.isDisplayed();
	}
	
	/** return Element list using locator */
	public List<Element> $$(Loc type, String locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), getWaitDuration());
		List<WebElement> els = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getLocator(type, locator)));
		List<Element> elements = setElements(els);
		return elements;
	}

	/** return explicity wait  */
	public Element $(ExpectedCondition<?> exp, int... delay) throws Exception {

		Element el = new Element(driver, exp, delay);
		return el;

	}

	/** return element using By */
	public By $By(Loc type, String locator) throws Exception {

		By by = getLocator(Loc.XPATH, locator);
		return by;

	}
	
	/** return locate element list using expected conditions */
	public List<Element> $findElements(ExpectedCondition<List<WebElement>> exp, int delay) {

		try {
			List<WebElement> els = getWait().until(exp);
			List<Element> elements = setElements(els);

			if (elements.size() > 0) {
				elements.get(0);
			}
			return elements;
		} catch (Exception e) {
			return Collections.emptyList();
		}

	}

	/** return element list */
	public List<Element> setElements(List<WebElement> els) {
		List<Element> list = new ArrayList<Element>();
		for (WebElement el : els) {
			list.add(new Element(driver, el));
		}
		return list;
	}

	/** return get text of element */
	public String $getText(Element element) {

		return element.getText();

	}
	
	/** return get attribute value of element */
	public String $getAttributeValue(Element element, String attribute) {
		
		return element.getAttribute(attribute);
		
	}
	
	/** return css value of element */
	public String $getCSSValue(Element element, String attribute) {
		return element.getCSSValue(attribute);
	}
 
	/** return get text of element using expected conditions */
	public String $getText(ExpectedCondition<WebElement> exp, int delay) throws Exception {

		Element ele = new Element(driver, exp, delay);
		return ele.getText();
	}

	/** return display conditon */
	public boolean $display(Element element) {

		return element.display();

	}
	
	/** enter detail */
	public void $enterData(Element element, String data) {
		
		element.sendKeys(data);
		
	}
	
	/** clear field */
	public void $clearData(Element element) {
		element.clear();
	}

	/** return display condition with expected condition */
	public boolean $display(ExpectedCondition<WebElement> exp, int delay) throws Exception {

		Element ele = new Element(driver, exp, delay);
		return ele.display();
	}
	
	/** click on element with expected conditions */
	public void $click(ExpectedCondition<WebElement> exp, int delay) throws Exception {

		Element ele = new Element(driver, exp, delay);
		ele.click();
	}
	
	
	/** scroll down to page with expected conditions */
	public void scrollDown(ExpectedCondition<WebElement> exp, int delay) throws Exception {

		Element ele = new Element(driver, exp, delay);
		ele.scrollDown();

	}

	/** return locate element */
	public void scrollDown(By by, int delay) throws Exception {

		Element ele = new Element(driver, ExpectedConditions.visibilityOfElementLocated(by), delay);
		ele.scrollDown();
	}

	/** drop down */
	public void performDropDown(By by, String type, String value) throws Exception {
		Element ele = new Element(driver, ExpectedConditions.visibilityOfElementLocated(by), getWaitDuration());
		switch (type) {
		case "selectByText":
			//ele.clickable().dropdown().selectByIndex(Integer.parseInt(value));
			ele.click().dropdown().selectByVisibleText(value);
			break;
		case "selectByIndex":
			//ele.clickable().dropdown().selectByIndex(Integer.parseInt(value));
			ele.click().dropdown().selectByIndex(Integer.parseInt(value));
			break;
		case "selectByValue":
			//ele.clickable().dropdown().selectByValue(value);
			ele.click().dropdown().selectByValue(value);
			break;
		}

	}
	/** mouse hover */
	public void $mouseHover(WebElement element) {
		Actions actions = new Actions(driver);
    	actions.moveToElement(element).perform();
	}
	
	/** move to cursor */
   public void $moveCursor() {
	   Actions action = new Actions(driver);
	   action.moveByOffset(50, 35).perform();
   }
	
   /** scroll down by coordinates */
	public void scrollDownByCoordinates() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	/** scroll up by coordinates */
	public void scrollUpByCoordinates() {
		JavascriptExecutor js = (JavascriptExecutor) PageObject.getDriver();
		js.executeScript("window.scrollBy(0,-5000)", "");
	}
	
	/** scroll up by coordinates */
	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-200)", "");
	}

	/** click on element */
	public Element $click(Element element) {
		return element.click();
	}

	/** return title */
	public String getTitle() {
		String value = driver.getTitle();
		return value;
	}
	
	/** not clickable */
	public void $notClickable(Element element) {
		element.notClickable(element);
	}

	/** return specific wait */
	public int getWaitDuration() {
		final int defaultWait = 10;

		int duration;
		try {
			duration = property.getProperties(Constant.SELENIUM_CONFIGURATION).getInt("defaultWait");
			Log.debug("selenium getDriver() getWait() time set from environment properties: " + duration);
		} catch (Exception e) {
			duration = defaultWait;
			Log.debug(
					"selenium getDriver() getWait() time not available from environment properties...default applied : "
							+ defaultWait);
		}
		return duration;
	}

	/** switch on child window */
	public void switchWindow() {
		
		String parentWindow = driver.getWindowHandle();
		configuration.setProperty("parentWindow", parentWindow);
		Log.message("Parent Window:-" + parentWindow, true);
		switching: while (true) {
			for (String handle : getDriver().getWindowHandles()) {
				if (!handle.equals(parentWindow)) {
					Log.message("switching to window handle:" + handle, true);
					configuration.setProperty("childWindow", handle);
					getDriver().switchTo().window(handle);
					break switching;
				}else {
					
				}
			}
		}
	}
	
	/** file download */
	@SuppressWarnings("unused")
	public boolean isFileDownloaded(String downloadPath, String fileName) throws Exception {
		int j;
		Thread.sleep(7000);
		boolean flag = false;
	    File dir = new File(downloadPath);
	    File[] dir_contents = dir.listFiles();
	    Log.message("Dir:- " + dir_contents[15].getName(), true);
	    Log.message("length:- " + dir_contents.length, true);
	    for (j = 0; j < dir_contents.length; j++) {
	    	Log.message("Dir:- " + dir_contents[j].getName(), true);
	        if (dir_contents[j].getName().contains(fileName))
	            return flag=true;
	            }

	    return flag;
	}
	
	/** delete files */
	public void deleteFiles( String directory, String extension ) {
	    ExtensionFilter filter = new ExtensionFilter(extension);
	    File dir = new File(directory);

	    String[] list = dir.list(filter);
	    File file;
	    if (list.length == 0) return;

	    for (int i = 0; i < list.length; i++) {
	      //file = new File(directory + list[i]);
	      file = new File(directory, list[i]);
	      System.out.print(file + "  deleted : " + file.delete());
	    }
	   }
	
	/** switch frame */
	public void switchFrameByString(String frameName) {
		getDriver().switchTo().frame(frameName);
	}

	/** switch on child window */
	public void switchOnChildWindow() {
         
		Set<String> allWindowHandles = PageObject.getDriver().getWindowHandles();
		for (String handle : allWindowHandles) {
			Log.message("Window Handles:- " + handle, true);
			PageObject.getDriver().switchTo().window(handle);
		}

	}

	/** verify response value */
	public static void verifyResponseValue(List<String> expectedValue, List<String> actualValue) {

		for (int i = 0; i < actualValue.size(); i++) {

			Log.message("Actual value:- " + actualValue.get(i), true);
			Assert.assertEquals(expectedValue.get(i), actualValue.get(i));

		}
	}

	/** verify response not null */
	public static void verifySectionResponseNotNull(List<String> value) {

		for (int i = 0; i < value.size(); i++) {

			Assert.assertNotEquals(null, value.get(i));

		}

	}

	/** verify response null in list*/
	public static void verifySectionValueResponseNull(List<String> value) {

		Assert.assertTrue(value.contains(null));

	}

	/** verify response not null in list */
	public static void verifySectionValueResponseNotNull(List<String> value) {

		Assert.assertFalse(value.contains(null));

	}

	/** verify expected response */
	public static void verifyExpectedResponse(List<String> expectedValue, String actualValue) {
		Assert.assertTrue(expectedValue.contains(actualValue));
	}

	/** verify expected response for false condition*/
	public static void verifyExpectedFalseResponse(List<String> expectedValue, String actualValue) {
		Assert.assertFalse(expectedValue.contains(actualValue));
	}

	/** compare expected and actual value */
	public static void verifyLanguageInList(String exepectedValue, String actualValue) {
		Assert.assertTrue(exepectedValue.contains(actualValue));
	}

	/** verify  response not null*/
	public static void notNullAttributeInResponse(String actualValue) {
		Assert.assertNotEquals(null, actualValue);
	}

	/** verify  response not null in list*/
	public static void notNullAttributeInResponseInList(List<String> actualValue) {
		Assert.assertNotEquals(null, actualValue);
	}

	/** verify  response not null in list for Integer value*/
	public static void notNullAttributeInResponseInListInteger(List<Integer> actualValue) {
		Assert.assertNotEquals(null, actualValue);
	}

	/** verify  expected conditions */
	public static void verifyExpectedResponseWithoutList(String exepectedValue, String actualValue) {
		Assert.assertEquals(exepectedValue, actualValue);
	}

	/** verify  expected conditions */
	public static void verifyNotExpectedValue(String exepectedValue, String actualValue) {
		Assert.assertNotEquals(exepectedValue, actualValue);
	}

	/** verify  response not null*/
	public static void vrifyNotNullObject(List<String> value) {
		Assert.assertNotNull(value);
	}

	/** verify  size of multiple value */
	public static void verifyMultipleValue(List<String> request) {

		int size = request.size();
		Assert.assertTrue(size > 1);
	}
	
	/** verify  color code */
	public void verifyColorCode(String expectedColor, String actualColor) throws Exception{

		
		String[] hexValue = actualColor.replace("rgba(", "").replace(")", "").split(",");

		int hexValue1=Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2=Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3=Integer.parseInt(hexValue[2]);

		String color = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
        Log.message("Actual Color:- " + color, true);
        Log.message("Expected Color:- " + expectedColor, true);
		Assert.assertEquals(expectedColor, color);
		}

	/** verify element is clickable */
	public boolean isClickable(By locator)      
	{
	    try
	    {
	        WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
			
	        return true;
	    }
	    catch (Exception e)
	    {
	        return false;
	    }
	}
	
	/** close child window */
	public void closeChildWindow() throws Exception {
		String String = (java.lang.String) configuration.getProperty("childWindow");
    	PageObject.getDriver().switchTo().window(String).close();
	}
	
	/** switch on parent window */
	public void parentWindow() throws Exception {
		String String = (java.lang.String) configuration.getProperty("parentWindow");
		PageObject.getDriver().switchTo().window(String);
	}
	
	/** navigate back to previous page */
	public void navigateBack() throws Exception {
		PageObject.getDriver().navigate().back();
	}

	public void quitDriver() {
		driver.quit();
	}

	/** return Not display conditon */
	public boolean $notDisplay(Element element) {
		/*try {
			return !element.display();		
		}catch(Exception e){			
			return false;
		}*/	
		if(element.display()) {
			Log.message("displayed :- " , true);
			return false;
		}else
		return true;
		
	}
}

	
