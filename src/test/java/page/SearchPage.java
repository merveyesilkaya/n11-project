package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.Constants.*;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public void SearchEnterText(String searchText){
        sendKeys(SEARCH_INPUT,searchText);
    }
    public void searchClick(){
        click(SEARCH_BUTTON);
    }
}
