package locatorsPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class homePage {

    private final WebDriver driver;


    public homePage(WebDriver driver) {
        this.driver = driver;

    }

    // Загрузка главной страницы
    public static void waitHederHomePage(WebDriverWait wait) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("Header_Disclaimer__3VEni")));
    }

    // Логотип Яндекс
    private final By locatorLogoYandex = By.className("Header_LogoYandex__3TSOI");

    // Клик по лого Яндекс
    public void clickOnLogoYandex() {
        driver.findElement(locatorLogoYandex).click();
    }

    // Логотип Самокат
    private final By locatorLogoSamocat = By.cssSelector("html img[alt='Scooter']");

    // Клик по лого Самокат
    public void clickOnLogoSamocat() {
        driver.findElement(locatorLogoSamocat).click();
    }

    // Кнопка Заказать в хедере сверху справа
    private final By locatorButtonOrderHeder = By.xpath(".//div[@class = 'Header_Nav__AGCXC']/button[@class = 'Button_Button__ra12g']");

    // Клик по верхней кнопке Заказать
    public void clickOnButtonOrderHeder() {
        driver.findElement(locatorButtonOrderHeder).click();
    }

    // Кнопка Заказать по центру
    private final By locatorButtonOrderDown = By.xpath(".//div[@class = 'Home_FinishButton__1_cWm']/button");

    // Клик по кнопке заказать по центру
    public void clickButtonOrderDown() {

        WebElement questionElement = driver.findElement(locatorButtonOrderDown);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Home_FinishButton__1_cWm']/button")));

        questionElement.click();
    }
// выбор через Какую кнопку сделать заказ, по умолчанию сверху.
public void clickButtonOrderHederOrDown(String button) {

    if (button.equals("По центру")) {
        clickButtonOrderDown();
    } else {
        clickOnButtonOrderHeder();
    }

}
    //Статус заказа
    private final By locatorButtonStatusOrderHeder = By.className("Header_Link__1TAG7");

    // Клик по статусу заказа
    public void clickButtonStatusOrder() {
        driver.findElement(locatorButtonStatusOrderHeder).click();
    }

    // Поле ввода номера заказа
    private final By locatorInputStatusOrderHeder = By.xpath(".//div[@class = 'Header_SearchInput__3YRIQ']/div/input");

    // Ввод номера заказ
    public void sendNumberOrderStatus(String orderNumber) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorInputStatusOrderHeder);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Header_SearchInput__3YRIQ']/div/input")));
        element.sendKeys(orderNumber);
    }

    // Кнопка GO для проверки статуса заказ
    private final By locatorButtonGoStatusOrderHeder = By.xpath(".//div[@class = 'Header_SearchInput__3YRIQ']/button");

    // Клик по GO
    public void clickButtonGoOrderStatus() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorButtonGoStatusOrderHeder);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Header_SearchInput__3YRIQ']/button")));
        element.click();
    }

    // Картинка Заказа нет
    public static By getNotFoundImg() {
        return By.xpath(".//div[@class= 'Track_NotFound__6oaoY']/img");
    }

    // Скрол и клик по номеру вопроса
    public void scrollAndClickQuestionNumber(WebDriverWait wait, int number) {

        WebElement questionElement = driver.findElement(By.id("accordion__heading-" + (number - 1)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__heading-" + (number - 1))));
        questionElement.click();
    }

    // получение текста из ответа на вопрос по номеру.
    public String getTextAnswerNumber(WebDriverWait wait, int number) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-" + (number - 1))));
        return driver.findElement(By.id("accordion__panel-" + (number - 1))).getText();
    }
}








