package centrilli.com.step_definitions;

import centrilli.com.pages.VerifyThatUserCanCreateNewVehicleLogPage;
import centrilli.com.utilities.BrowserUtils;
import centrilli.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyThatUserCanCreateNewVehicleLogStep {

    VerifyThatUserCanCreateNewVehicleLogPage verifyThatUserCanCreateNewVehicleLogPage = new VerifyThatUserCanCreateNewVehicleLogPage();
    WebDriverWait wait;


    @Given("user is on the posmanager homepage")
    public void user_is_on_the_posmanager_homepage() {

        Driver.getDriver().get("https://qa.centrilli.com/");
        verifyThatUserCanCreateNewVehicleLogPage.username.sendKeys("posmanager10@info.com");
        verifyThatUserCanCreateNewVehicleLogPage.password.sendKeys("posmanager");
        verifyThatUserCanCreateNewVehicleLogPage.loginBtn.click();

    }

    @Given("user clicks the More button")
    public void user_clicks_the_more_button() {
        verifyThatUserCanCreateNewVehicleLogPage.moreBtn.click();
    }

    @Then("user clicks the Fleet button")
    public void user_clicks_the_fleet_button() {
        verifyThatUserCanCreateNewVehicleLogPage.fleetBtn.click();
    }

    @Then("user clicks the Vehicle Service Logs Button")
    public void user_clicks_the_vehicle_service_logs_button() {
        verifyThatUserCanCreateNewVehicleLogPage.vehicleServiceLogs.click();
    }

    @Then("user checks the total vehicle number")
    public void user_checks_the_total_vehicle_number() {

        wait = new WebDriverWait(Driver.getDriver(), 30);
        String expectedTitle = "Vehicles Services Logs - Odoo";
        wait.until(ExpectedConditions.titleIs(expectedTitle));

        String vehicleServiceLogNumberBefore = verifyThatUserCanCreateNewVehicleLogPage.vehicleServiceLogsNumber.getText();
        System.out.println(vehicleServiceLogNumberBefore);


    }

    @Given("user clicks the create button")
    public void user_clicks_the_create_button() {
        verifyThatUserCanCreateNewVehicleLogPage.createBtn.click();
    }

    @When("user chooses Audi\\/A1\\/ as vehicle")
    public void user_chooses_audi_a1_as_vehicle() {
        verifyThatUserCanCreateNewVehicleLogPage.vehicleType.click();
        verifyThatUserCanCreateNewVehicleLogPage.AudiA1AsVehicleType.click();

    }

    @When("user chooses service type as Summer tires")
    public void user_chooses_service_type_as_summer_tires() {
        verifyThatUserCanCreateNewVehicleLogPage.ServiceType.click();
        verifyThatUserCanCreateNewVehicleLogPage.SummerTiresAsServiceType.click();
    }

    @Then("user inputs {string} as total price")
    public void user_inputs_as_total_price(String string) {

        verifyThatUserCanCreateNewVehicleLogPage.totalPrice.clear();
        verifyThatUserCanCreateNewVehicleLogPage.totalPrice.sendKeys(string);

    }

    @Then("user clicks save button")
    public void user_clicks_save_button() {
        verifyThatUserCanCreateNewVehicleLogPage.saveBtn.click();
    }

    @Then("user sees Audi\\/A1\\/ - Odoo as title")
    public void user_sees_audi_a1_odoo_as_title() {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Audi/A1/ - Odoo";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Given("user clicks Vehicle Service Logs link")
    public void user_clicks_vehicle_service_logs_link() {
        verifyThatUserCanCreateNewVehicleLogPage.vehicleServiceLogs.click();
    }

    @Then("user checks the total vehicle number more than before")
    public void user_checks_the_total_vehicle_number_more_than_before() {

        wait = new WebDriverWait(Driver.getDriver(),10);
        String waitedTitle = "Vehicles Services Logs - Odoo";
        wait.until(ExpectedConditions.titleIs(waitedTitle));
        String vehicleServiceLogsNumberLast = verifyThatUserCanCreateNewVehicleLogPage.vehicleServiceLogsNumber.getText();

        System.out.println("vehicleServiceLogsNumberLast = " + vehicleServiceLogsNumberLast);

    }






}
