package testngimpl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Objects;

public class FirstTest {

    WebDriver driver;

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
}


