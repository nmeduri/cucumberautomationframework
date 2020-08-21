package automation.library.selenium.core;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.library.logdetail.Log;
/**
 * Utility class providing set of selenium wrapper methods
 */
public class Element {

	private By by;
	protected WebDriver driver;
	private WebElement element;
	private WebDriverWait wait;

	public Element(WebDriver driver, WebElement e) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		this.element = e;
	}

	public WebElement element() {
		return element;
	}

	public Element sendKeys(String val) {
		this.element().sendKeys(val);
		return this;
	}

	public Element click() {
		this.element().click();
		return this;
	}
	
	public boolean display() {
		boolean value = this.element.isDisplayed();
		return value;
	}

	public String  getText() {
		String value = element.getText();
		return value;
	}

	public Element(WebDriver driver, ExpectedCondition<?> exp, int... delay) throws Exception {

		this.driver = driver;

		try {
			wait = new WebDriverWait(driver, 10);
			this.element = (WebElement) wait.until(exp);
		} catch (Exception e) {
			this.element = null;
			//Log.message("element not located: " + by.toString(), true);
			Log.debug(e.getMessage());
			fail();
		}

	}

	public Element(WebDriver driver, By by) throws Exception {

		this.driver = driver;
		this.by = by;

		try {
			wait = new WebDriverWait(driver, 20);
			this.element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
			Log.debug("Element is found.");
		} catch (Exception e) {
			Log.message("Element is not found.", true);
			Log.message(e.getMessage(), true);
			fail();
		}

	}

}
