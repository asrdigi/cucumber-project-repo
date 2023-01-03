package com.sapient.asde.cucumber;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:resources/features/BeerCans.feature"},
        glue = {"com.sapient.asde.cucumber"},
//        plugin = {"json:target/cucumber.json"},
        plugin = {
                "pretty",
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html"},
        monochrome = true )
public class RunCucumberTest {
}
