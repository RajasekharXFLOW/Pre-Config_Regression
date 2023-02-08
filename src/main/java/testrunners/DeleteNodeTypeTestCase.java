package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Selenium/PreConfig/src/main/java/com/qa/features/deletenodetype.feature",
				glue="com/qa/stepDefinitions",dryRun=false,
				plugin={"com.cucumber.listener.ExtentCucumberFormatter:reports/deletenoderesults.html"},
				monochrome = true,
				strict = true
				)

public class DeleteNodeTypeTestCase extends AbstractTestNGCucumberTests
{

}