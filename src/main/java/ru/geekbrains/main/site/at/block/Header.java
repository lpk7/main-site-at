package ru.geekbrains.main.site.at.block;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

    @FindBy(css = "h2[class=\"gb-header__title\"]")
    private WebElement headerName;

    @FindBy(css = "[class='show-search-form']")
    private WebElement buttonSearch;

    @FindBy(css = "a[href='/login']")
    private WebElement login;

    @FindBy(css = "a[href='/register']")
    private WebElement registration;

    private final WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void headerSearch() {
        Assertions.assertTrue(headerName.isDisplayed());
        Assertions.assertTrue(buttonSearch.isDisplayed());
        Assertions.assertTrue(login.isDisplayed());
        Assertions.assertTrue(registration.isDisplayed());
    }
}
