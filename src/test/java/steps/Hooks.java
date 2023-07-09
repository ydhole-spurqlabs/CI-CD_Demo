package steps;

import core.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.WebUtil;

public class Hooks extends TestContext {
    @Before("@Basic")
    public void beforeScenario(Scenario scenario) {
        driver = WebUtil.initWebDriver();
    }

    @After("@Basic")
    public void afterScenario() {
        WebUtil.tearDown();
    }
}
