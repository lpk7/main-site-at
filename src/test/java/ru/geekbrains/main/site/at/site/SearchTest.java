package ru.geekbrains.main.site.at.site;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.base.SearchBaseTest;
import ru.geekbrains.main.site.at.page.SearchPage;

import java.util.stream.Stream;
@Feature("Поиск")
public class SearchTest extends SearchBaseTest {

    static SearchPage searchPage;

    @BeforeAll
    static void beforeSearch() {
        searchPage = new SearchPage(driver).search("java");
    }

    static Stream<String> stringProvider() {
        return Stream.of(
                "Профессии",
                "Курсы",
                "Вебинары",
                "Блоги",
                "Форум",
                "Тесты",
                "Проекты и компании");
    }

    @DisplayName("Проверка результатов поиска")
    @ParameterizedTest(name = "{index} => Проверка раздела: {0}")
    @MethodSource("stringProvider")
    void events(String name) {
        searchPage.checkSearchPage(name);
    }
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
}

