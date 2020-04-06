package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.Constants.URUN_IADE;

public class İadePage extends BasePage {
    public İadePage(WebDriver driver) {
        super(driver);
    }
    public void clickUrunIade(){
        click(URUN_IADE);
    }
}
