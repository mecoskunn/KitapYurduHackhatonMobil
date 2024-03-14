package com.mobile.base.utils.driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSpec;
import com.thoughtworks.gauge.BeforeSuite;
import io.appium.java_client.AppiumDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;

public class Driver {
    protected static AppiumDriver appiumDriver;
    private Logger logger = LoggerFactory.getLogger(getClass());

    @BeforeSuite
    public void initializeDriver() throws MalformedURLException {
        appiumDriver = DriverFactory.getDriver();
        logger.info("Uygulama acildi.");

    }

    @BeforeSpec
    public void beforeSpec(){
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void closeDriver() {
        appiumDriver.quit();
        logger.info("Uygulama kapatildi.");
    }
}
