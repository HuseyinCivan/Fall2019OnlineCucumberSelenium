package com.vytrack.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags = "@view_calendar_events",
        plugin = {
                "html:target/dafault-report",
                "json:target/cucumber2.json"
        }

)
public class ActivitiesTestRunner extends AbstractTestNGCucumberTests {

}
