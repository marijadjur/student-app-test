package step_definitions;

import io.cucumber.java.en.Given;
import utils.ConfigHelper;

import static utils.DriverManager.getInstance;

public class CommonStepDefs {
    @Given("user is on the app page")
    public void userIsOnTheAppPage() {
        getInstance().get(ConfigHelper.getConfig().getString("student.app.hostname"));
        // Write code here that turns the phrase above into concrete actions
         }
}
