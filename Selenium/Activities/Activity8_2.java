import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Activity8_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/tables");

        List<WebElement> dynamicCol = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
        System.out.println("No. of Columns in static Table : "+dynamicCol.size());

        List<WebElement> dynamicRow = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("No. of Rows in static Table: "+dynamicRow.size());

        WebElement data2_2 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Row 2 Column 2 data: "+data2_2.getText());

        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();

        WebElement newdata2_2 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Row 2 Column 2 data: "+newdata2_2.getText());

        System.out.println("Row 2 Column 2 data after sorting by Name Column: "+newdata2_2.getText());

        List<WebElement> foot = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        for(WebElement footerData:foot){
            System.out.println("Footer data is: "+footerData.getText());
        }

        driver.quit();
    }
}
