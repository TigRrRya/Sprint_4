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

    // Логотип Яндекс
    private final By locatorLogoYandexHomePage = By.className("Header_LogoYandex__3TSOI");
    // Клик по лого Яндекс
    public void clickOnLogoYandex() {
        driver.findElement(locatorLogoYandexHomePage).click();
    }

    // Логотип Самокат
    private final By locatorLogoSamocatHomePage = By.cssSelector("html img[alt='Scooter']");
    // Клик по лого Самокат
    public void clickOnLogoSamocat() {
        driver.findElement(locatorLogoSamocatHomePage).click();
    }

    // Кнопка Заказать в хедере сверху справа
    private final By locatorButtonOrderHederHomePage = By.xpath(".//div[@class = 'Header_Nav__AGCXC']/button[@class = 'Button_Button__ra12g']");
    // Клик по верхней кнопке Заказать
    public void clickOnButtonOrderHederHomePage() {
        driver.findElement(locatorButtonOrderHederHomePage).click();
    }

    // Кнопка Заказать по центру
    private final By locatorButtonOrderDownHomePage =  By.xpath(".//div[@class = 'Home_FinishButton__1_cWm]/button");
    // Клик по кнопке заказать по центру
    public void clickButtonOrderDownHomePage () {
        WebElement questionElement = driver.findElement(locatorButtonOrderDownHomePage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }

    //Статус заказа
    private final By locatorButtonStatusOrderHederHomePage =  By.className("Header_Link__1TAG7");
    // Клик по статусу заказа
    public void clickButtonStatusOrder(){
        driver.findElement(locatorButtonStatusOrderHederHomePage).click();
    }
    // Поле ввода номера заказа
    private final By locatorInputStatusOrderHederHomePage =  By.xpath(".//div[@class = 'Header_SearchInput__3YRIQ']/div/input");
    // Ввод номера заказ
    public void sendNumberOrderStatus(String orderNumber) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorInputStatusOrderHederHomePage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Header_SearchInput__3YRIQ']/div/input")));
        element.sendKeys(orderNumber);
    }
    // Кнопка GO для проверки статуса заказ
    private final By locatorButtonGoStatusOrderHederHomePage = By.xpath(".//div[@class = 'Header_SearchInput__3YRIQ']/button");
    // Клик по GO
    public void clickButtonGoOrderStatus () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorButtonGoStatusOrderHederHomePage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'Header_SearchInput__3YRIQ']/button")));
        element.click();
    }

    // Вопросы о важном. Номер 1
    private final By locatorQuestionOneHomePage =  By.id("accordion__heading-0");

    //Клик по вопросу номер 1
    public void clickQuestionOneHomePage() {
        WebElement questionElement = driver.findElement(locatorQuestionOneHomePage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }
    // получение текста вопроса номер 1
    public String textQuestionOneHomePage() {
        WebElement element = driver.findElement(locatorQuestionOneHomePage);
        return element.getText();
    }
    // Ответ на 1 вопрос
    private final By locatorAnswerOneHomePage = By.xpath(".//*[@class = 'accordion__panel']");
    // Получение текста ответа номер 1
    public String textAnswerOneHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerOneHomePage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("accordion__panel")));
        return element.getText();
    }

    // Вопросы о важном. Номер 2
    private final By locatorQuestionTwoHomePage =  By.id("accordion__heading-1");
    //Клик по вопросу номер 2
    public void clickQuestionTwoHomePage () {
        WebElement questionElement = driver.findElement(locatorQuestionTwoHomePage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }
    // получение текста вопроса номер 2
    public String textQuestionTwoHomePage() {
        WebElement element = driver.findElement(locatorQuestionTwoHomePage);
        return element.getText();
    }
    // Ответ на 2 вопрос
    private final By locatorAnswerTwoHomePage =  By.id("accordion__panel-1");
    // Получение текста ответа номер 2
    public String textAnswerTwoHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerTwoHomePage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-1")));
        return element.getText();
    }

    // Вопросы о важном. Номер 3
    private final By locatorQuestionThreeHomePage = By.id("accordion__heading-2");
    //Клик по вопросу номер 3
    public void clickQuestionThreeHomePage () {
        WebElement questionElement = driver.findElement(locatorQuestionThreeHomePage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }
    // получение текста вопроса номер 3
    public String textQuestionThreeHomePage() {
        WebElement element = driver.findElement(locatorQuestionThreeHomePage);
        return element.getText();
    }
    // Ответ на 3 вопрос
    private final By locatorAnswerThreeHomePage = By.id("accordion__panel-2");
    // Получение текста ответа номер 3
    public String textAnswerThreeHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerThreeHomePage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-2")));
        return element.getText();
    }

    // Вопросы о важном. Номер 4
    private final By locatorQuestionFourHomePage =  By.id("accordion__heading-3");
    //Клик по вопросу номер 4
    public void clickQuestionFourHomePage () {
        WebElement questionElement = driver.findElement(locatorQuestionFourHomePage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }
    // получение текста вопроса номер 4
    public String textQuestionFourHomePage() {
        WebElement element = driver.findElement(locatorQuestionFourHomePage);
        return element.getText();
    }
    // Ответ на 4 вопрос
    private final By locatorAnswerFourHomePage =  By.id("accordion__panel-3");
    // Получение текста ответа номер 4
    public String textAnswerFourHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerFourHomePage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-3")));
        return element.getText();
    }

    // Вопросы о важном. Номер 5
    private final By locatorQuestionFiveHomePage = By.id("accordion__heading-4");
    //Клик по вопросу номер 5
    public void clickQuestionFiveHomePage () {
        WebElement questionElement = driver.findElement(locatorQuestionFiveHomePage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }
    // получение текста вопроса номер 5
    public String textQuestionFiveHomePage() {
        WebElement element = driver.findElement(locatorQuestionFiveHomePage);
        return element.getText();
    }
    // Ответ на 5 вопрос
    private final By locatorAnswerFiveHomePage =  By.id("accordion__panel-4");
    // Получение текста ответа номер 5
    public String textAnswerFiveHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerFiveHomePage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-4")));
        return element.getText();
    }

    // Вопросы о важном. Номер 6
    private final By locatorQuestionSixHomePage = By.id("accordion__heading-5");
    //Клик по вопросу номер 6
    public void clickQuestionSixHomePage () {
        WebElement questionElement = driver.findElement(locatorQuestionSixHomePage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }
    // получение текста вопроса номер 6
    public String textQuestionSixHomePage() {
        WebElement element = driver.findElement(locatorQuestionSixHomePage);
        return element.getText();
    }
    // Ответ на 6 вопрос
    private final By locatorAnswerSixHomePage = By.id("accordion__panel-5");
    // Получение текста ответа номер 6
    public String textAnswerSixHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerSixHomePage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-5")));
        return element.getText();
    }

    // Вопросы о важном. Номер 7
    private final By locatorQuestionSevenHomePage = By.id("accordion__heading-6");
    //Клик по вопросу номер 7
    public void clickQuestionSevenHomePage () {
        WebElement questionElement = driver.findElement(locatorQuestionSevenHomePage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }
    // получение текста вопроса номер 7
    public String textQuestionSevenHomePage() {
        WebElement element = driver.findElement(locatorQuestionSevenHomePage);
        return element.getText();
    }
    // Ответ на 7 вопрос
    private final By locatorAnswerSevenHomePage = By.id("accordion__panel-6");
    // Получение текста ответа номер 7
    public String textAnswerSevenHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerSevenHomePage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-6")));
        return element.getText();
    }

    // Вопросы о важном. Номер 8
    private final By locatorQuestionEightHomePage = By.id("accordion__heading-7");
    //Клик по вопросу номер 8
    public void clickQuestionEightHomePage () {
        WebElement questionElement = driver.findElement(locatorQuestionEightHomePage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }
    // получение текста вопроса номер 8
    public String textQuestionEightHomePage() {
        WebElement element = driver.findElement(locatorQuestionEightHomePage);
        return element.getText();
    }
    // Ответ на 8 вопрос
    private final By locatorAnswerEightHomePage = By.id("accordion__panel-7");
    // Получение текста ответа номер 8
    public String textAnswerEightHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerEightHomePage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-7")));
        return element.getText();
    }









}








