package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Log;

import static locators.MainPageLocators.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AdressOperationTest {

    private WebDriver driver = Driver.getChromeDriver();


    @BeforeAll
    public void setUp(){
        Log.info("Открываем adress book");
        driver.get("http://a.testaddressbook.com/sign_in");
        String currentURL = driver.getCurrentUrl();
        Assertions.assertEquals("http://a.testaddressbook.com/sign_in",currentURL,"Открыта неправльная страница");
        Log.info("Log in");
        driver.findElement(EMAIL_FIELD).sendKeys(EMAIL);
        driver.findElement(PASSWORD_FIELD).sendKeys(PASSWORD);
        driver.findElement(LOGIN);

    }
    @Test
    public void addAdress(){
        driver.findElement(ADRESSES).click();
        driver.findElement(ADD_ADRESS).click();
        driver.findElement(FIRST_NAME).sendKeys("arseni");
        driver.findElement(LAST_NAME).sendKeys("akulau");
        driver.findElement(CITY).sendKeys("minsk");
        driver.findElement(LIVING_ADRESS).sendKeys("jive");
        driver.findElement(ZIP_CODE).sendKeys("2313");
        driver.findElement(COMMIT).click();
    }
    @Test
    public void editAdress(){
        driver.findElement(EDIT_ADRESS).click();
        driver.findElement(SECOND_ADRESS).sendKeys("Belarus");
        driver.findElement(COMMIT).click();
    }
    @Test
    public void deleteAdress(){
        driver.findElement(LIST).click();
        driver.findElement(TD_ELEMENT).click();
    }
}
