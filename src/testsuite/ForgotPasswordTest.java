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

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    //1. userShouldNavigateToForgotPasswordPageSuccessfully
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        // click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        // Verify the text ‘Reset Password’
        String expectedText="Reset Password";
        String actualText=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText();
        Assert.assertEquals("Text Found",expectedText,actualText);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
