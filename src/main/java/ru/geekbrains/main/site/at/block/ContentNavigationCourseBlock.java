package ru.geekbrains.main.site.at.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.page.BasePageObject;
import ru.geekbrains.main.site.at.page.content.CoursePage;
import ru.geekbrains.main.site.at.page.content.ForBusinessPage;
import ru.geekbrains.main.site.at.page.content.FreeIntensivePage;
import ru.geekbrains.main.site.at.page.content.ProfessionsPage;
import ru.geekbrains.main.site.at.utils.ButtonNotFoundException;

public class ContentNavigationCourseBlock extends BasePageObject {

    @FindBy(css = "[class*='nav nav-tabs'] [id='prof-link']")
    private WebElement tabProfessions;

    @FindBy(css = "[class*='nav nav-tabs'] [id='free-link']")
    private WebElement tabFreeIntensive;

    @FindBy(css = "[class*='nav nav-tabs'] [id='cour-link']")
    private WebElement tabCourses;

    @FindBy(css = "[class*='nav nav-tabs'] [href*='https://forbusiness']")
    private WebElement tabCompanies;

    public ContentNavigationCourseBlock(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CoursePage clickTab(Tab tab) {
        switch (tab) {
            case Professions: {
                tabProfessions.click();
                return new ProfessionsPage(driver);
            }
            case FreeIntensive: {
                tabFreeIntensive.click();
                return new FreeIntensivePage(driver);
            }
            case Courses: {
                tabCourses.click();
                return new CoursePage(driver);
            }
            case ForBusiness: {
                tabCompanies.click();
                return new ForBusinessPage(driver);
            }
        }
        throw new ButtonNotFoundException();
    }

    public enum Tab {
        Professions,
        FreeIntensive,
        Courses,
        ForBusiness
    }
}
