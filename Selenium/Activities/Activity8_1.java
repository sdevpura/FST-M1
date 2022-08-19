import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Activity8_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/tables");
        System.out.println("Title is: " + driver.getTitle());

        List<WebElement> staticCol = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        System.out.println("No. of Columns in static Table : "+staticCol.size());

        List<WebElement> staticRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        System.out.println("No. of Rows in static Table: "+staticRow.size());

        List<WebElement> row = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]"));

        for(WebElement row3:row){
            System.out.println("Row 3 data: "+row3.getText());
        }

        WebElement data2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Row 2 Column 2 data: "+data2_2.getText());

        driver.quit();
    }
}
