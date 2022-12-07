package pract.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TagNameImpl {
    static WebDriver driver= new ChromeDriver();
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shalini\\Downloads\\Selenium-Prac\\chromedriver.exe");

        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

     //   driver.findElement(By.tagName("input")).sendKeys("Data");
       List<WebElement> listofelements= driver.findElements(By.tagName("input"));

     /* Iterator<WebElement> elementIterator= listofelements.iterator();

      while (elementIterator.hasNext())
      {
          WebElement element= (WebElement) elementIterator;
          System.out.println(element.getAttribute("id"));
      }*/
       for (WebElement element:listofelements){
           System.out.println(element.getAttribute("name"));
           fillValues(element.getAttribute("name"),element);

       }

        System.out.println(listofelements.size());

       driver.close();


    }

    public static void  fillValues(String value,WebElement element)

    {

        switch (value)
        {
            case "customer.firstName":
                driver.findElement(By.name(value)).sendKeys("Raghu");
                System.out.println(driver.findElement(By.name(value)).getAttribute("value"));
                System.out.println("This is the WebElement to enter firstName");
                break;
            case "customer.lastName":
                driver.findElement(By.name(value)).sendKeys("Raghu");
                System.out.println(driver.findElement(By.name(value)).getAttribute("value"));
                System.out.println("This is Last Name attribute");
                break;

            case "customer.address.street":
                driver.findElement(By.name(value)).sendKeys("JamesStreet");
                System.out.println(driver.findElement(By.name(value)).getAttribute("value"));
                break;
            case "customer.address.city":
                driver.findElement(By.name(value)).sendKeys("Denver");
                System.out.println(driver.findElement(By.name(value)).getAttribute("value"));
                break;
            case "customer.address.state":
                driver.findElement(By.name(value)).sendKeys("Colorado");
                System.out.println(driver.findElement(By.name(value)).getAttribute("value"));
                break;
            case "customer.address.zipCode":
                driver.findElement(By.name(value)).sendKeys("43827");
                System.out.println(driver.findElement(By.name(value)).getAttribute("value"));
                break;

            default:
                System.out.println("=============");
                break;
        }
    }
}
