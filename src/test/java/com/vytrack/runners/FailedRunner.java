package com.vytrack.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "@target/rerun.txt",   //buraya rerun in path i koy !!
//        dryRun = false, NO NEED
        strict = false,
//        tags = "@view_calendar_events",  NO NEED
        plugin = {
                "html:target/failed-default-report",
                "json:target/failed_cucumber1.json",
                "rerun:target/rerun.txt"    // --> no need this part //  bence kalsa daha iyi ama, gecince rerun.txt bos veriyor.
        }

)


public class FailedRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {

        return super.scenarios();
    }
}
