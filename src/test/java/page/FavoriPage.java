package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.Constants.*;

public class FavoriPage extends BasePage {
    public FavoriPage(WebDriver driver) {
        super(driver);
    }

    public void SearchText(String enterText){
        sendKeys(SEARCH_INPUT2,enterText);

    }
    public void WishClick(){
        click(SEARCH_BUTTON2);
    }
    public void SelectProduct(){
      click(SELECT_PRODUCT);
    }
    public void AddWishClick(){
        click(MY_WISH);
    }

}
