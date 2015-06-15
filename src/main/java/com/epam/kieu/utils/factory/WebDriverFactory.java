package com.epam.kieu.utils.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    private WebDriver driver;


    public WebDriver getDriver(String parameter) {
        switch (parameter) {
            case "opera":
                System.setProperty("webdriver.opera.driver", "Libdrivers\\operadriver32.exe");
                driver = new OperaDriver();
            case "firefox":
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                return driver;
            case "ie":
                System.setProperty("webdriver.ie.driver", "Libdrivers\\IEDriverServer64.exe");
                driver = new InternetExplorerDriver();
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                return driver;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "Libdrivers\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                return driver;
            default:
                throw new IllegalArgumentException("This browser is undefined!");
        }
    }
}
