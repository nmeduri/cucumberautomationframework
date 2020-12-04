package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
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
 * This file contains the scenario of PDP Page
 */

public class OCCP_3179_PDP_With_No_Reviews_Steps extends BaseClass {
      
	public OCCP_3179_PDP_With_No_Reviews_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("pdp no review product url is available")
	public void pdp_no_review_product_url_is_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_Page(FileReaderManager.getInstance().getDataReader().get_Product_No_Reviews());
	}
	
	@Given("pdp fr no review product url is available")
	public void pdp_fr_no_review_product_url_is_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_FR_Page(FileReaderManager.getInstance().getDataReader().get_Product_No_Reviews());
	}
	
	@Then("five unfilled stars is displayed")
	public void five_unfilled_stars_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayFiveUnfilledStars();
	}
	
	@Then("write a reviews is not displayed")
	public void write_a_reviews_is_not_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).notDisplayWriteAReviews();
	}
	
	@And("click on unfilled stars in buybox")
	public void clickOnUnfilledStars() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickOnUnfilledStars();
	}
	
	@Then("user is navigate to ratings and reviews section on the pdp")
	public void user_is_navigate_to_ratings_and_reviews_section_on_the_pdp() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayReviewSection();
	}
	
	@Then("title of section as reviews")
	public void title_of_section_as_reviews() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyTitlSectionAsReviews();
	}
	
	@Then("fr title of section as reviews")
	public void fr_title_of_section_as_reviews() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyTitlSectionAsReviewsForFR();
	}
	
	@Then("unfilled stars are displayed for scrollable section")
	public void unfilled_stars_are_displayed_for_scrollable_section() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayUnfilledStarsForScrollableSection();
	}
	
	@Then("clickable link 'be the first to write this review'")
	public void clickable_link_be_the_first_to_write_this_review() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).veifyBeTheFirstAskQuestionIsClickable();
	}
	
	@Then("mobile - clickable link 'be the first to write this review'")
	public void mobile_clickable_link_be_the_first_to_write_this_review() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).veifyBeTheFirstAskQuestionIsClickableMobile();
	}
	
	@Then("review model appears")
	public void review_model_appears() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayReviewModelAppears();
	}
	
	@And("user is prompted to fill it")
	public void user_is_prompted_to_fill_it() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).enterReviewDetailsOnPopUp();
	}
	
	@And("click on ratings area")
	public void click_on_ratings_area() throws Exception {
		
	}
	
}
