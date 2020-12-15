package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class Contact_Us_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Contact_Us_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to contact us Page */
	public void navigateTo_Contact_Us_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getDataReader().get_Contact_Us_Url());

	}
	
	/** This function navigate to contact us Fr Page */
	public void navigateTo_Contact_Us_Fr_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getDataReader().get_Contact_Us_Fr_Url());

	}
	
	/** This function navigate to contact us Authorable Page */
	public void navigateTo_Contact_Us_Authorable_Page() throws Exception {

		driver.navigate()
				.to(FileReaderManager.getInstance().getAEMDataReader().get_Contact_Us_Authorable_Url());

	}
	
	/** enter invalid Details for First Name, Last Name, Email, Order Number */
	public void enterInvalidDetailsFirstNameLastNameEmailOrderNumber() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_First_Name()), FileReaderManager.getInstance().getDataReader().get_Invalid_Detail());
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Last_Name()), FileReaderManager.getInstance().getDataReader().get_Invalid_Detail());
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Email()), FileReaderManager.getInstance().getDataReader().get_Invalid_Detail());
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Order_Number()), FileReaderManager.getInstance().getDataReader().get_Invalid_Detail());
	}
	
	/** verify error messages are displayed for First Name Last Name Email Order Number */
	public void displayErrorMessageForInvalidFirstNameLastNameEmailOrderNumber() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Invalid_First_Name_Error_Message()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Invalid_Last_Name_Error_Message()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Invalid_Email_Error_Message()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Invalid_Order_Number_Error_Message()));
	}
	
	/** click on send message button */
	public void clickSendMessageButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Send_Message_Button()));
	}
	
	/** verify error messages when mandatory fields are blank */
	public void displayErrorMessageWhenMandatoryFieldsAreBlank() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Error_Message_Empty_First_Name()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Error_Message_Empty_Last_Name()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Error_Message_Empty_Email()));
	}
	
	/** enter First Name, Last Name, Email, Order Number with maximum number of characters */
	public void enterFirstNameLastNameEmailOrderNumberWithMaxNumberOfCharacters() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_First_Name()), FileReaderManager.getInstance().getDataReader().get_First_Name_More_Than_50_Char());
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Last_Name()), FileReaderManager.getInstance().getDataReader().get_Last_Name_More_Than_50_Char());
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Email()), FileReaderManager.getInstance().getDataReader().get_Email_More_Than_250_Char());
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Order_Number()), FileReaderManager.getInstance().getDataReader().get_Order_Number_More_Than_16_Char());
	}
	
	/** verify field is not taking exceeding limit */
	public void verifyFieldNotTakingExceedingLimit() throws Exception {
		String getFirstNameValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_First_Name()), "value");
		String getLastNameValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Last_Name()), "value");
		String getEmailValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Email()), "value");
		String getOrderNumberValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Order_Number()), "value");

		Assert.assertEquals(getFirstNameValue.length(), 50);
		Assert.assertEquals(getLastNameValue.length(), 50);
		Assert.assertEquals(getEmailValue.length(), 256);
		Assert.assertEquals(getOrderNumberValue.length(), 16);
	}
	
	/** verify user able to enter first name and last name */
	public void verifyUserAbleToEnterFirstNameAndLastName() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_First_Name()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_First_Name()), FileReaderManager.getInstance().getDataReader().get_FirstName());
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Last_Name()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Last_Name()), FileReaderManager.getInstance().getDataReader().get_LastName());
		Assert.assertEquals($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_First_Name()), "value"), FileReaderManager.getInstance().getDataReader().get_FirstName());
		Assert.assertEquals($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Last_Name()), "value"), FileReaderManager.getInstance().getDataReader().get_LastName());
	}

	/** enter first name */
	public void enterFirstNameDetail() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_First_Name()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_First_Name()), FileReaderManager.getInstance().getDataReader().get_FirstName());
	}
	
	/** verify user is able to see contact form on contact us page */
	public void verifyUserAbleToSeeContactFormOnContactUsPage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Contact_Us_Form_Title()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_First_Name()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Last_Name()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Email()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Information()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Send_Message_Button()));
	}
	
	/** click on please select drop down field */
	public void clickOnPleaseSelectDropDownField() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject()));
	}
	
	/** user able to see please select subject dropdown and select option */
	public void verifyUserAbleToSeeDropDownPleaseSelectSubject() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject_Drop_Down_Option()));
		String getOption = $getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject_Drop_Down_Option()));
		//$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject_Drop_Down_Option()));
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject_Drop_Down_Option())));
		String getSelectedValue = $getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Selected_Value_Drop_Down_Please_Select_Subject()));
		Assert.assertEquals(getOption.trim(), getSelectedValue.trim());
	}
	
	/** select Drop Down Value */
	public void selectPleaseSelectDropDownValue() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject_Drop_Down_Option()));
		String getOption = $getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject_Drop_Down_Option()));
		//$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject_Drop_Down_Option()));
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject_Drop_Down_Option())));
	}
	
	/** click on email field */
	public void clickOnEmailField() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Email()));
	}
	
	/** user able to enter valid email address */
	public void verifyUserAbleToEnterValidEmailAddress() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Email()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Email()), FileReaderManager.getInstance().getDataReader().get_Email_Data() + "@test.com");
		String getEmailValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Email()), "value");
		Assert.assertEquals(getEmailValue, FileReaderManager.getInstance().getDataReader().get_Email_Data() + "@test.com");
	}
	
	/** click on additional information field */
	public void clickOnAdditionalInformationField() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Information()));
	}
	
	/** user able to enter the requested additional information of characters */
	public void verifyUserAbleToEnterTheRequestedAdditionalInformationOfCharacters() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Information()), FileReaderManager.getInstance().getDataReader().get_Additonal_Infomration_More());
		String getValue = $getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Information()));
		Assert.assertEquals(getValue, FileReaderManager.getInstance().getDataReader().get_Additonal_Infomration_More());
	}
	
	/** user able to view number of character entered by the user as well as total number */
	public void verifyUserAbleToViewNumberOfCharacterEnteredByTheUserAsWellAsTotalNumber() throws Exception {
		
		String getValue = $getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Information()));
		Assert.assertEquals(getValue.length(), FileReaderManager.getInstance().getDataReader().get_Additonal_Infomration_More().length());
	}
	
	/** user will not able to maximum number of character as shown on the form */
	public void verifyUserWillNotAbleToMaximumNumberOfCharacterAsShownOnTheForm() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Information()), FileReaderManager.getInstance().getDataReader().get_Additonal_Infomration_More_Than_300_Char());
		String getValue = $getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Information()));
		String getCharCount = $getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Information_Character_Count()));
		String charCount[] = getCharCount.split("/");
		Assert.assertEquals(getValue.length(), Integer.parseInt(charCount[1]));
	}
	
	/** click on order number field */
	public void clickOnOrderNumberField() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Order_Number()));
	}
	
	/** user able to enter the order number details */
	public void verifyUserAbleToEnterOrderNumberDetails() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Order_Number()), FileReaderManager.getInstance().getDataReader().get_Order_Number_Detail());
		String getValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Order_Number()), "value");
		Assert.assertEquals(getValue, FileReaderManager.getInstance().getDataReader().get_Order_Number_Detail());
	}
	
	/** click on last name field */
	public void clickOnLastNameField() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Last_Name()));
	}
	
	/** click on first name field */
	public void clickOnFirstNameField() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_First_Name()));
	}
	
	/** verify gray label shift to up from original space */
	public void verifyGrayLabelShiftToUpFromOriginalSpace() throws Exception {
		String labelPosition = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_First_Name_Label()), "position");
		Assert.assertEquals("absolute", labelPosition);
	}
	
	/** verify gray label shift back to original space */
	public void verifyGrayLabelShiftBackToOriginalSpace() throws Exception {
		String labelPosition = $getCSSValue($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_First_Name_Label()), "position");
		Assert.assertEquals("absolute", labelPosition);
	}
	
	/** enter last name */
	public void enterLastNameDetail() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Last_Name()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Last_Name()), FileReaderManager.getInstance().getDataReader().get_LastName());
	}
	
	/** enter additional information */
	public void enterAdditionalInformation() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Information()), FileReaderManager.getInstance().getDataReader().get_Additonal_Infomration_More());
		String getValue = $getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Information()));
		Assert.assertEquals(getValue, FileReaderManager.getInstance().getDataReader().get_Additonal_Infomration_More());
	}
	
	/** verify confirmation screen is displayed */
	public void displayConfirmationScreen() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Confirmation_Message_Form_Submit()));
	}
	
	/** click on continue shopping button */
	public void clickOnContinueShoppingButton() throws Exception {
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getContactUsPageLocator().get_Continue_Shopping_Button())));
	}
	
	/** link is navigate on canadian tire site */
	public void verifyNavigateOnCanadianTireSiteInSameTab() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Canadian_Tire_Logo()));
	}
	 
	/** click on contact Us Panel */
	public void clickContactUsPanel() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Contact_Us_Panel_AEM()));
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getContactUsPageLocator().get_Contact_Us_Panel_AEM())));
		//$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Contact_Us_Panel_AEM()));
	}
	
	/** update additional info max count */
	public void updateAdditionalInfoMaxCount() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Info_Max_Count_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Info_Max_Count_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_max_char_additional_information());
	}
	
	/** revert additional info max count */
	public void revertAdditionalInfoMaxCount() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Info_Max_Count_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Info_Max_Count_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_max_char_additional_information_Revert());
	}
	
	/** verify configured max char is visible on publish page */
	public void configuredMaxCharVisibleOnPublishPage() throws Exception {
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Max_Char_Additional_Info())).contains(FileReaderManager.getInstance().getAEMDataReader().get_max_char_additional_information()));
	}
	
	/** update your message section title */
	public void updateYourMessageSectionTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Your_Message_Section_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Your_Message_Section_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Your_Message_Section_Title());
	}
	
	/** revert your message section title */
	public void revertYourMessageSectionTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Your_Message_Section_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Your_Message_Section_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Your_Message_Section_Title_Revert());
	}
	
	/** verify configured your message section title publish page */
	public void configuredYourMessageSectionOnPublishPage() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Your_Message_Section_Title())), FileReaderManager.getInstance().getAEMDataReader().get_Your_Message_Section_Title());
	}
	
	/** update add note text */
	public void updateAddNoteText() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Add_Note_Text_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Add_Note_Text_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Add_Note_Text());
	}
	
	/** revert add note text */
	public void revertAddNoteText() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Add_Note_Text_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Add_Note_Text_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Add_Note_Text_Revert());
	}
	
	/** verify configured add note text on publish page */
	public void configuredAddNoteTextOnPublishPage() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Add_Note_Text())), FileReaderManager.getInstance().getAEMDataReader().get_Add_Note_Text());
	}
	
	/** update cta label */
	public void updateCTALabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_CTA_Label_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_CTA_Label_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_CTA_Label());
	}
	
	/** revert cta label */
	public void revertCTALabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_CTA_Label_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_CTA_Label_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_CTA_Label_Revert());
	}
	
	/** verify configured cta label on publish page */
	public void configuredCTALabelOnPublishPage() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Send_Message_Button())), FileReaderManager.getInstance().getAEMDataReader().get_CTA_Label());
	}
	
	/** click on success screen tab */
	public void clickOnSuccessScreenTab() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Success_Screen_Tab()));
	}
	
	/** update success cta label */
	public void updateSuccessCTALabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Success_CTA_Label()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Success_CTA_Label()), FileReaderManager.getInstance().getAEMDataReader().get_Success_CTA_Label());
	}
	
	/** revert success cta label */
	public void revertSuccessCTALabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Success_CTA_Label()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Success_CTA_Label()), FileReaderManager.getInstance().getAEMDataReader().get_Success_CTA_Label_Revert());
	}
	
	/** success label is mandatory */
	public void displaySuccessLabelMandatory() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Success_Label_Mandatory()));
	}
	
	/** update success path url */
	public void updateSuccessPathUrl() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Success_Path_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Success_Path_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Success_CTA_Path());
	}
	
	/** revert success path url */
	public void revertSuccessPathUrl() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Success_Path_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Success_Path_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Success_CTA_Path_Revert());
	}
	
	/** success path is mandatory */
	public void displaySuccessPathMandatory() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Success_Path_Label()));
	}
	
	/** success path is mandatory */
	public void verifyDefaultOpenToSameTab() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Target_Success_Open_Tab()));
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Target_Success_Open_Tab())), "Same Tab");
	}
	
	/** verify configured successcta label on publish page */
	public void configuredSuccessCTALabelOnPublishPage() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Continue_Shopping_Button())), FileReaderManager.getInstance().getAEMDataReader().get_Success_CTA_Label());
	}
	
	/** verify configured success cta path on publish page */
	public void configuredSuccessCTAPathOnPublishPage() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Continue_Shopping_Button())), FileReaderManager.getInstance().getAEMDataReader().get_Success_CTA_Label());
	}
	
	/** click on form validation message tab */
	public void clickFormValidationMessageTab() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Form_Validation_Message_Tab()));
	}
	
	/** click on configuration tab */
	public void clickOnConfigurationTab() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Configuration_Tab()));
	}
	
	/** click on add button */
	public void clickOnAddButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Add_Button()));
	}
	
	/** update label detail */
	public void updateLabelDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Label_Drop_Down_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Label_Drop_Down_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Label_Drop_Down());
	}
	
	/** update id detail */
	public void updateIdDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_ID_Drop_Down_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_ID_Drop_Down_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_ID_Drop_Down());
	}
	
	/** verify please select drop down option is added */
	public void verifyAddedPleaseSelectDropDownOption() throws Exception {
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject_Drop_Down_Option()));
		for(int i=0; i<li.size(); i++) {
			if(li.get(i).getText().equalsIgnoreCase(FileReaderManager.getInstance().getAEMDataReader().get_Label_Drop_Down())) {
				Log.message("Option is added", true);
			}
		}
	}
	
	/** click on remove drop down option button */
	public void clickRemoveDropDownOptionButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Remove_Button_Drop_Down_Option()));
	}
	
	/** verify please select drop down option is removed */
	public void verifyRemovedPleaseSelectDropDownOption() throws Exception {
		List<WebElement> li = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject_Drop_Down_Option()));
		for(int i=0; i<li.size(); i++) {
			if(li.get(i).getText().equalsIgnoreCase(FileReaderManager.getInstance().getAEMDataReader().get_Label_Drop_Down())) {
				fail();
				Log.message("Option is not removed", true);
			}else {
				Log.message("Option is removed", true);
			}
		}
	}
	
	/** scenarios by tabbing and hit the enter button */
	public void verifyScenariosByTabbingAndHitTheEnterButton() throws Exception {
		$enterKeyTab($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_First_Name()), Keys.TAB);
		$enterKeyTab($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Last_Name()), Keys.TAB);
		$enterKeyTab($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Email()), Keys.TAB);
		$enterKeyTab($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject()), Keys.TAB);
		$enterKeyTab($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Order_Number()), Keys.TAB);
		$enterKeyTab($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Additional_Information()), Keys.TAB);
		$enterKeyTab($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Send_Message_Button()), Keys.ENTER);
	}
	
}
