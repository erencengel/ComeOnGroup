package com.hajper.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/hajper/step_definitions",
        tags = "@wip",
        plugin = {"json:target/cucumber.json",
        "html:target/default-html-reports"}
)


public class CukesRunner {
}
