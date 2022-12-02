package pract.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TagNameImpl {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shalini\\Downloads\\Selenium-Prac\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        driver.findElement(By.tagName("input")).sendKeys("Data");
       List<WebElement> listofelements= driver.findElements(By.tagName("input"));

        System.out.println(listofelements.size());


    }
}
