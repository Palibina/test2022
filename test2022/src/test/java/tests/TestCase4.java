package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase4 {

    private static WebDriver driver;
//  private static SearchPage searchPage;

   @BeforeAll
   public static void init() {
       System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
       ChromeOptions options = new ChromeOptions();
       options.addArguments("start-maximized");
       driver = new ChromeDriver(options);
//     searchPage = new SearchPage(driver);
     }

    @Test
    public void test() {
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[1]/tbody/tr[2]/td[2]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();

        assertEquals("Error", driver.findElement(By.cssSelector("span#cwos.qv3Wpe")).getText());
        assertEquals("sin() =", driver.findElement(By.cssSelector("span.vUGUtc")).getText());
        assertEquals("rgba(204, 204, 204, 1)", driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/div/span/span")).getCssValue("color"));
     }


  //    @AfterAll
   //   public static void teardown() {
   //      driver.quit();
  //    }

}