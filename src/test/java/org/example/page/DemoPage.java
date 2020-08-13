package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.example.constants.ConstantDemoPage.*;

public class DemoPage extends BasePage {
    public DemoPage(WebDriver driver) {
        super(driver);
    }
    public void mainPage() throws InterruptedException {
        getDriver().navigate().to("https://turna.com");
        clickElement(ROUND_TRIP);
        //TimeUnit.SECONDS.sleep(3);
        findElement(ORIGIN_BOX).clear();
        sendKEys(ORIGIN_BOX, "istanbul");
        findElement(ORIGIN_BOX).sendKeys(Keys.ENTER);
        sendKEys(DESTINATION_BOX, "antalya");
        findElement(DESTINATION_BOX).sendKeys(Keys.ENTER);
        //TimeUnit.SECONDS.sleep(3);
        clickElement(SELECT_GOING);
        clickElement(GOING_DATE);
        clickElement(SELECT_RETURN);
        clickElement(RETURN_DATE);
        TimeUnit.SECONDS.sleep(3);
        clickElement(CLOSE_POPUP);
        clickElement(SEARCH_BUTTON);
        TimeUnit.SECONDS.sleep(5);
    }
}
