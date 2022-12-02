package pract.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeImpl {

    public static void main(String[] args) {

        //First we should download edge.exe
        //Set the path of the edge.exe
        //Create object for Edge Browser
        //Perform the testcase
        System.setProperty("webdriver.edge.driver","C:\\Users\\Shalini\\Downloads\\Selenium-Prac\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Testing");
    }
}
