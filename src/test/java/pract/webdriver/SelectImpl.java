package pract.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectImpl {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shalini\\Downloads\\Selenium-Prac\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");

        Select select= new Select(driver.findElement(By.id("loanProvider")));
        System.out.println(select);

        Thread.sleep(4000);
        select.selectByIndex(2);

        Select select1= new Select(driver.findElement(By.id("loanProcessor")));
        select1.selectByVisibleText("Available Funds");
        Thread.sleep(7000);
        select1.selectByValue("combined");




    }
}
