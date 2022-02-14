package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;//
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase1 {

    private static WebDriver driver;
    private static SearchPage searchPage;

   @BeforeAll
   public static void init() {
       System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
       ChromeOptions options = new ChromeOptions();
       options.addArguments("start-maximized");
       driver = new ChromeDriver(options);
       searchPage = new SearchPage(driver);
     }

     @BeforeEach
     public void setup() {
         driver.get("https://google.com");
     }

    @Test
    @DisplayName("Проверка операций с целыми числами")
    public void test1() {
        searchPage.searchInput.sendKeys("калькулятор", Keys.ENTER);
        searchPage.openClamp.click();
        searchPage.one.click();
        searchPage.plus.click();
        searchPage.two.click();
        searchPage.closeClamp.click();
        searchPage.multiply.click();
        searchPage.three.click();
        searchPage.minus.click();
        searchPage.four.click();
        searchPage.zero.click();
        searchPage.segmentation.click();
        searchPage.five.click();

        assertEquals("1", searchPage.results.getText());
        assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", searchPage.formula.getText());
     }

    @Test
    @DisplayName("Проверка деления на ноль")
    public void test2() {
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[3]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();

        assertEquals("Infinity", driver.findElement(By.cssSelector("span#cwos.qv3Wpe")).getText());
        assertEquals("6 ÷ 0 =", driver.findElement(By.cssSelector("span.vUGUtc")).getText());
    }

    @Test
    @DisplayName("Проверка ошибки при отсутсвии значения")
    public void test3() {
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[1]/tbody/tr[2]/td[2]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();

        assertEquals("Error", driver.findElement(By.cssSelector("span#cwos.qv3Wpe")).getText());
        assertEquals("sin() =", driver.findElement(By.cssSelector("span.vUGUtc")).getText());
        assertEquals("rgba(204, 204, 204, 1)", driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/div/span/span")).getCssValue("color"));
    }


 //     @AfterAll
 //     public static void teardown() {
 //        driver.quit();
 //     }

}
