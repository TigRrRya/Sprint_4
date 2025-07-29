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

public class testHomePage {
    private ChromeDriver driver;


    @Test public void testFaq1() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("Header_Disclaimer__3VEni")));
        homePage homePage = new homePage(driver);
        String currentWindowHandle = driver.getWindowHandle();

        homePage.clickQuestionOneHomePage();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("accordion__panel")));
        String text = homePage.textAnswerOneHomePage();
        System.out.println(text);
        String expectedText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

        if (text.equals(expectedText)) {
            System.out.println("Тексты совпадают");
        } else {
            System.out.println("Тексты не совпадают");
        }

    }


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
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(currentWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        assertEquals("Открылось что-то не то","yandex.ru", driver.getCurrentUrl());




    }


    @Test
    public void testLogoSamocat() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        homePage homePage = new homePage(driver);

        homePage.clickOnButtonOrderHederHomePage();
        homePage.clickOnLogoSamocat();
        String expectedUrl = "https://qa-scooter.praktikum-services.ru/";
        String actualUrl = driver.getCurrentUrl();
        assertEquals("Ожидается, что после клика вернёмся на главную страницу",expectedUrl, actualUrl);
    }
}
