import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("Title is: " + driver.getTitle());

        String header3 = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Title is: " + header3);

        String header5 = driver.findElement(By.xpath("//h5[contains(@class, 'green')]")).getCssValue("color");
        System.out.println("Title is: " + header5);

        String btnViolet = driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).getAttribute("class");
        System.out.println("Title is: " + btnViolet);

        String btnGrey = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div/div[3]/button[2]")).getText();
        System.out.println("Title is: " + btnGrey);
        driver.quit();

    }
}
