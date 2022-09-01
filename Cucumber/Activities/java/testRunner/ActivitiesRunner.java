package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        //tags = "@activity1"
        //tags = "@activity2"
        tags = "@SmokeTest",
        //tags = "@activity4"
        //tags = "@activity5"
        //plugin = {"pretty"},
        plugin = {"html: test-reports"},
        //plugin = {"json: test-reports"},
        monochrome = true
)

public class ActivitiesRunner {
    //empty
}