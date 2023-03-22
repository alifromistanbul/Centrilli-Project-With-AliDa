package centrilli.com.step_definitions;

import centrilli.com.pages.VehicleServiceLogsNumbersPage;
import centrilli.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.BeforeClass;

public class Hooks {

    VehicleServiceLogsNumbersPage vehicleServiceLogsNumbersPage = new VehicleServiceLogsNumbersPage();

    @BeforeClass
    public void setUpForLogin() {

        Driver.getDriver().get("https://qa.centrilli.com/");
        vehicleServiceLogsNumbersPage.username.sendKeys("posmanager10@info.com");
        vehicleServiceLogsNumbersPage.password.sendKeys("posmanager");
        vehicleServiceLogsNumbersPage.loginBtn.click();
        String actualTitle = vehicleServiceLogsNumbersPage.posmanagerHomePage.getText();
        String expectedTitle = "POSManager10";
        Assert.assertEquals(actualTitle, expectedTitle);

    }


}


