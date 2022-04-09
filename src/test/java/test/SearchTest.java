package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    @Test
    public void testSearch() {
        searchPage.writeToSearchBar("bujie");
        searchPage.clickSearchButton();

        Assert.assertEquals("https://www.epiesa.ro/piese-auto", searchPage.getUrl());

        Assert.assertEquals("ALEGE MARCA", searchPage.getPickCarType());

        searchPage.pickAudiCarType();

        Assert.assertEquals("PIESE AUTO AUDI", searchPage.getAudiText());

        Assert.assertTrue(searchPage.checkCarTypeAreDisplayed());

        searchPage.clickAudiCarType();

        Assert.assertEquals("PIESE AUTO AUDI 100 C1 CUPE", searchPage.getAudiCarTypeText());
    }

}
