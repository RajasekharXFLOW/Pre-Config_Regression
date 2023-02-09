package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Selenium/PreConfig/src/main/java/com/qa/features/manageattributegroup.feature",
				glue="com/qa/stepDefinitions",dryRun=true,
				plugin={"com.cucumber.listener.ExtentCucumberFormatter:reports/manageattributegroupresults.html"},
				monochrome = true,
				strict = true)
public class AddAttributeToGroupTestCase //extends AbstractTestNGCucumberTests
{

}
