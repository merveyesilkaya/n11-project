package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.Constants.*;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }
    public void chooseProduct(){
        click(PRODUCT);
    }
    public void AddBasket(){
        click(CHOOSE_PRODUCT);
    }
    public void goBasket(){
        click(BASKET);
    }
}
