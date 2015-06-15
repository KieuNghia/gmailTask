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
public class LoginPage extends AbstractPage{

    public LoginPage(WebDriver driver) {

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id = 'Email']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@id = 'Passwd']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='signIn']")
    private WebElement okButton;

    @FindBy(xpath = "//input[@id='next']")
    private WebElement nextButton;


    public LoginPage loginInsert(String username) {
        loginField.sendKeys(username);
        return new LoginPage(driver);
    }

    public LoginPage passwordInsert(String password) {
        passwordField.sendKeys(password);
        return new LoginPage(driver);

    }

    public MailPage clickOk() {

        okButton.click();
        return new MailPage(driver);
    }

}
