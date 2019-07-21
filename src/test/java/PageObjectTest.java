import core.Init;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;
import rgs.DmsForm;
import rgs.FirstPage;

public class PageObjectTest {
    @Test
    public void openBankPage() {
        Init.startBrowser("https://rgs.ru");


        FirstPage firstPage = new FirstPage();
        firstPage.openDms()
                .waitToDownload();


        DmsForm dmsForm = new DmsForm();
        dmsForm.fillInputByName("Фамилия", "Горбулина");
        dmsForm.fillInputByName("Имя", "Алеся");
        dmsForm.fillInputByName("Отчество", "Викторовна");
        dmsForm.fillInputByName("Телефон", "9998521365");
        dmsForm.fillInputByName("Эл. почта", "qwerty");
        dmsForm.fillInputComment("Comment", "Юра - лучший в мире преподаватель");
        dmsForm.fillInputRegion();
        dmsForm.checkBox.click();
        dmsForm.sendBtm.click();
        dmsForm.findErrore();

        Init.afterClass();

    }
}
