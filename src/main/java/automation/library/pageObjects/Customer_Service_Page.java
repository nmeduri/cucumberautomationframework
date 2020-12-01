package automation.library.pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import groovyjarjarantlr4.v4.runtime.tree.xpath.XPath;

/**
 * This file contains the functions of Customer Service Page
 * 
 */
public class Customer_Service_Page extends PageObject{

	TestContext testContext;

	public Customer_Service_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function navigate to Customer Service page */
	public void navigateTo_Customer_Service_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getCustomerServicePageUrl());
	}
	
	/** This function navigate to Customer Service page FR */
	public void navigateTo_Customer_Service_Page_FR() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getCustomerServicePageUrl_FR());
	}
	
	/** This function is verify that Customer Service Page is displayed */
	public void display_Customer_Service_Page() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getCustomerServicePageLocator().get_Title_Customer_Service_Page()));

	}
	/** This function is verify that Customer Service Title is displayed */
	public void display_Title_Customer_Service_Page() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getCustomerServicePageLocator().get_Title_Customer_Service_Page()));

	}
	/** This function is verify that Customer Service Description is displayed*/
	public void display_Description_Customer_Service_Page() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCustomerServicePageLocator().get_Description_Customer_Service_Page()));
	}
	/** This function is verify that Customer Service accordion subtitle is displayed*/
	public void display_accordion_subtitle_Customer_Service_Page() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCustomerServicePageLocator().get_Accordion_subtitleTitle1_Customer_Service_Page()));
	}
	/** This function click accordion subtitle */
	public void clickOnaccordion_subtitle() throws Exception {
		String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getCustomerServicePageLocator().get_Accordion_subtitleTitle1_Customer_Service_Page()), "href");
		configuration.setProperty("urlAccordionSubtitle", url);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getCustomerServicePageLocator().get_Accordion_subtitleTitle1_Customer_Service_Page())));
	}
	
	/** This function is verify that Link is successfully navigate on accordion subtitle */
	public void verifyLinkNavigateOnAccordionSubtitle() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		String expectedUrl = (java.lang.String) configuration.getProperty("urlAccordionSubtitle");
		Log.message("Expected Url:- " + expectedUrl, true);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
	}
	/** This function is verify that Customer Service Accordions are displayed*/
	public void display_Accordions_Customer_Service_Page() throws Exception {
		
		$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getCustomerServicePageLocator().get_Accordions_Customer_Service_Page());
	}
	/** This function verify that Customer Service Accordions + icon are displayed*/
	public void display_Accordions_Plus_icon() throws Exception {
		
		$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getCustomerServicePageLocator().get_accordion_plus_icon());
	}
    public void display_Accordions_Minus_icon() throws Exception {
		
		$display($(Loc.XPATH,testContext.getPageObjectManager().getCustomerServicePageLocator().get_accordion_minus_icon()));
	}
	/** This function click Customer Service Accordions + icon */
	public void click_Accordion_Plus_icon() throws Exception {
		
		$click($(Loc.XPATH,testContext.getPageObjectManager().getCustomerServicePageLocator().get_accordion_plus_icon()));
	}
	/** This function click Customer Service Accordions - icon */
	public void click_Accordion_minus_icon() throws Exception {
		
		$click($(Loc.XPATH,testContext.getPageObjectManager().getCustomerServicePageLocator().get_accordion_minus_icon()));
	}
	/** This function is verify that Customer Service of Multiple Topics are displayed*/
	public void display_Multiple_Topics_Customer_Service_Page() throws Exception {
		
		$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getCustomerServicePageLocator().get_Multiple_Topics_Customer_Service_Page());
	}
	
	/** This function is verify that Customer Service Section Separators is displayed*/
	public void display_Section_Separators_Customer_Service_Page() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCustomerServicePageLocator().get_Section_Separators_Customer_Service_Page()));
	}
	/** This function is verify that Customer Service accordion description is displayed*/
	public void display_accordion_description_Customer_Service_Page() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCustomerServicePageLocator().get_accordionDescription()));
	}
	
	/** This function is verify that Customer Service of Links Description is displayed*/
	public void display_Links_Description() throws Exception {
		
		$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getCustomerServicePageLocator().get_Links_Description());
	}
	/** This function is verify that Customer Service of Links Description is displayed*/
	public void clickable_Title_Is_Displayed() throws Exception {
		
		$listDisplay(Loc.XPATH,testContext.getPageObjectManager().getCustomerServicePageLocator().get_Links_Title());
	}
	/** This function is verify that Customer Service of Links Description is displayed*/
	public void verify_Redirected_To_The_Subpage_When_clicks_On_The_Title() throws Exception {
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getCustomerServicePageLocator().get_Links_Title()));
		Log.message("Size:-  " + li.size(), true);
		for(int i=0; i<li.size(); i++) {
			li.get(i).click();
			testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).switchWindow();
			testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).switchOnChildWindow();
			testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).closeChildWindow();
			testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).parentWindow();
		}	
	}
	
	/** This function click on wrench section */
	public void clickWrenchToEdit() throws Exception{
		$click($(Loc.XPATH, testContext.getPageObjectManager().getCustomerServicePageLocator().get_clickWrenchIcon()));
	}
	
	/** This function click on wrench section */
	public void updateDescription() throws Exception{
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCustomerServicePageLocator().get_updateDescription()));
	    $enterData($(Loc.XPATH, testContext.getPageObjectManager().getCustomerServicePageLocator().get_updateDescription()),FileReaderManager.getInstance().getAEMDataReader().get_descriptionAccoridon());
	}
	
	/** This function click on wrench section */
	public void revertDescription() throws Exception{
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCustomerServicePageLocator().get_updateDescription()));
	    $enterData($(Loc.XPATH, testContext.getPageObjectManager().getCustomerServicePageLocator().get_updateDescription()),FileReaderManager.getInstance().getAEMDataReader().get_descriptionAccoridonRevert());
	}
	
	/** verify last name update on screen */

    public void assertDescriptiononPublish() throws Exception {

        String expectedResult = $getText($(Loc.XPATH, testContext.getPageObjectManager().getCustomerServicePageLocator().get_assertDescription()));

        Assert.assertEquals(expectedResult, FileReaderManager.getInstance().getAEMDataReader().get_descriptionAccoridon());

    }
}
