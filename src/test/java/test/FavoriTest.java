package test;

import base.BaseTest;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;
import page.FavoriPage;

public class FavoriTest extends BaseTest {
    FavoriPage favoriPage;
    @BeforeStep
    public void before(){
        favoriPage=new FavoriPage(getWebDriver());
    }
    @Step("Arama alanına <ürün> yazılır")
    public void searchText(String text){
        favoriPage.SearchText(text);
    }
    @Step("Arama iconuna tıklanır")
    public void wishClick(){
        favoriPage.WishClick();
    }
    @Step("2.Ürün Seçilir")
    public void selectProduct(){
        favoriPage.SelectProduct();
    }
    @Step("Ürün favorilere eklenir")
    public void addWishClick(){
        favoriPage.AddWishClick();
    }


}
