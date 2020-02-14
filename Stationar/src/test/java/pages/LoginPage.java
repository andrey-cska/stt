package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(xpath = "//div[1]/input")
    public WebElement lpuText;

    @FindBy(xpath = "//nz-auto-option[3]")
    public WebElement clickLpu1;

    @FindBy(xpath = "//div[2]/input")
    public WebElement loginField;

    @FindBy(xpath = "//div[3]/input")
    public WebElement passwordField;

    @FindBy(xpath = "//button")
    public WebElement ButtonLogin;


    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void inputLpu (String lpu){
        lpuText.sendKeys(lpu);
    }
    public void clickinputLpu1() {
        clickLpu1.click();
    }

    public void clickLoginButton (){
        ButtonLogin.click();
    }
}
