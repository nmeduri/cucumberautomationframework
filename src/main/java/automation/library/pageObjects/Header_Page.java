package automation.library.pageObjects;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;

/**
 * This file contains the functions of Header Page
 * 
 */
public class Header_Page extends PageObject {

	
	TestContext testContext;

	public Header_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function click on Account */
	public void clickOnAccount() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Account()));
	}
	
	/** This function click on Sign in */
	public void clickSignIn() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Sign_In_Header()));
	}
	
	/** This function click on Header */
	public void clickRegistration() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Registration_Header()));
	}
	
	/** This function display Pencil Banner */
	public void display_PencilBanner() throws Exception {
		 $display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_PencilBanner())), 10);
		Assert.assertTrue($display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_PencilBanner())));
	}
	
	/** This function display Account Link */
	public void display_AccountLink() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Account_link()));
	}
	
	/** This function display Made For Life Text */
	public void display_MadeForLife() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_MadeForLifeText())), 10);
		Assert.assertTrue($display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_MadeForLifeText())));

	}
	
	/** This function display Customer service page */
	public void display_CustomerServicePage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_CustomerService_Page()));
	}
	
	/** This function display Credit Offered Text */
	public void display_CreditOffered() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_CreditOfferedText()));
	}
	/** This function click Credit Offered Text */
	public void click_CreditOffered() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_CreditOfferedText()));
    }
	
	/** This function display Customer service Link */
	public void display_CustomerService() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_CustomerService()));
	}
	
	/** This function Click Customer service Link */
	public void click_CustomerService() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_CustomerService()));
	}
	
	/** This function display Language Link */
	public void display_Language() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Language()));
	}
	
	/** This function click Language Link */
	public void Click_Language() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Language()));
	}
	
	/** This function click Account Link */
	public void Click_AccountLink() throws Exception {
		DriverFactory.getInstance().getDriver().navigate().to(FileReaderManager.getInstance().getConfigReader().getPDPUrl());
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Account_link()));
	}
	
	/** This function click Hi Link after login  */
	public void Click_HiLink() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_HiLink()));
	}
	/** scroll down to page */
	public void scrollDown() throws Exception {
		   testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDownByCoordinates();
	   }
	
	/** This function is verify that banner logo is displayed */
	public void displayBannerLogo() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Banner_Logo()));
	}
	
	/** This function is verify that Store Bar is displayed */
	public void displayStoreBar() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Search_Bar()));
	}
	
	/** This function is verify that wish list icon is displayed */
	public void displayWishlistIcon() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Wishlist_Icon()));
	}
	
	/** This function is verify that cart icon is displayed */
	public void displayCartIcon() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Cart_Icon()));
	}
	
	/** This function is verify that search bar is displayed */
	public void displaySearchBar() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Search_Bar()));
	}
	/** This function is click search bar */
	public void Click_SearchBar() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Search_Bar()));
	}
	/** This function is enter value on search bar */
	public void enterData_SearchBar() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Search_Bar()),FileReaderManager.getInstance().getDataReader().get_Search_Data());
	}
	/** This function is click the search icon */
	public void clickSearchIcon() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_search_icon()));
	}
	/** This function is display search result */
	public void displaySearchResult() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_search_result()));
	}
	
	/** This function is verify that Store Name is displayed */
	public void displayStoreName() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Store_Name())), 2);
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Store_Name()));
	}
	
	/** This function is verify that Store status is displayed */
	public void displayStoreStatus() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Store_Status())), 2);
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Store_Status()));
	}
	
	/** This function is verify that closing hours is displayed */
	public void displayClosingHours() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Closing_Hours())), 2);
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Closing_Hours()));
	}
	
	/** This function is verify that chervon is displayed */
	public void displayChervon() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Chervon())), 2);
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Chervon()));
	}
	
	/** This function click on wish list icon */
	public void clickWishlistIcon() throws Exception {
		String wishListUrl = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Wishlist_Icon()), "href");
		configuration.setProperty("wishListUrl", wishListUrl);
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Wishlist_Icon()));
	}
	
	/** This function is verify that wishlist is redirected to configure page */
	public void verifyWishListRedirectedToConfigurePage() throws Exception {
		String expetedUrl = (java.lang.String) 		configuration.getProperty("wishListUrl");
		Assert.assertEquals(expetedUrl, PageObject.getDriver().getCurrentUrl());
		PageObject.getDriver().navigate().back();
	}
	
	/** This function clicks on cart icon */
	public void clickCartIcon() throws Exception {
		String cartUrl = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Cart_Icon()), "href");
		configuration.setProperty("cartUrl", cartUrl);
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Cart_Icon()));
	}
	/** This function display information banner */
	public void display_InformationBanner() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_informationBanner()));
	}
	/** This function display information banner */
	public void display_InformationBannerText() throws Exception {
	    $display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_informationBannerText()));
	    $display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_informationBannerLink()));

	}
	/** This function is verify that cart is redirected to configure page */
	public void verifyCartRedirectedToConfigurePage() throws Exception {
		String expetedUrl = (java.lang.String) 		configuration.getProperty("cartUrl");
		Assert.assertEquals(expetedUrl, PageObject.getDriver().getCurrentUrl());
		PageObject.getDriver().navigate().back();
	}

}
