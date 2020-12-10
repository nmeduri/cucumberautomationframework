package automation.library.pageObjects;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;

/**
 * This file contains the functions of AEM Contact Us Page
 * 
 */
public class AEM_Contact_Us_Page extends PageObject{
	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Contact_Us_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	/** This function navigate to Contact Us Author Page */
	public void navigateTo_Contact_Us_Author_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Contact_Us_AEM_Url());
	}
	/** This function navigate to Contact Us_CN Author Page */
	public void navigateTo_Contact_Us_CN_Author_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Contact_Us_AEM_Url_CN());
	}
	/** this function clicks on Contact Us component */
	public void clickContactUsComponent() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getcontactUsComponentAEM())), 20);
	}
	
	/** this function clicks on Contact Us component for CN */
	public void clickContactUsComponentforCN() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getcontactUsComponentCN())), 20);
	}
	/** this function clicks select icon for email section on Contact Us component */
	public void selectIconForEmailSectionContactUsComponent() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getSelectEmailIconAEM())), 20);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailIconValue())), 20);
	}
	/** this function enter email title for email section on Contact Us component */
	public void enterEmailTitleForEmailSection() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailTitleAEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailTitleAEM()), FileReaderManager.getInstance().getAEMDataReader().get_Email_Title_AEM());
	}
	/** this function select format for promo tiles for email section on Contact Us component */
	public void selectFormatForPromoTiles() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getSelectFormatForPromoTilesAEM())), 20);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMContactUsPageLocator().getSelectFormatForPromoTilesValuesAEM())));	
	}
	/** this function enter email link label for email section on Contact Us component */
	public void enterEmailLinkLabelForEmailSection() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailLinkLabelAEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailLinkLabelAEM()), FileReaderManager.getInstance().getAEMDataReader().get_Email_Link_Label_AEM());
	}
	/** this function enter email link value for email section on Contact Us component */
	public void enterEmailLinkValueForEmailSection() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailLinkValueAEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailLinkValueAEM()), FileReaderManager.getInstance().getAEMDataReader().get_Email_Link_Value_AEM());
		Thread.sleep(2000);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailLinkLabelAEM())), 20);	
	}
	/** this function select target to open the email link for email section on Contact Us component */
	public void selectTargetToOpenTheEmailLink() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailLinkTargetAEM())),50);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailLinkTargetAEM())), 20);
		
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailLinkTargetValueAEM())), 40);
	}
	/** verify - Contact Us Component details */
	public void verifyContactUsDetails() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailIconAEM())),40);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailTextAEM())),40);
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getEmailTextAEM())), FileReaderManager.getInstance().getAEMDataReader().get_Email_Title_AEM());
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getCompleteThisFormTextAEM())),40);
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getCompleteThisFormTextAEM())), FileReaderManager.getInstance().getAEMDataReader().get_Email_Link_Label_AEM());
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getCompleteThisFormTextAEM())), 20);
		
	}
	/** This function navigate to Contact Us Author fr locale Page */
	public void navigateTo_Contact_Us_Author_Fr_Locale_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Contact_Us_AEM_Url_Fr());
	}

	/** this function enter email link value for email section on Contact Us component */
	public void enterdataContactInfoTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getcontactInfoTitle()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getcontactInfoTitle()), FileReaderManager.getInstance().getAEMDataReader().get_contact_Info_Title());
	}
	
	/** this function enter data subject Label*/
	public void enterdataSubjectLabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getsubjectLabel()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getsubjectLabel()), FileReaderManager.getInstance().getAEMDataReader().get_subjectLabelField());
	}
	
	/** This function navigate to Store Details Author CN locale Page */
	public void navigateTo_Store_Details_CN_Author_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Store_Details_AEM_Url_CN());
	}	
	
	/** this function click store details component*/
	public void clickonStoreDetails() throws Exception{
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getStoreDetailsAEM())),40);
	}
	/** this function verify store details components*/
	public void verifyStoreDetailsComponents() throws Exception{
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().verifyComponentsAvailabilityInOrder())),40);
	}
	
	/** this function enter data Direction Label*/
	public void editfield() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getDirectionCTALabel()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getDirectionCTALabel()), FileReaderManager.getInstance().getAEMDataReader().get_Direction_label_Data());
	}
	/** this function enter data Direction Label revert*/
	public void reverteditfield() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getDirectionCTALabel()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMContactUsPageLocator().getDirectionCTALabel()), FileReaderManager.getInstance().getAEMDataReader().get_Revert_Direction_label_Data());
	}
	
}
