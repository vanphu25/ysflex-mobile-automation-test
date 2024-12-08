package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage extends AppiumBase {
    public PlaceOrderPage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"004C002034\"]")
    private WebElement accountNumber;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Margin ratio\"]")
    private WebElement marginRatio;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Buying power\"]")
    private WebElement buyingPower;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Price\"]/..")
    private WebElement priceField;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Volume\"]")
    private WebElement volumeField;

    @FindBy(xpath = "//android.widget.TextView[@text=\"BUY\"]/..")
    private WebElement buyBtn;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Sell\"]/..")
    private WebElement sellBtn;

    public boolean isDisplayAccountNumber(){
        return checkIsDisplay(accountNumber);
    }

    public boolean isDisplayMarginRatio(){
        return checkIsDisplay(marginRatio);
    }

    public boolean isDisplayBuyingPower(){
        return checkIsDisplay(buyingPower);
    }

    public boolean isDisplayPriceField(){
        return checkIsDisplay(priceField);
    }

    public boolean isDisplayVolumeField(){
        return checkIsDisplay(volumeField);
    }

    public boolean isDisplayBuyBtn(){
        return checkIsDisplay(buyBtn);
    }

    public boolean isDisplaySellBtn(){
        return checkIsDisplay(sellBtn);
    }

}
