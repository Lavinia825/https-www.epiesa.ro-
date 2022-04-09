package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static pages.BasePage.sleep;

public class LogInTest extends BaseTest {
    @Test
    public void testLogInErrorMessage(){
        logInPage.clickMyAccountButton();
        logInPage.clickLoginPageButton();
        logInPage.writeToUserField("smnxzv");
        logInPage.writeToPasswordField("ncxmkvd");
        logInPage.clickLoginButton();
        sleep(5000);
        Assert.assertEquals("Aceasta adresa de email nu exista in baza de date !",logInPage.getErrorMessage());
    }
}
