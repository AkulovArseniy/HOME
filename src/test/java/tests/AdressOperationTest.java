package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Log;

import static locators.MainPageLocators.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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
        driver.findElement(LOGIN).click();

    }

    @Test
    @Order(3)
    public void deleteAdress(){
        Log.info("open adresses");
        driver.findElement(ADRESSES).click();

        Log.info("delete last adress");
        driver.findElement(TD_ELEMENT).click();
        driver.switchTo().alert().accept();
    }
    @Test
    @Order(1)
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
    @Order(2)
    public void editAdress(){
        driver.findElement(EDIT_ADRESS).click();
        driver.findElement(SECOND_ADRESS).sendKeys("Belarus");
        driver.findElement(COMMIT).click();
    }
    @AfterEach
    public void afterEachTestMethod(){
        Log.info("Некоторый код выполяется после каждого метода");
    }

    @AfterAll
    public void tearDown() {

        Log.info("Закрываем браузер");
        driver.quit();

    }
}
