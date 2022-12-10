package testngimpl;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import ru.yandex.qatools.ashot.Screenshot;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.Objects;

public class SuperTest {

    static WebDriver driver;

    @BeforeMethod
    public void beforeMothod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shalini\\Downloads\\Selenium-Prac\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("This is invoked before every method");
    }

    @AfterMethod


    public void afterMethod(){
        if (Objects.nonNull(driver)){
            driver.close();

        }
        System.out.println("This will be invoked after every method completion");
    }


    @BeforeSuite(alwaysRun = true)
    public  static void beforeSuite(){
        System.out.println("We load properties files and excel objectes etc");
    }

    @AfterSuite(alwaysRun = true)
    public static void afterSuite(){
        System.out.println("We close all the objects created above");
    }


    public static void takeScreenshot(){
       /* TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        takesScreenshot.getScreenshotAs(OutputType.BYTES);
        File file = new File(System.getProperty("user.dir")+"/"+ DateFormat.DAY_OF_WEEK_FIELD+DateFormat.HOUR_OF_DAY0_FIELD+DateFormat.SECOND_FIELD+DateFormat.MILLISECOND_FIELD+".jpg");
        File*/

      //  Screenshot screenshot = new Ashot().takeScreenshot(driver);
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("This method will be executed before every test case");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

}

