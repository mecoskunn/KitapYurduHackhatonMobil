package com.mobile.base.utils.driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static AppiumDriver appiumDriver;

    static AppiumDriver getDriver() throws MalformedURLException {
        String platformName = System.getenv("platformName");
        System.out.println("platfomName =" + platformName);

        if (null == platformName)
            platformName = "";

        switch (platformName) {
            /*
            case "IOS":
                break;
            */
            case "ANDROID":
            default:
                DesiredCapabilities capabilites = new DesiredCapabilities();
                capabilites.setCapability("appPackage", System.getenv("appPackage"));
                capabilites.setCapability("appActivity", System.getenv("appActivity"));
                capabilites.setCapability("platformName", platformName);
                appiumDriver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilites);

                return appiumDriver;
        }
    }
}
