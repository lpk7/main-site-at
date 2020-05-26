package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import ru.geekbrains.main.site.at.base.BaseTest;

public class HeaderTest extends BaseTest {

    @Test
    void courses() {
        try {
            driver.findElement(By.cssSelector("button[class=\"c9e3 _311d\"]")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Pop-up is not found");
        }
        Assertions.assertTrue(header());
        Assertions.assertTrue(headerSearch());
    }

    @Test
    void events() {
        driver.get("https://geekbrains.ru/events");
        Assertions.assertTrue(header());
        Assertions.assertTrue(headerSearch());
    }

    @Test
    void forum() {
        driver.get("https://geekbrains.ru/topics");
        Assertions.assertTrue(header());
        Assertions.assertTrue(headerSearch());
    }

    @Test
    void blog() {
        driver.get("https://geekbrains.ru/posts");
        Assertions.assertTrue(header());
        Assertions.assertTrue(headerSearch());
    }

    @Test
    void tests() {
        driver.get("https://geekbrains.ru/tests");
        Assertions.assertTrue(header());
        Assertions.assertTrue(headerSearch());
    }

    @Test
    void career() {
        driver.get("https://geekbrains.ru/career");
        Assertions.assertTrue(header());
        Assertions.assertTrue(headerSearch());
    }

    private boolean header() {
        try {
            return driver.findElement(By.cssSelector("header[id=\"top-menu\"]")).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    boolean headerSearch() {
        boolean headerName = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]")).isDisplayed();
        boolean buttonSearch = driver.findElement(By.cssSelector("[class=\"show-search-form\"]")).isDisplayed();
        boolean login = driver.findElement(By.cssSelector("a[href='/login']")).isDisplayed();
        boolean registration = driver.findElement(By.cssSelector("a[href='/register']")).isDisplayed();
        return headerName && buttonSearch && login && registration;
    }
}
