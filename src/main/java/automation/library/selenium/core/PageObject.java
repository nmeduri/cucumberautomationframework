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
import static org.testng.Assert.fail;

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

	public Element $(By by) throws Exception {
		return findElement(by);
	}

	public Element findElement(By by) throws Exception {
		Element el = new Element(driver, by);
		return el;
	}
	
	public List<WebElement> findElements(String locator) {
        
            List<WebElement> els = driver.findElements(By.xpath(locator));
            return els;
        
    }

	public WebDriverWait getWait() throws Exception {

		Log.debug("obtaining the wait object for current thread");
		WebDriverWait wait = new WebDriverWait(getDriver(), getWaitDuration());
		return wait;

	}

	public Element $(Loc type, String locator) throws Exception {

		Element el = new Element(driver, getLocator(type, locator));
		return el;

	}
	
	public Element $$$$(Loc type, String locator, int timeunit) throws Exception {

		Element el = new Element(driver, getLocator(type, locator), timeunit);
		return el;

	}

	public WebElement $findElement(By by) throws Exception {

		WebElement element = driver.findElement(by);
		return element;
	}

	public List<Element> $$(Loc type, String locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), getWaitDuration());
		List<WebElement> els = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getLocator(type, locator)));
		List<Element> elements = setElements(els);
		return elements;
	}

	public Element $(ExpectedCondition<?> exp, int... delay) throws Exception {

		Element el = new Element(driver, exp, delay);
		return el;

	}

	public By $By(Loc type, String locator) throws Exception {

		By by = getLocator(Loc.XPATH, locator);
		return by;

	}

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

	public List<Element> setElements(List<WebElement> els) {
		List<Element> list = new ArrayList<Element>();
		for (WebElement el : els) {
			list.add(new Element(driver, el));
		}
		return list;
	}

	public String $getText(Element element) {

		return element.getText();

	}
	
	public String $getAttributeValue(Element element, String attribute) {
		
		return element.getAttribute(attribute);
		
	}
 
	public String $getText(ExpectedCondition<WebElement> exp, int delay) throws Exception {

		Element ele = new Element(driver, exp, delay);
		return ele.getText();
	}

	public boolean $display(Element element) {

		return element.display();

	}
	
	public void $enterData(Element element, String data) {
		
		element.sendKeys(data);
		
	}
	
	public void $clearData(Element element) {
		element.clear();
	}

	public boolean $display(ExpectedCondition<WebElement> exp, int delay) throws Exception {

		Element ele = new Element(driver, exp, delay);
		return ele.display();
	}
	
	public void $click(ExpectedCondition<WebElement> exp, int delay) throws Exception {

		Element ele = new Element(driver, exp, delay);
		ele.click();
	}
	
	

	public void scrollDown(ExpectedCondition<WebElement> exp, int delay) throws Exception {

		Element ele = new Element(driver, exp, delay);
		ele.scrollDown();

	}

	public void scrollDown(By by, int delay) throws Exception {

		Element ele = new Element(driver, ExpectedConditions.visibilityOfElementLocated(by), delay);
		ele.scrollDown();
	}

	public void performDropDown(By by, String type, String value) throws Exception {
		Element ele = new Element(driver, ExpectedConditions.visibilityOfElementLocated(by), getWaitDuration());
		switch (type) {
		case "selectByText":
			ele.clickable().dropdown().selectByVisibleText(value);
			break;
		case "selectByIndex":
			ele.clickable().dropdown().selectByIndex(Integer.parseInt(value));
			break;
		case "selectByValue":
			ele.clickable().dropdown().selectByValue(value);
			break;
		}

	}
	
	public void $mouseHover(WebElement element) {
		Actions actions = new Actions(driver);
    	actions.moveToElement(element).perform();
	}
 
   public void $moveCursor() {
	   Actions action = new Actions(driver);
	   action.moveByOffset(50, 35).perform();
   }
	
	public void scrollDownByCoordinates() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	public void scrollUpByCoordinates() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-5000)", "");
	}

	public Element $click(Element element) {
		return element.click();
	}

	public String getTitle() {
		String value = driver.getTitle();
		return value;
	}

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

	public void switchWindow() {
		
		String parentWindow = driver.getWindowHandle();
		switching: while (true) {
			for (String handle : getDriver().getWindowHandles()) {
				if (!handle.equals(parentWindow)) {
					Log.message("switching to window handle:" + handle, true);
					getDriver().switchTo().window(handle);
					break switching;
				}else {
					
				}
			}
		}
	}
	
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
	
	public void switchFrameByString(String frameName) {
		getDriver().switchTo().frame(frameName);
	}

	public void switchOnChildWindow() {
         
		Set<String> allWindowHandles = PageObject.getDriver().getWindowHandles();
		for (String handle : allWindowHandles) {
			Log.message("Window Handles:- " + handle, true);
			PageObject.getDriver().switchTo().window(handle);
		}

	}

	public static void verifyResponseValue(List<String> expectedValue, List<String> actualValue) {

		for (int i = 0; i < actualValue.size(); i++) {

			Log.message("Actual value:- " + actualValue.get(i), true);
			Assert.assertEquals(expectedValue.get(i), actualValue.get(i));

		}
	}

	public static void verifySectionResponseNotNull(List<String> value) {

		for (int i = 0; i < value.size(); i++) {

			Assert.assertNotEquals(null, value.get(i));

		}

	}

	public static void verifySectionValueResponseNull(List<String> value) {

		Assert.assertTrue(value.contains(null));

	}

	public static void verifySectionValueResponseNotNull(List<String> value) {

		Assert.assertFalse(value.contains(null));

	}

	public static void verifyExpectedResponse(List<String> expectedValue, String actualValue) {
		Assert.assertTrue(expectedValue.contains(actualValue));
	}

	public static void verifyExpectedFalseResponse(List<String> expectedValue, String actualValue) {
		Assert.assertFalse(expectedValue.contains(actualValue));
	}

	public static void verifyLanguageInList(String exepectedValue, String actualValue) {
		Assert.assertTrue(exepectedValue.contains(actualValue));
	}

	public static void notNullAttributeInResponse(String actualValue) {
		Assert.assertNotEquals(null, actualValue);
	}

	public static void notNullAttributeInResponseInList(List<String> actualValue) {
		Assert.assertNotEquals(null, actualValue);
	}

	public static void notNullAttributeInResponseInListInteger(List<Integer> actualValue) {
		Assert.assertNotEquals(null, actualValue);
	}

	public static void verifyExpectedResponseWithoutList(String exepectedValue, String actualValue) {
		Assert.assertEquals(exepectedValue, actualValue);
	}

	public static void verifyNotExpectedValue(String exepectedValue, String actualValue) {
		Assert.assertNotEquals(exepectedValue, actualValue);
	}

	public static void vrifyNotNullObject(List<String> value) {
		Assert.assertNotNull(value);
	}

	public static void verifyMultipleValue(List<String> request) {

		int size = request.size();
		Assert.assertTrue(size > 1);
	}


	
	
}