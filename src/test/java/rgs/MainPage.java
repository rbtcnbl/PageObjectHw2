package rgs;

import core.Init;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    WebDriver driver;
    WebDriver wait;

    public MainPage() {
        this.driver = Init.driver;
        new WebDriverWait(driver, 5, 200);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[text() = 'Введите адрес электронной почты']")
    public WebElement aser;

@Step("Wait to Download")
    public void waitToDownload() {
        WebDriverWait wait = new WebDriverWait(driver, 5, 200);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("modal-dialog")));
    }
@Step("Find errore")
    public void findErrore() {

        Assert.assertTrue(aser.isEnabled());
    }

}
