package org.example.test;

import org.example.base.BaseTest;
import org.example.page.FlyChoosePage;
import org.junit.Test;

public class FlyChooseTest extends BaseTest {
    FlyChoosePage flyPageChoose;

    @Test
    public void flyChoosePageTest() throws InterruptedException {
        flyPageChoose = new FlyChoosePage(getDriver());
        flyPageChoose.flyPage();
    }
}
