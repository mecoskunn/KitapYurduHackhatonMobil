package com.mobile.base.Methods;

import com.mobile.base.utils.driver.Driver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.*;

/**
 * @author furkan.ozbek
 * @see <a href="https://github.com/ritzykey">Github: ritzykey</a>
 */
public class Methods extends Driver {
    private Logger logger = LoggerFactory.getLogger(getClass());
    HashMap<String, String> keyMap = new HashMap<String, String>();

    private void click(By locator) {
        appiumDriver.findElement(locator).click();
        logger.info("Elemente tıklandı ==>" + locator.toString());
    }

    public boolean waitUntilVisible(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(appiumDriver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            logger.info("Elementi Bulundu ==>" + locator.toString());
            return true;
        } catch (Exception e) {
            logger.info("Elementini Bulmak Icin 20 SN Beklendi Fakat Bulunamadı ==>" + locator.toString());
            return false;
        }
    }

    public boolean waitUntilVisible(By locator, int time) {
        try {
            WebDriverWait wait = new WebDriverWait(appiumDriver, time);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            logger.info("Elementi Bulundu ==>" + locator.toString());
            return true;
        } catch (Exception e) {
            logger.info("Elementini Bulmak Icin " + time + " SN Beklendi Fakat Bulunamadı ==>" + locator.toString());
            return false;
        }
    }

    public void waitUntilVisibleAndClick(By locator) {
        waitUntilVisible(locator);
        click(locator);
    }

    public void waitUntilVisibleAndSendKeys(By locator, String text) {
        waitUntilVisible(locator);
        sendKeys(locator, text);
    }

    private void sendKeys(By locator, String text) {
        appiumDriver.findElement(locator).clear();
        appiumDriver.findElement(locator).sendKeys(text);
    }


    public void watingDriver(int timeSecond) {
        try {
            Thread.sleep(timeSecond * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickAndWait(By locater, int timeSecond) {
        waitUntilVisibleAndClick(locater);
        logger.info("Elemente tıklandı ve beklendi Beklenen saniye: " + timeSecond + "==>" + locater.toString());
        watingDriver(timeSecond);
    }

    public void scrollUntilVisable(By locator) {
        while (!waitUntilVisible(locator, 2)) {
            scrollDown(9, 2);
        }
    }

    public void scrollDown(int startHeight, int stopHeight) {
        // Cihazın yüksekliğini 10 bölgeye ayırır.

        Dimension dimension = appiumDriver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * startHeight * 0.1);
        int scrollEnd = (int) (dimension.getHeight() * stopHeight * 0.1);

        if ("ANDROID".equalsIgnoreCase(System.getenv("platformName"))) {
            logger.info("Scrolling");
            AndroidTouchAction androidTouchAction;

            androidTouchAction = new AndroidTouchAction(appiumDriver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                    .moveTo(PointOption.point(0, scrollEnd)).release().perform();
        }
    }

    public void scrollTimes(int startHeight, int stopHeight, int times) {
        for (int i = 0; i < times; i++) {
            scrollDown(startHeight, stopHeight);
        }
    }

    public void clickIndexListElementAndSave(By locator, int index) {
        waitUntilVisible(locator);
        List<RemoteWebElement> elements = appiumDriver.findElements(locator);

        while (!(4 == elements.size())) {
            scrollDown(6, 5);
            elements = appiumDriver.findElements(locator);
        }

        saveValue("firstPrice", elements.get(index).getText());
        elements.get(index).click();
        logger.info("Elemente tıklandı ==>" + locator.toString());
        watingDriver(3);
    }

    public void clickRandom(By locator, int count) {
        waitUntilVisible(locator);

        List<AndroidElement> elements = appiumDriver.findElements(locator);
        AndroidTouchAction actions = new AndroidTouchAction(appiumDriver);
        Set<Integer> uniqueInt = new HashSet<>();
        Random rand = new Random();

        saveValue("countSize", "" + count);
        while (uniqueInt.size() < count) {
            int index = rand.nextInt(elements.size());
            uniqueInt.add(index);
            logger.info("INDEX NUMBER = " + index);
        }

        for (int i : uniqueInt) {
            actions.tap(ElementOption.element(elements.get(i))).release().perform();
        }

        elements = appiumDriver.findElements(locator);
        int i = 0;
        for (RemoteWebElement checkbox : elements) {
            if (checkbox.getAttribute("checked").equals("true")) {
                saveValue("count_" + i, checkbox.getAttribute("text"));
                i++;
            }
        }

        logger.info("Random Metodu ile seçim yapıldı :" + count);
    }

    public int sumProductsCount() {
        int sum = 0;
        for (int i = 0; i < Integer.parseInt(getValue("countSize")); i++) {
            sum += Integer.parseInt(getValue("count_" + i));
        }
        saveValue("sumProductsCount", String.valueOf(sum));
        logger.info("Toplam urun sayisi :" + sum);
        return sum;
    }

    public String saveElementGetText(By locator, String key) {
        waitUntilVisible(locator);
        String savedTxt = appiumDriver.findElement(locator).getText();
        saveValue(key, savedTxt + "");
        logger.info("Elementinde Bulunan " + savedTxt + " Text Degeri " + "\"" + key + "\"" + " Adiyla Kaydedildi ==>" + locator);
        return savedTxt;
    }

    public void saveElementGetNumberInTXT(By locator, String key) {
        String savedTxt = extractInt(saveElementGetText(locator, key));
        int savedINT = Integer.parseInt(savedTxt);
        saveValue(key, savedINT + "");
    }

    private void saveValue(String key, String val) {
        keyMap.put(key, val);
        logger.info("keyMap Eklendi key : val ==>" + key + ":" + val);
    }

    private String getValue(String key) {
        return keyMap.get(key);
    }

    public void checkEqualsOnKeyMap(String firstKey, String secondKey) {
        logger.info("CHECK EQUALS");
        logger.info(firstKey + ":" + getValue(firstKey) + "==" + secondKey + ":" + getValue(secondKey));

        Assert.assertEquals(getValue(firstKey), getValue(secondKey));
    }

    static String extractInt(String str) {
        str = str.replaceAll("[^0-9]", " "); // Replace non-digits with spaces
        str = str.trim(); // Trim leading and trailing spaces
        if (str.equals("")) {
            return "-1"; // Return -1 if no integers found
        }
        return str;
    }
    public void clickRandomElement(By locator) {
        waitUntilVisible(locator);
        List<RemoteWebElement> elements = appiumDriver.findElements(locator);
        Random rand = new Random();
        int index = rand.nextInt(9);
        elements.get(index).click();
        logger.info("Bulunan Elemente Random Metodu Ile Tiklandi");

    }
    public void checkContainsOnKeyMap(String firstKey, String secondKey) {
        logger.info("CHECK EQUALS");
        logger.info(firstKey + ":" + getValue(firstKey) + "==" + secondKey + ":" + getValue(secondKey));

        Assert.assertTrue(getValue(firstKey).contains(getValue(secondKey)));
    }
}
