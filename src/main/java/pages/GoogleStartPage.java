package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleStartPage {
    private final WebDriver driver;

    public GoogleStartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement searchField() {
        return driver.findElement(By.name("q"));
    }

    public void submitButton() {
        searchField().submit();
    }

    public void open() {
        driver.navigate().to("http://google.com");
    }

    public void searchQuery(String queryString){
        searchField().sendKeys(queryString);
    }
}
