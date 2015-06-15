package com.epam.kieu.pages;

import com.epam.kieu.utils.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateMailPage extends AbstractPage {

    public CreateMailPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);

    }

    private final String LETTER_SUBJECT = "nichego";

    @FindBy(xpath = "//textarea[@aria-label  = 'Кому']")
    private WebElement toField;

    @FindBy(xpath = "//input[@placeholder = 'Тема']")
    private WebElement subjectField;

    @FindBy(xpath = "//div[@aria-label = 'Тело письма']")
    private WebElement textArea;

    @FindBy(xpath = "//a[text() = 'Черновики (1)']")
    private WebElement saveDraftButton;

    @FindBy(xpath = "//div[text() = 'Отправить']")
    private WebElement sendButton;


    public CreateMailPage toFieldInsert(String to) {
        toField.sendKeys(to);
        return new CreateMailPage(driver);
    }

    public CreateMailPage subjectFieldInsert(String subject) {

        subjectField.sendKeys(subject);
        return new CreateMailPage(driver);
    }

    public CreateMailPage textAreaInsert(String text) {

        textArea.sendKeys(text);
        return new CreateMailPage(driver);
    }

    public MailPage sendLetter() {
        sendButton.click();
        return new MailPage(driver);


    }
}
