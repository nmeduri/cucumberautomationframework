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
import org.openqa.selenium.WebDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
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
	/** This function navigate to Feature List Author Page Page FR */
	public void navigateTo_Feature_List_Author_Page_FR1() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Feature_List_Author_Page_FR());

	}
	
	/** This function navigate to Informational Feature List Author Page Page */
	public void navigateTo_informational_Feature_List_Author_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Informational_Feature_List_Author_Page());

	}
	
	/** This function navigate to Feature List Page Page */
	public void navigateTo_Feature_List_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Feature_List_Url());

	}
	/** This function navigate to Featured product List Author Page  */
	public void navigateTo_Featured_product_List_Author_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Featured_ProductList_URL());

	}
	
	/** this function clicks on feature list panel */
	public void clickFeatureListPanel() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListPanel())), 15);
	}
	
	/** enter feature sub title title */
	public void enterFeatureSubTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()), FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_First());
	}
	
	/** reverse feature sub title details */
	public void reverseSubTitleDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()), FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_First_Change());
	}
	
	/** clear mandatory fields*/
	public void clearMandatoryFields() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureAltTextOne())), 5);
		Thread.sleep(2000);
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureAltTextOne())), 5);
	}
	
	/** alert is getting dispalyed for mandatory field */
	public void displayAlertForImageMandatoryField() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getErrorAlertMandatory()));
	}
	
	/** reverse feature image one details */
	public void reverseImageOneDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()), FileReaderManager.getInstance().getAEMDataReader().get_FL_Image_Sub_Title_First_Change());
	}
	
	/** click on select type featured list drop down */
	public void clickSelectTypeDropDown() throws Exception {
		$click($(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSelectTypeFeaturedListDropDown())), 5));
	}
	
	/** select image option select type featured list drpp down */
	public void selectImageOptionSelectTypeFeaturedListDropDown() throws Exception {
		$click($(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getImageOptionSelectFeatureList())), 5));
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
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLink()), FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Link_One());
	}
	
	/** verify - Featured list Information Sub Title */
	public void verifyFeaturedListInfomationalSubTitle() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getFeatureListSubTitle())), FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_First());
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** verify - Featured list Image Sub Title */
	public void verifyFeaturedListImageSubTitle() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListImageSubTitle())), FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_First());
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** reverse feature sub title details */
	public void reverseFLImageSubTitleDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()), FileReaderManager.getInstance().getAEMDataReader().get_FL_Image_Sub_Title_First_Change());
	}
	
	/** verify learn more url is updated on page */
	public void verifyLearnMoreUrlUpdateOnPage() throws Exception {
		Log.message("HREF:- " + $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductCardOne()), "href"), true);
		Log.message("URL:- " + FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Link_One(), true);
		assertEquals($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getProductCardOne()), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Link_One());
	}
	
	/** enter learn more label details */
	public void enterLearnMoreDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLabel()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLabel()), FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Label());
	}
	
	/** reverse the learn more changes */
	public void reverseLearnMoreChanges() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLabel()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLabel()), FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Label_Change());
	}
	
	/** verify Learn more label is updated on the site */
	public void verifyLearnMorLabelUpdatedOnSite() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().get_Learn_More_Label())), FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Label());
	}
	
	/** enter feature list image details */
	public void enterFeatureListImageDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListImage()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListImage()), FileReaderManager.getInstance().getAEMDataReader().get_Image_Feature_List_Product());
	}
	
	/** revert feature list image details */
	public void revertFeatureListImageDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListImage()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListImage()), FileReaderManager.getInstance().getAEMDataReader().get_Image_Feature_List_Product_Change());
	}
	
	/** verify configured image is updated on site */
	public void verifyConfiguredImagedUpdatedOnSite() throws Exception {
		assertEquals($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().get_Feature_List_Image()), "src"), FileReaderManager.getInstance().getAEMDataReader().get_Image_Feature_List_Product());
	}
	
	/** revert learn more link detail */
	public void revertLearnMoreLinkDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLink()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLink()), FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Label_Change());
	}
	
	/** enter descriptive message detail */
	public void enterDescriptiveMessageDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessage()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessage()), FileReaderManager.getInstance().getAEMDataReader().get_Descriptive_Message());
	}
	
	/** revert descriptive message detail */
	public void revertDescriptiveMessageDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessage()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessage()), FileReaderManager.getInstance().getAEMDataReader().get_Descriptive_Message_Change());
	}
	
	/** verify descriptive tool tip is displayed */
	public void displayDescriptiveToolTip() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessateToolTip()));
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessageToolTipMessage())), "Add the content in this field. Please provide the guide to enter approx. 100-140 char Max.");
	}
	
	/** verify configured descriptive message is displayed on page */
	public void verifyConfiguredDescriptiveMessageOnPage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveMessageFl()));
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveMessageFl())), FileReaderManager.getInstance().getAEMDataReader().get_Descriptive_Message());
	}
	
	/** enter descriptive title detail */
	public void enterDescriptiveTitleDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitle()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitle()), FileReaderManager.getInstance().getAEMDataReader().get_Descriptive_Title());
	}
	
	/** revert descriptive title detail */
	public void revertDescriptiveTitleDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitle()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitle()), FileReaderManager.getInstance().getAEMDataReader().get_Descriptive_Title_Change());
	}
	
	/** verify descriptive title tool tip is displayed */
	public void displayDescriptiveTitleToolTip() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitleToolTip()));
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessageToolTipMessage())), "This field will be displaying under image. Please follow guide line to enter 40-60 char Max.");
	}
	
	/** verify configured descriptive title is displayed on page */
	public void verifyConfiguredDescriptivTitleOnPage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveTitle()));
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveTitle())), FileReaderManager.getInstance().getAEMDataReader().get_Descriptive_Title());
	}
	
	/** enter feature title one details */
	public void enterFeatureTitleDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()), FileReaderManager.getInstance().getAEMDataReader().get_Fl_Title());
	}
	
	/** reverse feature image one details */
	public void revertFeatureTitleDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()), FileReaderManager.getInstance().getAEMDataReader().get_Fl_Title_Change());
	}
	
	/** verify title tool tip is displayed */
	public void displayTitleToolTip() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getTitleToolTipFl()));
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessageToolTipMessage())), "Title to be displayed on the page. Please follow guideline to enter 40 char Max");
	}
	
	/** verify configured Title is displayed on page */
	public void verifyConfiguredTitleOnPage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getFeaturedListTitle()));
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getFeaturedListTitle())), FileReaderManager.getInstance().getAEMDataReader().get_Fl_Title());
	}
	/** verify Title is not authored  on page */
	public void verifyTitlenotauthored() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitle()));

		$clearData($(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveTitle())), 5));

	}
	/** verify description is not authored  on page */
	public void verifyDescriptionnotauthored() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessage()));

		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getDescriptiveMessage()));
	}
	/** verify LearnMore is not authored  on page */
	public void verifyLearnMorenotauthored() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLabel()));
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreaccessibility()));

	}
	/** verify LearnMore link is not authored  on page */
	public void verifyLearnmoreLinknotauthored() throws Exception {
		$clearData($(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLink())), 5));

	}

	/** verify descriptive title text not displayed  */
	public void titletextnotdisplayedWhenNotAuthored() throws Exception {
		try {
			$displayFindElement(By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveTitle()));
			fail();
		}catch(Exception e) {
			Log.message("descriptive title is not displayed", true);
		}
	}
	/** verify descriptive message text not displayed  */
	public void descriptiontextnotdisplayedWhenNotAuthored() throws Exception {
		try {
			$displayFindElement(By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveMessageFl()));
			fail();
		}catch(Exception e) {
			Log.message("descriptive message is not displayed", true);
		}
	}
	/** verify learnMore CTA text not displayed  */
	public void LearnmoretextnotdisplayedWhenNotAuthored() throws Exception {
		try {
			$displayFindElement(By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getLearnMoreLinkFirst()));
			fail();
		}catch(Exception e) {
			Log.message("CTA text is not displayed", true);
		}
	}
	/** verify descriptive title text displayed  */
	public void titletextdisplayedWhenAuthored() throws Exception {
		$displayFindElement(By.xpath(testContext.getPageObjectManager().getFeatureListPageLocator().getDescriptiveTitle()));
		}
	/** click on featured product list component  */
	public void clickFeaturedProductList() throws Exception {
		$click($(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductListComponent())), 5));

		//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductListComponent())));
	
	}
	
	/** enter Product code detail */
	public void enterProductCodeDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getproductCode()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getproductCode()), FileReaderManager.getInstance().getAEMDataReader().get_ProductCode());
	}
	/** enter Product image detail */
	public void EnterProductImageDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getproductImage()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getproductImage()), FileReaderManager.getInstance().getAEMDataReader().get_ProductImageURL());
	}
	/** click on delete icon in author page */
	public void click_delete_icon_author() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getProductFetureDeleteAEM()));
	}
	/** This function display error image  */
	public void displayErrorImage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().get_ErrorImage()));

	}
	/** This function clear the mandatory field   */
	public void clear_mandatory_field() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getproductCode()));
	}
	}

