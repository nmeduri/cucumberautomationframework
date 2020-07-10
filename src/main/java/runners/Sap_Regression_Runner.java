package runners;


import java.util.stream.Stream;
import cucumber.api.CucumberOptions;


public final class Sap_Regression_Runner {
	
	private static String[] defaultOptions = {

			"classpath:SAP/Regression/", 
			"--glue", "automation.library.stepDefinitions", 
			"--plugin", "pretty",
			"--plugin", "json:cucumber.json", 
			"--plugin", "com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html" ,
			"--plugin", "junit:target/JunitReports/SAP_Regression.xml",
			"--plugin", "html:target/selenium-reports"

	
	};

	public static void main(String[] args) throws Throwable {
       
		Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
		cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
	}
}
