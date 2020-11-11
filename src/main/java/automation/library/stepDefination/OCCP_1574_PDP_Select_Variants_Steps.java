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

/**
 * This file contains the scenario of User stories OCCP-1574
 */

public class OCCP_1574_PDP_Select_Variants_Steps extends BaseClass {
     
	public OCCP_1574_PDP_Select_Variants_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("the swatch with sizes is displayed")
	public void the_swatch_with_sizes_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySwatchWithSize();
	}
	
	@Then("the size label is displayed")
	public void the_size_label_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySizeLabel();
	}
	
	@Then("unavailabe size is displayed")
	public void unavailabe_size_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayUnavailableSize();
	}
	
	@And("select one of the available size")
	public void select_one_of_the_available_size() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickAvailableSize();
	}
	
	@Then("available size is successfully selected")
    public void available_size_is_successfully_selected() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displaySelectedSize();
	}
	
	@Then("the lable of selected size is displayed")
	public void the_label_of_selected_size_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifySelectedSizeLabel();
	}
	
	@And("Select a different colour variant")
	public void select_a_different_colour_variant() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).click_different_colour_variant();
	}
	@Then("the lable of selected color is displayed")
	public void the_label_of_selected_color_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifySelectedColorLabel();
	}
	
	@And("update the authorable size label")
	public void update_the_authorable_size_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).udpate_Size_label();
	}
	
	@And("update the authorable color label")
	public void update_the_authorable_color_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).update_Color_label();
	}
	
	@And("revert the authorable size label")
	public void revert_the_authorable_size_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revert_Size_label();
	}
	
	@And("revert the authorable color label")
	public void revert_the_authorable_color_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revert_Color_label();
	}
}
