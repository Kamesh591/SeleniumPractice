package shadow.dom.implementation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShadowDomImpl {

    @Test
    public void shadowTest(){

        WebDriverManager.chromedriver().cachePath("drivers").setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://watir.com/examples/shadow_dom.html");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement element= (WebElement) js.executeScript("return document.querySelector('#shadow_host').shadowRoot.querySelector('span >span')");
        System.out.println(element.getText());
    }

    @Test
    public void nestedShadowHandle(){
        WebDriverManager.chromedriver().cachePath("drivers").setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://watir.com/examples/shadow_dom.html");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement element= (WebElement) js.executeScript("return document.querySelector('#shadow_host').shadowRoot.querySelector('#nested_shadow_host').shadowRoot.querySelector('div >div')");
        System.out.println(element.getText());

        //document.querySelector('#shadow_host').shadowRoot.querySelector('#nested_shadow_host').shadowRoot.querySelector('div >div')


    }

    @Test
    public void enterTextInShdowTextFld(){
        WebDriverManager.chromedriver().cachePath("drivers").setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://watir.com/examples/shadow_dom.html");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement element= (WebElement) js.executeScript("return document.querySelector('#shadow_host').shadowRoot.querySelector('input[type=text]')");
        String enterText="arguments[0].setAttribute('value','BasicText')";
        js.executeScript(enterText,element);
      //  System.out.println(element.getText());
        //document.querySelector("#shadow_host").shadowRoot.querySelector("input[type=text]")
    }


    @Test
    public void chromeDownloadExample(){
        WebDriverManager.chromedriver().cachePath("drivers").setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(10000));
        driver.get("chrome://downloads/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement element= (WebElement) js.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar').shadowRoot.querySelector('cr-toolbar').shadowRoot.querySelector('cr-toolbar-search-field').shadowRoot.querySelector('#searchInput')");
        String enterText="arguments[0].setAttribute('value','Love')";
        js.executeScript(enterText,element);
        //  System.out.println(element.getText());
        //document.querySelector("#shadow_host").shadowRoot.querySelector("input[type=text]")
    }

    @Test
    public void handleClosedShadowDom(){
        WebDriverManager.firefoxdriver().cachePath("drivers").setup();
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(20000));
        driver.get("https://selectorshub.com/xpath-practice-page/");
        WebElement host=(WebElement) ((JavascriptExecutor)driver).executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#concepts')");
        host.click();
        Actions actions= new Actions(driver);
        actions.sendKeys("GDHSHD").perform();
        actions.sendKeys(Keys.TAB).sendKeys("JAGWAY").perform();
        driver.close();
    }
}


