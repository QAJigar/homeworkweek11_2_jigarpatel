package testsuite;
/**
 * Created by Jigar Patel
 */
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    //1. userShouldLoginSuccessfullyWithValidCredentials
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // Enter “Admin” username
        driver.findElement(By.name("username")).sendKeys("Admin");
        // Enter “admin123 password
        driver.findElement(By.name("password")).sendKeys("admin123");
        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Verify the ‘Dashboard’ text is display
        String expectedText ="Dashboard";
        String actualText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals("Text Is Available", expectedText,actualText);
    }

    @After
    //close sessions
    public void tearDown(){
        closeBrowser();
    }
}
