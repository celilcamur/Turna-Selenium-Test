package org.example.base;

import org.example.page.DemoPage;
import org.example.page.FlyChoosePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {


    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public WebElement findElement(By by) {
        untilElementAppear(by);
        return driver.findElement(by);
    }

    public void clickElement(By by) {
        untilElementClickable(by);
        findElement(by).click();
    }

    public void sendKEys(By by, String text) {
        isElementDisplayed(by);
        findElement(by).sendKeys(text);
    }
    public void selectOptionByValue(By by, String value) {
        Select select = new Select(findElement(by));
        select.selectByValue(value);
    }
    public boolean isElementDisplayed(By by) {
        return findElement(by).isDisplayed();
    }

    public void untilElementAppear(By by) {
        System.out.println("Elementin var olması bekleniyor...");
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void untilElementClickable(By by) {
        System.out.println("Elementin tıklanabilir olması bekleniyor...");
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }




    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public DemoPage getDemoPage() {
        return new DemoPage(driver);
    }
    public FlyChoosePage getFlyChoosePage() { return new FlyChoosePage(driver);}
}
