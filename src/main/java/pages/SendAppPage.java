package pages;

//import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.junit.Assert;

public class SendAppPage extends BasePage {
     @FindBy(xpath = "//h4[@class='modal-title']/b[text()]")
     public WebElement title;

     @FindBy(name = "insured0_surname")
     WebElement insured0_surname;
     @FindBy(name = "insured0_name")
     WebElement insured0_name;
     @FindBy(name = "insured0_birthDate")
     WebElement insured0_birthDate;
     @FindBy(name = "surname")
     WebElement surname;
     @FindBy(name = "name")
     WebElement name;
     @FindBy(name = "middlename")
     WebElement middlename;
     @FindBy(name = "birthDate")
     WebElement birthDate;
    @FindBy(name = "female")
    WebElement female;
   //  driver.findElement(By.name("female")).click();
     @FindBy(name = "passport_series")
     WebElement passport_series;
     @FindBy(name = "passport_number")
     WebElement passport_number;
     @FindBy(name = "issueDate")
     WebElement issueDate;
     @FindBy(name = "issuePlace")
     WebElement issuePlace;
     @FindBy(name = "phone")
     WebElement phone;
     @FindBy(name = "email")
     WebElement email;

//10. Нажать продолжить
      @FindBy(xpath = "//span [contains(text(),'Продолжить')]")
      public WebElement sendButton;
     // public WebElement continueBatton;
//11.   Проверить, что появилось сообщение - Заполнены не все обязательные поля
      @FindBy(xpath = "//div [text()='Заполнены не все обязательные поля']" )
      //public WebElement alertText;
      public WebElement Textabout;

    public SendAppPage(WebDriver driver) {
         PageFactory.initElements(driver, this);
         (new WebDriverWait(driver, 10))
         .until(ExpectedConditions.visibilityOf(title));
         this.driver = driver;
         }
             public void fillField(String fieldName, String value){
                 switch (fieldName){
//8. На вкладке Оформить заполнить поля:
//•  Фамилию и Имя, Дату рождения застрахованных
                         case  "Fadeewa": fillField(insured0_surname, value);
                                 break;
                         case  "Ekaterina": fillField(insured0_name, value);
                                 break;
                         case  "23.03.1985": fillField(insured0_birthDate, value);
                                 break;
//• Данные страхователя: Фамилия, Имя, Отчество, Дата рождения, Пол ((((сообразила как пол сменить :-))))))))
                     case  "Фадеева": fillField(surname, value);
                         break;
                     case  "Екатерина": fillField(name, value);
                         break;
                     case  "Игоревна": fillField(middlename, value);
                         break;
                     case  "25.03.1985": fillField(birthDate, value);
                         break;
                     case  "1": fillField(female, value);
                         break;
//•       Паспортные данные
                     case  "3609": fillField(passport_series, value);
                         break;
                     case  "123456": fillField(passport_number, value);
                         break;
                     case  "01.01.2010": fillField(issueDate, value);
                         break;
                     case  "ОУФМС России по Москве": fillField(issuePlace, value);
                         break;
//•       Контактные данные не заполняем
                     case  "(999) 999-9999": fillField(phone, value);
                         break;
                     case  "nom@km.ru": fillField(email, value);
                         break;

                     //    case  "Дата контакта":
                     //            fillField(contactDate, value);
                       //          contactDate.sendKeys(Keys.TAB);
                    //             break;

                     default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
                         }
             }
             public String getFillField(String fieldName){
                  switch (fieldName){
                         case  "Fadeewa":
                                 return insured0_surname.getAttribute("value");

                             //    return new Select(insured0_name).getAllSelectedOptions().get(0).getText();
                   //      case  "Ekaterina":
                   //              return email.getAttribute("value");
                    //     case  "Комментарии":
                       //          return comment.getAttribute("value");
                       //  case  "Дата контакта":
                        //         return contactDate.getAttribute("value");
                     }
                 throw new AssertionError("Поле не объявлено на странице");
             }



   //          public void checkFieldErrorMessage(String field, String errorMessage){
     //            String xpath = "//*[text()='"+field+"']/..//*[@class='validation-error']";
       //          String actualValue = driver.findElement(By.xpath(xpath)).getText();
         //        Assert.assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", actualValue, errorMessage),
           //                      actualValue.contains(errorMessage));
             //}
}
