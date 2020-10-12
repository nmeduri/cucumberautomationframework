
package automation.library.stepDefination;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.pageObjects.PDP_Page;

public class OCCP_2847_Header_MainNavigation_PencilBanner_Steps extends BaseClass{


	public OCCP_2847_Header_MainNavigation_PencilBanner_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	@Then ("navigate to home services page")
public void click_HomeServices() throws Exception {
		
		testContext.getPageObjectManager().getAccount_Options_Page().click_HomeService_option();
	}
	@Then ("navigate to returns page")
	public void click_Reurns() throws Exception {
			
			testContext.getPageObjectManager().getAccount_Options_Page().click_Returns_option();
		}
	
	@Then ("validate Pencil Banner")

	public void display_PencilBanner() throws Exception {
		
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).display_PencilBanner();
	}
	@Then ("Click on account link")

public void Click_AccountLink() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).Click_AccountLink();
	}
	@And ("navigate to preferences page")
	public void Click_WishListOption() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_WishListOption();
	}
	@And("navigate to Wishlist Page")
public void Click_Preferences() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getAccount_Options_Page().Click_PreferencesOption();
	}

	@And ("navigate to Personal info Page")

public void Click_PersonalInfoOption() throws Exception {	
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getAccount_Options_Page().Click_PersonalInfoOption();
	}
@And ("navigate to Order history Page")
public void Click_Orderhistory() throws Exception {
	testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).Click_AccountLink();
	testContext.getPageObjectManager().getAccount_Options_Page().Click_OrderHistory();
}
@And ("navigate to Payment info Page")
public void Click_PaymentInfo() throws Exception {

	testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).Click_AccountLink();
	testContext.getPageObjectManager().getAccount_Options_Page().Click_PaymentInfo();
}
@And ("navigate to Address Page")
public void Click_Address() throws Exception {

	testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).Click_AccountLink();
	testContext.getPageObjectManager().getAccount_Options_Page().Click_Address();
}
@And ("navigate to Reward Page")
public void Click_RewardOption() throws Exception {

	testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).Click_AccountLink();
	testContext.getPageObjectManager().getAccount_Options_Page().Click_Reward();
}
@And ("navigate to Preference Page")
public void Click_Preference() throws Exception {
	testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).Click_AccountLink();
	testContext.getPageObjectManager().getAccount_Options_Page().Click_Preference();
}
@Then ("Scroll Up the PDP page")
public void ScrollUp() throws Exception {

	testContext.getPageObjectManager().getHeaderPage(driver).scrollUpByCoordinates();
}
@Then ("Scroll down the PDP page")
public void ScrollDown() throws Exception {
	

	testContext.getPageObjectManager().getHeaderPage(driver).scrollDown();
}
	

@Then ("courtesy link with a CTA and indicated caveat-Clicking on CTA should take user to the targeted page")
public void Validate_CreditOffered_Text() throws Exception {
	

	testContext.getPageObjectManager().getHeaderPage(driver).display_CreditOffered();
	testContext.getPageObjectManager().getHeaderPage(driver).click_CreditOffered();
	testContext.getPageObjectManager().getPDPPage(driver).navigateTo_PDP_Page();

}
@Then ("Validate account Link")
public void Validate_AccountLink() throws Exception {
	
	testContext.getPageObjectManager().getHeaderPage(driver).display_AccountLink();
}
@Then ("Validate the Account Options")
public void Validate_AccountOption() throws Exception {

	testContext.getPageObjectManager().getAccount_Options_Page().display_SignIn();
	testContext.getPageObjectManager().getAccount_Options_Page().display_Registration();
	testContext.getPageObjectManager().getAccount_Options_Page().display_OrderHistory();
	testContext.getPageObjectManager().getAccount_Options_Page().display_Address();
	testContext.getPageObjectManager().getAccount_Options_Page().display_PaymentInfo();
	testContext.getPageObjectManager().getAccount_Options_Page().display_Preference();
	testContext.getPageObjectManager().getAccount_Options_Page().display_PreferencesOption();
	testContext.getPageObjectManager().getAccount_Options_Page().display_Reward();
	testContext.getPageObjectManager().getAccount_Options_Page().display_SignIn();
	testContext.getPageObjectManager().getAccount_Options_Page().display_Registration();
}

@Then ("customer service-Clicking on help should bring users to the Help page")

public void Validate_CustomerService_link() throws Exception {
	
	testContext.getPageObjectManager().getHeaderPage(driver).click_CustomerService();
	testContext.getPageObjectManager().getHeaderPage(driver).display_CustomerServicePage();
	testContext.getPageObjectManager().getPDPPage(driver).navigateTo_PDP_Page();
	}
@Then ("Site Language Selector-Clicking on FR should change the site language to French")
public void Language_link() throws Exception {

	testContext.getPageObjectManager().getHeaderPage(driver).display_Language();
	testContext.getPageObjectManager().getHeaderPage(driver).Click_Language();
	testContext.getPageObjectManager().getPDPPage(driver).navigateTo_PDP_Page();

	}

@Then ("user click on Hi link on PDP page")
public void click_HiLink() throws Exception {
	testContext.getPageObjectManager().getHeaderPage(driver).Click_HiLink();
}
@Then ("validate brand value props")
public void Validate_BrandValueProps() throws Exception {
	testContext.getPageObjectManager().getHeaderPage(driver).display_PencilBanner();
	testContext.getPageObjectManager().getHeaderPage(driver).display_MadeForLife();

}
@Then ("validate Account options dropdown content for unauthenticated user")
public void Validate_Account_Option_Dropdown() throws Exception {

	testContext.getPageObjectManager().getHeaderPage(driver).Click_AccountLink();
	testContext.getPageObjectManager().getAccount_Options_Page().display_HomeService_option();
	testContext.getPageObjectManager().getAccount_Options_Page().display_Returns_option();
	testContext.getPageObjectManager().getAccount_Options_Page().display_checkOrderStatusoption();
	testContext.getPageObjectManager().getAccount_Options_Page().display_SignIn();
	testContext.getPageObjectManager().getAccount_Options_Page().display_Registration();

}

}

