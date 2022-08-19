import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Activity10_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title is: " + driver.getTitle());
        Actions builder = new Actions(driver);


        //Left click and print the value of the side in the front.
        builder.click().build().perform();
        WebElement Leftclick = driver.findElement(By.className("active"));
        System.out.println("First Left click shows number: "+Leftclick.getText());

        //Double click to show a random side and print the number.
        builder.doubleClick().build().perform();
        WebElement random = driver.findElement(By.className("active"));
        System.out.println("Double click shows number: "+random.getText());

        //Right click and print the value shown on the front of the cube.
        builder.contextClick().build().perform();
        WebElement rightValue = driver.findElement(By.className("active"));
        System.out.println("Right click shows number: "+rightValue.getText());

        //Finally, close the browser.
        driver.quit();

    }
}
