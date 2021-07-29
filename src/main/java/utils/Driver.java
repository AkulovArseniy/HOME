package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;

    private static void initializeChromeDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akula\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }
    public static WebDriver getChromeDriver(){
        initializeChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
}
