import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    WebDriver browser = WebDriverManager.firefoxdriver().create();
    MainPage mainPage;

    @BeforeEach
    void commonBeforeTest() {
        browser.get("https://alza.cz");
        browser.manage().window().maximize();
        mainPage = new MainPage(browser);
        mainPage.acceptCookies();

    }

    void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
