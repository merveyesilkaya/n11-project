package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.Constants.*;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void loginClick(){
        click(LOGIN_BUTTON);
    }
    public void enterEmail(String email){
        sendKeys(EMAIL_LOGIN,email);
    }
    public void enterPassword(String password){
        sendKeys(PASSWORD_LOGIN,password);
    }
    public void clickLoginEnter(){
        click(LOGIN_ENTER);
    }
}
