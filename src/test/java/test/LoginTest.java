package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.LoginPage;

public class LoginTest extends BaseTest {
    LoginPage loginPage;



    @Step("Siteye Giriş Yapıldı")
    public void before() {
        loginPage = new LoginPage(getWebDriver());
    }

    @Step("Giriş Yap")
    public void clickLogin() {
        loginPage.loginClick();
    }

    @Step("Email <email> bilgilerini giriyoruz")
    public void enterEmail(String email) {

        loginPage.enterEmail(email);
    }

    @Step("Şifre <password> giriyoruz")
    public void enterPassword(String password) {


        loginPage.enterPassword(password);

    }

    @Step("Giriş yap tuşuna basılır")
    public void clickLoginEnter() {
        loginPage.clickLoginEnter();
    }





}
