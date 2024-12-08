package steps;

import com.beust.ah.A;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;

public class FirstStepdefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AssetManagementPage assetManagementPage = new AssetManagementPage();
    PlaceOrderPage placeOrderPage = new PlaceOrderPage();
    NewsPage newsPage = new NewsPage();
    ServicePage servicePage = new ServicePage();

    @Given("Mo app ysflex")
    public void moAppYsflex() {}

//    @When("Nhan nut Allow")
    public void nhanNutAllow() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.clickAllowPermission();
    }

//    @And("Di chuyen den trang dang nhap")
//    public void diChuyenDenTrangDangNhap()  {
//
//    }

//    @And("Dang nhap voi tai khoan {string} va mat khau {string}")
    public void dangNhapVoiTaiKhoanVaMatKhau(String arg0, String arg1) throws InterruptedException {
        Thread.sleep(5000);
        loginPage.login(arg0, arg1);
    }

//    @Then("Di chuyen den trang chu")
    public void diChuyenDenTrangChu() throws InterruptedException {
        Thread.sleep(2000);
    }

//    @When("Nhap OTP")
    public void nhapOTP() {
        homePage.inputOTP();
    }

//    @Then("kiem tra man hinh market hien thi")
    public void kiemTraManHinhMarketHienThi() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePage.checkDisplayWebView());
        Assert.assertTrue(homePage.checkDisplayHnxIndex());
        Assert.assertTrue(homePage.checkDisplayVnIndex());
        Assert.assertTrue(homePage.checkDisplayUpcIndex());
        Assert.assertTrue(homePage.checkDisplayTable());
    }

//    @When("Click Asset Management menu")
    public void clickAssetManagementMenu() {
        homePage.clickAssetManagement();
    }

//    @Then("kiem tra man hinh Asset Management hien day du")
    public void kiemTraManHinhAssetManagementHienDayDu() {
        Assert.assertTrue(assetManagementPage.isDisplayCash());
        Assert.assertTrue(assetManagementPage.isDisplayTotalCash());
        Assert.assertTrue(assetManagementPage.isDisplayStock());
        Assert.assertTrue(assetManagementPage.isDisplayPurchasePower());
        Assert.assertTrue(assetManagementPage.isDisplayTotalAsset());
        Assert.assertTrue(assetManagementPage.isDisplayLiabilities());
        Assert.assertTrue(assetManagementPage.isDisplayNetAssets());
        Assert.assertTrue(assetManagementPage.isDisplaySellRatio());
    }

//    @When("Click Place Order menu")
    public void clickPlaceOrderMenu() {
        homePage.clickPlaceOrder();
    }

//    @Then("kiem tra man hinh Place Order hien day du")
    public void kiemTraManHinhPlaceOrderHienDayDu() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(placeOrderPage.isDisplayAccountNumber());
        Assert.assertTrue(placeOrderPage.isDisplayMarginRatio());
        Assert.assertTrue(placeOrderPage.isDisplayBuyingPower());
        Assert.assertTrue(placeOrderPage.isDisplayPriceField());
        Assert.assertTrue(placeOrderPage.isDisplayVolumeField());
        Assert.assertTrue(placeOrderPage.isDisplayBuyBtn());
        Assert.assertTrue(placeOrderPage.isDisplaySellBtn());
    }

//    @When("Click news menu")
    public void clickNewsMenu() {
        homePage.clickNews();
    }

//    @Then("kiem tra man hinh news hien day du")
    public void kiemTraManHinhNewsHienDayDu() {
        Assert.assertTrue(newsPage.isDisplayHotNews());
        Assert.assertEquals(newsPage.checklistNews(),6);
    }

//    @When("Click service menu")
    public void clickServiceMenu() {
        homePage.clickService();
    }

//    @Then("kiem tra man hinh service hien day du")
    public void kiemTraManHinhServiceHienDayDu() throws InterruptedException {
        Assert.assertTrue(servicePage.isDisplayStockTransaction());
        Assert.assertTrue(servicePage.isDisplayCashTransaction());
        Assert.assertTrue(servicePage.isDisplayGtdOrder());
        Assert.assertTrue(servicePage.isDisplayTakeProfit());
        Assert.assertTrue(servicePage.isDisplayProducts());
        Assert.assertTrue(servicePage.isDisplayYsRadar());
        Assert.assertTrue(servicePage.isDisplayYSWealth());
        Thread.sleep(1000);
        homePage.clickMarket();
    }

    @When("Dang nhap voi tai khoan {string} va mat khau {string} va kiem tra cac tab hien thi")
    public void dangNhapVoiTaiKhoanVaMatKhauVaKiemTraCacTabHienThi(String arg0, String arg1) throws InterruptedException {
        nhanNutAllow();
        dangNhapVoiTaiKhoanVaMatKhau(arg0,arg1);
        diChuyenDenTrangChu();
        nhapOTP();
        for(int i=0; i<5;i++){
            kiemTraManHinhMarketHienThi();
            clickAssetManagementMenu();
            kiemTraManHinhAssetManagementHienDayDu();
            clickPlaceOrderMenu();
            kiemTraManHinhPlaceOrderHienDayDu();
            clickNewsMenu();
            kiemTraManHinhNewsHienDayDu();
            clickServiceMenu();
            kiemTraManHinhServiceHienDayDu();
        }
    }

    @Then("Dong ung dung")
    public void dongUngDung() {
    }
}
