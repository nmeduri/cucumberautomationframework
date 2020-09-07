package runners;

import java.util.stream.Stream;

import automation.library.logdetail.Log;
import automation.library.selenium.base.BaseClass;

public final class Last_Commit_Runner extends BaseClass {
	public static String name;
	private static String[] defaultOptions = {
            
			
			"--glue", "automation.library.stepDefination",
			"--plugin", "pretty",
			"--plugin", "json:cucumber.json",
			"--plugin", "com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html",
			"--plugin", "junit:target/JunitReports/SAP_BVT.xml",
			"--plugin", "html:target/selenium-reports"
	};

	public static void main(String[] args) throws Throwable {
		Last_Commit_Runner ls = new Last_Commit_Runner();
		String className = ls.getClass().getSimpleName();
		name = className;
		conf.setProperty("className", className);
		conf.getProperty("className");
		Log.message("Class Name:- " + conf.getProperty("className"), true );
		Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
		cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
	}
}
