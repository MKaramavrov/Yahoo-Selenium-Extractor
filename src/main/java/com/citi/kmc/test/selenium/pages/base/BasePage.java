package com.citi.kmc.test.selenium.pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.citi.kmc.test.selenium.seleniumconfig.Config.EXPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }



    public void waitForElementToBeVisible(String fraction) {
        new WebDriverWait(driver, EXPLICIT_WAIT)
                .until(ExpectedConditions.urlContains(fraction));
    }
}
