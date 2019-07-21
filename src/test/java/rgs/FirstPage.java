package rgs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends MainPage{
    @FindBy(xpath = "//li[contains(@class, 'dropdown')]/a[contains(text(),'Страхование')]")
    public WebElement dropdownBtn;

    @FindBy(xpath = "//a[contains(text(), 'ДМС') and not(contains(text(), 'Полис'))]")
    public WebElement dmsBtn;

    @FindBy(xpath = "//a[contains(text(), 'Отправить заявку')]")
    public WebElement openForm;

    public FirstPage openDms(){
        dropdownBtn.click();
        dmsBtn.click();
        openForm.click();
        return new FirstPage();
    }

}
