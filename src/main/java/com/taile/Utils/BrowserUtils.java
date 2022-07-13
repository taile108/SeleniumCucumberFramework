package com.taile.Utils;

import com.taile.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class BrowserUtils extends BaseClass {

    static Properties properties = PropertiesUtils.loadFrameworkProperties();

    public static void clickOnElement(String element){
        findAndWaitForElement(element).click();
    }

    public static void enterText(String element, String text){
        findAndWaitForElement(element).clear();
        findAndWaitForElement(element).sendKeys(text);
    }

    public static WebElement findAndWaitForElement(String xpath){
        long timeout = Long.parseLong(properties.getProperty("timeout.maximum"));
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
        }
        catch (Exception e){
            System.out.println("Element not found!");
        }
        return element;
    }
}



