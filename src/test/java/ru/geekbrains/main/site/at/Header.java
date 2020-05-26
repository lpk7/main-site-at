package ru.geekbrains.main.site.at;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;


public class Header extends BaseTest {
        WebElement headerName = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        WebElement buttonSearch = driver.findElement(By.cssSelector("[class=\"show-search-form\"]"));
        WebElement login = driver.findElement(By.cssSelector("a[href='/login']"));
        WebElement registration = driver.findElement(By.cssSelector("a[href='/register']"));
    }
