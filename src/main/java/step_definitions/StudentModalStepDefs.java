package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_objects.AddStudentPage;

public class StudentModalStepDefs {

    private AddStudentPage addStudentPage = new AddStudentPage();
    private Faker faker = new Faker();

    @Given("user enters name in name field")
    public void useEntersInNameField() {
        addStudentPage.waitAndSetValueForNameField(faker.name().firstName());
        // Write code here that turns the phrase above into concrete actions
         }

    @Given("user enters email in email field")
    public void userEntersInEmailField() {
        addStudentPage.waitAndSetValueForEmailField(faker.internet().emailAddress());
        // Write code here that turns the phrase above into concrete actions

    }
    @Given("user enters {string} in gender field")
    public void user_enters_in_gender_field(String gender) {
        addStudentPage.waitAndSetGender(gender);
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        addStudentPage.clickOnSubmitButton();
        // Write code here that turns the phrase above into concrete actions
        }
}
