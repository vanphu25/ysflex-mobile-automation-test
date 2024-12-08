package core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class AppiumBase {
    //khai bao driver
    public static AndroidDriver androidDriver;

    //driver wait
    public static WebDriverWait webDriverWait;

    //ket noi app
    public void createDriver() throws MalformedURLException {
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setPlatformName("Android");
        uiAutomator2Options.setUdid("emulator-5554");
        uiAutomator2Options.setAutomationName("UiAutomator2");
        uiAutomator2Options.setAppPackage("vn.ysvn.ysflex");
        uiAutomator2Options.setAppActivity("vn.ysvn.ysflex.MainActivity");
        androidDriver = new AndroidDriver(new URL("http://localhost:4723"),uiAutomator2Options);
        webDriverWait = new WebDriverWait(androidDriver, Duration.ofSeconds(30));
    }

    //kiem tra hien thi element
    public boolean checkIsDisplay(WebElement element){
        boolean result = false;
        try{
            webDriverWait.until(ExpectedConditions.visibilityOf(element));
            result =  element.isDisplayed();
        }catch(Exception e){
            e.getStackTrace();
        }
        return result;
    }

    //dong driver
    public void closeDriver(){
        androidDriver.quit();
    }
}

