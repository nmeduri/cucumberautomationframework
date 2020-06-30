package runners;

import java.util.stream.Stream;

public final class Sap_BVT_Runner {
	
	private static String[] defaultOptions = {

			"classpath:SAP/BVT/", 
			"--glue", "automation.library.api.stepDefination", 
			"--plugin", "pretty",
			"--plugin", "json:cucumber.json", 
			"--plugin", "com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html",
			"--plugin", "junit:target/JunitReports/SAP_BVT.xml"
	
	
	};

	public static void main(String[] args) throws Throwable {
        
		Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
		cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
	}
}
