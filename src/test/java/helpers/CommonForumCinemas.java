package helpers;

import org.openqa.selenium.chrome.ChromeDriver;

public class CommonForumCinemas {

    public static ChromeDriver driver;


    public void startChrome(){
        String driverpath = "C:\\Users\\brood\\IdeaProjects\\ForumCinemasTest\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpath);
        driver = new ChromeDriver();
    }

    public void stopChrome(){
        driver.quit();
    }
}


