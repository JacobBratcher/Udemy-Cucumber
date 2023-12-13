package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", dryRun=true, // dryRun=true used for finding errors, take out when actually trying to execute 
// AND OR statements for test tags, always together inside of double quotes 
// also can do a NOT statement to avoid certain tests with a specific tag 
glue="stepDefinitons",monochrome=true, tags="@SmokeTest or @RegressionTest",
// makes feature files pretty and sends report to html or json (good for graphs, charts, etc.) 
plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
