package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    @Test
    public void testCart() {
        cartPage.clickCartButton();
        Assert.assertEquals("https://www.epiesa.ro/cos-cumparaturi-epiesa/", cartPage.getUrl());

        Assert.assertEquals("COSUL TAU ESTE GOL\n" +
                "Pentru a adauga produse in cos\n" +
                "te rugam sa te intorci in magazin\n" +
                "INTOARCE-TE IN MAGAZIN", cartPage.getCartText());
        Assert.assertEquals("INTOARCE-TE IN MAGAZIN", cartPage.getReturnText());
        cartPage.clickReturnButton();
        Assert.assertTrue(homePage.checkNavIsDisplayed());



    }

}
