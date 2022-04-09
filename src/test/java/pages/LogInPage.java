package pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogInPage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(LogInPage.class);
    public static LogInPage instance;
    private By myAccountButton = By.cssSelector("li.dropdown.hover-dropdown img[class=\"contact-logo\"]");
    private By loginPageButton = By.cssSelector(".nav.navbar-nav.navbar-right.navbar-top.hidden-xs li a[href=\"/autentificare-epiesa/\"]");
    private By userField = By.xpath("//*[contains(@name,'login_utilizator')]");
    private By passwordField = By.cssSelector("[name=\"login_parola\"]");
    private By loginButton = By.cssSelector("button.btn.text-uppercase");
    private By errorMessage = By.cssSelector("p[style*='color']");

    public static pages.LogInPage getInstance() {
        if (instance == null) {
            instance = new pages.LogInPage();
        }
        return instance;
    }

    public void clickMyAccountButton() {
        LOG.info("Click My Account Button");
        driver.findElement(myAccountButton).click();
    }
    public void clickLoginPageButton() {
        LOG.info("Click Login Page Button");
        driver.findElement(loginPageButton).click();
    }
    public void clickLoginButton() {
        LOG.info("Click Login  Button");
        driver.findElement(loginButton).click();
    }
    public void writeToUserField(String word) {
        driver.findElement(userField).sendKeys(word);
    }
    public void writeToPasswordField(String word) {
        driver.findElement(passwordField).sendKeys(word);
    }
    public String getErrorMessage() {
        LOG.info("Get error message");
        return driver.findElement(errorMessage).getText();
    }



}
