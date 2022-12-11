package screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class TakeScreenshots {


    public static void main(String[] args) throws IOException {
         WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/client");
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File file = new File(System.getProperty("user.dir") + "//reports//" + "Loginpage"+ ".png");
        FileUtils.copyFile(source, file);
       // return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";

    }

}
