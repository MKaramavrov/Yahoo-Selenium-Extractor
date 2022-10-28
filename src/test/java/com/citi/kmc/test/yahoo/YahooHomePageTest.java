package com.citi.kmc.test.yahoo;

import com.citi.kmc.test.base.BaseTest;
import com.citi.kmc.test.model.FirstCollection;
import com.citi.kmc.test.model.SecondCollection;
import com.citi.kmc.test.selenium.pages.homepage.YahooHomePage;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YahooHomePageTest extends BaseTest {
    protected FirstCollection firstCollection;
    protected SecondCollection secondCollection;
    protected YahooHomePage yahooHomePage = new YahooHomePage(driver);
    protected Capabilities capabilities = new DesiredCapabilities();


    @Test
    public void checkHomePageToLoad() {
        firstCollection = new FirstCollection();
        LocalDateTime startTime = LocalDateTime.now();
        firstCollection.setStartTime(startTime);
        yahooHomePage.openYahooHomePage();
        String expected = "Yahoo Finance - Stock Market Live, Quotes, Business & Finance News";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
        LocalDateTime endTime = LocalDateTime.now();
        long duration = ChronoUnit.SECONDS.between(startTime, endTime);
        firstCollection.setLaunchDuration(duration);
        firstCollectionService.save(firstCollection);
    }

    @Test
    public void checkIfStocksLoads() {
        secondCollection = new SecondCollection();
        secondCollection.setTestTime(LocalDateTime.now());
        secondCollection.setTestName("checkIfStocksLoads");
        By bitcoinCost =
                By.xpath("//*[@id=\"quote-header-info\"]/div[3]/div[1]/div/fin-streamer[1]");
        yahooHomePage.openYahooHomePage()
                .clickOnDataToCollect();
        yahooHomePage.waitForElementToBeVisible("BTC-USD");
        double stockPrice = Double.parseDouble(driver.findElement(bitcoinCost)
                                                        .getText()
                                                        .replace(",", ""));
        secondCollection.setStockPrice(stockPrice);
        String actual = driver.getTitle();
        String expected = "Bitcoin USD (BTC-USD) Price, Value, News & History - Yahoo Finance";
        Assert.assertEquals(actual, expected);
        secondCollectionService.save(secondCollection);
    }

    @Test
    public void checkIfPriceIsGrowing() {

    }
}
