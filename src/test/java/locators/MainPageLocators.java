package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPageLocators {

    public static final By EMAIL_FIELD = By.id("session_email");
    public static final String EMAIL = "arses@yandex.by";
    public static final By PASSWORD_FIELD = By.id("session_password");
    public static final String PASSWORD = "1233";
    public static final By LOGIN = By.xpath("//*[@class=\"btn btn-primary\"]");
    //1 test

    public static final By ADRESSES = By.xpath("//a[@data-test='addresses']");
    public static final By ADD_ADRESS = By.xpath("//a[@data-test='create']");
    public static final By FIRST_NAME = By.name("address[first_name]");
    public static final By LAST_NAME = By.name("address[last_name]");
    public static final By CITY = By.name("address[city]");
    public static final By LIVING_ADRESS = By.name("address[address1]");
    public static final By ZIP_CODE = By.name("address[zip_code]");
    public static final By COMMIT = By.name("commit");
    //2 test


    public static final By EDIT_ADRESS = By.xpath("//a[@data-test='edit']");
    public static final By SECOND_ADRESS = By.name("address[address2]");
    //3 test


    //public static final By LIST = By.xpath("//a[@data-test='list']");
    public static final By TD_ELEMENT = By.xpath("//tr[last()]/td[last()]/a");
    //4 test

    public static final By DELETE = By.xpath("//a[@data-method='delete']");
}




