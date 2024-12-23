import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailProductPage extends AlzaParentOperations {

    public DetailProductPage(WebDriver browser) {
        super(browser);
    }

    void goToNejlevnejsi() {
        browser.findElement(By.xpath("//a[@href='#cenaasc']")).click();
        wait.until(r-> browser.findElement(By.cssSelector(".firstRow .btnk1")).isDisplayed());
    }

    String getExpectedNameOfNejlevnejsi() {
        return browser.findElement(By.cssSelector(".firstRow .name")).getText();
    }

    void addFirstProductToCart() {
        browser.findElement(By.cssSelector(".firstRow .btnk1")).click();
    }

    }


