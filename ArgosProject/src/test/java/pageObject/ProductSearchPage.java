package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ProductSearchPage extends WebConnector {

    /*********************Locators***********************/
    private String searchBoxXpath="//input[@id='searchTerm']";

   private String cookiesXpath="//button[@id='explicit-consent-prompt-accept']";




    /********************Getter&Setter*********************/

    public void SetcookiesXpath(){
        BasePage.findElementByXpath(10,cookiesXpath).click();

    }

    public void setSearchBoxXpath(){
        BasePage.findElementByXpath(10,searchBoxXpath).click();

    }
    public void serachProduct(String text){
        BasePage.findElementByXpath(10,searchBoxXpath).sendKeys(text);
        Actions action=new Actions(driver);
        action.keyDown(Keys.ARROW_DOWN).perform();
        action.keyDown(Keys.ENTER).perform();


    }
}
