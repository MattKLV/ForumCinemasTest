package pages;

import helpers.CommonForumCinemas;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ForumCinemasSettings extends CommonForumCinemas {

    private final By profileButton = By.xpath("//a[@class='btn btn-user btn-default']");
    private final By informationButton = By.xpath("//a[@href='/mypage/profile/']");
    private final By name = By.id("inputFirstName");
    private final By lastName = By.id("inputLastName");
    private final By date = By.xpath("//select[@id='bdDay']//option[@value='8']");
    private final By month = By.xpath("//select[@id='bdMonth']//option[@value='5']");
    private final By year = By.xpath("//select[@id='bdYear']//option[@value='1994']");
    private final By saveButton = By.xpath("//button[@class='btn btn-primary']");

    public void openProfile() {
        driver.findElement(profileButton).click();
    }

    public void profileInformation() {
        driver.findElement(informationButton).click();
    }

    public void changeName() {
        driver.findElement(name).clear();
        driver.findElement(name).sendKeys("AAAAAA");
    }

    public void changeLastName() {
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys("BBBBBBBBBB");
    }

    public void changeDate() {
        driver.findElement(date).click();
    }

    public void changeMonth() {
        driver.findElement(month).click();
    }

    public void changeYear() {
        driver.findElement(year).click();
    }

    public void saveChanges() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)");

        driver.findElement(saveButton).click();
    }
}
