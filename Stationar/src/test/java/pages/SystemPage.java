package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemPage {
    public SystemPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(xpath = "//*[text() = 'Б Т Ф***НА']")
    public static WebElement medPersonUser;

    @FindBy(xpath = "//*[text() = 'Безуглова Анна Николаевна']")
   public static WebElement medPersonUser1;

    @FindBy(xpath = "//*[text() = 'Г Е А***НА']")
    public static WebElement medPersonUser2;

    @FindBy(xpath = "//header/div/div[3]")
    public WebElement out1St;

    @FindBy(xpath = "//*[text() = 'Выход']")
    public WebElement outSt;

    @FindBy(xpath = "/html/body/app-root/app-statist/mat-sidenav-container/mat-sidenav-content/div/div/app-patient-journal/div/patient-grid/div/patient-pagination[1]/div/div[2]/a/button")
    public WebElement add;

   /* @FindBy(xpath = "//*[@id=\"mat-input-19\"]")
    private WebElement snilsField;

    @FindBy(xpath = "//*[@id=\"find\"]/div[3]/div[3]/button")
    private WebElement search; */


    public static String getMailUser() {
        String userMail = medPersonUser.getText();
        return userMail;
    }

    public static String getMailUser1() {
        String userMail = medPersonUser1.getText();
        return userMail;
}

    public static String getMailUser2() {
        String userMail = medPersonUser2.getText();
        return userMail;
    }
/*
    public void AddHistory(){
        add.click();
    } */

    public void out1Stationar() {
        out1St.click();
    }

    public void outStationar() {
        outSt.click();
    }
}
