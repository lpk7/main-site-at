package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import ru.geekbrains.main.site.at.base.BaseTest;

public class FooterTest extends BaseTest {

    @Test
    void courses() {
        try {
            driver.findElement(By.cssSelector("button[class=\"c9e3 _311d\"]")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Pop-up is not found");
        }
        Assertions.assertTrue(footer());
        Assertions.assertTrue(footerSearch());
    }

    @Test
    void events() {
        driver.get("https://geekbrains.ru/events");
        Assertions.assertTrue(footer());
        Assertions.assertTrue(footerSearch());
    }

    @Test
    void forum() {
        driver.get("https://geekbrains.ru/topics");
        Assertions.assertTrue(footer());
        Assertions.assertTrue(footerSearch());
    }

    @Test
    void blog() {
        driver.get("https://geekbrains.ru/posts");
        Assertions.assertTrue(footer());
        Assertions.assertTrue(footerSearch());
    }

    @Test
    void tests() {
        driver.get("https://geekbrains.ru/tests");
        Assertions.assertTrue(footer());
        Assertions.assertTrue(footerSearch());
    }

    @Test
    void career() {
        driver.get("https://geekbrains.ru/career");
        Assertions.assertTrue(footer());
        Assertions.assertTrue(footerSearch());
    }

    private boolean footer() {
        try {
            return driver.findElement(By.cssSelector("footer[class=\"site-footer\"]")).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    boolean footerSearch() {
        boolean facebook = driver.findElement(By.cssSelector("svg[class$='icon-facebook_dark']")).isDisplayed();
        boolean vk = driver.findElement(By.cssSelector("svg[class$='icon-vk']")).isDisplayed();
        boolean instagram = driver.findElement(By.cssSelector("svg[class$='icon-instagram']")).isDisplayed();
        boolean youtube = driver.findElement(By.cssSelector("svg[class$='icon-youtube']")).isDisplayed();
        boolean telegram = driver.findElement(By.cssSelector("svg[class$='icon-telegram']")).isDisplayed();
        boolean feedBacks = driver.findElement(By.cssSelector("a[href='/feedbacks']")).isDisplayed();
        boolean help = driver.findElement(By.xpath(".//a[text()='Помощь']")).isDisplayed();
        boolean company = driver.findElement(By.cssSelector("a[href='/company']")).isDisplayed();
        boolean license = driver.findElement(By.cssSelector("a[href='/license.pdf']")).isDisplayed();
        boolean career = driver.findElement(By.cssSelector("a[href='/career/682']")).isDisplayed();
        boolean forBusiness = driver.findElement(By.xpath(".//a[text()='Компаниям']")).isDisplayed();
        boolean phone = driver.findElement(By.cssSelector("a[class='site-footer__phone']")).isDisplayed();
        boolean skolkovo = driver.findElement(By.cssSelector("svg[class$='icon-skolkovo']")).isDisplayed();
        return facebook && vk && instagram && youtube && telegram && feedBacks && help && company && license && career
                 && forBusiness && phone && skolkovo;
    }
}