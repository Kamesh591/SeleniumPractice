package pract.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class XpathMethodsImpl {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shalini\\Downloads\\Selenium-Prac\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/selenium-xpath.html");
     driver.findElement(By.xpath("//input[contains(@name,'uid')]")).sendKeys("Ram");
        //System.out.println(text);

        //sleep(5000);

     List<WebElement> webElements= driver.findElements(By.xpath("//label[starts-with(@id,'message')]"));

     for (WebElement element:webElements){
         System.out.println(element.getText());
     }


     driver.findElement(By.xpath("//*[@type='text']//following::input[1]")).sendKeys("Raghuasmad");

     ////input[@name='password']//ancestor::input

        driver.findElement(By.xpath("//input[@name='password']//preceding::input")).clear();
        driver.findElement(By.xpath("//input[@name='password']//preceding::input")).sendKeys("New Value");


    // driver.findElement(By.xpath("//a[text()='Software Testing']")).click();
    }


}
