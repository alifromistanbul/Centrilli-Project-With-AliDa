package centrilli.com.pages;

import centrilli.com.step_definitions.VehicleServiceLogsNumbers;
import centrilli.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleServiceLogsNumbersPage {

    public VehicleServiceLogsNumbersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//li[@class='o_user_menu']/a/span")
    public WebElement posmanagerHomePage;

    @FindBy(xpath = "(//a[@href='#'])[1]")
    public WebElement moreBtn;

    @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[17]")
    public WebElement fleetBtn;

    @FindBy(xpath = "//a[@href='/web#menu_id=148&action=165']/span")
    public WebElement vehicleServiceLogs;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement vehicleServiceLogsText;

    @FindBy(xpath = "//div[@class='o_cp_pager']/div/span[1]//span[2]")
    public WebElement vehicleServiceLogsNumber;

    @FindBy(xpath = "//div[@class='o_list_buttons']/button")
    public WebElement createBtn;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement vehicleType;

    @FindBy(xpath = "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li)[1]")
    public WebElement AudiA1AsVehicleType;

    @FindBy(xpath = "(//div[@class='o_input_dropdown']/input)[2]")
    public WebElement ServiceType;

    @FindBy(xpath = "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'])[2]/li[4]")
    public WebElement SummerTiresAsServiceType;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement totalPrice;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;





}
