package automation.library.selenium.core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static automation.library.enums.Locator.getLocator;

public class PageObject {

	protected static WebDriver driver;
	private WebDriverWait wait;
	private Property property = new Property();
	public static List<String> value;

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

	public WebDriverWait getWait() throws Exception {

		Log.debug("obtaining the wait object for current thread");
		WebDriverWait wait = new WebDriverWait(getDriver(), getWaitDuration());
		return wait;

	}

	public Element $(Loc type, String locator) throws Exception {

		Element el = new Element(driver, getLocator(type, locator));
		return el;

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

	public Element $getText(ExpectedCondition<WebElement> exp, int delay) throws Exception {

		Element ele = new Element(driver, exp, delay);
		return ele;
	}

	public Element $getText(Element element) {

		return element;

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

	public void switchWindow(String parent) {
		Log.debug("parent window handle:" + parent);
		switching: while (true) {
			for (String handle : getDriver().getWindowHandles()) {
				if (!handle.equals(parent)) {
					Log.debug("switching to window handle:" + handle);
					getDriver().switchTo().window(handle);
					break switching;
				}
			}
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
	
	public static void verifySectionResponseNull(List<String> value) {

		for (int i = 0; i < value.size(); i++) {
			
			Log.message("Value:- " + value.get(i), true);
			Assert.assertEquals("null", value.get(i));

		}

	}
	
	public static void verifySectionValueResponseNull(List<String> value) {
		
		Assert.assertTrue(value.contains(null));
		
	}

	public static void verifySectionValueResponseNotNull(List<String> value) {

		Assert.assertFalse(value.contains(null));
		
	}
	
	public static void verifyNotNullResponse(List<String> expectedValue, String actualValue) {
		Assert.assertTrue(expectedValue.contains(actualValue));
	}
	
	public static void verifyNullResponse(List<String> actualValue, String expectedValue) {
		Assert.assertFalse(actualValue.contains(expectedValue));

	}
	
	public static void notNullAttributeInResponse(String actualValue) {
		Assert.assertNotEquals(null, actualValue);
	}
	
	public static void notNullAttributeInResponseInList(List<String> actualValue) {
		Assert.assertNotEquals(null, actualValue);
	}
	
	public static void verifyExpectedValue(String exepectedValue, String actualValue) {
		Assert.assertEquals(exepectedValue, actualValue);
	}
	
	public static void verifyExpectedValueInList(List<String> actualValue, String expectedValue) {
		Assert.assertTrue(actualValue.contains(expectedValue));
	}
	
	public static void verifyLanguageInList(String exepectedValue, String actualValue) {
		Assert.assertTrue(exepectedValue.contains(actualValue));
	}
	
	public static void verifyNotExpectedValue(String exepectedValue, String actualValue) {
		Assert.assertNotEquals(exepectedValue, actualValue);
	}
	
	public static void vrifyNotNullObject(List<String> value) {
		Assert.assertNotNull(value);
	}
	
	public static void verifyMultipleValue(List<String> request) {
		
		int size = request.size();
		Log.message("Size:- " + size, true);
		Assert.assertTrue(size > 1);
	}

}
