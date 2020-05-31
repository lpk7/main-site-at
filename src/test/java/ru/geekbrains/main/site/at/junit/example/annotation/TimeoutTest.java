package ru.geekbrains.main.site.at.junit.example.annotation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeoutTest {
    @Timeout(2)
    @Test
    void example() throws InterruptedException {
        sleep(1000);
        assertTrue(true);
        assertEquals(3, 2 + 1);
    }
}
