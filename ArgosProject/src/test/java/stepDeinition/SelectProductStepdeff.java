package stepDeinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import pageObject.SelectProductPage;

public class SelectProductStepdeff extends WebConnector {

    SelectProductPage productPage=new SelectProductPage();

    @And("the user add a sofa from the options")
    public void theUserAddASofaFromTheOptions() {
        productPage.setAddToTrolleyXpath();

    }
}
