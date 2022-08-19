import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;


public class Activity11_4 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/tab-opener");
        String parentWindow = driver.getWindowHandle();

        //Print the Page Title and Handle of that tab.
        System.out.println("Title of page is: " + driver.getTitle());
        System.out.println("Parent Handle is: "+parentWindow);

        //Find the button to open a new tab and click it.
        driver.findElement(By.id("launcher")).click();

        //Wait for the new tab to open.
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        //Print all the handles.
        Set<String> handles = driver.getWindowHandles();
        System.out.println("Handles are: "+handles);
        //Switch to the newly opened tab, print it's title and heading.
        for(String hand:handles){
            driver.switchTo().window(hand);
        }
        System.out.println("Current Window handle is: "+driver.getWindowHandle());
        String currHandle = driver.getWindowHandle();
        driver.switchTo().window(currHandle);
        System.out.println("Window Title is: "+driver.getTitle());
        wait.until(ExpectedConditions.titleIs("Newtab"));

         //Repeat steps 6-8 by clicking the button on the new tab.
        //driver.findElement(By.linkText("//a[contains(text(),'Open Another One!')]")).click();
        driver.findElement(By.id("actionButton")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        Set<String> newHandles = driver.getWindowHandles();
        for(String hand2:newHandles){
            driver.switchTo().window(hand2);
        }
        System.out.println("Current Window Handle is: "+driver.getWindowHandle());

        //Finally, close both windows using quit().
    }
}
