import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class lMSActivity7 {


    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();


        //7. Count the number of courses
        //Goal: Navigate to the “All Courses” page and count the number of courses.
        //a. Open a browser.
        //b. Navigate to ‘https://alchemy.hguy.co/lms’.
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void TCAccount() {
        //c. Find the navigation bar.
        //d. Select the menu item that says “All Courses” and click it.
        driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();
        //e. Find all the courses on the page.
        List<WebElement> courseList = driver.findElements(By.linkText("See more..."));
        //f. Print the number of courses on the page
        System.out.println("Number of Courses are: "+courseList.size());

    }

    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
