import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNG_Activity2 {
    WebDriver driver;
    //In the @BeforeClass method, create the a driver instance for FirefoxDriver
    //Also use the get() method to open the browser with https://www.training-support.net/selenium/target-practice
    @BeforeClass
    public void methodBefore(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }


    //Add 4 @Test methods.
    //In the first @Test method, use getTitle() to get and assert the title of the page.
        @Test
        public void method1() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Target Practice");
        }
        //In the second @Test method, use findElement() to look for the black button. Make an incorrect assertion. (This test case is meant to throw an error)
        @Test
        public void method2() {
        String btn = driver.findElement(By.className("black")).getText();
        Assert.assertEquals(btn, "green");

        }
        //For the third @Test method, skip it by setting it's enabled parameter to false.
        //The third method will be skipped, but will not be shown as skipped.
        @Test(enabled=false)
        public void method3(){
        System.out.println("Third method is skipped");
        }

        //For the fourth @Test method, skip it by throwing a SkipException inside the method.
        //The fourth method will be skipped and it will be shown as skipped.
        @Test
        public void method4(){
            throw new SkipException("This Method is skipped with an exception");
        }


        //In the @AfterClass method, use close() to close the browser once the test is done
        @AfterClass
        public void methodAfter(){
        driver.quit();
}



}
