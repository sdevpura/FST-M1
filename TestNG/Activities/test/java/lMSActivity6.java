import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//6. Logging into the site
//Goal: Open the website and log-in using the provided credentials.
public class lMSActivity6 {

    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();


        //a. Open a browser.
        //b. Navigate to ‘https://alchemy.hguy.co/lms’.
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void TCAccount() {
        //c. Find the navigation bar.
        //d. Select the menu item that says “My Account” and click it.
        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();

        //e. Read the page title and verify that you are on the correct page.
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals("My Account – Alchemy LMS", title);
    }

    @Test
    public void TCLogin() {
//f. Find the “Login” button on the page and click it.
        driver.findElement(By.className("ld-login")).click();
        //g. Find the username field of the login form and enter the username into that field.
        driver.findElement(By.id("user_login")).sendKeys("root");
        //h. Find the password field of the login form and enter the password into that field.
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        //i. Find the login button and click it.
        driver.findElement(By.id("wp-submit")).click();
        //j. Verify that you have logged in.
        String user = driver.findElement(By.xpath("//a[contains(text(),'Howdy, ')]")).getText();
        Assert.assertEquals(user, "Howdy, root");
        System.out.println("Login is successful");
}

    @AfterClass
    public void afterMethod() {
        //k. Close the browser
        driver.quit();
    }
}
