package ru.geekbrains.main.site.at.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wait10Second;

    @BeforeEach
    void before() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("disable-popup-blocking"));
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);

        driver.get("https://geekbrains.ru/career");

        wait10Second = new WebDriverWait(driver, 10);
    }

    @AfterEach
    void after() {
        driver.quit();
    }
}