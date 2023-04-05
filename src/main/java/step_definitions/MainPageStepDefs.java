package step_definitions;

import io.cucumber.java.en.Given;
import page_objects.AllStudentsPage;

public class MainPageStepDefs {

    AllStudentsPage allStudentsPage = new AllStudentsPage();
    @Given("user click on add student button")
    public void user_click_on_add_student_button() {
        allStudentsPage.waitAndClickOnAddStudentButton();
        // Write code here that turns the phrase above into concrete actions
     }
}
