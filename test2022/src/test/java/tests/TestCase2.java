package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div.PaQdxb.A2W7l")).click();
        driver.findElement(By.cssSelector("div.XRsWPe.MEdqYd")).click();
        driver.findElement(By.cssSelector("div.XRsWPe.AOvabd")).click();


        //WebElement element = driver.findElement(By.xpath("//*[@id=\"cwos\"]"));
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].innerText = '2 + 6'", element);


//        driver.quit();

    }
}
