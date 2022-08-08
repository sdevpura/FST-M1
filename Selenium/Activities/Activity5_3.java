import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println("Title is: " + driver.getTitle());

        WebElement inText = driver.findElement(By.xpath("//input[@type='text']"));

        System.out.println("Is text field enabled: " + inText.isEnabled());

        driver.findElement(By.id("toggleInput")).click();

        System.out.println("Is text field enabled: " + inText.isEnabled());

        driver.quit();
    }
}
