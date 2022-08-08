import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Activity7_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title is: " + driver.getTitle());

        String username = "FST";
        driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys(username);
        driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("password1");
        driver.findElement(By.xpath("//input[contains(@class, '-password')]/following::input")).sendKeys("password1");
        driver.findElement(By.xpath("//label[contains(text(), 'Email')]/following::input")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        String signupText = driver.findElement(By.id("action-confirmation")).getText();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"), "Thank you for registering, "+username));
        System.out.println("Login Text is :"+signupText);
        driver.quit();
    }
}
