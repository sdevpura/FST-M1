package suiteExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Activity5 {
    WebDriver driver;
    //In the @BeforeClass method, create the driver instance for FirefoxDriver
    //Also use the get() method to open the browser
    @BeforeTest(alwaysRun = true)
    public void methodBefore(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test(groups = {"HeaderTests", "ButtonTests"})
    public void Test1(){
        System.out.println("Title is: "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Target Practice");
    }

    @Test(dependsOnMethods = {"Test1"}, groups={"HeaderTests"})
    public void HeaderTest1(){
        System.out.println("Header Test 1");
        String header3 = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(header3, "Third header");
    }

    @Test(dependsOnMethods = {"Test1"}, groups={"HeaderTests"})
    public void HeaderTest2(){
        System.out.println("Header Test 2");
        String header5 = driver.findElement(By.tagName("h5")).getText();
        Assert.assertEquals(header5, "Fifth header");
    }

    @Test(dependsOnMethods = {"Test1"}, groups={"ButtonTests"})
    public void ButtonTest1() {
        System.out.println("Button Test 1");
        String olive = driver.findElement(By.xpath("//button[contains(text(),\"Olive\")]")).getText();
        Assert.assertEquals(olive, "Olive");
    }
    @Test(dependsOnMethods = {"Test1"}, groups={"ButtonTests"})
    public void ButtonTest2() {
        System.out.println("Button Test 2");
        String brown = driver.findElement(By.className("brown")).getText();
        Assert.assertEquals(brown, "Brown");
    }

    @AfterTest(alwaysRun = true)
    public void methodAfter(){

        driver.quit();
    }
}
