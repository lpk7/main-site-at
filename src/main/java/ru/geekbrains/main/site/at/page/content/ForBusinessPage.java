package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ForBusinessPage extends CoursePage {


    public ForBusinessPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @Override
    public ForBusinessPage openUrl() {
        driver.get("https://forbusiness.geekbrains.ru/");
        return this;
    }
}
