import locatorsPageObject.orderForms;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;

@RunWith(Parameterized.class)
public class TestFormPageFieldValidation {
    // private FirefoxDriver driver;
    private ChromeDriver driver;
    private final String name;
    private final String familia;
    private final String address;
    private final String telephone;


    public TestFormPageFieldValidation(String name, String familia, String address, String telephone) {
        this.name = name;
        this.familia = familia;
        this.address = address;
        this.telephone = telephone;
    }

    @Before
    public void startUp() {
        // driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/order");

    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][]{
                {"Алекс", "Вандамович", "world ", "loce"},
                {"Sam", "Иванович", "Ничто и весь мир", "8800355355"},
                {"Ал23екс", "Вандамови4 ", "Нет четких данных по валидации 1123 ", "123123321321"},


        };
    }

    // Тест заказа
    @Test
    public void testOrderForms() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        orderForms orderForms = new orderForms(driver);

        orderForms.sendName(name);
        orderForms.sendFamilia(familia);
        orderForms.sendAddress(address);
        orderForms.sendTelephone(telephone);
        orderForms.clickButtonDalee();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        boolean isValidName = name.matches("(.*[a-zA-Z0-9\\s].*)|(.{16,})|(.{0,1})");
        if (isValidName) {
            try {
                WebElement errorMessageName = driver.findElement(By.xpath(".//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6' and text()='Введите корректное имя']"));
                System.out.println("Ошибка 'Введите корректное имя' найдена");
            } catch (NoSuchElementException e) {
                System.out.println("Элемент не найден на экране");
            }
        } else {
            System.out.println("Введено корректное Имя");
        }

        boolean isValidFamilia = familia.matches("(.*[a-zA-Z0-9\\s].*)|(.{16,})|(.{0,1})");
        if (isValidFamilia) {
            try {
                WebElement errorMessageFamilia = driver.findElement(By.xpath(".//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6' and text()='Введите корректную фамилию']"));
                System.out.println("Ошибка 'Введите корректную фамилию' найдена");
            } catch (NoSuchElementException e) {
                System.out.println("Элемент не найден на экране");
            }
        } else {
            System.out.println("Введена корректная Фамилия");
        }

        boolean isValidAddress = address.matches("(.*[a-zA-Z].*)(.{18,})|(.{0,6})");
        if (isValidAddress) {
            try {
                WebElement errorMessageAddress = driver.findElement(By.xpath(".//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6' and text()='Введите корректный адрес']"));
                System.out.println("Ошибка 'Введите корректный адрес' найдена");
            } catch (NoSuchElementException e) {
                System.out.println("Элемент не найден на экране");
            }
        } else {
            System.out.println("Введен корректный Адрес");
        }

        boolean isValidTelephone = !telephone.matches("^\\+?\\d{11,14}$");
        if (isValidTelephone) {
            try {
                WebElement errorMessageAddress = driver.findElement(By.xpath(".//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6' and text()='Введите корректный номер']"));
                System.out.println("Ошибка 'Введите корректный номер' найдена");
            } catch (NoSuchElementException e) {
                System.out.println("Элемент не найден на экране");
            }
        } else {
            System.out.println("Введен корректный Номер");
        }
    }

    @After
    public void teardown() {
        driver.quit();
    }
}









