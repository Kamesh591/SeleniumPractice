package pract.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxImpl {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Shalini\\Downloads\\Selenium-Prac\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.google.com/");

    }
}
