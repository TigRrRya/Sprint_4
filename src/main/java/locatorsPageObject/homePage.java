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
        questionElement.click();
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

    // Вопросы о важном. Номер 1
    private final By locatorQuestionOne = By.id("accordion__heading-0");

    //Клик по вопросу номер 1
    public void clickQuestionOne() {
        WebElement questionElement = driver.findElement(locatorQuestionOne);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }

    // получение текста вопроса номер 1
    public String textQuestionOne() {
        WebElement element = driver.findElement(locatorQuestionOne);
        return element.getText();
    }

    // Ответ на 1 вопрос
    private final By locatorAnswerOne = By.xpath(".//*[@class = 'accordion__panel']");

    // Получение текста ответа номер 1
    public String textAnswerOne() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerOne);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("accordion__panel")));
        return element.getText();
    }

    // Вопросы о важном. Номер 2
    private final By locatorQuestionTwo = By.id("accordion__heading-1");

    //Клик по вопросу номер 2
    public void clickQuestionTwo() {
        WebElement questionElement = driver.findElement(locatorQuestionTwo);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }

    // получение текста вопроса номер 2
    public String textQuestionTwo() {
        WebElement element = driver.findElement(locatorQuestionTwo);
        return element.getText();
    }

    // Ответ на 2 вопрос
    private final By locatorAnswerTwo = By.id("accordion__panel-1");

    // Получение текста ответа номер 2
    public String textAnswerTwo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerTwo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-1")));
        return element.getText();
    }

    // Вопросы о важном. Номер 3
    private final By locatorQuestionThree = By.id("accordion__heading-2");

    //Клик по вопросу номер 3
    public void clickQuestionThree() {
        WebElement questionElement = driver.findElement(locatorQuestionThree);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }

    // получение текста вопроса номер 3
    public String textQuestionThree() {
        WebElement element = driver.findElement(locatorQuestionThree);
        return element.getText();
    }

    // Ответ на 3 вопрос
    private final By locatorAnswerThree = By.id("accordion__panel-2");

    // Получение текста ответа номер 3
    public String textAnswerThree() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerThree);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-2")));
        return element.getText();
    }

    // Вопросы о важном. Номер 4
    private final By locatorQuestionFour = By.id("accordion__heading-3");

    //Клик по вопросу номер 4
    public void clickQuestionFour() {
        WebElement questionElement = driver.findElement(locatorQuestionFour);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }

    // получение текста вопроса номер 4
    public String textQuestionFour() {
        WebElement element = driver.findElement(locatorQuestionFour);
        return element.getText();
    }

    // Ответ на 4 вопрос
    private final By locatorAnswerFour = By.id("accordion__panel-3");

    // Получение текста ответа номер 4
    public String textAnswerFour() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerFour);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-3")));
        return element.getText();
    }

    // Вопросы о важном. Номер 5
    private final By locatorQuestionFive = By.id("accordion__heading-4");

    //Клик по вопросу номер 5
    public void clickQuestionFive() {
        WebElement questionElement = driver.findElement(locatorQuestionFive);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }

    // получение текста вопроса номер 5
    public String textQuestionFive() {
        WebElement element = driver.findElement(locatorQuestionFive);
        return element.getText();
    }

    // Ответ на 5 вопрос
    private final By locatorAnswerFive = By.id("accordion__panel-4");

    // Получение текста ответа номер 5
    public String textAnswerFive() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerFive);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-4")));
        return element.getText();
    }

    // Вопросы о важном. Номер 6
    private final By locatorQuestionSix = By.id("accordion__heading-5");

    //Клик по вопросу номер 6
    public void clickQuestionSix() {
        WebElement questionElement = driver.findElement(locatorQuestionSix);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }

    // получение текста вопроса номер 6
    public String textQuestionSix() {
        WebElement element = driver.findElement(locatorQuestionSix);
        return element.getText();
    }

    // Ответ на 6 вопрос
    private final By locatorAnswerSix = By.id("accordion__panel-5");

    // Получение текста ответа номер 6
    public String textAnswerSix() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerSix);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-5")));
        return element.getText();
    }

    // Вопросы о важном. Номер 7
    private final By locatorQuestionSeven = By.id("accordion__heading-6");

    //Клик по вопросу номер 7
    public void clickQuestionSeven() {
        WebElement questionElement = driver.findElement(locatorQuestionSeven);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }

    // получение текста вопроса номер 7
    public String textQuestionSeven() {
        WebElement element = driver.findElement(locatorQuestionSeven);
        return element.getText();
    }

    // Ответ на 7 вопрос
    private final By locatorAnswerSeven = By.id("accordion__panel-6");

    // Получение текста ответа номер 7
    public String textAnswerSeven() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerSeven);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-6")));
        return element.getText();
    }

    // Вопросы о важном. Номер 8
    private final By locatorQuestionEight = By.id("accordion__heading-7");

    //Клик по вопросу номер 8
    public void clickQuestionEight() {
        WebElement questionElement = driver.findElement(locatorQuestionEight);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);
        questionElement.click();
    }

    // получение текста вопроса номер 8
    public String textQuestionEight() {
        WebElement element = driver.findElement(locatorQuestionEight);
        return element.getText();
    }

    // Ответ на 8 вопрос
    private final By locatorAnswerEight = By.id("accordion__panel-7");

    // Получение текста ответа номер 8
    public String textAnswerEightHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(locatorAnswerEight);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-7")));
        return element.getText();
    }









}








