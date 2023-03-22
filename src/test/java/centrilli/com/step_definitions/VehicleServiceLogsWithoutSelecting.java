package centrilli.com.step_definitions;

import centrilli.com.pages.VehicleServiceLogsNumbersPage;
import centrilli.com.pages.VehicleServiceLogsWithoutSelectingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VehicleServiceLogsWithoutSelecting {

    VehicleServiceLogsNumbersPage vehicleServiceLogsNumbersPage = new VehicleServiceLogsNumbersPage();
    VehicleServiceLogsWithoutSelectingPage vehicleServiceLogsWithoutSelectingPage = new VehicleServiceLogsWithoutSelectingPage();

    @Given("user clicks save button without selecting vehicle")
    public void user_clicks_save_button_without_selecting_vehicle() {
        vehicleServiceLogsWithoutSelectingPage.saveBtn.click();
    }

    @Then("user should see The following fields are invalid warning message")
    public void user_should_see_the_following_fields_are_invalid_warning_message() {
        System.out.println(vehicleServiceLogsWithoutSelectingPage.warningMsg.getText());
    }


}
