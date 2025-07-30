
import locatorsPageObject.homePage;
import locatorsPageObject.orderForms;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@RunWith(Parameterized.class)
public class TestOrderPage {
    private ChromeDriver driver;
    private final String name;
    private final String familia;
    private final String adres;
    private final String metro;
    private final String telefone;
    private final String dataAndEnter;
    private final String srokArend;
    private final String colorSamocat;

    public TestOrderPage(String name, String familia, String adres, String metro, String telefone, String dataAndEnter, String srokArend, String colorSamocat) {
        this.name = name;
        this.familia = familia;
        this.adres = adres;
        this.metro = metro;
        this.telefone = telefone;
        this.dataAndEnter = dataAndEnter;
        this.srokArend = srokArend;
        this.colorSamocat = colorSamocat;
    }

    @Before
    public void startUp() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {"Александр", "Шорин","Советской 33" ,"Беговая","123456789163","21.10.2025" ,"7","Черный"},
                {"Иван", "Иванов", "Мир 12", "Пуш", "987654321654", "29.12.2025", "3", "Любой"},


        };
    }

    // Тест заказа
    @Test
    public void testFaq1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("Header_Disclaimer__3VEni")));
        homePage homePage = new homePage(driver);
        homePage.clickButtonOrderDown();
        orderForms orderForms = new orderForms(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Header__BZXOb")));
        orderForms.sendName(name);
        orderForms.sendFamilia(familia);
        orderForms.sendAdres(adres);
        orderForms.sendMetro(metro);
        orderForms.sendTelefone(telefone);
        orderForms.clickButtonDalee();
        orderForms.sendDataAndEnter(dataAndEnter);
        orderForms.clickSrokArend(srokArend);
        orderForms.clickColorSamocat(colorSamocat);
        orderForms.clickButtonZakaz();
        orderForms.clickButtonDa();
        Assert.assertTrue(orderForms.truOrFalseButtonStatusOrder());
    }
    @After
    public void teardown() {
        driver.quit();
    }
}

