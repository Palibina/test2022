package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;//
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertAll;
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
        searchPage.equally.click();

        assertAll(
                () -> assertEquals("1", searchPage.results.getText()),
                () -> assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", searchPage.formula.getText())
        );
     }

    @Test
    @DisplayName("Проверка деления на ноль")
    public void test2() {
        searchPage.searchInput.sendKeys("калькулятор", Keys.ENTER);
        searchPage.six.click();
        searchPage.segmentation.click();
        searchPage.zero.click();
        searchPage.equally.click();

        assertAll(
                () -> assertEquals("Infinity", searchPage.results.getText()),
                () -> assertEquals("6 ÷ 0 =", searchPage.formula.getText())
        );
    }



      @AfterAll
      public static void teardown() {
         driver.quit();
      }

}
