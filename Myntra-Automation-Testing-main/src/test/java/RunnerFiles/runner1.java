package RunnerFiles;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\dithoopa\\eclipse-workspace\\Myntra-Automation-Testing-main\\src\\test\\java\\Features\\myntra.feature"},
		glue = {"Definations"},
		plugin = {"json:target/cucumber.json"},
        monochrome = true
		
		)


public class runner1 {

//	features = {"C:\\Users\\dithoopa\\eclipse-workspace\\Cucumber\\src\\test\\java\\Features\\myntra.feature"},
//			glue = {"Definations"},
//			monochrome = true
}
