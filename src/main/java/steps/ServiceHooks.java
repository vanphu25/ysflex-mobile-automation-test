package steps;

import core.AppiumBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.net.MalformedURLException;


public class ServiceHooks extends AbstractTestNGCucumberTests {
    AppiumBase appiumBase = new AppiumBase();

    //khởi tạo driver/app
    @Before
    public void before() throws MalformedURLException {
            appiumBase.createDriver();
    }

    //đóng app và chụp hình lỗi sai
    @After
    public void after(Scenario scenario) {
        if(scenario.isFailed()){
            scenario.attach(((TakesScreenshot)appiumBase.androidDriver).getScreenshotAs(OutputType.BYTES),"image/png","appium");
        }
            appiumBase.closeDriver();
    }
}

