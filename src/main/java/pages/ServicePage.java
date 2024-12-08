package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicePage extends AppiumBase {
    public ServicePage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Stock transactions\"]")
    private WebElement stockTransaction;

    @FindBy(xpath = "//android.widget.TextView[@text=\"GTD order\"]")
    private WebElement gtdOrder;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Take profit, Stop loss Order\"]")
    private WebElement takeProfit;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Products\"]")
    private WebElement products;

    @FindBy(xpath = "//android.widget.TextView[@text=\"YSwealth\"]")
    private WebElement ysWeealth;

    @FindBy(xpath = "//android.widget.TextView[@text=\"YSradar\"]")
    private WebElement ysRadar;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Cash transactions\"]")
    private WebElement cashTransaction;

    public boolean isDisplayStockTransaction(){
        return checkIsDisplay(stockTransaction);
    }

    public boolean isDisplayGtdOrder(){
        return checkIsDisplay(gtdOrder);
    }

    public boolean isDisplayTakeProfit(){
        return checkIsDisplay(takeProfit);
    }

    public boolean isDisplayProducts(){
        return checkIsDisplay(products);
    }

    public boolean isDisplayYSWealth(){
        return checkIsDisplay(ysWeealth);
    }

    public boolean isDisplayYsRadar(){
        return checkIsDisplay(ysRadar);
    }

    public boolean isDisplayCashTransaction(){
        return checkIsDisplay(cashTransaction);
    }




}
