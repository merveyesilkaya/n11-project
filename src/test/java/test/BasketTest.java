package test;

import base.BaseTest;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;
import page.BasketPage;

import static constants.Constants.*;

public class BasketTest extends BaseTest {
    BasketPage basketPage;
    @BeforeStep
    public void before(){
        basketPage=new BasketPage(getWebDriver());
    }

    @Step("Ürün seç")
    public void ChooseProduct(){
        basketPage.chooseProduct();

    }
    @Step("Ürünü Sepete Ekle")
    public void AddBasket(){
        basketPage.AddBasket();
    }
    @Step("Sepete Git")
    public void goBasket(){

        basketPage.goBasket();
    }

}
