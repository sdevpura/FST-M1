import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println("Title is: " + driver.getTitle());

        WebElement result1 = driver.findElement(By.xpath("//input[@name='toggled']"));
        //input[contains(@class, 'willDisappear')]
        System.out.println("Is checkbox displayed: " + result1.isDisplayed());

        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();

        WebElement result2 = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));

        System.out.println("Is checkbox displayed: " + result2.isDisplayed());

        driver.quit();
    }
}
