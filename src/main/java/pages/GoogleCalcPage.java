package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleCalcPage {
    private final WebDriver driver;
    private WebDriverWait wait;

    public GoogleCalcPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement Num0() {
        return driver.findElement(By.xpath("//div[text()='0']"));
    }

    public WebElement Num1() {
        return driver.findElement(By.xpath("//div[text()='1']"));
    }

    public WebElement Num2() {
        return driver.findElement(By.xpath("//div[text()='2']"));
    }

    public WebElement Num3() {
        return driver.findElement(By.xpath("//div[text()='3']"));
    }

    public WebElement Num4() {
        return driver.findElement(By.xpath("//div[text()='4']"));
    }

    public WebElement Num5() {
        return driver.findElement(By.xpath("//div[text()='5']"));
    }

    public WebElement Num6() {
        return driver.findElement(By.xpath("//div[text()='6']"));
    }

    public WebElement Num7() {
        return driver.findElement(By.xpath("//div[text()='7']"));
    }

    public WebElement Num8() {
        return driver.findElement(By.xpath("//div[text()='8']"));
    }

    public WebElement Num9() {
        return driver.findElement(By.xpath("//div[text()='9']"));
    }

    public WebElement Plus() {
        return driver.findElement(By.xpath("//div[text()='+']"));
    }

    public WebElement Minus() {
        return driver.findElement(By.xpath("//div[text()='−']"));
    }

    public WebElement Multiply() {
        return driver.findElement(By.xpath("//div[text()='×']"));
    }

    public WebElement Divide() {
        return driver.findElement(By.xpath("//div[text()='÷']"));
    }

    public WebElement Equals() {
        return driver.findElement(By.xpath("//div[text()='=']"));
    }

    public WebElement LeftBracket() {
        return driver.findElement(By.xpath("//div[text()='(']"));
    }

    public WebElement RightBracket() {
        return driver.findElement(By.xpath("//div[text()=')']"));
    }

    public WebElement Result() {
        return driver.findElement(By.xpath("//span[@id='cwos']"));
    }

    public void open() {
        driver.navigate().to("https://www.google.com/search?q=%D0%9A%D0%B0%D0%BB%D1%8C%D0%BA%D1%83%D0%BB%D1%8F%D1%82%D0%BE%D1%80");
    }

    public String getResult() {
        return driver.findElement(By.xpath("//span[@id='cwos']")).getText();
    }

    public void waitResult() {
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='cwos']")));
    }

}
