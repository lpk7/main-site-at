package ru.geekbrains.main.site.at.example.junit.annotation;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepeatedExampleTest {

    @org.junit.jupiter.api.RepeatedTest(3)
    void example() throws InterruptedException {
        sleep(1000);
        assertTrue(true);
        assertEquals(2, 1 + 1);

    }
}
