package com.infinity.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/html-report.html",
                "json:target/json-report.json",
        },
        features = "src/test/resources/features",
        glue = "com/infinity/step_definitions",
        tags = "",
        dryRun = false
)
public class CukesRunner {
}
