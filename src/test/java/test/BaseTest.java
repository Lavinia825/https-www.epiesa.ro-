package test;

import pages.*;
import org.testng.annotations.*;


public class BaseTest {

    public HomePage homePage = HomePage.getInstance();
    public CartPage cartPage = CartPage.getInstance();
    public SearchPage searchPage = SearchPage.getInstance();
    public OnlinePiecePage onlinePiecePage = OnlinePiecePage.getInstance();
    public LogInPage logInPage = LogInPage.getInstance();

    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }


}
