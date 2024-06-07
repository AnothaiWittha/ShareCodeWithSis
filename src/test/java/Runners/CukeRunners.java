package Runners;

import org.junit.runner.RunWith;

import Utilities2.Constants2;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

	plugin = {"pretty","html:target/cucumber_reports/report.html",
			"json:target/cucumber_reports/report2.json",
			"junit:target/cucumber_reports/report3.xml"},
	features = Constants2.feature_path,
	glue = {"StepDefinitions"},
	dryRun = false,
	monochrome=  true //<<< for the Cucumber test are much more readable.
	
		)
public class CukeRunners {

	
}
