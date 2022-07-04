package io.klever.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        dryRun = false,
        features = "src/test/resources/features/",
        glue= "io.klever.Steps",
        tags = "@NFT",
        monochrome = true,
        publish = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        stepNotifications = false
)








public class runner {

}



















