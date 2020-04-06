package test;

import base.BaseTest;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;
import page.İadePage;

public class İadeTest extends BaseTest {
    İadePage i̇adePage;
    @BeforeStep
    public void before(){
    i̇adePage=new İadePage(getWebDriver());
    }
    @Step("Ürün iade butonuna tıklanır")
    public void clickUrunIade(){
        i̇adePage.clickUrunIade();
    }
}
