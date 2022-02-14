package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

    private static WebDriver driver;

   @BeforeAll
   public static void init() {
       System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
       driver = new ChromeDriver();
     }

    @Test
    public void test1() {
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[3]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();

  //      driver.quit();
    }

      @AfterAll
      public static void teardown() {
          driver.quit();
      }

}
