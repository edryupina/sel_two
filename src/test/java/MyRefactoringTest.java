import org.junit.Test;
import pages.MainPage;
import pages.SendAppPage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyRefactoringTest extends BaseTest {

    @Test
    public void testInsurance() throws Exception {
            driver.get(baseUrl + "/");
            MainPage mainPage = new MainPage(driver);
            mainPage.selectMenuItem("Раздел Застраховать себя  и имущество");
            mainPage.selectInsuranceItem("Страхование путешественников");

            new DMSPage(driver).waitSendAppClickable();
            SendAppPage sendAppPage = new SendAppPage(driver);
            String actualTitle = sendAppPage.title.getText();
            String expectedTitle = "Минимальная";
            assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
            actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
            sendAppPage.fillField("Фамилия", "Иванов");
            sendAppPage.fillField("Имя", "Иван");
            sendAppPage.fillField("Отчество", "Иванович");
            sendAppPage.fillField("Эл. почта", "222222ыыыыы");
            sendAppPage.fillField("Комментарии", "test");
            sendAppPage.fillField("Регион", "Москва");
            sendAppPage.sendButton.click();
           // sendAppPage.checkFieldErrorMessage("Эл. почта", "Введите адрес электронной почты");
    }
}

