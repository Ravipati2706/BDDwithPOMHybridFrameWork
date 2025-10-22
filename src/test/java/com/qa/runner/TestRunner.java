package com.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/qa/features"},
		glue = {"com.qa.StepDefinitions", "AppHooks"},
		plugin = {"pretty",
		
		}
		
		)

public class TestRunner {

}