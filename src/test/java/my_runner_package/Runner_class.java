package my_runner_package;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = { "pretty","json:target/cucumber.json" },
        features = "./Feature", 
        glue = {"step_defination_package","hook_package"},
        tags = "@smoke"

)

public class Runner_class extends AbstractTestNGCucumberTests{

}
