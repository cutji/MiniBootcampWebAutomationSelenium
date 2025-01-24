package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.webautomation.pageobject.*;
import com.webautomation.pageobject.CartPage;
import com.webautomation.pageobject.CheckoutPage;
import com.webautomation.pageobject.ConfirmationPage;
import com.webautomation.pageobject.LoginPage;
import com.webautomation.pageobject.ProductPage;

@SuppressWarnings("unused")
public class Checkout {
    WebDriver driver;

     @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\MINIBOOTCAMP JAVA\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testCheckoutProduct() throws InterruptedException {
        // Scenario Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Thread.sleep(2000);

        // Scenario Add product
        Thread.sleep(1000);
        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart("Sauce Labs Backpack");
        productPage.goToCart();

        // Scenario checkout
        Thread.sleep(2000);
        CartPage cartPage = new CartPage(driver);
        cartPage.proceedToCheckout();

        // Scenario shipping
        Thread.sleep(3000);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillCheckoutDetails("Cut Jihan", "Riska", "180202");
        checkoutPage.finishCheckout();

        // Scenario confirmation
        Thread.sleep(2500);
        ConfirmationPage confirmationPage = new ConfirmationPage(driver);
        String confirmationMessage = confirmationPage.getConfirmationMessage();
        Assert.assertEquals(confirmationMessage, "Thank you for your order!");
    }


}