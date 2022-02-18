package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SearchPage {

    @FindBy(css = "input.gLFyf.gsfi")
    public WebElement searchInput;

    @FindBy(css = "[jsname*='j93WEe']")
    public WebElement openClamp;

    @FindBy(css = "[jsname*='N10B9']")
    public WebElement one;

    @FindBy(css = "[jsname*='XSr6wc']")
    public WebElement plus;

    @FindBy(css = "[jsname*='lVjWed']")
    public WebElement two;

    @FindBy(css = "[jsname*='qCp9A']")
    public WebElement closeClamp;

    @FindBy(css = "[jsname*='YovRWb']")
    public WebElement multiply;

    @FindBy(css = "[jsname*='KN1kY']")
    public WebElement three;

    @FindBy(css = "[jsname*='pPHzQc']")
    public WebElement minus;

    @FindBy(css = "[jsname*='xAP7E']")
    public WebElement four;

    @FindBy(css = "[jsname*='bkEvMb']")
    public WebElement zero;

    @FindBy(css = "[jsname*='WxTTNd']")
    public WebElement segmentation;

    @FindBy(css = "[jsname*='Ax5wH']")
    public WebElement five;

    @FindBy(css = "[jsname*='Pt8tGc']")
    public WebElement equally;

    @FindBy(css = "[jsname*='abcgof']")
    public WebElement six;

    @FindBy(css = "[jsname*='aN1RFf']")
    public WebElement sin;

    @FindBy(css = "span.vUGUtc span")
    public WebElement Clamp;


    @FindBy(css = "span#cwos.qv3Wpe")
    public WebElement results;

    @FindBy(css = "span.vUGUtc")
    public WebElement formula;


    public SearchPage(WebDriver driver) {
        initElements(driver,this);
    }
}
