package automation.library.pageObjects;

import static org.testng.Assert.fail;

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
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollUpByCoordinates();
		PageObject.getDriver().navigate().refresh();
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Search_Bar()));
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
	
	/** This function is verify that cart is redirected to configure page */
	public void verifyCartRedirectedToConfigurePage() throws Exception {
		String expetedUrl = (java.lang.String) 		configuration.getProperty("cartUrl");
		Assert.assertEquals(expetedUrl, PageObject.getDriver().getCurrentUrl());
		PageObject.getDriver().navigate().back();
	}
	
	/**Added Item is not Displayed */
	public void notDisplayAddedItem() throws Exception {
		try {
			$displayFindElement(By.xpath(testContext.getPageObjectManager().get_Header_Locator_Page().getAddedItemWishlist()));
			fail();
		}catch(Exception e) {
			
		}
	}

	/** This function is verify primary navigation is displayed */
	public void displayPrimaryNavigation() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Primary_Navigation()));
	}
	
	/** This function is verify that store locator is displayed */
	public void displayStoreLocator() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Store_Locator_Mobile()));
	}
	
	/** This function is verify that hamburger menu is displayed */
	public void displayHamburgerMenu() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Hamburger_Menu()));
	}
	
	/** This function is verify that x icon is displayed */
	public void displayXIcon() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Side_Menu_Cross()));
	}
	
	/** This function clicks on banner logo */
	public void clickBannerLogo() throws Exception {
		String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Banner_Logo_Mobile()), "href");
		System.out.println(url);
		configuration.setProperty("urlLink", url);
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Banner_Logo_Mobile()));
	}
	
	/** This function is verify that Link is successfully navigate to defined associated page */
	public void verifyLinkNavigateToAssociatedPage() throws Exception {
		String expectedUrl = (java.lang.String)configuration.getProperty("urlLink");
		Log.message("Expected Url:- " + expectedUrl, true);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
		testContext.getPageObjectManager().getPageObject(driver).navigateBack();
	}
	
	/** This function clicks on store locator icon */
	public void clickStoreLocatorIcon() throws Exception {
		String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Store_Locator_Mobile()), "href");
		configuration.setProperty("urlLink", url);
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Store_Locator_Mobile()));
	}
	
	/** This function is verify that store locator fly out is displayed */
	public void displayStoreLocatorFlyOut() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Fly_Out_Title()));
	}
	
	/** This function is verify that search Icon is displayed */
	public void displaySearchIcon() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Search_Icon()));
	}
	
	/** This function is to verify that search bar is not displayed */
	public void notDisplaySearchBar() throws Exception {
		try {
			$display($$$$(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Search_Bar(),1));
			   Log.message("Search bar is present", true); 
			   fail();
		   }
		catch(Exception e) {
			   Log.message("Search bar is not present", true);
		   }
		
		}
	
	/** This function clicks on flyout cross icon */
	public void clickOnFlyOutCross() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Fly_Out_Cross()));
	}
	
	/** This function clicks on search icon */
	public void clickOnSearchIcon() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Search_Icon()));
	}
	
	/** This function clicks on search icon */
	public void clickOnSearchBar() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Search_Bar()));
	}
	
	/** This function is verify that search page is displayed */
	public void displaySearchPage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Search_Page()));
	}
	
	/** This function clicks on Hamburger menu */
	public void clickOnHamburgerMenu() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Hamburger_Menu()));
	}
	
	/** This function clicks on Side menu cross */
	public void clickOnSideMenuCross() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Side_Menu_Cross()));
	}
	
	/** This function is to verify that pencil banner is not displayed */
	public void notDisplayPencilBanner() throws Exception {
		try {
			$click($$$$(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Pencil_Banner(),1));
			   Log.message("Pencil banner is present", true); 
			   fail();
		   }
		catch(Exception e) {
			   Log.message("Pencil banner is not present", true);
		 }
		}
	
	/** This function clicks on Side menu cross */
	public void clickOnCrossSearchPage() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Close_Search_Page()));
	}

	/** This function is verify that Standard Header is displayed */
	public void displayStandardHeader() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Standard_Header()));
	}
	
	/** enter product in search field */
	public void enterProductInSearchField() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Search_Bar()), FileReaderManager.getInstance().getDataReader().get_Product_Search());
	}
	
	/** click on search Icon */
	public void clickSearchIcon() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Search_Icon()));
	}


}
