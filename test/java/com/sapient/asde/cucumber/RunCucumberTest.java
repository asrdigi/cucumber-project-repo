package com.sapient.asde.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/BeerCans.feature"},
        glue = {"com.sapient.asde.cucumber"},
        plugin = {"pretty", "json:target/cucumber-reports/CucumberTestReport.json"},
        monochrome= true
)
public class RunCucumberTest {
}
