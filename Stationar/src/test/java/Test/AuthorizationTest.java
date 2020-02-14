package Test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateHistoryPage;
import pages.LoginPage;
import pages.SystemPage;

import java.util.concurrent.TimeUnit;

public class AuthorizationTest {
    public static WebDriver driver;
    public static LoginPage loginPage;
    public static SystemPage systemPage;
    public static CreateHistoryPage createHistoryPage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        systemPage = new SystemPage(driver);
        createHistoryPage = new CreateHistoryPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("http://192.168.7.47/dev/stationar_ui/login");
    }

    private void LoginTestTerapevt()  {
        loginPage.inputLpu("ГБУЗ МО Талдомская ЦРБ");
        loginPage.clickinputLpu1();
        loginPage.inputLogin("st_terapevt");
        loginPage.inputPassword("123");
        loginPage.clickLoginButton();
        String userMail = SystemPage.getMailUser();
        Assert.assertEquals("Б Т Ф***НА", userMail);
        systemPage.out1Stationar();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        systemPage.outStationar();
    }


   private void LoginTestDoctor()  {
        loginPage.inputLogin("st_doctor");
        loginPage.inputPassword("123");
        loginPage.clickLoginButton();
       String userMail = SystemPage.getMailUser1();
       Assert.assertEquals("Безуглова Анна Николаевна", userMail);
        systemPage.out1Stationar();
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        systemPage.outStationar();
    }

    private void LoginTestNurse()  {
        loginPage.inputLogin("st_nurse");
        loginPage.inputPassword("123");
        loginPage.clickLoginButton();
        String userMail = SystemPage.getMailUser2();
        Assert.assertEquals("Г Е А***НА", userMail);
        systemPage.out1Stationar();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        systemPage.outStationar();
    }

    @Test
    public void Test (){
        LoginTestTerapevt();
        LoginTestDoctor();
        LoginTestNurse();
    }
   @AfterClass
   public static void exitBrowser (){
      driver.quit();
   }
}
