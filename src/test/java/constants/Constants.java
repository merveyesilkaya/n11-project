package constants;

import org.openqa.selenium.By;

public class Constants {
    public static String WEBLINK = "https://www.n11.com/";

    public static final By LOGIN_BUTTON=By.className("btnSignIn");
    public static final By EMAIL_LOGIN=By.id("email");
    public static final By PASSWORD_LOGIN=By.id("password");
    public static final By LOGIN_ENTER=By.id("loginButton");
    public static final By SEARCH_INPUT=By.id("searchData");
    public static final By SEARCH_BUTTON=By.className("searchBtn");
    public static final By PRODUCT=By.xpath("//*[@id=\"p-401289005\"]/div[1]/a/img");
    public static final By CHOOSE_PRODUCT=By.xpath("//*[@id=\"contentProDetail\"]/div/div[3]/div[2]/div[3]/div[3]/a[2]");
    public static final By BASKET=By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[4]/div/div/div[2]/a");
    public static final By MY_WISH=By.xpath("//*[@id='getWishList']");
    public static final By SEARCH_BUTTON2=By.className("searchBtn");
    public static final By SEARCH_INPUT2=By.id("searchData");
    public static final By SELECT_PRODUCT=By.xpath("//*[@id=\"p-322116104\"]/div[1]/a/img");
    public static final By URUN_IADE=By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/a[3]");
}
