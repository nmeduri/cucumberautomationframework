package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.Footer_Page;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.PLP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * This file contains the scenario of user stories OCCP-1030
 */
public class OCCP_1028_Footer_Copyright_Step extends BaseClass {

	Footer_Page footerPage;
	public OCCP_1028_Footer_Copyright_Step(TestContext context) throws Exception {
		testContext = context;
		footerPage = testContext.getPageObjectManager().getFooterPage();
		configFileReader = new ConfigFileReader();
	
	}
	
	@And("click on view less")
	public void click_on_view_less() throws Exception {
		testContext.getPageObjectManager().getFooterPage().clickViewLess();
	}
	
	@Then("view less should not be displayed")
	public void view_less_should_not_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().notDisplayViewLess();
	}
	
	@And("canadian tire logo should be displayed")
	public void canadian_tire_logo_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayCanadianTireLogo();
	}
	
	@Then("copy right label should be displayed")
	public void copy_right_label_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayCopyRightText();
	}
	
	@Then("footer is displayed")
	public void footer_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayFooterLink();
	}
	
	@Then("copy right information should be displayed on the footer")
	public void copy_right_information_should_be_displayed_on_the_footer() throws Exception {
		testContext.getPageObjectManager().getFooterPage().displayCopyRightInformation();
	}
	
	@And("in footer hover on any link on footer")
	public void in_footer_hover_on_any_link_on_footer() throws Exception {
		testContext.getPageObjectManager().getFooterPage().verifyUnderlinkeOnAnyLink();
	}
	
	@And("in footerhover on any link on footer")
	public void in_footerhover_on_any_link_on_footer() throws Exception {
		testContext.getPageObjectManager().getFooterPage().verifyUnderlinkeOnAnyLinkOnMobile();
	}
	
	
}
