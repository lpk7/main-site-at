package ru.geekbrains.main.site.at.site;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.base.BaseTest;
import ru.geekbrains.main.site.at.block.Footer;
import ru.geekbrains.main.site.at.block.Header;
import ru.geekbrains.main.site.at.page.HomePage;


import java.util.stream.Stream;

@Feature ("Навигация")
@DisplayName("Проверка навигации, хедера и футера")
public class NavigationTest extends BaseTest {

    @Step("Нажатие кнопки '{name}'")
    public static Stream<String> stringProviderNotPopUp() {
        return Stream.of(
                "Форум",
                "Тесты",
                "Карьера",
                "Вебинары"
        );
    }
    @Step("Нажатие кнопки '{name}'")
    public static Stream<String> stringProviderPopUp() {
        return Stream.of(
                "Курсы",
                "Блог"
        );
    }

    @DisplayName("Нажатие на элемент навагации")
    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProviderNotPopUp")
    void checkNavigationNotPopUp(String name) {
        new HomePage(driver)
                .getNavigation().clickButton(name)
                .checkNamePage(name);
        new Header(driver)
                .headerSearch();
        new Footer(driver)
                .footerSearch();
    }

    @DisplayName("Нажатие на элемент навагации")
    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProviderPopUp")
    void checkNavigationPopUp(String name) {
        new HomePage(driver)
                .getNavigation().clickButton(name)
                .closedPopUp()
                .checkNamePage(name);
        new Header(driver)
                .headerSearch();
        new Footer(driver)
                .footerSearch();
    }

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

}

