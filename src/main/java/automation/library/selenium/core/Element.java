package automation.library.selenium.core;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
		wait = new WebDriverWait(driver, getWaitDuration());
		this.element = e;
	}
	
	public Element(WebDriver driver, WebElement e, By by) {
        this.driver = driver;
        wait = new WebDriverWait(driver, getWaitDuration());
        this.element = e;
        this.by = by;
    }

    public Element(WebDriver driver, By by, int... delay) {
        this.driver = driver;
        this.by = by;
        try {
            wait = new WebDriverWait(driver, delay.length > 0 ? delay[0] : getWaitDuration());
            this.element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
            Log.message("element located successfully:" + by.toString(), true);
        } catch (Exception e) {
            this.element = null;
            Log.message("element not located:" + by.toString(), true);
            Log.message(e.getMessage(), true);
        }
    }
	
	/**
     * Returns duration for specified waits
     */
    public static int getWaitDuration() {
        final int defaultWait = 10;
        int duration;
        try {
            duration = Integer.parseInt(System.getProperty("cukes.selenium.defaultWait"));
        } catch (Exception e) {
            duration = defaultWait;
        }
        return duration;
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
	
	public String getAttribute(String data) {
		return this.element.getAttribute(data);
	}
	
	public String getCSSValue(String data) {
		return this.element.getCssValue(data);
	}
 	
	public Element clear() {
		this.element.clear();
		return this;
	}
	
	public Element scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", this.element());
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
			wait = new WebDriverWait(driver, 20);
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
			wait = new WebDriverWait(driver, 5);
			this.element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
			Log.debug("Element is found.");
		} catch (Exception e) {
			Log.message("Element is not found.", true);
			Log.message(e.getMessage(), true);
			fail();
		}

	}
	
	public Element notClickable(Element element) {
		try {
			this.element = wait.until(ExpectedConditions.elementToBeClickable(this.element));
			this.element.click();
			fail();
		}catch(Exception e) {
			Log.message("Element not clickable", true);
		}
		return this;
	}
	
	public Element(WebDriver driver, By by, int timeunit) throws Exception {

		this.driver = driver;
		this.by = by;

		try {
			wait = new WebDriverWait(driver, timeunit);
			this.element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
			Log.debug("Element is found.");
		} catch (Exception e) {
			Log.message("Element is not found.", true);
			Log.message(e.getMessage(), true);
		}

	}
	
	public Element clickable(int... retries) {
        try {
            this.element = wait.until(ExpectedConditions.elementToBeClickable(this.element));
        } catch (Exception e) {
            if (!(retries.length > 0 && retries[0] == 0)) {
                this.refind(retries);
                return this.clickable(0);
            } else {
                throw e;
            }
        }
        return this;
    }
	
	public Element refind(int... retries) {
        Log.message("Attempting to refind the element: " + by.toString(), true);
        int attempts = 0;
        Boolean retry = true;
        int maxRetry = retries.length > 0 ? retries[0] : getFindRetries();
        while (attempts < maxRetry && retry) {
            try {
                Log.message("retry number " + attempts, true);
                this.element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
                this.element.getTagName();
                retry = false;
            } catch (Exception e) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e1) {
                	Log.message(e1.getMessage(), true);
                }
            }
            attempts++;
        }
        return this;
    }
	
	public static int getFindRetries() {
        final int defaultFindRetries = 10;
        int refind;
        try {
            refind = Integer.parseInt(System.getProperty("cukes.selenium.defaultFindRetries"));
        } catch (Exception e) {
            refind = defaultFindRetries;
        }
        return refind;
    }
	
	public Select dropdown(int... retries) {
        Select sel = null;
        try {
            sel = new Select(this.element);
        } catch (Exception e) {
            if (!(retries.length > 0 && retries[0] == 0)) {
                this.refind(retries);
                this.dropdown(0);
            } else {
                throw e;
            }
        }
        return sel;
    }

}
