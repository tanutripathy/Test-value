package stepDeinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ProductSearchPage;
import utilities.ConstantUtils;

public class ProductSearchStepDeff extends WebConnector {

    ProductSearchPage searchPage=new ProductSearchPage();


    @Given("the user navigate to the home page")
    public void the_user_navigate_to_the_home_page() {
        driver.get(ConstantUtils.BASE_URL);
        searchPage.SetcookiesXpath();
    }

    @When("the click on search box")
    public void theClickOnSearchBox() {
        searchPage.setSearchBoxXpath();
    }

    @Then("the user enter {string} in the search box")
    public void theUserEnterInTheSearchBox(String text) {
        searchPage.serachProduct(text);
    }


}
