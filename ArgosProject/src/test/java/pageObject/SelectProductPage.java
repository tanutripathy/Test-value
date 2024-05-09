package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectProductPage extends WebConnector {

/***************Locators********************/
    private String addToTrolleyXpath="//*[@id='findability']/div[6]/div/div[5]/div[9]/div[2]/div/div[3]/div/div[2]/button";


    /********************Getter&Setters********************/
    public void setAddToTrolleyXpath(){

        WebElement targetelement=BasePage.findElementByXpath(10,addToTrolleyXpath);
        Actions actions=new Actions(driver);
        actions.scrollToElement(targetelement).perform();
        BasePage.findElementByXpath(10,addToTrolleyXpath).click();
    }
}
