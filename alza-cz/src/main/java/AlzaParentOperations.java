import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlzaParentOperations {

    WebDriver browser;
    WebDriverWait wait;

    public AlzaParentOperations(WebDriver browser) {
        this.browser = browser;
        this.wait = new WebDriverWait(browser, Duration.ofMillis(10000));
    }

    void goToCartNotEmpty() {
        browser.findElement(By.cssSelector(".header-alz-18 .header-alz-103")).click();
        wait.until(r->browser.findElement(By.cssSelector(".c1 .mainItem")).isDisplayed());
    }

    void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) browser;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) browser;

        js.executeScript("window.scrollTo(0, 0);");
    }

}
