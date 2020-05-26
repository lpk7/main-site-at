package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;

public class NavigationTest extends BaseTest {
//    Перейти на сайт https://geekbrains.ru/courses
//    Нажать на кнопку Курсы
//    Проверить что страница Курсы открылась
//    Повторить для
//    Курсы
//    Вебинары
//    Форум
//    Блог
//    Тесты
//    Карьера
//    Вынести проверку каждой страницы в отдельный тест
//    Реализовать проверку отображения блоков Header и Footer на каждой странице сайта
//    (как минимум самого блока)
//    (Дополнительное задание, тема следующего занятия)
//    Cоздать классы Header и Footer в которых создать локаторы ко всем элементам в этих блоках

    @Test
    void courses() {
        findNamePage("[id='nav'] [href='/courses']", "Курсы");
    }

    @Test
    void events() {
        findNamePage("[id='nav'] [href='/events']", "Вебинары");
    }

    @Test
    void forum() {
        findNamePage("[id='nav'] [href='/topics']", "Форум");
    }

    @Test
    void blog() {
        findNamePage("[id='nav'] [href='/posts']", "Блог");
    }

    @Test
    void tests() {
        findNamePage("[id='nav'] [href='/tests']", "Тесты");
    }

    @Test
    void career() {
        findNamePage("[id='nav'] [href='/career']", "Карьера");
    }

    private void findNamePage(String selector, String namePage){
        try {
            driver.findElement(By.cssSelector("button[class=\"c9e3 _311d\"]")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Pop-up is not found");
        }
        WebElement buttonCourses = driver.findElement(By.cssSelector(selector));
        buttonCourses.click();
        WebElement textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals(namePage, textNamePage.getText());
    }
}
