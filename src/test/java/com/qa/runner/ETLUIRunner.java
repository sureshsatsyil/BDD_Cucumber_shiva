package com.qa.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.qa.util.ETLTestBase;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

//		features = "D:\\Study\\automated-testing\\src\\test\\java\\com\\qa\\features\\SurveyManagement.feature", 
	    features = "src\\test\\java\\com\\qa\\features", 
		glue = { "com.qa.stepDefinations" }, // to check the mapping is proper between feature file and step def file.
		monochrome = true, // display the console output in a proper readable format.
		strict = false, // it will check if any step is not defined in step definition file.
		dryRun = false, // It generates the code snippet for the missing step definitions.
		tags = { "@Smoke1234" },
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:D:\\Study\\automated-testing\\ExtentReports\\report.html" })

public class ETLUIRunner extends ETLTestBase {

	@AfterClass
	public static void setup() {
		Reporter.loadXMLConfig(new File("D:\\Study\\automated-testing\\src\\test\\java\\com\\qa\\config\\extent-config.xml"));
		Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
		Reporter.setSystemInfo("Test User", "BinaryAutomationTeam");
		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Web App Name", "tools-etl.dev");
		Reporter.setSystemInfo("Build version", "VSample 1.0");
		Reporter.setTestRunnerOutput("Cucumber reporting using Extent Config");
	}

}