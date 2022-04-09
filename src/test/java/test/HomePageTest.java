package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    @Test
    public void testNavIsDisplayed() {
        Assert.assertEquals("https://www.epiesa.ro/",cartPage.getUrl());

        Assert.assertTrue(homePage.checkNavIsDisplayed());

        Assert.assertTrue(homePage.checkCarPickBoxIsDisplayed());

        Assert.assertEquals("PIESE AUTO ONLINE", homePage.getPieseAutoBoxText());

    }


}
