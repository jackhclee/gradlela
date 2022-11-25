import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.ConfigurationParameter;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "cucumber")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value= "html:build/reports/cucumber.html")
public class CucumberTest {

}
