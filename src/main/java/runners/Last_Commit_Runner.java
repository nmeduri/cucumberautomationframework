package runners;

import java.util.stream.Stream;

public final class Last_Commit_Runner {
	
	private static String[] defaultOptions = {

			
			"classpath:SAP/Regression/OCCP_1561_PLP_Breadcrumb.feature","classpath:SAP/Regression/OCCP_1576_Product_Badges.feature",
			"--glue", "automation.library.api.stepDefination", 
			"--plugin", "pretty",
			"--plugin", "json:cucumber.json",
			"--plugin", "com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html",
			"--plugin", "junit:target/JunitReports/SAP_BVT.xml",
			"--plugin", "html:target/selenium-reports"
	};

	public static void main(String[] args) throws Throwable {
        
		Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
		cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
	}
}
