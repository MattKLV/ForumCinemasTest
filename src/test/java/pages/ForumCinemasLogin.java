package pages;

import helpers.CommonForumCinemas;
import org.openqa.selenium.By;

public class ForumCinemasLogin extends CommonForumCinemas {

    private final By login = By.xpath("//a[@href='/mypage/logon/?returnUrl=%252f']");
    private final By username = By.id("input-userName");
    private final By password = By.id("input-password");
    private final By profile = By.xpath("//button[@class='btn btn-primary btn-block']");

    public void openForumCinemas(){
        driver.get("https://www.forumcinemas.lv/");
    }

    public void pressLogin() {
        driver.findElement(login).click();
    }

    public void enterUserName() {
        driver.findElement(username).sendKeys("nebayi2776@flmcat.com");
    }

    public void enterPassword() {
        driver.findElement(password).sendKeys("tester123");
    }

    public void enterProfile() {
        driver.findElement(profile).click();
    }


}
