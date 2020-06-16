package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.page.BasePageObject;
import ru.geekbrains.main.site.at.page.content.SearchPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToCompressingWhiteSpace;

public class HeaderBlock extends BasePageObject {

    //////////////////////общие поля
    @FindBy(css = "h2[class=\"gb-header__title\"]")
    private WebElement headerTitlePage;

    @FindBy(css = "[class='show-search-form']")
    private WebElement buttonSearch;

    @FindBy(css = "input[class='search-panel__search-field']")
    protected WebElement inputSearch;

    //////////////////////Поля только для НЕ авторизованного
    @FindBy(css = "a[href='/login']")
    private WebElement login;

    @FindBy(css = "a[href='/register']")
    private WebElement registration;

    //////////////////////Поля только для авторизованного

//    @FindBy(css = "[class$=\"js-schedule-opener\"]")
//    private WebElement buttonCalendar;

    @FindBy(css = "[class='voice-of-marketing js-voice-of-marketing js-visible']")
    private WebElement buttonMarketing;

    @FindBy(css = "[class='js-notices-link']")
    private WebElement buttonNotify;

    @FindBy(css = "header [href='/thanks']")
    private WebElement buttonLike;

    @FindBy(css = "[id='menu-messages']")
    private WebElement buttonMessages;

    @FindBy(css = "[class='gb-top-menu__item dropdown']")
    private WebElement buttonAvatar;

    private final WebDriver driver;

    public HeaderBlock (WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("проверка что имя страницы: {exampleNamePage}")
    public HeaderBlock checkNamePage(String exampleNamePage) {
        wait10second.until(ExpectedConditions.textToBePresentInElement(headerTitlePage, exampleNamePage));

        String headerPageText = headerTitlePage.getText();
        assertThat(headerPageText, equalToCompressingWhiteSpace(exampleNamePage));
        return this;
    }

    @Step("поиск на сайте по тексту: {exampleNamePage}")
    public SearchPage searchText(String text) {
        buttonSearch.click();
        inputSearch.sendKeys(text);
        return new SearchPage(driver);
    }
    @Step("проверка отобжажения элементов хедера")
    public void headerSearch() {
        Assertions.assertTrue(buttonSearch.isDisplayed());
        Assertions.assertTrue(login.isDisplayed());
        Assertions.assertTrue(registration.isDisplayed());
    }

    @Step("проверка отобжажения элементов хедера для авторизованного пользователя")
    public void headerAuth() {
        Assertions.assertTrue(buttonSearch.isDisplayed());
        Assertions.assertTrue(buttonMarketing.isDisplayed());
        Assertions.assertTrue(buttonNotify.isDisplayed());
        Assertions.assertTrue(buttonLike.isDisplayed());
        Assertions.assertTrue(buttonMessages.isDisplayed());
        Assertions.assertTrue(buttonAvatar.isDisplayed());
    }

}
