import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/simple-form");

        System.out.println("Title is: " + driver.getTitle());

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("FST");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Batch44");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("FST@gmail.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("8008202201");
        driver.findElement(By.xpath("//textarea")).sendKeys("comment");
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).submit();
        System.out.println("other Title is: " + driver.getTitle());
        driver.quit();
    }
}
