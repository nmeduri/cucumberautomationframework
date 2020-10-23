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

public class AEM_Footer_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Footer_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function naviget to Footer Author Page */
	public void navigateTo_Footer_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Footer_Author_Url());

	}
	
	/** Clicks on Footer Pannel */
	public void clickFooterPannel() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getFooterPannel())), 5);
	}
	
	/** enter customer service sub section details */
	public void enterCustomerServerSubSectionTitleDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getOrderStatus()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getOrderStatus())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Order_Status());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getPickUpDelivery()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getPickUpDelivery())), 5, FileReaderManager.getInstance().getAEMDataReader().get_PickUp_Delivery());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getReturnExchange()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getReturnExchange())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Return_End_Exchange());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getHelpFQA()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getHelpFQA())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Help_FAQ_Section());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getContactUs()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getContactUs())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Contact_Us());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getStoreLocator()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getStoreLocator())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Store_Locator());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getProductRecall()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getProductRecall())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Product_Result());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getSafetyDataSheet()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getSafetyDataSheet())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Safty_Data_Sheet());
		
	}
	
	/** verify customer service sub section changes are reflect on site */
	public void verifyCustomerServiceSectionChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getCustomerServiceSection())), 5);
		List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getCustomerServiceSection());
		Assert.assertEquals($getText(li.get(0)), FileReaderManager.getInstance().getAEMDataReader().get_Order_Status());
		Assert.assertEquals($getText(li.get(1)), FileReaderManager.getInstance().getAEMDataReader().get_PickUp_Delivery());
		Assert.assertEquals($getText(li.get(2)), FileReaderManager.getInstance().getAEMDataReader().get_Return_End_Exchange());
		Assert.assertEquals($getText(li.get(3)), FileReaderManager.getInstance().getAEMDataReader().get_Help_FAQ_Section());
		Assert.assertEquals($getText(li.get(4)), FileReaderManager.getInstance().getAEMDataReader().get_Contact_Us());
		Assert.assertEquals($getText(li.get(5)), FileReaderManager.getInstance().getAEMDataReader().get_Store_Locator());
		Assert.assertEquals($getText(li.get(6)), FileReaderManager.getInstance().getAEMDataReader().get_Product_Result());
		Assert.assertEquals($getText(li.get(7)), FileReaderManager.getInstance().getAEMDataReader().get_Safty_Data_Sheet());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** enter customer service sub section details */
	public void reverseChangesCustomerServerSubSectionTitleDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getOrderStatus()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getOrderStatus())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Order_Status_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getPickUpDelivery()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getPickUpDelivery())), 5, FileReaderManager.getInstance().getAEMDataReader().get_PickUp_Delivery_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getReturnExchange()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getReturnExchange())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Return_End_Exchange_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getHelpFQA()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getHelpFQA())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Help_FAQ_Section_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getContactUs()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getContactUs())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Contact_Us_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getStoreLocator()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getStoreLocator())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Store_LocatorChanges());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getProductRecall()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getProductRecall())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Product_Result_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getSafetyDataSheet()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getSafetyDataSheet())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Safty_Data_Sheet_Changes());
		
	}
	
	/** enter service and solutions sub section details */
	public void enterServiceAndSolutionsSubSectionTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Two())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getFinancialServices()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getFinancialServices())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Canadian_Tire_Financial_Services());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getInstallationAssembling()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getInstallationAssembling())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Installation_Assembling());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getAutoServiceCenter()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getAutoServiceCenter())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Auto_Service_Center());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getLoanTool()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getLoanTool())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Load_Tool());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getRoadSideAssistance()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getRoadSideAssistance())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Road_Side_Assistance());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftCards()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftCards())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Gift_Cards());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getTestForLife()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getTestForLife())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Tested_For_Life());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftRegistry()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftRegistry())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Gift_Registry());
		
	}
	
	/** verify service and solution sub section changes are reflect on site */
	public void verifyServiceAndSolutionSectionChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Service_And_Installation_Updated())), 5);
		List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Service_And_Installation_Updated());
		Assert.assertEquals($getText(li.get(0)), FileReaderManager.getInstance().getAEMDataReader().get_Canadian_Tire_Financial_Services());
		Assert.assertEquals($getText(li.get(1)), FileReaderManager.getInstance().getAEMDataReader().get_Installation_Assembling());
		Assert.assertEquals($getText(li.get(2)), FileReaderManager.getInstance().getAEMDataReader().get_Auto_Service_Center());
		Assert.assertEquals($getText(li.get(3)), FileReaderManager.getInstance().getAEMDataReader().get_Load_Tool());
		Assert.assertEquals($getText(li.get(4)), FileReaderManager.getInstance().getAEMDataReader().get_Road_Side_Assistance());
		Assert.assertEquals($getText(li.get(5)), FileReaderManager.getInstance().getAEMDataReader().get_Gift_Cards());
		Assert.assertEquals($getText(li.get(6)), FileReaderManager.getInstance().getAEMDataReader().get_Tested_For_Life());
		Assert.assertEquals($getText(li.get(7)), FileReaderManager.getInstance().getAEMDataReader().get_Gift_Registry());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** enter service and solutions sub section details */
	public void reverseChangesServiceAndSolutionsSubSectionTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Two())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getFinancialServices()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getFinancialServices())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Canadian_Tire_Financial_Services_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getInstallationAssembling()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getInstallationAssembling())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Installation_Assembling_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getAutoServiceCenter()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getAutoServiceCenter())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Auto_Service_Center_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getLoanTool()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getLoanTool())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Load_Tool_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getRoadSideAssistance()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getRoadSideAssistance())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Road_Side_Assistance_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftCards()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftCards())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Gift_Cards_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getTestForLife()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getTestForLife())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Tested_For_Life_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftRegistry()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftRegistry())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Gift_Registry_Changes());
		
	}
	
	/** enter About Us sub section details */
	public void enterAboutUsSubSectionTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Three())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Canadian_Tire());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Careers()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Careers())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Careers());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Triangle()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Triangle())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Triangle_ID());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Recyling_Information()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Recyling_Information())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Recyling_Information());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Our_Brands()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Our_Brands())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Our_Brands());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Flyer_Sign_Up()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Flyer_Sign_Up())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Flyer_Sign_Up());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Sustainability()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Sustainability())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Sustainablity());
		
		
	}
	
	/** verify about us sub section changes are reflect on site */
	public void verifyAbutUsSectionChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Section())), 5);
		List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Section());
		Assert.assertEquals($getText(li.get(0)), FileReaderManager.getInstance().getAEMDataReader().get_About_Canadian_Tire());
		Assert.assertEquals($getText(li.get(1)), FileReaderManager.getInstance().getAEMDataReader().get_Careers());
		Assert.assertEquals($getText(li.get(2)), FileReaderManager.getInstance().getAEMDataReader().get_About_Triangle_ID());
		Assert.assertEquals($getText(li.get(3)), FileReaderManager.getInstance().getAEMDataReader().get_Recyling_Information());
		Assert.assertEquals($getText(li.get(4)), FileReaderManager.getInstance().getAEMDataReader().get_Our_Brands());
		Assert.assertEquals($getText(li.get(5)), FileReaderManager.getInstance().getAEMDataReader().get_Flyer_Sign_Up());
		Assert.assertEquals($getText(li.get(6)), FileReaderManager.getInstance().getAEMDataReader().get_Sustainablity());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** enter about us sub section details */
	public void reverseChangesAboutUsSubSectionTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Three())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Canadian_Tire_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Careers()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Careers())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Careers_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Triangle()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Triangle())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Triangle_ID_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Recyling_Information()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Recyling_Information())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Recyling_Information_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Our_Brands()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Our_Brands())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Our_Brands_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Flyer_Sign_Up()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Flyer_Sign_Up())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Flyer_Sign_Up_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Sustainability()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Sustainability())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Sustainablity_Changes());
		
	}
	
	/** enter Legal sub section details */
	public void enterLegalSubSectionTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Four())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Privacy_Policy()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Privacy_Policy())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Policy());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Term_And_Condition()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Term_And_Condition())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Terms_And_Conditions());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Site_Map()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Site_Map())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Site_Map());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Accessibility()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Accessibility())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Accessibility());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pricing_Policy()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pricing_Policy())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Pricing_Policy());
	}
	
	/** verify legal sub section changes are reflect on site */
	public void verifyLegalSectionChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Section_Update())), 5);
		List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Section_Update());
		Assert.assertEquals($getText(li.get(0)), FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Policy());
		Assert.assertEquals($getText(li.get(1)), FileReaderManager.getInstance().getAEMDataReader().get_Terms_And_Conditions());
		Assert.assertEquals($getText(li.get(2)), FileReaderManager.getInstance().getAEMDataReader().get_Site_Map());
		Assert.assertEquals($getText(li.get(3)), FileReaderManager.getInstance().getAEMDataReader().get_Accessibility());
		Assert.assertEquals($getText(li.get(4)), FileReaderManager.getInstance().getAEMDataReader().get_Pricing_Policy());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** enter legal sub section details */
	public void reverseChangesLegalSubSectionTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Four())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Privacy_Policy()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Privacy_Policy())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Policy_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Term_And_Condition()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Term_And_Condition())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Terms_And_Conditions_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Site_Map()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Site_Map())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Site_Map_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Accessibility()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Accessibility())), 5, FileReaderManager.getInstance().getAEMDataReader().get_AccessibilityChanges());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pricing_Policy()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pricing_Policy())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Pricing_Policy_Changes());
		
	}
}
