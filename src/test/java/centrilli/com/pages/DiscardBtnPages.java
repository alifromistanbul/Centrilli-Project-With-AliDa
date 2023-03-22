package centrilli.com.pages;

import centrilli.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscardBtnPages {

    public DiscardBtnPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='o_form_buttons_edit']/button)[2]")
    public WebElement discardBtn;

    @FindBy(tagName = "h4")
    public WebElement warningMsg;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']/span")
    public WebElement okForWarning;

}
