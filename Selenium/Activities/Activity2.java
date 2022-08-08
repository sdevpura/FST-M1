import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");

        String title = driver.getTitle();
        System.out.println("Title is: "+title);

        WebElement eID = driver.findElement(By.id("about-link"));
        System.out.println("Text by ID locator is: "+eID.getText());

        WebElement eClass = driver.findElement(By.className("green"));
        System.out.println("Text by className locator is: "+eClass.getText());

        WebElement eLinkTest = driver.findElement(By.linkText("About Us"));
        System.out.println("Text with linkText locator is: "+eLinkTest.getText());

        WebElement eCssClass = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text with cssSelector is: "+eCssClass.getText());


        driver.quit();

    }
}
