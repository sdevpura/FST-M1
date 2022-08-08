import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/simple-form");

        String title = driver.getTitle();
        System.out.println("Title is: " + title);

        WebElement fName = driver.findElement(By.id("firstName"));
        fName.sendKeys("FST");

        WebElement lName = driver.findElement(By.id("lastName"));
        lName.sendKeys("Batch44");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("fstbatch44@gmail.com");

        WebElement contact = driver.findElement(By.id("number"));
        contact.sendKeys("0808202201");
        //*[@id="simpleForm"]/div/div[6]/div[1]/input

        WebElement btnSubmit = driver.findElement(By.xpath("//*[@id='simpleForm']/div/div[6]/div[1]/input"));
        btnSubmit.submit();

        driver.quit();
    }
}
