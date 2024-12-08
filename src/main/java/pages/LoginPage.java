package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends AppiumBase {
    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")
    private WebElement allowPermission;

    @FindBy(xpath = "//android.widget.EditText[@text=\"004c\"]")
    private WebElement accountLogin;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.EditText")
    private WebElement passwordLogin;

    @FindBy(xpath = "//android.widget.TextView[@text=\"LOGIN\"]")
    private WebElement loginBtn;

    public void clickAllowPermission(){
        webDriverWait.until(ExpectedConditions.visibilityOf(allowPermission)).click();
    }

    public void login(String account,String pw){
        webDriverWait.until(ExpectedConditions.visibilityOf(accountLogin));
        accountLogin.sendKeys(account);
        passwordLogin.clear();
        passwordLogin.sendKeys(pw);
        loginBtn.click();
    }


}
