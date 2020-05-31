package ru.geekbrains.main.site.at;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;

public class Footer extends BaseTest {

    WebElement facebook = driver.findElement(By.cssSelector("a[class='icon-facebook_dark']"));
    WebElement vk = driver.findElement(By.cssSelector("a[class='icon-vk']"));
    WebElement instagram = driver.findElement(By.cssSelector("a[class='icon-instagram']"));
    WebElement youtube = driver.findElement(By.cssSelector("a[class='icon-youtube']"));
    WebElement telegram = driver.findElement(By.cssSelector("a[class='icon-telegram']"));
    WebElement feedBacks = driver.findElement(By.cssSelector("a[href='/feedbacks']"));
    WebElement help = driver.findElement(By.xpath(".//a[text()='Помощь']"));
    WebElement company = driver.findElement(By.cssSelector("a[href='/company']"));
    WebElement license = driver.findElement(By.cssSelector("a[href='/license.pdf']"));
    WebElement career = driver.findElement(By.cssSelector("a[href='/career/682']"));
    WebElement forBusiness = driver.findElement(By.cssSelector(".//a[text()='Компаниям']"));
    WebElement phone = driver.findElement(By.cssSelector("a[class='site-footer__phone']"));
    WebElement skolkovo = driver.findElement(By.cssSelector("a[class='icon-skolkovo']"));

    static boolean footerSearch() {
        boolean facebook = driver.findElement(By.cssSelector("svg[class$='icon-facebook_dark']")).isDisplayed();
        boolean vk = driver.findElement(By.cssSelector("svg[class$='icon-vk']")).isDisplayed();
        boolean instagram = driver.findElement(By.cssSelector("svg[class$='icon-instagram']")).isDisplayed();
        boolean youtube = driver.findElement(By.cssSelector("svg[class$='icon-youtube']")).isDisplayed();
        boolean telegram = driver.findElement(By.cssSelector("svg[class$='icon-telegram']")).isDisplayed();
        boolean feedBacks = driver.findElement(By.cssSelector("a[href='/feedbacks']")).isDisplayed();
        boolean help = driver.findElement(By.xpath(".//a[text()='Помощь']")).isDisplayed();
        boolean company = driver.findElement(By.cssSelector("a[href='/company']")).isDisplayed();
        boolean license = driver.findElement(By.cssSelector("a[href='/license.pdf']")).isDisplayed();
        boolean career = driver.findElement(By.cssSelector("a[href='/career/682']")).isDisplayed();
        boolean forBusiness = driver.findElement(By.xpath(".//a[text()='Компаниям']")).isDisplayed();
        boolean phone = driver.findElement(By.cssSelector("a[class='site-footer__phone']")).isDisplayed();
        boolean skolkovo = driver.findElement(By.cssSelector("svg[class$='icon-skolkovo']")).isDisplayed();
        return facebook && vk && instagram && youtube && telegram && feedBacks && help && company && license && career
                && forBusiness && phone && skolkovo;
    }
//    фейсбук .icon-facebook_dark
//    вк .icon-vk
//    инста .icon-instagram
//    ютуб .icon-youtube
//    телеграм .icon-telegram
//    отзывы //a[contains(@href, '/feedbacks')]
//    помощь //a[contains(text(),'Помощь')]
//    о проекте //a[contains(@href, '/company')]
//    лицензия //a[href="/license.pdf"]
//    вакансии //a[href='/career/682']
//    компании //a[contains(text(),'Компаниям')]
//    телефон .site-footer__phone
//    сколково .icon-skolkovo
}
