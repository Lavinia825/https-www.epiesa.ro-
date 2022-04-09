package pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CartPage extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(pages.CartPage.class);
    public static pages.CartPage instance;
    private By cartButton = By.cssSelector("a.dropdown-toggle.a-tag img");
    private By cartText = By.cssSelector("div.text_box");
    private By returnButton = By.cssSelector("button.btn-red");
    public static pages.CartPage getInstance() {
        if (instance == null) {
            instance = new pages.CartPage();
        }
        return instance;

    }
    public void clickCartButton(){
        LOG.info("Check in cart button");
        driver.findElement(cartButton).click();


    }
    public String getCartText(){
        LOG.info("Get cart text");
        return driver.findElement(cartText).getText();
    }
    public void clickReturnButton(){
        LOG.info("Click return button");
        driver.findElement(returnButton).click();

    }
    public String getReturnText(){
        LOG.info("Get return text");
        return driver.findElement(returnButton).getText();
    }


}
