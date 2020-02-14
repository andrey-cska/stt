package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateHistoryPage {
    public CreateHistoryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public Select getSelect(WebElement element) {
        select = new Select(element);
        return select;
    }

    public WebDriver driver;
    public Select select;

    @FindBy(xpath = "//*[@id=\"mat-input-19\"]")
    private WebElement snilsField;

    @FindBy(xpath = "//*[@id=\"find\"]/div[3]/div[3]/button")
    private WebElement search;

    @FindBy(xpath = "/html/body/app-root/app-statist/mat-sidenav-container/mat-sidenav-content/div/div/app-patient-identification/div[2]/div/div[2]/a")
    private WebElement addNewPatient;

    @FindBy(xpath = "//*[@id=\"mat-radio-99\"]/label/div[2]")
    private WebElement extrenno;

    @FindBy(xpath = "//*[@id=\"mat-input-308\"]")
    private WebElement polisTypeField;


    public void inputPatient(String snils){
        snilsField.sendKeys(snils);
    }

    public void buttonSearch(){
        search.click();
    }

    public void buttonAddNewPatient(){
        addNewPatient.click();
    }

    public void gospital(){
        extrenno.click();
    }

    public void selectPolisType(String polis) {
        getSelect(polisTypeField);
        select.selectByVisibleText(polis);
    }
}



