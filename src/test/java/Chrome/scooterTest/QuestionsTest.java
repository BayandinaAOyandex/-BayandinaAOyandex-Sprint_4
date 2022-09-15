package Chrome.scooterTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.praktikumservices.qascooter.pages.MainPage;
import org.junit.Test;
import org.junit.After;

import static org.junit.Assert.assertEquals;

public class QuestionsTest {
    WebDriver driver;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void quit() {
        driver.quit();
    }

    // тесты блока вопросов
    @Test
    public void clickOnQuestion1() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        new WebDriverWait(driver, 3);
        mainPage.closeCookie();
        mainPage.scrollquestion();
        mainPage.clickQuestion1();
        new WebDriverWait(driver, 7);
        String result = mainPage.textAnswer1();
        assertEquals("Текст ответа не соответствует ожидаемому", "Сутки — 400 рублей. Оплата курьеру — наличными или картой.", result);
    }

    @Test
    public void clickOnQuestion2() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        new WebDriverWait(driver, 3);
        mainPage.closeCookie();
        mainPage.scrollquestion();
        mainPage.clickQuestion2();
        new WebDriverWait(driver, 7);
        String result = mainPage.textAnswer2();
        assertEquals("Текст ответа не соответствует ожидаемому", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", result);
    }

    @Test
    public void clickOnQuestion3() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        new WebDriverWait(driver, 3);
        mainPage.closeCookie();
        mainPage.scrollquestion();
        mainPage.clickQuestion3();
        new WebDriverWait(driver, 7);
        String result = mainPage.textAnswer3();
        assertEquals("Текст ответа не соответствует ожидаемому", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", result);
    }

    @Test
    public void clickOnQuestion4() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        new WebDriverWait(driver, 3);
        mainPage.closeCookie();
        mainPage.scrollquestion();
        mainPage.clickQuestion4();
        new WebDriverWait(driver, 7);
        String result = mainPage.textAnswer4();
        assertEquals("Текст ответа не соответствует ожидаемому", "Только начиная с завтрашнего дня. Но скоро станем расторопнее.", result);
    }

    @Test
    public void clickOnQuestion5() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        new WebDriverWait(driver, 3);
        mainPage.closeCookie();
        mainPage.scrollquestion();
        mainPage.clickQuestion5();
        new WebDriverWait(driver, 7);
        String result = mainPage.textAnswer5();
        assertEquals("Текст ответа не соответствует ожидаемому", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", result);
    }

    @Test
    public void clickOnQuestion6() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        new WebDriverWait(driver, 3);
        mainPage.closeCookie();
        mainPage.scrollquestion();
        mainPage.clickQuestion6();
        new WebDriverWait(driver, 7);
        String result = mainPage.textAnswer6();
        assertEquals("Текст ответа не соответствует ожидаемому", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", result);
    }

    @Test
    public void clickOnQuestion7() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        new WebDriverWait(driver, 3);
        mainPage.closeCookie();
        mainPage.scrollquestion();
        mainPage.clickQuestion7();
        new WebDriverWait(driver, 7);
        String result = mainPage.textAnswer7();
        assertEquals("Текст ответа не соответствует ожидаемому", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", result);
    }

    @Test
    public void clickOnQuestion8() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        new WebDriverWait(driver, 3);
        mainPage.closeCookie();
        mainPage.scrollquestion();
        mainPage.clickQuestion8();
        new WebDriverWait(driver, 7);
        String result = mainPage.textAnswer8();
        assertEquals("Текст ответа не соответствует ожидаемому", "Да, обязательно. Всем самокатов! И Москве, и Московской области.", result);
    }
}
