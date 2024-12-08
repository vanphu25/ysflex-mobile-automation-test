package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class NewsPage extends AppiumBase {
    public NewsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")
    private WebElement hotNews;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")
    private List<WebElement> listNews;

    public boolean isDisplayHotNews(){
        return checkIsDisplay(hotNews);
    }

    public int checklistNews(){
        webDriverWait.until(ExpectedConditions.visibilityOfAllElements(listNews));
        return listNews.size();
    }
}
