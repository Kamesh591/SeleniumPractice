package pract.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriver {

    //WedDriver

    //Chrome ChromeDriver .exe file available for every browser
    //FireFox FireFoxDriver
    //Edge EdgeDriver
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shalini\\Downloads\\Selenium-Prac\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
     /* String title= driver.getTitle();
        System.out.println("The tilele of the page is:"+title);
        System.out.println(driver.getCurrentUrl());

       String sourceCode= driver.getPageSource();
        System.out.println(sourceCode);
      boolean result=  sourceCode.contains("name=\"username");
      driver.navigate().refresh();
        System.out.println(result);*/

        driver.findElement(By.id("customer.firstName")).sendKeys("Kamesh");
        driver.findElement(By.id("customer.lastName")).sendKeys("Raghuavau");
        driver.findElement(By.id("customer.address.street")).sendKeys("1-241HDshadja");
        driver.findElement(By.id("customer.address.city")).sendKeys("Washington");
        driver.findElement(By.id("customer.address.state")).sendKeys("Colarado");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("23948");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("7981989106");
        driver.findElement(By.id("customer.ssn")).sendKeys("7981989106");
        driver.findElement(By.id("customer.username")).sendKeys("Kameshwa123");
        driver.findElement(By.id("customer.password")).sendKeys("Kameshewa123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Kameshewa123");
        driver.findElement(By.id("customer.firstName")).clear();

        System.out.println();

        //
        //customer.phoneNumber
        //
        //customer.username
        //
        //repeatedPassword
        //driver.close();
      //  driver.findElement(By.name("q")).sendKeys("Testing");
       // ChromeDriver driver1= new ChromeDriver();
    }
}
