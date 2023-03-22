package centrilli.com.step_definitions;
import centrilli.com.pages.DiscardBtnPages;
import centrilli.com.pages.VehicleServiceLogsNumbersPage;
import centrilli.com.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Discard {

    DiscardBtnPages discardBtnPages = new DiscardBtnPages();
    VehicleServiceLogsNumbersPage vehicleServiceLogsNumbersPage = new VehicleServiceLogsNumbersPage();
    WebDriverWait wait;

    @Then("user clicks Discard button")
    public void user_clicks_discard_button() {
        discardBtnPages.discardBtn.click();
    }
    @Then("user sees warning to discard")
    public void user_sees_warning_to_discard() {
        System.out.println(discardBtnPages.warningMsg.getText());
        Assert.assertTrue(discardBtnPages.warningMsg.isDisplayed());
    }
    @Then("user clicks Ok for the warning message")
    public void user_clicks_ok_for_the_warning_message() {
        discardBtnPages.okForWarning.click();
    }
    @Then("user goes back to Vehicle Service Logs page")
    public void user_goes_back_to_vehicle_service_logs_page() {

        wait = new WebDriverWait(Driver.getDriver(),10);
        String waitedTitle = "Vehicles Services Logs - Odoo";
        wait.until(ExpectedConditions.titleIs(waitedTitle));
        System.out.println(Driver.getDriver().getTitle());


    }



}
