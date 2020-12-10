package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
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
		$click($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Please_Select_Subject_Drop_Down_Option()));
		String getSelectedValue = $getText($(Loc.XPATH, testContext.getPageObjectManager().getContactUsPageLocator().get_Selected_Value_Drop_Down_Please_Select_Subject()));
		Assert.assertEquals(getOption.trim(), getSelectedValue.trim());
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
}
