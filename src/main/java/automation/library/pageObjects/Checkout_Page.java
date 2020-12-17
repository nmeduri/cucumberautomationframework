package automation.library.pageObjects;

import static org.testng.Assert.fail;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;

/**
 * This file contains the functions of Checkout Page
 * 
 */
public class Checkout_Page extends PageObject{
	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Checkout_Page(WebDriver driver) {
		super(driver);
		testContext = new TestContext();
	}
	
	/** This function navigate to PDP Page */
	public void navigateTo_Checkout_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getCheckoutPageUrl());

	}
	
	/** This function navigate to checkout contact info Page */
	public void navigateTo_Checkout_Contact_Info_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Checkout_Contact_Info_Url());

	}
	
	/** This function navigate to checkout contact info Author Page */
	public void navigateTo_Checkout_Contact_Info_AuthorPage() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Checkout_Contact_Info_Url());

	}
	
	
	
	/** This function is verify that Checkout Page is displayed */
	public void display_Checkout_Page_Title() throws Exception {

		if(testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle().contains("Automation_SimpleheaderCheckout")) {
		Log.message("Checkout page is displayed : "+testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle(), true);
		}else {
			Log.message("Checkout page is not displayed", true);
			fail();
		}
	}
	/** This function is verify that Brand Logo is displayed */
	public void displayBrandLogo() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Brand_Logo())), 10);
	}
	/** This function is verify that Customer Service Contact Number is displayed */
	public void displayCustomerServiceContactNumber() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Customer_Service_Contact_Number())), 10);
	}
	/** This functionclick on Customer Service Contact Number  */
	public void clickCustomerServiceContactNumber() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Customer_Service_Contact_Number())), 10);
	}
	/** This function is verify that Site Language Selector is displayed */
	public void displaySiteLanguageSelector() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Site_Language_Selector())), 10);
	}
	/** This function click on Brand Logo */
	public void click_On_Brand_Logo() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Brand_Logo())), 40);
	}
	/** This function is verify that Home Page is displayed */
	public void display_Home_Page() throws Exception {

		if(testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle().contains("Shop Canada’s Top Department Store Online & at 500+ Locations | Canadian Tire")) {
		Log.message("Home page is displayed : "+testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle(), true);
		}else {
			Log.message("Home page is not displayed", true);
			fail();
		}
	}
	
	/** click on checkout contact info panel */
	public void clickCheckoutContactInfoPanel() throws Exception {
		Thread.sleep(4000);
		//$click($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Checkout_Contact_Info_Panel()));
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getCheckoutPageLocator().get_Checkout_Contact_Info_Panel())));
	}
	
	/** click on contact information tab */
	public void clickOnContactInformationTab() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Information_Tab()));
	}
	
	/** update contact information title */
	public void updateContactInformationTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Information_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Information_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Contact_Information_Title_Label());
	}
	
	/** revert contact information title */
	public void revertContactInformationTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Information_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Information_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Contact_Information_Title_Revert());
	}
	
	/** verify configured contact information title is displayed on publish page */
	public void displayConfiguredContactInformationTitleOnPublishPage() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Information_Title())), FileReaderManager.getInstance().getAEMDataReader().get_Contact_Information_Title_Label());
	}
	
	/** update email field title */
	public void updateEmailFieldTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Email_Field_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Email_Field_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Email_Field_Title());
	}
	
	/** revert email field title */
	public void revertEmailFieldTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Email_Field_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Email_Field_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Email_Field_Title_Revert());
	}
	
	/** update phone number field title */
	public void updatePhoneNumberlFieldTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Phone_Number_Field_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Phone_Number_Field_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Phone_Number_Field_Title());
	}
	
	/** revert phone number field title */
	public void revertPhoneNumberFieldTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Phone_Number_Field_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Phone_Number_Field_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Phone_Number_Field_Title_Revert());
	}
	
	/** verify configured fields title are displayed on publish page */
	public void displayConfiguredFieldTitleOnPublishPage() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Email_Field())), FileReaderManager.getInstance().getAEMDataReader().get_Email_Field_Title());
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Phone_Number_Field())), FileReaderManager.getInstance().getAEMDataReader().get_Phone_Number_Field_Title());
	}
	
	/** update next cta button label */
	public void updateNextButtonLabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Next_Button_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Next_Button_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Next_Button());
	}
	
	/** revert next cta button label */
	public void revertNextButtonLabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Next_Button_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Next_Button_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Next_Button_Revert());
	}
	
	/** verify configured next button is displayed on publish page */
	public void displayConfiguredNextButtonOnPublishPage() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Next_Button())), FileReaderManager.getInstance().getAEMDataReader().get_Next_Button());
		
	}
	
	/** update tool tip message */
	public void updateToolTipMessage() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Tool_Tip_Message_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Tool_Tip_Message_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Tool_Tip_Message_Checkout());
	}
	
	/** revert tool tip message */
	public void revertToolTipMessage() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Tool_Tip_Message_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Tool_Tip_Message_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Tool_Tip_Message_Checkout_Revert());
	}
	
	/** verify configured tool tip message is displayed on publish page */
	public void displayConfiguredToolTipMessageOnPublishPage() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Tool_Tip_Button()));
		//Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Tool_Tip_Message())), FileReaderManager.getInstance().getAEMDataReader().get_Tool_Tip_Message_Checkout());
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Tool_Tip_Message())).contains(FileReaderManager.getInstance().getAEMDataReader().get_Tool_Tip_Message_Checkout()));
	}
	
	/** This function verify contact information title is displayed */
	public void displayContactInformationTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Information_Title()));
	}
	
	/** This function verify email address is displayed */
	public void displayEmailAddress() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Info_Email_Address_Field()));
	}
	
	/** This function verify phone number is displayed */
	public void displayPhoneNumber() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Info_PhnNo_Field()));
	}
	
	/** This function verify tooltip is displayed */
	public void displayTooltipIcon() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Tool_Tip_Button()));
	}
	
	/** This function verify next CTA is displayed */
	public void displayNextCTAButton() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Next_Button()));
	}
	
	/** This function is verify that Checkout Page is displayed */
	public void displayCheckoutPageTitle() throws Exception {
		
		if(PageObject.getDriver().getTitle().contains("CheckOutContactInfo")) {
		Log.message("Checkout page is displayed : "+testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle(), true);
		}else {
			Log.message("Checkout page is not displayed", true);
			fail();
		}
	}
	
	/** This function enters contact info details */
	public void fillContactInfoDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Info_Email_Address_Field()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Info_Email_Address_Field()), FileReaderManager.getInstance().getDataReader().get_Checkout_Email_Address_Data());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Info_PhnNo_Field()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Info_PhnNo_Field()), FileReaderManager.getInstance().getDataReader().get_Checkout_PhnNo_Data());
		}
	
	/** This function verify next CTA is displayed */
	public void clickOnNextCTAButton() throws Exception {
		//$click($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Next_Button()));
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getCheckoutPageLocator().get_Next_Button())));
	}
	
	/** This function verify contact info drawer is displayed */
	public void displayContactInfoDrawer() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Contact_Info_Drawer()));
	}
	
	/** This function verify shipping info title is displayed */
	public void displayShippingInformationTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Shipping_Information_Title()));
	}
	
	/** This function clicks on tooltip */
	public void clickOnTooltipIcon() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Tool_Tip_Button()));
	}
	
	/** This function verify tooltip message is displayed */
	public void displayTooltipMessage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Tool_Tip_Message()));
	}
	
	/** This function verify tooltip message is displayed */
	public void acceptWindowAlert() throws Exception {
		PageObject.getDriver().switchTo().alert().accept();
	}
	
}
