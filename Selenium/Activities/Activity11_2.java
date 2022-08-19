import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity11_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title is: " + driver.getTitle());

        //Use findElement() to find the button to open a CONFIRM alert and click it.
        driver.findElement(By.id("confirm")).click();
        //Switch the focus from the main window to the Alert box and get the text in it and print it.
        Alert alert = driver.switchTo().alert();
        System.out.println("Confirm Alert text is: "+alert.getText());
        //Close the alert once with alert.accept()
        //alert.accept();
        //System.out.println("Alert accepted!!");
        //Close the alert with alert.dismiss()
        alert.dismiss();
        System.out.println("Alert dismissed!!");
        //Finally, close() the browser.
        driver.quit();

    }
}
