package pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    public static HomePage instance;
    private By navBar= By.xpath("//nav[@class=\"navbar navbar-gg\"]");
    private By carPickBox = By.id("home");
    private By pieseAutoBox = By.cssSelector(".moduleBlock.gg3 h2");

    public static HomePage getInstance(){
        if(instance==null){
            instance=new HomePage();
        }
        return instance;
    }

    public boolean checkNavIsDisplayed(){
        LOG.info("Check navigator is displayed");
        return driver.findElement(navBar).isDisplayed();
    }

    public boolean checkCarPickBoxIsDisplayed(){
        LOG.info("Check car pick box is displayed");
        return driver.findElement(carPickBox).isDisplayed();
    }

    public String getPieseAutoBoxText() {
        LOG.info("Get piese auto box text");
        return driver.findElement(pieseAutoBox).getText();
    }



}
