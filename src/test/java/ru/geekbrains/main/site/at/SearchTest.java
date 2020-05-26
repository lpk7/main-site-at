package ru.geekbrains.main.site.at;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.base.BaseTest;

import java.util.List;

public class SearchTest extends BaseTest {

//        Перейти на сайт https://geekbrains.ru/courses
//        Нажать на кнопку Поиск
//        В поле Поиск ввести текст: java
//        Проверить что отобразились блоки и в них:
//        Профессий не менее чем 2
//        Курсов более 15
//        Вебинаров больше чем 180, но меньше 300
//        В вебинарах отображается первым “Java Junior. Что нужно знать для успешного собеседования?”
//        Блогов более 300
//        Форумов не 350
//        Тестов не 0
//        В Проектах и компаниях отображается GeekBrains

    @Test
    void events() {
        try {
            driver.findElement(By.cssSelector("button[class=\"c9e3 _311d\"]")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Pop-up is not found");
        }
        WebElement buttonSearch = driver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]"));
        buttonSearch.click();
        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");


        WebElement professions = driver.findElement(By.cssSelector("[id=\"professions\"] h2"));
        WebElement courses = driver.findElement(By.xpath(".//h2[text()='Курсы']"));
        WebElement events = driver.findElement(By.xpath(".//h2[text()='Вебинары']"));
        WebElement blogs = driver.findElement(By.xpath(".//h2[text()='Блоги']"));
        WebElement forum = driver.findElement(By.xpath(".//h2[text()='Форум']"));
        WebElement tests = driver.findElement(By.xpath(".//header/h2[text()='Тесты']"));
        WebElement projectAndCompany = driver.findElement(By.xpath(".//header/h2[text()='Проекты и компании']"));

        wait10Second.until(ExpectedConditions.textToBePresentInElement(professions, "Профессии"));
        wait10Second.until(ExpectedConditions.textToBePresentInElement(courses, "Курсы"));
        wait10Second.until(ExpectedConditions.textToBePresentInElement(events, "Вебинары"));
        wait10Second.until(ExpectedConditions.textToBePresentInElement(blogs, "Блоги"));
        wait10Second.until(ExpectedConditions.textToBePresentInElement(forum, "Форум"));
        wait10Second.until(ExpectedConditions.textToBePresentInElement(tests, "Тесты"));
        wait10Second.until(ExpectedConditions.textToBePresentInElement(projectAndCompany, "Проекты и компании"));

        WebElement professionsCount = driver.findElement(By.xpath("//header/h2[text()='Профессии']/following-sibling::ul/li/a/span"));
        WebElement coursesCount = driver.findElement(By.xpath("//h2[text()='Курсы']/following-sibling::ul/li/a/span"));
        WebElement eventsCount = driver.findElement(By.xpath("//h2[text()='Вебинары']/following-sibling::ul/li/a/span"));
        WebElement blogsCount = driver.findElement(By.xpath("//h2[text()='Блоги']/following-sibling::ul/li/a/span"));
        WebElement forumCount = driver.findElement(By.xpath("//h2[text()='Форум']/following-sibling::ul/li/a/span"));
        WebElement testsCount = driver.findElement(By.xpath("//header/h2[text()='Тесты']/following-sibling::ul/li/a/span"));
        //WebElement projectAndCompanyCount = driver.findElement(By.xpath(".//header/h2[text()='Проекты и компании']/following-sibling::ul/li/a/span"));
        WebElement firstEvent = driver.findElement(By.cssSelector("div[class^='event-item'] div[class^='text-left'] a"));

        List<WebElement> list = driver.findElements(By.cssSelector("div[class='company-item-wrapper']"));
        boolean containGeekbrains = false;
        for (WebElement element : list) {
            String text = element.findElement(By.cssSelector("h3 a")).getText();
            containGeekbrains = containGeekbrains || text.contains("GeekBrains");
        }

        MatcherAssert.assertThat(Integer.valueOf(professionsCount.getText()), Matchers.greaterThanOrEqualTo(2));
        MatcherAssert.assertThat(Integer.valueOf(coursesCount.getText()), Matchers.greaterThan(15));
        MatcherAssert.assertThat(Integer.valueOf(eventsCount.getText()), Matchers.greaterThan(180));
        MatcherAssert.assertThat(Integer.valueOf(eventsCount.getText()), Matchers.lessThan(300));
        Assertions.assertEquals("Java Junior. Что нужно знать для успешного собеседования?", firstEvent.getText());
        MatcherAssert.assertThat(Integer.valueOf(blogsCount.getText()), Matchers.greaterThan(300));
        MatcherAssert.assertThat(Integer.valueOf(forumCount.getText()), Matchers.greaterThanOrEqualTo(350));
        MatcherAssert.assertThat(Integer.valueOf(testsCount.getText()), Matchers.not(0));
        Assertions.assertTrue(containGeekbrains);

//      Более короткий, но притянутый за уши, вариант проверки наличия GeekBrains в проектах и компаниях
//      WebElement companies = driver.findElement(By.cssSelector("div[class='company-item-wrapper'] * [alt$='GeekBrains']"));
    }
}
