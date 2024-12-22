import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {

    WebDriver browser;

    public Cart(WebDriver browser) {
        this.browser = browser;
    }

    void openCart() {
        browser.get("https://www.alza.cz/Order1.htm");
    }

    void plusOneItem(int index) {
        browser.findElements(By.cssSelector(".c2 .countPlus")).get(index).click();
    }

    int getPriceOfFirstItem() {
        String text = browser.findElement(By.cssSelector(".c5")).getText();
        return Integer.parseInt(text.replaceAll("\\D", ""));

    }

    String getActualNameOfFirstItemInCart() {
        return browser.findElement(By.cssSelector(".c1 .mainItem")).getText();
    }

    //String getItemName(int index) {
      //  return browser.findElements(By.cssSelector(".c1 .mainItem")).get(index).getText();
    //} i cant find a good selector



}
