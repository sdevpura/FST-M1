import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Activity4 {
    WebDriver driver;
    //In the @BeforeClass method, create the driver instance for FirefoxDriver
    //Also use the get() method to open the browser
    @BeforeClass
    public void methodBefore(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    //Find the login input fields - username and password
    //Enter the credentials - admin and password - and click the "Log in" button.
    //Read the confirmation message and make and assertion to check if the correct message has been printed.
    @Test
    public void method1() {
        WebElement username = driver.findElement(By.id("username"));
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(message,"Welcome Back, admin");

    }
    @AfterClass
    public void methodAfter(){

        driver.quit();
    }
}
