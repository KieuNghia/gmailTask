package com.epam.kieu.utils.tests;

import com.epam.kieu.utils.factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


/**
 * Created by Kuanh_Nhkhiia_Kiieu on 15.06.2015.
 */
public class BaseTest {


    private WebDriver webDriver;

    @BeforeSuite
    protected void setUp() {
            webDriver = new WebDriverFactory().getDriver("firefox");

        }
    @AfterSuite
    public void tearDown() throws InterruptedException {

        Thread.sleep(5000);
        if (webDriver != null)
            webDriver.quit();
    }

    }
