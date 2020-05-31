package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;

import java.util.stream.Stream;

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

    @DisplayName("Проверка навигации")
    @ParameterizedTest
    @MethodSource("stringsProvider")
    void findNamePage(String selector, String namePage) {
        try {
            driver.findElement(By.cssSelector("button[class=\"c9e3 _311d\"]")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Pop-up is not found");
        }
        WebElement button = driver.findElement(By.cssSelector(selector));
        button.click();
        WebElement textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals(namePage, textNamePage.getText());
        Assertions.assertTrue(Header.headerSearch());
        Assertions.assertTrue(Footer.footerSearch());
    }

    static Stream<Arguments> stringsProvider() {
        return Stream.of(
                Arguments.of("[id='nav'] [href='/courses']", "Курсы"),
                Arguments.of("[id='nav'] [href='/events']", "Вебинары"),
                Arguments.of("[id='nav'] [href='/topics']", "Форум"),
                Arguments.of("[id='nav'] [href='/posts']", "Блог"),
                Arguments.of("[id='nav'] [href='/tests']", "Тесты"),
                Arguments.of("[id='nav'] [href='/career']", "Карьера"));

    }
}

