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
	@Then ("validate Pencil Banner")
public void display_PencilBanner() throws Exception {
		Thread.sleep(2000);
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PencilBanner();
	}
	@Then ("Click on account link")
public void Click_AccountLink() throws Exception {
		
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
	}
	@And ("navigate to preferences page")
public void Click_WishListOption() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_WishListOption();
	}
	@And("navigate to Wishlist Page")
public void Click_Preferences() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_PreferencesOption();
	}
	
	@And ("navigate to Personal info Page")
public void Click_PersonalInfoOption() throws Exception {	
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_PersonalInfoOption();
	}
@And ("navigate to Order history Page")
public void Click_Orderhistory() throws Exception {
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_OrderHistory();
}
@And ("navigate to Payment info Page")
public void Click_PaymentInfo() throws Exception {
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_PaymentInfo();
}
@And ("navigate to Address Page")
public void Click_Address() throws Exception {
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_Address();
}
@And ("navigate to Reward Page")
public void Click_RewardOption() throws Exception {
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_Reward();
}
@And ("navigate to Preference Page")
public void Click_Preference() throws Exception {
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_Preference();
}
@Then ("Scroll Up the PDP page")
public void ScrollUp() throws Exception {
	
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).scrollUpByCoordinates();
}
@Then ("Scroll down the PDP page")
public void ScrollDown() throws Exception {
	
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).scrollDown();
}
	

@Then ("courtesy link with a CTA and indicated caveat")
public void Validate_CreditOffered_Text() throws Exception {
	
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_CreditOffered();
}
@Then ("Validate account Link")
public void Validate_AccountLink() throws Exception {
	
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_AccountLink();
}
@Then ("Validate the Account Options")
public void Validate_AccountOption() throws Exception {
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_SignIn();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Registration();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_OrderHistory();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Address();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PaymentInfo();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Preference();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PreferencesOption();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Reward();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_SignIn();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Registration();
}
@Then ("Validate Customer Service link")
public void Validate_CustomerService_link() throws Exception {
	
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_CustomerService();
}
@Then ("customer service")
public void Click_CustomerService_link() throws Exception {
	
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).click_CustomerService();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_CustomerServicePage();

}


@Then ("Site Language Selector")
public void Language_link() throws Exception {
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Language();
	//testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_Language();
}
@Then ("user click on Hi link on PDP page")
public void click_HiLink() throws Exception {
	
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_HiLink();
}
@Then ("Validate the Account option Available")
public void Validate_AccountOptions() throws Exception {
	Thread.sleep(7000);
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PreferencesOption();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PaymentInfo();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_WishListOption();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Address();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_OrderHistory();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Reward();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PersonalInfoOption();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_SignOut();
}
@Then ("brand value props")
public void Validate_BrandValueProps() throws Exception {
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PencilBanner();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_MadeForLife();
}
@Then ("Account options dropdown content")
public void Validate_Account_Option_Dropdown() throws Exception {
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).Click_AccountLink();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_SignIn();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Registration();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_OrderHistory();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Address();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PaymentInfo();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Preference();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_PreferencesOption();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Reward();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_SignIn();
	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).display_Registration();
	
}
}
