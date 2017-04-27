package PracticeSelenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 4/25/2017.
 */
public class BaseTest extends BasePage

{
    @BeforeMethod
    public void openBrowser()

    {
        driver = new FirefoxDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.practiceselenium.com/");

    }

 //  @AfterMethod
 //   public void closeBrowser()
   //{
     //  driver.quit();
   //}
}
