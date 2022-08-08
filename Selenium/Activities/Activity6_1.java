import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Activity6_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println("Title is: " + driver.getTitle());

        WebElement inCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement btnForCheckbox = driver.findElement(By.id("toggleCheckbox"));

        btnForCheckbox.click();

        wait.until(ExpectedConditions.invisibilityOf(inCheckbox));

        btnForCheckbox.click();

        wait.until(ExpectedConditions.visibilityOf(inCheckbox));
        inCheckbox.click();

        driver.quit();
    }
}
