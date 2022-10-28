package com.citi.kmc.test.selenium.pages.homepage;

import com.citi.kmc.test.selenium.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YahooHomePage extends BasePage {
    By xpath =
            By.xpath("//*[@id=\"data-util-col\"]/section[3]/table/tbody/tr[1]/td[1]/a");

    public YahooHomePage(WebDriver driver) {
        super(driver);
    }

    public YahooHomePage openYahooHomePage() {
        open("https://finance.yahoo.com/");
        return this;
    }

    public YahooHomePage clickOnDataToCollect() {
        driver.findElement(xpath).click();
        return this;
    }
}
