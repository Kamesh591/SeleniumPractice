package pract.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorImpl {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shalini\\Downloads\\Selenium-Prac\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.findElement(By.name("customer.firstName")).sendKeys("Raghu");
        driver.findElement(By.name("customer.lastName")).sendKeys("Raghu");
        driver.findElement(By.name("customer.address.street")).sendKeys("JamesStreet");
        driver.findElement(By.name("customer.address.city")).sendKeys("Denver");
        driver.findElement(By.name("customer.address.state")).sendKeys("Colorado");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("43827");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("798198106");
        driver.findElement(By.name("customer.ssn")).sendKeys("798198106");
        driver.findElement(By.name("customer.username")).sendKeys("Kamesh430");
        driver.findElement(By.name("customer.password")).sendKeys("Password123");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Password123");

        //
       // driver.close();
    }
}
