package ru.geekbrains.main.site.at.page;

import io.qameta.allure.Step;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.Matchers.allOf;

public class SearchPage {

    @FindBy(css = "[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")
    private WebElement buttonSearch;

    @FindBy(css = "[class=\"search-panel__search-field\"]")
    private WebElement inputSearch;

    @FindBy(css = "[id=\"professions\"] h2")
    private WebElement professions;

    @FindBy(xpath = ".//h2[text()='Курсы']")
    private WebElement courses;

    @FindBy(xpath = ".//h2[text()='Вебинары']")
    private WebElement events;

    @FindBy(xpath = ".//h2[text()='Блоги']")
    private WebElement blogs;

    @FindBy(xpath = ".//h2[text()='Форум']")
    private WebElement forum;

    @FindBy(xpath = ".//h2[text()='Тесты']")
    private WebElement tests;

    @FindBy(xpath = ".//header/h2[text()='Проекты и компании']")
    private WebElement projectAndCompany;


    @FindBy(xpath = "//header/h2[text()='Профессии']/following-sibling::ul/li/a/span")
    private WebElement professionsCount;

    @FindBy(xpath = "//h2[text()='Курсы']/following-sibling::ul/li/a/span")
    private WebElement coursesCount;

    @FindBy(xpath = "//h2[text()='Вебинары']/following-sibling::ul/li/a/span")
    private WebElement eventsCount;

    @FindBy(xpath = "//h2[text()='Блоги']/following-sibling::ul/li/a/span")
    private WebElement blogsCount;

    @FindBy(xpath = "//h2[text()='Форум']/following-sibling::ul/li/a/span")
    private WebElement forumCount;

    @FindBy(xpath = "//header/h2[text()='Тесты']/following-sibling::ul/li/a/span")
    private WebElement testsCount;

    @FindBy(css = "div[class^='event-item'] div[class^='text-left'] a")
    private WebElement firstEvent;

    @FindBy(xpath = "//header/h2[text()='Проекты и компании']/../../following-sibling::*//*[contains(text(), \"GeekBrains\")]")
    private WebElement companyName;

    private final WebDriver driver;
    private final WebDriverWait wait20Second;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait20Second = new WebDriverWait(driver, 20);
    }

    public SearchPage search(String name) {
        buttonSearch.click();
        inputSearch.sendKeys(name);
        return this;
    }
    @Step("Проверка блока '{name}'")
    public SearchPage checkSearchPage(String name) {
        switch (name) {
            case "Профессии": {
                wait20Second.until(ExpectedConditions.textToBePresentInElement(professions, name));
                MatcherAssert.assertThat(Integer.valueOf(professionsCount.getText()), Matchers.greaterThanOrEqualTo(2));
                break;
            }
            case "Курсы": {
                wait20Second.until(ExpectedConditions.textToBePresentInElement(courses, name));
                MatcherAssert.assertThat(Integer.valueOf(coursesCount.getText()), Matchers.greaterThan(15));
                break;
            }
            case "Вебинары": {
                wait20Second.until(ExpectedConditions.textToBePresentInElement(events, name));
                MatcherAssert.assertThat(Integer.valueOf(eventsCount.getText()),
                        allOf(
                                Matchers.greaterThan(180),
                                Matchers.lessThan(300)));
                Assertions.assertEquals("Java Junior. Что нужно знать для успешного собеседования?", firstEvent.getText());
                break;
            }
            case "Блоги": {
                wait20Second.until(ExpectedConditions.textToBePresentInElement(blogs, name));
                MatcherAssert.assertThat(Integer.valueOf(blogsCount.getText()), Matchers.greaterThan(300));
                break;
            }
            case "Форум": {
                wait20Second.until(ExpectedConditions.textToBePresentInElement(forum, name));
                MatcherAssert.assertThat(Integer.valueOf(forumCount.getText()), Matchers.greaterThanOrEqualTo(350));
                break;
            }
            case "Тесты": {
                wait20Second.until(ExpectedConditions.textToBePresentInElement(tests, name));
                MatcherAssert.assertThat(Integer.valueOf(testsCount.getText()), Matchers.not(0));
                break;
            }
            case "Проекты и компании": {
                wait20Second.until(ExpectedConditions.textToBePresentInElement(projectAndCompany, name));
                companyName.getText();
                break;
            }
            default: {
                throw new RuntimeException("Раздел " + name + " не найден!");
            }
        }
        return this;
    }
}