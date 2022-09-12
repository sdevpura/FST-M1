import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity2 {

    AndroidDriver driver;
   WebDriverWait wait;


    @BeforeClass
    public void setup() throws MalformedURLException {
        //Setup desired capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        //URL

        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Initialize driver
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
        public void Test1(){
            //Accept T&C
            //driver.findElement(AppiumBy.id("com.android.chrome:id/terms_accept")).click();
            //wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.android.chrome:id/negative_button")));
        //driver.findElement(AppiumBy.id("com.android.chrome:id/negative_button")).click();

        //Open the following URL: https://www.training-support.net/
        driver.get("https://www.training-support.net");
        WebElement headingAvail = driver.findElement(AppiumBy.xpath("//android.view.View[@text='Training Support']"));
        wait.until(ExpectedConditions.visibilityOf(headingAvail));


        //Locate the heading on the page and print it to console.
        String heading = headingAvail.getText();
                System.out.println("Page heading is: "+heading);

        //Locate the About Us button and click it.
        //Print the heading on the About Us page to the console.
        // Find and click the About Us link
        driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id='about-link']")).click();
        WebElement aboutPageHeadingAvail = driver.findElement(AppiumBy.xpath("//android.view.View[@text='About Us']"));
        wait.until(ExpectedConditions.visibilityOf(aboutPageHeadingAvail));
        // Find heading of new page and print to console
        String aboutPageHeading = aboutPageHeadingAvail.getText();
        System.out.println(aboutPageHeading);

    }
    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }


}
