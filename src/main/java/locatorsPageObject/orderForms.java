package locatorsPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class orderForms {

    private final WebDriver driver;
    public orderForms(WebDriver driver) {
        this.driver = driver;
    }

    //Локатор поля Имя
    private final By locatorInputName = By.xpath(".//input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN' and  @placeholder = '* Имя']");
    // Ввод в поле Имя
    public void sendName(String Name) {
        driver.findElement(locatorInputName).sendKeys(Name);
    }

    // Локатор поля Фамилия
    private final By locatorInputFamilia = By.xpath(".//input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN' and  @placeholder = '* Фамилия']");
    // Ввод в поле Фамилия
    public void sendFamilia(String Familia){
        driver.findElement(locatorInputFamilia).sendKeys(Familia);
    }

    //Локатор поля Адрес
    private final By locatorInputAdres = By.xpath(".//input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN' and  @placeholder = '* Адрес: куда привезти заказ']");
    // Ввод в поле Адрес
    public void sendAdres(String Adres) {
        driver.findElement(locatorInputAdres).sendKeys(Adres);

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
    private final By locatorInputTelefon = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    // Ввод Телефона
    public void sendTelefone(String telefone) {
        driver.findElement(locatorInputTelefon).sendKeys(telefone);
    }

    // Локатор кнопки Далее в форме заказа
    private final By locatorButtonDalee = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    // Клик на кнопку Далее
    public void clickButtonDalee() {
        driver.findElement(locatorButtonDalee).click();
    }

    // Локатор поля Когда привезти самокат
    private final By locatorInputWhen = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    // Ввод даты через дд.мм.гггг
    public void sendDataAndEnter(String data) {

        driver.findElement(locatorInputWhen).sendKeys(data);
        driver.findElement(locatorInputWhen).sendKeys(Keys.ENTER);



    }

    // Локатор Срок аренды
    private final By locatorSrokArend = By.xpath(".//div[@class = 'Dropdown-placeholder']");
    // Выбор срока аренды в 5 суток
    public void clickSrokArend() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        driver.findElement(locatorSrokArend).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Dropdown-menu']")));
        driver.findElement(By.xpath(".//div[@class = 'Dropdown-option' and contains(text(), 'пятеро суток')]")).click();
    }

    // Локатор черного цвета самоката
    private final By locatorBlackSamocat = By.xpath(".//label[@for = 'black']");
    // Клик по черному самокату
    public void clickBlackSamocat() {
        driver.findElement(locatorBlackSamocat).click();
    }

    // Локатор серого цвета самоката
    private final By locatorGreySamocat = By.xpath(".//label[@for = 'grey']");
    // Клик по серому самокату
    public void clickGreySamocat() {
        driver.findElement(locatorGreySamocat).click();
    }

    // Локатор кнопки Заказать в форме заказа
    private final By locatorButtonZakaz = By.xpath(".//button[@class= 'Button_Button__ra12g Button_Middle__1CSJM' and contains(text(), 'Заказать')]");
    // Клик по кнопке Заказать
    public void clickButtonZakaz(){
        driver.findElement(locatorButtonZakaz).click();
    }

    // Локатор кнопки Да
    private final By locatorButtonDa = By.xpath(".//button[@class= 'Button_Button__ra12g Button_Middle__1CSJM' and contains(text(), 'Да')]");
    // Клик по кнопке ДА
    public void clickButtonDa(){
        driver.findElement(locatorButtonDa).click();
    }

    //Локатор кнопки Посмотреть статус заказ
    private final By locatorButtonStatusOrder = By.xpath(".//div[@class = 'Order_NextButton__1_rCA']/button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    // Клик по кнопке Посмотреть статус заказ
    public void clickButtonStatusOrder (){
        driver.findElement(locatorButtonStatusOrder).click();
    }



}
