package ru.geekbrains.main.site.at.block;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {

    @FindBy(css = "svg[class$='icon-facebook_dark']")
    private WebElement facebook;

    @FindBy(css = "svg[class$='icon-vk']")
    private WebElement vk;

    @FindBy(css = "svg[class$='icon-instagram']")
    private WebElement instagram;

    @FindBy(css = "svg[class$='icon-youtube']")
    private WebElement youtube;

    @FindBy(css = "svg[class$='icon-telegram']")
    private WebElement telegram;

    @FindBy(css = "a[href='/feedbacks']")
    private WebElement feedBacks;

    @FindBy(xpath = ".//a[text()='Помощь']")
    private WebElement help;

    @FindBy(css = "a[href='/company']")
    private WebElement company;

    @FindBy(css = "a[href='/license.pdf']")
    private WebElement license;

    @FindBy(css = "a[href='/career/682']")
    private WebElement career;

    @FindBy(xpath = ".//a[text()='Компаниям']")
    private WebElement forBusiness;

    @FindBy(css = "a[class='site-footer__phone']")
    private WebElement phone;

    @FindBy(css = "svg[class$='icon-skolkovo']")
    private WebElement skolkovo;

    private final WebDriver driver;

    public Footer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void footerSearch() {
        Assertions.assertTrue(facebook.isDisplayed());
        Assertions.assertTrue(vk.isDisplayed());
        Assertions.assertTrue(instagram.isDisplayed());
        Assertions.assertTrue(youtube.isDisplayed());
        Assertions.assertTrue(telegram.isDisplayed());
        Assertions.assertTrue(feedBacks.isDisplayed());
        Assertions.assertTrue(help.isDisplayed());
        Assertions.assertTrue(company.isDisplayed());
        Assertions.assertTrue(license.isDisplayed());
        Assertions.assertTrue(career.isDisplayed());
        Assertions.assertTrue(forBusiness.isDisplayed());
        Assertions.assertTrue(phone.isDisplayed());
        Assertions.assertTrue(skolkovo.isDisplayed());
    }
}
