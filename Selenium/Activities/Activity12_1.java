import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity12_1 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Print the title of the page
        driver.get("https://www.training-support.net/selenium/iframes");
        System.out.println("Title is: "+driver.getTitle());

        //Print the Heading of the 1st iframe.
        driver.switchTo().frame(0);
        String TitleF1 = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("Frame 1 is: "+TitleF1);
        //Print the Button Text and color of the button in that frame.
        WebElement btnRed = driver.findElement(By.className("red"));
        System.out.println("Button text is: "+btnRed.getText());
        System.out.println("Frame 1 button color is: "+btnRed.getCssValue("background-color"));

        //Click th button in that frame.
        btnRed.click();
        //Print the new Button Text and color of the button.
        WebElement btnBlue = driver.findElement(By.className("blue"));
        System.out.println("Button text is: "+btnBlue.getText());
        System.out.println("Frame 1 button color is: "+btnBlue.getCssValue("background-color"));
        //Repeat Steps 3-6 with the 2nd iframe.

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        String TitleF2 = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("Frame 2 is: "+TitleF2);
        //Print the Button Text and color of the button in that frame.
        WebElement btnGreen = driver.findElement(By.className("green"));
        System.out.println("Button text is: "+btnGreen.getText());
        System.out.println("Frame 2 button color is: "+btnGreen.getCssValue("background-color"));

        //Click th button in that frame.
        btnGreen.click();
        //Print the new Button Text and color of the button.
        WebElement btnPurple = driver.findElement(By.className("purple"));
        System.out.println("Button text is: "+btnPurple.getText());
        System.out.println("Frame 2 button color is: "+btnPurple.getCssValue("background-color"));

        driver.quit();

    }
}