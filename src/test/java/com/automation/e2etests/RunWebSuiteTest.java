package com.automation.e2etests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE; 

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/spec/features"},//emplacement des cas de test
		plugin = {"pretty","html:target/report/cucumber-report.html", "json:target/report/cucumber.json"},//emplacement du rapport
		//glue = {"steps_définitions"},
		tags = ("@Login"), 
		monochrome = true,//ordonner la console
		snippets = CAMELCASE
		)
public class RunWebSuiteTest {

}
