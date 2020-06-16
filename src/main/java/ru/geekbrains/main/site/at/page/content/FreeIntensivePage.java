package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FreeIntensivePage extends CoursePage {

    public FreeIntensivePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public FreeIntensivePage openUrl() {
        driver.get("https://geekbrains.ru/courses?tab=free#free");
        return this;
    }
}
