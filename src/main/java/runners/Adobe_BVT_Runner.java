package runners;

import java.util.stream.Stream;
import automation.library.logdetail.Log;
import cucumber.api.CucumberOptions;

@CucumberOptions(

		

)

public final class Adobe_BVT_Runner {
	
	private static String[] defaultOptions = {

			"classpath:Adobe/BVT/", "--glue", "automation.library.stepDefinitions", 
			"--plugin", "pretty",
			"--plugin", "json:cucumber.json", 
			"--plugin", "com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html" 
		};

	public static void main(String[] args) throws Throwable {
        Log.message("Test", true);
		Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
		cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
		
	}
}
