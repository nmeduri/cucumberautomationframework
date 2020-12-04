package automation.library.pageObjects;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
import edu.emory.mathcs.backport.java.util.Collections;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;

/**
 * This file contains the functions of PLP Page
 * 
 */

public class Standard_Masthead_Banner_Page extends PageObject {

	TestContext testContext;
	List<Float> productPrice = new ArrayList<Float>();
	ArrayList<Integer> rating = new ArrayList<Integer>();
	List<Float> price = new ArrayList<Float>();
    static int j=0;
	public Standard_Masthead_Banner_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function navigate to Masthead Banner Page */
	public void navigateTo_Masthead_Banner_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getDataReader().get_Masthead_Banner_Url());

	}
	
	/** This function navigate to AEM Masthead Banner Page */
	public void navigate_to_masthead_banner_page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Masthead_Banner_Url());

	}
	
	/** This function navigate to AEM Masthead Banner Page */
	public void navigate_to_masthead_banner_page_two() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Masthead_Banner_Url_Two());

	}
	
	/** This function navigate to Masthead Banner Page for FR */
	public void navigateTo_Masthead_Banner_Fr_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getDataReader().get_Masthead_Banner__Fr_Url());

	}
	
	/** navigate on masthead banner page */
	public void navigateToMastheadBannerTwo() throws Exception {
		driver.navigate()
		.to(FileReaderManager.getInstance().getDataReader().get_Masthead_Banner__Two_Url());
	}
	
	/** verify that masthead banner is displayed */
	public void displayMastheadBanner() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Masthead_Banner()));
	}
	
	/** verify background color is displayed for banner */
	public void displayBackgroundColorForBanner() throws Exception {
		String getAttributeValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Masthead_Banner()), "style");
		Assert.assertTrue(getAttributeValue.contains("background-color"));
	}
	
	/** verify that banner title is displayed */
	public void displayBannerTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Banner_Title()));
	}
	
	/** verify that banner description is displayed */
	public void displayBannerDescription() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Masthead_Banner_Description()));
	}
	
	/** verify that title could be up to 60 characters */
	public void veifyTitleUpTo60Characters() throws Exception {
		String getTitle = $getText($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Banner_Title()));
		int titleCharLength= getTitle.length();
		Log.message("titleCharLength:- " + titleCharLength, true);
		Assert.assertTrue(titleCharLength <=60 );
	}
	
	/** verify that description could be up to 60 characters */
	public void veifyDescriptionUpTo60Characters() throws Exception {
		String getDescription = $getText($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Masthead_Banner_Description()));
		int descriptionCharLength= getDescription.length();
		Log.message("descriptionCharLength:- " + descriptionCharLength, true);
		Assert.assertTrue(descriptionCharLength <=140 );
	}
	
	/** click on masthead banner panel */
	public void clickMastheadBannerPanel() throws Exception {
		
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Masthead_Banner_Panel()));
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Masthead_Banner_Panel())), 30);
	}
	
	/** banner title is displayed */
	public void displayBannerTitleField() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Title_Field()));
	}
	
	/** banner title tool tip is displayed */
	public void displayTitleToolTip() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Title_Tool_Tip_Icon()));
	}
	
	/** banner title tool tip is displayed */
	public void clickTitleToolTip() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Title_Tool_Tip_Icon()));
	}
	
	/** tool tip info message is displayed */
	public void displayToolTipInfoMessage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Description_Tool_Tip_Icon()));
	}
	
	/** description is displayed */
	public void displayDescriptionField() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Description_Field_AEM()));
	}
	
	/** description tool tip icon is displayed */
	public void displayDescriptionToolTipIcon() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Description_Tool_Tip_Icon()));
	}
	
	/** click on description tool tip icon */
	public void clickDescriptionToolTipIcon() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Description_Tool_Tip_Icon()));
	}
	
	/** background colour field is displayed */
	public void displayBackgroundColorField() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Background_Color_Field()));
	}
	
	/** background colour field is mandatory */
	public void displayBackgroundColorMandatoryField() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Background_Color_Mandatory()));
	}
	
	/** enter title details */
	public void enterTitleDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Title_Field()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Title_Field()), FileReaderManager.getInstance().getAEMDataReader().get_Masthead_Banner_Title());
	}
	
	/** enter description details */
	public void enterDesciptionDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Description_Field_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Description_Field_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Masthead_Banner_Description());
	}
	
	/** enter background color details */
	public void enterBackgroundColorDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Background_Color_Field()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Background_Color_Field()), FileReaderManager.getInstance().getAEMDataReader().get_Background_Color_Banner());
	}
	
	/** revert title details */
	public void revertTitleDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Title_Field()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Title_Field()), FileReaderManager.getInstance().getAEMDataReader().get_Masthead_Banner_Title_Revert());
	}
	
	/** enter description details */
	public void revertDesciptionDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Description_Field_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Description_Field_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Masthead_Banner_Description_Revert());
	}
	
	/** enter background color details */
	public void revertBackgroundColorDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Background_Color_Field()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Background_Color_Field()), FileReaderManager.getInstance().getAEMDataReader().get_Background_Color_Banner_Revert());
	}
	
	/** verify details update on screen */
	public void verifyDetailsUpdateOnScreen() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Banner_Title()));
		String expectedResult = $getText($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Banner_Title()));
		Log.message("expectedResult:- " + expectedResult , true);
		Log.message("Actual Result:- " + FileReaderManager.getInstance().getAEMDataReader().get_Masthead_Banner_Title(),  true);
		Assert.assertEquals(expectedResult, FileReaderManager.getInstance().getAEMDataReader().get_Masthead_Banner_Title());
		
		String expectedDescriptionResult = $getText($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Masthead_Banner_Description()));
		Log.message("expectedDescriptionResult:- " + expectedDescriptionResult , true);
		Log.message("Actual Result:- " + FileReaderManager.getInstance().getAEMDataReader().get_Masthead_Banner_Description(),  true);
		Assert.assertEquals(expectedDescriptionResult, FileReaderManager.getInstance().getAEMDataReader().get_Masthead_Banner_Description());
		
		//String expectedBackgroundColorResult = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Masthead_Banner()), "style");
		//Assert.assertTrue(expectedBackgroundColorResult.contains(FileReaderManager.getInstance().getAEMDataReader().get_Background_Color_Banner()));
	}
	
	/** verify breadcumbe inside banner */
	public void verifyBreadcumbInsideBanner() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getStandardMastheadBannerPageLocator().get_Breadcumb_Inside_Banner()));
	}
}	
