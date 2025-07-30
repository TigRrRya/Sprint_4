import locatorsPageObject.homePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestHomePage {
    private ChromeDriver driver;

// Тест Вопросов и ответов
    @Test public void testFaq1(/*string number, string expectedText*/) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("Header_Disclaimer__3VEni")));
        homePage homePage = new homePage(driver);
        homePage.clickQuestionEight();
        String text = homePage.textAnswerEightHomePage();
        System.out.println(text);
        String expectedText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertEquals("Текст не совпадает",expectedText, text);

    }

//Тест лого Яндекс
    @Test
    public void testLogoYandex() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("Header_Disclaimer__3VEni")));
        homePage homePage = new homePage(driver);
        String currentWindowHandle = driver.getWindowHandle();
        homePage.clickOnLogoYandex();
        wait.until(webDriver -> webDriver.getWindowHandles().size() > 1);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(currentWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        assertEquals("Открылось что-то не то","https://yandex.ru", driver.getCurrentUrl());




    }

// Тест лого Самокат
    @Test
    public void testLogoSamocat() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        homePage homePage = new homePage(driver);
        homePage.clickOnButtonOrderHeder();
        homePage.clickOnLogoSamocat();
        String expectedUrl = "https://qa-scooter.praktikum-services.ru/";
        String actualUrl = driver.getCurrentUrl();
        assertEquals("Ожидается, что после клика вернёмся на главную страницу",expectedUrl, actualUrl);
    }

// Тест не верного заказ

@Test
public void testFailedOrderStatus() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
    driver = new ChromeDriver(options);
    driver.get("https://qa-scooter.praktikum-services.ru/");

    homePage homePage = new homePage(driver);
    homePage.clickButtonStatusOrder();
    homePage.sendNumberOrderStatus("Не существующий номер ");
    homePage.clickButtonGoOrderStatus();

    // Задержка для загрузки страницы, картинка с нот фоунд открывается и при верном номере заказа.
    // И по этому тест проходит проверку для верного заказа.

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    driver.findElement(By.className("Track_NotFound__6oaoY"));


}


    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }



}

