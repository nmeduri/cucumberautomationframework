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

public class AEM_PLP_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_PLP_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function naviget to PLP Page */
	public void navigateTo_PLP_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_PLP_Author_Url());

	}
	
	/** This function clicks on PLP Pannel */
	public void clickPLPPannel() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getPLPPannel()), 10);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getPLPPannel()));
	}
	
	/** This function update data to Initial Number of Products */
	public void updateDataIntialNumberOfProducts() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getInitialNumberOfProducts())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getInitialNumberOfProducts()), FileReaderManager.getInstance().getAEMDataReader().get_Initial_Number_Of_Products());
	}
	
	/** This function is verify that number of product changes are reflected on site */
	public void verifyNumberOfProductsChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())).contains(FileReaderManager.getInstance().getAEMDataReader().get_Initial_Number_Of_Products()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View_Button()));
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())).contains(FileReaderManager.getInstance().getAEMDataReader().get_Initial_Number_Of_Products()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button()));
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** reverse the product number changes */
	public void reverseProductNumberChanges() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getInitialNumberOfProducts())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getInitialNumberOfProducts()), FileReaderManager.getInstance().getAEMDataReader().get_Initial_Number_Of_Products_Reverse_Changes());
	}
	
	/** This function clicks on show more */
	public void clickShowMore() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())), 5);
	}
	
	/** enter show more count */
	public void enterShowMoreCount() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMoreCountField())), 5);
		configuration.setProperty("showMoreCountOriginal", $getText($($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMoreCountField()))));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMoreCountField()), FileReaderManager.getInstance().getAEMDataReader().get_Show_More_Count());
	}
	
	/** This function is verify that show more count changes are reflected on site */
	public void verifyShowMoreCountUpdateOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())), 10);
		String showMore = $getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore()));
		String showMoreCount[] = showMore.split(" ");
		int showMoreCountTotal = Integer.parseInt(showMoreCount[1]) - Integer.parseInt(FileReaderManager.getInstance().getAEMDataReader().get_Show_More_Count());
		String showMoreCountBeforeUpdate = (java.lang.String) conf.getProperty("showMoreCountOriginal");
		Assert.assertEquals(String.valueOf(showMoreCountTotal), showMoreCountBeforeUpdate);
		
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View_Button()));
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())), 10);
		Assert.assertEquals(String.valueOf(showMoreCountTotal), showMoreCountBeforeUpdate);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button()));
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** This function clicks on show more button */
	public void clickShowMoreButton() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())), 5);
	}
	
	/** reverse the show more changes */
	public void reverseShowMoreChanges() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMoreCountField())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMoreCountField()), FileReaderManager.getInstance().getAEMDataReader().get_Show_More_Count_Changes());
	}
	
	/** enter search response count */
	public void enterSearchResponseCount() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getSearchResponseCount())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getSearchResponseCount()), FileReaderManager.getInstance().getAEMDataReader().get_Search_Response_Count());
	}
	
	/** This function is verify that search response count changes are reflected on site */
	public void verifySearchResponseCountUpdateOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())).contains(FileReaderManager.getInstance().getAEMDataReader().get_Search_Response_Count()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View_Button()));
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())).contains(FileReaderManager.getInstance().getAEMDataReader().get_Search_Response_Count()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button()));
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** reverse the search response count changes */
	public void reverseSearchResponseCountChanges() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getSearchResponseCount())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getSearchResponseCount()), FileReaderManager.getInstance().getAEMDataReader().get_Search_Response_Count_Changes());
	}
	
	/** enter pagination result message */
	public void enterPaginationResultMessage() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getPaginationResultMessage())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getPaginationResultMessage()), FileReaderManager.getInstance().getAEMDataReader().get_Paginarion_Result_Message());
	}
	
	/** This function is verify that pagination result message changes are reflected on site */
	public void verifyPaginationResultMessageUpdateOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())).contains(FileReaderManager.getInstance().getAEMDataReader().get_Paginarion_Result_Message()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View_Button()));
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())).contains(FileReaderManager.getInstance().getAEMDataReader().get_Paginarion_Result_Message()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button()));
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** reverse the pagination result message changes */
	public void reversePaginationResultMessageChanges() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getPaginationResultMessage())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMoreCountField()), FileReaderManager.getInstance().getAEMDataReader().get_Pagination_Result_Message_Changes());
	}
	
	/** enter show more button text */
	public void enterShowMoreButtonText() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().get_Show_More_Button())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().get_Show_More_Button()), FileReaderManager.getInstance().getAEMDataReader().get_Show_More_Button());
	}
	
	/** This function is verify that pagination result message changes are reflected on site */
	public void verifyShowMoreButtonTextUpdateOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().get_Show_More_Button())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().get_Show_More_Button())).contains(FileReaderManager.getInstance().getAEMDataReader().get_Show_More_Button()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View_Button()));
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().get_Show_More_Button())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().get_Show_More_Button())).contains(FileReaderManager.getInstance().getAEMDataReader().get_Show_More_Button()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button()));
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** reverse the show more button changes */
	public void reverseShowMoreButtonChanges() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().get_Show_More_Button())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().get_Show_More_Button()), FileReaderManager.getInstance().getAEMDataReader().get_Show_More_Count_Changes());
	}
	
	/** enter end of pagination message */
	public void enterEndOfPaginationMessage() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getEndOfPaginationMessage())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getEndOfPaginationMessage()), FileReaderManager.getInstance().getAEMDataReader().get_End_Of_Pagination_Message());
	}
	
	/** This function is verify that number of product changes are reflected on site */
	public void verifyEndOfPaginationMessageChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getEndOfPaginationMessage())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getEndOfPaginationMessage())).contains(FileReaderManager.getInstance().getAEMDataReader().get_End_Of_Pagination_Message()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View_Button()));
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getEndOfPaginationMessage())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getEndOfPaginationMessage())).contains(FileReaderManager.getInstance().getAEMDataReader().get_End_Of_Pagination_Message()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button()));
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** reverse the End OF Pagination Message changes */
	public void reverseEndOfPaginationMessageChanges() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getEndOfPaginationMessage())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().get_Show_More_Button()), FileReaderManager.getInstance().getAEMDataReader().get_End_Of_Pagination_Message_Changes());
	}
	
	/** enter back to top button label */
	public void enterBackToTopButtonLabel() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getBackToTopButton())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getBackToTopButton()), FileReaderManager.getInstance().getAEMDataReader().get_Back_To_Top());
	}
	
	/** This function is verify that back to top button's label changes are reflected on site */
	public void verifyBackToTopButtonLabelChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getBackToTopButton())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getBackToTopButton())).contains(FileReaderManager.getInstance().getAEMDataReader().get_Back_To_Top()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View_Button()));
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getEndOfPaginationMessage())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getBackToTopButton())).contains(FileReaderManager.getInstance().getAEMDataReader().get_Back_To_Top()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button()));
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** reverse the back to top button's label changes */
	public void reverseBackToTopButtonLabelChanges() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getBackToTopButton())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().get_Show_More_Button()), FileReaderManager.getInstance().getAEMDataReader().get_Back_To_Top_Changes());
	}
	
	/** user click on hide option */
	public void clickHideOption() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getHideOption()));
	}
	
	/** user click on unhide option */
	public void clickUnhideOption() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getUnhideOption()));
	}
	
	/** click on sorting tab */
	public void clickSortingTab() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getSortingTab()));
	}
	
	
}
