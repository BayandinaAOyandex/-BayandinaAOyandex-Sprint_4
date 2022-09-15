package Mozila.scooterTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.praktikumservices.qascooter.pages.MainPage;
import static org.junit.Assert.assertEquals;


public class OrderScooter {
    WebDriver driver;
    @Before
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @After
    public void quit() {
        driver.quit();
    }

    //тест заказа с кнопки Заказать на гл странице
    @Test
    public void orderPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        new WebDriverWait(driver, 3);
        mainPage.closeCookie();
        mainPage.scrollPageOrderButton();
        new WebDriverWait(driver, 3);
        mainPage.clickOrderPageButton();
        mainPage.inputNameOrder();
        mainPage.inputSurnameOrder();
        mainPage.inputAddressOrder();
        mainPage.inputStationOrder();
        mainPage.inputNumberMobileOrder();
        mainPage.clickEnterOrderButton();
        mainPage.inputDateBring();
        mainPage.inputRentalPeriod();
        mainPage.clickCheckboxColour();
        mainPage.clickOrderButton();
        mainPage.clickYesButton();
        String result = mainPage.textOrder();
        assertEquals("Заказ не оформился", "Заказ оформлен", result);
    }

    // тест заказа с кнопки Заказать в хедере гл страницы
    @Test
    public void orderHeader() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        new WebDriverWait(driver, 3);
        mainPage.clickOrderHeaderButton();
        new WebDriverWait(driver, 4);
        mainPage.closeCookie();
        mainPage.inputNameOrder();
        mainPage.inputSurnameOrder();
        mainPage.inputAddressOrder();
        mainPage.inputStationOrder();
        mainPage.inputNumberMobileOrder();
        mainPage.clickEnterOrderButton();
        mainPage.inputDateBring();
        mainPage.inputRentalPeriod();
        mainPage.clickCheckboxColour();
        mainPage.inputComment();
        mainPage.clickOrderButton();
        mainPage.clickYesButton();
        String result = mainPage.textOrder();
        assertEquals("Заказ не оформился", "Заказ оформлен", result);
    }
}
