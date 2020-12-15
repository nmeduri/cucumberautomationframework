package automation.library.pageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
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
 * This file contains the functions of AEM footer
 * 
 */

public class AEM_Featured_List_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Featured_List_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function navigate to Feature List Author Page Page */
	public void navigateTo_Feature_List_Author_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Feature_List_Author_Page());

	}
	
	/** This function navigate to test Feature List Page Page */
	public void navigateTo_test_Feature_List_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_test_FL_Url());

	}

	/** This function navigate to Feature List Author Page Page FR */
	public void navigateTo_Feature_List_Author_Page_FR1() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Feature_List_Author_Page_FR());

	}

	/** This function navigate to Feature List Author Page Page FR */
	public void navigateTo_Feature_List_Author_Page_FR() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Feature_List_Author_Page_FR());

	}

	/** This function navigate to Informational Feature List Author Page Page */
	public void navigateTo_informational_Feature_List_Author_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getAEMDataReader().get_Informational_Feature_List_Author_Page());

	}

	/** This function navigate to Feature List Page Page */
	public void navigateTo_Feature_List_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Feature_List_Url());

	}

	/** This function navigate to Featured product List Author Page */
	public void navigateTo_Featured_product_List_Author_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Featured_ProductList_URL());

	}

	/** this function clicks on feature list panel */
	public void clickFeatureListPanel() throws Exception {
		//$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeaturedProductListPanel())), 15);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeaturedProductListPanel())));
		//$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
		//		testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeaturedProductListPanel())), 15);

		// ((JavascriptExecutor)
		// PageObject.getDriver()).executeScript("arguments[0].click();",
		// $findElement(By.xpath(testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeaturedProductListPanel())));
	}

	/** enter feature sub title title */
	public void enterFeatureSubTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()),
				FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_First());
	}

	/** reverse feature sub title details */
	public void reverseSubTitleDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()),
				FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_First_Change());
	}

	/** clear mandatory fields */
	public void clearMandatoryFields() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureAltTextOne())), 5);
		Thread.sleep(2000);
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureAltTextOne())), 5);
	}

	/** alert is getting dispalyed for mandatory field */
	public void displayAlertForImageMandatoryField() throws Exception {
		$display($(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getErrorAlertMandatory()));
	}

	/** reverse feature image one details */
	public void reverseImageOneDetails() throws Exception {
		$clearData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()));
		$enterData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()),
				FileReaderManager.getInstance().getAEMDataReader().get_FL_Image_Sub_Title_First_Change());
	}

	/** click on select type featured list drop down */
	public void clickSelectTypeDropDown() throws Exception {
		$click($(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSelectTypeFeaturedListDropDown())),
				5));
	}

	/** select image option select type featured list drpp down */
	public void selectImageOptionSelectTypeFeaturedListDropDown() throws Exception {
		$click($(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getImageOptionSelectFeatureList())),
				5));
	}

	/** verify authroing mini thershold error message */
	public void veifyAuthoringMinimumThersholdErrorMessage() throws Exception {
		String expectedResult = PageObject.getDriver().switchTo().alert().getText();
		Log.message("Alert Text:- " + expectedResult, true);
		Assert.assertEquals(expectedResult, "You have to at least add 4 items in multifield");
		PageObject.getDriver().switchTo().alert().accept();
	}

	/** enter learn more link detail */
	public void enterLearnMoreLinkDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLink()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLink()),
				FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Link_One());
	}

	/** verify - Featured list Information Sub Title */
	public void verifyFeaturedListInfomationalSubTitle() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals(
				$getText($(Loc.XPATH,
						testContext.getPageObjectManager().getFeatureListPageLocator().getFeatureListSubTitle())),
				FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_First());
		PageObject.getDriver().switchTo().parentFrame();
	}

	/** verify - Featured list Image Sub Title */
	public void verifyFeaturedListImageSubTitle() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals(
				$getText($(Loc.XPATH,
						testContext.getPageObjectManager().getAEMFeatureListPageLocator()
								.getFeatureListImageSubTitle())),
				FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_First());
		PageObject.getDriver().switchTo().parentFrame();
	}

	/** reverse feature sub title details */
	public void reverseFLImageSubTitleDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()),
				FileReaderManager.getInstance().getAEMDataReader().get_FL_Image_Sub_Title_First_Change());
	}

	/** verify learn more url is updated on page */
	public void verifyLearnMoreUrlUpdateOnPage() throws Exception {
		Log.message("HREF:- " + $getAttributeValue(
				$(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductCardOne()),
				"href"), true);
		Log.message("URL:- " + FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Link_One(), true);
		assertEquals($getAttributeValue(
				$(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductCardOne()),
				"href"), FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Link_One());
	}

	/** enter learn more label details */
	public void enterLearnMoreDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLabel()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLabel()),
				FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Label());
	}

	/** reverse the learn more changes */
	public void reverseLearnMoreChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLabel()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLabel()),
				FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Label_Change());
	}

	/** verify Learn more label is updated on the site */
	public void verifyLearnMorLabelUpdatedOnSite() throws Exception {
		Assert.assertEquals(
				$getText($(Loc.XPATH,
						testContext.getPageObjectManager().getFeatureListPageLocator().get_Learn_More_Label())),
				FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Label());
	}

	/** enter feature list image details */
	public void enterFeatureListImageDetails() throws Exception {
		$clearData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListImage()));
		$enterData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListImage()),
				FileReaderManager.getInstance().getAEMDataReader().get_Image_Feature_List_Product());
	}

	/** revert feature list image details */
	public void revertFeatureListImageDetails() throws Exception {
		$clearData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListImage()));
		$enterData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListImage()),
				FileReaderManager.getInstance().getAEMDataReader().get_Image_Feature_List_Product_Change());
	}

	/** verify configured image is updated on site */
	public void verifyConfiguredImagedUpdatedOnSite() throws Exception {
		assertEquals($getAttributeValue(
				$(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().get_Feature_List_Image()),
				"src"), FileReaderManager.getInstance().getAEMDataReader().get_Image_Feature_List_Product());
	}

	/** revert learn more link detail */
	public void revertLearnMoreLinkDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLink()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLink()),
				FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Label_Change());
	}

	/** enter descriptive message detail */
	public void enterDescriptiveMessageDetail() throws Exception {
		$clearData($(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessage()));
		$enterData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessage()),
				FileReaderManager.getInstance().getAEMDataReader().get_Descriptive_Message());
	}

	/** revert descriptive message detail */
	public void revertDescriptiveMessageDetail() throws Exception {
		$clearData($(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessage()));
		$enterData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessage()),
				FileReaderManager.getInstance().getAEMDataReader().get_Descriptive_Message_Change());
	}

	/** verify descriptive tool tip is displayed */
	public void displayDescriptiveToolTip() throws Exception {
		$click($(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessateToolTip()));
		Assert.assertEquals(
				$getText($(Loc.XPATH,
						testContext.getPageObjectManager().getAEMFeatureListPageLocator()
								.getDescriptiveMessageToolTipMessage())),
				"Add the content in this field. Please provide the guide to enter approx. 100-140 char Max.");
	}

	/** verify configured descriptive message is displayed on page */
	public void verifyConfiguredDescriptiveMessageOnPage() throws Exception {
		$display(
				$(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveMessageFl()));
		Assert.assertEquals(
				$getText($(Loc.XPATH,
						testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveMessageFl())),
				FileReaderManager.getInstance().getAEMDataReader().get_Descriptive_Message());
	}

	/** enter descriptive title detail */
	public void enterDescriptiveTitleDetail() throws Exception {
		$clearData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitle()));
		$enterData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitle()),
				FileReaderManager.getInstance().getAEMDataReader().get_Descriptive_Title());
	}

	/** revert descriptive title detail */
	public void revertDescriptiveTitleDetail() throws Exception {
		$clearData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitle()));
		$enterData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitle()),
				FileReaderManager.getInstance().getAEMDataReader().get_Descriptive_Title_Change());
	}

	/** verify descriptive title tool tip is displayed */
	public void displayDescriptiveTitleToolTip() throws Exception {
		$click($(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitleToolTip()));
		Assert.assertEquals(
				$getText($(Loc.XPATH,
						testContext.getPageObjectManager().getAEMFeatureListPageLocator()
								.getDescriptiveMessageToolTipMessage())),
				"This field will be displaying under image. Please follow guide line to enter 40-60 char Max.");
	}

	/** verify configured descriptive title is displayed on page */
	public void verifyConfiguredDescriptivTitleOnPage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveTitle()));
		Assert.assertEquals(
				$getText($(Loc.XPATH,
						testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveTitle())),
				FileReaderManager.getInstance().getAEMDataReader().get_Descriptive_Title());
	}

	/** enter feature title one details */
	public void enterFeatureTitleDetails() throws Exception {
		$clearData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()));
		$enterData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()),
				FileReaderManager.getInstance().getAEMDataReader().get_Fl_Title());
	}

	/** reverse feature image one details */
	public void revertFeatureTitleDetails() throws Exception {
		$clearData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()));
		$enterData(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()),
				FileReaderManager.getInstance().getAEMDataReader().get_Fl_Title_Change());
	}

	/** verify title tool tip is displayed */
	public void displayTitleToolTip() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getTitleToolTipFl()));
		Assert.assertEquals(
				$getText($(Loc.XPATH,
						testContext.getPageObjectManager().getAEMFeatureListPageLocator()
								.getDescriptiveMessageToolTipMessage())),
				"Title to be displayed on the page. Please follow guideline to enter 40 char Max");
	}

	/** verify configured Title is displayed on page */
	public void verifyConfiguredTitleOnPage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getFeaturedListTitle()));
		Assert.assertEquals(
				$getText($(Loc.XPATH,
						testContext.getPageObjectManager().getFeatureListPageLocator().getFeaturedListTitle())),
				FileReaderManager.getInstance().getAEMDataReader().get_Fl_Title());
	}

	/** verify Title is not authored on page */
	public void verifyTitlenotauthored() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitle()));

		$clearData($(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitle())), 5));

	}

	/** verify description is not authored on page */
	public void verifyDescriptionnotauthored() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessage()));

		$clearData($(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessage()));
	}

	/** verify LearnMore is not authored on page */
	public void verifyLearnMorenotauthored() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLabel()));
		$clearData($(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreaccessibility()));

	}

	/** verify LearnMore link is not authored on page */
	public void verifyLearnmoreLinknotauthored() throws Exception {
		$clearData($(ExpectedConditions.elementToBeClickable(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLink())),
				5));

	}

	/** verify descriptive title text not displayed */
	public void titletextnotdisplayedWhenNotAuthored() throws Exception {
		try {
			$displayFindElement(
					By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveTitle()));
			fail();
		} catch (Exception e) {
			Log.message("descriptive title is not displayed", true);
		}
	}

	/** verify descriptive message text not displayed */
	public void descriptiontextnotdisplayedWhenNotAuthored() throws Exception {
		try {
			$displayFindElement(
					By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveMessageFl()));
			fail();
		} catch (Exception e) {
			Log.message("descriptive message is not displayed", true);
		}
	}

	/** verify learnMore CTA text not displayed */
	public void LearnmoretextnotdisplayedWhenNotAuthored() throws Exception {
		try {
			$displayFindElement(
					By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getLearnMoreLinkFirst()));
			fail();
		} catch (Exception e) {
			Log.message("CTA text is not displayed", true);
		}
	}

	/** verify descriptive title text displayed */
	public void titletextdisplayedWhenAuthored() throws Exception {
		$displayFindElement(
				By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveTitle()));
	}

	/** click on featured product list component */
	public void clickFeaturedProductList() throws Exception {
		$click($(
				ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
						testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductListComponent())),
				5));
	}

	// ((JavascriptExecutor)
	// PageObject.getDriver()).executeScript("arguments[0].click();",
	// $findElement(By.xpath(testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductListComponent())));

	/** configure new tab for card or cta */
	public void selectNewTabFromDropDown() throws Exception {
		$display($(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().get_First_Card_Link_Target()));
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(testContext.getPageObjectManager().getAEMFeatureListPageLocator().get_First_Card_Link_Target())),
				10);
		$clickFindElement(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(
						testContext.getPageObjectManager().getAEMFeatureListPageLocator().get_First_Card_New_Tab())),
				10);
	}

	/** verify clicking on card will open in new tab */
	public void verifyCardOpensInNewTab() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated(
				$By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductImage())), 40);
		String url = $getAttributeValue(
				$(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductImage()), "href");
		configuration.setProperty("urlLink", url);
		// testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Link_Preview()),
		// 2);
		// $clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Preview())),
		// 10);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(
				By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getProductImage())));
		testContext.getPageObjectManager().getPageObject(driver).switchOnChildWindow();
		String expectedUrl = (java.lang.String) configuration.getProperty("urlLink");
		Log.message("Expected Url:- " + expectedUrl, true);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
	}

	/** verify clicking on cta will open in new tab */
	public void verifyCTAOpensInNewTab() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated(
				$By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getLearnMoreLinkFirst())),
				40);
		// String expectedUrl = $getAttributeValue($(Loc.XPATH,
		// testContext.getPageObjectManager().getFeatureListPageLocator().getLearnMoreLinkFirst()),
		// "href");
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(
				By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getLearnMoreLinkFirst())));
		testContext.getPageObjectManager().getPageObject(driver).switchOnChildWindow();
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals("https://www.google.com/", actualUrl);
	}

	/** enter Product code detail */
	public void enterProductCodeDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getproductCode()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getproductCode()),
				FileReaderManager.getInstance().getAEMDataReader().get_ProductCode());
	}

	/** enter Product image detail */
	public void EnterProductImageDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getproductImage()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getproductImage()),
				FileReaderManager.getInstance().getAEMDataReader().get_ProductImageURL());
	}

	/** click on delete icon in author page */
	public void click_delete_icon_author() throws Exception {
		$click($(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductFetureDeleteAEM()));
	}

	/** This function display error image */
	public void displayErrorImage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().get_ErrorImage()));

	}

	/** This function clear the mandatory field */
	public void clear_mandatory_field() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getproductCode()));
	}

	/** This function navigate to Featured Product List Author Page */
	public void navigateTo_Featured_Product_List_Author_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Featured_Product_List_AEM_Url());

	}

	/** this function clicks on featured product list panel */
	public void clickFeaturedProductListPanel() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeaturedProductListPanel())), 15);
	}

	/** enter FL_title on featured list component */
	public void enterFLTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFLTitle()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFLTitle()),
				FileReaderManager.getInstance().getAEMDataReader().get_FL_Title());
	}

	/** verify authoring Guide lines For FL Title */
	public void authoringGuidelinesForFLTitle() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getToolTipOfFLTitle())), 15);
		Thread.sleep(3000);
		// $display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH,
		// testContext.getPageObjectManager().getAEMFeatureListPageLocator().getToolTipMessageOfFLTitle())),40);
		$displayFindElement(By
				.xpath(testContext.getPageObjectManager().getAEMFeatureListPageLocator().getToolTipMessageOfFLTitle()));
		// Thread.sleep(2000);
		// $display($(Loc.XPATH,
		// testContext.getPageObjectManager().getAEMFeatureListPageLocator().getToolTipMessageOfFLTitle()));
		String mandatoryfield = $getText($(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getNotMandatoryConfiguration()));
		Log.message("mandatoryfield : " + mandatoryfield, true);
		if (!mandatoryfield.contains("*")) {
			Log.message("FL Title is not a Mandatory configuration", true);
		} else
			Log.message("FL Title is a Mandatory configuration", true);
	}

	/** verify - Featured product list Title */
	public void verifyFeaturedProductListTitle() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getTitleOfFeaturedProductList())),
				40);
		Assert.assertEquals(
				$getText($(Loc.XPATH,
						testContext.getPageObjectManager().getAEMFeatureListPageLocator()
								.getTitleOfFeaturedProductList())),
				FileReaderManager.getInstance().getAEMDataReader().get_FL_Title());
		PageObject.getDriver().switchTo().parentFrame();
	}

	/**
	 * This function navigate to Featured Product List Author Page for fr locale
	 */
	public void navigateTo_Featured_Product_List_Author_Page_Fr() throws Exception {
		driver.navigate()
				.to(FileReaderManager.getInstance().getAEMDataReader().get_Featured_Product_List_AEM_Fr_Locale_Url());
	}

	/** Redirection label on featured list component */
	public void configureRedirectionLabel() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getRedirectionLabel())), 15);
		// ((JavascriptExecutor)
		// PageObject.getDriver()).executeScript("arguments[0].click();",
		// $findElement(By.xpath(testContext.getPageObjectManager().getAEMFeatureListPageLocator().getRedirectionLabel())));
		Thread.sleep(1000);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getRedirectionLabelThisWindow())),
				15);
		// ((JavascriptExecutor)
		// PageObject.getDriver()).executeScript("arguments[0].click();",
		// $findElement(By.xpath(testContext.getPageObjectManager().getAEMFeatureListPageLocator().getRedirectionLabelThisWindow())));
	}

	/** verify click on AEM Product Card */
	public void clickOnAEMProductCard() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$click(ExpectedConditions.visibilityOfElementLocated(
				$By(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductCard())), 20);
		$display(
				ExpectedConditions.visibilityOfElementLocated(
						$By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Title())),
				40);
	}

	/** enable of product badges on featured list component */
	public void enableOfProductBadges() throws Exception {
		$click(ExpectedConditions.elementToBeClickable(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getEnableBadges())),
				20);
		$click(ExpectedConditions.elementToBeClickable(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getEnableBadges())),
				20);
	}

	/** verify - Enabled Product Badges */
	public void verifyEnableProductBadges() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$listDisplay(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getEnableBadgesInPreview());
		PageObject.getDriver().switchTo().parentFrame();
	}

	/** enable of product save story on featured list component */
	public void enableOfProductSaveStory() throws Exception {
		$click(ExpectedConditions.elementToBeClickable(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getEnableSaveStory())),
				20);
		$click(ExpectedConditions.elementToBeClickable(
				$By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getEnableSaveStory())),
				20);
	}

	/** verify - Enabled Product Save Story */
	public void verifyEnableProductSaveStory() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getErrorAlertForMandatoryFieldAEM())),
				40);
		PageObject.getDriver().switchTo().parentFrame();
	}

	/** Disable Product Description on featured list component */
	public void disableProductDescription() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDisableProductDescription())), 20);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDisableProductDescription())), 20);
	}

	/** verify - Product Brand and Title */
	public void verifyProductBrandAndTitle() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$listDisplay(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductBrandAEM());
		$listDisplay(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductTitleAEM());
		PageObject.getDriver().switchTo().parentFrame();
	}

	/** Mandatory Sections are not Authored */
	public void mandatorySectionsAreNotAuthored() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductCodeAEM()));
	}

	/** verify - Display Error Alert For Mandatory Field AEM */
	public void displayErrorAlertForMandatoryFieldAEM() throws Exception {
		Thread.sleep(1000);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getErrorAlertForMandatoryFieldAEM())),
				40);
	}

	/** Mandatory Sections are Authored */
	public void mandatorySectionsAreAuthored() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductCodeAEM()),
				FileReaderManager.getInstance().getAEMDataReader().get_Product_Code_AEM());
	}

	/** verify - Product Code */
	public void verifyMandatoryFields() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$listDisplay(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductTitleAEM());
		PageObject.getDriver().switchTo().parentFrame();
	}

	/** This function navigate to Featured Products List Page */
	public void navigateTo_Featured_List_Product_List_PageURL() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Featured_ProductList_URL());
	}

	/** clear Product List */
	public void clearDataFeaturedProductList() throws Exception {
		$clearData($(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductCodeToClear()));
	}

	/** verify mandatory error icon */
	public void verifyErroMessage() throws Exception {
		boolean value = $display(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getErrorMessage()));
		System.out.println("********** DISPLAY VALUE********" + value);
	}

	/** Enter Data in first Prod Code */
	public void enterDatainProductList() throws Exception {
		$clearData($(Loc.XPATH,
				testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductCodeToClear()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductCode()),
				FileReaderManager.getInstance().getAEMDataReader().get_ProductList_FR());
	}

	/** Enter Data in Title */
	public void enterTitleInFL() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().clearTitle()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getTitle()),
				FileReaderManager.getInstance().getAEMDataReader().get_ProductList_FR());
	}
	/** Uncheck Show Badges */
	public void uncheckshowBadges() throws Exception {
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(testContext.getPageObjectManager().getAEMFeatureListPageLocator().getShowBadges())),
				10);
	}

	


	/** Verify Configure page displaying on same page or not */
	public void verifyConfigurePage() throws Exception {
		boolean displayValue = $display(
				$(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getTitleVerification()));
	}


	/** Verify ProductCode Description */
	public void uncheckProductcodeDes() throws Exception {
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductCodeChBoxUncheck())),
				10);
	}
	
	/** Verify save story */
	public void uncheckSaveStory() throws Exception {
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSaveStoryCheckbox())),
				10);
	}
	
}
