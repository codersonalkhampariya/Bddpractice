package TestRunner;

import org.testng.TestRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(
        features = "src/test/java/Featurefile",
        glue = {"com.stepdef"},
        tags = {"@tag4"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
               ,"html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"
        })
public class RunnerClass{ 
private TestNGCucumberRunner testNGCucumberRunner;

@BeforeClass(alwaysRun = true)
public void setUpClass() throws Exception {
    testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
}

@Test(dataProvider = "scenarios")
public void feature(PickleEventWrapper eventwrapper,CucumberFeatureWrapper cucumberfeature) throws Throwable
{
testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());	

}

@DataProvider
public Object[][] scenarios() {
    return testNGCucumberRunner.provideScenarios();
}

@AfterClass(alwaysRun = true)
public void tearDownClass() throws Exception {
    testNGCucumberRunner.finish();
}
 }
