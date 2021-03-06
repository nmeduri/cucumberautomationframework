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

public class Footer_Page extends PageObject {

	TestContext testContext;
	List<Float> productPrice = new ArrayList<Float>();
	ArrayList<Integer> rating = new ArrayList<Integer>();
	List<Float> price = new ArrayList<Float>();

	public Footer_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	

	
	/** This function is verify that Legal Disclaimer is displayed */
	public void displayLegalDisclaimer() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Disclaimer()));
	}
	
	/** This function click on view more */
	public void clickViewMore() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_More())), 20);
		//$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_More()));
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_View_More())));
	}
	
	/** This function is verify that Reset of Legal Disclaimer is displayed */
	public void displayRestOfLegalDisclaimer() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Disclaimer()));
		String sText = $getText($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Disclaimer()));
		Log.message("Text:- " + sText, true);
		//assertFalse(sText.contains("..."));
	}
	
	/** This function is verify that Reset of Legal Disclaimer is not displayed */
	public void notDisplayRestOfLegalDisclaimer() throws Exception {
		String sText = $getText($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Disclaimer()));
		Log.message("Text:- " + sText, true);
		assertTrue(sText.contains("..."));
	}
	
	/** This function is verify that View Less is displayed */
	public void displayViewLess() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_Less()));
	}
	
	/** This function click on view less */
	public void clickViewLess() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_Less())), 20);
		//$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_Less()));
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_View_Less())));
	}
	
	/** This function is verify that View More is not displayed */
	public void notDisplayViewMore() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Not_Display_View_More()));
	}
	
	/** This function is verify that View Less is not displayed */
	public void notDisplayViewLess() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Not_Dispay_View_Less()));
	}
	
	/** This function is verify that disclaimer is displayed in three lines */
	public void displayThreeLinesLegalDisclaimer() throws Exception {
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Disclaimer_Row()), "height");
		Assert.assertTrue(value.contains("45"));
	}
	
	/** This function is verify that disclaimer is displayed in three lines */
	public void displayThreeLinesLegalDisclaimerMobile() throws Exception {
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Disclaimer_Row()), "height");
		Assert.assertTrue(value.contains("60"));
	}
	
	public void displayEditableTextLegal() throws Exception {
		$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tire_Logo()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Legal())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal()), "text-decoration");
		String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal()), "href");
		Log.message("value"+ href, true);
	    Assert.assertTrue(value.contains("underline"));
	    Assert.assertFalse(href.equals(""));
	}
	
	public void displayEditableTextTermsAndConditions() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Copy_Right_Information()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions()), "text-decoration");
		Log.message("Value:- " + value, true);
	    //Assert.assertTrue(value.contains("underline"));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions()), "href");
	    Assert.assertFalse(href.equals(""));
	}
	
	public void displayEditableTextPrivacyAndPolicy() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Copy_Right_Information()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy()), "text-decoration");
		Log.message("Value:- " + value, true);
	    //Assert.assertTrue(value.contains("underline"));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy()), "href");
	    Assert.assertFalse(href.equals(""));
	}

	
	public void displayEditableTextSiteMap() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Copy_Right_Information()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Copy_Right_Information()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Site_Map())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Site_Map()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Site_Map()), "href");
	    Assert.assertFalse(href.equals(""));
	}
	
	public void displayEditableTextAccessibility() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Copy_Right_Information()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility()), "text-decoration");
		Log.message("Value:- " + value, true);
	    //Assert.assertTrue(value.contains("underline"));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility()), "href");
	    Assert.assertFalse(href.equals(""));
	}
	
	public void displayEditableViewMore() throws Exception {
		//$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tire_Logo()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_View_More())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_More()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_More()), "text-decoration");
		Log.message("Value:- " + value, true);
	    Assert.assertTrue(value.contains("underline"));
	}
	
	public void displayViewMore() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_More()));
	}
	
	public void displayEditableViewLess() throws Exception {
		//$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tire_Logo()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_View_Less())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_Less()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_Less()), "text-decoration");
		Log.message("Value:- " + value, true);
	    Assert.assertTrue(value.contains("underline"));
	}
	
	/** This function is verify that copy right is displayed */
	public void displayCopyRight() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Copy_Right_Text()));
	}
	
	/** This function is verify that Custom Support is displayed */
	public void displayCustomSupport() throws Exception {
		Thread.sleep(10000);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Custom_Support()));
	}
	
	/** This function is verify that Services & Solutions is displayed */
	public void displaySolutionsAndServices() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Solutions_And_Services()));
	}
	
	/** This function is verify that About Us is displayed */
	public void displayAboutUs() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_AboutUs()));
	}
	
	/** This function is verify that Legal is displayed */
	public void displayLegalSection() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Section()));
	}
	
	/** This function will scroll down to Footer */
	public void scrollDownToFooter() throws Exception {
		By goToFooter = $By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Footer());
		testContext.getPageObjectManager().getPageObject(driver).scrollDown(goToFooter, 10);
	}
	
	/** This function is verify that Legal text is displayed after AEM authorization */
	public void displayLegalText() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_text()));
	}
		
	/** This function will scroll down to Mobile Footer */
	public void scrollDownToMobileFooter() throws Exception {
		By goToMobileFooter = $By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Mobile_Custom_Support());
		testContext.getPageObjectManager().getPageObject(driver).scrollDown(goToMobileFooter, 1);
	}
	
	/** This function click on accessibility */
	public void clickOnAccessibility() throws Exception {
		String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility()), "href");
		configuration.setProperty("urlAccessibility", url);
		Log.message("url:- " + url, true);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility()), 3);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility())));
	}

	/** This function is verify that clickable text link 'Order Status' is displayed */
	public void displayclickableOrderStatus() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Order_Status()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Order_Status()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Pickup & Delivery' is displayed */
	public void displayclickablePickupAndDelivery() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Pickup_And_Delivery()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Pickup_And_Delivery()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Returns & Exchanges' is displayed */
	public void displayclickableReturnsAndExchanges() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Returns_And_Exchanges()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Returns_And_Exchanges()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Help & FAQs' is displayed */
	public void displayclickableHelpAndFaqs() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Help_And_FAQs()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Help_And_FAQs()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Contact Us' is displayed */
	public void displayclickableContactUs() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Contact_Us()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Contact_Us()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Store Locator' is displayed */
	public void displayclickableStoreLocator() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Store_Locator()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Store_Locator()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Product Recalls' is displayed */
	public void displayclickableProductRecalls() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Product_Recalls()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Product_Recalls()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Safety Data Sheets' is displayed */
	public void displayclickableSafetyDataSheets() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Safety_Data_Sheets()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Safety_Data_Sheets()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Canadian Tires Financial Services' is displayed */
	public void displayclickableCanadianTiresFinancialServices() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tires_Financial_Services()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tires_Financial_Services()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Installation & Assembling' is displayed */
	public void displayclickableInstallationAndAssembling() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Installation_And_Assembling()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Installation_And_Assembling()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Auto Service Centre' is displayed */
	public void displayclickableAutoServiceCenter() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_AutoService_Center()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_AutoService_Center()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Loan-A-Tool' is displayed */
	public void displayclickableLoanATool() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Loan_A_Tool()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Loan_A_Tool()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Roadside Assistance' is displayed */
	public void displayclickableRoadsideAssistance() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Roadside_Assistance()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Roadside_Assistance()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Gift Cards' is displayed */
	public void displayclickableGiftCards() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Gift_Cards()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Gift_Cards()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Tested For Life' is displayed */
	public void displayclickableTestedForLife() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Tested_For_Life()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Tested_For_Life()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Gift Registry' is displayed */
	public void displayclickableGiftRegistry() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Gift_Registry()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Gift_Registry()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'About Canadian Tire' is displayed */
	public void displayclickableaboutCanadianTire() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_About_Canadian_Tire()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_About_Canadian_Tire()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Careers' is displayed */
	public void displayclickableCareers() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Careers()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Careers()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'About Triangle Id' is displayed */
	public void displayclickableAboutTriangleId() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_About_Triangle_Id()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_About_Triangle_Id()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Recycling Information' is displayed */
	public void displayclickableRecyclingInformation() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Recycling_Information()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Recycling_Information()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Our Brands' is displayed */
	public void displayclickableOurBrands() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Our_Brands()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Our_Brands()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Flyer Sign Up' is displayed */
	public void displayclickableFlyerSignUp() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Flyer_Sign_Up()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Flyer_Sign_Up()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Sustainability' is displayed */
	public void displayclickableSustainability() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Sustainability()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Sustainability()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Privacy Policy' is displayed */
	public void displayclickablePrivacyPolicy() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy_Link()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy_Link()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
		
	/** This function is verify that clickable text link 'Terms & Conditions' is displayed */
	public void displayclickableTermsAndConditions() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions_Link()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions_Link()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'SiteMap' is displayed */
	public void displayclickableSiteMap() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_SiteMap_Link()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_SiteMap_Link()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Accessability' is displayed */
	public void displayclickableAccessability() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessability_Link()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessability_Link()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is verify that clickable text link 'Pricing Policy' is displayed */
	public void displayclickablePricingPolicy() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Pricing_Policy()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Pricing_Policy()), "href");
	    Assert.assertFalse(href.equals(""));
	 }
	
	/** This function is to verify that expanded subsection to links is displayed */
	public void displaySubsectionLinks() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Expanded_Subsection_Links())), 10);
	}
	
	/** This function click on Custom Support "+" button */
	public void clickCustomSupportPlusButton() throws Exception {
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Custom_Support_Plus_Button())));
	}
	
	/** This function click on Services & Solutions "+" button */
	public void clickServicesAndSolutionPlusButton() throws Exception {
	    $display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Services_And_Solutions_Plus_Button()));
	    ((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Services_And_Solutions_Plus_Button())));
	}
	
	/** This function click on About Us "+" button */
	public void clickAboutUsPlusButton() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_About_Us_Plus_Button()));
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_About_Us_Plus_Button())));
	}
	
	/** This function click on Legal "+" button */
	public void clickLegalPlusButton() throws Exception {
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Plus_Button())));
	}
	
	/** This function is to verify that minus sign is displayed */
	public void displayMinusButton() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Minus_Button()));
	}
	
	/** This function is to verify collapsed header plus sign is displayed */
	public void displayPlusSign() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Custom_Support_Plus_Button()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Services_And_Solutions_Plus_Button()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_About_Us_Plus_Button()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Plus_Button()));
	}
	
	/** This function is verify that Link is successfully navigate on Accessibility */
	public void verifyLinkNavigateOnAccessibility() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		String expectedUrl = (java.lang.String) configuration.getProperty("urlAccessibility");
		Log.message("Expected Url:- " + expectedUrl, true);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
	}
	
	/** This function click on terms and conditions */
	public void clickOnTermsAndConditions() throws Exception {
		String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions_Footer()), "href");
		configuration.setProperty("urlTermsAndCondtions", url);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions_Footer())));
	}
	
	/** This function is verify that Link is successfully navigate on Terms and Conditions */
	public void verifyLinkNavigateOnTermsAndConditions() throws Exception {
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		String expectedUrl = (java.lang.String) configuration.getProperty("urlTermsAndCondtions");
		Log.message("Expected Url:- " + expectedUrl, true);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
	}
	
	/** This function click on legal */
	public void clickOnlegal() throws Exception {
		String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal()), "href");
		configuration.setProperty("urlLink", url);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal()));
	}
	
	/** This function is verify that Link is successfully navigate legal information */
	public void verifyLinkNavigateOnLegalInformation() throws Exception {
		String expectedUrl = (java.lang.String) configuration.getProperty("urlLink");
		Log.message("Expected Url:- " + expectedUrl, true);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
	}
	
	/** This function is verify that canadian tire logo is displayed */
	public void displayCanadianTireLogo() throws Exception {
		$display($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tire_Logo()));
	}
	
	/** This function is verify that copy right text is displayed */
	public void displayCopyRightText() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Copy_Right_Text()));
	}
	
	/** This function is verify that footer link is displayed*/
	public void displayFooterLink() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Footer_Link()));
	}
	
	/** This function is verify that copy right informationn is displayed*/
	public void displayCopyRightInformation() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Copy_Right_Information()));
	}
	
	/** This function click on "-" button */
	public void clickMinusButton() throws Exception {
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Minus_Button())));
	}
	
	/** This function is to verify that expanded subsection is collapsed and links not displayed */
	public void NotdisplaySubsectionLinks() throws Exception {
		try {
			$display($$$$(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Expanded_Subsection_Links(),1));
			   Log.message("Expanded subsection is not collapsed and links are displayed.", true); 
			   fail();
		   }
		catch(Exception e) {
			   Log.message("Expanded subsection is collapsed and links are not displayed", true);
		   }
		
		}
	
	/** This function is to verify that Custom Support "+" button is displayed */
	public void displayCustomSupportPlusButton() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Custom_Support_Plus_Button()));
	}
	
	/** This function is to verify that Services & Solutions "+" button is displayed */
	public void displayServicesAndSolutionPlusButton() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Services_And_Solutions_Plus_Button()));
	}
	
	/** This function is to verify that About Us "+" button is displayed */
	public void displayAboutUsPlusButton() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_About_Us_Plus_Button()));
	}
	
	/** This function is to verify that Legal "+" button is displayed */
	public void displayLegalPlusButton() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Plus_Button()));
	}
	
	/** This function is verify that Custom Support Text is clickable  */
	public void clickableServicesAndSolutionsHeader() throws Exception {
		try {
			 String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Custom_Support()), "href");  
			 Assert.assertFalse(href.equals(""));
			 Log.message("Custom Support Text is clickable", true);
			 }
			 catch(Exception e) {
			Log.message("Custom Support Text is not clickable", true);
			 }
	}
	
	/** This function is verify that Services & Solutions Text is clickable  */
	public void clickableCustomSupportHeader() throws Exception {
		try {
			 String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Solutions_And_Services()), "href");  
			 Assert.assertFalse(href.equals(""));
			 Log.message("Services & Solutions Text is clickable", true);
			 }
			 catch(Exception e) {
			Log.message("Services & Solutions Text is not clickable", true);
			 }
	}
	
	/** This function is verify that About Us Text is clickable  */
	public void clickableAboutUsHeader() throws Exception {
		try {
			 String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_AboutUs()), "href");  
			 Assert.assertFalse(href.equals(""));
			 Log.message("About Us Text is clickable", true);
			 }
			 catch(Exception e) {
			Log.message("About Us Text is not clickable", true);
			 }
	}
	
	/** This function is verify that Custom Support Text is clickable  */
	public void clickableLegalHeader() throws Exception {
		try {
			 String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal_Section()), "href");  
			 Assert.assertFalse(href.equals(""));
			 Log.message("Legal Text is clickable", true);
			 }
			 catch(Exception e) {
			Log.message("Legal Text is not clickable", true);
			 }
	}
	
		/** This function click on order status */
		public void clickOnOrderStatus() throws Exception {
			$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Order_Status())), 40);
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Order_Status()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Order_Status()));
		}
		
		/** This function is verify that Link is successfully navigate to defined associated page */
		public void verifyLinkNavigateToAssociatedPage() throws Exception {
			String expectedUrl = (java.lang.String) configuration.getProperty("urlLink");
			Log.message("Expected Url:- " + expectedUrl, true);
			String actualUrl = PageObject.getDriver().getCurrentUrl();
			Log.message("Actual Url:- " + actualUrl, true);
			Assert.assertEquals(expectedUrl, actualUrl);
		}

		/** This function navigate back to previous page */
		public void verifyNavigateBack() throws Exception {
			testContext.getPageObjectManager().getPageObject(driver).navigateBack();
		}
		
		/** This function click on pickup & delivery */
		public void clickOnPickUpAndDelivery() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Pickup_And_Delivery()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Pickup_And_Delivery()));
		}
		
		/** This function click on Returns & Exchanges */
		public void clickOnReturnsAndExchanges() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Returns_And_Exchanges()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Returns_And_Exchanges()));
		}
		
		/** This function click on Help & FAQs */
		public void clickOnHelpAndFaqs() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Help_And_FAQs()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Help_And_FAQs()));
		}
		
		/** This function click on Contact Us */
		public void clickOnContactUs() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Contact_Us()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Contact_Us()));
		}
		
		/** This function click on Store Locator */
		public void clickOnStoreLocator() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Store_Locator()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Store_Locator()));
		}
		
		/** This function click on Product Recalls */
		public void clickOnProductRecalls() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Product_Recalls()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Product_Recalls()));
		}
		
		/** This function click on Safety Data Sheets */
		public void clickOnSafetyDataSheets() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Safety_Data_Sheets()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Safety_Data_Sheets()));
		}
		
		/** This function click on Canadian Tires Financial Services */
		public void clickOnCanadianTiresFinancialServices() throws Exception {
			$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tires_Financial_Services())), 40);
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tires_Financial_Services()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tires_Financial_Services()));
		}
		
		/** This function click on Installation & Assembling */
		public void clickOnInstallationAndAssembling() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Installation_And_Assembling()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Installation_And_Assembling()));
		}
		
		/** This function click on Auto Service Center */
		public void clickOnAutoServiceCenter() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_AutoService_Center()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_AutoService_Center()));
		}
		
		/** This function click on Loan-A-Tool */
		public void clickOnLoanATool() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Loan_A_Tool()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Loan_A_Tool()));
		}
		
		/** This function click on Roadside Assistance */
		public void clickOnRoadsideAssistance() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Roadside_Assistance()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Roadside_Assistance()));
		}
		
		/** This function click on Gift Cards */
		public void clickOnGiftCards() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Gift_Cards()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Gift_Cards()));
		}
		
		/** This function click on Tested for Life */
		public void clickOnTestedForLife() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Tested_For_Life()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Tested_For_Life()));
		}
		
		/** This function click on Gift Registry */
		public void clickOnGiftRegistry() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Gift_Registry()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Gift_Registry()));
		}
		
		/** This function click on About Canadian Tire */
		public void clickOnAboutCanadianTire() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_About_Canadian_Tire()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_About_Canadian_Tire()));
		}
		
		/** This function click on Careers */
		public void clickOnCareers() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Careers()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Careers()));
		}
		
		/** This function click on About Triangle ID */
		public void clickOnAboutTriangleID() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_About_Triangle_Id()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_About_Triangle_Id()));
		}
		
		/** This function click on Recycling Information */
		public void clickOnRecyclingInformation() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Recycling_Information()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Recycling_Information()));
		}
		
		/** This function click on Our Brands */
		public void clickOnOurBrands() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Our_Brands()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Our_Brands()));
		}
		
		/** This function click on Flyer Sign Up */
		public void clickOnFlyerSignUp() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Flyer_Sign_Up()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Flyer_Sign_Up()));
		}
		
		/** This function click on Sustainability */
		public void clickOnSustainability() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Sustainability()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Sustainability()));
		}
		
		/** This function click on Privacy Policy */
		public void clickOnPrivacyPolicyLink() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy_Link()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy_Link()));
		}
		
		/** This function click on Terms & Conditions */
		public void clickOnTermsAndConditionsLink() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Careers()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Careers()));
		}
		
		/** This function click on Site Map */
		public void clickOnSiteMapLink() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_SiteMap_Link()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_SiteMap_Link()));
		}
		
		/** This function click on Accessibility */
		public void clickOnAccessibilityLink() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessability_Link()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessability_Link()));
		}
		
		/** This function click on Pricing Policy */
		public void clickOnPricingPolicy() throws Exception {
			String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Pricing_Policy()), "href");
			configuration.setProperty("urlLink", url);
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Pricing_Policy()));
		}
	
		
	/** This function click on privacy policy */
	public void clickPrivacyPolicy() throws Exception {
		String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy_Link()), "href");
		configuration.setProperty("privacyPolicyUrl", url);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy_Link())));
	}
	
	/** This function is verify that privacy link is successfully navigate on Privacy Policy Link */
	public void verifyLinkNavigateOnPrivacyPolicy() throws Exception {
		String expectedUrl = (java.lang.String) configuration.getProperty("privacyPolicyUrl");
		Log.message("Expected Url:- " + expectedUrl, true);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
	}
	
	/** This function click on site map */
	public void clickSiteMap() throws Exception {
		configuration.setProperty("urlSiteMap", $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_SiteMap_Link()), "href"));
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_SiteMap_Link())));
	}
	
	/** This function is verify that Link is successfully navigate on Site Map */
	public void verifyLinkNavigateOnSiteMap() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		String expectedUrl = (java.lang.String) configuration.getProperty("urlSiteMap");
		Log.message("Expected Url:- " + expectedUrl, true);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
	}
	
	/** This function is verify that all links are underlined on hover */
	public void verifyUnderlinkeOnAnyLink() throws Exception {
		
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_All_Footer_Links()));
		Log.message("Size:-  " + li.size(), true);
		for(int i=0; i<li.size(); i++) {
			//$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tire_Logo()));
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover(li.get(i));
			li.get(i).isDisplayed();
			String decorationValue = li.get(i).getCssValue("text-decoration");
			Log.message("Value :- " + decorationValue, true);
			 Assert.assertTrue(decorationValue.contains("underline"));
		}	
	}
	
	/** This function is verify that all links are underlined on hover */
	public void verifyUnderlinkeOnAnyLinkOnMobile() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions()), "text-decoration");
		String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions()), "href");
		Log.message("value"+ value, true);
	    Assert.assertTrue(value.contains("underline"));
	    Assert.assertFalse(href.equals(""));
		
	}
	
	/** This function is verify that editable terms and conditions is displayed */
	public void displayEditableTextTermsAndConditionsMobile() throws Exception {
		//$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getFooterPageLocator().get_Canadian_Tire_Logo()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions()), "text-decoration");
		Log.message("Value:- " + value, true);
	    //Assert.assertTrue(value.contains("underline"));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions()), "href");
	    Assert.assertFalse(href.equals(""));
	}
	
	/** This function is verify editable policy and policy is displayd */
	public void displayEditableTextPrivacyAndPolicyMobile() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy()), "href");
	    Assert.assertFalse(href.equals(""));
	}
	
	/** This function is verify editable site map is displayed */
	public void displayEditableTextSiteMapMobile() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Site_Map())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Site_Map()));
		String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Site_Map()), "href");
	    Assert.assertFalse(href.equals(""));
	}
	
	/** This function is verify editable accessibility is displayed */
	public void displayEditableTextAccessibilityMobile() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility()));
	    String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility()), "href");
	    Assert.assertFalse(href.equals(""));
	}
	
	/** This function is verify that view more is displayed */
	public void displayEditableViewMoreMobile() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_View_More())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_More()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_More()), "text-decoration");
		Log.message("Value:- " + value, true);
	    Assert.assertTrue(value.contains("underline"));
	}
	
	/** This function is verify that view less is displayed */
	public void displayEditableViewLessMobile() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_View_Less())));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_Less()));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_Less()), "text-decoration");
		Log.message("Value:- " + value, true);
	    Assert.assertTrue(value.contains("underline"));
	}
	
	/** This function clicks on minus button*/
	public void clickMinusSection() throws Exception {
		Thread.sleep(5000);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Minus_Button())));
	}
	
	/** verify Learn more link is getting navigate on learn more section */
	public void verifyLearnMoreLinkNavigation() throws Exception {
		Assert.assertEquals($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Learn_More()), "href"), FileReaderManager.getInstance().getDataReader().get_Learn_More_Link());
	}
	
	/** verify Learn more link is displayed on footer */
	public void verifyLearnMoreLinkdisplayed() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Learn_More()));
	}
	/** verify download the app is displayed on footer */
	public void verifydownloadTheAppLinkdisplayed() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_downloadTheApp()));
	}
	/** verify Be the first one to know is displayed on footer */
	public void verifyBethefirstoneIsdisplayed() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Be_The_First_To_Know()));
	}
	/** verify weekly Flyer Email Directly Text is displayed on footer */
	public void verifyweeklyFlyerEmailDirectlyTextIsdisplayed() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Weekly_Flyer_Email_Directly()));
	}
	/** verify SignUp button is displayed on footer */
	public void verifySignUpTextIsdisplayed() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Weekly_Sign_Up()));
	}
	
	/** verify Accessibility link is getting navigate on Accesibility section on new tab */
	public void verifyAccessibilityNavigation() throws Exception {
		Thread.sleep(2000);
		testContext.getPageObjectManager().getPageObject(driver).switchWindow();
		if(PageObject.getDriver().getCurrentUrl().equalsIgnoreCase(FileReaderManager.getInstance().getDataReader().get_Accessibility_Link())) {
			PageObject.getDriver().close();
			testContext.getPageObjectManager().getPageObject(driver).parentWindow();
		}else {
			PageObject.getDriver().close();
			testContext.getPageObjectManager().getPageObject(driver).parentWindow();
			fail();
		}
	}
	
	/** click on accessibility logo */
	public void clickOnAccessibilityLogo() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility_Logo()));
	}
	
	/** This function to display Footer section*/
	public void displayFooterSection() throws Exception {
		//By footerSection = $By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Footer_Links_Section());
		//testContext.getPageObjectManager().getPageObject(driver).scrollDown(footerSection, 10);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Footer_Section())), 40);
	}
	
	/** This function navigate to Footer page*/
	public void navigateTo_Footer_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Footer_Url());
	}
	
	/** This function is verify that Footer Page is displayed */
	public void display_Footer_Page() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle();

	}

	
	/** verify App Store Logo link is getting navigate on App Store section on new tab */
	public void verifyAppStoreNavigation() throws Exception {
		testContext.getPageObjectManager().getPageObject(driver).switchWindow();
		Thread.sleep(2000);
		if(PageObject.getDriver().getCurrentUrl().equalsIgnoreCase(FileReaderManager.getInstance().getDataReader().get_App_Store_Link())) {
			PageObject.getDriver().close();
			testContext.getPageObjectManager().getPageObject(driver).parentWindow();
		}else {
			PageObject.getDriver().close();
			testContext.getPageObjectManager().getPageObject(driver).parentWindow();
			fail();
		}
	}

	/** This function to display Footer Links section*/
	public void displayFooterLinksSection() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Footer_Links_Section())), 40);
	}
	/** This function to click On Android App Store Logo*/
	public void clickOnAndroidAppStoreLogo() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Android_App_Store_Logo())), 40);
	}
	/** This function to display Google App Store Download */
	public void displayGoogleAppStoreDownload() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Google_App_Store())), 40);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual URL: "+actualUrl, true);
		Assert.assertTrue(actualUrl.contains(FileReaderManager.getInstance().getDataReader().get_AppStore_Url()));
	}
	
	/** This function is verify that all links are underlined on hover */
	public void verifyHoverOnAnyFooterLink() throws Exception {
		testContext.getPageObjectManager().getPageObject(driver).scrollUp();
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Custom_Support())), 40);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).$mouseHover($findElement(By.xpath(testContext.getPageObjectManager().getFooterPageLocator().get_Order_Status())));
		String value = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Order_Status()), "text-decoration");
		Log.message("Value:- " + value, true);
	    Assert.assertTrue(value.contains("underline"));
	}


	
	
	
	/** This function click on Android play store logo */
	public void clickOnAndroidPlayStoreLogo() throws Exception {
		String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Android_PlayStore_Logo()), "href");
		configuration.setProperty("urlLink", url);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Android_PlayStore_Logo()));
	}
	
	/** This function verify the Apple App Store Url */
	public void verifyIOSAppStoreURL() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getDataReader().get_appleAppStore_Url(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_IOS_AppStore_Logo()), "href"));
	}
	
	/** This function is verify that Link is successfully navigate to Android Play Store */
	public void verifyLinkNavigateToAndroidPlayStore() throws Exception {
		String expectedUrl = (java.lang.String) configuration.getProperty("urlLink");
		Log.message("Expected Url:- " + expectedUrl, true);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
		PageObject.getDriver().close();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
	}

	/** This function navigate to Footer page*/
	public void navigate_To_Footer_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Footer_Component_Url());
	}
	
	/** click on sign up */
	public void clickOnSignUp() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Weekly_Sign_Up())), 40);
	}
	
	/** click on app store logo */
	public void clickAppStoreLogo() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_App_Store_Logo())), 40);
	}
	
	/** verify Sign Up link is getting navigate on Sign Up section on new tab */
	public void verifySignUpNavigation() throws Exception {
		testContext.getPageObjectManager().getPageObject(driver).switchWindow();
		Thread.sleep(2000);
		Log.message("Url:- " + PageObject.getDriver().getCurrentUrl(), true);
		if(PageObject.getDriver().getCurrentUrl().equalsIgnoreCase(FileReaderManager.getInstance().getDataReader().get_Sign_Up_Link())) {
			PageObject.getDriver().close();
			testContext.getPageObjectManager().getPageObject(driver).parentWindow();
		}else {
			PageObject.getDriver().close();
			testContext.getPageObjectManager().getPageObject(driver).parentWindow();
			fail();
		}
	}
}
	
	
	
	
	
	
		



