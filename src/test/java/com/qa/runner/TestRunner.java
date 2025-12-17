package com.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/app/features/Loginpage.feature" }, glue = { "com.qa.StepDefinitions",
		"AppHooks" }, plugin = { "pretty", 
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
//				"timeline:test-output-thread/"
				
}

)

/*
 * @Suite
 * 
 * @IncludeEngines("cucumber")
 * 
 * @SelectClasspathResource("src/test/resources/app/features/Loginpage.feature")
 * // location on classpath of .feature files
 * 
 * @ConfigurationParameter(key = GLUE_PROPERTY_NAME, value =
 * "com.qa.StepDefinitions")
 * 
 * @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value =
 * "pretty, html:target/cucumber-report.html, json:target/cucumber.json")
 */

public class TestRunner {

}