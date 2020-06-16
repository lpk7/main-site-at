package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProfessionsPage extends CoursePage {

    public ProfessionsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public ProfessionsPage openUrl() {
        driver.get("https://geekbrains.ru/courses?tab=prof-compact#prof-compact");
        return this;
    }
}