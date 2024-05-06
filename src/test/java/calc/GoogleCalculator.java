package calc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GoogleStartPage;
import pages.GoogleCalcPage;

public class GoogleCalculator {
    private WebDriver driver;
    private GoogleStartPage googleStartPage;
    private GoogleCalcPage googleCalcPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        googleStartPage = new GoogleStartPage(driver);
        googleCalcPage = new GoogleCalcPage(driver);
    }

    @Test
    public void openGoogleStartPage() {
        googleStartPage.open();
        googleStartPage.searchQuery("Калькулятор");
        googleStartPage.submitButton();
    }

    @Test
    public void calculate() {
        googleCalcPage.open();
        googleCalcPage.waitResult();
        googleCalcPage.LeftBracket().click();
        googleCalcPage.Num1().click();
        googleCalcPage.Plus().click();
        googleCalcPage.Num2().click();
        googleCalcPage.RightBracket().click();
        googleCalcPage.Multiply().click();
        googleCalcPage.Num3().click();
        googleCalcPage.Minus().click();
        googleCalcPage.Num4().click();
        googleCalcPage.Num0().click();
        googleCalcPage.Divide().click();
        googleCalcPage.Num5().click();
        googleCalcPage.Equals().click();
        System.out.println("Result: " + googleCalcPage.getResult());
    }

    @AfterTest
    public void AfterTestRun() {
        driver.quit();
    }
}
