package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.page.content.base.ContentBasePage;

public class CareerPage extends ContentBasePage {

    public CareerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public CareerPage openUrl() {
        driver.get("https://geekbrains.ru/career");
        return this;
    }
}