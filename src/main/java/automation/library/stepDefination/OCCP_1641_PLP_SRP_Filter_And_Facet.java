package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;

import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import test.assertion.AssertionTest;
/**
 * This file contains the scenario of user stories OCCP-1680
 */
public class OCCP_1641_PLP_SRP_Filter_And_Facet extends BaseClass {

	public OCCP_1641_PLP_SRP_Filter_And_Facet(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("click on facet panel")
	public void click_on_facet_panel() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickFacetPannel();
	}
	
	@And("configure facet author on plp template")
	public void configure_facet_author_on_plp_template() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).updateFacetTitleOnSite();
	}
	
	@And("revert facet title")
	public void revert_facet_title() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).revertFacetTitleOnSite();
	}
	
	@And("click on sort facet")
	public void clickSortFacet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickSortFacet();
	}
	
	@Then("content author updates the facet tile")
    public void content_author_updates_the_facet_title() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).verifyFacetTitleUpdateOnSite();
	}
	
	@And("configure selected label on plp template")
	public void configure_selected_label_on_plp_template() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).updateSelectedLabel();
	}
	
	@And("revert selected label")
	public void revert_selected_label() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).revertSelectedLabel();
	}
	
	@Then("content author updates the selected label")
    public void content_author_updates_the_selected_label() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).verifySelectedLabelUpdateOnSite();
	}
	
	@Then("verify color facet is available with in the facet panel modal")
	public void verify_color_facet_is_available_with_in_the_facet_panel_modal() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayColorFacet();
	}

	@And("click on color facet")
	public void click_on_color_facet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickColorFacet();
	}
	
	@Then("facet values will displayed as multi select colour swatches")
	public void facet_values_will_displayed_as_multi_select_colour_swatches() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayColorSwatchedOptions();
	}
	
	@Then("colour facet button is displayed with in horizontal facet bar that appears above the grid results")
	public void colour_facet_button_is_displayed_with_in_horizontal_facet_bar() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayColorOptionInFacetHorizontalBar();
	}
	
	@And("click on close on facet option")
	public void clickOnCloseOnFacetOption() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickCloseButtonFacetPopup();
	}
	
	@And("click on more filters")
	public void clickOnMoreFilters() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickMoreFilters();
	}
	
	@And("select color option from facet")
	public void selectColorOptionFromFacet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).selectColorSwatchedOptions();
	}
	
	@And("deselect a selected color swatch")
	public void deselect_a_selected_color_swatch() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).selectColorSwatchedOptions();
	}
	
	@And("select another color option from facet")
	public void select_another_color_option_from_facet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).selectAnotherColorSwatchedOptions();
	}
	
	@And("click on sort and filters")
	public void clickOnSortAndFilters() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickOnSortAndFilters();
	}
	
	@And("facet panel modal has color facet")
	public void facet_model_has_color_facet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).selectColorSwatchedOptions();
	}
	
	@Then("selected colour name should get added on to the selected section with in the color facet selected colour name should get added on to the selected section with in the color facet")
	public void selected_colour_name_should_get_added_on_to_the_selected_section_with_in_the_color_facet_Selected_colour() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displaySelectedColorOnFacet();
	}
	
	@Then("plp shows only the products with the selected colour")
	public void plp_shows_only_the_products_with_the_selected_colour() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displaySelectedColorsResultOnPLP();
	}
	
	@Then("selected colour should get append in a comma seprated")
	public void selectedColourShouldGetAppend() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displaySelectColorAppendInComma();
	}
	
	@Then("verify the selected colour name should get removed from the selected section")
	public void verify_the_selected_colour_name_should_get_removed_from_the_selected_section() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).notDisplaySelectedColorOnFacet();
	} 
	@Then("^configure facet selected field$")
	public void configure_facet_selected_field() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).updateSelectedFacet();
	} 
}
