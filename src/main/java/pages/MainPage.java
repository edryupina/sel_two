package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    @FindBy(xpath = "//div [@class,'sbrf-div-list-inner --area bp-area header-container']")
    WebElement menuItems;
    @FindBy(xpath = "//div [@class,'alt-menu-collapser__hidder']")
    WebElement menuInsurance;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectMenuItem(String itemName) {
        menuItems.findElement(By.xpath(".//li[contains(@class,'current')]/*[contains(text(),'" + itemName + "')]")).click();
    }

    public void selectInsuranceItem(String itemName) {
        menuInsurance.findElement(By.xpath(".//li[contains(@class,'line3-link')]//a[contains(text(),'" + itemName + "')]")).click();
    }
}