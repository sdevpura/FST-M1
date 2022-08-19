import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity11_3 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title is: " + driver.getTitle());

        //Also use findElement() to find the button to open a PROMPT alert and click it.
        driver.findElement(By.id("prompt")).click();

        //Switch the focus from the main window to the Alert box.
        Alert alert = driver.switchTo().alert();
        System.out.println("Prompt Alert text is: "+alert.getText());
        //Use sendKeys() to type in "Yes, you are!".
        alert.sendKeys("Yes, you are!");

        //Close the alert with alert.accept().
        alert.accept();
        //Finally, close() the browser.
        //driver.quit();
    }
}
