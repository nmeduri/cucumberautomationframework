package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
 * This file contains the functions of PDP Page
 * 
 */

public class AEM_PDP_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_PDP_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to PDP Page */
	public void navigateTo_PDP_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_PDP_Url());

	}
	
	/** This function navigate to PDP Product page */
	public void navigate_To_PDP_Product_Page() {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Pdp_Product_Author_Url());
	}
	
	/** This function clicks on specifications section */
	public void clickSpecificationsSection() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsSection()), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsSection())), 5);
	}
	
	/** This function update to specification label */
	public void updateSpecificationLabel() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsTitle())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsTitle())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Specifications());
	}
	
	/** This function update to view more specification label */
	public void updateViewMoreSpecificationLabel() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewMoreSpecifications())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewMoreSpecifications())), 5, FileReaderManager.getInstance().getAEMDataReader().get_View_More_Specifications());
	}
	
	/** This function update to view Less specification label */
	public void updateViewLessSpecificationLabel() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewLessSpecifications())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewLessSpecifications())), 5, FileReaderManager.getInstance().getAEMDataReader().get_View_Less_Specifications());
	}
	
	/** This function update to set number of specifications */
	public void updateSetNumberOfSpecificationsa() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSetNumberOfSpecifications())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSetNumberOfSpecifications())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Set_Number_Of_Specifications());
	}
	
	/** This function is verify that changes are reflected on site */
	public void verifyChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Specifications() + "']"));
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_View_More_Specifications(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_More_Less_Specifications())));
		List<Element> list = $$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format());
		Assert.assertEquals(Integer.parseInt(FileReaderManager.getInstance().getAEMDataReader().get_Set_Number_Of_Specifications()), list.size());
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_More_Less_Specifications()));
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_View_Less_Specifications(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_More_Less_Specifications())));
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** revert specifications changes */
	public void reverSpecificationsChanges() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsTitle())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsTitle())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Specifications_Reverse_Changes());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewMoreSpecifications())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewMoreSpecifications())), 5, FileReaderManager.getInstance().getAEMDataReader().get_View_More_Specifications_Reverse_Changes());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewLessSpecifications())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewLessSpecifications())), 5, FileReaderManager.getInstance().getAEMDataReader().get_View_Less_Specifications_Reverse_Changes());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSetNumberOfSpecifications())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSetNumberOfSpecifications())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Set_Number_Of_Specifications_Reverse_Changes());
	} 
	
	/** click on buy box section */
	public void clickBuyBoxSection() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Buy_Box_Section())), 4);
	}
	
	/** configure installations information */
	public void configureInstallationsInformation() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Available_At_Checkout_Label()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Available_At_Checkout_Label()), FileReaderManager.getInstance().getAEMDataReader().get_Available_At_Checkout());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Get_It_Installed_Label()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Get_It_Installed_Label()), FileReaderManager.getInstance().getAEMDataReader().get_Get_It_Installed_Label());
		$click($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Tools_Tip_Icon()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Information_Tool_Tip_Icon_Option()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Get_It_Installed_Icon()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Tools_Get_It_Installed_Icon_Option()));
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Tools_Tip_Title()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Tools_Tip_Title()), FileReaderManager.getInstance().getAEMDataReader().get_Tool_Tip_Message());
	}
	
	/** updated installation information are displayed on site */
	public void updatedInformationDisplayedOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Get_It_Installed_Preview())), FileReaderManager.getInstance().getAEMDataReader().get_Get_It_Installed_Label());
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Available_At_Checkout_Preview())), FileReaderManager.getInstance().getAEMDataReader().get_Available_At_Checkout());
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Tool_Tip_Icon_Installation()));
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Tool_Tip_Message())), FileReaderManager.getInstance().getAEMDataReader().get_Tool_Tip_Message());
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** revert installation information changes */
	public void revertInstallationChangesChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Available_At_Checkout_Label()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Available_At_Checkout_Label()), FileReaderManager.getInstance().getAEMDataReader().get_Available_At_Checkout_Change());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Get_It_Installed_Label()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Get_It_Installed_Label()), FileReaderManager.getInstance().getAEMDataReader().get_Get_It_Installed_Label_Change());
		$click($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Tools_Tip_Icon()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Tools_Tool_Tip_Icon_Option()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Get_It_Installed_Icon()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Information_Get_It_Installed_Icon_Option()));
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Tools_Tip_Title()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Tools_Tip_Title()), FileReaderManager.getInstance().getAEMDataReader().get_Tool_Tip_Message_Change());
	} 
	
	/** click on overview authorable section */
	public void clickOverviewAuthorableSection() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Overview_Section_Author())), 5);
	}
	
	/** update overview label */
	public void udpate_overview_label() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Overview_Label()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Overview_Label()), FileReaderManager.getInstance().getAEMDataReader().get_Overview_Label());
	}
	
	/** overview changes are reflect on site */
	public void verifyOverviewChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Romance_Copy_Section_Title())), FileReaderManager.getInstance().getAEMDataReader().get_Overview_Label());
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** reverse overview changes */
	public void reverse_overview_changes() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Overview_Label()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Overview_Label()), FileReaderManager.getInstance().getAEMDataReader().get_Overview_Label_Change());
	}
	
	/** click on resource authorable section */
	public void clickResourceAuthrableSection() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Resource_Section())), 5);
	}
	
	/** update user manual information */
	public void updateUseManualInformation() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Product_Merchandise_Tab()));
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Label()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Label()), FileReaderManager.getInstance().getAEMDataReader().get_User_Manual_Label());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Description()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Description()), FileReaderManager.getInstance().getAEMDataReader().get_User_Manual_Label_Description());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Download_Link()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Download_Link()), FileReaderManager.getInstance().getAEMDataReader().get_User_Manual_Download_Link_Label());
	}
	
	/** user manual changes are reflect on site */
	public void verifyUserManualChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Label_Preview())), FileReaderManager.getInstance().getAEMDataReader().get_User_Manual_Label());
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Description_Preivew())), FileReaderManager.getInstance().getAEMDataReader().get_User_Manual_Label_Description());
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Download_Link_Preview())), FileReaderManager.getInstance().getAEMDataReader().get_User_Manual_Download_Link_Label());
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** reverse user manual changes */
	public void reverse_user_manual_changes() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Product_Merchandise_Tab()));
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Label()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Label()), FileReaderManager.getInstance().getAEMDataReader().get_User_Manual_Label_Change());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Description()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Description()), FileReaderManager.getInstance().getAEMDataReader().get_User_Manual_Description_Change());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Download_Link()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_User_Manual_Download_Link()), FileReaderManager.getInstance().getAEMDataReader().get_User_Manual_Download_Link_Label_Change());
	}
	
	/** click on sticky TOC */
	public void clickStickyTOC() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().get_Sticky_TOC())), 5); 
	}
	
	/** update size label */
	public void udpate_Size_label() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSizeVariant()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSizeVariant()), FileReaderManager.getInstance().getAEMDataReader().get_Size_Label());
	}
	
	/** update color label */
	public void update_Color_label() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getColorVariant()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getColorVariant()), FileReaderManager.getInstance().getAEMDataReader().get_Color_Label());
	}
	
	/** revert size label */
	public void revert_Size_label() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSizeVariant()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSizeVariant()), FileReaderManager.getInstance().getAEMDataReader().get_Size_Label_Change());
	}
	
	/** update color label */
	public void revert_Color_label() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getColorVariant()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getColorVariant()), FileReaderManager.getInstance().getAEMDataReader().get_Color_Label_Change());
	}
	
	/** update more sections sticky TOC label */
	public void update_More_Sections_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getMoreSectionsStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getMoreSectionsStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_More_Section_Sticky_TOC());
	}
	
	/** update overview sticky TOC label */
	public void update_overview_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getOverViewStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getOverViewStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_Overviews_TOC());
	}
	
	/** update specifications sticky TOC label */
	public void update_specifications_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_Specifications_TOC());
	}
	
	/** update resources sticky TOC label */
	public void update_resources_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getResourcesStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getResourcesStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_Resources_TOC());
	}
	
	/** update videos sticky TOC label */
	public void update_videos_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getVideosStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getVideosStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_Videos_TOC());
	}
	
	/** update rating and reviews sticky TOC label */
	public void update_rating_and_reviews_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getRatingReviewsStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getRatingReviewsStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_Rating_And_Reviews_TOC());
	}
	
	/** update questions and answer sticky TOC label */
	public void update_questions_and_answer_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getQuestionsAnswer()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getQuestionsAnswer()), FileReaderManager.getInstance().getAEMDataReader().get_Questions_And_Answer_TOC());
	}
	
	/** update availability sticky TOC label */
	public void update_availability_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getAvailabilityStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getAvailabilityStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_Availability_TOC());
	}
	
	/** revert more sections sticky TOC label */
	public void revert_More_Sections_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getMoreSectionsStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getMoreSectionsStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_More_Section_Sticky_TOC_Change());
	}
	
	/** revert overview sticky TOC label */
	public void revert_overview_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getOverViewStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getOverViewStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_Overviews_TOC_Change());
	}
	
	/** revert specifications sticky TOC label */
	public void revert_specifications_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_Specifications_TOC_Change());
	}
	
	/** revert resources sticky TOC label */
	public void revert_resources_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getResourcesStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getResourcesStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_Resources_TOC_Change());
	}
	
	/** revert videos sticky TOC label */
	public void revert_videos_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getVideosStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getVideosStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_Videos_TOC_Change());
	}
	
	/** revert rating and reviews sticky TOC label */
	public void revert_rating_and_reviews_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getRatingReviewsStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getRatingReviewsStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_Rating_And_Reviews_TOC_Change());
	}
	
	/** revert questions and answer sticky TOC label */
	public void revert_questions_and_answer_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getQuestionsAnswer()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getQuestionsAnswer()), FileReaderManager.getInstance().getAEMDataReader().get_Qustions_And_Answer_TOC_Change());
	}
	
	/** revert availability sticky TOC label */
	public void revert_availability_label_Sticky_TOC() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getAvailabilityStickyTOC()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getAvailabilityStickyTOC()), FileReaderManager.getInstance().getAEMDataReader().get_Availability_TOC_Change());
	}
	
	/** verify overview changes are correctly reflected on publish page */
	public void verifyOverviewChangesPublish() throws Exception {
		testContext.getPageObjectManager().getPageObject(driver).scrollDownByCoordinates();
		Assert.assertEquals($getText(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Overview_Sticky_TOC())), 10), FileReaderManager.getInstance().getAEMDataReader().get_Overviews_TOC());
	}
	
	/** verify specifications changes are correctly reflected on publish page */
	public void verifySpecificationsChangesPublish() throws Exception {
		Assert.assertEquals($getText(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_Sticky_TOC())), 10), FileReaderManager.getInstance().getAEMDataReader().get_Specifications_TOC());
	}
	
	/** verify resources changes are correctly reflected on publish page */
	public void verifyResourcesChangesPublish() throws Exception {
		Assert.assertEquals($getText(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Resources_Sticky_TOC())), 10), FileReaderManager.getInstance().getAEMDataReader().get_Resources_TOC());
	}
	
	/** verify rating changes are correctly reflected on publish page */
	public void verifyRatingReviewChangesPublish() throws Exception {
		Assert.assertEquals($getText(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Rating_Reviews_Sticky_TOC())), 10), FileReaderManager.getInstance().getAEMDataReader().get_Rating_And_Reviews_TOC());
	}
	
	/** verify question answer changes are correctly reflected on publish page */
	public void verifyQuestionAnswerChangesPublish() throws Exception {
		Assert.assertEquals($getText(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Questions_And_Answer_Sticky_TOC())), 10), FileReaderManager.getInstance().getAEMDataReader().get_Questions_And_Answer_TOC());
	}
	
	/** update Add to cart sticky button (desktop) */
	public void updateAddToCartStickDesktopButtonSticky() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getAddToCartButtonStickyDesktop()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getAddToCartButtonStickyDesktop()), FileReaderManager.getInstance().getAEMDataReader().get_Add_To_Cart_Desktop_Label());
	}
	
	/** revert Add to cart sticky button (desktop) */
	public void revertAddToCartStickDesktopButtonSticky() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getAddToCartButtonStickyDesktop()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getAddToCartButtonStickyDesktop()), FileReaderManager.getInstance().getAEMDataReader().getAdd_To_Cart_Desktop_Label_Change());
	}
	
	/** verify add to cart (Desktop) button updated on site */
	public void verifyAddToCartDesktopButtonStickyUpdatedOnSite() throws Exception {
		Assert.assertEquals($getText(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().getAddToCartButtonSticky())), 10), FileReaderManager.getInstance().getAEMDataReader().get_Add_To_Cart_Desktop_Label());
	}
	
	/** click on Sticky box panel */
	public void clickStickyBoxPanel() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getStickyBoxPanel())), 10);
	}
	
	/** update Add to cart sticky button (Mobile) */
	public void updateAddToCartStickMobileButtonSticky() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getAddToCartButtonStickyMobile()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getAddToCartButtonStickyMobile()), FileReaderManager.getInstance().getAEMDataReader().get_Add_To_Cart_Mobile_Label());
	}
	
	/** revert Add to cart sticky button (Mobile) */
	public void revertAddToCartStickMobileButtonSticky() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getAddToCartButtonStickyMobile()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getAddToCartButtonStickyMobile()), FileReaderManager.getInstance().getAEMDataReader().getAdd_To_Cart_Mobile_Label_Change());
	}
}
