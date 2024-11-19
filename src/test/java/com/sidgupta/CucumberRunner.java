package com.sidgupta;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features",
        glue = "com.sidgupta.bdd",
//        dryRun = true,
        tags = "@PlaceOrder or @OffersPage",
        plugin = {
                "pretty",
                "html:results/report.html",
                "rerun:results/failed_scenarios.txt"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
