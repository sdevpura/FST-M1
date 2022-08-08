import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println("Title is: " + driver.getTitle());

        WebElement inCheckbox = driver.findElement(By.xpath("//input[@name='toggled']"));

        System.out.println("Is checkbox selected: " + inCheckbox.isSelected());

        inCheckbox.click();

        System.out.println("Is checkbox selected: " + inCheckbox.isSelected());

        driver.quit();
    }
}
