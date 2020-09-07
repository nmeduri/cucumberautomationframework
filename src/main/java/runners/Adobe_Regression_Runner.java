package runners;


import java.util.stream.Stream;

import automation.library.logdetail.Log;
import automation.library.selenium.base.BaseClass;
import cucumber.api.CucumberOptions;


public final class Adobe_Regression_Runner extends BaseClass {
	
	private static String[] defaultOptions = {


			"classpath:Adobe/Regression/", 
			"--glue", "automation.library.stepDefination", 
			"--plugin", "pretty",
			"--tags", "@WebView",
			"--plugin", "json:cucumber.json",
			"--plugin", "junit:target/JunitReports/Adobe_Regression.xml" ,
			"--plugin", "html:target/selenium-reports",
			"--plugin", "com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html"

		};

	public static void main(String[] args) throws Throwable {
		Adobe_Regression_Runner ls = new Adobe_Regression_Runner();
		String className = ls.getClass().getSimpleName();
		Log.message("Class Name:- " + className, true);
		conf.setProperty("className", className);
		Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
		cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
		
	}
}
