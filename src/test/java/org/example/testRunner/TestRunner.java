package org.example.testRunner;

        import io.cucumber.junit.Cucumber;
        import io.cucumber.junit.CucumberOptions;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features"},
        glue = {"org/example/stepdefinitions"}
)
//NOTE:  org.example - we change it to org/example (above example)
//NOTE: as it wasn't created as TrelloTest
//Help run the test

public class TestRunner {
}
