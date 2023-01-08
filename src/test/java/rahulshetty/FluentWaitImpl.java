package rahulshetty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class FluentWaitImpl {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        driver.get("https://rahulshettyacademy.com/client");
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector(".text-reset")).click();
        driver.findElement(By.id("firstName")).sendKeys("Kameswara");
        driver.findElement(By.id("lastName")).sendKeys("Gandru");
        driver.findElement(By.cssSelector("input[formcontrolname='userEmail']")).sendKeys("kameswararao12.gandru@gmail.com");
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
                driver.findElement(By.xpath("//input[@value='Female']")).click();

                Boolean isselected=driver.findElement(By.xpath("//input[@value='Female']")).isSelected();
                System.out.println(isselected);
            }
        }

        driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Welcome123");
        driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Welcome123");
        //confirmPassword
        //driver.close();
        driver.findElement(By.cssSelector(".col-md-1 input")).click();

        Boolean isenabled=  driver.findElement(By.cssSelector(".col-md-1 input")).isEnabled();
        System.out.println(isenabled);

        driver.findElement(By.cssSelector("#login")).click();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement notification=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("toast-container")));
        System.out.println(notification.getText());

    }
}
