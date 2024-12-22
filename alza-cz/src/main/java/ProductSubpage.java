import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSubpage extends AlzaParentOperations {

    public ProductSubpage(WebDriver browser) {
        super(browser);
    }

    void goToTelevize() {
        browser.findElement(By.xpath("//span[contains(text(), 'Televize')]")).click();
    }

    void goToProduct(String productCategory) {
        String xpath = "//span[contains(text(), '$')]".replace("$", productCategory);
        browser.findElement(By.xpath(xpath)).click();
    }
}
