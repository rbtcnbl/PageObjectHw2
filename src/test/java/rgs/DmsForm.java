package rgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DmsForm extends MainPage {

    @FindBy(xpath = "//select[@name='Region']")
    public WebElement regionSelect;

    @FindBy(xpath = "//input[contains(@class, 'checkbox')]")
    public WebElement checkBox;

    @FindBy(xpath = "//button[contains(text(), \"Отправить\")]")
    public WebElement sendBtm;

    @FindBy(xpath = "//*[text()='Телефон']/following::span[contains(@class, 'validation')]")
    public WebElement phoneLiine;


    public void fillInputByName(String name, String textToFill) {
        String template = "//*[text()='%s']/following::input[1]";
        String fullxpath = String.format(template, name);
        driver.findElement(By.xpath(fullxpath)).sendKeys(textToFill);
    }

    public void fillInputComment(String name, String textToFill) {
        String template = "//*[text()='Комментарии']/following::textarea[1]";
        String fullxpath = String.format(template, name);
        driver.findElement(By.xpath(fullxpath)).sendKeys(textToFill);
    }

    public void fillInputRegion(){
        By selectxpath = By.xpath("//select[@name='Region']");
        WebElement element = driver.findElement(selectxpath);
        Select select = new Select(element);
        select.selectByValue("46");
    }
}
