package testngimpl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.Objects;

public class SecondTest extends SuperTest{


    @Test
    public void dropdownSelection() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");

        Select select = new Select(driver.findElement(By.id("loanProvider")));
        System.out.println(select);

        Thread.sleep(4000);
        select.selectByIndex(2);

        Select select1 = new Select(driver.findElement(By.id("loanProcessor")));
        select1.selectByVisibleText("Available Funds");
        Thread.sleep(7000);
        select1.selectByValue("combined");
    }

    @Test
    public void test2() {
        System.out.println("This is my test2");
    }

    @Test
    public void test3() {
        System.out.println("This is my test3");
    }

   /* @BeforeSuite(alwaysRun = true)
    public static   void beforeSuite(){
        System.out.println("We load properties files and excel objectes etc");
    }

    @AfterSuite(alwaysRun = true)
    public static void afterSuite(){
        System.out.println("We will unable all the objects created above");
    }*/
}


