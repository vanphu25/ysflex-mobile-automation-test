package pages;

import core.AppiumBase;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends AppiumBase {
    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Assets management\"]/../../preceding-sibling::android.view.ViewGroup")
    private WebElement marketMenu;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Assets management\"]")
    private WebElement assetManagementMenu;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Place order\"]")
    private WebElement placeOrderMenu;

    @FindBy(xpath = "//android.widget.TextView[@text=\"News\"]")
    private WebElement newsMenu;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Service\"]")
    private WebElement serviceMenu;

    @FindBy(xpath = "//android.webkit.WebView")
    private WebElement webView;

    @FindBy(xpath = "//android.widget.TextView[@text=\" VN Index\"]")
    private WebElement vnIndexTitle;

    @FindBy(xpath = "//android.widget.TextView[@text=\" VN Index\"]//following-sibling::android.view.ViewGroup[2]")
    private WebElement vnIndexBoard;

    @FindBy(xpath = "//android.widget.TextView[@text=\" HNX Index\"]")
    private WebElement hnxIndexTitle;

    @FindBy(xpath = "//android.widget.TextView[@text=\" HNX Index\"]//following-sibling::android.view.ViewGroup[2]")
    private WebElement hnxIndeBoard;

    @FindBy(xpath = "//android.widget.TextView[@text=\" UPC Index\"]")
    private WebElement upcIndexTitle;

    @FindBy(xpath = "//android.widget.TextView[@text=\" UPC Index\"]//following-sibling::android.view.ViewGroup[2]")
    private WebElement upcIndexBoard;

    @FindBy(xpath = "//android.widget.TextView[@text=\"HPG\"]/..")
    private WebElement rowTrading;

    public void inputOTP(){
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_4));
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_5));
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_6));
    }

    public boolean checkDisplayWebView(){
       return checkIsDisplay(webView);
    }

    public boolean checkDisplayVnIndex(){
       return checkIsDisplay(vnIndexBoard);
    }

    public boolean checkDisplayHnxIndex(){
       return checkIsDisplay(hnxIndeBoard);
    }

    public boolean checkDisplayUpcIndex(){
       return checkIsDisplay(upcIndexBoard);
    }

    public boolean checkDisplayTable(){
       return checkIsDisplay(rowTrading);
    }

    public void clickMarket(){
        try{
            webDriverWait.until(ExpectedConditions.visibilityOf(marketMenu));
            marketMenu.click();
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    public void clickAssetManagement(){
        webDriverWait.until(ExpectedConditions.visibilityOf(assetManagementMenu));
        assetManagementMenu.click();
    }

    public void clickPlaceOrder(){
        webDriverWait.until(ExpectedConditions.visibilityOf(placeOrderMenu));
        placeOrderMenu.click();
    }

    public void clickNews(){
        webDriverWait.until(ExpectedConditions.visibilityOf(newsMenu));
        newsMenu.click();
    }

    public void clickService(){
        webDriverWait.until(ExpectedConditions.visibilityOf(serviceMenu));
        serviceMenu.click();
    }
}
