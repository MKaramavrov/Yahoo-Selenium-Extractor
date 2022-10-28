package com.citi.kmc.test.base;

import com.citi.kmc.test.config.Config;
import org.testng.annotations.AfterSuite;

public class BaseTest extends Config {

    @AfterSuite(alwaysRun = true)
    public void closePage() {
        driver.quit();
    }
}
