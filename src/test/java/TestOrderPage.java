import locatorsPageObject.homePage;
import locatorsPageObject.orderForms;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class TestOrderPage {
    private ChromeDriver driver;

    // Тест заказа
    @Test public void testFaq1() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("Header_Disclaimer__3VEni")));
        homePage homePage = new homePage(driver);
        homePage.clickButtonOrderDown();

        orderForms orderForms = new orderForms(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Header__BZXOb")));
        orderForms.sendName("Александр");
        orderForms.sendFamilia("Шорин");
        orderForms.sendAdres("Советской 33");
        orderForms.sendMetro("Беговая");
        orderForms.sendTelefone("123456789163");
        orderForms.clickButtonDalee();
        orderForms.sendDataAndEnter("21.04.2015");
        orderForms.clickSrokArend();
        orderForms.clickBlackSamocat();
        orderForms.clickButtonZakaz();
        orderForms.clickButtonDa();
        orderForms.clickButtonStatusOrder();


    }}



