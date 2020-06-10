package ru.geekbrains.main.site.at.example.junit.assertions;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssertThrowsTest {
    @Test
    public void example() {
        File file = new File("src/test/resources/txt.txt");

        Assertions.assertThrows(FileNotFoundException.class,
                () -> new Scanner(file));
    }
}
