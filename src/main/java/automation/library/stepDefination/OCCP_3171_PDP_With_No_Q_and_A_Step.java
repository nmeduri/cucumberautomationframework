package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-3171
 */
public class OCCP_3171_PDP_With_No_Q_and_A_Step extends BaseClass {

	public OCCP_3171_PDP_With_No_Q_and_A_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("pdp url with Q&A section is available")
	public void pdp_url_with_Q_A_section_is_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_Page(FileReaderManager.getInstance().getDataReader().get_Questions_And_Answers_Section());
	}
	@Then("scroll down to Questions and Answers section on PDP")
	public void scroll_down_to_Questions_and_Answers_section_on_PDP() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).scrollDownToQuestionsAndAnswersSection();	
	}
	
	@Then("verify the clickable link Be the first to ask a question is displayed")
	public void verify_the_clickable_link_Be_the_first_to_ask_a_question_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayBeTheFirstToAskAQuestion();	
	}
	
	@When("clicks on Be the first to ask a question link")
	public void clicks_on_Be_the_first_to_ask_a_question_link() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickOnBeTheFirstToAskAQuestion();	
	}
	@Then("user is navigated to ask a question page and is prompted to fill it")
	public void user_is_navigated_to_ask_a_question_page_and_is_prompted_to_fill_it() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayAskAQuestionForm();	
	}
	@When("pdp url with questions and answers section is available")
	public void pdp_sort_product_reviews_url_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_Page(FileReaderManager.getInstance().getDataReader().get_Questions_And_Answers());
	} 
	@Then("CTA to Ask a Question is listed")
	public void cta_to_Ask_a_Question_is_listed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayAskAQuestionCTA();	
	}
	@Then("Questions are listed is displayed")
	public void questions_are_listed_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayQuestionsList();	
	}
	
	@And("username of questioner is listed")
	public void username_of_questioner_is_listed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayQuestionsList();	
	}
	@And("Timestamp of the question asked is listed")
	public void timestamp_of_the_question_asked_is_listed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayTimeStampOfQuestion();	
	}
	@And("Number of answers is displayed")
	public void number_of_answers_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayNumberOfAnswers();	
	}
	
	@And("CTA to answer this question is displayed")
	public void cta_to_answer_this_question_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayAnsThisQuestionButton();	
	}
	@Given("pdp fr locale url with Q&A section is available")
	public void pdp_fr_Locale_url_with_Q_A_section_is_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_Page_fr_Locale(FileReaderManager.getInstance().getDataReader().get_Questions_And_Answers_Section());
	}
	
	@When("click on answer this question CTA")
	public void click_on_answer_this_question_CTA() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickOnAnsThisQuestionCTA();	
	}
	
	@Then("Modal for answering the question appears and user is prompted to fill it")
	public void modal_for_answering_the_question_appears_and_user_is_prompted_to_fill_it() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayPostAnswerModel();	
	}
}
