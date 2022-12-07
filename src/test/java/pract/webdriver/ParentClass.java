package pract.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentClass {

    public static WebDriver driver=ParentClass.launch();

    public static WebDriver launch(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shalini\\Downloads\\Selenium-Prac\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        return driver;
    }

    public static void quitDriver()
    {
        if (driver !=null){
            driver.close();
        }
    }
}