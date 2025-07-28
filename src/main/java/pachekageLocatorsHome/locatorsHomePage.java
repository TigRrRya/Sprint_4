package pachekageLocatorsHome;

import org.openqa.selenium.By;


public class locatorsHomePage {

    // Хедер главной страницы
    public  By hederHomePage = By.className("Header_Header__214zg");
    //Хедер логотипов сайта на главной странице
    public  By locatorHederLogoHomePage = By.className("Header_Logo__23yGT");
    // Логотип Яндекс
    public  By locatorLogoYandexHomePage = By.className("Header_LogoYandex__3TSOI");
    // Логотип Самокат
    public  By locatorLogoSamocatHomePage = By.cssSelector("html img[alt='Scooter']");
    // Дисклеймер на главной странице "Учебный тренажер"
    public  By locatorHederDisclaimerHomePage = By.className("Header_Disclaimer__3VEni");
    // Хедер навигации на главной станице
    public  By locatorHederNavigatorHomePage = By.className("Header_Nav__AGCXC");
    // Кнопка "Заказать" в хедере главной странице
    public  By locatorButtonOrderHederHomePage = By.xpath(".//div[@class = 'Header_Nav__AGCXC']/button[@class = 'Button_Button__ra12g']");
    // Кнопка "Статус заказа" в хедере главной станице
    public  By locatorButtonStatusOrderHederHomePage = By.className("Header_Link__1TAG7");
    // Поле ввода номера заказа
    public  By locatorInputStatusOrderHederHomePage = By.xpath(".//div[@class = 'Header_SearchInput__3YRIQ']/div/input");
    // Кнопка "Go" проверка статуса заказа
    public  By locatorButtonGoStatusOrderHederHomePage = By.xpath(".//div[@class = 'Header_SearchInput__3YRIQ']/button");

    // Заголовок страницы
    public  By locatorHeadlineHomePage = By.className("Home_Header__iJKdX");
    // Динамическое краткое описание часть 1.
    public  By locatorDynamicShortDescriptionOneHomePage = By.xpath(".//div[@class = 'Home_Header__iJKdX']/div[@class = 'Home_SubHeader__zwi_E' and contains(text(), 'Привезём его прямо к вашей двери')]");
    // Динамическое краткое описание часть 2.
    public  By locatorDynamicShortDescriptionTwoHomePage = By.xpath(".//div[@class = 'Home_Header__iJKdX']/div[@class = 'Home_SubHeader__zwi_E' and contains(text(), 'Он лёгкий и с мощными колёсами— самое то')]");
    // Картинка белого самоката
    public  By locatorWhiteSamocatImgHomePage = By.cssSelector("div[class='Home_BluePrint__TGX2n'] img[alt='Scooter blueprint']");
    // Картинка черного самоката
    public  By locatorBlackSamocatImgHomePage = By.cssSelector("div[class='Home_Scooter__3YdJy'] img[alt='Scooter blueprint']");
    // Стрелочка скрола вниз
    public  By locatorScrollDownHomePage = By.cssSelector("#root > div > div > div.Home_FirstPart__3g6vG > div.Home_ArrowDown__fnDme.Home_Animated__17o7s.Home_Bounce__O19_v");

    // Общее описание модели самоката
    public  By locatorCharacteristicsSamocatHomePage = By.className("Home_Table__2kPxP");
    // Модель самоката
    public  By locatorModelSamocatHomePage = By.xpath(".//div[@class = 'Home_Column__xlKDK' and contains(text(), 'Модель Toxic PRO')]");
    // Текс "Максимальная скорость" самоката
    public  By locatorTextMaxSpeedSamocatHomePage = By.xpath(".//div[@class = 'Home_Column__xlKDK' and contains(text(), 'Максимальная скорость')]");
    // Значение максимальной скорости
    public  By locatorValueMaxSpeedSamocatHomePage = By.xpath(".//div[@class = 'Home_Column__xlKDK' and contains(text(), '40 км/ч')]");
    // Текст "Проедет без подзарядки" (НА САЙТЕ ОПЕЧАТКА!)
    public  By locatorTextDistanceSamocatHomePage = By.xpath(".//div[@class = 'Home_Column__xlKDK' and contains(text(), 'Проедет без поздарядки')]");
    // Значение расстояния
    public  By locatorValueDistanceSamocatHomePage = By.xpath(".//div[@class = 'Home_Column__xlKDK' and contains(text(), '80 км')]");
    // Текст "Выдерживает вес"
    public  By locatorTextWightSamocatHomePage = By.xpath(".//div[@class = 'Home_Column__xlKDK' and contains(text(), 'Выдерживает вес')]");
    // Значение веса
    public  By locatorValueWightSamocatHomePage = By.xpath(".//div[@class = 'Home_Column__xlKDK' and contains(text(), '120 кг')]");

    // Блок информации "Как это работает"
    public  By locatorBlockInfoHomePage = By.className("Home_ThirdPart__LSTEE");
    // Текст "Как это работает"
    public  By locatorTextBlockInfoHomePage = By.xpath(".//div[@class = 'Home_SubHeader__zwi_E' and contains(text(), 'Как это работает')]");
    // Пункт 1. Заголовок и описание
    public  By locatorHeadlineBlockInfoOneHomePage = By.xpath(".//div[@class = 'Home_Status__YkfmH' and contains(text(), 'Заказываете самокат')]");
    public  By locatorTextBlockInfoOneHomePage = By.cssSelector("#root > div > div > div.Home_ThirdPart__LSTEE > div.Home_RoadMap__2tal_ > div:nth-child(1) > div.Home_StatusInfo__HrjoZ > div.Home_StatusDescription__3WGl5");
    // Пункт 2. Заголовок и описание
    public  By locatorHeadlineBlockInfoTwoHomePage = By.xpath(".//div[@class = 'Home_Status__YkfmH' and contains(text(), 'Курьер привозит самокат')]");
    public  By locatorTextBlockInfoTwoHomePage = By.xpath(".//div[@class = 'Home_StatusDescription__3WGl5' and contains(text(), 'А вы — оплачиваете аренду')]");
    // Пункт 3. Заголовок и описание
    public  By locatorHeadlineBlockInfoThreeHomePage = By.xpath(".//div[@class = 'Home_Status__YkfmH' and contains(text(), 'Катаетесь')]");
    public  By locatorTextBlockInfoThreeHomePage = By.xpath(".//div[@class = 'Home_StatusDescription__3WGl5' and contains(text(), 'Сколько часов аренды осталось — видно на сайте')]");
    // Пункт 4. Заголовок и описание
    public  By locatorHeadlineBlockInfoFourHomePage = By.xpath(".//div[@class = 'Home_Status__YkfmH' and contains(text(), 'Курьер забирает самокат')]");
    public  By locatorTextBlockInfoFourHomePage = By.xpath(".//div[@class = 'Home_StatusDescription__3WGl5' and contains(text(), 'Когда аренда заканчивается')]");

    // Кнопка "Заказать" по центру страницы после блока информации
    public  By locatorButtonOrderDownHomePage = By.xpath(".//div[@class = 'Home_FinishButton__1_cWm]/button");

    // Блок "Вопросы о важном"
    public  By locatorBlockFaqHomePage = By.className("Home_FourPart__1uthg");
    // Текст "Вопросы о важном"
    public  By locatorTextBlockFaqHomePage = By.xpath(".//div[@class = 'Home_SubHeader__zwi_E' and contains(text(), 'Вопросы о важном')]");
    // вопрос номер 1 и ответ на него.
    public  By locatorQuestionOneHomePage = By.id("accordion__heading-0");
    public  By locatorAnswerOneHomePage = By.id("accordion__panel-0");
    // вопрос номер 2 и ответ на него.
    public  By locatorQuestionTwoHomePage = By.id("accordion__heading-1");
    public  By locatorAnswerTwoHomePage = By.id("accordion__panel-1");
    // вопрос номер 3 и ответ на него.
    public  By locatorQuestionThreeHomePage = By.id("accordion__heading-2");
    public  By locatorAnswerThreeHomePage = By.id("accordion__panel-2");
    // вопрос номер 4 и ответ на него.
    public  By locatorQuestionFourHomePage = By.id("accordion__heading-3");
    public  By locatorAnswerFourHomePage = By.id("accordion__panel-3");
    // вопрос номер 5 и ответ на него.
    public  By locatorQuestionFiveHomePage = By.id("accordion__heading-4");
    public  By locatorAnswerFiveHomePage = By.id("accordion__panel-4");
    // вопрос номер 6 и ответ на него.
    public  By locatorQuestionSixHomePage = By.id("accordion__heading-5");
    public  By locatorAnswerSixHomePage = By.id("accordion__panel-5");
    // вопрос номер 7 и ответ на него.
    public  By locatorQuestionSevenHomePage = By.id("accordion__heading-6");
    public  By locatorAnswerSevenHomePage = By.id("accordion__panel-6");
    // вопрос номер 8 и ответ на него.
    public  By locatorQuestionEightHomePage = By.id("accordion__heading-7");
    public  By locatorAnswerEightHomePage = By.id("accordion__panel-7");


}