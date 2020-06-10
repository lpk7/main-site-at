package ru.geekbrains.main.site.at.site;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.base.BaseTest;
import ru.geekbrains.main.site.at.block.Footer;
import ru.geekbrains.main.site.at.block.Header;
import ru.geekbrains.main.site.at.page.HomePage;


import java.util.stream.Stream;

@DisplayName("Проверка навигации, хедера и футера")
public class NavigationTest extends BaseTest {

    static Stream<String> stringProvider() {
        return Stream.of(
                "Курсы",
                "Вебинары",
                "Форум",
                "Блог",
                "Тесты",
                "Карьера"
        );
    }

    @DisplayName("Нажатие на элемент навагации")
    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProvider")
    void checkNavigation(String name) {
        new HomePage(driver)
                .getNavigation().clickButton(name)
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

