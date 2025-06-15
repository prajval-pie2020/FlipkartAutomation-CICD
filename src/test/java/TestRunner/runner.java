package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Admin\\Downloads\\FlipkartAutomationaProject\\cicd\\FlipkartAutomationProject\\src\\test\\resources\\Features\\SearchFunctionality.feature",
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class runner {


}
