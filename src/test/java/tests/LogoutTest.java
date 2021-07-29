package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Log;

import static locators.MainPageLocators.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LogoutTest {

        protected WebDriver driver = Driver.getChromeDriver();

    @BeforeAll
    public void setUp() {
        Log.info("Открываем adress book");
        driver.get("http://a.testaddressbook.com/sign_in");
        String currentURL = driver.getCurrentUrl();
        Assertions.assertEquals("http://a.testaddressbook.com/sign_in", currentURL, "Открыта неправльная страница");
        Log.info("Log in");
        driver.findElement(EMAIL_FIELD).sendKeys(EMAIL);
        driver.findElement(PASSWORD_FIELD).sendKeys(PASSWORD);
        driver.findElement(LOGIN).click();
    }

        @Test
        public void logOut(){
            Log.info("Log Out");
            driver.findElement(DELETE).click();
        }


    @Test
    @Disabled
    public void testForDisable() {
        Log.info("Disabled");
        driver.findElement(LOGIN).click();
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


