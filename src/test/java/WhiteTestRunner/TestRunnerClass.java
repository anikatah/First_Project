package WhiteTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import WhiteUtility.WhiteBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/WhiteFolder"},
plugin = {"json:target/cucumber.json"},
glue = "WhiteStepDefinition")//tags = {"@Sanity"})

public class TestRunnerClass extends AbstractTestNGCucumberTests {

	
@BeforeTest
public void WhiteOpenURL () {
	WhiteBase testfile = new WhiteBase();
	testfile.WhiteBrowser();
}

@AfterTest
public void WhiteCloseURL () {
	WhiteBase testfile = new WhiteBase();
	testfile.driver.quit();
}
}
