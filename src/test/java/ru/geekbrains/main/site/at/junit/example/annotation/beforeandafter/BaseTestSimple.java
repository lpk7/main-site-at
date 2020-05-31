package ru.geekbrains.main.site.at.junit.example.annotation.beforeandafter;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTestSimple {

    @BeforeAll
    static void beforeAllSimple() {
        System.out.println("BeforeAll BaseTestSimple");
    }

    @BeforeEach
    void beforeEachSimple() {
        System.out.println("BeforeEach BaseTestSimple");
    }

    @AfterEach
    void afterEachSimple() {
        System.out.println("AfterEach BaseTestSimple");
    }

    @AfterAll
    static void afterAllSimple() {
        System.out.println("AfterAll BaseTestSimple");
    }
}
