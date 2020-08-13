package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.example.constants.ConstantFlyPage.*;

public class FlyChoosePage extends BasePage  {
    public FlyChoosePage(WebDriver driver) {
        super(driver);
    }

    public void flyPage() throws InterruptedException {
        getDriver().navigate().to("https://www.turna.com/ucak-bileti/istanbul-antalya-ayt-havalimani/2020-08-27/2020-08-30");
        clickElement(ANADOLUJET);
        clickElement(PEGASUS);
        clickElement(FLY1);
        clickElement(FLY2);
        clickElement(CLOSE_POPUP);
        clickElement(SUBMIT);
        clickElement(GENDER);
        sendKEys(NAME,"Celil");
        sendKEys(LASTNAME,"Camur");
        selectOptionByValue(SELECT_DATE,"18");
        selectOptionByValue(SELECT_MONTH,"04");
        selectOptionByValue(SELECT_YEAR,"1998");
        selectOptionByValue(SELECT_COUNTRY,"TR");
        sendKEys(TC,"01234567891");
        sendKEys(HES, "A33A15A");
        sendKEys(PHONE,"5317218672");
        sendKEys(EMAIL,"celil.camur@testinium.com");
    }
}
