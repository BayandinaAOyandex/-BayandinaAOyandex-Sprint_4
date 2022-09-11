package ru.praktikumservices.qascooter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    public MainPage (WebDriver driver){
        this.driver = driver;
    }

    WebDriver driver;

    //локаторы текстовых блоков
    private final By question1 = By.id("accordion__heading-0");
    private final By question2 = By.id("accordion__heading-1");
    private final By question3 = By.id("accordion__heading-2");
    private final By question4 = By.id("accordion__heading-3");
    private final By question5 = By.id("accordion__heading-4");
    private final By question6 = By.id("accordion__heading-5");
    private final By question7 = By.id("accordion__heading-6");
    private final By question8 = By.id("accordion__heading-7");

    //куки
    private final By closeCookieButton = By.className("App_CookieButton__3cvqF");



// локаторы кнопок заказа
    private final By orderHeaderButton = By.cssSelector(".Button_Button__ra12g");
    private final By orderPageButton =  By.className("Home_FinishButton__1_cWm");

    private final By orderEnterButton = By.xpath("//button[text()='Далее']");

    private final By orderButton = By.xpath("//button[(@class = 'Button_Button__ra12g Button_Middle__1CSJM')and (text()='Заказать') ]");
    private final By yesButton = By.xpath("//button[text()='Да']");


    // открытие страницы браузера
    public void openPage(){
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

// функции кликов на блоки вопросов
    public void clickQuestion1(){
        driver.findElement(question1).click();
    }
    public void clickQuestion2(){
        driver.findElement(question2).click();
    }
    public void clickQuestion3(){
        driver.findElement(question3).click();
    }
    public void clickQuestion4(){
        driver.findElement(question4).click();
    }
    public void clickQuestion5(){
        driver.findElement(question5).click();
    }
    public void clickQuestion6(){
        driver.findElement(question6).click();
    }
    public void clickQuestion7(){
        driver.findElement(question7).click();
    }
    public void clickQuestion8(){
        driver.findElement(question8).click();
    }


    //функции кликов на кнопки вопросов
    public void clickOrderHeaderButton(){
        driver.findElement(orderHeaderButton).click();
    }
    public void clickOrderPageButton(){
        driver.findElement(orderPageButton).click();

    }

    public void clickEnterOrderButton(){
        driver.findElement(orderEnterButton).click();

    }

    public void clickOrderButton(){
        driver.findElement(orderButton).click();

    }
    public void clickYesButton(){
        driver.findElement(yesButton).click();

    }


//скролл к вопросам
    public void scrollquestion(){
        WebElement element = driver.findElement(By.id("accordion__heading-7"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //скролл к кнопке Заказать
    public void scrollPageOrderButton(){
        WebElement element = driver.findElement(By.className("Home_StatusDescription__3WGl5"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }



    public void closeCookie(){
        driver.findElement(closeCookieButton).click();

    }
//получение текста ответа на вопросы
    public String textAnswer1(){
        return driver.findElement(By.id("accordion__panel-0")).getText();
    }
    public String textAnswer2(){
        return driver.findElement(By.id("accordion__panel-1")).getText();
    }

    public String textAnswer3(){
        return driver.findElement(By.id("accordion__panel-2")).getText();
    }

    public String textAnswer4(){
        return driver.findElement(By.id("accordion__panel-3")).getText();
    }

    public String textAnswer5(){
        return driver.findElement(By.id("accordion__panel-4")).getText();
    }

    public String textAnswer6(){
        return driver.findElement(By.id("accordion__panel-5")).getText();
    }

    public String textAnswer7(){
        return driver.findElement(By.id("accordion__panel-6")).getText();
    }

    public String textAnswer8(){
        return driver.findElement(By.id("accordion__panel-7")).getText();
    }


    //функции заполнения форм заказов
    public void inputNameOrder(){
    driver.findElement(By.xpath("//input[@placeholder='* Имя']")).sendKeys("Анна");
    }

    public void inputSurnameOrder(){
    driver.findElement(By.xpath("//input[@placeholder='* Фамилия']")).sendKeys("Баяндина");
    }

    public void inputAddressOrder(){
    driver.findElement(By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']")).sendKeys("Москва, ул. Проспект мира, д.63");
    }

    public void inputStationOrder(){
    driver.findElement(By.xpath("//input[@placeholder='* Станция метро']")).sendKeys("Буль");
        new WebDriverWait(driver, 4);
    driver.findElement(By.xpath("//button[@value='1']")).click();
    }

    public void inputNumberMobileOrder(){
    driver.findElement(By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']")).sendKeys("89779848300");
    }

    public void inputDateBring(){
        driver.findElement(By.xpath("//input[@placeholder='* Когда привезти самокат']")).sendKeys("23.09.2022");

    }
    public void inputComment(){
        driver.findElement(By.xpath("//input[@placeholder='Комментарий для курьера']")).sendKeys("23.09.2022");

    }

    public void inputRentalPeriod(){
        driver.findElement(By.className("Order_Content__bmtHS")).click();
        driver.findElement(By.className("Dropdown-placeholder")).click();


        driver.findElement(By.xpath("//div[@class='Dropdown-option'][2]")).click();

    }

    public void clickCheckboxColour(){
        driver.findElement(By.xpath("//input[@id='black']")).click();

    }
    public String textOrder(){
        return driver.findElement(By.className("Order_ModalHeader__3FDaJ")).getText();
    }





}
