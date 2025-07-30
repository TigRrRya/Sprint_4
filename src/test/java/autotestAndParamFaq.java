
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


@RunWith(Parameterized.class)
public class autotestAndParamFaq {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("Header_Disclaimer__3VEni")));

    }

    private final int number;
    private final String expectedText;

    public autotestAndParamFaq(int number, String expectedText) {
        this.number = number;
        this.expectedText = expectedText;
    }

    @Parameterized.Parameters
    public static Object[][] getFaq() {
        return new Object[][]{
                {1, "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {2, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {3, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {4, "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {5, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {6, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {7, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {8, "Да, обязательно. Всем самокатов! И Москве, и Московской области."},};
    }

    @Test
    public void autotestAndParamFaq() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement questionElement = driver.findElement(By.id("accordion__heading-" + (number - 1)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-" + (number - 1))));
        String actualText = driver.findElement(By.id("accordion__panel-" + (number - 1))).getText();

        System.out.println(actualText);
        Assert.assertEquals("Текст не совпадает с заданным", expectedText, actualText);
    }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }

}


