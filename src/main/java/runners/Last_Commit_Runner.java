package runners;

import java.util.stream.Stream;

import automation.library.logdetail.Log;

public final class Last_Commit_Runner {
	
	private static String[] defaultOptions = {
             
			"classpath:Adobe/Regression/OCCP_1756_Email_Not_Verified_And_User_Is_Trying_To_Login.feature",
			"--glue", "automation.library.stepDefination",
			"--tags", "@RegressionTest",
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
