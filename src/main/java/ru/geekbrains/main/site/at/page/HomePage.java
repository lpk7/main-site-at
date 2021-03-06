package ru.geekbrains.main.site.at.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.main.site.at.block.Navigation;

public class HomePage {
    @FindBy(css = "h2[class=\"gb-header__title\"]")
    private WebElement textNamePage;

    @FindBy(xpath = "//div[@data-testid=\"promocode-banner-container\"]//..//button[2]")
    private WebElement buttonPopUpClosed;

    private final Navigation navigation;
    private final WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        navigation = new Navigation(driver);
        PageFactory.initElements(driver, this);
    }

    public HomePage checkNamePage(String expectedNamePage) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.textToBePresentInElement(textNamePage, expectedNamePage));
        return this;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public HomePage closedPopUp() {
        this.buttonPopUpClosed.click();
        return this;
    }
}
