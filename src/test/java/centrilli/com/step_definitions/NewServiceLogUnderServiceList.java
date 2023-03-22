package centrilli.com.step_definitions;

import centrilli.com.pages.NewServiceLogUnderServiceListPage;
import centrilli.com.pages.VehicleServiceLogsNumbersPage;
import centrilli.com.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NewServiceLogUnderServiceList {

    NewServiceLogUnderServiceListPage newServiceLogUnderServiceListPage = new NewServiceLogUnderServiceListPage();
    VehicleServiceLogsNumbersPage vehicleServiceLogsNumbersPage = new VehicleServiceLogsNumbersPage();

    @Then("user inputs Audi\\/A1\\/ to the search box")
    public void user_inputs_audi_a1_to_the_search_box() {
      newServiceLogUnderServiceListPage.searchBox.sendKeys("Audi/A1/   ");

    }

    @Then("user goes to the last page of the list")
    public void user_goes_to_the_last_page_of_the_list() {

       String vehicleNumbersInPage =  newServiceLogUnderServiceListPage.vehicleServiceNumber.getText();
       String vehicleMaxNumber = vehicleServiceLogsNumbersPage.vehicleServiceLogsNumber.getText();

       while(!vehicleNumbersInPage.contains(vehicleMaxNumber)){
           newServiceLogUnderServiceListPage.nextBtn.click();
       }

    }

    @Then("user sees the new created Audi\\/A1\\/ on the screen displayed")
    public void user_sees_the_new_created_audi_a1_on_the_screen_displayed() {

        System.out.println(vehicleServiceLogsNumbersPage.AudiA1AsVehicleType.getText());

        Assert.assertTrue(vehicleServiceLogsNumbersPage.AudiA1AsVehicleType.isDisplayed());

    }

}
