package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.Given;

/**
 * This file contains the scenario of user stories OCCP-1259
 */
public class OCCP_1259_PDP_Add_to_Cart_Flyout_Overview_Step extends BaseClass{

	public OCCP_1259_PDP_Add_to_Cart_Flyout_Overview_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	
	@Given("pdp add to cart product flyout url is available")
	public void pdp_addtocart_product_flyout_url_is_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_Page(FileReaderManager.getInstance().getDataReader().get_Add_To_Cart_Product_FlyOut());
	}
	
	@Given("pdp add to cart product flyout for fr locale url is available")
	public void pdp_addtocart_product_flyout_fr_locale_url_is_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_Page_fr_Locale(FileReaderManager.getInstance().getDataReader().get_Add_To_Cart_Product_FlyOut());
	}
}
