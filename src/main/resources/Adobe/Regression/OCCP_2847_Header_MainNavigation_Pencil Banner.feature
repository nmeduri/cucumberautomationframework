Feature: OCCP-2847 Header and Main Navigation with Pencil Banner
  
  Description: To test the ADOBE Test Cases for the story OCCP-2847

@Regression @WideScreen @WideView 
  Scenario: TC-2881,2892 Verfiy the Pencil Banner view 
   Given pdp url is available
   Then validate Pencil Banner 
   And navigate to preferences page
   Then validate Pencil Banner
   And navigate to Wishlist Page
   Then validate Pencil Banner
   And navigate to Personal info Page
   Then validate Pencil Banner
   And navigate to Order history Page
   Then validate Pencil Banner
   And navigate to Payment info Page
   Then validate Pencil Banner
   And navigate to Address Page
   Then validate Pencil Banner
    And navigate to Reward Page
   Then validate Pencil Banner
   And navigate to Preference Page
   Then validate Pencil Banner
   
   @Regression @WideScreen @WideView 
  Scenario: TC-2882,2893 Verfiy the Pencil Banner when user scrolls down/Up
   Given pdp url is available
   Then Scroll down the PDP page
   Then validate Pencil Banner
   Then Scroll Up the PDP page
   Then validate Pencil Banner
   
   @Regression @WideScreen @WideView 
  Scenario: TC-2883,2894 Verfiy the Options available on the Pencil banner
   Given pdp url is available
   Then brand value props 
   Then courtesy link with a CTA and indicated caveat
   Then Account options dropdown content 
   Then Site Language Selector
   Then customer service
   

   
   #@Regression @WideScreen @WideView
   #
   #Scenario: TC-2884,2895 Verfiy the Account options available on the Pencil banner for Unauthenticated User
   #Given pdp url is available
   #Then validate Pencil Banner
   #Then Click on account link 
   #Then Validate the Account Options
   
   #@Regression @WideScreen @WideView
   #Scenario: TC-2884,2895 Verfiy the Account options available on the Pencil banner for Authenticated User
   #Given login url is available
#	When enter email detail
#	And user enter password
#	And user click on sign in button
#	Then user click on Hi link on PDP page
#	Then Validate the Account option Available 
  #
	
   
   
  
    