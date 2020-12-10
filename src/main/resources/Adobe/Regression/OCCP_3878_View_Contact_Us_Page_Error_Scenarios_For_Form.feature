Feature: OCCP-3878 Contact Us Page : Error Scenario

	Description: To test the ADOBE Test Cases for the story OCCP-3878
	
	@RegressionTest @WebView @WideScreen @TC-4966
	Scenario: TC-4966 OCCP-3878 - Verify User gets  error message on enntering invalid First Name, Last name, Email Address and Order Number in conatct us form	
	When contact us url is available
    And enter invalid first name last name email address order number
    And click on send message button
    Then error message against the particular field is displayed
    When contact us fr url is available
    And enter invalid first name last name email address order number
    And click on send message button
    Then error message against the particular field is displayed
    
    
    @RegressionTest @WebView @WideScreen @TC-4968
	Scenario: TC-4968 OCCP-3878 - Verify User is able to view an error message in case a mandatory field is not filled out on contact us form	
	When contact us url is available
    And click on send message button
    Then error message below the empty mandatory field is displayed
    When contact us fr url is available
    And click on send message button
    Then error message below the empty mandatory field is displayed
    
    @RegressionTest @WebView @WideScreen @TC-4967
	Scenario: TC-4967 OCCP-3878 - Verify User is not able to enter more than the maximum number of characters for  fields in contact us form	
	Given open browser
	When contact us url is available
	And enter more than the number of characters for first name last name email order number
	Then field is not taking characters exceeding limit
	When contact us fr url is available
	And enter more than the number of characters for first name last name email order number
	Then field is not taking characters exceeding limit
	
	@RegressionTest @WebView @WideScreen @TC-4852
	Scenario: TC-4852 OCCP-1026View Contact Us page - part 1 (Contact Us Form) - User is able to fill out the Contact us via email form - Verify that  User is able to enter their first and last name	
	When contact us url is available
	And user is able to enter valid details for first name and last name
	When contact us fr url is available
	And user is able to enter valid details for first name and last name
    
   