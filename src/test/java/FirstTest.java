
import javafx.scene.control.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public class FirstTest {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","/Users/aksana/Downloads/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("http://a.testaddressbook.com/sign_in");
            Thread.sleep(5000);

            driver.findElement(By.id("session_email")).sendKeys("arses@yandex.by");
            driver.findElement(By.id("session_password")).sendKeys("1233");
            driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();
            System.out.println("First test ended");


//            driver.findElement(By.xpath("//button[@data-toggle='collapse']")).click();
            driver.findElement(By.xpath("//a[@data-test='addresses']")).click();
            driver.findElement(By.xpath("//a[@data-test='create']")).click();
            driver.findElement(By.name("address[first_name]")).sendKeys("arseni");
            driver.findElement(By.name("address[last_name]")).sendKeys("akulau");
            driver.findElement(By.name("address[city]")).sendKeys("minsk");
            driver.findElement(By.name("address[address1]")).sendKeys("jive");
            driver.findElement(By.name("address[zip_code]")).sendKeys("2313");
            driver.findElement(By.name("commit")).click();
            System.out.println("Second test ended");


            driver.findElement(By.xpath("//a[@data-test='edit']")).click();
            driver.findElement(By.name("address[address2]")).sendKeys("Belarus");
            driver.findElement(By.name("commit")).click();
            System.out.println("Third test ended");


            driver.findElement(By.xpath("//a[@data-test='list']")).click();
            WebDriverWait wait = new WebDriverWait(driver, 5);
            driver.findElement(By.xpath("//tr[last()]/td[last()]/a")).click();
            driver.switchTo().alert().accept();
            System.out.println("Fourth test ended");




//            driver.findElement(By.xpath("//button[@data-toggle='collapse']")).click();
            driver.findElement(By.xpath("//a[@data-method='delete']")).click();
            System.out.println("fifth test ended");

        }}
