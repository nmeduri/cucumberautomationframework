package runners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/main/resources/apiFeature",
        strict = true,
        glue = {"automation.library.api.stepDefination"}
        
)

/**
 * Test Runner Class for API Testing
 */
public class RunnerAPI_Junit   {

}

