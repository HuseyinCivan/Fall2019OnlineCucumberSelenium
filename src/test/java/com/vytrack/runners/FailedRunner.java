package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "@target/rerun.txt",   //buraya rerun in path i koy !!
//        dryRun = false, NO NEED
        strict = false,
//        tags = "@view_calendar_events",  NO NEED
        plugin ={
                "html:target/failed-default-report",
                "json:target/failed_cucumber1.json",
            //    "rerun:target/rerun.txt"    // --> no need this part //  bence kalsa daha iyi ama, gecince rerun.txt bos veriyor.
        }

)


public class FailedRunner {
}
