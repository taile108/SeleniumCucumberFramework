package com.taile.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GetBrowserDriverUtils {

    public static WebDriver driver;

    public static WebDriver getBrowserDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = setChromeDriver();
                break;
            case "firefox":
                driver = setFirefoxDriver();
                break;
            case "ie":
                driver = setIEDriver();
                break;
        }
        return driver;
    }

    private static WebDriver setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    private static WebDriver setFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }

    private static WebDriver setIEDriver() {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        return driver;
    }
}
