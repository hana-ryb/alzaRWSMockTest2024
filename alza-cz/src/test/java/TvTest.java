import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TvTest extends BaseTest {

    MainPage mainPage;
    Cart cartPage;
    ProductSubpage productSubpage;
    DetailProductPage detailProductPage;


    @BeforeEach
    void beforeTest() {
        mainPage = new MainPage(browser);
        cartPage = new Cart(browser);
        productSubpage = new ProductSubpage(browser);
        detailProductPage = new DetailProductPage(browser);

    }

    @Test
    void tvTest() {

        mainPage.goToProductSubpage("/tv-foto-audio-video");

        productSubpage.goToProduct("Televize");

        productSubpage.scrollDown();
        productSubpage.scrollDown();

        detailProductPage.goToNejlevnejsi();
        waitFor(3);

        detailProductPage.addFirstProductToCart();

        var expectedNameOfTv = "Televize " + detailProductPage.getExpectedNameOfNejlevnejsi();
        System.out.println(expectedNameOfTv);

        detailProductPage.goToCartNotEmpty();

        var actualNameOfTv = cartPage.getActualNameOfFirstItemInCart();

        Assertions.assertEquals(expectedNameOfTv, actualNameOfTv);

        var priceOfOne = cartPage.getPriceOfFirstItem();
        System.out.println(priceOfOne);

        cartPage.plusOneItem(0);

        var priceOfTwo = cartPage.getPriceOfFirstItem();
        System.out.println(priceOfTwo);

        Assertions.assertEquals(priceOfOne * 2, priceOfTwo);

    }

}
