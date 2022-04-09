package pages;


import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OnlinePiecePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(OnlinePiecePage.class);
    public static OnlinePiecePage instance;
    private By filtruAerLink = By.cssSelector(".para-1 a[href=\"/filtru-aer.htm\"]");
    private By cadillacButton = By.cssSelector(".auto-img-block img[alt='Filtru aer CADILLAC']");
    private By marcaCadillac = By.cssSelector(".model-div-2 img[alt='Filtru aer CADILLAC 60 SPECIAL limuzina']");
    private By textFiltruCadillac = By.cssSelector("h2.margin-top-30");
    private By cadillacText = By.cssSelector(".margin_here.marcaa");



    public static OnlinePiecePage getInstance() {
        if (instance == null) {
            instance = new OnlinePiecePage();
        }
        return instance;
    }

    public void clickFiltruAerLink() {
        LOG.info("Click Link Filtru Aer");
        driver.findElement(filtruAerLink).click();
    }

    public void clickCadillacButton() {
        LOG.info("Click Cadillac Button");
        driver.findElement(cadillacButton).click();
    }
    public void clickCadillacType() {
        LOG.info("Click Cadillac Type");
        driver.findElement(marcaCadillac).click();
    }
    public String returnFilterCadillacText() {
        LOG.info("Return Filter Cadillac Text");
        return driver.findElement(textFiltruCadillac).getText();
    }
    public String returnCadillacText() {
        LOG.info("Return  Cadillac Text");
        return driver.findElement(cadillacText).getText();
    }



}
