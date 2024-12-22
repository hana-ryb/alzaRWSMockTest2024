import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends AlzaParentOperations {

    public MainPage(WebDriver browser) {
        super(browser);
    }

    void clickOnTv() {
        browser.findElement(By.xpath("//a[@href='/tv-foto-audio-video']")).click();
    }

    void goToProductSubpage(String productSubpageCategory) {
        String xpath = "//a[@href='$']".replace("$", productSubpageCategory);
        browser.findElement(By.xpath(xpath)).click();
        wait.until(r->browser.findElement(By.cssSelector(".catalogLocalTitlePage-alz-8")).isDisplayed());
    }
    void acceptCookies() {
        browser.findElement(By.cssSelector(".js-cookies-info-accept")).click();
    }

}
