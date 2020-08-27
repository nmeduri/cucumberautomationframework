package runners;

import java.util.stream.Stream;

import automation.library.logdetail.Log;

public final class Last_Commit_Runner {
	
	private static String[] defaultOptions = {
             
			"classpath:Adobe/Regression/OCCP_1673_Account_Triangle_ID_Registration_Verification_Email_Confirmation.feature",
			"--glue", "automation.library.stepDefination",
			"--tags", "@SmokeTest",
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
