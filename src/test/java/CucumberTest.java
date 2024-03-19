import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html"},
        glue = {"stepDef"},
        features = {"src/test/java/features"},
        monochrome = true
)
//cara jalanin cucumber di teminal
// ./gradlew cucumber
// Cara jalanin Tc hanya 1 saja
// ./gradlew cucumber -Ptags="@login-invalid"

public class CucumberTest {
}
