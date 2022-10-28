package com.citi.kmc.test.selenium.seleniumconfig;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.citi.kmc.test.selenium.seleniumconfig.Config.IMPLICIT_WAIT;

public class CommonActions {
    protected static WebDriver driver = null;

    public static WebDriver createDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
