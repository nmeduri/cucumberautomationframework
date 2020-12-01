Feature: OCCP-968 : Broad Promo Tiles component
	Description: To test the ADOBE Test Cases for the story OCCP-968
	
	@RegressionTest @AEM
	Scenario: TC-3511	OCCP-968: Verify user is able to configuring the elements within the Broad Promo Tiles component
	Given open browser
	When AEM author with access to configure broad promo tiles component
	And login to AEM using the credential as mentioned in the test data
	And click on broad promo tiles component
	And click on aem configure button
	And update title of broad promo tile
	When click on tile1 tab
	Then update image alt text of tile1
	And select left image alignment for tile1
	And update title for tile1
	And update sub title for tile1
	And add promotional title and subtitle  with tool tip indicating character limit Tile1
	And update button title for tile1
	And add button title with tooltip character limit tile1
	And update button URL for tile1
	And select target on click of button for tile1
	And select display keyline for tile1
	And select keyline color for tile1
	And select Save Story Type for tile1
	And update save story text for tile1
	And update save story value for tile1
	And select save story background color for tile1
	And configure desktop title image for tile1
	And configure mobile tile image for tile1
	When click on tile2 tab
	Then update tile2 of image alt text
	And select tile2 of left image alignment
	And update tile2 of title
	And update tile2 of sub title
	And tile2 of add promotional title and subtitle  with tool tip indicating character limit
	And update tile2 button title
	And update tile2 of button URL
	And tile2 of add button title with tooltip character limit
	And select tile 2 of target on click of button
	And select display keyline for tile2
	And select color of keyline for tile2
	And select save story type for tile2
	And update tile2 of save story text
	And update save story value of tile2
	And select tile2 save story background color
	And configure tile2 of desktop title image
	And configure tile2 mobile tile image for tile1
	And user click on done button
	And click on the preview button
	Then broad promot tiles component is displayed on the site
	And 2broad promo tiles should display the tiles in a single row,one next to the other
	And promotion image,title,sub-title,CTA button,keyline and offer should display for each tile
	
	
	
	@RegressionTest @AEM
	Scenario: TC-4329	OCCP-968: OCCP-968 - Verify the display of error message when mandatory fields are not added while authoring the content
	Given open browser
	When AEM author with access to configure broad promo tiles component
	And login to AEM using the credential as mentioned in the test data
	And click on broad promo tiles component
	When click on aem configure button
	Then user should see authoring error message as the mandatory fields are not entered
	
	