package pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchPage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(SearchPage.class);
    public static SearchPage instance;

    private By searchBar = By.id("headersearch");
    private By searchButton = By.cssSelector(".mainProdSearch.hidden-xs input[type=submit]");
    private By pickCarType = By.cssSelector(".margin_here.marcaa");
    private By pickCarButtonAudi = By.cssSelector("a[href=\"/piese-auto-audi\"] div.auto-block");
    private By audiText = By.cssSelector(".margin_here.marcaa");
    private By carTypes = By.cssSelector("div.jspPane");
    private By audiSelectedCar = By.cssSelector("[href=\"/piese-auto-audi:100 c1 cupe\"] img");
    private By audiSelectedCarText = By.cssSelector(".margin_here.sub_model");

    public static SearchPage getInstance() {
        if (instance == null) {
            instance = new SearchPage();
        }
        return instance;
    }

    public void writeToSearchBar(String word) {
        driver.findElement(searchBar).sendKeys(word);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }


    public String getPickCarType() {
        return driver.findElement(pickCarType).getText();
    }

    public void pickAudiCarType() {
        driver.findElement(pickCarButtonAudi).click();
    }

    public String getAudiText() {
        return driver.findElement(audiText).getText();
    }

    public boolean checkCarTypeAreDisplayed() {
        return driver.findElement(carTypes).isDisplayed();
    }

    public void clickAudiCarType() {
        driver.findElement(audiSelectedCar).click();
    }

    public String getAudiCarTypeText() {
        return driver.findElement(audiSelectedCarText).getText();
    }
}
