package com.taile;

import com.taile.Utils.PropertiesUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;
    public static String urlBase = "http://tutorialsninja.com/demo/index.php?route=account/login";
    public static Properties propertiesApplication = PropertiesUtils.loadApplicationProperties();
    public static Properties propertiesFramework = PropertiesUtils.loadFrameworkProperties();
    public static Properties propertiesUser = PropertiesUtils.loadUserProperties();

    public static void initiateDriver() {
        String appUrl = propertiesApplication.get("application.url").toString();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(appUrl);
        driver.manage().window().maximize();
    }

    public static void closeDriver() {
        driver.quit();
    }

    }

