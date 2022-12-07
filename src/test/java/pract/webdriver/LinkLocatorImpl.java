package pract.webdriver;

import org.openqa.selenium.By;

public class LinkLocatorImpl extends ParentClass{

    public static void main(String[] args) throws InterruptedException {


        driver.findElement(By.partialLinkText("Forgot login i")).click();

        driver.navigate().back();

     try{
         driver.findElement(By.linkText("Registersdjdjs")).click();
     }
     catch (Exception e)
     {
e.printStackTrace();
     }


        ParentClass.quitDriver();

    }
}
