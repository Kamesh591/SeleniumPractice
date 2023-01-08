package rahulshetty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class End2EndFlow {

    @Test
    public  void rahulSheetRegistration() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
       // driver.manage().timeouts().implicitlyWait(Duration.)
        driver.get("https://rahulshettyacademy.com/client");
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector(".text-reset")).click();
        driver.findElement(By.id("firstName")).sendKeys("Kameswara");
        driver.findElement(By.id("lastName")).sendKeys("Gandru");
        driver.findElement(By.cssSelector("input[formcontrolname='userEmail']")).sendKeys("kameswararao222.gandru@gmail.com");
        driver.findElement(By.cssSelector("#userMobile")).sendKeys("7981989106");
        Select occupation= new Select(driver.findElement(By.xpath("//*[@formcontrolname='occupation']")));
        occupation.selectByIndex(2);

        List<WebElement> genderList= driver.findElements(By.xpath("//input[@type='radio']"));
        Iterator<WebElement> gender= genderList.listIterator();
        while (gender.hasNext())
        {

            System.out.println(gender.next().getAttribute("value"));
           if ("Female".equalsIgnoreCase(gender.next().getAttribute("value").toString()))

            {
                //driver.findElement(By.xpath("//input[@value='Female']")).sendKeys(Keys.ENTER);
               //gender.next().click();
                driver.findElement(By.xpath("//input[@value='Male']")).click();

                boolean isDisplayed=driver.findElement(By.xpath("//input[@value='Female']")).isDisplayed();
                System.out.println("This statement will print whether the element is displayed or nit:"+isDisplayed);
                Boolean isselected=driver.findElement(By.xpath("//input[@value='Female']")).isSelected();
                System.out.println("This statement will print whether the element is selected or nit:"+isselected);
               // System.out.println(isselected);
            }
        }

        driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Welcome123");
        driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Welcome123");
        //confirmPassword
        //driver.close();

      Boolean isenabled=  driver.findElement(By.cssSelector(".col-md-1 input")).isEnabled();

      if(isenabled){
          driver.findElement(By.cssSelector(".col-md-1 input")).click();
      }
        System.out.println("This statement will print whether the element is Enabled or not:"+isenabled);
        Assert.assertTrue(driver.findElement(By.cssSelector(".col-md-1 input")).isEnabled());

        driver.findElement(By.cssSelector("#login")).click();

        /*String actualValue=driver.findElement(By.xpath("//h1[@class='headcolor']")).getText();

        Assert.assertEquals(actualValue,"Account Created Successfully");*/


        //Function<? super WebDriver, ? extends WebDriverWait> ExpectedConditions;
        //WebElement element= driver.findElement(By.id("toast-container"));
   WebElement element=  new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.presenceOfElementLocated(By.id("toast-container")));

//
        System.out.println(element.getText());
        Assert.assertEquals(element.getText(),"User already exisits with this Email Id!");
       /* WebDriverWait webDriverWait= new WebDriverWait(driver,Duration.ofMillis(5000)).
        until(driver.findElement(By.id("toast-container")));*/

        driver.close();
    }
}
