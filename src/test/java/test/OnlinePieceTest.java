package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlinePieceTest extends BaseTest {
    @Test
    public void testOnlinePiece() {
        onlinePiecePage.clickFiltruAerLink();
        onlinePiecePage.clickCadillacButton();
        Assert.assertEquals("FILTRU AER CADILLAC", onlinePiecePage.returnCadillacText());
        onlinePiecePage.clickCadillacType();
        Assert.assertEquals("FILTRU AER CADILLAC 60 SPECIAL LIMUZINA", onlinePiecePage.returnFilterCadillacText());

    }
}
