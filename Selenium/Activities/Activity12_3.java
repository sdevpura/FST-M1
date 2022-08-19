import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity12_3 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        Actions act = new Actions(driver);
        //Print the title of the page
        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("Title is: "+driver.getTitle());

        //Find the Sign in button and hover over it. Print the tooltip message.
        WebElement btnSignin = driver.findElement(By.className("orange"));
        act.moveToElement(btnSignin).build().perform();
        String tooltip = btnSignin.getAttribute("data-tooltip");
        System.out.println("Tooltip message is: "+tooltip);


        //Click the button to open the Sign in form.
        driver.findElement(By.className("orange")).click();
        //Enter the credentials
        //username: admin
        //password: password
        driver.findElement(By.name("Username")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("password");

        //Click login and print the message on the page after logging in.
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        String finalText = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login text is: "+finalText);
        //Finally, close the browser.
        driver.quit();

    }
}