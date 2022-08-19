import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity11_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title is: " + driver.getTitle());

        //Use findElement() to find the button to open a SIMPLE alert and click it.
        driver.findElement(By.id("simple")).click();
        //Switch the focus from the main window to the Alert box and get the text in it and print it.
        Alert alert = driver.switchTo().alert();
        System.out.println("Simple Alert text is: "+alert.getText());
        //Finally, close the alert with alert.accept() and close() the browser
        alert.accept();
        driver.quit();

    }
}
