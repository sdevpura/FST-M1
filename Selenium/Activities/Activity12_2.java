import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity12_2 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Print the title of the page
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        System.out.println("Title is: "+driver.getTitle());
        //Traverse into the iframe that is on the page.
        driver.switchTo().frame(0);

        //Traverse into the first iframe in that frame.
        driver.switchTo().frame(0);

        //Print the heading of that frame.
        String innerF1 = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("Inner Frame 1 is: "+innerF1);


        driver.switchTo().defaultContent();

        //Navigate to the second iframe in that frame.
        driver.switchTo().frame(0);
        driver.switchTo().frame(1);
        //Print the heading of that frame.
        String innerF2 = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("Inner Frame 2 is: "+innerF2);

        driver.quit();

    }
}