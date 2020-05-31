package ru.geekbrains.main.site.at.junit.example.annotation;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTestExample {
    @DisplayName("Пример хардкода данных")
    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World"})
    void hardcode(String word) {
        System.out.println(word);
        assertTrue(true);
    }

    @DisplayName("Пример получения данных из метода")
    @ParameterizedTest
    @MethodSource("stringProvider")
    void method(String word) {
        System.out.println(word);
        assertTrue(true);
    }

    static List<String> stringProvider() {
        return ImmutableList.of("Hello", "World");
    }
}
