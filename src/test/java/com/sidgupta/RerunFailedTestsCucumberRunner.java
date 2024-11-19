package com.sidgupta;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "@results/failed_scenarios.txt",
        glue = "com.sidgupta.bdd",
        plugin = {
                "pretty",
                "html:results/rerun-results.html"
        }
)
public class RerunFailedTestsCucumberRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
