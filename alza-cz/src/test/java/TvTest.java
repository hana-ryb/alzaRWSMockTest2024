import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TvTest {

    @Test
    void tvTest() {
        WebDriver browser = WebDriverManager.firefoxdriver().create();
        browser.get("https://alza.cz");

        //accept cookies
        WebElement cookiesAcceptButton = browser.findElement(By.cssSelector(".js-cookies-info-accept"));
        cookiesAcceptButton.click();

        //click on TV, foto etc.
        browser.findElement(By.xpath("//a[@href='/tv-foto-audio-video']")).click();

        //click on Televize
        browser.findElement(By.xpath("//span[contains(text(), 'Televize')]")).click();

        //click on nejlevnejsi
        browser.findElement(By.xpath("//a[@href='#cenaasc']")).click();

        //click on the first TV
        browser.findElement(By.cssSelector(".firstRow .btnk1")).click();

        var expectedNameOfTv = browser.findElement(By.cssSelector(".firstRow .name")).getText();

        var firstName = "Televize ";
        var lastName = expectedNameOfTv;
        var fullExpectedName = firstName + lastName;
        System.out.println(fullExpectedName);

        //prejit do kosiku
        browser.findElement(By.cssSelector(".header-alz-18 .header-alz-103")).click();

        var actualNameofTv = browser.findElement(By.cssSelector(".c1 .mainItem")).getText();

        Assertions.assertEquals(fullExpectedName, actualNameofTv);
        //click on plus
        browser.findElement(By.cssSelector(".c2 .countPlus")).click();

        var prizeOfOne = browser.findElement(By.cssSelector(".c5")).getText();
        System.out.println(prizeOfOne);



    }

}
