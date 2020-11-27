Feature: OCCP-3171 : PDP with no Q&A 

Description: To test the ADOBE Test Cases for the story OCCP-3171

 @RegressionTest @WebView @WideView @MobileView @TC-3171
	Scenario: TC-3952 OCCP-3171 - Verify user is able to view  Questions & Answers section 
	When pdp url with Q&A section is available
	Then the product title is displayed on the product
	And scroll down to Questions and Answers section on PDP
	And verify the clickable link Be the first to ask a question is displayed
	When pdp fr locale url with Q&A section is available
	Then the product title is displayed on the product
	And scroll down to Questions and Answers section on PDP
	And verify the clickable link Be the first to ask a question is displayed
	
	@RegressionTest @WebView @WideView @MobileView @TC-3953
	Scenario: TC-3953 OCCP-3171 - Verify user is able to interact with  Questions & Answers section 
	When pdp url with Q&A section is available
	Then the product title is displayed on the product
	And scroll down to Questions and Answers section on PDP
	When clicks on Be the first to ask a question link
	Then user is navigated to ask a question page and is prompted to fill it
	When pdp fr locale url with Q&A section is available
	Then the product title is displayed on the product
	And scroll down to Questions and Answers section on PDP
	When clicks on Be the first to ask a question link
	Then user is navigated to ask a question page and is prompted to fill it
	
	
	@RegressionTest @WebView @WideView @MobileView
	Scenario: TC-3954 OCCP-3171 - Verify user is able to view  Questions & Answers section having no answers 
	When pdp url with questions and answers section is available
	Then the product title is displayed on the product
	And scroll down to Questions and Answers section on PDP
	And CTA to Ask a Question is listed 
	And Questions are listed is displayed
	And username of questioner is listed
	And Timestamp of the question asked is listed
	And Number of answers is displayed
	And CTA to answer this question is displayed

	
	@RegressionTest @WebView @WideView @MobileView
	Scenario: TC-3955 OCCP-3171 - Verify user is able to interact with Questions & Answers section having no answers
	When pdp url with questions and answers section is available
	Then the product title is displayed on the product
	And scroll down to Questions and Answers section on PDP
	When click on answer this question CTA
	Then Modal for answering the question appears and user is prompted to fill it
	
	