package runners;


import java.util.stream.Stream;

import automation.library.logdetail.Log;
import automation.library.selenium.base.BaseClass;
/**
 * This file execute the scenarios of Adobe BVT
 */

public final class UAT_BVT_Runner extends BaseClass {
	
	private static String[] defaultOptions = {
			"classpath:UAT/BVT/", 
			"--glue", "automation.library.stepDefination", 
			"--plugin", "pretty",
			"--tags", "@WebView",
			"--plugin", "json:cucumber.json", 
			"--plugin", "com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html",
			"--plugin", "junit:target/JunitReports/Adobe_BVT.xml",
			"--plugin", "html:target/selenium-reports"
		};

	public static void main(String[] args) throws Throwable {
		UAT_BVT_Runner ls = new UAT_BVT_Runner();
		String className = ls.getClass().getSimpleName();
		Log.message("Class Name:- " + className, true);
		conf.setProperty("className", className);
		Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
		cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
		
	}
}
