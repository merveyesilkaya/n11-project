package test;

import base.BaseTest;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;
import page.SearchPage;

public class SearchTest extends BaseTest {
    SearchPage searchPage;
    @BeforeStep
    public void before(){
        searchPage=new SearchPage(getWebDriver());

    }
    @Step("Arama alanına <text> yazıldı")
    public void searchEnterText(String text){
        searchPage.SearchEnterText(text);
    }
    @Step("Arama butonuna tıklandı")
    public void clickSearch(){
        searchPage.searchClick();
    }
}


