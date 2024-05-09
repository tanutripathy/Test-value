import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/feature",
        glue = {"stepDeinition","browserControl"}
)


public class TestRunner extends AbstractTestNGCucumberTests {
}
