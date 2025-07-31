package locatorsPageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class orderForms {

    private final WebDriver driver;

    public orderForms(WebDriver driver) {
        this.driver = driver;
    }

    public static void waitHederOrderForms(WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Header__BZXOb")));
    }

    //Локатор поля Имя
    public final By locatorInputName = By.xpath(".//input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN' and  @placeholder = '* Имя']");

    // Ввод в поле Имя
    public void sendName(String Name) {
        driver.findElement(locatorInputName).sendKeys(Name);
    }

    // Локатор поля Фамилия
    public final By locatorInputFamilia = By.xpath(".//input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN' and  @placeholder = '* Фамилия']");

    // Ввод в поле Фамилия
    public void sendFamilia(String Familia) {
        driver.findElement(locatorInputFamilia).sendKeys(Familia);
    }

    //Локатор поля Адрес
    private final By locatorInputAddress = By.xpath(".//input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN' and  @placeholder = '* Адрес: куда привезти заказ']");

    // Ввод в поле Адрес
    public void sendAddress(String address) {
        driver.findElement(locatorInputAddress).sendKeys(address);

    }

    //Локатор поля Метро
    private final By locatorInputMetro = By.xpath(".//input[@class = 'select-search__input']");

    // выбор в поле метро
    public void sendMetro(String Metro) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        driver.findElement(locatorInputMetro).click();
        driver.findElement(locatorInputMetro).sendKeys(Metro);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'select-search__select']")));
        driver.findElement(By.xpath("//li")).click();

    }

    // Локатор поля Телефон
    private final By locatorInputTelephone = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");

    // Ввод Телефона
    public void sendTelephone(String telephone) {
        driver.findElement(locatorInputTelephone).sendKeys(telephone);
    }

    // Локатор кнопки Далее в форме заказа
    private final By locatorButtonDalee = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");

    // Клик на кнопку Далее
    public void clickButtonDalee() {
        driver.findElement(locatorButtonDalee).click();
    }

    // Локатор поля Когда привезти самокат
    private final By locatorInputWhen = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    // Ввод даты через ДД.ММ.ГГГГ
    public void sendDataAndEnter(String data) {

        driver.findElement(locatorInputWhen).sendKeys(data);
        driver.findElement(locatorInputWhen).sendKeys(Keys.ENTER);
    }

    // Локатор Срок аренды
    private final By locatorRentalPeriod = By.xpath(".//div[@class = 'Dropdown-placeholder']");

    // Выбор срока аренды в 5 суток
    public void clickRentalPeriod(String dey) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        driver.findElement(locatorRentalPeriod).click();
        switch (dey) {
            case "1":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Dropdown-menu']")));
                driver.findElement(By.xpath(".//div[@class = 'Dropdown-option' and contains(text(), 'сутки')]")).click();
                break;
            case "2":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Dropdown-menu']")));
                driver.findElement(By.xpath(".//div[@class = 'Dropdown-option' and contains(text(), 'двое суток')]")).click();
                break;
            case "3":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Dropdown-menu']")));
                driver.findElement(By.xpath(".//div[@class = 'Dropdown-option' and contains(text(), 'трое суток')]")).click();
                break;
            case "4":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Dropdown-menu']")));
                driver.findElement(By.xpath(".//div[@class = 'Dropdown-option' and contains(text(), 'четверо суток')]")).click();
                break;
            case "5":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Dropdown-menu']")));
                driver.findElement(By.xpath(".//div[@class = 'Dropdown-option' and contains(text(), 'пятеро суток')]")).click();
                break;
            case "6":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Dropdown-menu']")));
                WebElement element6 = driver.findElement((By.xpath(".//div[@class = 'Dropdown-option' and contains(text(), 'шестеро суток')]")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element6);
                driver.findElement(By.xpath(".//div[@class = 'Dropdown-option' and contains(text(), 'шестеро суток')]")).click();
                break;
            case "7":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Dropdown-menu']")));
                WebElement element7 = driver.findElement((By.xpath(".//div[@class = 'Dropdown-option' and contains(text(), 'семеро суток')]")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element7);
                driver.findElement(By.xpath(".//div[@class = 'Dropdown-option' and contains(text(), 'семеро суток')]")).click();
                break;
        }
    }

    // Локатор черного цвета самоката
    private final By locatorBlackScooter = By.xpath(".//label[@for = 'black']");

    // Локатор серого цвета самоката
    private final By locatorGreyScooter = By.xpath(".//label[@for = 'grey']");

    // Выбор самоката, по стандарту всегда серый.
    public void clickColorScooter(String color) {

        if (color.equals("Черный")) {
            driver.findElement(locatorBlackScooter).click();
        } else {
            driver.findElement(locatorGreyScooter).click();
        }

    }


    // Локатор кнопки Заказать в форме заказа
    private final By locatorButtonZakaz = By.xpath(".//button[@class= 'Button_Button__ra12g Button_Middle__1CSJM' and contains(text(), 'Заказать')]");

    // Клик по кнопке Заказать
    public void clickButtonZakaz() {
        driver.findElement(locatorButtonZakaz).click();
    }

    // Локатор кнопки Да
    private final By locatorButtonDa = By.xpath(".//button[@class= 'Button_Button__ra12g Button_Middle__1CSJM' and contains(text(), 'Да')]");

    // Клик по кнопке ДА
    public void clickButtonDa() {
        driver.findElement(locatorButtonDa).click();
    }

    //Локатор кнопки "Посмотреть статус заказ"
    private final By locatorButtonStatusOrder = By.xpath(".//div[@class = 'Order_NextButton__1_rCA']/button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");

    // Проверка наличия кнопки Статуса заказа на экране
    public boolean truOrFalseButtonStatusOrder() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Order_NextButton__1_rCA']/button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']")));
        WebElement buttonStatusOrder = driver.findElement(locatorButtonStatusOrder);

        return buttonStatusOrder.isDisplayed();
    }


}
