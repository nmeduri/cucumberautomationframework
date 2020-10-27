
package automation.library.pageObjects;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;

/**
 * This file contains the functions of Login Page
 * 
 */
public class Login_Page extends PageObject {

	TestContext testContext;

	public Login_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	public void navigateTo_Login_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Login_Url());

	}

	public void navigateTo_Login_Page(WebDriver driver) throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Login_Url());

	}

	/** This function is verify that Title 'Link Rewards' is displayed */
	public void displayLinkRewards() throws Exception {
		$display(
				ExpectedConditions.visibilityOfElementLocated(
						$By(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Link_Rewards())),
				40);
	}

	/**
	 * This function is verify that Header 'Welcome To Your Triangle' is displayed
	 */
	public void display_Welcome_To_Your_Triangle_Header() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH,
				testContext.getPageObjectManager().getLoginPageLocator().get_Welcome_To_Your_Triangle_Header())), 40);
	}

	/** This function enter email detail */
	public void enterData_Email_Login_Page(String data) throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Email_Login_Page())), 40);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Email_Login_Page()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Email_Login_Page()),
				data + FileReaderManager.getInstance().getDataReader().get_Email_Detail());
	}

	/** This function clear to email detail */
	public void clear_Email_Login_Page() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Email_Login_Page()));
	}

	/** This function enter invalid email detail */
	public void enter_Invalid_Data_Email_Login_Page(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Email_Login_Page()), data);
	}

	/** This function click on sign in button */
	public void click_Sign_In_Button() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Sign_In_Button()));
	}

	/** This function is verify that Page 'Welcome Back' is displayed */
	public void display_Welcome_Back_Page() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Welecom_Back_Header()));
	}

	/** This function is verify that email id is prepopulate */
	public void verify_EmailId_Prepopulated() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Stored_Email()));
		String actualValue = $getAttributeValue(
				$(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Stored_Email()), "value");
		Log.message("Actual Value:- " + actualValue, true);
		Log.message(("Expected" + FileReaderManager.getInstance().getDataReader().get_Valid_Email_Data()
				+ FileReaderManager.getInstance().getDataReader().get_Email_Detail()), true);
		Assert.assertTrue(actualValue.contains(FileReaderManager.getInstance().getDataReader().get_Valid_Email_Data()
				+ FileReaderManager.getInstance().getDataReader().get_Email_Detail()));
	}

	/** This function click on switch account */
	public void click_Switch_Account() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Switch_Account_Button()));
	}

	/** This function is verify that email id is not prepopulate */
	public void verify_EmailID_Not_Prepopulated() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Email_Login_Page()));
		String actualValue = $getAttributeValue(
				$(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Email_Login_Page()), "value");
		Assert.assertNotEquals(actualValue, FileReaderManager.getInstance().getDataReader().get_Valid_Email_Data()
				+ FileReaderManager.getInstance().getDataReader().get_Email_Detail());
	}

	/** This function is verify password is not prepopulate */
	public void verify_Password_Not_Prepopulated() throws Exception {
		$display($(Loc.XPATH,
				testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Password_Field()));
		String actualValue = $getAttributeValue(
				$(Loc.XPATH,
						testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Password_Field()),
				"value");
		Assert.assertNotEquals(actualValue, FileReaderManager.getInstance().getDataReader().get_Password_Detail());
	}

	/** This function click on forgot password */
	public void click_Forgot_Password() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Forgot_Password()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Forgot_Password()));
	}

	/**
	 * This function is verify that inline error message is displayed for invalid
	 * credentials
	 */
	public void display_Inline_Error_Message_Invalid_Credentials() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator()
				.get_Inline_Error_Message_Invalid_Credentials()));
	}

	/**
	 * This function is verify that message 'Forgot Password Required' is displayed
	 */
	public void display_Message_Forgot_Password_Required() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLoginPageLocator().get_Message_Field_Required()));
	}

	public void clear_browser_history() throws Exception {
//		try {
//		PageObject.getDriver().get("chrome:settings/clearBrowserData");
//		Thread.sleep(3000);
//		PageObject.getDriver().findElement(By.xpath("settings-ui")).sendKeys(Keys.ENTER);
//		Thread.sleep(20000);
//		Set<Cookie> allCookies = PageObject.getDriver().manage().getCookies();
//		Log.message("Cookies Size:- " + allCookies.size(), true);
//		for(Cookie cookie : allCookies) {
//			Log.message("Name:- " + cookie.getName(), true);
//			Log.message("Name:- " + cookie.getDomain(), true);
//			Log.message("Name:- " + cookie.getPath(), true);
//			Log.message("Name:- " + cookie.getValue(), true);
//			PageObject.getDriver().manage().deleteCookieNamed(cookie.getName());
//			PageObject.getDriver().manage().deleteCookieNamed(cookie.getDomain());
//			PageObject.getDriver().manage().deleteCookieNamed(cookie.getPath());
//			PageObject.getDriver().manage().deleteCookieNamed(cookie.getValue());
//		}
//		PageObject.getDriver().manage().deleteAllCookies();
//		PageObject.getDriver().manage().getCookies().clear();
//		Set<Cookie> allCookiesafter = PageObject.getDriver().manage().getCookies();
//		Log.message("After Cookies Size:- " + allCookiesafter.size(), true);
//		}catch(Exception e) {
//			
//		} 

		Set<Cookie> allCookies = PageObject.getDriver().manage().getCookies();
		Log.message("Cookies Size:- " + allCookies.size(), true);
		for (Cookie cookie : allCookies) {
			Log.message("Name:- " + cookie.getName(), true);
			Log.message("Name:- " + cookie.getDomain(), true);
			Log.message("Name:- " + cookie.getPath(), true);
			Log.message("Name:- " + cookie.getValue(), true);
			PageObject.getDriver().manage().deleteCookieNamed(cookie.getName());
			PageObject.getDriver().manage().deleteCookieNamed(cookie.getDomain());
			PageObject.getDriver().manage().deleteCookieNamed(cookie.getPath());
			PageObject.getDriver().manage().deleteCookieNamed(cookie.getValue());
		}
		PageObject.getDriver().manage().deleteAllCookies();
		PageObject.getDriver().manage().getCookies().clear();
		Set<Cookie> allCookiesafter = PageObject.getDriver().manage().getCookies();
		Log.message("After Cookies Size:- " + allCookiesafter.size(), true);

//		final String dialogSelector = "#dialogOverlay-0 > groupbox:nth-child(1) > browser:nth-child(2)";
//
//	    final String acceptDialogScript = "const browser = document.querySelector(" + dialogSelector + ");"
//	            + "browser.contentDocument.documentElement.querySelector('#clearButton').click();";
//
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		PageObject.getDriver().get("about:preferences#searchResults");
//		Thread.sleep(3000);
//		PageObject.getDriver().findElement(By.cssSelector("#clearSiteDataButton")).click();
//		Thread.sleep(3000);
//		PageObject.getDriver().findElement(By.id("clearButton")).sendKeys(Keys.ENTER);
//		
//		js.executeScript(acceptDialogScript);
	}

//	public void clear_browser_history() throws Exception {
//		try {
//		PageObject.getDriver().get("chrome://settings/clearBrowserData");
//		Thread.sleep(3000);
//		PageObject.getDriver().findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
//		Thread.sleep(10000);
//		Set<Cookie> allCookies = PageObject.getDriver().manage().getCookies();
//		Log.message("Cookies Size:- " + allCookies.size(), true);
//		for(Cookie cookie : allCookies) {
//			Log.message("Name:- " + cookie.getName(), true);
//			Log.message("Name:- " + cookie.getDomain(), true);
//			Log.message("Name:- " + cookie.getPath(), true);
//			Log.message("Name:- " + cookie.getValue(), true);
//			PageObject.getDriver().manage().deleteCookieNamed(cookie.getName());
//			PageObject.getDriver().manage().deleteCookieNamed(cookie.getDomain());
//			PageObject.getDriver().manage().deleteCookieNamed(cookie.getPath());
//			PageObject.getDriver().manage().deleteCookieNamed(cookie.getValue());
//		}
//		PageObject.getDriver().manage().deleteAllCookies();
//		PageObject.getDriver().manage().getCookies().clear();
//		Set<Cookie> allCookiesafter = PageObject.getDriver().manage().getCookies();
//		Log.message("After Cookies Size:- " + allCookiesafter.size(), true);
//		}catch(Exception e) {
//			
//		}
//	}

}
