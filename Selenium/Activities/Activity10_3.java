import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Activity10_3 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions act = new Actions(driver);

        driver.get("https://training-support.net/selenium/drag-drop");
        System.out.println("Title is: " + driver.getTitle());

        //Find the ball and simulate a click and drag to move it into "Dropzone 1".
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement dz1 = driver.findElement(By.id("droppable"));
        WebElement dz2 = driver.findElement(By.id("dropzone2"));
        act.dragAndDrop(ball,dz1).build().perform();
        //Verify that the ball has entered Dropzone 1.
        String dropped1 = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
        if(dropped1.equals("Dropped!"))
            System.out.println("Ball is dropped in Drop Zone 1: "+dropped1);

        //Once verified, move the ball into "Dropzone 2".
        act.dragAndDrop(ball,dz2).build().perform();

        //Verify that the ball has entered Dropzone 2.
        String dropped2 = driver.findElement(By.xpath("//div[@id='dropzone2']/p")).getText();
        if(dropped2.equals("Dropped!"))
            System.out.println("Ball is dropped in Drop Zone 2: "+dropped1);

        //Finally, close the browser.
        driver.quit();

    }
}
