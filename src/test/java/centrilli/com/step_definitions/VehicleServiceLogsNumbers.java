package centrilli.com.step_definitions;

import centrilli.com.pages.VehicleServiceLogsNumbersPage;
import centrilli.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class VehicleServiceLogsNumbers {

    VehicleServiceLogsNumbersPage vehicleServiceLogsNumbersPage = new VehicleServiceLogsNumbersPage();
    int vehicleServiceLogsNumber;
    WebDriverWait wait;


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get("https://qa.centrilli.com/");
    }

    @When("user enters {string} to email input box")
    public void user_enters_to_email_input_box(String string) {
        vehicleServiceLogsNumbersPage.username.sendKeys(string);
    }

    @Then("user enters {string} to password input box")
    public void user_enters_to_password_input_box(String string) {
        vehicleServiceLogsNumbersPage.password.sendKeys(string);
    }

    @Then("user click login button")
    public void user_click_login_button() {
        vehicleServiceLogsNumbersPage.loginBtn.click();
    }

    @Then("user is on the posmanager homepage")
    public void user_is_on_the_posmanager_homepage() {
        String actualTitle = vehicleServiceLogsNumbersPage.posmanagerHomePage.getText();
        String expectedTitle = "POSManager10";
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @Given("user clicks the More button")
    public void user_clicks_the_more_button() {
        vehicleServiceLogsNumbersPage.moreBtn.click();
    }

    @Then("user clicks the Fleet button")
    public void user_clicks_the_fleet_button() {
        vehicleServiceLogsNumbersPage.fleetBtn.click();
    }

    @Then("user clicks the Vehicle Service Logs Button")
    public void user_clicks_the_vehicle_service_logs_button() {
        vehicleServiceLogsNumbersPage.vehicleServiceLogs.click();
    }

    @Then("user checks the total vehicle number")
    public void user_checks_the_total_vehicle_number() {
        wait = new WebDriverWait(Driver.getDriver(), 30);
        String expectedTitle = "Vehicles Services Logs - Odoo";
        wait.until(ExpectedConditions.titleIs(expectedTitle));

        vehicleServiceLogsNumber = Integer.parseInt(vehicleServiceLogsNumbersPage.vehicleServiceLogsNumber.getText());
        System.out.println("vehicleServiceLogsNumber = " + vehicleServiceLogsNumber);

    }

    @Given("user clicks the create button")
    public void user_clicks_the_create_button() {
        vehicleServiceLogsNumbersPage.createBtn.click();
    }

    @When("user chooses Audi\\/A1\\/ as vehicle")
    public void user_chooses_audi_a1_as_vehicle() {
        vehicleServiceLogsNumbersPage.vehicleType.click();
        vehicleServiceLogsNumbersPage.AudiA1AsVehicleType.click();
    }

    @When("user chooses service type as Summer tires")
    public void user_chooses_service_type_as_summer_tires() {
        vehicleServiceLogsNumbersPage.ServiceType.click();
        vehicleServiceLogsNumbersPage.SummerTiresAsServiceType.click();
    }

    @Then("user inputs {string} as total price")
    public void user_inputs_as_total_price(String string) {
        vehicleServiceLogsNumbersPage.totalPrice.clear();
        vehicleServiceLogsNumbersPage.totalPrice.sendKeys(string);
    }

    @Then("user clicks save button")
    public void user_clicks_save_button() {
        vehicleServiceLogsNumbersPage.saveBtn.click();
    }

    @Then("user sees Audi\\/A1\\/ - Odoo as title")
    public void user_sees_audi_a1_odoo_as_title() {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
    }

    @Given("user clicks Vehicle Service Logs link")
    public void user_clicks_vehicle_service_logs_link() {
        vehicleServiceLogsNumbersPage.vehicleServiceLogs.click();
    }

    @Then("user checks the total vehicle number more than before")
    public void user_checks_the_total_vehicle_number_more_than_before() {

        wait = new WebDriverWait(Driver.getDriver(),10);
        String waitedTitle = "Vehicles Services Logs - Odoo";
        wait.until(ExpectedConditions.titleIs(waitedTitle));
        String vehicleServiceLogsNumberLast = vehicleServiceLogsNumbersPage.vehicleServiceLogsNumber.getText();
        System.out.println("vehicleServiceLogsNumberLast = " + vehicleServiceLogsNumberLast);

    }


}
