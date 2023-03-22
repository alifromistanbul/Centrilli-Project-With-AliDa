package centrilli.com.pages;

import centrilli.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewServiceLogUnderServiceListPage {

    public NewServiceLogUnderServiceListPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='fa fa-chevron-right btn btn-icon o_pager_next']")
    public WebElement nextBtn;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='o_searchview active']")
    public WebElement searchBoxSendKey;

    @FindBy(xpath = "//div[@class='o_cp_pager']/div/span/span")
    public WebElement vehicleServiceNumber;


}
