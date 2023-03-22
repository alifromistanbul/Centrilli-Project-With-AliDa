package centrilli.com.pages;

import centrilli.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleServiceLogsWithoutSelectingPage {

    public VehicleServiceLogsWithoutSelectingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='o_form_buttons_edit']/button)[1]")
    public WebElement saveBtn;

    @FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement warningMsg;



}
