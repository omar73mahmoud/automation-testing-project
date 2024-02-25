package org.example.Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
public class testRunner extends AbstractTestNGCucumberTests{
    @CucumberOptions(
            features = "src/main/resources/features",
            glue =    {"org.example.stepDefs"},
            plugin = {          "pretty",
                    "html:target/cucumber.html",
                    "json:target/cucumber.json",
                    "junit:target/cukes.xml",
                    "rerun:target/rerun.txt"},
            tags = "@smoke"
    )

}
