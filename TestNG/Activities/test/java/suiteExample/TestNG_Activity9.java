package suiteExample;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Activity9 {
    WebDriver driver;

    @BeforeMethod
    public void mainPage(){
        Reporter.log("Switch to main page");
        driver.switchTo().defaultContent();
    }

    @BeforeTest
    public void launch(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Title is: "+driver.getTitle());
    }
    @Test
    public void simpleAlertTestCase(){
        driver.findElement(By.id("simple")).click();
        Reporter.log("This is Simple alert");
        Alert alert =  driver.switchTo().alert();
        String simpleText = alert.getText();
        Assert.assertEquals(simpleText, "This is a JavaScript Alert!");
        alert.accept();
    }

    @Test
    public void confirmAlertTestCase(){
        driver.findElement(By.id("confirm")).click();
        Reporter.log("This is Confirm alert");
        Alert alert = driver.switchTo().alert();
        String confirmText = alert.getText();
        Assert.assertEquals(confirmText, "This is a JavaScript Confirmation!");
        alert.accept();
    }

    @Test
    public void promptAlertTestCase(){
        driver.findElement(By.id("prompt")).click();
        Reporter.log("This is prompt alert");
        Alert alert = driver.switchTo().alert();
        String promptText = alert.getText();
        Assert.assertEquals(promptText, "This is a JavaScript Prompt!");
        alert.sendKeys("OK");
        alert.accept();

    }
    @AfterTest
    public void close(){
        Reporter.log("Browser closed");
        driver.quit();
    }
}
