package step_definitions;

import io.cucumber.java.en.Then;
import page_objects.Notifications;

import static constants.AllConstants.Messages.STUDENT_SUCCESSFULLY_ADDED;
import static org.testng.Assert.assertEquals;

public class NotificationStepDefs {

    Notifications notifications = new Notifications();
    @Then("user is created")
    public void user_is_created() {
        assertEquals(notifications.getMessageFromNotification(), STUDENT_SUCCESSFULLY_ADDED);
        // Write code here that turns the phrase above into concrete actions
        }
}
