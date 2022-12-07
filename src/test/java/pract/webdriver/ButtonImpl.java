package pract.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonImpl {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shalini\\Downloads\\Selenium-Prac\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
       // driver.get("https://demoqa.com/buttons");
      /*  driver.findElement(By.id("doubleClickBtn")).click();
        driver.findElement(By.xpath("//*[@class='mt-4']//child::button[text()='Click Me']")).click();*/

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(@id,'yesRadio')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("impressiveRadio")).click();
        //https://demoqa.com/buttons
    }
}
