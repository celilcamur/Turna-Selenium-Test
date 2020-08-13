package org.example.constants;

import org.openqa.selenium.By;

public class ConstantDemoPage {
    public static final By ORIGIN_BOX = By.id("flight-from");
    public static final By DESTINATION_BOX = By.id("flight-to");
    public static final By SELECT_GOING = By.xpath("//*[@id=\"flight-search-form\"]/div[1]/div/div[2]/div[2]/div[1]");
    public static final By GOING_DATE = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[4]/a");
    public static final By SELECT_RETURN = By.xpath("//*[@id=\"flight-search-form\"]/div[1]/div/div[2]/div[2]/div[2]");
    public static final By RETURN_DATE = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[5]/td[3]/a");
    public static final By ROUND_TRIP = By.id("lb-way");
    public static final By SEARCH_BUTTON = By.cssSelector("#btnSearch");
    public static final By CLOSE_POPUP = By.cssSelector("span[class='snackbar-close-button-text']");
}
