package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssetManagementPage extends AppiumBase {
    public AssetManagementPage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Assets\"]")
    private WebElement assetSection;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"Cash\"])[2]")
    private WebElement cash;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Purchasing power\"]")
    private WebElement purchasePower;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Net assets\"]")
    private WebElement netAssets;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Total Cash balance\"]")
    private WebElement totalCash;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Sell by ratio\"]")
    private WebElement sellByRatioBtn;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"Stock\"])[1]")
    private WebElement stock;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Total assets\"]")
    private WebElement totalAsset;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Liabilities\"]")
    private WebElement liabilities;

    public boolean isDisplayCash(){
        return checkIsDisplay(cash);
    }

    public boolean isDisplayPurchasePower(){
        return checkIsDisplay(purchasePower);
    }
    public boolean isDisplayTotalCash(){
        return checkIsDisplay(totalCash);
    }
    public boolean isDisplayStock(){
        return checkIsDisplay(stock);
    }
    public boolean isDisplayTotalAsset(){
        return checkIsDisplay(totalAsset);
    }
    public boolean isDisplayLiabilities(){
        return checkIsDisplay(liabilities);
    }
    public boolean isDisplayNetAssets(){
        return checkIsDisplay(netAssets);
    }
    public boolean isDisplaySellRatio(){
        return checkIsDisplay(sellByRatioBtn);
    }




}
