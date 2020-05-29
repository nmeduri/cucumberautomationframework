package com.ctc;

import java.util.stream.Stream;


public class RunCucumber {
	private static String[] defaultOptions = {
            "--glue", "com.ctc",
            "--plugin", "pretty",
            "--plugin", "json:cucumber.json",
			"classpath:AEM/"
    };
 
    public static void main(String[] args) {
        Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
		//cucumberOptions.forEach(s -> System.out.println(s));
		//System.out.println(cucumberOptions.toArray(String[]::new).toString());
        cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
    }
}