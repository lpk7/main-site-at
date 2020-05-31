package ru.geekbrains.main.site.at.junit.example.annotation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Пример Тестового набора")
public class DisplayNameTest {

    @Nested
    @DisplayName("Nested class 1")
    class NestedClass1 {
        @DisplayName("Пример ТК 1")
        @Test
        void example1() {
            assertTrue(true);
            assertEquals(2, 1 + 1);
        }

        @DisplayName("Пример ТК 2")
        @Test
        void example2() {
            assertTrue(true);
            assertEquals(2, 1 + 1);
        }
    }

    @Nested
    @DisplayName("Nested class 2")
    class NestedClass2 {
        @DisplayName("Пример ТК 3")
        @Test
        void example1() {
            assertTrue(true);
            assertEquals(2, 1 + 1);
        }

        @DisplayName("Пример ТК 4")
        @Test
        void example2() {
            assertTrue(true);
            assertEquals(2, 1 + 1);
        }
    }
}
