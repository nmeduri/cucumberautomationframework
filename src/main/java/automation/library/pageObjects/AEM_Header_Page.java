package automation.library.pageObjects;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;

public class AEM_Header_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Header_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	/** This function navigate to header Component Page */
	public void navigateTo_HeaderComponent_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Header_Author_Url());

	}
	
	/** This function click header component */
	public void clickHeaderComponent() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_pencilBanner_Component())), 3);

	}
	/** This function click Account menu component */
	public void clickAccountComponent() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_AccountMenu())), 3);

	}
	
	/** Update brand image */
	public void updateBrandImageOnHeaderComponent() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_brandImageField()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_pick_option()));
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_CanadianTierWeb_Folder())), 5) ;
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_brandImage_Logo())), 5) ;
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_SelectBtn())), 5) ;

	}
	/** Update brand image alt text */
	public void updateBrandImageAltText() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_brandImage_Text()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_brandImage_Text())), 5, FileReaderManager.getInstance().getAEMDataReader().get_brand_Image_alt_Text());
	}
	/** Update brand image area label */
	public void updateBrandImageAreaLabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_brandImageArea_Label()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_brandImageArea_Label())), 5, FileReaderManager.getInstance().getAEMDataReader().get_brand_Image_area_label());
	}
	/** Update brand caption text */
	public void updateBrandCaptionText() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_brandCaption_Text()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_brandCaption_Text())), 5, FileReaderManager.getInstance().getAEMDataReader().get_brand_caption_text());
	}
	/** display the brand value prop updated on the site */
	public void displayBrandValueProp() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$displayFindElement(By.xpath("(//span[text()='Made for Life in Canada'])[2]"));
		PageObject.getDriver().switchTo().parentFrame();
	
	}
	/** do not enter brand value prop mandatory field and click on done */
	public void doNot_Enter_BrandValueProp_And_Click_Continue() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_brandCaption_Text()));
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).clickDoneButton();
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_Error_image()));
		PageObject.getDriver().navigate().refresh();

	}
	/**Update CourtesyLink On site*/
	public void Update_CourtesyLink() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_configure_Courtesy_Link()));
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_configure_Courtesy_Link()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_configure_Courtesy_Link())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Courtesy_text());
    	PageObject.getDriver().findElement(By.xpath("/html[1]/body[1]/coral-dialog[1]/div[2]/form[1]/coral-dialog-content[1]/div[1]/div[1]/div[5]/div[1]/div[2]")).sendKeys(Keys.CONTROL+"a");
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_HyperLinkBtn()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_CourtesyPath()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_CourtesyPath())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Courtesy_Link());
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_path_Check())), 3);
		By goToCheckBox = $By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_path_Check());
		testContext.getPageObjectManager().getPageObject(driver).scrollDown(goToCheckBox, 10);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_path_Check()));
		}
	/**Update Customer service link On site*/
	public void Update_CustomerService_Link() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_customerService_Label()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_customerService_Label())), 5, FileReaderManager.getInstance().getAEMDataReader().get_CustomerService_Label());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_customerService_URL()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_customerService_URL())), 5, FileReaderManager.getInstance().getAEMDataReader().get_CustomerService_URL());

	}
	/**Update Language link On site*/
	public void Update_Language_Link() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_language_Label()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_language_Label())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Language_Label());
		}
	/** display Credit offered text on the site */
	public void display_configure_courtesy() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$displayFindElement(By.xpath("//span[text()='Credit Offered* Learn More']"));
		PageObject.getDriver().switchTo().parentFrame();
	
	}
	/** display Customer service and language On site */
	public void display_customerService_language_Link() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$displayFindElement(By.xpath("//a[@class='pencil-banner__second-item']"));
		$displayFindElement(By.xpath("//a[@class='pencil-banner__language']"));
		PageObject.getDriver().switchTo().parentFrame();
}
	/** Update Accounts section */
	public void updateAccountOption() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_AccountsLabel()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_AccountsLabel())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Account_Label());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_SignInLabel()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_SignInLabel())), 5, FileReaderManager.getInstance().getAEMDataReader().get_signin_Label());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_SignInURL()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_SignInURL())), 5, FileReaderManager.getInstance().getAEMDataReader().get_signin_URL());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_RegisterLabel()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_RegisterLabel())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Resister_Label());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_RegisterURL()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_RegisterURL())), 5, FileReaderManager.getInstance().getAEMDataReader().get_ResisterURL());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_TriangleRewards_Label()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_TriangleRewards_Label())), 5, FileReaderManager.getInstance().getAEMDataReader().get_TriangleReward_Label());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_GreetingText()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_GreetingText())), 5, FileReaderManager.getInstance().getAEMDataReader().get_GreetingText());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_RewardsInfolabel()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_RewardsInfolabel())), 5, FileReaderManager.getInstance().getAEMDataReader().get_TriangleRewardsBalance());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_Signoutlabel()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_Signoutlabel())), 5, FileReaderManager.getInstance().getAEMDataReader().get_SignOutText());

	}
	/** display Account option On site */
	public void displayUpdatedAccountOption() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_AccountOption())), 3);

		PageObject.getDriver().switchTo().parentFrame();
}
	/** click Account option On site */
	public void clickUpdatedAccountlink() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_AccountOption()));
		PageObject.getDriver().switchTo().parentFrame();
}
	/**And validate the account options are updated on the site*/
	public void UpdatedAccountOption() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_SignInLabel_Author()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_RegisterLabel_Author()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_Preference_Author()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_Preferences_Author()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_PaymentInformation_Author()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_OrderHistory_Author()));
		PageObject.getDriver().switchTo().parentFrame();
		
}
	/**And validate the account options for unauthenticated user*/
	public void displayAccountOption_unautheticatedUser() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_SignInLabel_Author()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_RegisterLabel_Author()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_Preference_Author()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_Preferences_Author()));
		PageObject.getDriver().switchTo().parentFrame();
		
}
	/** This functions verify Account options url label is successfully updated on site */
	public void displayUpdatedAccountOptionURLOnSite() throws Exception {
	    testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_Preference_Author()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		$displayFindElement(By.xpath("//*[text()='" +  driver.getTitle() + "']"));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMHeaderLocatorPage().get_Preferences_Author()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		$displayFindElement(By.xpath("//*[text()='" +  driver.getTitle() + "']"));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		
		PageObject.getDriver().switchTo().parentFrame();
	}
}
