package ru.ibs.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private WebDriver driver;
    private static DriverManager INSTANCE;
    private final PropManager propManager = PropManager.getPropManager();

    // пустой конструктор (singleton)
    private DriverManager() {
    }

    // инициализация DriverManager
    public static DriverManager getDriverManager() {
        if (INSTANCE == null) {
            INSTANCE = new DriverManager();
        }
        return INSTANCE;
    }

    // инициализация веб-драйвера
    public WebDriver getDriver() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    private void initDriver() {
        System.setProperty("webdriver.chrome.driver", propManager.getProperty("path.chrome.driver.windows"));
        driver = new ChromeDriver();
//        System.setProperty("webdriver.opera.driver", propManager.getProperty("path.opera.driver.windows"));
//        driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(propManager.getProperty("implicitly.wait")), TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Long.parseLong(propManager.getProperty("page.load.timeout")), TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
