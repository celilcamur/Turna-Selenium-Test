package org.example.test;

import org.example.base.BaseTest;
import org.example.page.DemoPage;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DemoPageTest extends BaseTest {
    DemoPage demoPage;

    @Before
    public void before(){
        demoPage = new DemoPage(getDriver());
        getDriver().navigate().to("https://www.turna.com/");
    }

    @Test
    public void mainPageTest() throws InterruptedException {
        demoPage.mainPage();
    }
}
