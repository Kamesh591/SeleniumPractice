package pract.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathsImpl {



        static WebDriver driver= new ChromeDriver();
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Shalini\\Downloads\\Selenium-Prac\\chromedriver.exe");

            driver.manage().window().maximize();
            driver.get("https://parabank.parasoft.com/parabank/register.htm");
            driver.findElement(By.xpath("//input[@name='customer.firstName' AND @id='customer.firstName']")).sendKeys("Raghu");

            }
        ////input[@name='customer.lastName' AND @id='customer.firstName']

    //"https://rahulshettyacademy.com/AutomationPractice/"

}
