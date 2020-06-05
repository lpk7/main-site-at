package ru.geekbrains.main.site.at.example.junit.annotation.beforeandafter;

import org.junit.Test;
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
    public void name1() {
        Assertions.assertTrue(true);
    }

    @Disabled
    @Test
    public void name2() {
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
