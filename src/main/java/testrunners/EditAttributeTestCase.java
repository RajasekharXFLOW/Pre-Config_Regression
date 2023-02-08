package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Selenium/PreConfig/src/main/java/com/qa/features/editattribute.feature",
				glue="com/qa/stepDefinitions",dryRun=false,
				plugin={"com.cucumber.listener.ExtentCucumberFormatter:reports/editattributeresults.html"},
				monochrome = true,
				strict = true)

public class EditAttributeTestCase extends AbstractTestNGCucumberTests
{

}
