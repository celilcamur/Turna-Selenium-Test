package org.example.constants;

import org.openqa.selenium.By;

public class ConstantFlyPage {
    public static final By FLY1 = By.cssSelector("div.departure-flight input");
    public static final By FLY2 = By.cssSelector("div.return-flight input");
    public static final By SUBMIT = By.cssSelector("button[class='bt-choose']");
    public static final By GENDER = By.xpath("//*[@id=\"lb-male\"]/span");
    public static final By NAME = By.cssSelector("input[data-autocomplete-type='FirstName']");
    public static final By LASTNAME = By.cssSelector("input[class='mandatory alpha lastname']");
    public static final By SELECT_DATE = By.cssSelector("select[class='datepicker-select day-select day-of-birth']");
    public static final By SELECT_MONTH = By.cssSelector("select[class='datepicker-select month-select month-of-birth']");
    public static final By SELECT_YEAR = By.cssSelector("select[class='datepicker-select year-select year-of-birth']");
    public static final By SELECT_COUNTRY = By.cssSelector("select[class='passenger-nationality']");
    public static final By TC = By.cssSelector("input[data-autocomplete-type='CitizenNo']");
    public static final By HES = By.cssSelector("input[class='hesCode']");
    public static final By PHONE = By.cssSelector("input[id='txtPhone']");
    public static final By EMAIL = By.cssSelector("input[id='txtEmail']");
    public static final By CLOSE_POPUP = By.cssSelector("span[class='snackbar-close-button-text']");
    public static final By ANADOLUJET = By.cssSelector("li[class='AJ']");
    public static final By PEGASUS = By.id("airline-PC");
}
