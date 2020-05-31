package ru.geekbrains.main.site.at.junit.example.assertions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAllTest {
    @Test
    void example()  {
        assertAll("Пользователь",
                () -> assertEquals("Иван", "Петр"),
                () -> assertEquals("Иванов", "Васильев")
        );
    }
}
