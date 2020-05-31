package ru.geekbrains.main.site.at.junit.example.annotation.beforeandafter;

import org.junit.jupiter.api.*;

public class SimpleTest extends BaseTestSimple {

    @BeforeAll
    static void beforeAllSimple() {
        System.out.println("BeforeAll BaseTestSimple");
    }

    @BeforeEach
    void a() {
        System.out.println("BeforeEach a:" + getClass().getName());
    }

    @BeforeEach
    void b() {
        System.out.println("BeforeEach b:" + getClass().getName());
    }

    @BeforeEach
    void c() {
        System.out.println("BeforeEach c:" + getClass().getName());
    }


    @Test
    void name1() {
        Assertions.assertTrue(true);
    }

    @Disabled
    @Test
    void name2() {
        Assertions.fail("Упал преднамеренно!");
    }


    @AfterEach
    void afterEachSimple() {
        System.out.println("AfterEach:" + getClass().getName());
    }

    @AfterAll
    static void afterAllSimple() {
        System.out.println("AfterAll BaseTestSimple");
    }
}
