package centrilli.com.step_definitions;

import centrilli.com.pages.AttachmentAndActionPage;
import centrilli.com.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AttachmentAndActionBtn {

    AttachmentAndActionPage attachmentAndActionPage = new AttachmentAndActionPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    @Then("user sees Attachment button")
    public void user_sees_attachment_button() {
        wait.until(ExpectedConditions.visibilityOf(attachmentAndActionPage.attachmentBtn));
        Assert.assertTrue(attachmentAndActionPage.attachmentBtn.isDisplayed());
    }

    @Then("user sees Action button")
    public void user_sees_action_button() {
        Assert.assertTrue(attachmentAndActionPage.actionBtn.isDisplayed());
    }
}
