import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Activity10_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title is: " + driver.getTitle());

        Actions builder = new Actions(driver);


        //Perform the following actions,
        //Press the key of your first name in caps
        builder.sendKeys("S").build().perform();
        WebElement keyPress = driver.findElement(By.id("keyPressed"));
        System.out.println("Key Pressed: "+keyPress.getText());

        //Press CTRL+a and the CTRL+c to copy all the text on the page.
        builder.keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build()
                .perform();
        //Paste the text in a text editor to verify results.

        System.out.println("Key Pasted: "+keyPress.getText());
        //Finally, close the browser.
        driver.quit();

    }
}
