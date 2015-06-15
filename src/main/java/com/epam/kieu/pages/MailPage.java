package com.epam.kieu.pages;

import com.epam.kieu.utils.pages.AbstractPage;
import com.epam.kieu.utils.pages.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 15.06.2015.
 */
public class MailPage extends AbstractPage {
    public MailPage(WebDriver driver) {

        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[text()= 'Õ¿œ»—¿“‹']")
    private WebElement createMailButton;

    @FindBy(xpath = "//div[@role = 'banner']//a[@aria-haspopup = 'true']//span")
    private  WebElement accountButton;

    @FindBy (xpath = "//div[@img-loaded = '1']//a[text() = '¬˚ÈÚË']")
    private WebElement exitButton;

    public MailPage clickAccountSpan(){

        accountButton.click();

        return new MailPage(driver);

    }

    public


}
