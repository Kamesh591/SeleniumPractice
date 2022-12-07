package pract.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class cssSelectorImpl {

    static WebDriver driver= new ChromeDriver();
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shalini\\Downloads\\Selenium-Prac\\chromedriver.exe");

        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        //driver.findElement(By.cssSelector("input#customer.firstName")).sendKeys("SUDNAR");


        driver.findElement(By.cssSelector("input[id='customer.firstName']")).sendKeys("CSS");

     // List<WebElement> list=  driver.findElements(By.cssSelector("input.input"));
        List<WebElement> classList= driver.findElements(By.className("input"));
      for (WebElement element:classList)
      {
          System.out.println(element.getAttribute("name"));
      }
    }
}
