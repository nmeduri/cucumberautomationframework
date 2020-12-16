package automation.library.pageObjects;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import automation.library.logdetail.Log;

/**
 * This file contains the functions of account address Page
 * 
 */
public class Account_Profile_Page extends PageObject{
	TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Account_Profile_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	/** This function navigate to account profile info page */
	public void navigate_to_Account_profileinfo() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Account_profile_URL());
	}
	/** This function navigate to account profile info page */
	public void Account_profileinfo_navigation() throws Exception {
		driver.get(FileReaderManager.getInstance().getDataReader().get_Account_profile_URL());
	}
	/** This function click on edit btn on profile info page */
	public void click_Edit_ProfileInfo() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getEditbtn())),15);
	}
	/** This function edit first name on profile info page */
	public void Edit_FirstName_ProfileInfo() throws Exception {
		$clearData(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getEditfirstName())),15);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getEditfirstName()), FileReaderManager.getInstance().getDataReader().get_firstName_AccntProfile());

	}
	/** This function edit last name on profile info page */
	public void Edit_lastName_ProfileInfo() throws Exception {
		$clearData(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getEditlastName())),15);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getEditlastName()), FileReaderManager.getInstance().getDataReader().get_lastName_AccntProfile());

	}
	/** This function edit last name on profile info page */
	public void Edit_phnNo_ProfileInfo() throws Exception {
		$clearData(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getEditphonenumberAccntProf())),15);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getEditphonenumberAccntProf()), FileReaderManager.getInstance().getDataReader().get_phnNo_AccntProfile());

	}
	/** This function click save on profile info page */
	public void click_save_ProfileInfo() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getEditSavebtn())),15);

	}
	/** This function password edit on profile info page */
	public void click_Edit_password_ProfileInfo() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getpwdEditbtn())),15);

	}
	/** This function enter current password on profile info page */
	public void enter_currentpwd_ProfileInfo() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getcurrentPwd()), FileReaderManager.getInstance().getDataReader().get_currentPwd_AccntProfile());

	}
	/** This function  enter new password on profile info page */
	public void enter_newpwd_ProfileInfo() throws Exception {
		//$click($(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getnewPwd()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getnewPwd()), FileReaderManager.getInstance().getDataReader().get_newPwd_AccntProfile());

	}
	/** This function re enter new password on profile info page */
	public void reenter_newpwd_ProfileInfo() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getconfrmpwd()), FileReaderManager.getInstance().getDataReader().get_confirmPwd_AccntProfile());

	}
	/** This function click submit pwd on profile info page */
	public void submit_password_ProfileInfo() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getsubmitbtn())),15);

	}
	/** This function click cancel on pwd edit on profile info page */
	public void cancel_password_ProfileInfo() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getcancelbtn())),15);

	}
	/** This function revert the changes on password on profile info page */
	public void revert_password_changes_ProfileInfo() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getcurrentPwd()), FileReaderManager.getInstance().getDataReader().get_newPwd_AccntProfile());
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getnewPwd()), FileReaderManager.getInstance().getDataReader().get_currentPwd_AccntProfile());
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getconfrmpwd()), FileReaderManager.getInstance().getDataReader().get_currentPwd_AccntProfile());
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getsubmitbtn())),15);

	}
	/** This function display modal pop up while navigting other screen without saving information */
	public void display_ModalPopUp_ProfileInfo() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getcancelbtn())),15);

	}
	/** This function click on close btn on modal profile info page */
	public void click_modalclose_ProfileInfo() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountProfilePageLocator().getModalclose())),15);
	}
	

}